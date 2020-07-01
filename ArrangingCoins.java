class ArrangingCoins {
    public int arrangeCoins(int n) {
        int temp=n;
        int i=1;
        for(i=1;i<=n;i++){
            temp-=i;
            if(temp<0)
                return i-1;
            if(temp==0)
                return i;
                
        }
        return 0;
    }
    //0(1) time complexity
    public int arrangeCoins(int n) {
        return (int)((-1 + Math.sqrt(1 + 8 * (long)n)) / 2);
    }
}
