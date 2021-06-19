
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class goodie {
   
	static int minDiff(int arr[], int n, int k) {
		int result = Integer.MAX_VALUE;//maximum value getting
		Arrays.sort(arr);//for sorting array in manner
		for (int i=0; i<= n-k;i++)
			result = Math.min(result, arr[i + k - 1] - arr[i]);
		return result;//returns result of minimum operation 
		
	}
	static int findele(int res,int arr[], int n, int k)
	{
		int result = Integer.MAX_VALUE;
		for(int i=0; i<=n; i++)
		{
			result = Math.min(result, arr[i + k - 1] - arr[i]);
			if (res==result)//checks if res is equal to result then returns i
				return i;		
		}
		return 0;
	}
	public static void main(String[] args) throws IOException  {
	    
	    int arr[]={7980,22349,999,2799,229900,11101,9999,2195,9800,4999};
	    String items[]={ "MI Band: 999","Sandwich Toaster: 2195" ,"Cult Pass: 2799","Scale: 4999","Fitbit Plus: 7980","Microwave Oven: 9800"  ,"Alexa: 9999","Digital Camera: 11101", "IPods: 22349","Macbook Pro: 229900" };
	    int n = arr.length;
	    System.out.println("Enter the number of employees");
	    Scanner s = new Scanner(System.in);
	    int k=s.nextInt();//getting k value
	    int result=minDiff(arr, n, k);  //minimum difference function
	    System.out.println("Number of the employees:"+k); //number of employees entered
	    int startindex=findele(result,arr,n,k);
	    System.out.println("Here the goodies that are selected for distribution are:");
	    for(int i=startindex;i<startindex+k;i++)
	    System.out.println(items[i]);//print items
	      System.out.println("And the difference between the chosen goodie with highest price and the lowest price is "+result);
	} 
	
		
	}
