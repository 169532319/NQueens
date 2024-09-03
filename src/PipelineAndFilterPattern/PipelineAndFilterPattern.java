package PipelineAndFilterPattern;

import PipelineAndFilterPattern.Filter.impl.AntiDiagonalFilter;
import PipelineAndFilterPattern.Filter.impl.ColumnFilter;
import PipelineAndFilterPattern.Filter.impl.MainDiagonalFilter;
import common.NQueens;
import common.input;

import java.util.ArrayList;
import java.util.List;

/**
 * �ܵ����������
 */
public class PipelineAndFilterPattern extends NQueens {
    /**
     * ����ʹ��һά����洢����
     * �ʲ���Ҫ�й�����
     */
    public List<int[]> generateBoards(int n, int index, int[] array) {
        List<int[]> numbers = new ArrayList<>();
        if (index == n) {
            // ������λ�ö�����ֵ��������鵽�б���
            numbers.add(array.clone());
        } else {
            // ����ÿ�����ܵ�ֵ
            for (int i = 0; i < n; i++) {
                array[index] = i;
                numbers.addAll(generateBoards(n, index + 1, array));
            }
        }
        return numbers;
    }

    /**
     * ���������������п��ܵ�����Ȼ�����
     * ��˵������ģ���ڵ���9ʱ�ͻᱬ�ڴ�
     */
    public int totalNQueens() {
        List<int[]> boards = generateBoards(n, 0, new int[n]);
        ColumnFilter columnFilter = new ColumnFilter();
        MainDiagonalFilter mainDiagonalFilter = new MainDiagonalFilter();
        AntiDiagonalFilter antiDiagonalFilter = new AntiDiagonalFilter();
        for(int[] unfilteredBoard : boards){
            //�������ξ������������������ж����
            if(!columnFilter.judge(unfilteredBoard))
              continue;
            if(!mainDiagonalFilter.judge(unfilteredBoard))
                continue;
            if(!antiDiagonalFilter.judge(unfilteredBoard))
                continue;
            count++;
        }
        return count;
    }
}