package lang;

import java.util.Random;
public class RandomMain {
    public static void main(String[] args) {
        // 생성자를 비워두면 내부에서 씨드값을 생성.반복 실행해도 결과가 항상 달라짐
        Random random = new Random();
        //Random random = new Random(1); //seed가 같으면 Random의 결과가 같다.
        int randomInt = random.nextInt();
        System.out.println("randomInt: " + randomInt); //-1316070581
        double randomDouble = random.nextDouble(); //0.0d ~ 1.0d
        System.out.println("randomDouble: " + randomDouble); //0.37735342193577215
        boolean randomBoolean = random.nextBoolean();
        System.out.println("randomBoolean: " + randomBoolean); //false
        // 범위 조회
        int randomRange1 = random.nextInt(10); //0 ~ 9까지 출력
        System.out.println("0 ~ 9: " + randomRange1);
        int randomRange2 = random.nextInt(10) + 1; //1 ~ 10까지 출력
        System.out.println("1 ~ 10: " + randomRange2);
    }
}