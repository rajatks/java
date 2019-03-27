class A
{
int x=12;
public void abc()
{
System.out.println("hello A");
}
}
class B extends A{
public void abc()
{
System.out.println("hello B");
}
}

class C extends B
{
public void abc()
{
System.out.println("hello c");
}
}

public class InheriTance
{
public static void main(String[] args)
{

A a1=new A();
a1.abc();
 a1=new B();
a1.abc();
 a1=new C();
a1.abc();
}
}
