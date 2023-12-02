package main.java.Programs;

public class RemoveSpecialCharacterFromString {


    public static void main(String[] args) {
        RemoveSpecialCharacterFromString.removeSpecialCharacter();
    }

    public static void removeSpecialCharacter() {
        String s =  "Hel@$###lo^*#@";
        s = s.replaceAll("[^A-Za-z0-9]","");
        System.out.println(s);
    }

}
