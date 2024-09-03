package PipelineAndFilterPattern.Filter.impl;

import PipelineAndFilterPattern.Filter.Filter;

import java.util.HashMap;

/**
 * ���Խ��߹�����
 * �������ǿ�row+col��û����ͬ��
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