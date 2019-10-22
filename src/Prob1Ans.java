public class Prob1Ans {
    /*
        문제. while 문을 사용해서
        1 ~ 100 까지 숫자중 3 의 배수를 추출하시오.
        (for 문 사용 금지)
    */
    public static void main(String[] args) {

         int i = 1;
         /*
            for(i = 1; i < 101; i++)
            while(i++ < 101)
          */
        while(i<=100) {
            if (i % 3 == 0) {
                System.out.println("i = " + i);
            }
            i++;
        }
    }
}
