package com.mycompany.proyectofinal;
public class NodoTarea {
    protected char materia;
    protected  String actividad;
    protected int fechaAsignacion;
    protected int fechaEntrega;
    protected NodoTarea nextNodo;
    
     public NodoTarea(char materia, String actividad, int fechaAsignacion, int fechaEntrega) {
        this(materia, actividad, fechaAsignacion, fechaEntrega, null);
    }

    public NodoTarea(char materia, String actividad, int fechaAsignacion, int fechaEntrega, NodoTarea nextNodo) {
        this.materia = materia;
        this.actividad = actividad;
        this.fechaAsignacion = fechaAsignacion;
        this.fechaEntrega = fechaEntrega;
        this.nextNodo = null;
    }
    
   

    public NodoTarea getNextNodo() {
        return nextNodo;
    }

    public void setNextNodo(NodoTarea nextNodo) {
        this.nextNodo = nextNodo;
    }
    

    public char getMateria() {
        return materia;
    }

    public void setMateria(char materia) {
        this.materia = materia;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }
    

    public int getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(int fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    public int getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(int fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
    
    
    
}
