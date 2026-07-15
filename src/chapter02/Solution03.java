package chapter02;

public class Solution03 {
    private int someField;

    // For example, you can change an instance variable and return its new value
    public int setSomeField(int someValue) {
        this.someField = someValue;
        return this.someField;
    }

    // A method that simply prints the value of an instance variable is an accessor
    // because it does not change the object's state.
    public void printSomeField() {
        System.out.println(this.someField);
    }

    public static void main(String[] args) {
        Solution03 obj = new Solution03();
        int value = obj.setSomeField(10);
        System.out.println("New value of someField: " + value);
        obj.printSomeField();
    }
}
