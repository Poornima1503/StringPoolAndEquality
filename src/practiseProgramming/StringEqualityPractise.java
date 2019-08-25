package practiseProgramming;

public class StringEqualityPractise {
    public static void main(String[] args) {

        String first_name = "Poornima";
        String last_name = "Srinivasan";
        String  full_name = "Poornima"+"Srinivasan";
        String name = "Poornima";
        String poornima = "poornima";
        String anotherName = new String(full_name);
        String finalName = "PoornimaSrinivasan";


        System.out.println( first_name == name ); //compares object reference
        System.out.println(first_name .equals(name)); // compares values
        System.out.println( first_name== poornima);// Poornima and poornima are stored in different location in the memory
        System.out.println(first_name.equals(poornima));// Compares values and returns false
        System.out.println( (full_name==anotherName));// stored in two different objects in the memory
        System.out.println( (full_name==finalName));//   values are in String pool having same object reference
        System.out.println( full_name.equals(finalName));//
        System.out.println(full_name.equals(anotherName));//compares values and returns true
    }
}
