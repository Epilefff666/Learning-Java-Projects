

public class Main {

//    ## Exercises from javaSE learning
//
//1. Create a small program that defines some fields. Try creating some
//    illegal field names and see what kind of error the compiler produces.
//    Use the naming rules and conventions as a guide.
//2. In the program you created in Exercise 1, try leaving the fields
//    uninitialized and print out their values. Try the same with a local
//    variable and see what kind of compiler errors you can produce. Becoming
//    familiar with common compiler errors will make it easier to recognize
//    bugs in your code.

    int firstValue;
    Integer secondValue;

    public void showUninitializedVariable(){
        System.out.println(firstValue);
        System.out.println(secondValue);
    }
    public void showUninitializedLocalVariable (){
        int variable1;
        String variable2;
        //System.out.println(variable1);
        //System.out.println(variable2);
        //error :14:28 java: variable variable1 might not have been initialized
    }

    public static void main(String[] args) {

        // valid field names
        int $numero1 = 1; // valid but not recommended
        int _numero2 = 2; // valid but not recommended
        int NUMERO_TRES = 3; // valid but only when it's "static final int NUMERO_TRES =3"  it means when it is a constant variable
        int numeroCuatro = 4; // valid and common good practice
        int numero5 = 5; // valid

        //
        // ❌ Invalid field names (will cause compile-time errors)
        // int 2cool = 10;         // Error: cannot start with a digit
        // String class = "Math";  // Error: 'class' is a reserved keyword
        // double my-salary = 4500.0; // Error: '-' is not allowed in identifiers
        // boolean is Active = false; // Error: space is not allowed in identifiers
        // int @value = 5;         // Error: '@' is not allowed

        System.out.println($numero1+ " / " + _numero2 + " / " + NUMERO_TRES + " / " + numeroCuatro + " / " + numero5);

        Main main = new Main();
        main.showUninitializedVariable();
        main.showUninitializedLocalVariable();


    }
}