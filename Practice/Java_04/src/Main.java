// Java 프로그래밍 - 조건문

public class Main {
    public static void main(String[] args) {

//      1. 조건문 - if
        System.out.println("== if ==");
        int speed = 15;

        if (speed > 60) {
            System.out.println("과속입니다.");
        } else {
            System.out.println("과속이 아닙니다.");
        }
        /*int score = 89;
        char grade = 0;
        if (score >= 90){
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        }else {
            grade = 'F';
        }
        System.out.println("등급은 : "+ grade);*/

//      2. 조건문 - switch
        System.out.println("== switch ==");
        String fruit = "banana";

        switch (fruit) {
            case "apple":
                System.out.println(fruit + "은 5000원 입니다.");
                break;
            case "banana":
                System.out.println(fruit + "는 2000원 입니다.");
                break;
            default:
                System.out.println("해당 과일은 없습니다.");
                break;
        }


//      Q1. number의 값이 홀수인지 짝수인지 판단하는 코드를 작성하세요.
        int number = 5;

        if (number % 2 == 0) {
            System.out.println("홀수 입니다.");
        } else {
            System.out.println("짝수 입니다.");
        }


//      Q2. 아래 주석은 위의 실습에서 진행한 score에 따라 grade를 출력하는 코드이다.
//        이를 switch 조건문 기반으로 바꿔보세요.
        int score2 = 90;
        char grade2 = 0;

        switch (score2) {
            case 90:
                grade2 = 'A';
                break;
            case 80:
                grade2 = 'B';
                break;
            case 70:
                grade2 = 'C';
                break;
            default:
                grade2 = 'F';
                break;
        }
        System.out.println("등급은 : " + grade2);
/***
 * 개선된 반복문
 */
        int score3 = 26;
        char grade3 = 0;

        switch (score3 / 10) {
            case 10: //100점일때
            case 9:
                grade3 = 'A';
                break;
            case 8:
                grade3 = 'B';
                break;
            case 7:
                grade3 = 'C';
                break;
            default:
                grade3 = 'F';
                break;
        }
        System.out.println("등급은 : " + grade3);
    }
}