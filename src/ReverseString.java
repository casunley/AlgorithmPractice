public class ReverseString {
	
	public static StringBuilder reverseString(String string){
		
		StringBuilder sb = new StringBuilder(string);
		return sb.reverse();
	}
	
	public static String reverseStringNoAPI(String string){
		String temp = ""; 
		for(int i = string.length(); i > 0; i--){
		temp += string.charAt(i-1);
		}		
		
		return temp;
	}
	
	public static void main(String[] args){
		String string = ":D";
		
		System.out.println(reverseString(string));
		System.out.println(reverseStringNoAPI(string));
	}

}
