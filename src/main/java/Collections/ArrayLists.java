package Collections;

import org.omg.CORBA.INTERNAL;

import java.util.*;

public class ArrayLists {

    public ArrayList<Integer> addShit(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> res = new ArrayList<>();
        res.addAll(list1);
        res.addAll(list2);
        return res;
    }

    public Integer addShitTogether(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        list1.addAll(list2);
        int sum = list1.stream().mapToInt(n -> n).sum();
        return sum;
    }

    public ArrayList<Integer> removeAll(ArrayList<Integer> original, Integer toRemove) {
        ArrayList<Integer> res = new ArrayList<>(original);
        res.removeIf(a -> a.equals(toRemove));
        System.out.println(res);
        return res;
    }

    public boolean happyList(ArrayList<String> original) {
        if(original.size() == 1){
            return true;
        }

        for(int i = 0; i < original.size() - 1; i++){
            if(!isHappy(original.get(i), original.get(i+1))){
                return false;
            }
        }

        return true;
    }

    public boolean isHappy(String a, String b){
        HashSet<Character> set = new HashSet<>();
        for(char c : a.toLowerCase().toCharArray()){
            set.add(c);
        }

        for(int i = 0; i < b.length(); i++){
            char c = b.charAt(i);
            if(set.contains(c)){
                return true;
            }
        }

        return false;
    }
}
