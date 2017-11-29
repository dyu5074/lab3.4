
public class functions {
	public static void main (String [] args)
	{
		int[] test1 = {2,6,8,7,2};
		partition(test1,0,4);
		printArrayint(test1);
	}
	public static void partition(int[] list1, int front, int back)
	{
		int[] newarr=new int[list1.length]; 
		int temp = 0;
		for(int i = temp; i < front; i++)
		{
			newarr[i]=list1[i];
		}
		int pivot = list1[front];
		for (int h = front; h <= back; h++)
		{
			if (list1[h] <= pivot)
			{
				newarr[temp]=list1[h];
				temp++;
			}
		}
		for (int z = front; z <= back; z++)
		{
			if (list1[z] > pivot)
			{
				newarr[temp] = list1[z];
				temp++;
			}
		}
		for(int j =back+1 ; j<list1.length ; j++)
		{
			newarr[j]=list1[j];
		}
		list1 = newarr;
	}
	public static void quickSort(int[] list1, int front, int back)
	{
		
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
