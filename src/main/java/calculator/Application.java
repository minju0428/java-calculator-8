package calculator;

import camp.nextstep.edu.missionutils.Console;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

        System.out.println("덧셈할 문자열을 입력해 주세요.");
        String cal = Console.readLine();
        String [] parts = split(cal);




        int result = sum(parts);
        System.out.print("결과 : " + result);

    }
    private static String[] split(String cal ){
        if(cal.startsWith("//")) {
            int del = cal.indexOf("\\n");
            if(del == -1) {
                throw new IllegalArgumentException();
            }
            String custom = cal.substring(2, del);
            String numbersPart = cal.substring(del + 2);
            return numbersPart.split(custom);

        }  else {
            if (cal.isEmpty()) {
                return new String[0];
            } else {
                return cal.split(",|:");
            }
        }
    }

    private static int sum(String[] parts){
        int resultValue = 0;
        for (int j=0; j<parts.length; j++){

            if (parts[j].isEmpty()) continue;

            try {
                int number = Integer.parseInt(parts[j]);
                if(number >0) {
                    resultValue += number;
                } else {
                    throw new IllegalArgumentException();
                }

            } catch (NumberFormatException e){
                throw new IllegalArgumentException();
            }


        }
        return resultValue;
    }


}

