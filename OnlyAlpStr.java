public class OnlyAlpStr {
    public static void main(String[] args){
        String str = "Hariharan6J";
        boolean all_Alp =true;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            int val = (int) c;
            if(val>=65&&val<=90||val>=97&&val<=122){
                all_Alp = true;
            }
            else{
                all_Alp = false;
                break;
            }
        }
        if(all_Alp){
            System.out.println("All characters are alphabetic");
        }
        else{
            System.out.println("Not all characters are alphabetic");
        }
    }
    
}
