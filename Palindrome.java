package com.example.demo4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {
public static String Palindrome(String string) throws IOException {
int count = 0;
String str="aba", rev = "";
String subString = "";
int length = str.length();
for (int i = 0; i < length - 1; i++) {
for (int j = i + 2; j <= length; j++) {
subString = str.substring(i, j);
for (int k = subString.length() - 1; k >= 0; k--) {
rev = rev + subString.charAt(k);
if (subString.equals(rev))

System.out.println("the substring palindromes are:" + subString);

}

subString = "";
rev = "";

}

}
return string;


}


}