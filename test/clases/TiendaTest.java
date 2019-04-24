/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rbatsyatsyny
 */
public class TiendaTest {
    
    public TiendaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of obtenerClientes method, of class Tienda.
     */
    @org.junit.Test
    public void testObtenerClientes() {
        System.out.println("obtenerClientes");
        Tienda tienda = new Tienda();
        ArrayList<Cliente> result = tienda.obtenerClientes();
        assertEquals(0, tienda.cantidadClientes());
        tienda.añadirCliente(new Cliente());
        assertEquals(1, tienda.cantidadClientes());
        tienda.vaciarTienda();
        assertEquals(0, tienda.cantidadClientes());
    }

    /**
     * Test of obtenerClienteConNombre method, of class Tienda.
     */
    @org.junit.Test
    public void testObtenerClienteConNombre() {
        System.out.println("obtenerClienteConNombre");
        String n = "";
        Tienda instance = new Tienda();
        Cliente expResult = null;
        Cliente result = instance.obtenerClienteConNombre(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerClientesConEdad method, of class Tienda.
     */
    @org.junit.Test
    public void testObtenerClientesConEdad() {
        System.out.println("obtenerClientesConEdad");
        int e = 0;
        Tienda instance = new Tienda();
        ArrayList<Cliente> expResult = null;
        ArrayList<Cliente> result = instance.obtenerClientesConEdad(e);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of añadirCliente method, of class Tienda.
     */
    @org.junit.Test
    public void testAñadirCliente() {
        System.out.println("a\u00f1adirCliente");
        Cliente c = null;
        Tienda instance = new Tienda();
        instance.añadirCliente(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cantidadClientes method, of class Tienda.
     */
    @org.junit.Test
    public void testCantidadClientes() {
        System.out.println("cantidadClientes");
        Tienda instance = new Tienda();
        int expResult = 0;
        int result = instance.cantidadClientes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of edadMediaClientes method, of class Tienda.
     */
    @org.junit.Test
    public void testEdadMediaClientes() {
        System.out.println("edadMediaClientes");
        Tienda instance = new Tienda();
        double expResult = 0.0;
        double result = instance.edadMediaClientes();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clienteViejuno method, of class Tienda.
     */
    @org.junit.Test
    public void testClienteViejuno() {
        System.out.println("clienteViejuno");
        Tienda instance = new Tienda();
        Cliente expResult = null;
        Cliente result = instance.clienteViejuno();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clientePuber method, of class Tienda.
     */
    @org.junit.Test
    public void testClientePuber() {
        System.out.println("clientePuber");
        Tienda instance = new Tienda();
        Cliente expResult = null;
        Cliente result = instance.clientePuber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of vaciarTienda method, of class Tienda.
     */
    @org.junit.Test
    public void testVaciarTienda() {
        System.out.println("vaciarTienda");
        Tienda instance = new Tienda();
        instance.vaciarTienda();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
