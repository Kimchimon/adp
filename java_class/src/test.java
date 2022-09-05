abstract class Exam {
    // 일반 메소드
    public int sum(int x, int y) {
        return x + y;
    }

    /* 추상 메소드, 하위 클래스에서 오버라이딩을 완료해야 함 */
    // 하위 클래스에서 "안녕?"을 출력하는 메소드로 구현
    abstract public void sayHi();

    // 하위 클래스에서 매개변수 a와 b를 더한 뒤 결과를 출력하는 메소드로 구현
    abstract public void printSum(int a, int b);
}
public class test extends Exam {

    // Exam 클래스의 sayHi() 추상 메소드 오버라이딩
    public void sayHi() {
        System.out.println("안녕?");
    }

    // Exam 클래스의 printSum() 추상 메소드 오버라이딩
    public void printSum(int a, int b) {
        int result = sum(a, b);
        System.out.println(a + "과(와) " + b + "의 합은 " + result + "(이)야");
    }

    public static void main(String[] args) {

        // 하위 클래스인 AbstractTest 객체 생성
        test at = new test();

        // AbstractTest 클래스에서 재정의된 메소드 호출
        at.sayHi();              // 안녕?
        at.printSum(30, 40);     // 30과(와) 40의 합은 70(이)야

    }

}