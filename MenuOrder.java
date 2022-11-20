import java.util.Scanner;

public class MenuOrder {
    private static Scanner ord;

	public static void main(String[] args){
        ord = new Scanner(System.in);
        System.out.println("[1] Coke:");
        System.out.println("[2] Milktea:");
        System.out.println("[3] Coffee:");
        System.out.println("Enter Order:");
        int order = ord.nextInt();
        switch(order){
            case 1:
            System.out.print("You ordered Coke");
            break;
            case 2:
            System.out.print("You ordered Milktea");
            break;
            case 3:
            System.out.print("You ordered Coffee");
            break;
            case 4:
            System.out.print("Not A Valid Order");
            break;  
        }
    }
}