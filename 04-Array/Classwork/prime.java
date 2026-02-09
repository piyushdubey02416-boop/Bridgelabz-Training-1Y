import java.util.Scanner;
public class Prime{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter a number:");
int num=sc.nextInt();

int flag = 0;
if(num<=1){
System.out.println("not prime");
}
for(int i=2;i<=num/2;i++){
if(num%i==0){
flag =1;
}
}
if(flag ==0){
System.out.println("prime");
}
else{
System.out.println("not prime");
}
}
}