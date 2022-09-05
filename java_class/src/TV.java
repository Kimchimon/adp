


public class TV implements AdvanceVolume{

    private int volLevel;

    @Override // 1. 볼륨 증가 메소드 오버라이딩
    public void volumeUp(int level) {
        volLevel += level;
        System.out.println("볼륨이 " + level + "만큼 증가했습니다.");
        System.out.println("현재 볼륨: " + volLevel);
    }

    @Override //  볼륨 감소 메소드 오버라이딩
    public void volumeDown(int level) {
        if(volLevel - level < 0){
            System.out.println("볼륨의 크기는 0보다 작을 수 없습니다!");
            System.out.println("현재 볼륨: " + volLevel);
        }else{
            volLevel -= level;
            System.out.println("볼륨이 " + level + "만큼 감소했습니다.");
            System.out.println("현재 볼륨: " + volLevel);
        }
    }

    @Override // 3.  전원 켜기 메소드 오버라이딩
    public void turnOn() {
        //  전원을 켰을 때 기본 볼륨을 10 설정
        volLevel = 10;
        System.out.println("현재 볼륨: " + volLevel);
    }

    @Override // 4. 전원 끄기 메소드 오버라이딩
    public void turnOff() {
        System.out.println("TV 전원이 꺼졌습니다.");
    }
}
