package sec01;

interface HowLong {
    int len(String s);
}

class OneParamAndReturn {
    public static void main(String[] args) {
        HowLong h1 = s -> s.length();
        System.out.println(h1.len("I am so happy"));
    }
}