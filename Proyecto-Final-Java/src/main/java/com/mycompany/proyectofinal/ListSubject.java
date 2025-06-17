
package com.mycompany.proyectofinal;

public class ListSubject {
    public NodoSubjects head;
    private int cantNodos;

   public ListSubject(NodoSubjects head, int cantNodos) {
        head = null;
        cantNodos = 0;
    }

    
    
    //METODO PARA AGREGAR MATERIAS 
    public void add(String s, String t, float p1, float p2, float p3){
        NodoSubjects news = new NodoSubjects(s, t, p1, p2, p3);
        
        if(head == null){
            head = news;
        }else{
            NodoSubjects aux = head;
            while(aux.getNext() != null){
                aux = aux.getNext();
            }
            aux.setNext(news);
        }
        cantNodos++;
    }
    
    //METODO PARA MOSTRAR LAS MATERIAS
    public String show(){
        NodoSubjects aux = head;
        String data = "";
        
        if(head == null){
            data = "La lista esta vacia";
        }else{
            data = "Los datos de la lista son: \n";
            while(aux != null){
                data += "Materia: " + aux.getSubject() + "\n";
                data += "Tipo: " + aux.getType()+ "\n";
                data += "Parcial 1: " + aux.getPartial1()+ "\n";
                data += "Parcial 2: " + aux.getPartial2()+ "\n";
                data += "Parcial 3: " + aux.getPartial3()+ "\n";
                data += "\n";
                aux = aux.getNext();
            }
        }
        return data;
    }
}
