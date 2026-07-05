// string concept
// using of string built in method
import java.util.Scanner;
public class string {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);

         System.out.print("Enter a string: ");
         String s = sc.nextLine();

         // length() --> to find the length od the string s
         System.out.println(s.length());

         // charAt(index) --> Get a character at a position
         System.out.println(s.charAt(2));

         // toUpperCase() --> convert to upper case
         System.out.println(s.toUpperCase());

         // toLowerCase() --> Convert to lower case
         System.out.println(s.toLowerCase());

         // equals --> Comparing two strings
         System.out.println(s.equals("binitta"));

         // equalsIgnoreCase() – Compare ignoring case
         System.out.println(s.equalsIgnoreCase("Binitta"));

         // contains() --> check the text contains the string
         System.out.println(s.contains("binitta"));

         // startsWith() --> check whether the string start with
         System.out.println(s.startsWith("bi"));

         //endsWith --> check whether the string ends with
         System.out.println(s.endsWith("ta"));

         // replace --> Replace characters/text
         System.out.println(s.replace("bi", "ni"));

         //trim() --> remove spaces at beginning and end
         System.out.println(s.trim());

         //indexOf() – Find position of a character/text
         System.out.println(s.indexOf("n"));




    }
}

