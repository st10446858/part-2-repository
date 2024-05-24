/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loginassignment;

import javax.swing.JOptionPane;
//st10446858


public class LoginAssignment {
    public static void main(String[] args) 
    {
        String registerUsername = null;
        String registerPassword = null;
        int condition = 0;
        
        while (condition == 0) {
            String[] components = {"Register", "Login", "Exit"};
            int choice = JOptionPane.showOptionDialog(null, "Choose an option", "Login/Register System",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, components, components[0]);

            switch (choice)//(see Switch Case in Java #35 – Alex Lee, 2019)
            {
                case 0://(see Switch Case in Java #35 – Alex Lee, 2019)
                    Login register = new Login();

                    registerUsername = register.createUsername();
                    registerPassword = register.createPassword();
                    while (!register.checkUsername() || !register.checkPasswordComplexity())//(OpenAI,(2024))
                    {
                        registerUsername = register.createUsername();
                        registerPassword = register.createPassword();
                    }
                    break;//(see Switch Case in Java #35 – Alex Lee, 2019)
                case 1://(see Switch Case in Java #35 – Alex Lee, 2019)
                    
                    if (registerUsername == null || registerPassword == null)
                    {
                        
                    }
                    else 
                    {
                        Login login = new Login();
                        login.registerUserName();
                        
                        if (login.loginUser(registerUsername, registerPassword)) 
                        {
                            JOptionPane.showMessageDialog(null, "Welcome " + login.getUserFirstName() + " " + login.getUserLastName() + ", it's great to see you again.");
                            Task task = new Task();
                            task.newWelcomeMessage();
                            task.options();
                            task.menu();
                            task.printTaskDetails();
                         
                        } else 
                        {
                            JOptionPane.showMessageDialog(null, "Incorrect username or password.");
                        }
                    }
                   
                   
                    break;//(see Switch Case in Java #35 – Alex Lee, 2019)

                case 2://(see Switch Case in Java #35 – Alex Lee, 2019)
                    System.exit(0);

                default://(see Switch Case in Java #35 – Alex Lee, 2019)
                    JOptionPane.showMessageDialog(null, "Invalid choice. Please try again.");
            }
        }
    }
}
//Reference List:
/*Switch Case in Java #35 -Alex Lee, 2019. Youtube video, added by Alex Lee.
Available at https://www.youtube.com/watch?v=O4KGYGQvHmw&t=150s  [Accessed 7 April 2024]
ChatGPT (April 15
version) [Large language model]. https://chat.openai.com/ .*/ 
