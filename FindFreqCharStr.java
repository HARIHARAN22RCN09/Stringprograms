class ArrStr{
  public static void main(String[] args){
   String name = "HaaaaHHRR";
   int len = name.length();
   char a[] = new char[len];
   char b[] = new char[len];
   
   for(int i =0;i<len;i++){
     a[i]= name.charAt(i);
	 b[i]= name.charAt(i);
   }
   for(int i =0;i<len;i++){
      int count =1;
      if(a[i]==0){
		
		  continue;
	  }
	  else{
	  for(int j=i+1;j<len;j++){
	    if(a[i]==a[j]){
		count++;
	a[j]=0;
		
		}
	  }
  System.out.println(a[i]+":"+count);
	  }
	
   }
   
  }
}
