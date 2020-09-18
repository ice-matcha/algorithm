package com.algorithm;

/**
 * 希尔排序
 */
public class Shell {
    public void  sort(Comparable[] arr)
    {
        //根据数组的长度，确定h的初始值
        int h = 1;
        while (h < arr.length / 2){
            h = 2 * h + 1;
        }

        while(h >= 1){

            for (int i = h; i < arr.length; i++){
                for (int j = i; j >= h; j -= h){
                    if(!greater(arr[j-h], arr[j])) break;
                    exch(arr, j-h, j);
                }
            }

            h = h / 2;
        }
    }

    /**
     * 比较大小
     * @param first
     * @param second
     * @return
     */
    private boolean greater(Comparable first, Comparable second)
    {
        return first.compareTo(second) > 0;
    }

    /**
     * 交换
     * @param arr
     * @param first
     * @param second
     */
    private void exch(Comparable[] arr, int first, int second)
    {
        Comparable tmp = arr[first];
        arr[first] = arr[second];
        arr[second] = tmp;
    }
}
