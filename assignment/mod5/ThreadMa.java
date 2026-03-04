class MyThread extends Thread{
public void run(){
System.out.println("Running");
}
}
public class ThreadMa{
public static void main(String[]args)throws Exception{
MyThread t=new MyThread();
System.out.println(t.getState());
t.start();
System.out.println(t.getState());
t.join();
System.out.println(t.getState());
}
}
