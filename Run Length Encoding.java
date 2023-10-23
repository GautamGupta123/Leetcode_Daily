class GfG
 {
	String encode(String str)
	{
	  int c=1;
	  StringBuilder s=new StringBuilder();
	  char arr[]=str.toCharArray();
	  int i;
	  if(arr.length==1){
	      s.append(arr[0]);
	      s.append(1);
	      return s.toString();
	  }
	  for(i=0;i<arr.length-1;i++){
	      if(arr[i]==arr[i+1]){
	          c++;
	      }
	      if(arr[i]!=arr[i+1] || i==(arr.length-2)){
	          s.append(arr[i]);
	          s.append(c);
	          c=1;
	      }
	  }
	  if(arr[arr.length-2]!=arr[arr.length-1]){
            s.append(arr[arr.length-1]);
              s.append(1);
        }
	  String str1=s.toString();
	  return str1;
	}
 }