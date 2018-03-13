package exam;
class A1 
{
    final public int GetResult(int a, int b) { return 0; } 
} 
class B extends A1 
{ 
    public int GetResult(int a, float b) {return 1; } 
} 
public class Test8 
{
    public static void main(String args[]) 
    { 
        B b = new B(); 
        System.out.println("x = " + b.GetResult(0, 1));
        int i='2';
        System.out.println(i);
    } 
}
