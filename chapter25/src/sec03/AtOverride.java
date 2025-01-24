package sec03;

interface Viewable {
    public void shoIt(String str);
}

class Viewer implements Viewable {
    @Override   // 상위 클래스의 메소드 구현임을 알림
    public void shoIt(String str) {
        System.out.println(str);
    }
}

class AtOverride {
    public static void main(String[] args) {
        Viewable viewable = new Viewer();
        viewable.shoIt("Hello Annotations");
    }
}
