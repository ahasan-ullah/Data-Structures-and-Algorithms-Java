import java.util.Scanner;

public class secondMinimum {
    static int findSecondMinimum(int []arr){
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for(int num:arr){
            if(num>max){
                secondMax=max;
                max=num;
            }
            else if(num>secondMax && num!=max){
                secondMax=num;
            }
        }
        return secondMax;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println(findSecondMinimum(arr));
        scanner.close();
    }
}
