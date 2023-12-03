class MyHashMap {
    HashMap<Integer,Integer>hm=new HashMap<>();
    public MyHashMap() {
      HashMap<Integer,Integer>hm=new HashMap<>();   
    }
    
    public void put(int key, int value) {
        hm.put(key,value);
    }
    
    public int get(int key) {
        if(!hm.containsKey(key)){
            return -1;
        }
        int h=hm.get(key);
        return h;
    }
    
    public void remove(int key) {
        hm.remove(key);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */