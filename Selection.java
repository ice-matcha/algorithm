package com.algorithm;

/**
 * 选择排序
 */
public class Selection {
    public void  sort(Comparable[] arr)
    {
        for (int i=0; i < arr.length-1; i++){
            int minIndex = i;
            for (int j=i+1; j < arr.length; j++){
                //比较，如果minIndex的值比j的值大，更新minIndex
                if( greater(arr[minIndex], arr[j]) ) minIndex = j;
            }

            //交换
            exch(arr, i, minIndex);
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
