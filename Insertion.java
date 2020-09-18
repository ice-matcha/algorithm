package com.algorithm;

/**
 * 插入排序
 */
public class Insertion {
    public void  sort(Comparable[] arr)
    {
        for (int i = 1; i < arr.length; i++){
            for (int j = i; j > 0; j--){
                if(!greater(arr[j-1], arr[j])) break;
                exch(arr, j-1, j);
            }
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
