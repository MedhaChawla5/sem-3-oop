import java.util.Scanner;
class largest{
public static int max(int x , int y , int z){
int l=0;
if(x>y){
  if(x>z)
    l=x;
  if(z>x)
    l=z;
}
if (y>x){
  if(y>z)
    l=y;
  if(z>y)
    l=z;
}
return l;
}

public static void main (String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter first number");
int x= sc.nextInt();
System.out.println("enter second number");
int y= sc.nextInt();
System.out.println("enter third number");
int z= sc.nextInt();

int max=max(x,y,z);
System.out.println("largest number is "+max);


}


}