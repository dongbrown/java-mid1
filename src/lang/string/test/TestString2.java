package lang.string.test;

public class TestString2 {

    //length() 사용하여 arr 배열에 들어있는 모든 문자열의 길이 합 구하기
    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        int sum = 0;
//        for(int i = 0; i < arr.length; i++){
//            sum += arr[i].length();
//        }
//        System.out.println(sum);

        for(String s : arr){
            System.out.println(s + " : " + s.length());
            sum += s.length();
        }
        System.out.println(sum);
    }
}
