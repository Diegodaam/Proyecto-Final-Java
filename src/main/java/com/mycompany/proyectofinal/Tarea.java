package com.mycompany.proyectofinal;


import javax.swing.JOptionPane;


public class Tarea {
    
    //Instancia de mi nodo alumno para hacer el puntero cabeza
    public NodoTarea head;

    public Tarea() {
        head = null; //inicio la cabeza en nulo
    }
    
    //METODOS
    
    //AGREGA AL INICIO
    public void Push(char materia, String actividad, int fechaAsignacion, int fechaEntrega){
        
        //OJO
        //Creo el nuevo nodo utilizando el constructor personalizado
        NodoTarea nuevoNodo = new NodoTarea(materia, actividad, fechaAsignacion, fechaEntrega, null);
        
        //verifico si es nulo
        if(head == null){
            //si no hay nodos aun, el primer nodo apunta al nuevo nodo
            head = nuevoNodo;
        }else{
            //Creo un apuntador auxiliar que apunta al primer nodo
            NodoTarea aux = head;
            //el primer nodo apunta al nuevo
            head = nuevoNodo;
            //y el nuevo nodo apunta al auxiliar
            nuevoNodo.setNextNodo(aux);
        }              
        
    }
    
    //Muestra el recorrido de la pila retornando el arreglo de OBJETOS para agregarlo en la cada fila
    public Object[] RecorrerNodos(){
    
        NodoTarea aux = head;
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
        NodoTarea actual = head;

        while (actual != null) {
            contador++;
            actual = actual.getNextNodo();
        }

        return contador;
    }
    
    //ELIMINA DEL INICIO
    public String Pop(){
    
        NodoTarea aux = head;
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
    public NodoTarea getHead() {
        return head;
    }

    public void setHead(NodoTarea head) {
        this.head = head;
    }   
    
}
