public class Solution {

  // Complete the angryProfessor function below.
  static String angryProfessor(int k, int[] a) {
    int onTimeStudentCount = getOnTimeStudentCount(k, a);
    return getProfessorAngryString(onTimeStudentCount, k);
  }

  private static int getOnTimeStudentCount(int k, int[] students) {
    int onTimeStudentCount = 0;
    for (int i = 0; i < students.length; i++) {
      if (students[i] <= 0) {
        onTimeStudentCount += 1;
      }
    }
    return onTimeStudentCount;
  }

  private static String getProfessorAngryString(int onTimeStudentCount, int k) {
    String isProfressorAngry = "NO";
    if (onTimeStudentCount >= k) {
      isProfressorAngry = "NO";
    } else {
      isProfressorAngry = "YES";
    }
    return isProfressorAngry;
  }

  public static void main(String[] args) {
    int[] studentsTime = new int[]{-1, -3, 4, 2};
    System.out.println(angryProfessor(3, studentsTime));
  }

}
