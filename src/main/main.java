package main;

import java.util.ArrayList;
import java.util.List;
import model.Histogram;
import model.Mail;
import view.HistogramDisplay;
import view.MailHistogramBuilder;
import view.MailListReader;

public class main {
    
    private static String fileName;
    private static List<Mail> mailList;
    private static Histogram<String> histogram;
    

    public static void main(String[] args) {
        fileName = "C:\\Users\\Cecilia Gimenez\\Documents\\NetBeansProjects\\Kata4\\email.txt";
        execute();
    }
    
    private static void execute(){
        input();
        process();
        output();
    }
    
    private static void input(){
        mailList = MailListReader.read(fileName);
    }
    
    private static void process(){
        histogram = MailHistogramBuilder.build(mailList);
    }
    
    private static void output(){
        new HistogramDisplay(histogram).execute();
    }
    
}
