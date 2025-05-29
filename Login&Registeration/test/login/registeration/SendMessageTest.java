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
public class SendMessageTest {
    
    public SendMessageTest() {
    }

    /**
     * Test of SubMenu method, of class SendMessage.
     */
    @Test
    public void testSubMenu() {
        System.out.println("SubMenu");
        String SubMenu = "";
        SendMessage instance = new SendMessage();
        String expResult = "";
        String result = instance.SubMenu(SubMenu);
        assertEquals(expResult, result);
       
       ;
    }

    /**
     * Test of MessageLength method, of class SendMessage.
     */
    @Test
    public void testMessageLength() {
        System.out.println("MessageLength");
        String Message = "";
        SendMessage instance = new SendMessage();
        String expResult = "";
        String result = instance.MessageLength(Message);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of CheckCell method, of class SendMessage.
     */
    @Test
    public void testCheckCell() {
        System.out.println("CheckCell");
        String no = "";
        SendMessage instance = new SendMessage();
        String expResult = "";
        String result = instance.CheckCell(no);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of AmountMes method, of class SendMessage.
     */
    @Test
    public void testAmountMes() {
        System.out.println("AmountMes");
        String mes = "";
        SendMessage instance = new SendMessage();
        String expResult = "";
        String result = instance.AmountMes(mes);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Message method, of class SendMessage.
     */
    @Test
    public void testMessage() {
        System.out.println("Message");
        String Message = "";
        SendMessage instance = new SendMessage();
        String expResult = "";
        String result = instance.Message(Message);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MessageID method, of class SendMessage.
     */
    @Test
    public void testMessageID() {
        System.out.println("MessageID");
        String noIdentity = "";
        SendMessage instance = new SendMessage();
        String expResult = "";
        String result = instance.MessageID(noIdentity);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MessageHash method, of class SendMessage.
     */
    @Test
    public void testMessageHash() {
        System.out.println("MessageHash");
        SendMessage instance = new SendMessage();
        String expResult = "";
        String result = instance.MessageHash();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
