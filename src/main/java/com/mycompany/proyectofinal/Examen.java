package com.mycompany.proyectofinal;

import com.mycompany.proyectofinal.NodoExamen;
import javax.swing.JOptionPane;


public class Examen {
    
    //Instancia de mi nodo alumno para hacer el puntero cabeza
    public NodoExamen head;

    public Examen() {
        head = null; //inicio la cabeza en nulo
    }
    
    //METODOS
    
    //AGREGA AL INICIO
    public void Push(char Materia, int fechaAsignacion){
        
        //OJO
        //Creo el nuevo nodo utilizando el constructor personalizado
        NodoExamen nuevoNodo = new NodoExamen(Materia, fechaAsignacion, null);
        
        //verifico si es nulo
        if(head == null){
            //si no hay nodos aun, el primer nodo apunta al nuevo nodo
            head = nuevoNodo;
        }else{
            //Creo un apuntador auxiliar que apunta al primer nodo
            NodoExamen aux = head;
            //el primer nodo apunta al nuevo
            head = nuevoNodo;
            //y el nuevo nodo apunta al auxiliar
            nuevoNodo.setNextNodo(aux);
        }              
        
    }
    
    //Muestra el recorrido de la pila retornando el arreglo de OBJETOS para agregarlo en la cada fila
    public Object[] RecorrerNodos(){
    
        NodoExamen aux = head;
        //de tamanio le pongo la cantidad de nodos que haya segun el metodo de contar los nodos
        Object[] info = new Object[contarNodos()];
        int j = 0;
        int i = 1;
        if( head == null){
            JOptionPane.showMessageDialog(null, "La PILA esta vacia!");
        }else{
            //Recorro con un while y muestro si no es nulo
            while(aux != null){
                //Copio el valor del nodo al arreglo de strings
                info[j] = aux;                               
                aux = aux.getNextNodo(); //avanza al siguiente nodo
                i++; //contador de elementos
                j++; // indice de posicion

            }
        }

        //al final retorno lo obtenido en valores
        return info;
        
    }
    
    //Conteo de nodos en la estructura
    public int contarNodos() {
        int contador = 0;
        NodoExamen actual = head;

        while (actual != null) {
            contador++;
            actual = actual.getNextNodo();
        }

        return contador;
    }
    
    //ELIMINA DEL INICIO
    public String Pop(){
    
        NodoExamen aux = head;
        String info = "";
        //valido que no este vacio
        if(head == null){
             info = "La pila esta vacia!";
        }else{
            //valido si existe mas de un elemento en la pila
            if(aux.getNextNodo() == null){
                //en este caso hay solo un nodo y lo apunto a nulo
                head = null;
            }else{
                //en este caso hay mas de un nodo y apunto la cabeza hacia el siguiente nodo
                //dejando afuera el primer Nodo de la pila (Java se encarga de eliminar objetos no
                //usados)
                head = aux.getNextNodo();

            }
            
            info = "Primer alumno eliminado!";
        }
       
        return info;        
    
    }

    //GETTERS SETTERS
    public NodoExamen getHead() {
        return head;
    }

    public void setHead(NodoExamen head) {
        this.head = head;
    }   
    
}
