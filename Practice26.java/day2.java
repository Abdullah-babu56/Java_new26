import java.util.Scanner;
public class day2{
    public static void main(String[] args){
        System.out.print("enter age: ");
        int age;
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if (age>=50){
            System.out.println("you are exprienceses");

        } else if (age>=40) {
            System.out.println("you are semi-exprienceses");

        } else if (age>=25) {
            System.out.println("you are semi-semi-exprienceses");

        } else{
            System.out.println("you are not exprienceses");
        }


    }
}