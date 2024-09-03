package PipelineAndFilterPattern.Filter;
/**
 *   board数组存储的是皇后位置
 *   索引为行
 *   如board[3]=4表示第四行第五列有皇后（索引从0开始）
 */
public interface Filter {
    boolean judge(int[] board);
}