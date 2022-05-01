package Chapter06;

/*
 * 메서드명 : isNumber
 * 기능 : 주어진 문자열이 모두 숫자로만 이루어져있는지 확인한다.
 * 		  모두 숫자로만 이루어져 있으면 true 를 반환하고,
 * 		  그렇지 않으면 false 를 반환한다.
 * 		  만일 주어진 문자열이 null 이거나 빈문자열 "" 이라면 false 를 반환한다.
 * 반환타입 : boolean
 * 매개변수 : String str - 검사할 문자열
 */
public class Exercise6_22 {
	
	public static boolean isNumber(String str) {	
		if(str == null || str.equals("")) {
			return false;
		}
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(!(ch >= '0' && ch <= '9')) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		
		str = "1234ㅇ";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
	}
}
