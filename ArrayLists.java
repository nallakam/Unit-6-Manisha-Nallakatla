import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLists {

    public static void main(String[] args) {
        System.out.println("Test Remove Zeros");
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(3,4,0,0,1,4,0,6,0));
        System.out.println("Starting List: " + nums);
        removeZeros(nums);
        System.out.println("Expected: [3, 4, 1, 4, 6] \n Actual: " + nums);

        System.out.println();

        ArrayList<String> words = new ArrayList<>(Arrays.asList("this", "is", "a", "list", "of", "words"));
        System.out.println("Test Letter Counter:");
        System.out.println(words);
        System.out.println("Expected: 18 \n Actual: " + countLetters(words));

        System.out.println();

        System.out.println("Test keyPosition: find a 1");
        System.out.println(nums);
        System.out.println("Expected: 2 \n Actual: " + findPosition(1, nums));

        System.out.println();

        System.out.println("Test parse into array");
        System.out.println("Expected: [W, e, s, t, , L, i, n, n] \n Actual: " + parseIntoArrayList("West Linn"));

        System.out.println();

        System.out.println("Test FindMin for Personobjects");
        ArrayList<Person> people = new ArrayList<>(Arrays.asList(new Person(32, "Abe"),
                new Person(14, "Betty"), new Person(18, "Cris")));
        System.out.println(people);
        System.out.println("Expected: BETTY \n Actual: " + findMin(people));

        System.out.println();

        System.out.println("Purse Test:");
        Purse myPurse = new Purse();
        myPurse.add(new Coin(.25, "quarter"));
        myPurse.add(new Coin(.05, "nickel"));
        myPurse.add(new Coin(.01, "penny"));
        myPurse.add(new Coin(.25, "quarter"));

        System.out.println(myPurse);
        System.out.println("# of Quarters = " + myPurse.count(new Coin(.25, "quarter")));
        System.out.println("Smallest Coin = " + myPurse.findSmallest());
        System.out.println("Total of Purse = $" + myPurse.getTotal());

    }
    public static void removeZeros(ArrayList<Integer> list) {
        for(int i = 0; i <= list.size(); i++){
            int value = list.get(i);
            if(value == 0){
                list.remove(i);
            }
        }
    }

    public static int countLetters(ArrayList list) {
        int letterCount = 0;
        for(int i = 0; i <= list.size(); i++){
            String string = (String) list.get(i);
            int stringLetterCount = 0;
            for(int j = 0; j < string.length(); j++) {
                if(string.charAt(j) != ' ')
                    stringLetterCount++;
            }
            letterCount = letterCount + stringLetterCount;
        }
        return letterCount;
    }

    public static int findPosition(int keyValue, ArrayList<Integer> list) {
        int position = 0;
        for(int i = 0; i <= list.size(); i++){
            int foundValue = list.get(i);
            if(keyValue == foundValue){
                position = i;
                break;
            }
        }
        return position;
    }

    public static ArrayList parseIntoArrayList(String input){
        ArrayList<String> letters = new ArrayList();
        for (int i = 0; i <= input.length(); i++){
            String letter = input.substring(i, i+1);
            letters.add(letter);
        }
        return letters;
    }

    public static class Person {
        private int myAge;
        private String myName;

        public Person(int age, String name) {
            myAge = age;
            myName = name;
        }

        public int getMyAge(){
            return myAge;
        }

        public String getMyName(){
            return myName;
        }
    }

    public static String findMin(ArrayList <Person> people){
        int young = people.get(0).getMyAge();
        int youngIndex = 0;
        for (int i = 1; i < people.size(); i++){
            if(people.get(1).getMyAge() < young){
                young = people.get(i).getMyAge();
                youngIndex = i;
            }
        }
        return people.get(youngIndex).getMyName();
    }
}
