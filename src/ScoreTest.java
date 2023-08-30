//n명의 성적, 평균보다 낮은 사람은 몇명인지. 단, 소수점 이하 버림.

public class ScoreTest {

    public int execute(int[] data) {
        int cnt1=0, cnt2=0;
        //평균 구하기
        for(int i=0;i<data.length;i++) {
            cnt1+=data[i];
        }
        int avr=cnt1/data.length;
        
        //평균보다 낮은 사람 구하기
        for(int i=0;i<data.length;i++) {
            if(data[i]<avr)
                cnt2++;
        }
        return cnt2;
    }
    public static void main(String[] args) {
        int[] data1={10,20,30};
        int[] data2={11,12,13,12,11};
        ScoreTest s = new ScoreTest();
        System.out.println("실행 결과는 "+s.execute(data1)+"명 입니다.");
        System.out.println("실행 결과는 "+s.execute(data2)+"명 입니다.");
    }
}
