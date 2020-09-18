package com.algorithm;

/**
 * 冒泡排序
 */
public class Bubble {
    public void sort(Comparable[] arr)
    {
        for (int len = arr.length - 1; len > 0; len--){
            for (int n = 0; n < len; n++){
                //交换数组的值
                if(greater(arr[n], arr[n+1])) exch(arr, n, n+1);
            }
        }
    }

    /**
     * 比较两个参数的大小
     * @param first
     * @param second
     * @return
     */
    private boolean greater(Comparable first, Comparable second)
    {
        return first.compareTo(second) > 0;
    }


    /**
     * 数组中两个索引的值互换
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
