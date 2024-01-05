package method;

/*
*  메서드 오버로딩
*   - 메서드의 이름이 같아도 매개변수의 타입 및 순서가 다르면 오버로딩을 할 수 있다. 참고로 반환 타입은 인정하지 않는다.
* */
public class Overloading1 {

    public static void main(String[] args) {
        add(1,2);
        add(1,2,3);
    }

    private static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }

    private static int add(int a, int b, int c) {
        System.out.println("2번 호출");
        return a + b + c;
    }
}
