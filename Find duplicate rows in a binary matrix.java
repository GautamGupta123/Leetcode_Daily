class Solution
{
    public static int deccon(String str){
        int dec=0;
        int p=0;
        int i;
        for(i=str.length()-1;i>=0;i--){
            dec+=Character.getNumericValue(str.charAt(i))*(int)Math.pow(2,p);
            p++;
        }
        return dec;
    }
    public static ArrayList<Integer> repeatedRows(int matrix[][], int m, int n)
    {
        ArrayList<Integer>ls=new ArrayList<Integer>();
        int i,j;
        ArrayList<Integer>ls1=new ArrayList<>();
        for(i=0;i<m;i++){
            StringBuilder s=new StringBuilder();
            for(j=0;j<n;j++){
                s.append(matrix[i][j]);
            }
             String str=s.toString();
             ls1.add(deccon(str));
        }
        HashSet<Integer>res=new HashSet<Integer>();
        int a,b;
        for(i=0;i<ls1.size()-1;i++){
            a=ls1.get(i);
            for(j=i+1;j<ls1.size();j++){
                b=ls1.get(j);
                if(a==b){
                    res.add(j);
                }
            }
        }
       ArrayList<Integer>res1=new ArrayList<>(res);
       Collections.sort(res1);
       return res1;
    }
}