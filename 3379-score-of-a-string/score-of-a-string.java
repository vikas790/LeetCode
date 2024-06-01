class Solution {
    public int scoreOfString(String S) {
       int sum=0;
        for(int i=0;i<S.length()-1;i++){
            int present=S.charAt(i);
            int next = S.charAt(i+1);
            if(present>next){
                sum=sum+(present-next);
            }
            else{
                sum = sum+(next-present);
            }
        }
        return sum; 
    }
}