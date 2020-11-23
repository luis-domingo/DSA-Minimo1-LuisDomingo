package edu.upc.dsa;

import edu.upc.dsa.models.Persona;

import edu.upc.dsa.models.Muestra;

import edu.upc.dsa.models.Lab;

import java.util.Date;
import java.util.List;

public interface Covid19Manager {
    public Persona creaPersona(String nombre, String apellidos, Double edad, String valoracion);
    public Persona creaPersona(Persona p);
    public Muestra extraerMuestra(Persona p, String idLab);
    public Lab procesar();
    public List<Muestra> muestraMuestra(List<Muestra> listaMuestras);
    public Lab creaLab(String nomLab);
    //Para el test
    void clearResources();
}

