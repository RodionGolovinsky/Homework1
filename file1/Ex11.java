

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

public class Ex11 {
    public static void main(String[] args) throws Exception {
            FileReader reader = new FileReader("C://Users//Admin//IdeaProjects//Домашнее задание на 18.02.2022//src//Ex1//1.txt");
        PrintWriter writer = new PrintWriter("C://Users//Admin//IdeaProjects//Домашнее задание на 18.02.2022//src//2.txt", "UTF-8");
            Scanner scan = new Scanner(reader);
            Stack<Integer> stack = new Stack<>();
            int c;
        while (scan.hasNext()) {
            int number = scan.nextInt();
            if (number == 0){
                break;
            } else if(number>0) {
                stack.push(number);
            }
        }
        reader.close();
        while (stack.size() != 0){
            Integer a = stack.pop();
            writer.println(a);
        }
        writer.close();
    }
}






