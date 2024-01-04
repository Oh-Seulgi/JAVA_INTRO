package method;

public class MethodRef {

    public static void main(String[] args) {
        // 계산1
        int sum1 = add(5, 10);
        System.out.println("결과1 출력: " + sum1);

        // 계산2
        // add(5, 10) 이런식으로 호출할 때 넘기는 값을 인수(Argument), 한글로 인수, 인자라고 한다.
        int sum2 = add(15, 20);
        System.out.println("결과2 출력: " + sum2);
    }

    // add 메서드 : add = 메서드 이름, int = 반환 타입, 매개변수(파라미터) 목록
    // 제어자 반환타입 메서드이름(매개변수 목록) {        -> 만약 메서드가 값을 반환하지 않는 경우에 void를 사용한다.
    //      메서드 본문
    // }
    public static int add(int a, int b) {
        System.out.println(a + "+" + b + " 연산 수행");
        int sum = a + b;
        return sum;
    }

}
