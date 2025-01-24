package sec03;

class FallThroughWarnings {
    @SuppressWarnings({"fallthrough", "deprcation"})
    public static void main(String[] args) {
        int n = 3;

        switch (n) {
        case 1:
            System.out.println(n);  // break문 존재하지 않음
        case 2:
            System.out.println(n);
        case 3:
            System.out.println(n);
        }
    }
}