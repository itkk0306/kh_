package Homework;

public class Prob12 {
    public static void main(String[] args) {
        RandNum rn = new RandNum();
        rn.initNumber();
        System.out.println(rn);
        System.out.println("random shift = " + rn.randShift());

    }
}
