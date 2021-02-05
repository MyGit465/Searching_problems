import java.util.Scanner;

public class Recursive_Solution {
	  public static int binary_search(int arr[],int low, int high ,int x) {
		  if(low>high)
			  return -1;
    	  int mid=(low+high)/2;
    	  if(arr[mid]==x)
    		  return mid;
    	  else if(arr[mid]>x)
    		  return binary_search(arr,low,mid-1,x);
    	  else if(arr[mid]<x)
    		  return binary_search(arr,mid+1,high,x);
		return mid;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int arr[]=new int[n];
		 for(int i=0;i<n;i++) {
			 arr[i]=sc.nextInt();
		  }
		 System.out.println("Enter searching element :");
		 int x=sc.nextInt();
		 int low=0,high=n-1;
		  System.out.println(binary_search(arr,low,high,x));
		 
	}

}
