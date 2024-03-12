package day04;

public class DmbCellPhoneTest {
    public static void main(String[] args) {
        DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);

        dmbCellPhone.powerOn();
        dmbCellPhone.turnOnDmb();
        dmbCellPhone.turnOffDmb();
        dmbCellPhone.powerOff();
    }
}
