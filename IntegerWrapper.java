// Wrapper classes in Java are used for:
// 1) Converting primitive data types into objects (Autoboxing)
// 2) Converting objects back into primitive types (Unboxing)
// 3) Using collections (like ArrayList) which can store only objects, not primitives

// Custom Wrapper Class
class IntegerWrapper {
    private int value;   // primitive data member

    // Constructor to initialize value
    public IntegerWrapper(int value) {
        this.value = value;
    }

    // Getter method to access private value
    public int getValue() {
        return value;
    }

    // Setter method (optional)
    public void setValue(int value) {
        this.value = value;
    }
}

public class WrapperClassesDemo {
    public static void main(String[] args) {

        // 1) Using Custom Wrapper Class
        IntegerWrapper wrappedInt = new IntegerWrapper(10); // constructor call
        System.out.println("Wrapped integer value: " + wrappedInt.getValue());

        
        // 2) Autoboxing (primitive -> object automatically)
        int num = 20;
        Integer obj = num;   // int converted to Integer automatically
        System.out.println("Autoboxing value: " + obj);

        
        // 3) Unboxing (object -> primitive automatically)
        Integer obj2 = 30;
        int num2 = obj2;     // Integer converted to int
        System.out.println("Unboxing value: " + num2);


        // 4) Using Wrapper class in Collection (ArrayList)
        // Collections cannot store primitive types directly
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();

        list.add(100);  // autoboxing (int -> Integer)
        list.add(200);
        list.add(300);

        System.out.println("ArrayList elements:");
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}