/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.javajenkinsasq;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author AlexSQ
 */
public class LaboralASQIT {
    
    public LaboralASQIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of dia_laboral method, of class LaboralASQ.
     */
    @Test
    public void testDia_laboral() {
        System.out.println("dia_laboral");
        String dia = "Lunes";
        boolean expResult = true;
        boolean result = LaboralASQ.dia_laboral(dia);
        assertEquals(expResult, result);
       
    }
     @Test
    public void testDia_laboral2() {
        System.out.println("dia_laboral");
        String dia = "Martes";
        boolean expResult = true;
        boolean result = LaboralASQ.dia_laboral(dia);
        assertEquals(expResult, result);
     
    }
     @Test
    public void testDia_laboral3() {
        System.out.println("dia_laboral");
        String dia = "Miercoles";
        boolean expResult = true;
        boolean result = LaboralASQ.dia_laboral(dia);
        assertEquals(expResult, result);
    
    }
     @Test
    public void testDia_laboral4() {
        System.out.println("dia_laboral");
        String dia = "Jueves";
        boolean expResult = true;
        boolean result = LaboralASQ.dia_laboral(dia);
        assertEquals(expResult, result);
      
    }
     @Test
    public void testDia_laboral5() {
        System.out.println("dia_laboral");
        String dia = "Viernes";
        boolean expResult = true;
        boolean result = LaboralASQ.dia_laboral(dia);
        assertEquals(expResult, result);
     
    }
      public void testDia_laboral6() {
        System.out.println("dia_laboral");
        String dia = "Sabado";
        boolean expResult = false;
        boolean result = LaboralASQ.dia_laboral(dia);
        assertEquals(expResult, result);
      
    }
        public void testDia_laboral7() {
        System.out.println("dia_laboral");
        String dia = "Domingo";
        boolean expResult = false;
        boolean result = LaboralASQ.dia_laboral(dia);
        assertEquals(expResult, result);
        }
        
         public void testDia_laboraldefault() {
        System.out.println("dia_laboral");
        String dia = "";
        boolean expResult = false;
        boolean result = LaboralASQ.dia_laboral(dia);
        assertEquals(expResult, result);
        }
}
