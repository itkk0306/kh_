package Homework;
/* 문제 16. Bank 클래스를 작성하시오.*/

import java.util.Random;
import java.util.Scanner;

class Bank{
    int money;
    Scanner in;
    Random rand;
    float interRate;

    public Bank(){
        in = new Scanner(System.in);
        rand = new Random();
    }
    public void deposit(){
        System.out.println("입금할 금액을 입력하세요 ~ ");
        money = in.nextInt();
    }

    public void setInterRate(){
        interRate = (float)(rand.nextInt(301) + 100 )/100.0f;
    }
    public void applyInterRate(){
        money = (int)(money * (1.0f + interRate / 100.0f)); //이자율 통해서 갱신
    }

    @Override
    public String toString() {
        return "현재 금액 = " + money +
                ", 이자율 = " + interRate;
    }
}
public class Prob16 {
    public static void main(String[] args) {
        Bank acc = new Bank();
        acc.deposit();
        acc.setInterRate();
        System.out.println(acc);

        acc.setInterRate();
        acc.applyInterRate();
        System.out.println(acc);
    }
}
