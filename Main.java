//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main{
    public static int countVowels(String str ){
        int vowels =0;
       // int count =0;
        int i =0;
        str = str.toLowerCase();

        for ( i =0;i<str.length();i++){
            char ch = str.charAt(i);
          //str=str.toLowerCase();
            if (ch=='a'|| ch=='i'||ch=='o'||ch=='u'||ch=='e'){
                vowels++;

            }
            //else {
                //System.out.println("Count = "+count);
           // }

        }
        return vowels ;
    }
    public boolean palindrome(String str ) {
        int left =0;
        int right = str.length()-1;
        while (left <right ){
            if (str.charAt(left) !=str.charAt(right)){
                return false ;
            }
            left++;
            right --;
        }

        return true;

    }
    public static void main(String [] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String :");
        String str = sc.nextLine();
        int result = countVowels(str);
        System.out.println("Number Of Vowels = "+result);
        Main obj = new Main();
        System.out.println(" your palindrome="+obj.palindrome(str));
    }
}