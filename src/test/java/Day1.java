import org.testng.annotations.Test;

public class Day1 {

    @Test
    public void testFirst001() {
        System.out.println("Hello, World!");
    }

    @Test
    public void test002() {
        System.out.println();
    }


    @Test
    public void testNumber() {
        int myNumber;
        myNumber = 6;

        System.out.println(myNumber);
    }


    @Test
    public void testStrings() {
        int num = 9;
        String s = "I have " + num + " cookies";

        System.out.println(s);
    }


    @Test
    public void testLogicalOperators() {
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
        int a = 2;
        boolean b = a == 4;

        if (a == 4) {
            System.out.println("It's true!");
        }
    }

    @Test
    public void testIfElse() {
        int a = 5;
        int b = 4;

        if (a == b)
            System.out.println("Another line Wow!");
        else
            System.out.println("Double rainbow!");
    }

    @Test
    public void testArrays() {
        int[] arr;

        arr = new int[10];

        System.out.println(arr.length);

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;

        int[] arr1 = {1, 2, 3, 4, 5};

        for (int i=0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}