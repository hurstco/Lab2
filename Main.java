class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");

    int totalMM = 55 * 11;
    double blueMM = totalMM * .24;
    double brownMM = totalMM * .13;
    double greenMM = totalMM * .16;
    double orangeMM = totalMM * .20;
    double redMM = totalMM * .13;
    double yellowMM = totalMM * .14;
    System.out.println("blue: " + blueMM);
    System.out.println("brown: " + brownMM);
    System.out.println("green: " + greenMM);
    System.out.println("orange: " + orangeMM);
    System.out.println("red: " + redMM);
    System.out.println("yellow: " + yellowMM);

    double sumColors = blueMM + brownMM + greenMM + orangeMM + redMM + yellowMM;
    System.out.println("Sum of the colors: " + sumColors);

    if(blueMM < brownMM && redMM > orangeMM)
    {
      System.out.println("Blue under Brown and Red over Orange");
    }

    if(brownMM >= greenMM)
    {
      System.out.println("Brown is greater than or equal to Green");
    }

    if(sumColors == totalMM)
    {
      System.out.println("Numbers match.");
    }
  }
}