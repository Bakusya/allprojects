package javaLoops.BreakStatement;

public class BreakStatementClass {
    public static void main(String[] args) {

                int num = 0;
                while (num <= 10){
                    System.out.println("Number " + num);
                    if (num == 4){
                        break;
                    }
                    num++;
                }
                int time = 12;
                while (time <= 17){
                    if (time == 12){
                        System.out.println("We are going for lunch");
                        break;
                    }
                }
            }
        }

