package Day12_Inheritance;

class Student extends Person {
    private int[] testScores;

    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */
    // Write your constructor here
    Student(String firstName, String lastName, int identification, int[] testScores) {
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }

    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    // Write your method here
    public String calculate() {
        int testScoresSum = 0;
        for (int i = 0; i < testScores.length; i++) {
            testScoresSum += testScores[i];
        }
        int average = testScoresSum / testScores.length;
        if (average <= 100 && average >= 90) {
            return "O";
        } else if (average < 90 && average >= 80) {
            return "E";
        } else if (average < 80 && average >= 70) {
            return "A";
        } else if (average < 70 && average >= 55) {
            return "P";
        } else if (average < 55 && average >= 40) {
            return "D";
        } else {
            return "T";
        }
    }
}