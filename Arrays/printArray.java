import java.util.Scanner;

public class printArray {
    static void print(int[] arr){
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        print(arr);
        scanner.close();
    }
}
