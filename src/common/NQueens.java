package common;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
    /**
     * ���̴�С
     */
    public static final int n = input.SIZE;

    /**
     * �洢�ʺ�λ��
     * ����Ϊ��
     * ��board[3]=4��ʾ�����е������лʺ�������0��ʼ��
     */
    int[] board = new int[input.SIZE];

    /**
     * �洢���н�
     */
    List<int[]> solutions = new ArrayList<>();
}
