package algorithmsDemo;

public class InsertionsortDemo {
	
	void insertionDemo(int arr[])
	{
		int n=arr.length;
		for(int i=1;i<n;i++)
		{
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
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
		
		InsertionsortDemo dm=new InsertionsortDemo();
		int arr[]= {3,1,8,7,2,5,4,9,6};
		
		dm.insertionDemo(arr);
		System.out.println("sorted array in insertion is");
		dm.display(arr);
		
		
		
	}

}
