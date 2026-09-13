class Solution {
    protected int shiftandc(int x,int y,int[][] M,int[][] R){
        int leftc=0,rightc=0;
        int rrow=0;
        for(int mrow=y;mrow<M.length;++mrow){
            int rcol=0;
            for(int mcol=x;mcol<M.length;++mcol){
                if(M[mrow][mcol]==1 && M[mrow][mcol]==R[rrow][rcol]) leftc+=1;
                if(M[mrow][rcol]==1 && M[mrow][rcol]==R[rrow][mcol]) rightc+=1;
                rcol+=1;
            }
            rrow+=1;
        }
        return Math.max(leftc,rightc);
    }
    public int largestOverlap(int[][] A, int[][] B) {
        int maxover=0;
        for(int y=0;y<A.length;++y){
            for(int x=0;x<A.length;++x){
                maxover=Math.max(maxover,shiftandc(x,y,A,B));
                maxover=Math.max(maxover,shiftandc(x,y,B,A));
            }
        }
        return maxover;
    }
}