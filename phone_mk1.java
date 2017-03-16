package education;
import java.util.*;

public class Phone_mk1{
	public static void main (String[] args){
		//public void class phone_n(){
			String S = "123123-101231023 12 122 3   123121-";
			int length = S.length();
		    char s_ch1 = ' ';
		    char s_ch2 = '-';
		    ArrayList<String> phone_number = new ArrayList<String>();
		    int block_of_3 = 3;
		    for (int i = 0; i < length; ++i) {
		        if (S.charAt(i) != s_ch1 && S.charAt(i) != s_ch2 ) {
		        	String a = Character.toString(S.charAt(i));
		        	phone_number.add(a);
		        	block_of_3--;
		        	if (block_of_3 == 0){
		        		phone_number.add("-");
		        		block_of_3 = 3;
		        	}
		        	else{
		        		
		        	}
		        }
		         System.out.println(phone_number);
		}

		
	}
	}
//}




/*

public class Phone_number(String S){
	String S;
	char[] phone_ch = new S.toCharArray();
	int number_pask = 3;
	//char[] phone_number = new phone_number();
	Char[] phone_number = new char[];
		for (char ch : phone_ch) {
			if (ch!=' '|| ch!='-'){
				phone_number.Add(ch);
				number_pack--;
				if (number_pack == 0){
					number_pack = 3;
					phone_number.Add('-');
				}
				                                                                    
			}
			
		}
		System.out.println(char[phone_number]);
;
}
*/
