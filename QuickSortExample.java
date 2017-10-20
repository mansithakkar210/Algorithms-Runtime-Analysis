public class QuickSortExample{
	static int count  = 0; static int pivot, spltpt, tempSwap, temp;
	/*public static void main(String args[])
	{
		int x[]={ 56,28,49,88,25,13,125,0,-12};
		int c = QS(x,0,8);
		System.out.println("count:"+c);
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}*/
	public int QS(int arr[] , int left, int right){
		count = 0;
		if(left < right )
		{
			
			int spltpt = split(arr , left, right);
			count = count + QS(arr, left, spltpt-1);
			count = count + QS(arr, spltpt+1, right);
		}
			
		return count;
		
	}
	public int split(int arr[], int left, int right)
	{
		
		pivot =arr[left];
		spltpt = left;
		for(int i=left+1; i<=right; i++)
		{
			count++;
			if(arr[i]<pivot)
			{
				spltpt++;
				tempSwap = arr[i];
				arr[i] = arr[spltpt];
				arr[spltpt] = tempSwap;
			}
		}
		temp = arr[left];
		arr[left] = arr[spltpt];
		arr[spltpt] = temp;
		return spltpt;
	}



}