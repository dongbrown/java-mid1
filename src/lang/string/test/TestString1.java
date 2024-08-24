package lang.string.test;

public class TestString1 {

    public static void main(String[] args) {
        String url = "https://www.example.com";

        boolean result = false;
        if(url.startsWith("https")){
            result = true;
        }
        System.out.println(result);
    }
}
