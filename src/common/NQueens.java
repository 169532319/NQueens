package common;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
    /**
     * 棋盘大小
     */
    public static final int n = input.SIZE;

    /**
     * 存储皇后位置
     * 索引为行
     * 如board[3]=4表示第四行第五列有皇后（索引从0开始）
     */
    public int[] board = new int[input.SIZE];

    /**
     * 存储解的数量
     */
    public static int count = 0;
}
