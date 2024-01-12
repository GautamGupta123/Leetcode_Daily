class solve{
    static String getbin(int i){
        StringBuilder s=new StringBuilder();
        while(i>=1){
            s.append(i%2);
            i/=2;
        }
        return s.reverse().toString();
    }
    static ArrayList<String> generate(int N)
    {
        ArrayList<String>ls=new ArrayList<>();
        int i;
        for(i=1;i<=N;i++){
            ls.add(getbin(i));
        }
        return ls;
    }
}