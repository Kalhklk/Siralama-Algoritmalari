
package sorting.algorithms;


public class SortingAlgorithms {
    public  int StepIS=0; // Insertionsort adım sayısı
    public  int StepSS=0; // Selection Sort adım sayısı
    public  int StepBS=0; // Buuble sort adım sayısı
    public  int StepSheS=0; // Sheel sort adım sayısı
    public  int StepQS=0; //Quick Sort adım sayısı
    public  int StepCS=0; //Count sort adım sayısı
    public int StepMS=0;  //Merge Sort adım sayısı
    public  int dizieleman=0;
    static int[] random(int dizieleman){
        int[] arr=new int[dizieleman];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)(Math.random()*1000);
        }
        return arr;
    }
    public  int[] Insertionsort(int arr[]) {
        int n = arr.length;
        //int Step=0;
       // int[]arr2=new int[arr.length];
       // arr2=arr;
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
            //System.out.println(Step);
        }
        return arr;
    }
    public  int[] selectionSort(int arr[]) {
        int n = arr.length;
        //int Step=0;
       // int[]arr2=new int[arr.length];
       // arr2=arr;
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
                //System.out.println(Step);
            }
        }
        return arr;
    }
    public int[] bubbleSort(int arr[]) {
        int length = arr.length;
        int temp;
        //int Step=0;
       // int[]arr2=new int[arr.length];
        //arr2=arr;
        for (int i = 0; i < length - 1; i++)
            for (int j = 0; j < length - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    StepBS++;
                    //System.out.println(Step);
                }
            }
        return arr;
    }
    public int[] shellSort(int arr[]) {
        int n = arr.length;
        //int Step=0;

        //int[]arr2=new int[arr.length];
        //arr2=arr;
        for (int gap = n/2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i += 1) {
                int temp = arr[i];

                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
                    arr[j] = arr[j - gap];

                arr[j] = temp;
                StepSheS++;
                //System.out.println(Step);
            }
        }
        return arr;
    }
    public int[] quickSort(int[] arr, int low, int high) {
       // int[]arr2=new int[arr.length];
        //arr2=arr;
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
            StepQS++;
        }
        return arr;
    }
    public int[] countSort(int arr[], int n) { //Saymalı Sıralama
        int[] output = new int[n + 1];
       // int[]arr2=new int[arr.length];
       // arr2=arr;

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
        }
        return arr;
    }    
    public int[] Mergesort(int arr[], int l, int r) {

        if (l < r) {
            int m =l+ (r-l)/2;

            Mergesort(arr, l, m);
            Mergesort(arr, m + 1, r);
            

            merge(arr, l, m, r);
            printArray(arr);
            StepMS++;
        }
        return arr;
    }
    

    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
    void merge(int arr[], int l, int m, int r) {

        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];


        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int partition(int[] arr, int low, int high) {
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
    public void Sifirla(){
        StepIS=0; // Insertionsort adım sayısı
        StepSS=0; // Selection Sort adım sayısı
        StepBS=0; // Buuble sort adım sayısı
        StepSheS=0; // Sheel sort adım sayısı
        StepQS=0; //Quick Sort adım sayısı
        StepCS=0; //Count sort adım sayısı
        StepMS=0;  //Merge Sort adım sayısı
        dizieleman=0;
    }


    public static void main(String[] args) {
        SortingAlgorithms s1=new SortingAlgorithms();
        //int[]arr={4,5,1,3,2,8,9,6};
        //int[]arr2=new int[arr.length];
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
        //printArray(arr);
        //System.out.println(StepCS);
        int[] dizi=new int[5];
        dizi=random(5);
        s1.Mergesort(dizi, 0, dizi.length-1);
        printArray(dizi);
        System.out.println(s1.StepMS);
    }
    
}
