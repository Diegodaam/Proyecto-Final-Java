package com.mycompany.proyectofinal;

public class NodoPregunta {
    String materia;
    String pregunta;
    String respuesta;
    NodoPregunta siguiente;
    
        public NodoPregunta(String materia,String pregunta,String respuesta) {
            this.materia = materia;
            this.pregunta = pregunta;
            this.respuesta = respuesta;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public NodoPregunta getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPregunta siguiente) {
        this.siguiente = siguiente;
    }
        
        
    
}
