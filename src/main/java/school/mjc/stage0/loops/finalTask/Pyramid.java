package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) { //1 2 3 4 5
            for (int j = cathetusLength - i; j >= 1; j--) { //4 3 2 1
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }}
    public static void main(String[] args) {
        new  Pyramid().printPyramid(7);
    }
}
