package lang.string;

public class StringBasicMain {
    public static void main(String[] args) {

        String str1 = "hello"; //str1 변수에는 String 인스턴스의 참조값만 들어갈 수 있다.
        String str2 = new String("hello");

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

    }
}
