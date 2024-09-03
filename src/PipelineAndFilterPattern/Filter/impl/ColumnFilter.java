package PipelineAndFilterPattern.Filter.impl;

import PipelineAndFilterPattern.Filter.Filter;

import java.util.Arrays;

/**
 * 列过滤器
 * 本质上是判断数组有没有重复元素
 */
public class ColumnFilter implements Filter {
    public boolean judge(int[] board) {
        int[] copy = board.clone();
        Arrays.sort(copy);
        for (int i = 1; i < copy.length; i++) {
            if (copy[i] == copy[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
