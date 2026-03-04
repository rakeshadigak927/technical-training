class A{
synchronized void m1(B b){
System.out.println("Thread1");
b.last();
}
synchronized void last(){}
}
class B{
synchronized void m2(A a){
System.out.println("Thread2");
a.last();
}
synchronized void last(){}
}
public class Main extends Thread{
A a=new A();
B b=new B();
public void run(){
b.m2(a);
}
public static void main(String[]args){
Main t=new Main();
t.start();
t.a.m1(t.b);
}
}
