package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        //напишите тут ваш код
        ArrayList<String> lst = new ArrayList<>();

        StringBuffer current_part = new StringBuffer();
        StringBuffer cleaned_str = new StringBuffer(string.trim());

        // String strm = s.trim();
        for (int i=0;i<cleaned_str.length(); i++) {
            if (cleaned_str.substring(i, i+1).equals(" ") == false) {
                current_part.append(cleaned_str.substring(i, i+1));
            }

            if (cleaned_str.substring(i, i+1).equals(" ") == true || i == cleaned_str.length()-1) {
                if (current_part.length() >0) {
                    lst.add(current_part.toString());
                    current_part = new StringBuffer();
                }
            }
        }

        StringBuffer res = new StringBuffer();
        for (String str: lst) {
            //System.out.println(str);
            res.append(str.substring(0,1).toUpperCase()+str.substring(1)+" ");
        }

        System.out.println(res);
    }
}