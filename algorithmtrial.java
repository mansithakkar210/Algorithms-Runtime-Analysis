public class algorithmtrial
{
	public static void main(String args[])
	{
		System.out.println("       Quick Sort                                 BubbleSort                                         BST");
		System.out.println("n      av          av/n      av/n*n    av/nlog(n)   av             av/n       av/n*n    av/nlog(n)   av        av/n     av/n*n   av/nlog(n)   ");
		for(int n=5001;n<=5500;n++)
		{
			int quickSortTotal = 0;
			int bubbleSortTotal = 0;
			int BinarySearchTotal = 0;
			for(int i=1;i<=30;i++)
			{
				//System.out.println("Array of "+n);
				int x[]=randomPermutation(n);
				int y[]=x.clone();
				int z[]=x.clone();
				
				
				QuickSortExample q= new QuickSortExample();
				int count = q.QS(x,0,n-1); 
				quickSortTotal+=count;
		
				BubbleSortExample b= new BubbleSortExample();
				count = b.bubbleSort(y);
				bubbleSortTotal+=count;
				
				BST bs = new BST();
				count=0;
				for(int j=0;j<z.length;j++)
					count+=bs.insert(z[j]);
				BinarySearchTotal+=count;
				
			}
			double avgq = (double)quickSortTotal/30;
			double avgb = (double)bubbleSortTotal/30;
			double avgbs = (double)BinarySearchTotal/30;
			double log2n = Math.log(n)/Math.log(2);
			System.out.println();
			System.out.print(n+"   ");
			System.out.format("%6.4f",avgq);
			System.out.print("   ");
			System.out.format("%6.4f",avgq/n);
			System.out.print("    ");
			System.out.format("%6.4f",avgq/(n*n));
			System.out.print("    ");
			System.out.format("%6.4f",avgq/(n*log2n));
			System.out.print("    ");
			System.out.format("%6.4f",avgb);
			System.out.print("    ");
			System.out.format("%6.4f",avgb/n);
			System.out.print("    ");
			System.out.format("%6.4f",avgb/(n*n));
			System.out.print("    ");
			System.out.format("%6.4f",avgb/(n*log2n));
			System.out.print("    ");
			System.out.format("%6.4f",avgbs);
			System.out.print("    ");
			System.out.format("%6.4f",avgbs/n);
			System.out.print("    ");
			System.out.format("%6.4f",avgbs/(n*n));
			System.out.print("    ");
			System.out.format("%6.4f",avgbs/(n*log2n));
			
		
		}
		
	}
	public static int[] randomPermutation(int n)
	{   
		int c = n;
		int a[] = new int[n]; int temp1;
		for(int i=0; i<=n-1; i++)
	    {
		a[i] = i+1;
		//System.out.println(a[i]);
	    }
		for(int j=n-1; j>=1; j--)
		{
		int random = 0+(int )(Math.random() * (n-1));
		//System.out.println("random ="+random);
		temp1 = a[n-1];
		a[n-1] = a[random];
		a[random] = temp1;
		//System.out.println("last element ="+a[n-1]);
		//System.out.println("random element="+a[random]);
		n = n-1;
		}
		n = c;
		/*for(int i = 0; i<n; i++)
		{
			System.out.println(a[i]);
		}*/
		return a;
	}
}