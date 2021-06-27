import java.util.Scanner;
public class maxprod {
public static int maxpro(int[] nums)
{
int i = Integer.MIN_VALUE;
int j = i;
for(int no : nums)
{
if(i< no) 
{
j = i;
i = no;
}
else if(j < no) {
j = no;
}
}
return (i-1) * (j-1);
}
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int no;
System.out.println("Enter no of elements:");
no=sc.nextInt();
int[]nums=new int[4];
System.out.print("Input:");
for(int i=0;i<no;i++)
{
nums[i]=sc.nextInt();
}
System.out.println("Output:" + maxpro(nums));
 }
}