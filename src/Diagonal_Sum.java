import java.util.Scanner;

public class Diagonal_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width (height) of the square matrix you want to create: ");
        int sz = sc.nextInt();
        int[][] arr = new int[sz][sz];

        for (int i=0; i<sz;i++){
            for (int j=0; j<sz;j++){
                System.out.println("Enter value of element in row #" + i + ", column #" + j);
                arr[i][j] = sc.nextInt();
            }
        }

        int sum = 0;
        for (int i=0;i<sz;i++){
            sum += arr[i][i];
        }
        System.out.println("Result: " + sum);
    }
}
