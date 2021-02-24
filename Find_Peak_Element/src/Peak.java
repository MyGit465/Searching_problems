 

import java.util.ArrayList;
import java.util.Scanner;

public class Peak{
         static void peek(int arr[], int n) {
        	 ArrayList<Integer> al=new ArrayList<Integer>(n);
        	 if(arr[0]>arr[1])
        		 al.add(arr[0]);
        	 if(arr[n-1]>arr[n-2])
        		 al.add(arr[n-1]);
        	 int i=0;
        	 while(i<n-2) {
        		 if(arr[i]<arr[i+1] && arr[i+1]>arr[i+2])
        			 al.add(arr[i+1]);
        	     i++;
        	 }
        	 System.out.println(al);
         }
        
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  System.out.println("enter the size of array :");
		  int n=sc.nextInt();
		  int arr[]=new int[n];
		  for(int i=0;i<n;i++) {
			  arr[i]=sc.nextInt();
		  }
		  peek(arr,n);
	}
}
