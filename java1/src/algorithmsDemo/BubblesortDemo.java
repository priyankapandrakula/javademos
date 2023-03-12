package algorithmsDemo;
import java.util.*;
public class BubblesortDemo {
	void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
	void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

	public static void main(String[] args) {
		BubblesortDemo demo=new BubblesortDemo();
		int myarr[]= {10,4,17,5,6,2,13};
		demo.bubbleSort(myarr);
		System.out.println("sorted array is");
		demo.printArray(myarr);
		
		
		
		

	}

}
