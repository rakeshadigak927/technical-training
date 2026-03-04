public class GarbageM
public void finalize(){
System.out.println("Garbage collected");
}
public static void main(String[]args){
Main m1=new Main();
Main m2=new Main();
m1=null;
m2=null;
System.gc();
}
}
