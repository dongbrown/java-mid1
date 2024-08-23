package lang.string.chaining;

public class MethodChainingMain2 {

    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        ValueAdder adder1 = adder.add(1);
        ValueAdder adder2 = adder.add(2);
        ValueAdder adder3 = adder.add(3);

        int result = adder3.getValue();
        System.out.println("result = " + result);

        System.out.println("adder = " + adder); //adder = lang.string.chaining.ValueAdder@4f023edb
        System.out.println("adder1 = " + adder1); //adder1 = lang.string.chaining.ValueAdder@4f023edb
        System.out.println("adder2 = " + adder2); //adder2 = lang.string.chaining.ValueAdder@4f023edb
        System.out.println("adder3 = " + adder3); //adder3 = lang.string.chaining.ValueAdder@4f023edb

    }
}
