package class1.ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        // 영화 리뷰 정보 선언
        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타입";
        aboutTime.review = "인생 시간 영화!";

        // 영화 리뷰 정보 출력
        MovieReview[] movieReviews = {inception, aboutTime};

        // 향상된 for문 사용함
        for (MovieReview m : movieReviews) {
            System.out.println("영화 제목 : " + m.title + ", 리뷰 : " + m.review);
        }
    }
}
