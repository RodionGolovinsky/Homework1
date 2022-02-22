
import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Ex13 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("C://Users//Admin//IdeaProjects//Домашнее задание на 18.02.2022//src//Ex1//1.txt");
        PrintWriter writer = new PrintWriter("C://Users//Admin//IdeaProjects//Домашнее задание на 18.02.2022//src//2.txt", "UTF-8");
        Scanner scan = new Scanner(reader);
        LinkedList<Integer> list = new LinkedList<>();
        int c;
        while (scan.hasNext()) {
            int number = scan.nextInt();
            if (number == 0){
                break;
            } else if(number>0) {
                list.add(number);
            }
        }
        while (list.size() != 0){
            writer.println(list.peekLast());
        }
        writer.close();
    }
}
