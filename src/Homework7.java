import java.util.Random;
import java.util.Scanner;

class AlignTest{
    final int RANGE = 1024;
    int arr[];
    Random rand;

    void initArr(){
        arr = new int[7];
        rand = new Random();

        for(int i = 0; i < 7; i++){
            arr[i] = rand.nextInt(7777)+1; //0이 안 나오게 하려고 1 더하는 것
        }
    }

    void alignArr(){
        for(int i = 0; i<7; i++){
            // arr[i] &= ~(RANGE - 1);
            // 1024 단위로 만든 다음에 정렬  값을 갱신해서 배열에 다시 넣는 과정
            arr[i] = arr[i] & ~(RANGE - 1);
          /*  &는 양쪽 다 1일때만 1
            ex) 10000 - 1 = 1111 0이 보장됨
             0들이 보장이 되면 0 앞자리 자리 애로 배수가 결정됨!!!
            ex) 10000 -> 16의 배수!!!!! */
        }
    }

    void printArr(){
        for(int i = 0; i < 7; i++){
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }
        System.out.println();
    }
}

public class Homework7 {
    /* 숙제 7-3. 랜덤 숫자를 입력 받아서 1024 단위로 정렬하도록 프로그램 하시오. */
    public static void main(String[] args) {
        AlignTest at = new AlignTest();
        at.initArr();
        at.printArr();
        at.alignArr();
        at.printArr();
    }
}

