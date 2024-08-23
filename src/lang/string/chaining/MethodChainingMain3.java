package lang.string.chaining;

public class MethodChainingMain3 {

    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        int result = adder.add(1).add(2).add(3).getValue(); // ->MethodChaining 기법
        // add()메서드를 호출하면 ValueAdder 인스턴스 자신의 참조값이 반환 -> 이 반환된 참조값을 변수에 담아두지 않아도 됨
        // 대신 반환된 참조값을 즉시 사용해서 바로 메서드를 호출할 수 있다!
        System.out.println("result = " + result);
    }
}
