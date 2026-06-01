public class Calculator {
    
    // 덧셈
    public int addInt(int a, int b) {
        return a + b;
    }

    // 뺄셈
    public int subtractInt(int a, int b) {
        return a - b;
    }

    // 곱셈
    public int multiplyInt(int a, int b) {
        return a * b;
    }

    // 나눗셈
    public int divideInt(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        }
        return a / b;
    }
}