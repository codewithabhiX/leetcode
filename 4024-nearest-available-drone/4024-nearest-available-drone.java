class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        
        int minrange=1000;
        int minindex=-1;
     
      for(int i=0;i<drones.length;i++){
            int temp=(Math.abs(drones[i][0]-target[0]) + Math.abs(drones[i][1]-target[1]));
        
            if(temp<=drones[i][2]){
                if(minrange>temp){
                    minrange=temp;
                    if(minindex<i){
                        minindex=i;
                    }
                }
            }
      }  
      
      return minindex;
    }
}