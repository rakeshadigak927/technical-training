public class SwapNumbers {
static void swap(int a,int b)
{
    int temp=a;
    a=b;
    b=temp;
    System.out.println("inside swap a="+a+"b="+b);

}
public static void main(String[] args){
    int x=20;
    int y=30;
    System.out.println("before x="+x+"y="+y);
    swap(x, y);
    System.out.println("after x="+x+"y="+y);
}
}