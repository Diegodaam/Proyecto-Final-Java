
package com.mycompany.proyectofinal;

public class NodoAgenda {
    private String materia;
    private String actividad;
    private int asignacion;
    private int entrega;
    private NodoAgenda next;
    
    public NodoAgenda(String m, String a, int aS, int e){
        this(m,a,aS,e,null);
    }
    
    public NodoAgenda(String materia, String actividad, int asignacion, int entrega,NodoAgenda next) {
        this.materia = materia;
        this.actividad = actividad;
        this.asignacion = asignacion;
        this.entrega = entrega;
        this.next = null;
    }

    public String getMateria() {
        return materia;
    }

    public String getActividad() {
        return actividad;
    }

    public int getAsignacion() {
        return asignacion;
    }

    public int getEntrega() {
        return entrega;
    }

    public NodoAgenda getNext() {
        return next;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public void setAsignacion(int asignacion) {
        this.asignacion = asignacion;
    }

    public void setEntrega(int entrega) {
        this.entrega = entrega;
    }

    public void setNext(NodoAgenda next) {
        this.next = next;
    }
    
    
    
    
    
}
