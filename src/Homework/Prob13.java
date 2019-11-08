package Homework;

import java.util.Arrays;

/*
   문제 13. 2, 4, 6, 8, 10, ... , 120 ...
            100 번째까지 더한 숫자를 출력하시오.
 */
class ArithSequence {
    int series[];
    int first;
    int num;


    public ArithSequence(int first, int num){
        series = new int[num];
        series[0] = first;

        this.num = num;
        this.first = first;
    }

    public void calcArithSeq(){
        for(int i = 1; i < num; i++){
            series[i] = series[i-1] + 2;
        }
    }
    @Override
    public String toString() {
        return "series[" + (num-1) + "] = " + series[num-1] ;
    }
}
public class Prob13 {
    public static void main(String[] args) {
        ArithSequence as = new ArithSequence(2, 100);
        as.calcArithSeq();
        System.out.println(as);

    }
}
