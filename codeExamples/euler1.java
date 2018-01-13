public class euler1 {
  public static final int COUNT_TO = 1000;

  public static int triangleNumber(int upperBound) {
    if (upperBound % 2 == 0) {
      return upperBound / 2 * (upperBound + 1);
    }
    return (upperBound + 1) / 2 * upperBound;
  }
  public static int sumOfMultiples(int upperBound, int base) {
    return base * triangleNumber(upperBound / base);
  }
  public static void main(String[] args) {
    /* A method arising from a literal interpretation of the question: */
  	int sum1 = 0;
  	for (int i = 1; i < COUNT_TO; ++i) {
      if ((i % 3 == 0) || (i % 5 == 0)) {
        sum1 += i;
      }
    }
    System.out.println(sum1);

    /* Another method arising from insight into the particular question */
    int sum2 = 0;
    for (int i = 3; i < COUNT_TO; i += 3) {
      sum2 += i;
    }
    for (int i = 5; i < COUNT_TO; i += 5) {
      sum2 += i;
    }
    for (int i = 15; i < COUNT_TO; i += 15) {
      sum2 -= i;
    }
    System.out.println(sum2);

    /* Yet another method, further abstracting the problem using functions: */
    int sum3 = (
      sumOfMultiples(COUNT_TO - 1, 3) +
      sumOfMultiples(COUNT_TO - 1, 5) -
      sumOfMultiples(COUNT_TO - 1, 15)
    );
    System.out.println(sum3);
  }
}
