
package com.mycompany.proyectofinal;

public class ListAgenda {
    public NodoAgenda head;
    private int cantNodos;

    public ListAgenda(NodoAgenda head, int cantNodos) {
        this.head = head;
        this.cantNodos = cantNodos;
    }

     public ListAgenda(){
    }
    
    //METODO PARA AGREGAR MATERIAS 
    public void add(String m, String a, int aS, int e){
        NodoAgenda news = new NodoAgenda(m,a,aS,e);
        
        if(head == null){
            head = news;
        }else{
            NodoAgenda aux = head;
            while(aux.getNext() != null){
                aux = aux.getNext();
            }
            aux.setNext(news);
        }
        cantNodos++;
    }
    
    //METODO PARA MOSTRAR LAS MATERIAS
    public String show(){
        NodoAgenda aux = head;
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
