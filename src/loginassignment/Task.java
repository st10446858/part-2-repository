/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginassignment;

import javax.swing.JOptionPane;

/**
 *
 * @st10446858
 */
public class Task 
{
    public int numberOfTasks;
    public String developerDetails;
    public String taskName;
    public String taskDescription;
    public int taskDuration;
    
    public static void options() 
    {
        while (true) 
        {
            int choice = menu();

            switch (choice)//(see Switch Case in Java #35 – Alex Lee, 2019)
            {
                case 1://(see Switch Case in Java #35 – Alex Lee, 2019)
                    printTaskDetails();
                    break;//(see Switch Case in Java #35 – Alex Lee, 2019)
                case 2://(see Switch Case in Java #35 – Alex Lee, 2019)
                    report();
                    break;//(see Switch Case in Java #35 – Alex Lee, 2019)
                case 3://(see Switch Case in Java #35 – Alex Lee, 2019)
                    quit();
                    break;//(see Switch Case in Java #35 – Alex Lee, 2019)
                default://(see Switch Case in Java #35 – Alex Lee, 2019)
                    JOptionPane.showMessageDialog(null, "Invalid choice. Please try again.");
                    break;//(see Switch Case in Java #35 – Alex Lee, 2019)
            }
        }
    }
    public static void newWelcomeMessage()
    {
        JOptionPane.showMessageDialog(null, "Welcome to EasyKanban ");
    }
    
    public static int menu() 
    {
        String task = "1) Add a task";
        String report = "2) Report";
        String quit = "3) QUIT";
        
        while (true)
        {
            JOptionPane.showMessageDialog(null, "Please select an option");
            String option = JOptionPane.showInputDialog(null, task + "\n" + report + "\n" + quit);

            try//(W3Schools,2024)
            {
                int choice = Integer.parseInt(option);
                return choice;
            } catch (NumberFormatException e) //(W3Schools,2024)
            {
                JOptionPane.showMessageDialog(null, "Please choose an option");
            }
        }
    }
    public void setNumberOfTasks(int taskCount)
    {
        numberOfTasks = taskCount;
    }
    public static int getNumberOfTasks() 
    {
        int SIZE;
        {
            String numberOfTasks = JOptionPane.showInputDialog(null,"Enter the number of tasks you'd like to enter");
            SIZE = Integer.parseInt(numberOfTasks);
            if (SIZE >= 20)
            {
                JOptionPane.showMessageDialog(null, "You may not enter more than or equal 20 tasks, please choose a smaller size");
                
            }
        }
        while (SIZE >=20);
        return SIZE;
    }
    public static String getTaskStatus()
    {
        String status1 = "To do";
        String status2 = "Done";
        String status3 = "Doing";
        while (true)
        {
            String taskStatus = JOptionPane.showInputDialog(null, "What is the status of this task:\n" + status1 + "\n" + status2 + "\n" + status3);
             if (taskStatus.contains(status1) || taskStatus.contains(status2) || taskStatus.contains(status3))
        {
            return taskStatus; 
        } 
             else 
        {
            getTaskStatus();
        }
        }
    }
    public void setDeveloperDetails(String developer)
    {
        developerDetails = developer;
    }
    public static String getDeveloperDetails() 
    {
        return JOptionPane.showInputDialog(null, "Enter the first and last names of the developer assigned to the task");
    }
    public void setTaskName(String name)
    {
        taskName = name;
    }
    public static String getTaskName() 
    {
        return JOptionPane.showInputDialog(null, "Please name your task");
    }
    public void setTaskDescription(String description)
    {
        taskDescription = description;
    }
    public static String getTaskDescription()
    {
        String taskDescription = JOptionPane.showInputDialog(null, "Description ");
        return taskDescription;
    }
    public static boolean checkTaskDescription(String taskDescription)
    {
        while (true) 
        {
            if (taskDescription.length() > 50) 
            {
                JOptionPane.showMessageDialog(null, "Please enter a task description that is less than 50 characters");
                return true;
            }
            else 
            {
                JOptionPane.showMessageDialog(null, "Task description captured successfully");
                return false;
            }
        }
    }
    public static String createTaskID(String taskName,int taskNumber, String developerDetails) 
    {
        String lastThreeCharacters = developerDetails.substring(developerDetails.length() - 3);//(OpenAI,(2024))
        String taskID = taskName.substring(0, 2) + ":" + taskNumber + ":" + lastThreeCharacters;
        taskID = taskID.toUpperCase();
        return taskID;
    }
    public void setTaskDuration(int duration)
    {
        taskDuration = duration;
    }
    public static int getTaskDuration() 
    {
        String taskDuration = JOptionPane.showInputDialog(null, "Please enter the task's duration in hours");
        return Integer.parseInt(taskDuration);
    }
  public static int returnTotalHours(int[] taskDuration )
  {
      int total = 0;
      for(int duration : taskDuration)
      {
          total+=duration;//(W3Schools,2024)
      }
      return total;
  }
   
    public static String printTaskDetails() 
    {
    int SIZE = getNumberOfTasks();

    String[] taskName = new String[SIZE];
    String[] taskDescription = new String[SIZE];
    String[] developerDetails = new String[SIZE];
    String[] taskStatus = new String[SIZE];
    int[] taskDuration = new int[SIZE];

    
    for (int x = 0; x < SIZE; x++)
    {
        taskName[x] = getTaskName();
        taskDescription[x] = getTaskDescription();
        while (checkTaskDescription(taskDescription[x])) 
        {
            taskDescription[x] = getTaskDescription();
        }
        developerDetails[x] = getDeveloperDetails();
        taskDuration[x] = getTaskDuration();
        taskStatus[x] = getTaskStatus();
        String taskID = createTaskID(taskName[x], x + 1, developerDetails[x]);//(OpenAI,(2024))
   
    }

    StringBuilder display = new StringBuilder();
    int total = returnTotalHours(taskDuration);
    for (int x = 0; x < SIZE; x++) 
    {
        display.append("Task Status: ").append(taskStatus[x]).append("\n");//(Farrell,J.2019) 
        display.append("Developer details: ").append(developerDetails[x]).append("\n");//(Farrell,J.2019) 
        display.append("Task number:").append(x+1).append("\n");//(Farrell,J.2019) 
        display.append("Name: ").append(taskName[x]).append("\n");//(Farrell,J.2019) 
        display.append("Description: ").append(taskDescription[x]).append("\n");//(Farrell,J.2019) 
        display.append("Task ID: ").append(createTaskID(taskName[x], x + 1, developerDetails[x])).append("\n");//(Farrell,J.2019) 
        display.append("Task Duration: ").append(taskDuration[x]).append("\n\n");//(Farrell,J.2019) 
    }

    JOptionPane.showMessageDialog(null, display.toString());
    JOptionPane.showMessageDialog(null, "Total number of hours:" + total);
    display.setLength(0);
    return display.toString();
}
    
     public static void report() 
    {
        String reportMessage = "Coming soon";
        JOptionPane.showMessageDialog(null, reportMessage);
        menu();
    }

    private static void quit() 
    {
        JOptionPane.showMessageDialog(null, "Thank you for your time");
        System.exit(0);
    }
}
//Reference List:
//W3Schools.2024.Java Exceptions - Try...Catch: Available at: https://www.w3schools.com/java/java_try_catch.asp;
//ChatGPT (April 15version) [Large language model]. https://chat.openai.com/
//Farrell,J.2019.Java Programming.9th edition.2019.Course Technology,Cengage Learning
    
