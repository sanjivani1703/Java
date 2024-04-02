import java.util.Scanner;
class assignment1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,r,j,row=5,star=1;space=4;
for(int r=1;r<=row;r++)
{
for(i=1;i<=space;i++)
{
System.out.print(" ");
}
for(int j=1;j<=star;j++)
{
System.out.print("* ");
}
}
}
}