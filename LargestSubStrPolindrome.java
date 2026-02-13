class PalindromeStr{
public static void main(String[] args){
System.out.println("Palindrome_String");
System.out.println("******************");
 String str ="HariraH JagggggaJ DevelllllleveD";
//to store substring from a String
System.out.print("String is:");
System.out.println(str);
  String substr="";
  String strsub="";
       int len =0;
	   String larSub="";// lar substring palindrome
  for(int i =0 ;i<str.length();i++){

     if(str.charAt(i)==' '){

	 //check palindrome
	   for(int j =substr.length()-1; j>=0;j--){
		   strsub = strsub+substr.charAt(j);
	
	   }
	 
	   if(strsub.equals(substr)){
		 
	 if(len<substr.length()){
		 len = substr.length();
         larSub = substr;		 
	   }}


	 substr="";
	 strsub="";
	 
	 }
	 else if(i==str.length()-1){
		 substr = substr+str.charAt(i);
	   
		 for(int j =substr.length()-1; j>=0;j--){
		   strsub = strsub+substr.charAt(j);
		
	   }
	 
	   if(strsub.equals(substr)){
		  
	 if(len<substr.length()){
		 len = substr.length();
         larSub = substr;		 
	   }}

		substr = "";
		
	 }
	 else{
	   substr = substr+str.charAt(i);
	 
	 }
  }
  System.out.println();
  System.out.println("Biggest palindrome is: "+larSub);

}}