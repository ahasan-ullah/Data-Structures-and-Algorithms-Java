import java.util.Scanner;

public class hollowPattern {
    public static void main(String[] args) {
        int row,col;
        Scanner scanner = new Scanner(System.in);
        row = scanner.nextInt();
        col=scanner.nextInt();
        scanner.close();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i==1 || i==row || j== 1 || j==col){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
