
package loginassignment;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.regex.Pattern;
import javax.swing.JOptionPane;


public class Login//(Farrell,2019) 
{   
    String registerUsername;
    String loginUsername;
    String registerPassword;
    String loginPassword;
    String firstName;
    String lastName;
    
    public void registerUserName()
    {
       firstName = JOptionPane.showInputDialog("Enter Your First Name");
       lastName = JOptionPane.showInputDialog("Enter Your Last Name"); 
    }
     
    public String getUserFirstName()//(Farrell,2019)
    {
        return firstName;
    }
    public String getUserLastName()//(Farrell,2019)
    {
        return lastName;
    }
    public String createUsername()
    {
        return registerUsername = JOptionPane.showInputDialog("Create a Username");
    }
    
    public String createPassword()
    {
        return registerPassword = JOptionPane.showInputDialog("Create a Password");
    }
 
    public boolean checkUsername() 
    {
      while (true) 
      {
        if (registerUsername.length() <= 5 && registerUsername.contains("_"))//(Farrell,2019) 
        {
            JOptionPane.showMessageDialog(null, "Username successfully captured");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.");
            
            return false;
        } 
    }
    } 
      
     public boolean checkPasswordComplexity()
    {
     while(true)
     {
        if (registerPassword.length() >= 8 &&Pattern.matches(".*[A-Z].*", registerPassword) && Pattern.matches(".*\\d.*", registerPassword) && Pattern.matches(".*[!@#$%^&*()].*", registerPassword))//OpenAi,(2024) 
        { 
            JOptionPane.showMessageDialog(null, "Password successfully captured");
            return true;
        } else 
        {
            JOptionPane.showMessageDialog(null, "Password must be at least 8 characters long and contain a capital letter, a number, and a special character.");
            return false;  
        }
    }
    }
 

 public boolean loginUser(String registerUsername, String registerPassword)//(Farrell,2019)
 {      
            while (true) 
            {
                loginUsername = JOptionPane.showInputDialog("Please Enter Your Username:");
                loginPassword = JOptionPane.showInputDialog("Enter Your Password:");
            
                if (loginUsername.equals(registerUsername) && loginPassword.equals(registerPassword))//OpenAi,(2024)
            {
                JOptionPane.showMessageDialog(null, "Welcome " + getUserFirstName() +" "+ getUserLastName() + ",its great to see you again ");
                return true;
            } 
            else 
            {
                JOptionPane.showMessageDialog(null, "Incorrect username or passsword");
                return false;
            }
            }
 }
 public String registerUser()
 {
     JOptionPane.showMessageDialog(null, "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.");
     JOptionPane.showMessageDialog(null, "Password must be at least 8 characters long and contain a capital letter, a number, and a special character.");
     JOptionPane.showMessageDialog(null, "Login successfull");
     return null;
 }
 public String returnLoginStatus()
 {
     JOptionPane.showMessageDialog(null,"Successfull login");
     JOptionPane.showMessageDialog(null, "Incorrect username or password");
     return null;
 }
}
//Reference List
/*Farrell,J.2019.Java Programming.9th edition.2019.Course Technology, Cengage Learning
ChatGPT (April 15
version) [Large language model]. https://chat.openai.com/ .*/ 

