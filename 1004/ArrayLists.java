import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {

    public static void main(String[] args) {
    	// Instatiation
        ArrayList<String> list = new ArrayList<String>();

        //Adding
        list.add("B");
        list.add("A");
        list.add("C");

        // Accessing
        String s = list.get(1);
        System.out.println(s);

        // Prints out entire list
        System.out.println(list);

        // Correct way to print out -- each element
        for (int i = 0; i < list.size(); i++) {
		    System.out.println(list.get(i));
		}

		// While loop
		int j = 0;
		while (j < list.size()){
			System.out.println(list.get(j));
			j++;
		}

		// Enhanced for loop
		for (String string: list){
			System.out.println(string);
		}

		// Remove
        list.remove(2);
        System.out.println(list);

        // Sorting
        Collections.sort(list);
        System.out.println(list);



    }

}

