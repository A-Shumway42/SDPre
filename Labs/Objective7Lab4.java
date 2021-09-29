public class Objective7Lab4 {
  public static void main(String[] args) {
    int sum, count;

    sum = 10;
    count = 0;

    while (count < 210) {
      count = sum + count;
    }
    System.out.println(count);
  }
}
