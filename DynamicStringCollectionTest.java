import java.util.Scanner;

/**
 * Created by dqi15bierzynski on 04.11.2016.
 *
 * @author Patryk Bierzynski
 */

public class DynamicStringCollectionTest {

    public static void main(String[] args) {
        System.out.println("This class tests the classes DynamicStringArray and DynamicStringList and their methods.");

        System.out.println("\n-------------------------------------------");

        System.out.println("\n---DYNAMIC_STRING_ARRAY---");
        DynamicStringArray arrayTest = new DynamicStringArray();

        System.out.println("\n--APPEND--");

        System.out.println("\nCURRENT:");
        arrayTest.outputList();

        // #1.0
        System.out.println("\n#1.0 Append \"Alice\" to empty list:");
        arrayTest.append("Alice");
        arrayTest.outputList();

        // #1.1
        System.out.println("\n#1.1 Append \"Bob\" to list with one element:");
        arrayTest.append("Bob");
        arrayTest.outputList();

        // #1.2
        System.out.println("\n#1.2 Append \"Charlie\" to list with two elements:");
        arrayTest.append("Charlie");
        arrayTest.outputList();

        System.out.println("\n--DELETE--");

        System.out.println("\n-POSITIVE-");

        System.out.println("\nCURRENT:");
        arrayTest.outputList();

        // #2.0
        System.out.println("\n#2.0 Delete last element while list three elements long:");
        arrayTest.delete(2);
        arrayTest.outputList();

        // #2.1
        System.out.println("\n#2.1 Delete last element while list two elements long:");
        arrayTest.delete(1);
        arrayTest.outputList();

        // #2.2
        System.out.println("\n#2.2 Delete last element while list one element long:");
        arrayTest.delete(0);
        arrayTest.outputList();

        arrayTest.append("Alice");
        arrayTest.append("Bob");
        System.out.println("\nCURRENT:");
        arrayTest.outputList();

        // #2.3
        System.out.println("\n#2.3 Delete first element while list two elements long:");
        arrayTest.delete(0);
        arrayTest.outputList();

        // #2.4
        System.out.println("\n#2.4 Delete first element while list one element long:");
        arrayTest.delete(0);
        arrayTest.outputList();

        System.out.println("\n-NEGATIVE-");

        arrayTest.append("Alice");
        System.out.println("\nCURRENT:");
        arrayTest.outputList();

        // #2.5
        System.out.println("\n#2.5 Delete element with index 3 when list one element long:");
        arrayTest.delete(3);
        arrayTest.outputList();

        arrayTest.delete(0);
        System.out.println("\nCURRENT:");
        arrayTest.outputList();

        // #2.6
        System.out.println("\n#2.6 Delete element with index 0 when list empty:");
        arrayTest.delete(0);
        arrayTest.outputList();

        // #2.7
        System.out.println("\n#2.7 Delete negative index:");
        arrayTest.delete(-1);
        arrayTest.outputList();

        System.out.println("\n--GET--");

        arrayTest.append("Alice");
        arrayTest.append("Bob");
        System.out.println("\nCURRENT:");
        arrayTest.outputList();

        System.out.println("\n-POSITIVE-");

        // #3.0
        System.out.println("\n#3.0 Get first element:");
        System.out.println("   " + arrayTest.get(0));

        // #3.1
        System.out.println("\n#3.1 Get last element:");
        System.out.println("   " + arrayTest.get(1));

        System.out.println("\n-NEGATIVE-");

        // #3.2
        System.out.println("\n#3.2 Get element with index 2:");
        System.out.println("   " + arrayTest.get(2));

        // #3.3
        System.out.println("\n#3.3 Get element with negative index:");
        System.out.println("   " + arrayTest.get(-1));

        System.out.println("\n--INSERT--");

        System.out.println("\n-POSITIVE-");

        arrayTest.delete(0);
        arrayTest.delete(0);
        System.out.println("\nCURRENT:");
        arrayTest.outputList();

        // #4.0
        System.out.println("\n#4.0 Insert \"Alice\" at index 0 in empty list:");
        arrayTest.insert("Alice", 0);
        arrayTest.outputList();

        // #4.1
        System.out.println("\n#4.1 Insert \"Bob\" at index 1 in list with one element:");
        arrayTest.insert("Bob", 1);
        arrayTest.outputList();

        arrayTest.delete(0);
        System.out.println("\nCURRENT:");
        arrayTest.outputList();

        // #4.2
        System.out.println("\n#4.2 Insert \"Alice\" at index 0 in list with one element:");
        arrayTest.insert("Alice", 0);
        arrayTest.outputList();

        // #4.3
        System.out.println("\n#4.3 Insert \"Charlie\" at index 2 in list with two elements:");
        arrayTest.insert("Charlie", 2);
        arrayTest.outputList();

        arrayTest.delete(1);
        System.out.println("\nCURRENT:");
        arrayTest.outputList();

        // #4.4
        System.out.println("\n#4.4 Insert \"Bob\" at index 1 in list with two elements:");
        arrayTest.insert("Bob", 1);
        arrayTest.outputList();

        arrayTest.delete(0);
        System.out.println("\nCURRENT:");
        arrayTest.outputList();

        // #4.5
        System.out.println("\n#4.5 Insert \"Alice\" at index 0 in list with two elements:");
        arrayTest.insert("Alice", 0);
        arrayTest.outputList();

        System.out.println("\n-NEGATIVE-");

        System.out.println("\nCURRENT:");
        arrayTest.outputList();

        // #4.6
        System.out.println("\n#4.6 Insert \"Dave\" at index 4 in List with three elements:");
        arrayTest.insert("Dave", 4);
        arrayTest.outputList();

        // #4.7
        System.out.println("\n#4.7 Insert \"Dave\" at negative index:");
        arrayTest.insert("Dave", -1);
        arrayTest.outputList();

        System.out.println("\n-------------------------------------------");

        System.out.println("\n---DYNAMIC_STRING_LIST---");

        DynamicStringList listTest = new DynamicStringList();

        System.out.println("\n--APPEND--");

        System.out.println("\nCURRENT:");
        listTest.outputList();

        // #1.0
        System.out.println("\n#1.0 Append \"Alice\" to empty list:");
        listTest.append("Alice");
        listTest.outputList();

        // #1.1
        System.out.println("\n#1.1 Append \"Bob\" to list with one element:");
        listTest.append("Bob");
        listTest.outputList();

        // #1.2
        System.out.println("\n#1.2 Append \"Charlie\" to list with two elements:");
        listTest.append("Charlie");
        listTest.outputList();

        System.out.println("\n--DELETE--");

        System.out.println("\n-POSITIVE-");

        System.out.println("\nCURRENT:");
        listTest.outputList();


        // #2.0
        System.out.println("\n#2.0 Delete last element while list three elements long:");
        listTest.delete(2);
        listTest.outputList();

        // #2.1
        System.out.println("\n#2.1 Delete last element while list two elements long:");
        listTest.delete(1);
        listTest.outputList();

        // #2.2
        System.out.println("\n#2.2 Delete last element while list one element long:");
        listTest.delete(0);
        listTest.outputList();

        listTest.append("Alice");
        listTest.append("Bob");
        System.out.println("\nCURRENT:");
        listTest.outputList();

        // #2.3
        System.out.println("\n#2.3 Delete first element while list two elements long:");
        listTest.delete(0);
        listTest.outputList();

        // #2.4
        System.out.println("\n#2.4 Delete first element while list one element long:");
        listTest.delete(0);
        listTest.outputList();

        System.out.println("\n-NEGATIVE-");

        listTest.append("Alice");
        System.out.println("\nCURRENT:");
        listTest.outputList();

        // #2.5
        System.out.println("\n#2.5 Delete element with index 3 when list one element long:");
        listTest.delete(3);
        listTest.outputList();

        listTest.delete(0);
        System.out.println("\nCURRENT:");
        listTest.outputList();

        // #2.6
        System.out.println("\n#2.6 Delete element with index 0 when list empty:");
        listTest.delete(0);
        listTest.outputList();

        // #2.7
        System.out.println("\n#2.7 Delete negative index:");
        listTest.delete(-1);
        listTest.outputList();

        System.out.println("\n--GET--");

        listTest.append("Alice");
        listTest.append("Bob");
        System.out.println("\nCURRENT:");
        listTest.outputList();

        System.out.println("\n-POSITIVE-");

        // #3.0
        System.out.println("\n#3.0 Get first element:");
        System.out.println("   " + listTest.get(0));

        // #3.1
        System.out.println("\n#3.1 Get last element:");
        System.out.println("   " + listTest.get(1));

        System.out.println("\n-NEGATIVE-");

        // #3.2
        System.out.println("\n#3.2 Get element with index 2:");
        System.out.println("   " + listTest.get(2));

        // #3.3
        System.out.println("\n#3.3 Get element with negative index:");
        System.out.println("   " + listTest.get(-1));

        System.out.println("\n--INSERT--");

        System.out.println("\n-POSITIVE-");

        listTest.delete(0);
        listTest.delete(0);
        System.out.println("\nCURRENT:");
        listTest.outputList();

        // #4.0
        System.out.println("\n#4.0 Insert \"Alice\" at index 0 in empty list:");
        listTest.insert("Alice", 0);
        listTest.outputList();

        // #4.1
        System.out.println("\n#4.1 Insert \"Bob\" at index 1 in list with one element:");
        listTest.insert("Bob", 1);
        listTest.outputList();

        listTest.delete(0);
        System.out.println("\nCURRENT:");
        listTest.outputList();

        // #4.2
        System.out.println("\n#4.2 Insert \"Alice\" at index 0 in list with one element:");
        listTest.insert("Alice", 0);
        listTest.outputList();

        // #4.3
        System.out.println("\n#4.3 Insert \"Charlie\" at index 2 in list with two elements:");
        listTest.insert("Charlie", 2);
        listTest.outputList();

        listTest.delete(1);
        System.out.println("\nCURRENT:");
        listTest.outputList();

        // #4.4
        System.out.println("\n#4.4 Insert \"Bob\" at index 1 in list with two elements:");
        listTest.insert("Bob", 1);
        listTest.outputList();

        listTest.delete(0);
        System.out.println("\nCURRENT:");
        listTest.outputList();

        // #4.5
        System.out.println("\n#4.5 Insert \"Alice\" at index 0 in list with two elements:");
        listTest.insert("Alice", 0);
        listTest.outputList();

        System.out.println("\n-NEGATIVE-");

        System.out.println("\nCURRENT:");
        listTest.outputList();

        // #4.6
        System.out.println("\n#4.6 Insert \"Dave\" at index 4 in List with three elements:");
        listTest.insert("Dave", 4);
        listTest.outputList();

        // #4.7
        System.out.println("\n#4.7 Insert \"Dave\" at negative index:");
        listTest.insert("Dave", -1);
        listTest.outputList();
    }
}