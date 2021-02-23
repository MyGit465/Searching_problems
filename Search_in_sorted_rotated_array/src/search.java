import java.util.Scanner;

public class search {
       static int search(int arr[],int n,int x) {
     
    	       int low=0,high=n-1;
    	       while(low<=high) {
    	    	   int mid=(low+high)/2;
    	    	   if(arr[mid]==x)
    	    		   return mid;
    	    	   if(arr[low]<arr[mid-1]) {
    	    		   if(arr[low]<x && x<arr[mid-1])
    	    			   high=mid-1;
    	    		   else
    	    			   low=mid+1;
    	    	   }else {
    	    		   if(arr[mid]<x && x< arr[high])
    	    			   low=mid+1;
    	    		   else
    	    			   high=mid-1;
    	    	   }
    	       }
    	   return -1;
       }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter Search Element :");
		int x=sc.nextInt();
		int res=search(arr,n,x);
		System.out.println(res);
	}

}
