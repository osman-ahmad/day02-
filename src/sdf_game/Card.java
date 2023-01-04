package sdf_game;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;



public class Card {
    
    public static void main(String[] args) {

        List<String> numbers = new LinkedList<>();
        
        numbers.add("A");
        numbers.add("2");
        numbers.add("3");
        numbers.add("4");
        numbers.add("5");
        numbers.add("6");
        numbers.add("7");
        numbers.add("8");
        numbers.add("9");
        numbers.add("10");
        numbers.add("J");
        numbers.add("Q");
        numbers.add("K");
        

        
        Map<String, List<String>> cards = new HashMap<>();

        cards.put("spades", numbers);
        cards.put("diamonds", numbers);
        cards.put("hearts", numbers);
        cards.put("clubs", numbers);

        Random random = new Random();
        List<String> keys  = new LinkedList<String>(cards.keySet());
        String randomKey = keys.get(random.nextInt(keys.size()) );
        



        System.out.println(keys);
        System.out.println(randomKey);
        System.out.println(cards);


    }
}
