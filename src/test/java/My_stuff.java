import org.testng.annotations.Test;

import java.util.Arrays;

public class My_stuff {

    @Test
    public void testFirst001() {
        System.out.println("Hello, World!");
    }
    @Test
    public void testNumber() {
        int myNumber;
        myNumber = 9;

        System.out.println(myNumber);
    }
    //this a test for Bashir
    @Test
    public void testStrings(){
        int num = 9;
        String s = "I have " + num + " apples";
        System.out.println(s);
    }
    @Test
    public void testBoolean(){
        boolean b = false;
        b = true;
        boolean toBe = false;
        b = toBe || !toBe;

        if (b) {
            System.out.println(toBe);
        }

    }
    @Test
    public void testIfStatements() {
        int a = 4  ;
        boolean b = a == 4;

        if (a == 4) {
            System.out.println("It's true!");
        }
    }
    // labing class # 2
    @Test
    public void testPrintEvenNumbers(){
        for (int i = 1; i <= 10; i++) {
            if (i%2==0) System.out.println(i);
        }
    }
    @Test
    public void printHelloAtEvenNumbers(){
        for (int i = 1; i <= 10; i++) {
            if (i%2==0) System.out.println("Hello World");
        }
    }
    @Test
    public void swapTwoNumbersInArray() {
        int[] array = {1,2,3,4};
        swap(array, 0, 1);
        System.out.println(Arrays.toString(array));
    }
    private void swap(int[] array, int indexL, int indexR) {
        int temp = array[indexL];
        array[indexL] = array[indexR];
        array[indexR] = temp;
    }
    @Test
    public void testCountLetters() {
        String input = "Hello World";
        int result = 0;
        for (char eachChar : input.toCharArray()) {
            if (eachChar == 'l') result++;
        }
        System.out.print(result);
        //refactor this to try other method  look into strings go over polindrome to see how it can be used for this task
    }
    @Test
    public void TestConstructorTest() {
        Actor InstanceOfActor = new Actor("Name", "LastName");
        InstanceOfActor.play();
        InstanceOfActor.act();
    }



}