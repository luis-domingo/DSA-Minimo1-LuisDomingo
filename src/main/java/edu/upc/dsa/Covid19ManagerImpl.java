package edu.upc.dsa;
import edu.upc.dsa.models.Lab;
import edu.upc.dsa.models.Muestra;
import edu.upc.dsa.models.Persona;
import org.apache.log4j.Logger;
import java.util.*;

public class Covid19ManagerImpl implements Covid19Manager{
    private static Covid19Manager instance;
    private List<Lab> labList;
    private HashMap<String, Persona> userDic;
    private List<Muestra> penList;
    private List<Muestra> userMuestraList;
    private static Logger log = Logger.getLogger(Covid19ManagerImpl.class);

    private Covid19ManagerImpl() {
        this.labList = new LinkedList<>();
        this.penList = new LinkedList<>();
        this.userDic = new HashMap<>();
        this.userMuestraList = new LinkedList<>();
    }

    public static Covid19Manager getInstance() {
        if (instance==null) instance = new Covid19ManagerImpl();
        return instance;
    }

    @Override
    public Persona creaPersona(String nombre, String apellidos, Double edad, String valoracion) {
        log.info("Crear persona ");
        Persona p = new Persona(nombre, apellidos, edad, valoracion);
        this.userDic.put(p.getId(),p);
        return null;
    }

    @Override
    public Persona creaPersona(Persona p) {
        log.info("Nueva persona ");
        this.userDic.put(p.getId(),p);
        return null;
    }

    @Override
    public Muestra extraerMuestra(Persona p, String idLab) {
        log.info("Extraer muestra de "+p.getNombre()+" y enviado al Laboratorio");
        Muestra m = new Muestra(p.getId(), idLab);
        this.penList.add(m);
        return null;
    }

    @Override
    public Lab procesar() {
        for(int i=0; i< userDic.size(); i++){
            if(userDic.get(i).getId().equals(penList.get(0))){
                log.info("Muestra procesada");
                userDic.get(i).addMuestra(penList.get(0));
                penList.remove(0);
            }
        }
        return null;
    }

    @Override
    public List<Muestra> muestraMuestra(List<Muestra> listaMuestras) {
        List<Muestra> result = null;
        result = new LinkedList<>(listaMuestras);
        log.info("Lista mostrada");
        return result;
    }

    @Override
    public Lab creaLab(String nomLab) {
        log.info("Nuevo laboratorio "+nomLab);
        Lab l = new Lab(nomLab);
        this.labList.add(l);
        return null;
    }

    @Override
    public void clearResources() {
        this.labList.clear();
        this.userMuestraList.clear();
        this.penList.clear();
        this.userDic.clear();
    }
}


