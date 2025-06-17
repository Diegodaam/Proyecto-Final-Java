
package com.mycompany.proyectofinal;

public class ListaExam {
    public NodoExam head;
    private int cantNodos;

    public ListaExam(NodoExam head, int cantNodos) {
        this.head = head;
        this.cantNodos = cantNodos;
    }

     public ListaExam(){
    }
    
    //METODO PARA AGREGAR MATERIAS 
    public void add(String m, String a, int aS, int e){
        NodoExam news = new NodoExam(m,a,aS,e);
        
        if(head == null){
            head = news;
        }else{
            NodoExam aux = head;
            while(aux.getNext() != null){
                aux = aux.getNext();
            }
            aux.setNext(news);
        }
        cantNodos++;
    }
    
    //METODO PARA MOSTRAR LAS MATERIAS
    public String show(){
        NodoExam aux = head;
        String data = "";
        
        if(head == null){
            data = "La lista esta vacia";
        }else{
            data = "Los datos de la lista son: \n";
            while(aux != null){
                data += "Materia: " + aux.getMateria()+ "\n";
                data += "Actividad: " + aux.getActividad()+ "\n";
                data += "Asignacion: " + aux.getAsignacion()+ "\n";
                data += "Entrega: " + aux.getEntrega()+ "\n";
                data += "\n";
                aux = aux.getNext();
            }
        }
        return data;
    }
}
