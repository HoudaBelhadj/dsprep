package ex1;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactureTest {
    Facture facture;
    @Before
    public void setUp(){
        this.facture=new Facture();
    }
    @After
    public void tearDown(){
        facture=null;
    }
    @Test
    public void TestGetFraisTransport1(){
        assertEquals(45,facture.getFraisTransport(400),0);
    }
    public void TestGetFraisTransport2(){
        assertEquals(0,facture.getFraisTransport(800),0);
    }
    public void TestGetFraisTransport3(){
        if(facture.getFraisTransport(700)!=0){
            fail("faux pour un montant depassant 600");
        }
    }


}
