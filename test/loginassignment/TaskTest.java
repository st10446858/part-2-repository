/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package loginassignment;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @st10446858
 */
public class TaskTest 
{
    
   @Test
    public void testCheckRightTaskDescription() 
    {
        Task task1 = new Task();
        Task task2 = new Task();
        String taskDescription1 = task1.taskDescription = "Create Login to authenticate users"; 
        String taskDescription2 = task2.taskDescription = "Create Add Task feature to add task users";
        boolean display1 = task1.checkTaskDescription(taskDescription1);
        boolean display2 = task2.checkTaskDescription(taskDescription2);
        assertEquals(false, display1);
        assertEquals(false,display2);
    }
    @Test
    public void testCheckWrongTaskDescription()
    {
      Task task1 = new Task();
      String taskDescription1 = task1.taskDescription ="Check task description to make sure that its 50 less words,"
              + " Check task description to make sure that its 50 less words,"
              + "Check task description to make sure that its 50 less words,"
              + "Check task description to make sure that its 50 less words,"
              + "Check task description to make sure that its 50 less words,"
              + "Check task description to make sure that its 50 less words,"
              + "Check task description to make sure that its 50 less words,"
              + "Check task description to make sure that its 50 less words,"
              + "Check task description to make sure that its 50 less words,"
              + "Check task description to make sure that its 50 less words"; 
        boolean display1 = task1.checkTaskDescription(taskDescription1);
         Task task2 = new Task();
        String taskDescription2 = task2.taskDescription ="Check task description to make sure that its 50 less words,"
              + " Check task description to make sure that its 50 less words,"
              + "Check task description to make sure that its 50 less words,"
              + "Check task description to make sure that its 50 less words,"
              + "Check task description to make sure that its 50 less words,"
              + "Check task description to make sure that its 50 less words,"
              + "Check task description to make sure that its 50 less words,"
              + "Check task description to make sure that its 50 less words,"
              + "Check task description to make sure that its 50 less words,"
              + "Check task description to make sure that its 50 less words"; 
        boolean display2 = task1.checkTaskDescription(taskDescription2);
        assertEquals(true, display1);   
        assertEquals(true, display2);
    }
    @Test
    public void checkTaskID()
    {
       Task task1 = new Task();
    String taskName = "Login Feature";
    String developerDetails = "Robyn Harrison";
    String taskID = task1.createTaskID(taskName, 0, developerDetails);
    assertNotNull(taskID);
    assertTrue(taskID.startsWith("LO:0:SON"));
    }
    public void checkTaskDuration()
    {
       Task task1 = new Task();
       Task task2 = new Task();
       int duration1 = task1.taskDuration = 8;
       int duration2 = task2.taskDuration = 10;
       // boolean display1 = task1.returnTotalHours(duration1);
       
    }
}
