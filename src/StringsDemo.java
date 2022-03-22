import java.util.Locale;

public class StringsDemo {
    public static void main(String[] args) {
        String message=" The weather is good today.     ";
        System.out.println(message);
     /*
        System.out.println(message);
        System.out.println("number of elements: "+message.length());
        System.out.println("5.element"+ message.charAt(4));
        //add your message
        System.out.println(message.concat("Happy!"));
        //bool of message true or false
        System.out.println(message.startsWith("b"));
        System.out.println(message.endsWith("."));
        char[] characters=new char[5];
        message.getChars(0,5,characters,0);
        System.out.println(characters);
        // search character
        System.out.println(message.indexOf('a'));
        //search character from last
        System.out.println(message.lastIndexOf("ay"));*/
        String newMessage=message.replace(' ','-');
        System.out.println(newMessage);
        //message cutting
        System.out.println(message.substring(2));
        System.out.println(message.substring(2,5));
        for(String word:message.split(" ")){
            System.out.println(word);
        }
        System.out.println(message.toLowerCase(Locale.ROOT));
        System.out.println(message.toUpperCase(Locale.ROOT));
        System.out.println(message.trim());

    }
}
