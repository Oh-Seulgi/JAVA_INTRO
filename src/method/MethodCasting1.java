package method;

public class MethodCasting1 {

    public static void main(String[] args) {
        double number = 1.5;
//        printNumber(number);      // double을 int에 대입하므로 컴파일 오류
        printNumber((int) number);  // 명시적 형변환을 사용해 double을 int로 변환

        int number2 = 1;
        printNumber2(number2);      // 자동 형변환이 동작한다. (int < long < double)
    }

    public static void printNumber(int number) {
        System.out.println("Number: " + number);
    }

    public static void printNumber2(double number) {
        System.out.println("Number: " + number);
    }

}
