import java.util.Scanner;

public class rectanglePattern {
    public static void main(String[] args) {
        int row,col;
        Scanner scanner = new Scanner(System.in);
        row = scanner.nextInt();
        col=scanner.nextInt();
        scanner.close();
        for(int i=1;i<=row;i++){
            for(int j=0;j<=col;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
