package lang.string;

public class StringBuilderBufferExample {
    public static void main(String[] args) {
        // StringBuilder 예시
        StringBuilder sb = new StringBuilder();
        System.out.println("=== StringBuilder 예시 ===");
        long startTime = System.nanoTime();

        sb.append("안녕하세요, ");
        sb.append("StringBuilder ");
        sb.append("예시입니다.");
        sb.insert(11, "Java ");
        sb.replace(0, 5, "Hello");
        sb.delete(23, 26);
        sb.reverse();

        long endTime = System.nanoTime();
        System.out.println("StringBuilder 결과: " + sb.toString());
        System.out.println("StringBuilder 실행 시간: " + (endTime - startTime) + " ns");
        System.out.println("StringBuilder 길이: " + sb.length());
        System.out.println("StringBuilder 용량: " + sb.capacity());

        // StringBuffer 예시
        StringBuffer sbuf = new StringBuffer();
        System.out.println("\n=== StringBuffer 예시 ===");
        startTime = System.nanoTime();

        sbuf.append("안녕하세요, ");
        sbuf.append("StringBuffer ");
        sbuf.append("예시입니다.");
        sbuf.insert(11, "Java ");
        sbuf.replace(0, 5, "Hello");
        sbuf.delete(23, 26);
        sbuf.reverse();

        endTime = System.nanoTime();
        System.out.println("StringBuffer 결과: " + sbuf.toString());
        System.out.println("StringBuffer 실행 시간: " + (endTime - startTime) + " ns");
        System.out.println("StringBuffer 길이: " + sbuf.length());
        System.out.println("StringBuffer 용량: " + sbuf.capacity());

        // 스레드 안전성 테스트
        testThreadSafety();
    }

    public static void testThreadSafety() {
        StringBuilder sb = new StringBuilder();
        StringBuffer sbuf = new StringBuffer();

        Runnable stringBuilderTask = () -> {
            for (int i = 0; i < 1000; i++) {
                sb.append("a");
            }
        };

        Runnable stringBufferTask = () -> {
            for (int i = 0; i < 1000; i++) {
                sbuf.append("a");
            }
        };

        Thread t1 = new Thread(stringBuilderTask);
        Thread t2 = new Thread(stringBuilderTask);
        Thread t3 = new Thread(stringBufferTask);
        Thread t4 = new Thread(stringBufferTask);

        t1.start(); t2.start(); t3.start(); t4.start();

        try {
            t1.join(); t2.join(); t3.join(); t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\n=== 스레드 안전성 테스트 결과 ===");
        System.out.println("StringBuilder 길이 (예상: 2000): " + sb.length());
        System.out.println("StringBuffer 길이 (예상: 2000): " + sbuf.length());
    }
}