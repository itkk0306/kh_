package day16;

/*
       상속이란?
       # 재산 상속(물건, 재화)
       Java 상속은 물건을 상속 받는다고 생각하면 된다.
       (클래스에 있는 변수와 메서드를 자신의 것 마냥 활용할 수 있다.)

       학생은 사람이라는 범주에 포함됨

       class Professor - 이름, 나이, 전공, 박사학위 여부
       class Student - 이름, 나이, 전공
       class Person - 이름, 나이
       class Autimotive - 속도, 색상

       이와 같이 중복되는 것들을 공통적인 것으로 묶어서 관리하기 위해 상속 개념이 만들어짐
 */
/*
class Student{
    String name;
    String major;
    int age;

    public Student(String n, String m, int a){
        name = n;
        major = m;
        age = a;
    }
    public String toString() {
        return "이름 = " + name + "전공 = " + major + ", 나이 = " + age;
    }
}
*/

import org.w3c.dom.ls.LSOutput;

class Person{
    String name;
    int age;
    //생성자 변수들에 값을 각 배치
    public Person(String n, int a){
        System.out.println("Person 생성자");
        name = n;
        age = a;
    }
    public String toString() {
        return "이름 = " + name + ", 나이 = " + age;
    }
}

/* 상속 없이 구현한 Police 클래스
class Police {
    String name;
    String grade;
    int age;

    public Police(String n, String g, int a){
        name = n;
        grae = g;
        age = a;
      }

 */
//extends 가 상속을 하겠다는 의미

class Police extends Person{
    String grade;

    public Police(String n, int a, String grade){
        super(n,a);
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "이름 =" + name +
                ", 나이 =" + age +
                ", 직급 =" + grade;
    }
}
/*class Professor extends Person{
    String major;
    boolean hak;

    public Professor(String n, int a, String major, boolean hak) {
        super(n, a);
        this.major = major;
        this.hak = hak;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "이름 = " + name +
                ", 나이 = " + age +
                ", 전공 = " + major +
                ", 학위 여부 = " + hak;
    }
}
*/

/*
class Salaryman extends Person{
    int salary;

    public Salaryman(String n, int a, int s) {
        super(n, a);
        this.salary = s;
    }

    @Override
    public String toString() {
        return "직장인" +
                "이름 ='" + name +
                ", 나이 =" + age +
                ", 월급 =" + salary;
    }
}
*/

class Student extends Person{
    String major;

    public Student(String n, int a, String major) {
        /* super 는 나의 부모 클래스(생성자)를 호출한다.
        여기서 주의할 것은 super 보다 먼저 실행할 수 있는 것은 없다는 것이다.
        그러므로 반드시 먼저 super 를 진행한 이후에 그 다음 코드를 작성해야한다.
         */
        super(n,a);
        System.out.println("Student 생성자");
        this.major = major;
    }
    public String toString() {
        return "이름 = " + name +", 전공 = "+ major +", 나이 = " + age;
    }
}
public class Extends {
    public static void main(String[] args) {
        Person p = new Person("김시윤", 29);
        System.out.println(p);

        Student s = new Student("강성제", 38, "컴퓨터");
        System.out.println(s);


        Police pol = new Police("임성제", 33, "순경");
        System.out.println(pol);

       // Professor kim = new Professor("이승화", 40, "소프트웨어", 1);
    }
}


/*
class Professor{
    String name;
    String major;
    boolean hak;

    public Professor(String n, String m, boolean h ){
        name = n;
        major = m;
        hak = h;
    }

    @Override
    public String toString() {
        return "Professor" +
                "이름 = " + name +
                ", 전공 = " + major +
                ", 학위 여부 =" + hak;
    }
}
*/
