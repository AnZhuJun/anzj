package concurrency.forkjoin;

public class QuickSort {
    private static int partition(Long[] numbers,int low,int high){
        long soldier = numbers[low];
        while(low < high){
            while(low < high ){
                if(numbers[high] < soldier){
                    numbers[low] = numbers[high];
                    break;
                }
                high--;

            }
            while(low < high){
                if(numbers[low] > soldier){
                    numbers[high] =numbers[low];
                    break;
                }
                low++;
            }
        }
        numbers[low] = soldier;
        return low;
    }

    public static void qsort(Long[] number,int low,int high){
        if(low<high){
            int soilder = partition(number,low,high);
            qsort(number,low,soilder-1);
            qsort(number,soilder+1,high);
        }
    }
}
