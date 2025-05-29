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
public class CellphoneReqTest {
    
    public CellphoneReqTest() {
    }

    /**
     * Test of CheckCell method, of class CellphoneReq.
     */
    @Test
    public void testCheckCell() {
        System.out.println("CheckCell");
        String number = "+27677045723";
        CellphoneReq instance = new CellphoneReq();
        String expResult = "Number is Valid";
        String result = instance.CheckCell(number);
        assertEquals(expResult, result);
 
        
    }
    
}
