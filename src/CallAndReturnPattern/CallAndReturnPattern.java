package CallAndReturnPattern;

import common.NQueens;

/**
 * 调用返回风格
 */
public class CallAndReturnPattern extends NQueens {
    //用32位整数表示棋盘大小
    private int size;

    public int totalNQueens() {
        // 初始化棋盘大小，使用位运算表示棋盘状态
        size = (1 << n) - 1;
        // 初始化行、列和对角线的状态
        solve(0, 0, 0);
        return count;
    }

    private void solve(int row, int na, int pie) {
        // 如果当前行数等于棋盘大小，说明找到了一个解决方案
        if (row == size) {
            count++; // 增加解决方案计数
            return;
        }
        // 计算当前行可以放置皇后的位置
        int pos = size & (~(row | na | pie)); // 使用位运算排除已经放置皇后的行、列和对角线
        while (pos != 0) {
            // 找到第一个可以放置皇后的位置
            int p = pos & (-pos);
            pos -= p; // 移除这个位置，继续查找下一个
            // 递归调用solve方法，放置皇后并更新行、列和对角线的状态
            solve(row | p, (na | p) << 1, (pie | p) >> 1);
        }
    }

}
