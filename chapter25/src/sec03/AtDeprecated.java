package sec03;

interface Viewable2 {
    @Deprecated
    public void showIt(String str);     // Deprecated 된 메소드

    public void brShowIt(String str);
}

class Viewer2 implements Viewable2 {
    @Override
    public void showIt(String str) {    // 구현
        System.out.println(str);
    }

    @Override
    public void brShowIt(String str) {
        System.out.println('[' + str + ']');
    }
}

public class AtDeprecated {
    public static void main(String[] args) {
        Viewable2 view = new Viewer2();
        view.showIt("Hello Annotations");
        view.brShowIt("Hello Annotations");
    }
}
