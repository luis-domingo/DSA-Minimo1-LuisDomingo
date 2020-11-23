package edu.upc.dsa.models;

import edu.upc.dsa.util.RandomUtils;
import java.util.LinkedList;
import java.util.List;

public class Persona {
    String id;
    String nombre;
    String apellidos;
    Double edad;
    String valoracion;
    List<Muestra> listaMuestras;

    public Persona(String nombre, String apellidos, Double edad, String valoracion){
        this.id=RandomUtils.getId();
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.edad=edad;
        this.valoracion=valoracion;
        this.listaMuestras = new LinkedList<>();
    }

    public Persona(){
        this.listaMuestras= new LinkedList<>();
    }

    public void addMuestra(Muestra m){
        listaMuestras.add(m);
    }

    //Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Double getEdad() {
        return edad;
    }

    public void setEdad(Double edad) {
        this.edad = edad;
    }

    public String getValoracion() {
        return valoracion;
    }

    public void setValoracion(String valoracion) {
        this.valoracion = valoracion;
    }

    public List<Muestra> getListaMuestras() {
        return listaMuestras;
    }

    public void setListaMuestras(List<Muestra> listaMuestras) {
        this.listaMuestras = listaMuestras;
    }

    public String toString() {
        return "Track [id="+id+", nombre=" + nombre + ", apellidos=" + apellidos +", Edad=" + edad + ", valoracion=" + valoracion + "]";
    }


}

