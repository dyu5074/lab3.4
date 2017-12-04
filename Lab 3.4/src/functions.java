
public class functions {
	public static void main (String [] args)
	{
		int[] test1 = {9,6,8,7,2};
		System.out.println(partition(test1,0,4));
		quickSort(test1,1,4);
		printArrayint(test1);
	}
	private static int partition(int[] list, int front, int back)
	{
	    int pivot = list[front];
	    int low = front + 1;
	    int high = back;
	    while (high > low) 
	    {
	    	while (low <= high && list[low] <= pivot)
	    	{
		    	low++;
	    	}
			while (low <= high && list[high] > pivot)
			{
		        high--;
			}
			if (high > low)
			{
				int temp = list[high];
				list[high] = list[low];
				list[low] = temp;
			}
	    }
	    while (high > front && list[high] >= pivot)
	    {
	    	high--;
		}
	    if (pivot > list[high]) 
	    {
	    	list[front] = list[high];
	        list[high] = pivot;
	        return high;
	    }
	    return front;
    }
	public static void quickSort(int[] list1, int front, int back)
	{
		if(front<back)
		{
			int findpivot = partition(list1, front, back);
		    quickSort(list1, front, findpivot - 1);
		    quickSort(list1, findpivot + 1, back);
		}
	}
	public static void printArrayint(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.print(arr[i]+",");
		}
		System.out.print(arr[arr.length-1]);
	}
}
