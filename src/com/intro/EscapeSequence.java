package com.intro;

public class EscapeSequence {
    public static void main(String[] args) {
//        making it so that when the message is printed, Ousman is surrounded in double-quotes
        String message = "Hello \"Ousman\"";
        System.out.println(message);
/*        when writing file paths, back slashes are needed, however, java thinks we're trying to break the string, so use double back slashes to write paths*/
        String path = "c:\\Users\\Ousman\\Desktop\\SoftwareEngineering\\Multiverse\\Java";
        System.out.println(path);
//        use \n to break a string into another line
        String path2 = "c:\\Users\nOusman\\Desktop\\SoftwareEngineering\\Multiverse\\Java";
        System.out.println(path2);
//        use \t in a string to add indentation
        String path3 = "c:\\Users\nOusman\\\tDesktop\\SoftwareEngineering\\Multiverse\\Java";
        System.out.println(path3);
    }
}
