package edu.upc.dsa.models;
import edu.upc.dsa.util.RandomUtils;
import java.util.LinkedList;
import java.util.List;


public class Lab {
    String idLab;
    String nomLab;
    List<Muestra> listaM;

    public Lab(String nomLab, List<Muestra> listaM){
        this.idLab=RandomUtils.getId();
        this.nomLab=nomLab;
        this.listaM = listaM;
    }
    public Lab(String nomLab){
        this.idLab=RandomUtils.getId();
        this.nomLab=nomLab;
        this.listaM = new LinkedList<>();
    }

    public Lab(){
        this.listaM= new LinkedList<>();
    }

    //Setters y Getters

    public String getIdLab() {
        return idLab;
    }

    public void setIdLab(String idLab) {
        this.idLab = idLab;
    }

    public String getNomLab() {
        return nomLab;
    }

    public void setNomLab(String nomLab) {
        this.nomLab = nomLab;
    }

    public List<Muestra> getListaM() {
        return listaM;
    }

    public void setListaM(List<Muestra> listaM) {
        this.listaM = listaM;
    }

    public String toString() {
        return "Track [idLab="+idLab+", nomLab=" + nomLab +"]";
    }

}
