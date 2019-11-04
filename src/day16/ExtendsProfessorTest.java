package day16;

class Professor2 extends Student{
    boolean ph;

    public Professor2(String n, int a, String major, boolean ph) {
        super(n, a, major);
        this.ph = ph;
    }

    public String toString() {
        String tmp;

        if(ph) {
            tmp = "박사 학위 보유";
        } else {
            tmp = "박사 학위 미보유";
        }
        return "이름 = " + name +
                ", 전공 = " + major +
                ", 나이 = " + age +
                ", 학위 여부 = " + ph;
    }
}
public class ExtendsProfessorTest {
    public static void main(String[] args) {
        Professor2 p2 = new Professor2("마승찬", 47, "컴퓨터 과학", true);
        System.out.println(p2);
    }
}
