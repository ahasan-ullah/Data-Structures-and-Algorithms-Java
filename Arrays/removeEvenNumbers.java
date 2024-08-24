import java.util.Scanner;

public class removeEvenNumbers {
    static void removeEvent(int[] arr){
        int oddCount=0;
        for(int i=0;i< arr.length;i++){
            if(i%2!=0){
                oddCount++;
            }
        }
        int[] result=new int[oddCount];
        int idx=0;
        for(int i=0;i< arr.length;i++){
            if(i%2!=0){
                result[idx]=arr[i];
                idx++;
            }
        }
        print(result);
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
        removeEvent(arr);
        scanner.close();
    }
}
