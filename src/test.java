import CallAndReturnPattern.CallAndReturnPattern;
import PipelineAndFilterPattern.PipelineAndFilterPattern;

public class test {
    public static void main(String[] args) {
        PipelineAndFilterPattern pipelineAndFilterPattern = new PipelineAndFilterPattern();
        System.out.println(pipelineAndFilterPattern.totalNQueens());
        CallAndReturnPattern callAndReturnPattern = new CallAndReturnPattern();
        System.out.println(callAndReturnPattern.totalNQueens());
    }
}
