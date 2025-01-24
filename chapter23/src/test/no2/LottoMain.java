package test.no2;

public class LottoMain {
    public static void main(String[] args) {
        LottoService service = new LottoService();
        Menu menu = new Menu(service);

        menu.run();
    }
}