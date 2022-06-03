
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Part1 {
    public static void main(String[] args) {
        int rows, cols, sum = 0;
        int matrix[][];
        double avg;
        //input matrix
        Scanner c = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        rows = c.nextInt();
        System.out.print("Enter number of columns: ");
        cols = c.nextInt();
        matrix = new int[rows][cols];
        System.out.println("Enter the matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("\nm["+i+"]["+j+"]= ");
                matrix[i][j] = c.nextInt();
            }
        }
        //output matrix
        System.out.println("Inputted matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.format("%3d", matrix[i][j]);
            }
            System.out.println("\n");
        }
        // sum of matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println("Sum is " + sum);
        //average of matrix
        avg = (double)sum / (rows * cols);
        System.out.println("Average is " + avg);
    }
}