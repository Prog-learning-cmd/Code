/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login.registeration;
import com.google.gson.Gson;
import java.io.FileReader;
import java.io.IOException; 
import javax.swing.JOptionPane;

/**
 *
 * @author cindk
 */
public class SendMessage {
     int count = 0;    
          String choice = """
                        Choose a an option 
                        1. Send Messages 
                        2. Coming Soon
                        3. Quit
                               """; 

    
    public String SubMenu(String SubMenu){

     
        int choose = Integer.parseInt(JOptionPane.showInputDialog(choice));

 while (count != 3) { 
         String word = JOptionPane.showInputDialog("Enter an option");
            choice = choice + word + " ";

            count = Integer.parseInt(
                 JOptionPane.showInputDialog(" Press 3 to exit"));
        }
       return choice;
    
      
    }
       public String MessageLength(String Message) {
     
        if (Message.length()<=250) {
         return "Message sent."; 
        } else {
         return "Message exceed the 250 character limit. Please try again";   
        }
} 
    
  public String CheckCell(String no){
      
      String Input6 = JOptionPane.showInputDialog("Enter recpient number");
      if (no.length()==13&& no.contains("+27")) {
       return "Correct";  
      } else {
       return  "Incorrect. Try Again";
      }
  }  
     public String AmountMes (String mes) {
         
               // Prompt user for loop count using an input dialog
        String input = JOptionPane.showInputDialog("How many times do you want to send?");
        
        // Convert the string input to an integer
        int numLoops = Integer.parseInt(input);

        // Loop based on the user's input
         
               for (int i = 1000000000; i <= numLoops; i++) {
            // Prompt user for a message
            String message = JOptionPane.showInputDialog("Enter message #" + i + ":");
            JOptionPane.showMessageDialog(null, "Message Entered: "+ message);
            // Show the message back in a dialog
            
            JOptionPane.showMessageDialog(null, "This is message number " + i);  
        ;  
     } 
         if (numLoops<=2000000000) {
         return "valid";     
         } else { 
          return "Invalid"
                  
                  
                  ;   
         }
              
}


 
  public String MessageID(String noIdentity){
   
      for (int i = 1000000000; i >=1000000000 ; i++) {
        String input1 = JOptionPane.showInputDialog("How many messages do you want to send");
        // Convert the string input to an integer
        int numLoops = Integer.parseInt(input1);
      if (noIdentity.length()<=10) {
       return "valid" ;   
      } else { 
       return "MessageID exceeded amount";   
      }    
  }
         return null;
  }
  public String MessageHash(){
      
      String input7 = JOptionPane.showInputDialog("Enter message number E.g 00001");
      
  JOptionPane.showMessageDialog(null, 
          "MessageHash " + input7.substring(20, 24) 
                  + " " + input7.substring(0, 7));
         return null;
}
}
 


 




