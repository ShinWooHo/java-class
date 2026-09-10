//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

        /*
        System.out.println("나이: ");
        int age = sc.nextInt();

        System.out.println("이름: ");
        String name = sc.nextLine();
        // 남아 있던 줄바꿈을 읽어 name이 빈 문자열

        System.out.println(name);

         */

        /*
        // 변수에 -를 붙이는 방식과 값에 -를 붙이는 방식
        int temperature = 12;
        int belowZero = -temperature;

        System.out.println(temperature);
        System.out.println(belowZero);
        System.out.println(-belowZero);

         */

        /*
        int score = 60;
        if(score >= 60) {
            System.out.println("합격입니다.");
        }
        System.out.println("불합격입니다.");


        int amount = 29_999;
        int deliveryFee = 0;

        if(amount >= 30_000) {
            System.out.println("배송비 무료입니다.");
        } else {
            System.out.println("배송비 3000원입니다.");
        }
        System.out.println(deliveryFee);

         */

        /*
        int amount = 60_000;
        boolean member = true;
        int rate;

        if(member && amount == 60000) {
            rate = 10;
        } else if(member && amount == 20000) {
            rate = 5;
        } else {
            rate = 0;
        }

         */

        /*
        int score = 75;
        String grade;

        if(score >= 90) {
            grade = "A";
        } else if(score >=80) {
            grade = "B";
        } else if(score >= 70){
            grade = "C";
        } else {
            grade = "D";
        }
        System.out.println(grade + "입니다.");

         */

        /*
        int number = (int) (Math.random() * 6) + 1;

        System.out.println(number);

        if(number == 1) {
            System.out.println("1번");
        } else if(number == 2) {
            System.out.println("2번");
        } else {
            System.out.println("3번부터 6번");
        }

         */


        /*
        int menu = 2;

        switch (menu) {
            case 1:
                System.out.println("결제 문의");
                break;
            case 2:
                System.out.println("배송 문의");
                break;
            default:
                System.out.println("기타 문의");
        }

        int time = 9;
        switch (time) {
            case 8:
                System.out.println("출근");
            case 9:
                System.out.println("회의");
            case 10:
                System.out.println("업무");
            default:
                System.out.println("외근");
        }

         */

        /*
        String status = "PAYMENT";
        String message = switch (status) {
            case "PAYMENT" -> "결제 확인 중";
            case "PREPARING" -> "상품 포장 중";
            case "SHIPPING" -> "배송 중";
            case "COMPLETED" -> "배송 완료";
            default -> "알 수 없는 상태";
        };
        System.out.println(message);

         */


        /*
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        // 1 2 3 4 5 6 7 8 9 10

         */

        /*
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);

        // 5050

         */

        /*
        for(int row = 1; row <= 3; row++) {
            for(int column = 1; column <= 5; column++) {
                int seat = (row - 1) * 5 + column;
                System.out.println(seat + " ");
            }
            System.out.println();
        }

         */

        /*
        for (float x = 0.1f;
             x <= 1.0f; x += 0.1f) {
            System.out.println(x);
        }
        // 중간부터 근삿값이 보일 수 있다.

         */


        /*
        boolean running = true;
        int speed = 0;

        while(running) {
            int menu = scanner.nextInt();

            if(menu == 1) speed++;
            else if (menu == 2) speed--;
            else if (menu == 3) running = false;
        }
        System.out.println("종료");


        String savePin = "2580";
        String inputPin;
        int attempt = 0;

        do {
            inputPin = scanner.nextLine();
            attempt++;
        } while (!inputPin.equals(savePin) && attempt < 3);

        if(inputPin.equals(savePin)) {
            System.out.println("로그인 성공");
        }

         */

        /*
        int totalQuantity = 0;
        while (true) {
            int quantity = scanner.nextInt();
            if (quantity == -1) {
                break;
            }
            if (quantity >= 0) {
                totalQuantity += quantity;
            }
        }
        System.out.println(totalQuantity);

         */

        int completedCount = 0;
        int cancelledCount = 0;
        int salesTotal = 0;

        for (int order = 1; order <= 5; order++) {
            System.out.print(order + "번 주문 금액을 입력하세요. 취소 주문은 -1: ");
            int amount = scanner.nextInt();

            if (amount == -1) {
                cancelledCount++;
                System.out.println("취소 주문은 매출 계산에서 제외합니다.");
                continue;
            }

            if (amount < 0) {
                System.out.println("잘못된 금액은 처리하지 않습니다.");
                continue;
            }

            completedCount++;
            salesTotal += amount;
        }

        System.out.println("완료 주문: " + completedCount + "건");
        System.out.println("취소 주문: " + cancelledCount + "건");
        System.out.println("매출 합계: " + salesTotal + "원");
        scanner.close();


    }
}