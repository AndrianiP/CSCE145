//Adriani Perez


public class StringHelperTester {

    public static void main(String[] args){
        System.out.println("Welcome to the string tester helper");
        System.out.println("\nTesting has all unique chracters with \"Stev\"");

        System.out.println(StringHelper.hasAllUniqueCharacters("Stev"));

        System.out.println("\nTesting has all unique chracters with \"Steve\"");

        System.out.println(StringHelper.hasAllUniqueCharacters("Steve"));

        System.out.println("\nTesting  mesh strings with 'hello' and 'hi'");

        System.out.println(StringHelper.meshString("harp", "fiddle"));

        System.out.println("\nTesting replace vowels with oodle with 'Adriani'");

        System.out.println(StringHelper.replaceVowelsWithOodle("Adriani"));

        System.out.println("\nTesting weight with 'heavy'");
        System.out.println(StringHelper.weight("heavy"));
        System.out.println("\nTesting weight with 'light'");
        System.out.println(StringHelper.weight("light"));




        




    }
    

}
