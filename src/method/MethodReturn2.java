package method;

public class MethodReturn2 {

    public static void main(String[] args) {
        checkAge(10);
        checkAge(20);
    }

    private static void checkAge(int age) {
        if (age < 18) {
            System.out.println(age + "살, 미성년자는 출입이 불가능합니다.");
            return; // return을 써줘야 아래 로직까지 수행하지 않고 해당 메서드를 빠져나온다.
        }

        System.out.println(age + "살, 입장하세요.");
    }

}
