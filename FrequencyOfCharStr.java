class FreqOfcharStr{
 public static void main(String[] args){
  String str ="Java JJDeveloper";
   for(int i =0;i<str.length();i++){
      char c = str.charAt(i);
	  int count =1;
	  if(str.indexOf(c)==i){
		  for(int j=i+1;j<str.length();j++){
		  if(c==str.charAt(j)){
		  count++;
		  }
	   
	  }
  System.out.println(c+": "+count);
 }
 }}
}