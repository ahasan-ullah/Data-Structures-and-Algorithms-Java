import java.util.Scanner;

public class palindromicPattern {
    public static void main(String[] args) {
        int row;
        Scanner scanner = new Scanner(System.in);
        row = scanner.nextInt();
        scanner.close();
        for(int i=1;i<=row;i++){
            int j;
            for(j=1;j<=row-i;j++){
                System.out.print("  ");
            }
            int k=i;
            for(;j<=row;j++){
                System.out.print(k--+" ");
            }
            k=2;
            for(;j<=row+i-1;j++){
                System.out.print(k++ +" ");
            }
            System.out.println();
        }
    }
}
