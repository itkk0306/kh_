package Homework;

import java.util.Random;

/*랜덤 숫자를 만드시오*/
class RandNum {
    int random;
    Random rand;

    public RandNum() {
        rand = new Random();
    }

    public void initNumber() {
        random = rand.nextInt(6) + 1;
    }

    @Override
    public String toString() {
        return "RandNum = " + random;
    }

    /* 11 번 문제를 위해 추가한 부분 */
    public int calcAnd(RandNum rn) {
        return random & rn.random;
    }

    public int calcOr(RandNum rn) {
        return random | rn.random;
    }

    public int calcXor(RandNum rn) {
        return random ^ rn.random;
    }

    public int calcNot() {
        return ~random;
    }

    public int randShift() {
        //true - 왼쪽, false - 오른쪽
        Boolean leftRight = true;
        // 우리가 작성한 random 을 shift 로 쓰고
        // 숫자는 새로운 random 을 받도록 한다.
        int newRand;
        Random r = new Random();
        newRand = r.nextInt(65) + 64;  //64 ~ 128
        System.out.println("newRand = " + newRand);

        if (r.nextInt(2) == 1) {
            leftRight = true;
            System.out.println("left");
        } else {
            leftRight = false;
            System.out.println("right");
        }

        if(leftRight){
           return newRand << random;
        } else {
            return newRand >> random;
        }
    }

    public void compareNum(RandNum rn){
        if(random > rn.randShift()){

        }
    }
}
public class Prob10 {
    public static void main(String[] args) {
        RandNum rn = new RandNum();

        for(int i = 0; i < 6; i++){
            rn.initNumber();
            System.out.println(rn);
        }

    }
}

