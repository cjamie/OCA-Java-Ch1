package ch1;

/**
 *
 * @author Jamie Chu
 * CHAPTER 1: Java Building Blocks
 * 
 * PURPOSE: To archive multiple Java concepts within 1 succinct file. I will
 * list out multiple java concepts in the summary field. In addition, various 
 * classes will be used to better explain these concepts.
 * 
 * SUMMARY: 
 * (1)Java classes consist of members called fields and methods 
 * 
 * (2)Java's 3 Annotation syntax is (//), (/* *|/) or (/** *|/) for a Javadoc comment
 * 
 * (3)valid signatures for the method ran from command line:  ('args' is arbitrary')
 * ---public static void main(String[] args){}
 * ---public static void main(String... args){}
 * ---public static void main(String args[]{}
 * 
 * (4)java classes are organized into special containers called packages. 
 * ---Maximum of 1 public class per package. 
 * ---May import everything within a package via wildcard (*)
 * 
 * (5)java classes commonly have constructors which create Java objects
 * ---constructors MATCH the class name and omit a return type 
 * ---When an object is instantiated, the order of initialization is as follows: 
 * ======super class -> fields and blocks of code -> constructor 
 * ---best practice is to adopt camelCase convention for methods and capitalize Class names
 * 
 * (6)Primitives are basic Java building blocks (8 types)
 * ---byte (8-bit signed), short (16-bit signed), int (32-bit unsigned), long (64 bit signed)
 * ===float (32-bit IEEE signed precision), double (64-bit IEEE signed precision, 
 * ===boolean, char (16-bit Unicode) 
 * ---numeric literals may be represented in octal (prefix with 0), hexadecimal (prefix 
 * ===with 0x), or binary (prefix with 0b)
 * ---primitives have default values (approximately 0)
 * 
 * (7)Reference types can have methods and be assigned a null value
 * ---default value is null
 * 
 * (8)Variables require a data type and name declaration 
 * ---may contain letters, numbers, $, or _ but may not begin with a number
 * ---Three types of variables: instance variables, class variables, and local variables
 * ===Instance variables are the non static fields of your class
 * ===Class variables are the static fields within your class
 * ===Local variables are variables declared within a method (limited scope)
 * 
 * (9)Java is object-oriented 
 * ---supports encapsulation via access modifiers which protects objects from unintended access
 * ---supports inheritance 
 * ---supports abstraction 
 * ---supports polymorphism 
 * 
 * (10)Garbage collection feature is responsible for removing unused objects from memory to free up space
 * ---objects are eligible for garbage collection when there are no more references to it
 * 
 * (11)Java code (.java) is first compiled into bytecode (.class file) before it is able to run
 * ---bytecode is platform independent, may run anywhere
 * 
 * (12)Java is pass-by-value, not reference
 * 
 * (13)Java supports method overload, but NOT operator overloading
 * 
 * (14)Class elements
 * ---package declaration is first line of file; not required
 * ---imports follows immediately after package; not required
 * ---class declaration follows after imports; required
 * ---field and method declarations anywhere inside a class; not required
 * P.S. Alt+Shift+F is a convenient indent feature
*/ 



/*
 * (1)class WaterBottle has fields 'brand', 'empty', and method 'main'
 * (2)shortcut for annotation is ctrl+enter
 * (3)WaterBottle has a valid main method signature 
 * (4)the WaterBottle class is inside a 'javaintro' package
 * (5) WaterBottle has no explicitly written constructor so java provides a 'default' constructor 
 * (6)boolean declaraction via 'empty' field 
 * (7) wb0 is a reference type that points toward nothing, so it has a null value
 *     wb is a reference type that does point toward a WaterBottle object
 * (9)
    encapsulation- covered in Chapter 4: Methods and Encapsulation 
*/
class WaterBottle {

    private String brand;
    private boolean empty;

//    public static void main(String[] argsbb) {
//        WaterBottle wb0;
//        WaterBottle wb = new WaterBottle();
//        System.out.print("Empty = " + wb.empty);
//        System.out.print(", Brand = " + wb.brand);
//        
//        sayHello();
//    }
//    
    public static void sayHello(){
        System.out.print("Hello!");
    }
}
/*
 * (8)
    local variable- 
        declared within a method, constructor, or a block
        scope is only within the block it is declared
        no default value; MUST be assigned a value before used
    instance variable
        declared within a class but outside a method 
        scope is dependent on its access modifier 
        default value is 0, false, or null depending on the type
    class variable
        declared within a class but outside a method. MUST BE STATIC    
        default value is 0, false, or null depending on the type
    
--- brand is an instance variable
--- brand2 is a class variable


order of initialization 
    (10)
    one points to new string object with value a
    two points to new string object with value b
    two points to one's object that has a value of a
    ---object with value b is not elligible for garbage collection
    three points to object with value a
    one points to nothing(null)
    ---object with value a is still reference by two and three so it is still useful
    (12)
    Since Java is pass by value, System.out.println(two) prints b instead of bb

*/

public class WaterBottle2{
    private String brand;
    private static String brand2;
    public static void main(String[] asrgs){
        String one, two;
        one=new String("a");
        two=new String("b");
        one=two;
        String three=one;
        one=null;
        System.out.println("String brand is instance variable");
        System.out.println("String brand1 is class variable");
        System.out.println("String one two and three are local variable");
        
        appendStrings(two,three);
        System.out.println(two);
    }
    public static String appendStrings(String a, String b){
        a=a+b;
        return a;
    }
}

