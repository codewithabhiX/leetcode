class Solution {
    public int minBishopMoves(int[] source, int[] target) {
          
       int sou=(source[0]+source[1])%2;
       int tar=(target[0]+target[1])%2;

         if(source[0]+source[1]==target[0]+target[1] ){
            return 1;
         }else if(source[0]-source[1]==target[0]-target[1] ){
            return 1;
         }else if(sou!=tar){
            return -1;
        }else{
            return 2;
        }
    }
}