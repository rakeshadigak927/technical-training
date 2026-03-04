import java.util.Scanner;
public class TryC{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
try{
int c=a/b;
System.out.println(c);
}catch(ArithmeticException e){
System.out.println("Division by zero");
}finally{
System.out.println("Finished");
}
}
}
