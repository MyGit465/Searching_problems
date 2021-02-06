package amangangwar;

import java.util.Scanner;

public class Naive_Solution {
      static int firstoccurrence(int arr[], int n,int x) {
    	  for(int i=0;i<n;i++) {
    		   if(arr[i]==x) {
    			   return i;
    		   }
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
		 System.out.println(firstoccurrence(arr,n,x));
	}

}
