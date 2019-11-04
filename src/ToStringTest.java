class Student{
    private String major;
    private int age;
    private String name;

    void iCanCallTest(){
        System.out.println("iCanCallTest Function");
        test();
    }

    private void test(){
        System.out.println("Test");
    }

    void setMajor(String m){
        major = m;
    }

    String getMajor(){
        return major;
    }

    void setAge(int a){
        age = a;
    }

    int getAge(){
        return age;
    }

    void setName(String n){
        name = n;
    }

    String getName(){
        return  name;
    }

    /* toString
        요녀석은 System.out.println에 객체를 집어넣었을 경우
        알아서 객체에 대한 정보를 출력하는 것을 도와준다.
        출력 하고자 하는 것을 toString 에 적으면 된다.

     */
    public String toString(){
        return "이름 = " + name + ", 전공 = " + major + ", 나이 = " + age;
    }
}

class Game{

    String name;
    int hp;
    int mp;
    int ap, apd, ad, add;

    void setName(String n){
        name = n;
    }

    String getName(){
        return name;
    }

    void setHp(int hp_){
        hp = hp_;
    }

    int getHp(){
        return hp;
    }

    void setMp(int mp_){
        hp = mp_;
    }

    int getMp(){
        return mp;
    }

    void setApd(int mb){
        apd = mb;
    }

    int getApd(){
        return  apd;
    }

    void setAdd(int b){
        add = b;
    }

    int getAdd(){
        return add;
    }


    void attack(){
        hp -= ap;
        hp += (apd/2);
        mp -= 70;
    }


}
    public class ToStringTest {
        public static void main(String[] args) {
            Student stu1 = new Student();

            stu1.setAge(24);
            stu1.setMajor("Computer Science");
            stu1.setName("김범수");

            //stu1.age = 77;
            stu1.iCanCallTest();
            //stu1.test();

            System.out.println(stu1);
            /*
            System.out.println(stu1.getAge());
            System.out.println(stu1.getName());
            System.out.println(stu1.getMajor());
            */

            Student stu2 = new Student();
            stu2.setAge(22);
            stu2.setMajor("Electric Engineering");
            stu2.setName("정아영");

            System.out.println(stu2);
            /*
            System.out.println(stu2.getAge());
            System.out.println(stu2.getName());
            System.out.println(stu2.getMajor());
            */

        }

}
