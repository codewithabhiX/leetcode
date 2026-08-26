class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int rans[]=new int[26];
        int maga[]=new int[26];

        for(int i=0;i<magazine.length();i++){
           int count=magazine.charAt(i) -'a';
           maga[count]=maga[count]+1; 
        }

         for(int i=0;i<ransomNote.length();i++){
           int count=ransomNote.charAt(i) -'a';
           rans[count]=rans[count]+1; 
        }
   


              for(int i=0;i<=25;i++){
                if(rans[i]>maga[i]){
                    return false;
                }
              }

        return true;
    }
}