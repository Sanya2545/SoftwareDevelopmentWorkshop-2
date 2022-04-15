package com.company;

public class Main {

    public static void main(String[] args) {
	    StringBuilder s = new StringBuilder("paster is not a deal!");
        for(int i = 0; i < s.length() - 1; ++i)
        {
            if(s.charAt(i) == 'p' && s.charAt(i+1) == 'a')
            {
                s.setCharAt(i + 1, 'o');
            }
        }
        System.out.println(s);
   }
}
