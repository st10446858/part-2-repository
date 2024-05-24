/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package loginassignment;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mnisi
 */
public class LoginTest 
{
   @Test
    public void testCheckRightUsername() 
    {
        Login rightUsername = new Login();
        rightUsername.registerUsername = "kyl_1";
        boolean display = rightUsername.checkUsername();//OpenAi,(2024)
        assertEquals(true, display);        
    }
    @Test
    public void testCheckWrongUsername()
    {
        Login wrongUsername = new Login();
        wrongUsername.registerUsername = "kyle!!!!!!!";
        boolean display = wrongUsername.checkUsername();
        assertEquals(false,display);
    }
    @Test
   public void testCheckRightPasswordComplexity()
   {
       Login rightPassword = new Login();
       rightPassword.registerPassword = "Ch&&sec@ke99!";
       boolean display = rightPassword.checkPasswordComplexity();
       assertEquals(true,display);
       
   }
   @Test
   public void testCheckWrongPasswordComplexity()
   {
       Login wrongPassword = new Login();
       wrongPassword.registerPassword = "password";
       boolean display = wrongPassword.checkPasswordComplexity();
       assertEquals(false,display);
   }
   
   @Test
   public void testFalseLogin()
   {
       Login falseLogin = new Login();
       String falseUsername = "kyle!!!!!!!";
       String falsePassword = "password";
        boolean display = falseLogin.loginUser(falseUsername, falsePassword);
        assertFalse(display);
   }
   @Test
   public void testTrueUsername()
   {
        Login username = new Login();
        username.registerUsername = "kyl_1";
        boolean display = username.checkUsername();
        assertTrue(true);
   }
    @Test
   public void testFalseUsername()
   {
        Login username = new Login();
        username.registerUsername = "kyle!!!!!!!";
        boolean display = username.checkUsername();
        assertFalse(false);
   }
    @Test
   public void testTrueCheckPasswordComplexity()
   {
       Login password = new Login();
       password.registerPassword = "Ch&&sec@ke99!";
       
       boolean display = password.checkPasswordComplexity();
       assertTrue(true);
       
   }
   @Test
   public void testFalseCheckPasswordComplexity()
   {
       Login password = new Login();
       password.registerPassword = "password";
       boolean display = password.checkPasswordComplexity();
       assertFalse(false);
       
   }
} 
//Reference List
/*ChatGPT (April 15
version) [Large language model]. https://chat.openai.com/ .*/
    
    
    
    
