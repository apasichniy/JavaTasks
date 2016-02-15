package lesson1;

import javax.sound.midi.Soundbank;

/**
 * Created by pasichniy on 15-Feb-16.
 */
public class Task1 {
    public static void main(String[] args) {
        String j, f, result1, result2;
        j = "Java";
        f = "forever";
        result1 = String.format("%1$s %2$s", j, f);
        System.out.println(result1);
        result2 = j + " " + f;
        System.out.println(result2);
        System.out.println(j + " " + f);
    }
}
