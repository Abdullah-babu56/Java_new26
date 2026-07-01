import com.sun.source.doctree.EscapeTree;

import java.util.Scanner;

public class day8 {
    public static void main(String[] args){

    //while loops

       int a = 0;
       while (a<=10){
           System.out.println(a);
           a++;
       }
   //do while loops
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter natural no: ");
       int natural_no,i;
       natural_no = sc.nextInt();

      i = 1;
       do{
           System.out.println(i);
           i++;
       }while (i<=natural_no);

       for loops

     int n;
     System.out.print("enter number: ");
     Scanner sc = new Scanner(System.in);
     n = sc.nextInt();
     for (int i = 0; i <= n; i++){
         if (i%2!=0){
             System.out.println(i);

         }
     }


       int n;
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter number: ");
       n = sc.nextInt();
       for (int i=n; i>=1; i--){
           System.out.println("The First n Natural no is: "+i);
       }

       // Practice questions


       for (int i=1; i<=5; i++){
           for (int j = 1; j<=i; j++){

               System.out.print("*");

           }
           System.out.println();
       }
       for (int i=4; i>=0; i--){
           for (int j=0; j<=i; j++){
               System.out.print("*");
           }
           System.out.println();
       }

       int n,i,sum;
        Scanner sc = new Scanner(System.in);
       System.out.print("enter no: ");
       n = sc.nextInt();
       sum=0;
       i = 1;

       while (i <= n){
           if (i%2==0){
               System.out.println(i);
               sum+=i;
           }
           i++;
       }
           System.out.println("total sum of the even no is: "+sum);

       sc.close();


       int n,fact;
       Scanner sc = new Scanner(System.in);
       System.out.print("enter no: ");
       n = sc.nextInt();
       fact = 1;

       for (int i = 1; i <= n; i++){
           fact*=i;
           System.out.println(i);
       }
       System.out.println("fact is: "+fact);


                Scanner sc = new Scanner(System.in);

                System.out.print("Enter number: ");
                int n = sc.nextInt();
                int sum = 0;

                for (int i = 1; i <= 10; i++) {
                    System.out.println(n + " x " + i + " = " + (n * i));
                    sum+=(n*i);
                }

        System.out.println("total sum of table: "+sum);

                sc.close();
    }
}
