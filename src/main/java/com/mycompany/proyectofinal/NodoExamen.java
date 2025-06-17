package com.mycompany.proyectofinal;

public class NodoExamen {
    protected char Materia;
    protected int fechaAsignacion; 
    protected NodoExamen nextNodo;
    
     public NodoExamen(char Materia, int fechaAsignacion) {
        this(Materia, fechaAsignacion, null);
    }

    public NodoExamen(char Materia, int fechaAsignacion, NodoExamen nextNodo) {
        this.Materia = Materia;
        this.fechaAsignacion = fechaAsignacion;
        this.nextNodo = null;
    }

    public NodoExamen getNextNodo() {
        return nextNodo;
    }

    public void setNextNodo(NodoExamen nextNodo) {
        this.nextNodo = nextNodo;
    }
    
    public char getMateria() {
        return Materia;
    }

    public void setMateria(char Materia) {
        this.Materia = Materia;
    }

    public int getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(int fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }
    
    
}
