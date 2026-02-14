class RemoveDupChar{
	
public static void main
(String[] args){
	String s ="HHAAaaRR";
	String sog="";
	for(int i=0;i<s.length();i++){
		char c = s.charAt(i);
		if(i==s.indexOf(c)){
			sog =sog+s.charAt(i);
	
		}
	}
	System.out.println(sog);
}
	
}