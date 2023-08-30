
public class PlusMinusMethod {
//    public int solution(int num) {
//        if(num>0)
//            return 1;
//        else if (num==0)
//            return 0;
//        else return -1;
//    }
//
    public String result(int num) {
        String result = "양수";

        if(num<0)
            result="음수";
        else if(num==0)
            result="0";

        return result;
    }

    public static void main(String[] args) {
        PlusMinusMethod mt = new PlusMinusMethod();
        System.out.println(mt.result(1));
        System.out.println(mt.result(0));
        System.out.println(mt.result(-1));

    }
}
