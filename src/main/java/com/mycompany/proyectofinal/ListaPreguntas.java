package com.mycompany.proyectofinal;

public class ListaPreguntas {
    NodoPregunta cabeza;
    int tamaño;
    int posicionActual;
    
    public ListaPreguntas(){
        cabeza = null;
        tamaño = 0;
        posicionActual = -1;
    }
    
    //Obtener la siguiente pregunta
    public NodoPregunta getSiguientePregunta(){
        if(tamaño ==0) return null; //Si no hay preguntas
        
        posicionActual++;
        if(posicionActual >= tamaño){
            posicionActual = -1;//Reinicaimos la posicion al inicio si llega al final
            return null;
        }
        return obtenerPregunta(posicionActual);
    }
    
    
    public void agregarPregunta(String materia,String pregunta,String respuesta){
        NodoPregunta nuevoNodo = new NodoPregunta(materia, pregunta, respuesta);
        if(cabeza == null){
            cabeza = nuevoNodo;
        }else{
            NodoPregunta actual = cabeza;
            while(actual.getSiguiente() != null){
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }
        tamaño++;
    }
    
    //Obtener tamaño de la lista
    public int getTamaño(){
        return tamaño;
    }
    
    
  public NodoPregunta obtenerPregunta(int indice) {
        if (indice < 0 || indice >= tamaño) return null;
        NodoPregunta actual = cabeza;
        for (int i = 0; i < indice; i++) {
            actual = actual.getSiguiente();
        }
        return actual;
    }
  
     public void reiniciarContador() {
        posicionActual = -1;
    }
    
}
