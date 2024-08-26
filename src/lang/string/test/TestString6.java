package lang.string.test;

public class TestString6 {

    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int count = 0;
        System.out.println(str.indexOf(key));

        int index = str.indexOf(key);
        System.out.println("index = " + index);

        while(index >= 0){ // indexOf() -> 없는 단어를 찾을 때 -1을 반환
            index = str.indexOf(key, index + 1);
            count++;
        }
        System.out.println("count = " + count);
    }
}
