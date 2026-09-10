import java.util.Scanner;
public class FinalNumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = (int) (Math.random() * 100) + 1;

        // 정상입력횟수
        int attempts = 0;

        while(true) {
            System.out.println("숫자 입력(1~100): ");
            int guess = scanner.nextInt();
            attempts++;

            if(guess < answer) {
                System.out.println("더 큰수를 입력하세요.");
            } else if(guess > answer) {
                System.out.println("더 작은 수를 입력하세요.");
            } else {
                System.out.println("정답입니다." + attempts);
                break;
            }
        }
        System.out.println("게임을 종료합니다.");
        scanner.close();
    }
}
