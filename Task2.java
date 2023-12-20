import java.util.Scanner;
public class Task2
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        int totalMarks = 0;
        for (int i = 1; i <= numSubjects; i++)
        {
            System.out.print("Enter marks for subject " + i + " out of 100: ");
            int marks = scanner.nextInt();
            if (marks < 0 || marks > 100)
            {
                System.out.println("Invalid marks. Marks should be between 0 and 100. Please try again.");
                i--;
                continue;
            }
            totalMarks += marks;
        }

        double averagePercentageObtained = (double) totalMarks / numSubjects;

        System.out.println("\n Results:");
        System.out.println("Total Marks Obtained: " + totalMarks);
        System.out.println("Average PercentageObtained: " + averagePercentageObtained + "%");

        
        char grade;
        if (averagePercentageObtained >= 90)
        {
            grade = 'A';
        } 
        else if (averagePercentageObtained >= 80) 
        {
            grade = 'B';
        } 
        else if (averagePercentageObtained >= 70) 
        {
            grade = 'C';
        } 
        else if (averagePercentageObtained >= 60) 
        {
            grade = 'D';
        }
         else 
        {
            grade = 'F';
        }
        System.out.println("Grade: " + grade);
        scanner.close();
    }
}
