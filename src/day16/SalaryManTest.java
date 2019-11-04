package day16;

class Salaryman extends Student{
    int salary;

    public Salaryman(String n, int a, String m, int s) {
        super(n, a, m);
        this.salary = s;
    }

    @Override
    public String toString() {
        return "이름 = " + name +
                ", 전공 = " + major +
                ", 나이 = " + age +
                ", 연봉 = " + salary;
    }
}
public class SalaryManTest {
    public static void main(String[] args) {
        Salaryman s = new Salaryman("박건이", 24, "기계공학과", 87000000);
        System.out.println(s);
    }
}
