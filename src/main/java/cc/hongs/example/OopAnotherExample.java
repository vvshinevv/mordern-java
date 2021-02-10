package cc.hongs.example;

public class OopAnotherExample {
    public static void main(String[] args) {
        final CalculatorService calculatorService = new CalculatorService(new Addition(), new Subtraction());
        final int additionResult = calculatorService.calculate(1, 1);
        System.out.println(additionResult);

        final int subtractionResult = calculatorService.calculate(1, 1);
        System.out.println(subtractionResult);

        final int multiplicationResult = calculatorService.calculate(1, 1);
        System.out.println(multiplicationResult);

        final int divisionResult = calculatorService.calculate(8, 4);
        System.out.println(divisionResult);
    }
}

interface Calculation {
    int calculate(int num1, int num2);
}

class Addition implements Calculation {
    @Override
    public int calculate(int num1, int num2) {
        return num1 + num2;
    }
}

class Subtraction implements Calculation {
    @Override
    public int calculate(int num1, int num2) {
        return num1 - num2;
    }
}

class Multiplication implements Calculation {
    @Override
    public int calculate(int num1, int num2) {
        return num1 * num2;
    }
}

class Division implements Calculation {
    @Override
    public int calculate(int num1, int num2) {
        return num1 / num2;
    }
}

class CalculatorService {
    private final Calculation calculation1;
    private final Calculation calculation2;

    public CalculatorService(final Calculation calculation1, final Calculation calculation2) {
        this.calculation1 = calculation1;
        this.calculation2 = calculation2;
    }

    public int calculate(int num1, int num2) {
        if (num1 > 10 && num2 < num1) {
            return calculation1.calculate(num1, num2);
        }
        throw new IllegalArgumentException("Invalid input num1 : " + num1 + ", num2 : " + num2);
    }

    public int compute(int num1, int num2) {
        if (num1 > 10 && num2 < num1) {
            return calculation2.calculate(num1, num2);
        }
        throw new IllegalArgumentException("Invalid input num1 : " + num1 + ", num2 : " + num2);
    }
}
