import java.util.Scanner;
class sum{
public static void main (string args[]){
Scanner sc = new scanner (System.in);
System.out.println ("enter a number");
int num = sc.nextInt();
     while(num!=0){
         sum += num % 10;
         num = num / 10;
     }
	        System.out.println ("Sum of digits : " + sum);
}
}
