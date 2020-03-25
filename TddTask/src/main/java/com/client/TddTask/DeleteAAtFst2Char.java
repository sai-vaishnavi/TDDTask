package com.client.TddTask;

public class DeleteAAtFst2Char {


public String DeleteChar(String s) {
	StringBuilder sb = new StringBuilder(s);
	   String result=s;
	   if(s.length()>0) {
if(sb.charAt(0)=='A'){
		sb.deleteCharAt(0);
	}
	else if(sb.charAt(1)=='A') {
		sb.deleteCharAt(1);
	}
result=sb.toString();
	   }
	   return result;
}
}
