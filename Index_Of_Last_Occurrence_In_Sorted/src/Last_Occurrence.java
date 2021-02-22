 

import java.util.Scanner;

public class Last_Occurrence {
     static int Iterative_solution(int arr[], int n,int x) {
    	    int low=0;
    	    int high=n-1;
    	    
    	    while(low<=high) {
    	    	 int mid=(low+high)/2;
    	    	if(arr[mid]==x) {
     	    	    if(mid==high ||arr[mid]!=arr[mid+1])
    	    			return mid;
    	    		else
    	    			low=mid+1;
//    	    		while(low<=high) {
//    	    			if(arr[low]==x) {
//    	    				return low;
//    	    			}
//    	    	     low++;
//    	    		}
    	    	}
    	    	else if(arr[mid]>x) {
    	    		high=mid-1;
    	    	}
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
		 System.out.println(Iterative_solution(arr,n,x));

	}

}
