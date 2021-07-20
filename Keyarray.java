import java.util.*;
public class Keyarray
{
public static void keyarray(int n,String key[],int arr[],String s)
{
Map<String,Integer> h=new HashMap<>();
for(int i=0;i<n;i++)
{
if(h.containsKey(key[i]))
{
if(key[i]==s)
{
h.put(key[i],h.get(arr[i]));
}
else
h.get(-1);
}
}
System.out.println(h);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter size of array : ");
int n=sc.nextInt();
String key[]=new String[n];
int arr[]=new int[n];
System.out.println("Enter key elements : ");
for(int i=0;i<n;i++)
{
key[i]=sc.next();
}
System.out.println("Enter array elements : ");
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("Enter String to search : ");
String s=sc.next();
keyarray(n,key,arr,s);
}
}

output:

Enter size of array : 
3
Enter key elements : 
sak varun vijay
Enter array elements : 
4 5 7
Enter String to search : 
sak
{4}