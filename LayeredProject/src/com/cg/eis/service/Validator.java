package com.cg.eis.service;
public class Validator {
	 String eidpattern="[1-9][0-9][0-9]";
	 String salary="[1-9]*+[.]*+[0-9]*";
  public static boolean validatedate(String data, String Pattern) {
		return data.matches(Pattern);
		
	}
}
