package PipelineAndFilterPattern.Filter.impl;

import PipelineAndFilterPattern.Filter.Filter;

import java.util.HashMap;

/**
 * 反对角线过滤器
 * 本质上是看row+col有没有相同的
 */
public class AntiDiagonalFilter implements Filter {
    public boolean judge(int[] board) {
        HashMap<Integer, Boolean> temp= new HashMap<Integer, Boolean>();
        for (int i = 0; i < board.length; i++) {
            if (temp.get(i+board[i])==null)
                temp.put(i+board[i], true);
            else
                return false;
        }
        return true;
    }
}