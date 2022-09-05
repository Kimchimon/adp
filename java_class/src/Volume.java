
// 전체 프로그래므의 설계도, 모든 클래스에서 공통으로 필요로하는 메소드 선언
public interface Volume {
    // 1. 볼륨 증가, 수정 목적(매개변수 o, 반환값 x)
    public void volumeUp(int level);
    // 2. 볼륨 감소
    public void volumeDown(int level);

    // 3, 4 turn on , turn off
    // 자식 인터페이스에서 구현
}
