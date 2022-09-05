public class VolTest {
    public static void main(String[] args){
        TV tv = new TV();
        tv.turnOn();
        tv.volumeUp(10);
        tv.volumeDown(20);
        tv.volumeDown(10);
        tv.turnOff();

        
    }
}
