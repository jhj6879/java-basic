package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        // 여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder[] lists = new ProductOrder[3];

        // 상품 주문 정보를 'ProductOrder' 타입의 변수로 받아 저장
        ProductOrder productOrder1 = new ProductOrder();
        productOrder1.productName = "두부";
        productOrder1.price = 2000;
        productOrder1.quantity = 2;
        lists[0] = productOrder1;

        ProductOrder productOrder2 = new ProductOrder();
        productOrder2.productName = "김치";
        productOrder2.price = 5000;
        productOrder2.quantity = 1;
        lists[1] = productOrder2;

        ProductOrder productOrder3 = new ProductOrder();
        productOrder3.productName = "콜라";
        productOrder3.price = 1500;
        productOrder3.quantity = 2;
        lists[2] = productOrder3;

        // 상품 주문 정보와 최종 금액 출력
        int totalAmount = 0;
        for (int i = 0; i < lists.length; i++) {
            System.out.println("상품명 : " + lists[i].productName + ", 가격 : " + lists[i].price + ", 수량 : " + lists[i].quantity);
            totalAmount += lists[i].price * lists[i].quantity;
        }
        System.out.println("총 결제 금액 : " + totalAmount);
    }
}
