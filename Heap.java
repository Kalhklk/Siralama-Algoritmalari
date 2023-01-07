/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorting.algorithms;

public class Heap {
    private int[] data;
    private int size;
    public int StepHS=0;

    public Heap(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    // Heap yapısının boş olup olmadığını kontrol eden metod
    public boolean isEmpty() {
        return size == 0;
    }

    // Heap yapısına veri ekleyen metod
    public void add(int value) {
        // Yeni elemanı heap yapısına ekle
        data[size] = value;
        size++;

        // Elemanı yerinde sıralama
        int currentIndex = size - 1;
        while (currentIndex > 0) {
            int parentIndex = (currentIndex - 1) / 2;
            if (data[currentIndex] < data[parentIndex]) {
                // Elemanları yer değiştir
                int temp = data[currentIndex];
                data[currentIndex] = data[parentIndex];
                data[parentIndex] = temp;
                currentIndex = parentIndex;
            } else {
                break;
            }
        }
    }

    // Heap yapısındaki en küçük elemanı alan metod
    public int poll() {
        int result = data[0];
        data[0] = data[size - 1];
        size--;

        // Elemanı yerinde sıralama
        int currentIndex = 0;
        while (currentIndex < size) {
            int leftChildIndex = 2 * currentIndex + 1;
            int rightChildIndex = 2 * currentIndex + 2;
            if (leftChildIndex >= size) {
                break;
            }
            int minIndex = leftChildIndex;
            if (rightChildIndex < size && data[rightChildIndex] < data[leftChildIndex]) {
                minIndex = rightChildIndex;
            }
            if (data[currentIndex] > data[minIndex]) {
                // Elemanları yer değiştir
                int temp = data[currentIndex];
                data[currentIndex] = data[minIndex];
                data[minIndex] = temp;
                currentIndex = minIndex;
            } else {
                break;
            }
        }
        return result;
    }
    public int[] HeapSort(int[] arr){
        Heap h1=new Heap(arr.length);
        for (int i = 0; i < arr.length; i++) {
            h1.add(arr[i]);
        }
        int[]arr2=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i]=h1.poll();
            StepHS++;
        }
        return arr2; 
    }

    public static void main(String[] args) {
        Heap h1=new Heap(15);
        
        int[]dizi={5,1,8,4,14,41,2,3};
        int[]dizi2=new int[15];
        //dizi2=HeapSort(dizi);
        //for (int i = 0; i < dizi.length; i++) {
        //    System.out.println(dizi2[i]);
        //}
        
    }
    
}
