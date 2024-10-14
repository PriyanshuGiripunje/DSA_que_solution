import java.util.*;

//this is the code to print 2d array in spiral order.
public class SpiralArrays {
    public static void main(String args[]) {
        int[][] arr = {
                { 1, 2, 3, 4, 5 },
                { 7, 8, 9, 10, 11 },
                { 13, 14, 15, 16, 17 },
                { 19, 20, 21, 22, 23 },
                { 25, 26, 27, 28, 29 }
        };

        int rowStart = 0, rowEnd = 4, colStart = 0, colEnd = 4;
        int i = 0;
        int j = 0;
        for (i = rowStart; i <= rowEnd; i++) {
            for (j = colStart; j <= colEnd; j++) {
                System.out.print(" " + arr[i][j] + " ");
            }
            System.out.println();
        }
        i = 0;
        j = 0;
        while (rowStart <= rowEnd && colStart <= colEnd) {
            i = rowStart;
            // 1 loop{Left to right} (traversing horizontally)
            for (j = colStart; j <= colEnd; j++) {
                System.out.print(" " + arr[i][j] + " ");
                // System.out.println("");
            }
            j--;
            rowStart++;

            // 2 loop {top to bottom}
            for (i = rowStart; i <= rowEnd; i++) {
                System.out.print(" " + arr[i][j] + " ");
            }
            i--;
            colEnd--;
            // 3rd loop {right to left}
            for (j = colEnd; j >= colStart; j--) {
                System.out.print(" " + arr[i][j] + " ");
            }
            j++;
            // 4th loop {bottom to top}

            rowEnd--;
            for (i = rowEnd; i > rowStart; i--) {
                System.out.print(" " + arr[i][j] + " ");
            }
            colStart++;
            // i++;
            // updating values

        }
    }
}