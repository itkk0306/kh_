class Matrix2{
    int array[][];
    int i;
    int j;

    int getMatrix(int i, int j) {
        int res = 0;
        res += array[i][j];
        return res;
    }
}

public class DoubleArray {
    /*
      이중 배열 (데이터 타입이 일치해야함)
        1. 수학에서는 행렬 연산을 풀 경우에 사용함
        2. 연립 방정식도 가우스 - 조르단 소거법(행렬)을 통해 계산 가능
        3. 로봇에 관심이 많다면 필수!
        4. 재고 관리 프로그램
        ex ) 아마존 Go, 공사판 재고 관리

        정적(Stack)은 컴파일 타임에 일어남 - 얘가 더 빠름
        동적은 런타임에 돌아감 - CPU가 연산을 할 때 개입을 함
        new 를 쓰는 건
        Heap을 쓰는 Case
        1. 회원가입
 */
    public static void main(String[] args) {
        // 1. 행렬 타입
        int matrix [][];
        matrix = new int[3][3];

        System.out.println("res = ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                matrix[i][j] = i * 3 + j + 1;
                System.out.print(matrix[i][j]+ " ");

            }System.out.println();
         //   System.out.println(matrix[i][0] + " " + matrix[i][1] + " " + matrix[i][2]);
        }

        // 비어져 있는 열은 가변적이라는 말임
        int tri[][] = new int[3][];
        tri[0] = new int[3];
        tri[1] = new int[2];
        tri[2] = new int[1];

        int idx = 3;

        System.out.println("res = ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < idx; j++){
                tri[i][j] = i * 3 + j + 1;
                //printf -> format = 서식
                // %d 는 숫자, %f 는 소수점

                System.out.printf("%d " , tri[i][j]);
            }
            idx --;
            System.out.println();
        }
        /*
        문제 6. class 를 활용하여 2 by 2 행렬의 덧셈을 구현하시오
         */




    }
}
