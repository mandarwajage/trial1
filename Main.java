import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{

		int []arr= {10,20,30,40,50,60,66,77,88,99};
		System.out.println("Enter number to search");
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int index=binarysearch(arr,n1);
		if(index==-1)
		{
			System.out.println(n1+"not found");
		}
		else
		
		
		System.out.println("Index"+index);
		

	}

	private static int binarysearch(int arr[],int n1)
	{

		int end=arr.length-1;
		int start=0;
		//int mid=(start+end)/2;   //mid=start+(end-start)/2;
	
		while(start <= end)
		{
			int mid=(start+end)/2;
			System.out.println(mid+"mid");
			if(arr[mid]>n1)
			{
				end=mid-1;	

			}
			else if(arr[mid]<n1)
			{
				start=mid+1;
			}
			else
			{
				return mid;
			}
		}
		return -1;


	}

}
