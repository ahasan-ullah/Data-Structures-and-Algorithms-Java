import java.util.Scanner;

public class moveZerosToEnd {
    static void print(int[] arr){
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
    static void moveZeros(int[] arr){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0 && arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if(arr[j]!=0){
                j++;
            }
        }
        print(arr);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        moveZeros(arr);
        scanner.close();
    }
}
