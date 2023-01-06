public class SortingAlgo {
	    
    public int StepIS=0; // Insertionsort adım sayısı
    public int StepSS=0; // Selection Sort adım sayısı
    public int StepBS=0; // Buuble sort adım sayısı
    public int StepSheS=0; // Sheel sort adım sayısı
    public int StepQS=0; //Quick Sort adım sayısı
    public int StepCS=0; //Count sort adım sayısı    
	public static String step ="";
	
	   public int [] Insertionsort(int arr[]) {
	        int n = arr.length;
	        
	        
	        for (int i = 1; i < n; ++i) {
	            int key = arr[i];
	            int j = i - 1;
	            while (j >= 0 && arr[j] > key) {
	                arr[j + 1] = arr[j];
	                j = j - 1;

	            }
	            arr[j + 1] = key;
	            printArray(arr);
	            StepIS++;
	            System.out.println("Inter: " +StepIS);
	        }
			return arr;
	    }
	
	   public  int [] selectionSort(int arr[]) {
	        int n = arr.length;
	        for(int i = 0; i < n -1; i ++) {
	            int index_min = i;
	            for (int j = i; j < n; j++) {
	                if(arr[j] < arr[index_min]) {
	                index_min = j;
	                }
	            }
	            if(index_min != i) {
	                int temp = arr[i];
	                arr[i] = arr[index_min];
	                arr[index_min] = temp;
	                printArray(arr);
	                StepSS++;
	            }
	        }
			return arr;
	    }
	  
	   public  int[] bubbleSort(int arr[]) {
	        int length = arr.length;
	        int temp;

	        for (int i = 0; i < length - 1; i++)
	            for (int j = 0; j < length - i - 1; j++) {
	                if(arr[j] > arr[j + 1]) {
	                    temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                    StepBS++;
	                    printArray(arr);
	                }
	            }
            System.out.println("Buuble: " + StepBS);
	      //  printArray(arr); // Son halini ekrana yazdırmak için

	        return arr;
	    }
	  
	   
	   public int[] shellSort(int array[], int n) {
		   
		   	for (int interval = n / 2; interval > 0; interval /= 2) {
		     for (int i = interval; i < n; i += 1) {
		    	 int temp = array[i];
		    	 int j;
		    	 	for (j = i; j >= interval && array[j - interval] > temp; j -= interval) {
		    	 		array[j] = array[j - interval];
		    	 		 StepSheS++;
		                 printArray(array);

		    	 		 
		    	 }
		    	 array[j] = temp;
		     }
		   }
		 /*  for(int i=0;i<array.length;i++) {
			   System.out.println(array[i]);
		   }	*/
		   
		   return array;
		}


	   public  int [] quickSort(int[] arr, int low, int high) {

	        if (low < high) {
	            int pi = partition(arr, low, high);
	            quickSort(arr, low, pi - 1);
	            quickSort(arr, pi + 1, high);
                printArray(arr);
	            StepQS++;
	        }
			return arr;
	    }
	
	   public  int [] countSort(int arr[], int n) { //Saymalı Sıralama
	        int[] output = new int[n + 1];


	        int max = arr[0];
	        for (int i = 1; i < n; i++) {
	            if (arr[i] > max)
	                max = arr[i];
	        }
	        int[] count = new int[max + 1];

	        for (int i = 0; i < max; ++i) {
	            count[i] = 0;
	        }

	        for (int i = 0; i < n; i++) {
	            count[arr[i]]++;
	        }

	        for (int i = 1; i <= max; i++) {
	            count[i] += count[i - 1];
	        }

	        for (int i = n - 1; i >= 0; i--) {
	            output[count[arr[i]] - 1] = arr[i];
	            count[arr[i]]--;
	        }

	        for (int i = 0; i < n; i++) {
	            arr[i] = output[i];
	            StepCS++;
                printArray(arr);


	        }
            System.out.println("Quick: " +StepCS);

			return arr;
	    }    
	    
	   public void sifirla() {
		    StepIS=0; // Insertionsort adım sayısı
		    StepSS=0; // Selection Sort adım sayısı
		    StepBS=0; // Buuble sort adım sayısı
		    StepSheS=0; // Sheel sort adım sayısı
		    StepQS=0; //Quick Sort adım sayısı
		    StepCS=0; //Count sort adım sayısı    
	   }
	   
	   public static String printArray(int arr[]) {
		   
		   String satir = "";
	        int n = arr.length;
	        for (int i = 0; i < n; ++i) {
	          //  System.out.print(arr[i] + " ");
	        	satir += arr[i] + " ";
	        }
	        step += satir + "\n";
	       // System.out.println();
	        System.out.println("Steptir bu : " +step);
	        
	        return step;
	    }
	   
	    
	   public static void swap(int[] arr, int i, int j) {
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }
	  
	   public static int partition(int[] arr, int low, int high) {
	        int pivot = arr[high];
	        int i = (low - 1);
	        //printArray(arr, arr.length);
	        for(int j = low; j <= high - 1; j++) {
	            if (arr[j] < pivot) {
	                i++;
	                swap(arr, i, j);
	            }
	        }
	        swap(arr, i + 1, high);
	        return (i + 1);
	    }    

	   public static int [] random(int dizieleman) {
	    	int randomArry[] = new int [dizieleman];

	        for(int i =0; i< randomArry.length;i++ ) {
	        	randomArry[i] = (int)(Math.random()*1000);
	        }
	    	
	    	return randomArry;
	    }
	   
	/*    public static void main(String[] args) {
	    	
	    	SortingGUI gui = new SortingGUI();
	    	
	    	int dizieleman = gui.dizieleman2;
	    	
	   	int arr [] = new int [dizieleman];
	      //  int[]arr={4,5,1,3,2,8,9,6};
	    	
	    	
	        int[]arr2=new int[dizieleman];
	        
	        arr2 = random(dizieleman);
	        
	        
	        
	        //Insertionsort(arr);
	        //selectionSort(arr);
	        //arr2=bubbleSort(arr);
	        //printArray(arr2);
	        //shellSort(arr);
	        //printArray(arr);
	        //System.out.println(StepSheS);
	        //quickSort(arr, 0, arr.length-1);
	        //printArray(arr);
	        //System.out.println(StepQS);
	        //countSort(arr, arr.length);
	        
	        
	        printArray(arr2); // Son halini ekrana yazdırmak için
	     //   System.out.println(StepIS);
}
*/
	    
}
