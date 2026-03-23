import java.util.Scanner;

public class scan{
    public static void main(String[] args){
    //     System.out.println("hello i am aditya");
    //     //this is used to take the input;
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("input your age");
    //     sc.nextInt();

    //     System.err.println(sc);

    
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age > 18) {
            System.out.println("can vote");
        }
        else{
            System.out.println("cannot vote");
        }
    
    }
    
}