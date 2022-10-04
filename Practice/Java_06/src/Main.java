// Java 프로그래밍 - 다차원 배열

public class Main {
    public static void main(String[] args) {

        // 1. 일차원 배열
        System.out.println("== 일차원 배열 ==");
        int[] myArray = {1, 2, 3};

        // 배열의 인덱스 번호 0번째 출력
        System.out.println("myArray[0] = " + myArray[0]);
        // 배열의 인덱스 번호 1번째 출력
        System.out.println("myArray[1] = " + myArray[1]);
        // 배열의 인덱스 번호 2번째 출력
        System.out.println("myArray[2] = " + myArray[2]);

        // 반복문으로 배열 데이터 출력
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

        // foreach 사용 해서 배열 데이터 출력
        for (int i : myArray) {
            System.out.println(i);
        }

        // 2. 이차원 배열
        System.out.println("== 이차원 배열 ==");
        int[][] myArray2 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("myArray2[][] = " + myArray2[1][2]);

        for (int i = 0; i < myArray2.length; i++) {
            for (int j = 0; j < myArray2[i].length; j++) {
                System.out.println(myArray2[i][j]);
            }
        }

        for (int[] ints : myArray2) {
            for (int anInt : ints) {
                System.out.println("anInt = " + anInt);
            }
        }
//      Q1. 아래와 같이 3x3 행렬이 2차원 배열로 초기화 되어있다.
//          모든 원소를 1로 변경하고, 대각 원소는 10으로 변경하시오.
        int[][] testArray1 = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};

        for (int i = 0; i < testArray1.length; i++) {
            for (int j = 0; j < testArray1[i].length; j++) {
                testArray1[i][j] = 1;

                if (i == j) {
                    testArray1[i][j] = 10;
                }
            }
        }
        for (int[] itemRow : testArray1) {
            for (int itemCpl : itemRow) {
                System.out.print(itemCpl + " ");
            }
            System.out.println();
        }
    }
}
