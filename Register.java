/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginassignment;

import javax.swing.JOptionPane;

class Register 
{
    private String firstName;
    private String lastName;
    private String username;
    private String password;
   
    

   
public boolean usernameConditions()
{
  boolean loopBreakOne = false;
  while(loopBreakOne==false){
 if (username.length() <= 5 && username.contains("_")) 
 {
   JOptionPane.showMessageDialog(null,"Username successfully captured");
   loopBreakOne = true;
   break;
 }else 
     JOptionPane.showMessageDialog(null, "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.");
     createUser();
}
  return false;
}
public boolean passwordConditions()
{   boolean capital = false;
    boolean number = false;
    boolean specialChar = false;
    int loopBreakTwo = 0;
    // Start with index 0
    int i = 0;

    // Continue looping until all conditions are met or we reach the end of the password
    while (!capital || !number || !specialChar || password.length() < 8) {
        // Check if we reached the end of the password
        if (i >= password.length()) {
            break; // Exit the loop if we've checked all characters
        }

        char ch = password.charAt(i);
        if (Character.isUpperCase(ch)) {
            capital = true; // Found a capital letter
        } else if (Character.isDigit(ch)) {
            number = true; // Found a number
        } else if (!Character.isLetterOrDigit(ch)) {
            specialChar = true; // Found a special character
        }

        // Move to the next character
        i++;
    }

    // Check if all conditions are met
    if (capital && number && specialChar && password.length() >= 8) {
        return true;
    } else {
        return false;
    }
    

}

public boolean createUser()
{    
     
     username = JOptionPane.showInputDialog(null, "Create Your Username" );
     password = JOptionPane.showInputDialog(null,"Create Your Password");
     boolean breakLoopThree = true;
     
      while (breakLoopThree == false) 
     {  
 if(usernameConditions() && passwordConditions() == true)
 {
     JOptionPane.showMessageDialog(null, "Registration successful");
  breakLoopThree = false;
 }    else
 {
     JOptionPane.showMessageDialog(null,"Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.");
 }
     
 }
     return true;   
}
}


 
     
 

     
     
