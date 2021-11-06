package practice;

public class builderAndBuffer {
    public static void main(String[] args) {
            /*
    Difference between String vs StringBuilder
    String is a immutable object, once the object is created it can not be modified.
    Only way to modify the String is by concatenating and reassigning a new values.
    Concatenating actually creates a new object in the memory where the original object is not touched
    .concat() -> create the object in the heap.
    [ But String can be assigned literal values. ]
    StringBuilder is a mutable representation of String.
    We can modify the original object which avoids creating too many String objects in the heap memory.
    [ StringBuilder can not be assigned with a literal values. ]
    The hashCode() method returns a unique identifier for each object
    When to use which one :
    -If a string is going to remain constant throughout the program,
     then use the String class object because a String object is immutable.
    -If a string can change (for example: lots of logic and operations in the construction of the string)
     and will only be accessed from a single thread, using a StringBuilder is good enough.
    -If a string can change and will be accessed from multiple threads,
     use a StringBuffer because StringBuffer is synchronous, so you have thread-safety.
    -If you don't want thread-safety than you can also go with StringBuilder class as it is not synchronized.
     */
    }
}
