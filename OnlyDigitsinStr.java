class CheckAllCharDigitsStr{
   
   String str ="12345";
   boolean all_Digits =true;
   public static void main(String[] args){
	   CheckAllCharDigitsStr ck = new CheckAllCharDigitsStr();
	    
	   for(int i=0;i<ck.str.length();i++){
		   char c = ck.str.charAt(i);
		   int val = (int) c;
		  
		   if(val>=48&&val<=57){//`
			   ck.all_Digits =true;
			  
			   
		   }
		   else{
			   ck.all_Digits =false;
			   break;
		   }
		  
		   
	   }
	   if(ck.all_Digits==false){
		    System.out.println("Not all the characters are Digits");
	   }
	   else{
		    System.out.println("All the characters are Digits");
	   }
	   
   }
}