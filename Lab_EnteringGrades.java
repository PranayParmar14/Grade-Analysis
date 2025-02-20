//------------------------
// Pranay Parmar
//This program asks for test scores and will calculate the minimum, maximum, and average

//------------------------ 




import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

public class Lab_EnteringGrades
{
public static void main(String[] args)
    {
    ArrayList<Integer> grades = new ArrayList<Integer>();
    double sum = 0;
    double avg = 0; 
    for (int i = 0; ; i++) 
        { 
            int userGrade;
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter your grade or press -1 to exit: ");
            userGrade = scn.nextInt();  
            if ((-1 < userGrade) && (userGrade <= 100))
                {
                grades.add(userGrade); 
                sum = sum + grades.get(i);   
                avg = sum / grades.size();                  
                }
                else if (userGrade < -1) 
                    {
                    System.out.println ("Invalid Value");
                    }
                    else if (userGrade == -1) 
                        {
                        break;
                        }                  
         } 
         System.out.println("Here are your grades: "+  grades); 
         System.out.println("The average of your grades " +  avg); 
         System.out.println("The minimum of your grades: " + Collections.min(grades)); 
         System.out.println("The maximum of your grades: " + Collections.max(grades)); 
    }
} 
                 
