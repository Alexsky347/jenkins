/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package calculatricejenkins;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *class
 * @author ald
 */
public class CalculatriceJenkinsIT {
    
    private static CalculatriceJenkins calculatrice;
    
    public CalculatriceJenkinsIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        calculatrice = new CalculatriceJenkins();
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class CalculatriceJenkins.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CalculatriceJenkins.main(args);
    }
    
    @Test
    public void testMultiply() {
        assertEquals( "Regular multiplication should work", calculatrice.multiply(4,5), 20);
    }
    
    @Test
    public void testSubstract() {
        assertEquals( "Regular substraction should work", calculatrice.substract(10,5), 5);
    }
    
    @Test
    public void testAdd() {
        assertEquals( "Regular addition should work", calculatrice.add(4,5), 9);
    }
    
    @Test
    public void testDivide() {
        assertEquals( "Regular division should work", calculatrice.divide(20,5), 4);
    }
    
    @Test
    public void testMultiplyWithZero() {
        assertEquals("Multiple with zero should be zero",0,  calculatrice.multiply(0,5));
        assertEquals("Multiple with zero should be zero", 0, calculatrice.multiply(5,0));
    }
    
}
