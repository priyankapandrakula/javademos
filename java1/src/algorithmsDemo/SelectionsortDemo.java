package algorithmsDemo;

public class SelectionsortDemo {
	
	void selectionDemo(int arr[])
	{
		int n=arr.length;
		int t;
		for(int i=0;i<n;i++)
		{
			int min=i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
				
			}
			t=arr[i];
			arr[i]=arr[min];
			arr[min]=t;
			
			
		}
	}
	void display(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
			
		}
	}
	
	public static void main(String[] args) {
		
		SelectionsortDemo dm=new SelectionsortDemo();
		int arr[]= {3,1,8,7,2,5,4,9,6};
		
		dm.selectionDemo(arr);
		System.out.println("sorted array in insertion is");
		dm.display(arr);
		
		
		
	}

}
