public class BubbleSortExample{
public int bubbleSort(int[] arr) {
      boolean swapped = true;
      int j = 0;
      int tmp;
	  int count = 0;
      while (swapped && j < arr.length) {
            swapped = false;
            j++;
            for (int i = 0; i < arr.length - j; i++) { 
				  count++;
                  if (arr[i] > arr[i + 1]) {                          
                        tmp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = tmp;
                        swapped = true;
                  }
            } 
				/*System.out.println("Swapped = "+swapped);
				System.out.println("Array after pass :");
				for(int i=0; i<arr.length; i++)
				{
					
					System.out.print(arr[i] + " ");
					
				}*/
      }
	  //System.out.println("count = "+count);
	  return count;
}
    /*public static void main(String[] args) {  
                int arr[] ={3,60,35,2,45,320,5};  
                 
                System.out.println("Array Before Bubble Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
                System.out.println();  
                  
                int c = bubbleSort(arr);//sorting array elements using bubble sort  
                 
                System.out.println("Array After Bubble Sort");
				System.out.println("c = "+c);
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " "); 
				
                }  
   
        } */

}  