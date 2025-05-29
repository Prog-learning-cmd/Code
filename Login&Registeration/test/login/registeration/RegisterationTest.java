/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package login.registeration;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cindk
 */
public class RegisterationTest {
    
    public RegisterationTest() {
    }

    /**
     * Test of Username method, of class Registration.
     */
    @Test
    public void testUsername() {
        System.out.println("Username");
        String name = "cin_1";
        Registeration instance = new Registeration();
        String expResult = "Username is meets requirements";
        String result = instance.Username(name);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of Password method, of class Registration.
     */
    @Test
    public void testPassword() {
        System.out.println("Password");
        String pass = "Kh3thiwe_";
        Registeration instance = new Registeration();
        String expResult = "Password meets the requirements";
        String result = instance.Password(pass);
        assertEquals(expResult, result);
       
    }
    
}
