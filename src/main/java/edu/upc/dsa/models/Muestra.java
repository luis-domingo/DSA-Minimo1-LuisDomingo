package edu.upc.dsa.models;

import edu.upc.dsa.util.RandomUtils;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Muestra {
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    String idMuestra;
    String idClinico;
    String idPersona;
    Date fecha;
    String idLaboratorio;
    String resultado;
    String comentario;

    public Muestra(String idClinico, String idPersona, Date fecha, String idLaboratorio, String resultado, String comentario){
        this.idMuestra=RandomUtils.getId();
        this.idClinico=idClinico;
        this.idPersona=idPersona;
        this.fecha=fecha;
        this.idLaboratorio=idLaboratorio;
        this.resultado=resultado;
        this.comentario=comentario;
    }

    public Muestra(String idPersona, String idLaboratorio){
        this.idMuestra=RandomUtils.getId();
        this.idClinico=null;
        this.idPersona=idPersona;
        this.fecha=null;
        this.idLaboratorio=idLaboratorio;
        this.resultado=null;
        this.comentario=null;
    }

    public Muestra(){
    }

    //Getters y Setters


    public String getIdMuestra() {
        return idMuestra;
    }

    public void setIdMuestra(String idMuestra) {
        this.idMuestra = idMuestra;
    }

    public String getIdClinico() {
        return idClinico;
    }

    public void setIdClinico(String idClinico) {
        this.idClinico = idClinico;
    }

    public String getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(String idPersona) {
        this.idPersona = idPersona;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getIdLaboratorio() {
        return idLaboratorio;
    }

    public void setIdLaboratorio(String idLaboratorio) {
        this.idLaboratorio = idLaboratorio;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String toString() {
        return "Track [idMuestra="+idMuestra+", idClinico=" + idClinico + ", idPersona=" + idPersona +", fecha=" + fecha + ", idLaboratorio=" + idLaboratorio + "resultado=" + resultado + ", comentario=" + comentario + "]";
    }
}


