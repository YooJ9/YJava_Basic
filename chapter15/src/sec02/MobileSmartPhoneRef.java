package sec02;

class MobilePhone2 {
    protected String number;

    public MobilePhone2(String num) {
        number = num;
    }
    public void answer() {
        System.out.println("Hi~ from" + number);
    }
}

class SmartPhone2 extends MobilePhone2 {
    private String androver;

    public SmartPhone2(String num, String ver) {
        super(num);
        androver = ver;
    }
    public void playApp() {
        System.out.println("App is running in " + androver);
    }
}

class MobileSmartPhoneRef {
    public static void main(String[] args) {
        SmartPhone2 ph1 = new SmartPhone2("010-555-7777", "Nougat");
        MobilePhone2 ph2 = new SmartPhone2("010-999-3333", "Nougat");

        ph1.answer();
        ph1.playApp();
        System.out.println();

        ph2.answer();
        //ph2.playApp(); 불가능
    }
}
