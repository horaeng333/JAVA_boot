//3개의 숫자를 입력받아 최대,최소값 한번에 확인
//comment:  리턴값은 두개(min,max) 넘길 방법을 찾자.
//          => 배열로 묶자.

public class MinMax_1 {
    public int maxNumber(int num1, int num2, int num3) {
        int [] numbers = {num1, num2, num3};
        return maxNumber(numbers);
    }
    public int maxNumber(int [] numbers) {
        int max=numbers[0];
        for(int i=1;i<numbers.length;i++) {
            if(max<numbers[i])
                max=numbers[i];
        }
        return max;
    }
    public int minNumber(int num1, int num2, int num3) {
        int [] numbers = {num1, num2, num3};
        return minNumber(numbers);
    }
    public int minNumber(int [] numbers) {
        int min=numbers[0];
        for(int i=1;i<numbers.length;i++) {
            if(min>numbers[i])
                min=numbers[i];
        }
        return min;
    }

    //최대최소 한번에 확인
    public int[] numbwerMaxAndMin(int num1, int num2, int num3) {
        int[] result = new int[2];
        result[0] = maxNumber(num1, num2, num3);
        result[1] = minNumber(num1, num2, num3);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new MinMax_1().maxNumber(1, 2, 3));
        System.out.println(new MinMax_1().minNumber(1, 2, 3));
        //System.out.println(new MinMax_1().numbwerMaxAndMin(1, 2, 3));
        //println에는 int[] 형식이 없음. 위처럼 출력하면 [I@776ec8df 이렇게 나옴.
        //[:배열 I:int 776ec8df:16진수
        //=>
        int[] nums = new MinMax_1().numbwerMaxAndMin(1,2,3);
        System.out.println(nums[0]+ " " + nums[1]);
    }






//    public int arrayNumber(int num1, int num2, int num3) { //리턴형식-정수 매개변수형식-정수
//        int [] numbers = {num1, num2, num3};
//        return minmax(numbers);
//    }
//    public int[] minmax(int[] numbers) {                   //리턴형식-배열 매개변수형식-배열
//        int[] mm = new int[];
//
//        //최대최소 판별
//
//        return mm; //배열로 리턴
//    }
//    public static void main(String[] args) {
//        System.out.println(new MinMax_1().minmax(1,2,3));
//    }
}
