// class HelloWorldJava{
// public static void main (String[]args){
//     System.out.print("aditya raj");
// }
// }

import java.util.Scanner;

// literals
public class operators {
    public static void main(String[] args) {
       

    int num1 = 0b101;
    // System.out.println(num1);

    int num = 1_00_00_000;
    // System.out.println(num);

    char c = 'c';
    c++;
    // System.out.println(c);

    
        int currentStreak = 45;
        // int targetStreak = 50;

        // System.out.println(currentStreak == targetStreak);
        // System.out.println(currentStreak != targetStreak);
        // System.out.println(currentStreak > targetStreak);
        // System.out.println(currentStreak < targetStreak);
        // System.out.println(currentStreak >= targetStreak);
        // System.out.println(currentStreak <= targetStreak);

        // int nam = 10;
        // System.out.println(nam++);
        //         System.out.println(nam++);


//instance of operator
        //         String s = "Hello";
        // boolean result = s instanceof String;
        // System.out.println(result);

        // int x = 20;
        //  String z = (x != 20) ? " x equals to " : "not equal" ;
        // System.out.println(z);

       

        // and operator &
//         int n = 1;

// if ((n & 1) == 0)
//     System.out.println("Even");
// else
//     System.out.println("Odd");
    // System.out.println(3 & 1 );




      Integer nums = 10;
        System.out.println(nums instanceof Integer); // true
        System.out.println(nums instanceof Number);  // true
    

    int[] arrs = new int[5];
System.out.println(arrs instanceof int[]); // false


Scanner sc = new Scanner(System.in);
int numbers = sc.nextInt();
        System.out.println(numbers);
        // sc.nextLine(); // buffer clear
int problems = sc.nextInt();
        System.out.println("You solved " + problems + " problems."); //concatenation
        sc.nextLine(); // buffer clear
String name = sc.nextLine();
        System.out.println("Hello, " + name + "!"); //concatenation

    }



}
