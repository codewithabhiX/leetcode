class Solution {
    public int maxHeightOfTriangle(int red, int blue) {
        
      
       int i=1;
       int j=1;
       int freshred=red;
       int freshblue=blue;
        while(true){
          if(i%2!=0){
            if(red>=i){
                
                red=red-i;
            }else{
                break;
            }
          }else{
            if(blue>=i){
                
                blue=blue-i;
            }else{
                break;
            }
          }
          i++;
        
        }
       i--;

       red=freshred ;
       blue=freshblue;
     System.out.println(i);
        while(true){
             if(j%2!=0){
            if(blue>=j){
                blue=blue-j;
            }else{
                break;
            }
          }else{
            if(red>=j){
                red=red-j;
            }else{
                break;
            }
          }
          j++;
        }
       j--;
         
          System.out.println(j);

        if(i>j){
            return i;
        }
        return j;
    }
}