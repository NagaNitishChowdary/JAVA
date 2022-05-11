import java.util.*;
class emp
{
String name;
int id,sal,hour;
int t;

void getinfo()
{
Scanner knnc=new Scanner(System.in);
System.out.println("enter the employee name");
name=knnc.nextLine();
System.out.println("enter the employee id");
id=knnc.nextInt();
System.out.println("enter the employee salary");
sal=knnc.nextInt();
System.out.println("enter number of hours of employee working");
hour=knnc.nextInt();
}

void addsalary()
{
if(sal<500)
{
sal+=10;
}
}

void addwork()
{
if(hour>6)
{
t=hour-6;
sal+=(t*5);
}
}

void printinfo()
{
System.out.println("name is:"+name);
System.out.println("id is:"+id);
System.out.println("salary is:"+sal);
System.out.println("no of  hours of work for employee is:"+hour);
}
}

class labcycle1
{
public static void main(String[] args)
{
int k;
Scanner knnc1=new Scanner(System.in);
System.out.println("enter no of employees:");
k=knnc1.nextInt();
emp q[]=new emp[k];
for(int i=0;i<k;i++)
{
q[i]=new emp();
q[i].getinfo();
q[i].addsalary();
q[i].addwork();
q[i].printinfo();
}
}
}
