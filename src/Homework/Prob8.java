package Homework;
/* 문제 8. 정수형 변수 2개,
           4 byte 형 소수점 변수 1 개,
           8 byte 형 소수점 변수 1 개를 만들고 출력하시오.

   문제 9. 8 번 문제를 키보드 입력으로 처리해주세요 ~

   문제 10. 랜덤 숫자를 만드시오.

   문제 11. 랜덤 숫자 2 개를 작성하고
            이들간의 and, or, xor, not 을 계산하시오.

   문제 12. 랜덤 숫자를 만들고
            랜덤한 쉬프트 연산을 해보세요 ~

   문제 13. 2, 4, 6, 8, 10, ... , 120 ...
            100 번째까지 더한 숫자를 출력하시오.

   문제 14. 랜덤한 숫자를 2 개 입력받고 대소 비교를 하세요 ~

   문제 15. 2 by 2 행렬의 뺄셈을 작성하세요 ~

   문제 16. Bank 클래스를 작성하시오.

   문제 17. 성적 관리 프로그램을 만들어보세요 ~

   문제 18. abstract 클래스와 interface 의 차이점을 기술해보세요 ~

   1. 계수를 뽑아 행렬로 만든다.
   2. 상삼각형 형태를 만들어야한다.
   3. 첫번째행 첫번째 열의 원소를 1로 만든다. (전체를 나눈다)
   4. 나머지행의 첫번째 원소를 0으로 만든다.
   5. 두번째 행의 두 번째 원소를 1로 만든다. (절차는 3번과 동일)
   6. 세번째 행의 두번째 원소를 0으로 만든다.
   7. x, z, y 순으로 정리한다.
 */
class variable{
    float a;
    double b;

    public variable(float a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "variable  " +
                "a= " + a +
                ", b= " + b;
    }
}
public class Prob8 {
    public static void main(String[] args) {
        variable v = new variable((float)1.3,234.345346256);
        System.out.println(v);
    }
}