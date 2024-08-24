import java.util.Scanner;

public class palindromeCheck {
    static boolean isPalindrome(String word){
        char[] charArray=word.toCharArray();
        int start=0,end=word.length()-1;
        while(start<end){
            if(charArray[start]!=charArray[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String word=scanner.nextLine();
        System.out.println(isPalindrome(word));
        scanner.close();
    }
}
