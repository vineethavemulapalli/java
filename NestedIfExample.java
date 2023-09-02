//java program to demonstrate nested if
import java.io.*;
import java.util.*;
public class NestedIfExample{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter marks of three subjects");
int m1=sc.nextInt();
int m2=sc.nextInt();
int m3=sc.nextInt();
int total=m1+m2+m3;
float avg=(float)total/3;
if(avg>=75){
if(avg>=95)
{
System.out.println("your average is in top 5 percentage");
}
else if(avg>=90)
{
System.out.println("your average is in top 10 percentage");
}
else{
System.out.println("your average is in distincation");
}
}
else if(avg>=40&&avg<75)
{
System.out.println("student passed");
}
else{
System.out.println("student failed");
}
}
}



