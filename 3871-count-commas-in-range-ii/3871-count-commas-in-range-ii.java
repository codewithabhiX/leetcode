class Solution {
    public long countCommas(long n) {
        long answer=0;
        long store3=999999999999L;
        long store4=999999999999999L;
         long store5=999999999999999999L;
         if(n<1000){
            return answer;
        }else if(n<=999999){
            answer=n-999;
        }else if(n<=999999999){
           answer=999999-999;
           long temp=n-999999;
           answer=answer+(temp*2);
        }else if(n<=store3){
            answer=999999-999;
            long temp=999999999-999999;
            answer=answer+(temp*2);
              temp=n-999999999;
              answer=answer+(temp*3);
        }else if(n<=store4){
            answer=999999-999;
            long temp=999999999-999999;
            answer=answer+(temp*2);
              temp=store3-999999999;
              answer=answer+(temp*3);
              temp=n-store3;
              answer=answer+(temp*4);
        }else if(n<=store5){
            answer=999999-999;
            long temp=999999999-999999;
            answer=answer+(temp*2);
              temp=store3-999999999;
              answer=answer+(temp*3);
              temp=store4-store3;
              answer=answer+(temp*4);
               temp=n-store4;
              answer=answer+(temp*5);
        }

        
        return answer;
    }
}