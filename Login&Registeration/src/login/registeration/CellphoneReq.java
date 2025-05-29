/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login.registeration;
import java.util.regex.Pattern;
/**
 *
 * @author cindk
 */
public class CellphoneReq {
  public String CheckCell(String number){ 
    // My understanding of regex is to match cellphone. International code 27+ and there is 8 digits after the +27
    // //s+ means space that the user enters must be ignored 
      number = number.replaceAll("//s+", "_"); 
      String regex = "^(\\+27)[0-9]{10}$";
       if (number.matches(regex) && number.length()<=10) {
        return "Cellphone is valid";  
      } else {
        return "Cellphone is invaild";   
      }
      // (Chatgbt, personal communication,2025)
      // prompt Chatgbt a regex phone number checker and asked what is regex
  }  
}
