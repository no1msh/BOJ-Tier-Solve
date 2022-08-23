package anything;

class tempTest {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        // 어느날에 회원으로 가입할 건지 구할 반복
        first:
        for (int i = 0 ; i < discount.length-10; i++){
            for (int j = 0; j < want.length ; j++){
                int count = 0 ;
                for (String value : discount){
                    if(want[j].equals(value)){
                        count++;
                    }
                }

                if (count != number[j]){
                    continue first;
                }
            }

            answer = i+1;
        }

        return answer;
    }

    public static void main(String[] args) {

    }
}