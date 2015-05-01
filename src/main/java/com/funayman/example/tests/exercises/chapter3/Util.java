package com.funayman.example.tests.exercises.chapter3;

import java.util.List;
import java.util.ArrayList;

public class Util {
  /*Code From Book */
  /*
  public static String reverse(String s) {
    List<String> tempArray = new ArrayList<String>(s.length());

    for(int i=0; i<s.length(); i++) {
      tempArray.add(s.substring(i, i+1));
    }

    StringBuilder reversedString = new StringBuilder(s.length());
    for (int i = tempArray.size() - 1; i >= 0; i--) {
      reversedString.append(tempArray.get(i));
    }

    return reversedString.toString();
  }
  */

  /* My code */
  public static String reverse(String s) {
    if (s == null) return null;
    if (s.isEmpty()) return "";

    StringBuilder sb = new StringBuilder(s.length());
    for (int i = s.length() - 1; i>=0; i--) {
      sb.append(s.charAt(i));
    }

    return sb.toString();
  }
}
