import java.io.*;
import java.util.*;
public class StudentAverage{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter marks of three subjects");
int m1=sc.nextInt();
int m2=sc.nextInt();
int m3=sc.nextInt();
int total=m1+m2+m3;
float avg=(float)total/3;
if(avg>=75){
{
{
System.out.println("student passed in 1st class");
}
else if(avg>=50&&avg<60){
System.out.println("student passed in 2nd class");
}
else if(avg>=40&&avg<50)
{
System.out.println("student passed in 3rd class");
}
else{
System.out.println("student failed");
}
}
}



