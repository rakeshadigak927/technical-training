class MyException extends Exception{
MyException(String s){
super(s);
}
}
public class CustomC{
static void check(int a)throws MyException{
if(a<0)throw new MyException("Negative number");
else System.out.println("Valid");
}
public static void main(String[]args){
try{
check(-5);
}catch(Exception e){
System.out.println(e);
}
}
}
