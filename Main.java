import java .util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to our String matching  pattern: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your   String:");
        String str1 = sc.nextLine();
        int i =0;
        for(i=str1.length()-1; i>=0;i--){
            System.out.println(str1.charAt(i));

        }
    }
}