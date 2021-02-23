import java.util.Scanner;
        
public class Count_1s {
      static int count_1s(int arr[], int n,int x) {
    	  int res=0;
    	     int low=0;
    	     int high=n-1;
    	     while(low<=high) {
    	    	 int mid=(low+high)/2;
    	    	 if(arr[mid]==0)
    	    		 low=mid+1;
    	    	 else {
    	    		 if(mid==0 ||arr[mid-1]!=1)
    	    			 return (n-mid);
    	    		 else
    	    			 high=mid-1;
    	    	 }
    	     }
    	  return res;
      }
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter Size of array :");
		 int n=sc.nextInt();
		 int arr[]=new int[n];
		 for(int i=0;i<n;i++) {
			 arr[i]=sc.nextInt();
		 }
		 int x=1;
		 int res=count_1s(arr,n,x);
		 System.out.println(res);
		 
	}
}
