package CallAndReturnPattern;

import common.NQueens;

/**
 * ���÷��ط��
 */
public class CallAndReturnPattern extends NQueens {
    //��32λ������ʾ���̴�С
    private int size;

    public int totalNQueens() {
        // ��ʼ�����̴�С��ʹ��λ�����ʾ����״̬
        size = (1 << n) - 1;
        // ��ʼ���С��кͶԽ��ߵ�״̬
        solve(0, 0, 0);
        return count;
    }

    private void solve(int row, int na, int pie) {
        // �����ǰ�����������̴�С��˵���ҵ���һ���������
        if (row == size) {
            count++; // ���ӽ����������
            return;
        }
        // ���㵱ǰ�п��Է��ûʺ��λ��
        int pos = size & (~(row | na | pie)); // ʹ��λ�����ų��Ѿ����ûʺ���С��кͶԽ���
        while (pos != 0) {
            // �ҵ���һ�����Է��ûʺ��λ��
            int p = pos & (-pos);
            pos -= p; // �Ƴ����λ�ã�����������һ��
            // �ݹ����solve���������ûʺ󲢸����С��кͶԽ��ߵ�״̬
            solve(row | p, (na | p) << 1, (pie | p) >> 1);
        }
    }

}
