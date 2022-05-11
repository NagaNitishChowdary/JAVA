// WAP in java to demonstrate this keyword

class A
{
int a,b,c;

A(int a,int b,int c)
{
this.a=a;
this.b=b;
this.c=c;
}

void m()
{
System.out.println("hello m");
}
void n()
{
System.out.println("hello n");
this.m();
}

void display()
{
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
}

class B
{
B()
{
this(5);
System.out.println("hello a");
}
B(int x)
{
System.out.println(x);
}
}

class lab22
{
public static void main(String[] args)
{
System.out.println("this keyword to invoke current class instance variable");
A a=new A(10,20,30);
a.display();

System.out.println("this keyword to invoke current class method");
a.n();

System.out.println("this keyword to invoke current class constructor");
B c=new B();
}
}
