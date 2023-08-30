//3개의 숫자를 입력받아 최소값,최대값 확인
//comment:  min, max 메서드 따로 만들자.
//          최대최소 판별하는 법.
//          메서드 리턴타입, 매개변수 설정하는 법.
//          디폴트 갑 설정.(이 문제에만 해당되는 사항 아님.)

public class MinMax {

    public int maxNumber(int num1, int num2, int num3) {
        int [] numbers = {num1, num2, num3};
        return maxNumber(numbers);
    }
    public int maxNumber(int [] numbers) {
        int  max=numbers[0]; //디폴트값
        for(int i=1;i<numbers.length;i++) {
            if(max<numbers[i])
                max=numbers[i];
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new MinMax().maxNumber(1,2,3));
    }



//    public int solution(int[] num) {
//        int min=0, max=0;
//        for(int i=0;i<num.length; i++) {
//            for(int j=0;i<num.length;j++) {
//                if(num[i]>num[j]) {
//                    max=num[i];
//                    min=num[j];
//                }
//                else if(num[i]<num[j]) {
//                    max=num[j];
//                    min=num[i];
//                }
//                else break;
//            }
//            return min;
//        }
//    }
//    public static void main(String[] args) {
//        MinMax mm = new MinMax();
//        int[] num = {1,2,3};
//        System.out.println(mm.solution(num));
//    }
}
