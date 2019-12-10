import java.util.*;

public class Sets {
    public static void main(String[] args) {
        Set<String> cardsSet = new HashSet<>();
        buildCardSet(cardsSet);
    }//Close main

    public static void buildCardSet(Set<String> cardsSet) {

        boolean empty = cardsSet.isEmpty();
        if (empty) {
            System.out.println("Is the set built yet?" + " Nope, hasn't happened yet, wait for iiiiiiitttt....");
        } else {
            System.out.println("Yup, and that's kind of weird because I haven't added anything yet...");
        }

        cardsSet.add("King");
        cardsSet.add("Queen");
        cardsSet.add("Jack");
        cardsSet.add("Ten");
        cardsSet.add("Nine");
        cardsSet.add("Eight");
        cardsSet.add("Seven");
        cardsSet.add("Six");
        cardsSet.add("Five");
        cardsSet.add("Four");
        cardsSet.add("Three");
        cardsSet.add("Two");
        cardsSet.add("Ace");

        System.out.println();
        empty = cardsSet.isEmpty();
        if (empty) {
            System.out.println("Now is the set built?" + " Nope, hasn't happened yet, I failed 0_0");
        } else {
            System.out.println("Yay success! Now here's a set of cards:");
        }

        System.out.println(cardsSet);

        System.out.println();
        System.out.println("You can also print it out using an iterator: ");
        Iterator<String> iter = cardsSet.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }//Close while loop

        System.out.println();
        System.out.println("Does the set of cards contain a Seven?");
        boolean containsSeven = cardsSet.contains("Seven");

        if (containsSeven) {
            System.out.println("Yes");
        } else {
            System.out.println("No, the Seven card is missing!");
        }//End elseif statement

        System.out.println();
        System.out.println("Now let's remove 'Seven', here's the new set: ");
        cardsSet.remove("Seven");
        System.out.println(cardsSet);

        System.out.println();
        System.out.println("My bad, that makes the set incomplete, I'm adding it back in now:");
        cardsSet.add("Seven");
        System.out.println(cardsSet);
    }//Close buildCardSet method
}//Close Sets class
