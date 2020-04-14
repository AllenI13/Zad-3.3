public class Test {
    public static void main(String[] args) {
        MathMethods isEven = new MathMethods();
        boolean isEvenResult = isEven.isEven(5);
        System.out.println(isEvenResult);

        MathMethods isOdd = new MathMethods();
        boolean isOddResult = isOdd.isOdd(45);
        System.out.println(isOddResult);

        MathMethods circleField = new MathMethods();
        double circleFieldResult = circleField.circeField(2);
        System.out.println(circleFieldResult);

        MathMethods power = new MathMethods();
        int powerResult = power.power(3);
        System.out.println(powerResult);
    }
}
