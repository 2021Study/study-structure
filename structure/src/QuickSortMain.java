public class QuickSortMain{
	public static void quicksort(int a[], int low, int high){
  	int i, j, key, temp;
    
    if(low <high){
    	key = a[low];
      i=low;
      j = high;
      while(i < j){
      while(i<high && a[i] <= key) i++;
      while(j>low && a[j] >= key) j--;
      if(i < j){
      	temp = a[i]; a[i] = a[j]; a[j] = temp;
      }
    }
    
    a[low] = a[j];
    a[j] = key;
    
    quicksort(a, low, j-1);
    quicksort(a, j+1, high);
    }
  }
  
  public static void main(String[] args){
  	int a[] = {15, 7, 2, 20, 33, 17, 26, 5, 21, 30, 27, 29, 11, 10, 3};
    int i, n = a.length;
    
    for(i=0; i<n; i++)System.out.print(a[i]+" ");
    System.out.println(" ");
    quicksort(a, 0, n-1);
    for(i=0; i<n; i++)System.out.print(a[i]+" ");
    }
  }