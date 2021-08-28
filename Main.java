import java.util.*;
public class Main
{
    static void  find(int arr1[],int arr2[],int i)
    {
        
               int temp=arr1[i];
               arr1[i]=arr2[i];
               arr2[i]=temp;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=5;
		int [] arr1=new int[a];
		int [] arr2=new int[a];
		for(int i=0;i<a;i++)
		{
		  arr1[i]=sc.nextInt();  
		}
		for(int i=0;i<a;i++)
		{
		    arr2[i]=sc.nextInt();
		}
		for(int i=0;i<a;i++)
		{
		    
	    if(arr1[i]>arr2[i])
	     {
	     	find(arr1,arr2,i);
	     }
		}
		for(int i=0;i<a;i++)
		{
		System.out.println(arr1[i]+" "+arr2[i]);
		}
	}
}
