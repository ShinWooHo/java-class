//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        int temperature = 12;
        int belowZero = -temperature;
        System.out.println(temperature);
        System.out.println(belowZero);
        System.out.println(-belowZero);
         */
        /*
        int count = 3;

        // 계산을 한 후 변수를 실행
        int a = ++count;


        int a = count + 1;
        a = count;



        // 변수를 실행 후 값을 더해줌
        int b = count++;


        b = count;
        int b = count + 1;


        System.out.println(a); // 4
        System.out.println(b); // 4
        System.out.println(count); // 5
         */
        /*
        int count = 3;

        for(int i = 0; i < count; i++) {
            // "조건";
        }


        while(count > 3) {
            // "조건";
            count++;
        }

         */
        /*
        // 회색은 안먹는 표시
        // 주황은 제대로 된 표시
        int total = 5;
        int people = 2;
        double late
                = (double) (total / people);
        double early
                = (double) total / people;
        System.out.println(late); // 2.0
        System.out.println(early); // 2,5

         */
        /*
        int number = -7;
        System.out.println(number / 3); // -2
        System.out.println(number % 3); // -1
        boolean even = number % 2 == 0; // 나머지가 0인지 구분
        boolean odd = number % 2 != 0;
        System.out.println(even); // false
        System.out.println(odd); // true

         */
        /*
        // byte + byte = int 결과값이 나온다.
        byte x = 10;
        byte y = 20;
        int result = x + y;
        byte wrong = x + y;
        byte narrowed = (byte) (x + y);
        System.out.println(result);
        System.out.println(narrowed);

         */
        /*
        int a = 7;
        int b = 3;
        System.out.println(a + b); // 10
        System.out.println(a - b); // 4
        System.out.println(a * b); // 21
        System.out.println(a / b); // 2
        System.out.println(a % b); // 1

        System.out.println(a / b); // 2
        float c = 7.0f;
        System.out.println(c / b); // 2.33333
        System.out.println((double) a / b); //2.33333

         */
        /*
        int max = Integer.MAX_VALUE;
        int overflow = max + 1;
        System.out.println(max);
        System.out.println(overflow + "\n");

        int min = Integer.MIN_VALUE;
        int underflow = min - 1;
        System.out.println(min);
        System.out.println(underflow);

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
        double sum = 0.0;
        sum += 0.1;
        sum += 0.1;
        sum += 0.1;
        sum += 0.1;
        sum += 0.1;
        sum += 0.1;
        sum += 0.1;
        sum += 0.1;
        sum += 0.1;
        sum += 0.1;
        System.out.println(sum); // 내가 예상한 결과값 1.0 / 실제 값 0.9999999999999

         */
        /*

        long priceWon = 3_500;
        long count = 4;
        long discountRate = 10;

        long subtotalWon = priceWon * count; // 16000
        long discountWon = subtotalWon * discountRate / 100;
        long paymentWon = subtotalWon - discountWon;

        System.out.println(paymentWon);

         */
        /*
        double normal = 10.0 / 2.0;
        double infinity = 10.0 / 0.0;
        double nan = 0.0 / 0.0;
        System.out.println(normal); // 5.0
        System.out.println(infinity); // Infinity
        System.out.println(nan); // NaN -> Null 아님, 빈값아님, 특별한 값

         */
        /*
        double result = 10.0 / 0.0;
        boolean infinite
                = Double.isInfinite(result);
        boolean nan
                = Double.isNaN(result);
        boolean invalid = infinite || nan;
        System.out.println(infinite); // true
        System.out.println(nan); // false
        System.out.println(invalid); // true
         */
        /*
        String a = "Java";
        String b = "Java";
        String c = new String("Java");
        System.out.println(a == b); // true 가능 같은 객체를 가리킴
        System.out.println(a == c); // false
        System.out.println(a.equals(c)); // true

         */
        // 앞의 조건이 거짓일경우 뒤에 조건을 실행하지 않음
        /*
        int age = 27;
        boolean atLeast19 = age >= 39;
        boolean atMost34 = age >= 24;
        boolean inRange = atLeast19 && atMost34;
        System.out.println(inRange); // false

         */
        /*
        int first = 7; // ...0111
        int second = 8; // ...1000
        int firstLastBit = first & 1;
        int secondLastBit = second & 1;
        System.out.println(firstLastBit); // 1
        System.out.println(secondLastBit); // 0

         */
        /*
        int value = 3;
        int one = value << 1;
        int two = value << 2;
        System.out.println(one); // 6
        System.out.println(two); // 12
        System.out.println(value >> 1); // 1
        System.out.println(value >>> 1); // 1

         */
        /*
        int total = 0;
        total += 3_500;
        total += 2_000;
        total -= 500;
        System.out.println(total);

        total = 0;
        total = total + 3500;
        total = total + 2000;
        total = total - 500;
        System.out.println(total);

         */
        // 삼항 연산 많이 쓰임
        /*
        int score = 56;
        String result = score >= 60 ? "합격" : "재시험";
        System.out.println(result); // 합격
         */

        int price = 3000;
        int delivery = 500;
        int count = 2;

        int first = price + delivery * count;
        int second = (price + delivery) * count;

        System.out.println(first);
        System.out.println(second);



    }
}