package level0;

public class Solution021 {
	public static String solution(String code) {
        String answer = "";
        char arr[] = new char[code.length()];
        int mode = 0;
        
        for(int i=0; i<arr.length; i++) {
        	if(code.charAt(i) == '1') {
        		if(mode == 0) {
        			mode = 1;
        		} else {
        			mode = 0;
        		}
        	}
        	if(mode == 0) {
        		if(i%2 == 0) {
        			if(code.charAt(i) != '1') {
        				answer = answer + code.charAt(i);
        			}
        		}
        	} else {
        		if(i%2 == 1) {
        			if(code.charAt(i) != '1') {        				
        				answer = answer + code.charAt(i);
        			}
        		}
        	}
        }
        
        if(answer.equals("")) {
        	answer = "EMPTY";
        }
        
        return answer;
    }
	
	public static void main(String args[]) {
		solution("abc1abc1abc");
	}
}