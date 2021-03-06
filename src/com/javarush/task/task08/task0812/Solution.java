package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(Integer.getInteger(br.readLine()));
            }
        int count = 1;
        int max_count = 1;

        for (int i = 1; i < 10; i++) {

            if (list.get(i-1)!=list.get(i))
                count = 1;
            else {
                count++;
                if (count > max_count)
                    max_count = count;
            }
        }

        System.out.println(max_count);
    }
}
