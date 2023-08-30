//메서드 MethodTest 안에 member가 2개, static member가 1개.
public class MethodTest {
    public int sum(int num1, int num2) {
        int sum=num1+num2;
        return sum;
    }
    public static void main(String[] args) {
        //두 숫자를 입력해서 합을 확인
//        int num1=10;
//        int num2=20;
//        int sum=num1+num2;
//        System.out.println(sum);

        //int: 기본 타입 / mt: 객체 타입
        
        MethodTest mt = new MethodTest();
        System.out.println(mt.sum(10,20));
        System.out.println(mt.sum(-10,20));


    }
}
