package day16;
/*    1,      5,      10,     15      150     1500        2300
      2350    2350    2350    2350    2350    2350        2350
      23423   2350    2350
    위와 같은 데이터가 배열에 들어있다고 가정한다(무선 주파수임) 여기사 가장 빈도수가 높은
    주파수 대역 2개를 추출하고 몇 번 검출 되었는지 확인하는 프로그램 작성하시오

    1. 목적: 가장 빈번한 숫자 2개와 출현 횟수
    2. 배열을 활용하도록 한다.
    3. 각각이 몇 번 출현했는지(빈도수)를 표현해주는 배열이 필요하다.
    4. 이것에 대응하는 숫자 배열이 필요하다.
       (빈도수가 어떤 숫자인지를 알 필요가 있기 때문)
    5. 숫자 값들이 오름차순으로 정렬되면 좀 더 편할 것이다.
*/
class FindFrequency {
    int len;
    int[] wirelessFreq;

    public FindFrequency(int[] wF){
        len = wF.length;

        wirelessFreq = new int[len];

        for(int i = 0; i < len; i++){
            wirelessFreq[i] = wF[i];
        }
    }

    public void sorting(){
        int i, j, key;

        for(i = 1; i<len; i++){
            key = wirelessFreq[i];

            for(j = i - 1; wirelessFreq[j] > key; j--){
                wirelessFreq[j + 1] = wirelessFreq[j];
            }

            wirelessFreq[j+1] = key;
        }
    }
    public void watchData(){
        for(int i = 0; i < len; i++){
            System.out.printf("%8d");
            if(i%5 == 4){
                System.out.println();
            }
        }
    }

}

public class ChallengeClassification {
    public static void main(String[] args) {
        int[] wirelessFreq = {
                1, 5, 10, 10, 15, 150, 1500, 2300,
                2350, 2350, 2350, 2350, 2350, 2350, 2350, 2350,
                23423, 1231, 52352, 2352332, 13123, 34531, 2342,
                1231, 2342, 2342, 368, 4675, 47905, 45604, 4500,
                5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000};
    }
    
}
