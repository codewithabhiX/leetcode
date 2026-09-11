class Solution {
    public int totalNumbers(int[] digits) {
        
        int hashArray[]=new int[10];
        
        int count=0;

       for(int i=0;i<digits.length;i++){
           hashArray[digits[i]]= hashArray[digits[i]]+1;
       } 

       

       for(int i=100;i<999;i++){
            if(i%2==0){

            int n=i%10;
            int temp= i/10;

            int p=temp%10;
             temp= temp/10;
   
            int q=temp;
          
             if( hashArray[n]>0 && hashArray[p]>0 && hashArray[q]>0){
                if(n==p &&  hashArray[n]>=2 || n==q && hashArray[n]>=2 || p==q && hashArray[p]>=2){
                  
                  if(n==p && n==q && p==q && hashArray[n]>=3){
                    count++;
                    System.out.println(q+""+p+""+n);
                  }else if(((n==p || n==q) &&  p!=q) || ((p==n || p==q) &&  n!=q)){
                    count++;
                    System.out.println(q+""+p+""+n);
                  }
                   
                }else if(n!=p && p!=q && n!=q){
                    count++;
                    System.out.println(q+""+p+""+n);
                }
                
            }
            }

       }

       return count;
    }
}