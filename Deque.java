import java.util.*;
public class Deque {
    public static void main(String[] args){
        ArrayDeque<String> favePop = new ArrayDeque<>();
        popcornDeque(favePop);
    }//close main

    public static void popcornDeque(ArrayDeque<String> favePop){

        favePop.add("White Cheddar");
        favePop.add("Cheddar");
        favePop.add("Extra buttery");
        favePop.add("Caramel");
        favePop.add("Vanilla");

        System.out.println("My favorite flavors of popcorn are:");
        System.out.println(favePop);

        System.out.println("I forgot two flavors, Kettle Corn, which is my absolute favorite so I'll add it to the beginning, and Plain, which is a favorite, but it's lowest on the list, so I'll add it to last: ");
        favePop.addFirst("Kettle Corn");
        favePop.addLast("Plain");
        System.out.println("Now the list is: ");
        System.out.println(favePop);

        System.out.println("I'll add something now to the beginning end of the deque using add()");
        favePop.add("Pepper Corn");
        System.out.println(favePop);

        System.out.println("I like pepper corn but it's not my favorite, I'm going to take it back out of the deque");
        favePop.removeLast();
        System.out.println(favePop);

        System.out.println("The first element in the deque is: " + favePop.peekFirst());
        System.out.println("The last element in the deque is: " + favePop.peekLast());

        System.out.println("I'm going to remove the first element:");
        favePop.removeFirst();
        System.out.println(favePop);

        System.out.println("It's gone, my absolute favorite was taken out and it makes me want to cry, I'm putting it back into first place!");
        favePop.addFirst("Kettle Corn");

        System.out.println("Now I'll remove the last element");
        favePop.removeLast();
        System.out.println(favePop);

        System.out.println("I'm a little on the fence about this being a favorite, but I'll put it back into the list");
        favePop.addLast("Plain");
        System.out.println(favePop);

        System.out.println("Now I'll iterate through the deque:");
        Iterator<String> itr = favePop.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("I need to make sure kettle corn is still in there...because...kettle corn :)");
        if(favePop.contains("Kettle Korn")){
            System.out.println("Sweet, it's still in there!");
        }else{
            System.out.println("Why isn't it in there?! Call the popcorn police! Oh, it's because I spelled it with a K, let's try this again!");
            if(favePop.contains("Kettle Corn")){
                System.out.println("Ah! there it is! I'm saved!");
            }else{
                System.out.println("The Kettle has abandoned me! :(");
            }
        }

        System.out.println("I'm hungry now...thanks a lot...now I have to go buy kettle corn and it's your fault...I'm adding it to my school expenses.");
    }
}//close Deque class
