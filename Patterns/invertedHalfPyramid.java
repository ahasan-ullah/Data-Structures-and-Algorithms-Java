import java.util.Scanner;

public class invertedHalfPyramid {
    public static void main(String[] args) {
        int row;
        Scanner scanner = new Scanner(System.in);
        row = scanner.nextInt();
        scanner.close();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                    System.out.print("*");
            }
            System.out.println();
        }
    }}
