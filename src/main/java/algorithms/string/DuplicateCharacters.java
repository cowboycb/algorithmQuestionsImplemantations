package algorithms.string;

import algorithms.Algorithm;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class DuplicateCharacters implements Algorithm<Map<Character, Integer>, String> {


    @Override
    public String question() {
        return "Find duplicate characters of a string.";
    }

    @Override
    public Map<Character, Integer> solution(String params) {
        Map<Character, Integer> temp = new HashMap<>();
        IntStream stream = params.chars();
        stream.mapToObj(c -> (char)c).forEach(character -> {
            if (temp.containsKey(character)){
                temp.put(character, temp.get(character)+1);
            }else{
                temp.put(character, 1);
            }
        });
        Map<Character, Integer> result = new HashMap<>();
        temp.forEach((key, value) -> {
            if (value>1){
                result.put(key, value);
            }
        });

        return result;
    }
}
