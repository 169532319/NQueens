package PipelineAndFilterPattern;

import PipelineAndFilterPattern.Filter.impl.AntiDiagonalFilter;
import PipelineAndFilterPattern.Filter.impl.ColumnFilter;
import PipelineAndFilterPattern.Filter.impl.MainDiagonalFilter;
import common.NQueens;
import common.input;

import java.util.ArrayList;
import java.util.List;

/**
 * 管道过滤器风格
 */
public class PipelineAndFilterPattern extends NQueens {
    /**
     * 由于使用一维数组存储棋盘
     * 故不需要行过滤器
     */
    public List<int[]> generateBoards(int n, int index, int[] array) {
        List<int[]> numbers = new ArrayList<>();
        if (index == n) {
            // 当所有位置都被赋值后，添加数组到列表中
            numbers.add(array.clone());
        } else {
            // 迭代每个可能的值
            for (int i = 0; i < n; i++) {
                array[index] = i;
                numbers.addAll(generateBoards(n, index + 1, array));
            }
        }
        return numbers;
    }

    /**
     * 由于是先生成所有可能的棋盘然后过滤
     * 因此当输入规模大于等于9时就会爆内存
     */
    public int totalNQueens() {
        List<int[]> boards = generateBoards(n, 0, new int[n]);
        ColumnFilter columnFilter = new ColumnFilter();
        MainDiagonalFilter mainDiagonalFilter = new MainDiagonalFilter();
        AntiDiagonalFilter antiDiagonalFilter = new AntiDiagonalFilter();
        for(int[] unfilteredBoard : boards){
            //必须依次经过三个过滤器才能判断完毕
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