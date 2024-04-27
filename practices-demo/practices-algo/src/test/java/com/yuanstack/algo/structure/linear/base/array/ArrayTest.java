package com.yuanstack.algo.structure.linear.base.array;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ThreadLocalRandom;

/**
 * 数组测试
 *
 * @author: Sylvan
 * @date: 2024-02-26 15:37
 */
public class ArrayTest {
    @Test
    public void init() {
        /* 初始化数组 */
        int[] arr = new int[5];
        int[] nums = {1, 3, 2, 5, 4};
    }

    @Test
    public void randomAccess() {
        int[] nums = {1, 3, 2, 5, 4};
        // 在区间 [0, nums.length) 中随机抽取一个数字
        int randomIndex = ThreadLocalRandom.current().nextInt(0, nums.length);
        // 获取并返回随机元素
        int randomNum = nums[randomIndex];
        System.out.println(randomNum);
    }

    public void insert(int[] nums, int num, int index) {
        // 把索引 index 以及之后的所有元素向后移动一位
        for (int i = nums.length - 1; i > index; i--) {
            nums[i] = nums[i - 1];
        }
        // 将 num 赋给 index 处的元素
        nums[index] = num;
    }
}