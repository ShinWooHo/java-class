import java.util.Scanner;

public class FinalOrderKiosk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 커피 개수
        int coffeeCount = 0;
        // 샌드위치 개수
        int sandwichCount = 0;
        // 물 개수
        int waterCount = 0;
        // 주문금액
        int orderAmount = 0;
        // 결제 여부
        boolean paid;

        orderLoop:
        while (true) {
            System.out.println("\n===== 학과 행사 간식 주문 =====");
            System.out.println("1. 커피 2,500원");
            System.out.println("2. 샌드위치 4,500원");
            System.out.println("3. 생수 1,000원");
            System.out.println("4. 결제");
            System.out.println("0. 주문 취소");
            System.out.print("메뉴를 선택하세요: ");

            int menu = scanner.nextInt();

            // TODO 1: 상품을 선택한 경우에만 이 영역으로 들어가도록 조건을 작성한다.
            if (menu == 1 || menu == 2 || menu == 3) {
                // TODO 2: 메뉴 번호에 맞는 상품명을 switch 식으로 완성한다.
                String productName = switch (menu) {
                    case 1 -> "커피";
                    case 2 -> "샌드위치";
                    case 3 -> "생수";
                    case 4 -> "결제";
                    case 0 -> "주문 취소";
                    default -> "생수";
                };

                // TODO 3: 메뉴 번호에 맞는 가격을 switch 식으로 완성한다.
                int price = switch (menu) {
                    case 1 -> 2500;
                    case 2 -> 4500;
                    case 3 -> 1000;
                    default -> 1000;
                };

                // 수량
                int quantity;

                do {
                    System.out.print(productName + " 수량을 입력하세요: ");
                    quantity = scanner.nextInt();

                    if (quantity < 1) {
                        System.out.println("수량은 1개 이상어야 합니다.");
                    }

                } while (quantity < 1);

                if (menu == 1) {
                    coffeeCount += quantity;
                } else if (menu == 2) {
                    sandwichCount += quantity;
                } else {
                    waterCount += quantity;
                }

                orderAmount += price * quantity;
                System.out.println(productName + " " + quantity + "개를 담았습니다.");
                System.out.println("현재 금액: " + orderAmount + "원");
                continue;
            }

            if (menu == 4) {
                paid = true;
                if (coffeeCount == 0 && sandwichCount == 0 && waterCount == 0) {
                    System.out.println("먼저 상품을 선택하세요.");
                    continue;
                }
                int discountRate;

                if (orderAmount >= 50000) {
                    discountRate = 10;
                } else if (orderAmount >= 30000) {
                    discountRate = 5;
                } else {
                    discountRate = 0;
                }

                int discountAmount = orderAmount * discountRate / 100;
                int paymentAmount = orderAmount - discountAmount;

                System.out.println();
                System.out.println("커피: " + coffeeCount + "개");
                System.out.println("샌드위치: " + sandwichCount + "개");
                System.out.println("생수: " + waterCount + "개");
                System.out.println("주문 금액: " + orderAmount + "원");
                System.out.println("할인율: " + discountRate + "%");
                System.out.println("할인 금액: " + discountAmount + "원");
                System.out.println("결제 금액: " + paymentAmount + "원");

                break orderLoop;
            }

            if(menu == 0) {
                paid = false;
                break orderLoop;
            }
            System.out.println("0번부터 4번까지의 메뉴 번호를 입력하세요.");

        }

        if (paid) {
            System.out.println("결제가 완료되었습니다.");
        } else {
            System.out.println("주문을 취소했습니다.");
        }
        scanner.close();
    }
}