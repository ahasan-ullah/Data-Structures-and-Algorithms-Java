import java.util.Scanner;

public class reverseArray {
    static void print(int[] arr){
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
    static void reverse(int[]arr,int end){
        int start=0;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
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
        reverse(arr,arr.length-1);
        scanner.close();
    }
}
