/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login.registeration;
import javax.swing.JOptionPane;
/**
 *
 * @author cindk
 */
public class Registeration {
    public  String Username(String name){
     
        if (name.contains("_") && name.length()<=5) {
        return "Username meets requirements.";    
        } else {
         return "Username does not meet requirements. Try Again";   
        }
 
    } 
    public String Password(String pass){
        if (pass.contains("\".*[A-Z].*\"")&& pass.contains("") && pass.contains(".*[@#$%^&+=].*") && pass.length()>=8 ) {
         return "Password meets requirements";   
        } else {
         return "Password does not meet requirements";   
        }
   
    } 
    
    public String MessageLength(String Message) {
     
        if (Message.length()<=250) {
         return "Message sent."; 
        } else {
         return "Message exceed the 250 character limit. Please try again";   
        }
} 
    
  public String CheckCell(String no){
   
      if (no.length()<=13 && no.contains("+27")) {
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
         
               for (int i = 1; i <= numLoops; i++) {
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
  public String Message(String Message){
     
      String option = """
                      1 Sent
                      2 Disregard
                      3 Store
                      """;
       int option2 = Integer.parseInt(JOptionPane.showInputDialog(option));
      if (option2 == 1) {
        return "Message sent successfully";  
      } if(option2==2) {
          return "Message disregard successfully";
      }
      if (option2 ==3) {
          return "Successfully Stored";
      } 
      else{
     return "error";    
  }

} 

}
