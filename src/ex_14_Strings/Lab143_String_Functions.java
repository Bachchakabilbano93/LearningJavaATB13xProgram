package ex_14_Strings;

public class Lab143_String_Functions {
    public static void main(String[] args) {

        String name = "Gutur";// 0,1,2,3,4
        System.out.println(name.length());
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(4));

//        System.out.println(name.charAt(10)); // java.lang.StringIndexOutOfBoundsException

        System.out.println(name.concat(" Bhattacharya"));

        // 3. contains()
        System.out.println(name.contains("om"));

        // 4. equals()
        System.out.println(name.equals("Gutur"));

        // 5. equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("gutur"));


        // 6. indexOf() //  Gutur -> ? u
        System.out.println(name.indexOf('u'));

        String s1 = "madam";
        // Returns the index within this string of the
        // first occurrence of the specified substring.
        System.out.println(s1.indexOf("m"));

        System.out.println(s1.lastIndexOf("m"));

        // 7. length()
        System.out.println(name.length());

        // 8. replace( , ) // Gutur
        System.out.println(name.replace('t', 'T'));

        // 9. split()
        String name4 = "abir@SDET@gmail.com";
        String[] split_name4 = name4.split("@");
        System.out.println(split_name4[0]);
        System.out.println(split_name4[1]);
        System.out.println(split_name4[2]);

        // 10. substring( , ) , gutur
        System.out.println(name.substring(1,3));

        // 11. toLowerCase()
        System.out.println("GUTUR".toLowerCase());

        // 12. toUpperCase()
        System.out.println("gutur".toUpperCase());

        // 14. startsWith()
        System.out.println(name.startsWith("G"));

        // 15. endsWith()
        System.out.println(name.endsWith("r"));

        String anotherPalindrome = "Niagara. O roar again!";
        System.out.println(anotherPalindrome.length());

        String extract = anotherPalindrome.substring(11,15);
        System.out.println(extract);

        // Concatenation(By +)
        String s111 = "Hello";
        String s222 = "World";

        String s333 = "ji";
        String result1 = s111 + s333 + s222;
        System.out.println(result1);

        String n = "AbirbHATT";
        System.out.println(n.indexOf('b'));
        System.out.println(n.lastIndexOf('b'));
        System.out.println(n.lastIndexOf("s"));

    }
}
