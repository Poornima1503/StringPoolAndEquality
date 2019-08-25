package learnProgramming;

public class StringPoolAndEquality {

    public static void main(String[] args) {

        String name = "John";
        String anotherName = "John";
        String john = "Jo" + "hn";
        String newName = new String("John");
        // == compares object reference
        System.out.println("name == anotherName is " + (name == anotherName));
        System.out.println("name == john is " + (name == john));
        System.out.println("name == newName is " + (name == newName));

        //Person p1 = new Person();


        int k = 24;
        int i = 8;

//        while(){
////            System.out.println(k);
//
//        }


        System.out.println("************");
        //equals method compares object values
        System.out.println("name equals anotherName is " + (name.equals(anotherName)));
        System.out.println("name equals john is " + (name.equals(john)));
        System.out.println("name equals newName is " + (name.equals(newName)));
//
//        //Prints object reference or memory location
//
        System.out.println("name -> identitiy hashcode = " + System.identityHashCode(name));
        System.out.println("anotherName -> identitiy hashcode = " + System.identityHashCode(anotherName));
        System.out.println("john -> identitiy hashcode = " + System.identityHashCode(john));
        System.out.println("newName -> identitiy hashcode = " + System.identityHashCode(newName));
//
//        String str1 = "abcd";
//        String str2 = "ab";
//        String str3 = "ab"+"cd";
//
//        System.out.println("identity hashcode of str1 is = "+ System.identityHashCode(str1));
//        System.out.println("identity hashcode of str2 is = "+ System.identityHashCode(str2));
//        System.out.println("identity hashcode of str3 is = "+ System.identityHashCode(str3));


    }
    }
