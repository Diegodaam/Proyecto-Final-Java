
package com.mycompany.proyectofinal;

public class PilaUsers {
    public NodoUsers head;
    
    //CONSTRUCTOR
    public PilaUsers() {
        head = null;
    }
    
    //METODO DE AGREGAR USUARIOS A LA PILA
    public void push(String n, String l, int a, char g, int p){
        NodoUsers news = new NodoUsers(n, l, a, g, p); //PUNTERO LLAMADO NEWS PARA CREAR NUEVOS NODOS
        
        if(head == null){
            head = news;
        }else{
            NodoUsers aux = head;
            head = news;
            news.setNext(aux);
        }
    }
    
    //METODO PARA MOSTRAR USUARIOS DE LA PILA 
    public String show(){
        NodoUsers aux = head;
        String data = "";
        
        if(head == null){
            data = "La pila esta vacia"; 
        }else{
            data = "Los usuarios de la pila son: ";
            while(aux != null){
                data += "Nombre: " + aux.getName() + "\n";
                data += "Apellido: " + aux.getLastName()+ "\n";
                data += "Edad: " + aux.getAge()+ "\n";
                data += "Genero: " + aux.getGender()+ "\n";
                aux = aux.getNext();
            }
        }
        return data;
    }
    
    //METODO PARA ELIMINAR USUARIOS 
    public String pop(){
        NodoUsers aux = head;
        String data = "";
        
        if(head == null){
            data = "La pila esta vacia";
        }else{
            if(aux.getNext() == null){
                head = null;
            }else{
                aux = aux.getNext();
            }
            data = "Usuario eliminado";
        }
        return data;
    }
    
    public boolean check(String n, int p){
        NodoUsers aux = head;
        while(aux != null){
            if(aux.getName().equals(n) && aux.getPassword() == p){
                return true;
            }
            aux = aux.getNext();
        }
        return false;
    }
    
    public NodoUsers getUserByName(String nombre) {
    NodoUsers aux = head;
    while (aux != null) {
        if (aux.getName().equals(nombre)) {
            return aux;
        }
        aux = aux.getNext();
    }
    return null; // No encontrado
    }
}
