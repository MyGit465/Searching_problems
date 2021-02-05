package amangangwar;

import java.util.Scanner;

public class Iterative_Solution {
      public static int binary_search(int arr[],int n,int x) {
    	  int low=0,high=n-1;
    	  int res=-1;
    	  while(low<=high) {
    		  int mid=(low+high)/2;
    		  if(arr[mid]==x)
    		    return mid;
    		  else if(arr[mid]>x)
    			  high=mid-1;
    		  else
    			  low=mid+1;
    	  }
    	 return -1;
      }
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int arr[]=new int[n];
		 for(int i=0;i<n;i++) {
			 arr[i]=sc.nextInt();
		  }
		 System.out.println("Enter searching element :");
		 int x=sc.nextInt();
		  System.out.println(binary_search(arr, n,x));
		 
	}

}
