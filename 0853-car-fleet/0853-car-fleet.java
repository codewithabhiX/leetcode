class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        
        
        int arr[]=new int[position.length];
        int index[]=new int[position.length];
        int speedarr[]=new int[1000000];
        int count=0;
        int size=0;

        for(int i=0;i<position.length;i++){
          arr[i]=position[i];
        }

        for(int i=0;i<position.length;i++){
          index[i]=i;
        }

        Arrays.sort(position);

        for(int i=0;i<arr.length;i++){
           speedarr[arr[i]]=speed[i];
        }
        
        for(int i=0;i<speedarr.length;i++){
          if(speedarr[i]!=0){
             size++;
          }
        }
       

       int newSpeed[]=new int[size];
       int j=0;

       for(int i=0;i<speedarr.length;i++){
          if(speedarr[i]!=0){
             newSpeed[j]=speedarr[i];
             j++;
          }
        }

         for(int i=0;i<newSpeed.length;i++){
         System.out.println(newSpeed[i]);
        }
      double z=-1;
        for(int i=newSpeed.length-1;i>=0;i--){
          double t1=((target-(double)position[i])/(double)newSpeed[i]) ;
           
           System.out.println(t1);
          if(t1>z){
            count++;
            z=t1;
          }
          
         
        }
        return  count;
    }

}