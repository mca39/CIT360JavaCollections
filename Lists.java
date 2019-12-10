import java.util.*;

public class Lists {

    public static void main(String[] args) {
        ArrayList<String> colorList = new ArrayList<String>();
        LinkedList<String> namesList = new LinkedList<String>();
        buildColorList(colorList);
        buildNamesList(namesList);
    }

    public static void buildColorList(ArrayList<String> colorList){

        System.out.println("This is an ArrayList, I am using println to display it for now, I'll iterate through the list later to save room on screen: ");
        colorList.add("Purple");
        colorList.add("Red");
        colorList.add("Blue");
        colorList.add("Green");
        colorList.add("Yellow");

        System.out.println(colorList);
        System.out.println();

        System.out.println("Now I'll insert 'Red' after Red because you can have 2 of the same color in a list : ");
        colorList.add(2, "Red");

        System.out.println(colorList);
        System.out.println();

        System.out.println("Now I'll set the second 'Red' to 'Orange': ");
        colorList.set(2, "Orange");

        System.out.println(colorList);
        System.out.println();

        System.out.println("Now I'll remove the 'Orange': ");
        colorList.remove(2);

        System.out.println(colorList);
        System.out.println();

        System.out.println("The color in index 2 is now: ");
        System.out.println(colorList.get(2));

        System.out.println(colorList);
        System.out.println();

        System.out.println("I used println for brevity, the correct way to easily display the list in it's current order is: ");
        //close for loop
        for(String str:colorList) System.out.println(str);

        System.out.println();

        System.out.println("Or you can use an iterator and go either forwards or backwards like this: ");
        for (ListIterator<String> it = colorList.listIterator(colorList.size()); it.hasPrevious(); ){
            String p = it.previous();

        }//close iterator for loop

        System.out.println("Now I'm going to clear the whole list: ");
        int size = colorList.size();

        System.out.println("The current size of the ArrayList is: " + size);
        colorList.clear();

        size = colorList.size();
        System.out.println("After using clear on the ArrayList, the list size is: " + size);
    }//close buildColorList method

    public static void buildNamesList(LinkedList<String> namesList){
        namesList.add("Tracy");
        namesList.add("Hannah");
        namesList.add("Adam");
        namesList.add("Wayne");
        namesList.add("Wilanna");

        System.out.println();
        System.out.println();
        System.out.println("This is a linked list of names: ");

        Iterator<String> itr = namesList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }//close while loop

        System.out.println();
        System.out.println("Now I'm going to Sort the list: ");

        Collections.sort(namesList);
        Iterator<String> iter = namesList.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        System.out.println();
        System.out.println("Now I'll insert the name 'Sarah' into the list: ");

        namesList.add(2, "Sarah");
        Iterator<String> it = namesList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }//close buildNamesLIst method
}//close Lists class