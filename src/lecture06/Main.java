package lecture06;

public class Main {
    public static void main(String[] args){
        String palindrome= "7aa7";
        System.out.println("The word is palindrome: " + isPalindorme(palindrome));

    }

    static boolean isPalindorme(String palindrome){
        boolean isPalindrome = false;
        String reveredWord = "";

        for (int i= palindrome.length()-1;i >=0; i--){
           reveredWord= reveredWord + palindrome.charAt(i);

        }
      if (palindrome.equals(reveredWord)){
          isPalindrome= true;

      }
      return isPalindrome;
    }
}
