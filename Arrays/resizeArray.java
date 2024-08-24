import java.util.Scanner;

public class resizeArray {
    static void resize(int[] arr){
        int capacity= arr.length*2;
        int[] temp=new int[capacity];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        print(temp);
    }
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
        resize(arr);
        scanner.close();
    }
}
