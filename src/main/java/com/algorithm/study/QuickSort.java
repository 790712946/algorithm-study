package com.algorithm.study;

/**
 * 数组 快速排序
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] a = {1, 4, 3, 2, 7};
        quickSort(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    private static void quickSort(int[] array, int left, int right) {
        //基线条件：如果左边的下标大于右边的数组下标，排序完成
        if (left > right) {
            return;
        }
        // 取右边数组索引所在的值为基准值，递归条件
        int pivot = array[left];
        int i = left;
        int j = right;
        while (i != j) {
            // 顺序很重要，先从右边开始往左找，直到找到比base值小的数
            while (array[j] >= pivot && i < j) {
                j--;
            }
            // 再从左往右边找，直到找到比base值大的数
            while (array[i] <= pivot && i < j) {
                i++;
            }
            // 上面的循环结束表示找到了位置或者(i>=j)了，交换两个数在数组中的位置
            if (i < j) {
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
            }
        }
        // 将基准数放到中间的位置（基准数归位）
        array[left] = array[i];
        array[i] = pivot;
        // 递归，继续向基准的左右两边执行和上面同样的操作
        // i的索引处为上面已确定好的基准值的位置，无需再处理
        quickSort(array, left, i - 1);
        quickSort(array, i + 1, right);

    }
}
