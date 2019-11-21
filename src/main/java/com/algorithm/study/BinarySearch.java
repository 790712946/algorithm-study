package com.algorithm.study;


public class BinarySearch {

    public static void main(String[] args) {
        Integer[] list = {1, 3, 5, 7, 9};
        System.out.println(getElementIndex(list, 3));
        System.out.println(getElementIndex(list, -1));
    }

    private static Integer getElementIndex(Integer[] list, Integer element) {
        // low和high用于跟踪要在其中查找的列表部分
        int low = 0;
        int high = list.length;
        //只要范围没有缩小到只包含一个元素，
        while (low <= high) {
            // 就检查中间的元素
            int mid = (low + high) / 2;
            Integer guess = list[mid];
            // 找到了元素
            if (guess.equals(element)) {
                return mid;
                // 猜的数字大了
            } else if (guess > element) {
                high = mid - 1;
                // 猜的数字小了
            } else {
                low = mid + 1;
            }
        }
        return null;
    }
}
