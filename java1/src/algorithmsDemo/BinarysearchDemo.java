package algorithmsDemo;

import java.util.Arrays;

public class BinarysearchDemo {

	public static void main(String[] args) {
		int key=90;
		int arr[]= {45,67,32,90,33};
		Arrays.sort(arr);
		int idx=binarySearch(arr,key);
		if(idx==-1)
		{
			System.out.println("itm not found");
			
		}
		else {
			System.out.println("itm found at : "+idx);
		}
		
		

	}
	private static int binarySearch(int []arr,int k)
	{
		int fidx=0;
		int lidx=arr.length-1;
		int mid=(fidx+lidx)/2;
		while(fidx<=lidx)
		{
			if(k>arr[mid])
			{
				fidx=mid+1;
			}
			else if (k==arr[mid])
			{
				return mid;
			}
			else {
				lidx=mid-1;
			}
			mid=(fidx+lidx)/2;
		}
		return 0;
		
	}

}
