class Demo{
static int count=0;
Demo(){count++;}
static void display(){
System.out.println(count);
}
}
public class StaticM{
public static void main(String[]args){
new Demo();
new Demo();
new Demo();
Demo.display();
}
}
