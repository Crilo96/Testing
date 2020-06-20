package randoop;

import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test1");


    parking.Parcheggio var0 = new parking.Parcheggio();
    boolean var2 = var0.scegliPosto(0);
    boolean var4 = var0.scegliPosto(1);
    boolean var6 = var0.scegliPosto(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test2");


    parking.Parcheggio var0 = new parking.Parcheggio();
    java.lang.String var1 = var0.toString();
    boolean var2 = var0.pieno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "OOO"+ "'", var1.equals("OOO"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test3");


    parking.Parcheggio var0 = new parking.Parcheggio();
    java.lang.String var1 = var0.toString();
    boolean var2 = var0.malRiempito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "OOO"+ "'", var1.equals("OOO"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test4");


    parking.Parcheggio var0 = new parking.Parcheggio();
    boolean var2 = var0.scegliPosto(0);
    boolean var4 = var0.scegliPosto(1);
    boolean var5 = var0.malRiempito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test5");


    parking.Parcheggio var0 = new parking.Parcheggio();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "OOO"+ "'", var1.equals("OOO"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "OOO"+ "'", var2.equals("OOO"));

  }

}
