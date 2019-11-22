package com.algorithm.study;

import java.util.ArrayList;
import java.util.List;

public class RecursiveSum {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        System.out.println(sum(list));
    }

    /**
     * 递归进行list求和
     *
     * @param list 需要求和的list
     * @return
     */
    private static int sum(List<Integer> list) {
        return sum(list, 0);
    }

    /**
     * 取出一项与初始值相加，然后移除，剩余的list进行递归调用继续求和
     * 基线条件：数组长度为0
     * 递归条件：求和
     *
     * @param list
     * @param sum
     * @return
     */
    private static int sum(List<Integer> list, int sum) {
        if (list.size() == 0) {
            return sum;
        } else {
            Integer zero = list.get(0);
            list.remove(0);
            sum = zero + sum;
            return sum(list, sum);
        }
    }
}
