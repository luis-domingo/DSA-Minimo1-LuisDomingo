package edu.upc.dsa;
import edu.upc.dsa.models.Muestra;
import edu.upc.dsa.models.Persona;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.*;

public class Covid19ManagerTest {
    private static Logger log = Logger.getLogger(Covid19ManagerTest.class);

    public Covid19Manager manager = null;


    @Before
    public void setUp(){
        manager = Covid19ManagerImpl.getInstance();
        Persona Persona1 = this.manager.creaPersona("Luis", "Domingo", 22.0, "A");
    }

    @Test
    public creaUser(){
        Assert.assertEquals(1, this.manager.);
    }







}
