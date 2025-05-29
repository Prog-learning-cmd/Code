/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package login.registeration;

import javax.swing.JOptionPane; 
/**
 *
 * @author cindk
 */
public class LoginRegisteration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Display a greeting/welcome message. 
        JOptionPane.showMessageDialog(null, "Hello \nWelcome to ChatApp. :D "); 
       
       //Giving user an option between registering and login. We add a menu to make the user choose. 
       String menu = """
                     Press a number to select an option:
                     1. Registeration 
                     2. Login 
                     3. Send Message
                     4. Coming Soon
                     5. Exit 
                     """; 
       // int selection allows the users to choose which task do they want to operate. It also allows the menu to be displayed. 
       int selection = Integer.parseInt(
                JOptionPane.showInputDialog(menu));
       Registeration ad = new Registeration();
       
       switch (selection) {
        case 1:
            
              String userInput = JOptionPane.showInputDialog("Enter Username that is less or 5 characters and an underscore");
              String resultMessage = ad.Username(userInput);
              JOptionPane.showMessageDialog(null, resultMessage);
              
              String userInput2 = JOptionPane.showInputDialog("Enter a password that meet the following requirements: \nContains a Capital Letter\nContains at least 8 characters\nContains a special character\nContains a number");
              String resultMessage2 = ad.Password(userInput2);
              JOptionPane.showMessageDialog(null, resultMessage2);
              
              CellphoneReq cd = new CellphoneReq();
              String userInput3 = JOptionPane.showInputDialog("Enter a valid South African Number (+27)");
              String resultMessage3 = cd.CheckCell(userInput3);
              JOptionPane.showMessageDialog(null, resultMessage3);
                
            
            case 2:
              JOptionPane.showMessageDialog(null, "Hello \nWelcome to ChatApp. :D ");  
            String userInput4 = JOptionPane.showInputDialog("Enter Username");
            String resultMessage4 = ad.Username(userInput4);
            JOptionPane.showMessageDialog(null, resultMessage4);
             
             String userInput5 = JOptionPane.showInputDialog("Enter password");
              String resultMessage5 = ad.Password(userInput5);
              JOptionPane.showMessageDialog(null, resultMessage5);
            
            case 3:
            SendMessage lk = new SendMessage(); 
            JOptionPane.showMessageDialog(null, lk.SubMenu(menu)+ lk.CheckCell(menu));
            String Input6 = JOptionPane.showInputDialog("Enter recpient number");
            String resultMessage6 = lk.CheckCell(Input6);
            JOptionPane.showMessageDialog(null, resultMessage6);
           
            JOptionPane.showMessageDialog(null, lk.AmountMes(menu) + lk.MessageLength(menu));
            
            
            JOptionPane.showMessageDialog(null, lk.MessageID(menu));
            
             
            case 4:
              JOptionPane.showMessageDialog(null, 
                        "Thanks for using the app!!!");  
                break; 
                
            case 5:
                JOptionPane.showMessageDialog(null, "Thanks for using the app");
                System.exit(0);
            default :
            JOptionPane.showMessageDialog(null, 
                        "Please follow instructions!!!");        
       }

    }
}
   

    
    
 

