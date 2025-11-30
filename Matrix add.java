import java.util.Scanner;

class MatrixAdd
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int row1, column1;
        int row2, column2;

        System.out.println("Enter 1st row size:");
        row1 = sc.nextInt();

        System.out.println("Enter 1st column size:");
        column1 = sc.nextInt();

        System.out.println("Enter 2nd row size:");
        row2 = sc.nextInt();

        System.out.println("Enter 2nd column size:");
        column2 = sc.nextInt();

        // Check if addition is possible
        if (row1 != row2 || column1 != column2)
        {
            System.out.println("Matrix addition not possible (row/column mismatch).");
            return;
        }

        int[][] a = new int[row1][column1];
        int[][] b = new int[row1][column1];
        int[][] result = new int[row1][column1];

        // Input for first matrix
        for (int i = 0; i < row1; i++)
        {
            for (int j = 0; j < column1; j++)
            {
                System.out.print("Enter value in 1st matrix [" + i + "][" + j + "]: ");
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("----------------------------------------");

        // Input for second matrix
        for (int i = 0; i < row1; i++)
        {
            for (int j = 0; j < column1; j++)
            {
                System.out.print("Enter value in 2nd matrix [" + i + "][" + j + "]: ");
                b[i][j] = sc.nextInt();
            }
        }

        // Matrix addition
        for (int i = 0; i < row1; i++)
        {
            for (int j = 0; j < column1; j++)
            {
                result[i][j] = a[i][j] + b[i][j];
            }
        }

        // Print result
        System.out.println("The addition of two matrices is:");
        for (int i = 0; i < row1; i++)
        {
            for (int j = 0; j < column1; j++)
            {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
