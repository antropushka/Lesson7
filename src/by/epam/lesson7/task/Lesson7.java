package by.epam.lesson7.task;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson7 {

    /**
     * Выполнены следующие задачи: task24, task38; task49;
     *
     * @author Tatsiana Tkachova
     */


    public static void main (String[] args) {
        task24();
        task38();
        task49();
        
    }


    public static void task24() {
        Scanner scanner = new Scanner(System.in);
        String userString;
        System.out.println("Введите строку для дальнейшей обработки");
        userString = scanner.nextLine();
        Pattern pattern = Pattern.compile("-?\\b[0-9]+\\b");
        Matcher matcher = pattern.matcher(userString);
        ArrayList<String> words = new ArrayList<String>();
        while (matcher.find()) {
            words.add(userString.substring(matcher.start(), matcher.end()));
        }
        System.out.println(words.toString());
        ArrayList<Integer> result = new ArrayList<Integer>();
        int sum = 0;
        for (String wordsValue : words) {
            result.add(Integer.parseInt(wordsValue));
        }
        for (Integer num : result) {
            sum = sum + num;
        }
        System.out.println(sum);
    }

    public static void task38() {
        Scanner scanner = new Scanner(System.in);
        String userString;
        System.out.println("Введите строку для дальнейшей обработки");
        userString = scanner.nextLine();
        String[] words = userString.split("\\s*(\\s|,|!|\\.)\\s*");
        int numOfWords = words.length;
        System.out.println(numOfWords);
    }
   //49 Вывести в алфавитном порядке все слова, содержащие наибольшее количество гласных букв; найти все слова,
    // в которые буква «а» входит не менее двух раз.
    // сделана половина задачи, просидела кучу времени так и не соображу как сделать вторую часть
   public static void task49() {
       String str = new String("Я заметила, и брат заметил тоже:\n" +
               "Наша бабушка и осень так похожи\n! " +
               "Не успело за пригорком скрыться лето -\n" +
               "Маринадами запахли та и эта!\n");
       Pattern pattern = Pattern.compile("\\b[а-яА-я]*[Аа]+[а-яА-я]*[Аа]+[а-яА-я]*\\b");
       Matcher matcher = pattern.matcher(str);
       System.out.println("The words in which there are more then 2 <A> letters: ");
       while (matcher.find()) {
           System.out.println(str.substring(matcher.start(), matcher.end()));
       }
    }
       
}
