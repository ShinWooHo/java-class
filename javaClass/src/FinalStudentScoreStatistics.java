import java.util.Scanner;

public class FinalStudentScoreStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== 학생 성적 통계 =====");
        System.out.print("학생 수: ");
        int studentCount = scanner.nextInt();

        if (studentCount <= 0) {
            System.out.println("1명 이상 입력하세요.");
        } else {

            int validCount = 0;
            int totalScore = 0;
            int maxScore = 0;
            int minScore = Integer.MAX_VALUE;

            int aCount = 0;
            int bCount = 0;
            int cCount = 0;
            int dCount = 0;
            int fCount = 0;

            while(validCount < studentCount) {
                int number = scanner.nextInt();
                System.out.println("점수: " + number);
                totalScore += number;
                if(number > maxScore) {
                    maxScore = number;
                }
                if(number < minScore) {
                    minScore = number;
                }

                // 점수로 인정할 수 없는 입력을 걸러내는 조건
                if (number < 0 || number > 100) {
                    continue;
                }

                if(number >= 90) {
                    aCount++;
                } else if(number >= 80) {
                    bCount++;
                } else if(number >= 70) {
                    cCount++;
                } else if(number >= 60) {
                    dCount++;
                } else {
                    fCount++;
                }
                validCount ++;
            }
            double average = (double) totalScore / studentCount;
            System.out.println("\n===========통계 결과===========");
            System.out.println("합계: " + totalScore);
            System.out.printf("평균: %.1f\n" , average);
            System.out.println("최고점: " + maxScore);
            System.out.println("최저점: " + minScore);
            System.out.println("A: " + aCount + "명");
            System.out.println("B: " + bCount + "명");
            System.out.println("C: " + cCount + "명");
            System.out.println("D: " + dCount + "명");
            System.out.println("F: " + fCount + "명");
        }
        scanner.close();
    }
}