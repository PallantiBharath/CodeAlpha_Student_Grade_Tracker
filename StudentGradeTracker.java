/*Develop a program that allows a teacher to enter
students' grades and compute their average,
highest, and lowest scores. You can use arrays or
ArrayLists to store the student data */

import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the total no.of students : ");
        n = sc.nextInt();
        int[] grades = new int[n];
        int i, sum = 0, minGrade = Integer.MAX_VALUE, maxGrade = Integer.MIN_VALUE;
        System.out.print("Enter the grades of the students : ");
        for(i = 0; i < n; i++){
            grades[i] = sc.nextInt();
            sum+=grades[i];
            if(grades[i] < minGrade){
                minGrade = grades[i];
            }
            if(grades[i] > maxGrade){
                maxGrade = grades[i];
            }
        }
        System.out.println("Highest score : "+maxGrade);
        System.out.println("Lowest grade : "+minGrade);
        System.out.println("Average : "+(sum * 1.0)/n);
        sc.close();
    }
}
