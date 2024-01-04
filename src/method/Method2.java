package method;

public class Method2 {

    public static void main(String[] args) {
        printHeader();
        System.out.println("= 프로그램이 동작합니다. =");
        printFooter();
    }

    private static void printHeader() {
        System.out.println("= 프로그램을 시작합니다. =");
        return; // 모든 메서드는 항상 return을 호출해야 한다. 그런데 반환 타입 void의 경우에는 예외로 생략이 가능하다. 참고로 return을 만나면 해당 메서드는 종료된다.
    }

    private static void printFooter() {
        System.out.println("= 프로그램을 종료합니다. =");
    }
}
