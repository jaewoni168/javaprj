import day04.RemoteControl;
import day04.Television;
import day04.Audio;

public class RemoteControlTest {
    public static void main(String[] args) {
        RemoteControl rc = new Television();
        RemoteControl rc1 = new Audio();

        rc.setVolume(9);
        rc.turnOn();
        rc.turnOff();
    }
}
