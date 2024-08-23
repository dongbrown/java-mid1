package lang.string.builder;

public class LootStringMain {
//String 최적화가 어려운 경우!
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String result = "";
        for(int i = 0; i < 100000; i++){ // -> String 객체 100,000번 생성
            result += "Hello Java ";
        }
        long endTime = System.currentTimeMillis();

        System.out.println("result = " + result);
        System.out.println("time = " + (endTime - startTime) + "ms"); // time = 4040ms
    }
}
