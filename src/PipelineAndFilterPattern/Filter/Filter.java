package PipelineAndFilterPattern.Filter;
/**
 *   board����洢���ǻʺ�λ��
 *   ����Ϊ��
 *   ��board[3]=4��ʾ�����е������лʺ�������0��ʼ��
 */
public interface Filter {
    boolean judge(int[] board);
}