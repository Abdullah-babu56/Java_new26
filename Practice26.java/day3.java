import java.util.Scanner;
public class day3{
    public static void main(String[] args){
        System.out.print("enter month: ");
        String month;
        Scanner sc = new Scanner(System.in);
        month = sc.nextLine();
        switch (month){
            case "jan":
                System.out.println("This month is winter!");
                break;
            case "April":
                System.out.println("This month is summer!");
                break;
            case "aug":
                System.out.println("This month is rainy");
                break;
            default:
                System.out.println("Invalid month entered!");

        }

        System.out.println("Thank for enter months!!");
    }
}