import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class Day3 {

    @Test
    public void testPrintEvenNumbers() {
        for (int i = 1; i <= 10; i++) {
            if (i%2==0) System.out.println(i);
        }
    }

    @Test
    public void testPrintOddNumbers() {
        for (int i = 5; i <= 50; i++) {
            if (i%2==1) System.out.println(i);
        }
    }

    @Test
    public void printHelloAtEvenNumbers() {
        for (int i = 1; i <= 10; i++) {
            if (i%2==0) System.out.println("hello world");
        }
    }

    @Test
    public void swapTwoNumbersInArray() {
        int[] array = {1,2,3,4};

        swap(array, 1, 2);
        printArray(array);
    }

    @Test
    public void swapTwoNumbersInArrayNegative() {
        int[] array = {1,2,3,4};

        swap(array, 1, 2);
        printArray(array);
    }

    private void swap(int[] array, int indexL, int indexR) {
        int temp = array[indexL];
        array[indexL] = array[indexR];
        array[indexR] = temp;
    }

    @Test
    public void swapTwoNumbersInArray002() {
        int[] array = {1,2,3,4};
        printArray(array);
    }
    private void printArray(int[] inputArray) {
        String arrayToStr = Arrays.toString(inputArray);
        System.out.println(arrayToStr);
    }

    //TODO: refactor this
    @Test
    public void testCountLetters() {
        String input = "hello world";
        int result = 0;
        for(char eachChar : input.toCharArray()){
            if(eachChar== 'l') result++;
        }
        System.out.println(result);
    }

    //TODO: using https://docs.oracle.com/javase/tutorial/java/data/strings.html
    //TODO: write a refactored code


    //TODO: create your own class, use constructors, write tests
    @Test
    public void testContructorTest() {
        Actor instanceOfActor = new Actor("Name", "Lastname");

        instanceOfActor.play();
        instanceOfActor.act();
    }


    @Test
    public void testWhileLoops() {
        int i = 0;
        while (i < 5) {
            System.out.println("While loop: i = " + i);
            i++;
        }
    }

    @Test
    public void testArrays() {
        int[] array = {1,2,3,4,5};
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        arrayList.add(1);
        arrayList.add(2);
    }

    @Test
    public void testActorsArray() {
        Actor[] actors = new Actor[10];

        Actor myNewActor = new Actor("Name1", "Name1");
        Actor myNewActor2 = new Actor("Name2", "Name2");

        actors[0] = myNewActor;

        ArrayList<Actor> actorArrayList = new ArrayList<Actor>();


        actorArrayList.add(myNewActor2);
        actorArrayList.add(myNewActor);

    }
}