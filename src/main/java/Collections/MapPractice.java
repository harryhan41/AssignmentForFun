package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapPractice {

    public Object findValueOf(Map map, Object key) {

        return map.get(key);
    }

    public Object[] findKeysOf(Map map, Object value) {
        List<Object> list = new ArrayList<>();
        for(Object key: map.keySet()){
            if(map.get(key).equals(value)){
                list.add(key);
            }
        }

        return list.toArray();
    }

    public Map<Integer, Integer> fibonacciTree(int size) {
        Map<Integer, Integer> map = new HashMap<>();
        if(size <= 0){
            return map;
        }

        if(size == 1){
            map.put(1, 1);
            return map;
        }

        if(size == 2){
            map.put(1, 1);
            map.put(2, 1);
            return map;
        }

        map.put(1, 1);
        map.put(2, 1);

        for(int i = 3; i <= size; i++){
            map.put(i, map.get(i-1) + map.get(i-2));
        }
        return map;
    }

    public Map<Integer, Integer> crazySpiral(Integer first, Integer second, Integer size) {
        Map<Integer, Integer> map = new HashMap<>();
        if(size <= 0){
            return map;
        }

        if(size == 1){
            map.put(1, first);
            return map;
        }

        if(size == 2){
            map.put(1, first);
            map.put(2, second);
            return map;
        }

        map.put(1, first);
        map.put(2, second);
        for(int i = 3; i <= size; i++){
            map.put(i, map.get(i-1)+map.get(i-2));
        }
        return map;
    }
}
