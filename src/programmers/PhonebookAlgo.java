package programmers;

import java.util.HashMap;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<String, Integer> hMap = new HashMap<>();

        for(String str : phone_book) {
            hMap.put(str, 1);
        }

        for(int i=0; i<phone_book.length; i++)
            for(int j=0; j<phone_book[i].length(); j++)
                if (hMap.containsKey(phone_book[i].substring(0, j))) {
                    answer = false;
                }

        return answer;
    }
}


public class PhonebookAlgo {
    public static void main(String[] args) {
        String[] phone_books = {"119112", "97674223", "119", "976742233"};

        Solution s = new Solution();

        System.out.println(s.solution(phone_books));


    }
}
