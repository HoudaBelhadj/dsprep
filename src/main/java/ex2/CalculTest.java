package ex2;


import jdk.nashorn.internal.runtime.Undefined;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculTest {
    Calcul calcul;
    @Before
    public void setUp(){
        this.calcul=new Calcul();
    }
    @After
    public void tearDown(){
        calcul=null;
    }
    @Test
    public void TestPpcm1(){
        assertEquals(2,calcul.ppcm(1,2),0);

    }
    @Test
    public void TestPpcm2(){
        assertEquals(2,calcul.ppcm(2,1),0);

    }
   /* @Ignore
    @Test
    public void TestPpcm3(){
        try{
        calcul.ppcm(0,1);
        fail("a ne peux pas etre 0");}
        catch(IllegalArgumentException ae){

        }
    }
    @Test(expected = ArithmeticException.class)
    public void TestPpcm4(){
        calcul.ppcm(0,1);
    }*/
    @Test
    public void TestPpcm5(){
        assertEquals(2,calcul.ppcm(2,2),0);

    }

}
