import javax.swing.text.AbstractDocument;
import java.util.Random;

// new 는 Heap에다 메모리를 넣어주는 키워드
// 메모리에 할당이 완료된 상태가 객체 메모리에 할당을 하려면? -> new

        /*
        문제 6. class 를 활용하여 2 by 2 행렬의 덧셈을 구현하시오
         */

class Matrix{
    int A[][];
    int B[][];
    int res[][];
    Random rand;

    //void 는 리턴 값메서드
    void initArr(){
        A = new int[2][2]; //new를 통해서 2X2 배열을 만들어줌
        B = new int[2][2];
        res = new int[2][2];
        rand = new Random(); //랜덤 클래스를 객체화 시킨 것이 rand

        //Loop 를 돌면서 각각의 이중 배열에 난수 설정
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                A[i][j] = rand.nextInt(5) + 1;
                B[i][j] = rand.nextInt(5) + 1;
            }
        }

    }

    void addMatrix(){
        for(int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
               res[i][j] = A[i][j] + B[i][j];
            }
        }
    }

    //매트릭스 간의 덧셈
    void addBetMat(Matrix src) {
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                res[i][j] = A[i][j] + src.A[i][j]; //B 행렬의 있는 A[i][j]를 가져와라
            }
        }
    }
    //출력
    void printArr(){
        System.out.println("res = ");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.printf("%d ", res[i][j]);
            }
            System.out.println();
        }

        System.out.println("A = ");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.printf("%d ", A[i][j]);
            }
            System.out.println();
        }

        System.out.println("B = ");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.printf("%d ", B[i][j]);
            }
            System.out.println();
        }
    }
}

public class TwoByTwo {
    public static void main(String[] args) {
        Matrix A = new Matrix();
        A.initArr();
        A.addMatrix();
        A.printArr();
        System.out.println();

        Matrix B = new Matrix();
        B.initArr();
        B.printArr();
        System.out.println();

        A.addBetMat(B);
        A.printArr();

        //2x2 행렬을 여러개 만들어야할 때 (7개)
        Matrix multiMat[];
        multiMat = new Matrix[7];



        for(int i = 0; i < 7; i++)
            multiMat[i] = new Matrix();
        }

    }
