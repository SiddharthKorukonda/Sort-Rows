/* Siddharth Korukonda
   115607752
   CSE 114
   Paul Fodor
   Homework 5
   Question 2 (SortRows.java)
 */

import java.util.*;

public class SortRows {
    public static double[][] sortRows(double[][] m) {
        for (int i=0; i<m.length; i++) {
            for (int j=0; j<m[0].length-1; j++) {
                for (int k=0; k<m[0].length-j-1; k++) {
                    if (m[i][k]>m[i][k+1]) {
                        double temp = m[i][k];
                        m[i][k] = m[i][k+1];
                        m[i][k+1] = temp;

                        // Used the BubbleSort Algorithm from the lab
                    }
                }
            }
        }

        return m;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double[][] m = new double[3][3];

        System.out.print("Enter the values for the 3x3 matrix row by row: \n");
        for (int i=0; i<m.length; i++) {
            for (int j=0; j<m[0].length; j++) {
                m[i][j] = s.nextDouble();
            }
        }

        double[][] sortedArray = sortRows(m);

        System.out.print("The row-sorted array is: \n");
        for (int i=0; i<sortedArray.length; i++) {
            for (int j=0; j<sortedArray[0].length; j++) {
                System.out.print(sortedArray[i][j]+" ");
            }
            System.out.println();
        }
    }
}
