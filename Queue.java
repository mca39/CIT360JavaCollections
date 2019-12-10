import java.util.*;

public class Queue {

    public static void main(String[] args) {
        PriorityQueue<String> names = new PriorityQueue<>();
        namesQueue(names);
    }//close main method

    public static void namesQueue(PriorityQueue<String> names){
        names.add("Sarah");
        names.add("William");
        names.add("Mariah");
        names.add("Thomas");
        names.add("Hannah");
        names.add("Adam");

        System.out.println("This is a priority queue collection:");
        System.out.println(names);
        System.out.println("The head of the queue (the last element in natural order) is: " + names.peek());
        System.out.println("Now let's remove the return and remove the head");
        names.poll();
        System.out.println(names);
        System.out.println("The new head is:" + names.peek());
        System.out.println("Let's add Adam back in and then display the priotiry queue in alphabetical order:");
        names.add("Adam");
        while(!names.isEmpty()){
            System.out.println(names.poll());
        }

        System.out.println("Now our list should be empty. Yes?");
        if(names.isEmpty()){
            System.out.print("Yup, it's empty now, let's fill it again:");
            names.add("Sarah");
            names.add("William");
            names.add("Mariah");
            names.add("Thomas");
            names.add("Hannah");
            names.add("Adam");
            System.out.println(names);
        }else{
            System.out.println("Whoops, it's not empty, I must have done something wrong");
        }

        System.out.println("Now I'll iterate through the priority Queue");
        Iterator<String> itr = names.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("Now I'll remove Mariah from the list:");
        names.remove("Mariah");
        System.out.println(names);
        System.out.println("Now I'll put her back in");
        names.add("Mariah");
        System.out.println("Let's make sure the queue now contains Mariah:");
        if(names.contains("Mariah")){
            System.out.println("Yes, the list contains Mariah, see for yourself: ");
            System.out.println(names);
        }else{
            System.out.println("Whoops, I failed to add Mariah back in...my bad");
        }
    }//close namesQueue method
}//close Queue class
