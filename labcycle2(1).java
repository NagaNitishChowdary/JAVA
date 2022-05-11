// WAP in java to demonstrate static keyword in java

class student
{
int rollno;
String name;
static String college="RVR";//static variable

student(int r,String n)
{
rollno=r;
name=n;
}

static void change()//static method
{
college="RVR & JCCE";
}

void display()
{
System.out.println(name);
System.out.println(rollno);
System.out.println(college);
}
}

class lab21
{
static int rollno;
static String name,college;
static // static block
{
name="NAGA NITISH";
rollno=83;
college="RVR";
System.out.println("Static block initialized");
}

public static void main(String args[])
{
System.out.println(lab21.name);
System.out.println(lab21.rollno);
System.out.println(lab21.college);

System.out.println("static variable");
student s=new student(83,"NAGA NITISH");
s.display();

System.out.println("static method");
student.change();
s.display();
}
}
