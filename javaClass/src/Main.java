//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        /* 변수 선언과 초기화
        int score;
        //  System.out.println(score);
        // 컴파일 오류: 초기화 되지 않음

        score = 85;
        System.out.println(score);

        */

        /*
        final int PASS_SCORE = 70;
        int score = 75;

        boolean passed = score >= PASS_SCORE;

        // PASS_SCORE = 70;
        // 컴파일 오류: 다시 대입할 수 없음


         */

        /*
        long age = 12L;
        byte level = 3;
        short year = 2026;
        int projectCount = 12;
        long population = 8_100_000_000L;

        float ratio = 0.75F;
        double average = 02.5;
        char grade = 'A';
        boolean passed = true;
        System.out.println(grade);

         */

        /*
        int price = 1_500_000_000;
        int count = 2;

        long wrong = price * count;
        long correct = (long) price * count;

        System.out.println(wrong);
        System.out.println(correct);


    */

        /*
        int total = 5;
        int people = 2;

        double wrong = total / people;
        double correct = (double) total / people;

        System.out.println(wrong);
        System.out.println(correct);

         */

        /*
        String name = "김자바";
        String role = "Java 개발자";

        int length = name.length();
        boolean hasJava = role.contains("Java");

        String empty = "";
        String missing = null;

        System.out.println(name);
        System.out.println(role);
        System.out.println(length);
        System.out.println(hasJava);
        System.out.println(empty);
        System.out.println(missing);

         */

        /*
        String name = "김자바";
        String name2 = "김바보";

        if(name.equals(name2)) {
            System.out.println("true");
        } else {
            System.out.println(false);
        }

        String hobby = "잠자기";
        String hobby2 = "잠자기";

        if(hobby.equals(hobby2)) {
            System.out.println("true");
        } else {
            System.out.println(false);
        }

         */

       // null 은 객체를 가르키지 않는 상태이고, 빈 문자열은 길이가 0인 String 객체이다.

        /*
        String role = "Java Backend";

        int length = role.length(); // 12
        char first = role.charAt(0); // J
        boolean hasJava = role.contains("Java"); // true
        boolean backend = role.endsWith("Backend"); // true

        System.out.println(length);

        String raw = " Java Backend ";

        String cleaned = raw.trim();
        String firstWord = cleaned.substring(0, 4);
        String changed = cleaned.replace("Backend", "Developer");

        System.out.println(raw); // Java Backend
        System.out.println(changed); //Java Developer

         */

        /*
        // 문자열을 기본타입으로 변환
        String monthsText = "6";
        String scoreText = "92.5";
        String readyText = "true";

        int months = Integer.parseInt(monthsText);
        double score = Double.parseDouble(scoreText);
        boolean ready = Boolean.parseBoolean(readyText);

        System.out.println(months);
        System.out.println(score);
        System.out.println(ready);


        // 기본타입을 문자열로 변환
        int projcetCount = 3;
        double rating = 4.5;
        boolean available = true;

        String countText = String.valueOf(projcetCount);
        String ratingText = Double.toString(rating);
        String readyText2 = String.valueOf(available);

        System.out.println(countText);
        System.out.println(ratingText);
        System.out.println(readyText2);

         */

        /*
        int age = 24;

        if(age >= 18) {
            String message = "성인";
            System.out.println(message);
        }

        // System.out.println(message);
        // 컴파일 오류: 범위 밖

         */

        /*
        int score = 50;
        String result;

        if (score >= 60) {
            result = "합격";
        } else {
            result = "불합격";
        }

        System.out.println(result);

         */

        /*
        String name = "김자바";
        int months = 6;
        double rating = 4.567;
        boolean available = true;

        System.out.printf("이름: %s\n", name);
        System.out.printf("개월: %d\n", months);
        System.out.printf("평점: %.2f\n", rating);
        System.out.printf("가능: %b\n", available);

         */

        Scanner sc = new Scanner(System.in);

        /*
        System.out.println("이름: ");
        String name = sc.nextLine();

        System.out.println("반갑습니다. " + name);
        sc.close();

         */

        /*
        System.out.println("한 줄 소개" );
        String raw = sc.nextLine();

        String introduction = raw.trim();

        if(introduction.isBlank()) {
            System.out.println("소개를 입력해 주세요.");
        } else {
            System.out.println(introduction);
        }

         */

        System.out.println("나이: ");
        int age = sc.nextInt();

        System.out.println("이름: ");
        String name = sc.nextLine();
        // 남아 있던 줄바꿈을 읽어 name이 빈 문자열

        System.out.println(name);
    }
}