//This program is to find the missing number from n consecutive array elements

import java.util.Scanner;

public class findMissingNumber {
    static int missingNumber(int[] arr){
        int sum=((arr.length+1)*(arr.length+2))/2;
        for(int num:arr){
            sum-=num;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println(missingNumber(arr));
        scanner.close();
    }
}
