class GfG
{
    int maxLen(int arr[], int n)
    {
        int ml=0;
        int sum=0;
        HashMap<Integer,Integer> m= new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==0){
                ml=i+1;
            }
            else{
                if(m.get(sum)!=null)
                ml=Math.max(ml,i-m.get(sum));
                else
                m.put(sum,i);
            }
        }
        return ml;
    }
}
