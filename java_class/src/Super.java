class Person {
    String name; // null
    int age = 20;

    void print() {
        // System.out.println("Person 이름: " + name + ", 나이: " + age);
    }
}

class Man extends Person {
    int age = 40;

    void print() {

        super.print();

        System.out.println("Person 이름 : " + super.name + ", 나이는 " + super.age + " 에서 " +  age + " 로 변경되었습니다.");
    }
}

public class Super {

    public static void main(String[] args) {

        Man m = new Man();

        m.name = "홍길동";

        m.print();
    }

}
