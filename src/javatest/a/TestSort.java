package javatest.a;

public class TestSort {
    public static void insertSort(int[] a){
        if(a==null || a.length == 0)
            return;
        for(int i=1;i<a.length;i++)
        {
            int temp = a[i];
            int j = i;

            if(a[i-1]>temp){
               while(j >= 1 && a[j-1] > temp){
                   a[j] = a[j-1];
                   j--;
               }
            }
            a[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {5,6,2,3,4,1,9};

        insertSort(array);
        for(int index:array)
            System.out.println(index);
    }

}
