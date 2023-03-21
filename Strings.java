import java.util.*;
public class Strings {

    // 1 print all letters of string
    public static void printLetters(String fullName){
       for(int i=0; i<fullName.length(); i++){
           System.out.print(fullName.charAt(i) + " ");
       }
       System.out.println();
    } 

    // 2 check string is palindrome or not
    public static boolean palindrome(String str){
        for(int i=0; i<=str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                System.out.println("String is not palindrome!");
                return false;
            } 
        }
        System.out.println("String is palindrome!");
        return true;
    }

    // 3 find shortest path from origin(0,0)
    public static float getShortestPath(String path){
        int x=0, y=0;
        for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i);
            if(dir == 'N'){
                y++;
            }
            else if(dir == 'S'){
                y--;
            }
            else if(dir == 'E'){
                x++;
            }
            else if(dir == 'W'){
                x--;
            }
        }
        int X2 = x*x;  // (x-0)^2 = x^2  
        int Y2 = y*y;
        System.out.print("Shortest distance from origin is : " );
        return (float)Math.sqrt(X2 + Y2);
    }

    // 4 find substring si=starting index ei= ending index
    public static String subString(String s, int si, int ei){
        String subStr = "";
        for(int i=si; i<ei; i++){
            subStr += s.charAt(i);
        }
        return subStr;
    }

    // 5 make first letter in upper case
    public static String toUppercase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    // 6 compress string "aaabbbcoo" --> "a3b3co2" TC = O(n)
    public static String compress(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<str.length(); i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count > 1){
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }

    public static void main(String...arg){
        Scanner sc = new Scanner(System.in);
        
     /* System.out.print("Enter your name : ");
        //String name = sc.next();    // if input=nand kishor  output=nand
        String name = sc.nextLine();  // output=nand kishor
        System.out.println("Hey ! " + name);
        System.out.print("Entered characters are : " + name.length());   */

        
     /* System.out.print("Enter first name : ");
        String firstName = sc.next();
        System.out.print("Enter last name : ");
        String lastName = sc.next();
        String fullName = firstName + " " + lastName;      // concatenation
        System.out.println("Your full name : " + fullName);
        System.out.println("First letter of your name is : " + firstName.charAt(0));
        printLetters(fullName);        */


        // 2 check palindrome
        //System.out.print("Enter a string :  ");
        //String str = sc.nextLine();
        //palindrome(str);


        // 3 get shortest path 
        // System.out.print("Enter directions from (N,S,E,W) : ");
        // String path = sc.next();
        // System.out.println(getShortestPath(path));


        // 4 find sub string
        // System.out.print("Enter any String : ");
        // String s = sc.nextLine();
        // System.out.print("enter starting index : ");
        // int si = sc.nextInt();
        // System.out.print("enter ending index : ");
        // int ei = sc.nextInt();
        // System.out.println("sub string : " + subString(s, si, ei));
        // // inbuilt function to find substring
        // System.out.println(s.substring(si,ei));


        // lexicographic comparition find largest string TC=O(n*x)  x=length of largest
        // System.out.print("Enter 3 fruits name to find largest one : ");
        // String fruits[] = new String[3];
        // for(int i=0; i<fruits.length; i++){
        //     fruits[i] = sc.next();
        // }
        // String largest = fruits[0];
        // for(int i=1; i<fruits.length; i++){
        //     if(largest.compareToIgnoreCase(fruits[i]) < 0){
        //         largest = fruits[i];
        //     }
        // }
        // System.out.println("largest value is : " + largest);


        // String Builder TC = O(n) n=23 26-3 abc already printed
        // StringBuilder a2z = new StringBuilder("a b c ");
        // for(char ch='d'; ch<='z'; ch++){
        //     a2z.append(ch + " ");
        // }
        // System.out.println(a2z);


        // 5 make first letter in upper case
        // System.out.println("Enter a sentance : ");
        // String str = sc.nextLine();
        // System.out.println(toUppercase(str));


        // 6 compress string
        // System.out.println("Enter a string to compress : ");
        // String str = sc.next();
        // System.out.println(compress(str));
    }
}
    

