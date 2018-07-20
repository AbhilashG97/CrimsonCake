public class Student extends Person {
    
    private int[] testScores;
    private String firstName;
    private String lastName;
    private int id;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    public Student(String firstName,
                   String lastName,
                   int id,
                   int[] scores) {

        super(firstName, lastName, id);
        this.firstName = firstName;
        this.lastName  = lastName;
        this.id = id;
        testScores = scores;

    }

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    public char calculate() {
        int average = 0, sum = 0;
        for(Integer i : testScores) {
            sum += i;
        }
        average = sum/testScores.length;
        if( 90 <= average && average <= 100) {
            return 'O';
        } else if(80 <= average && average < 90) {
            return 'E';
        } else if(70 <= average && average < 80 ) {
            return 'A';
        } else if(55 <= average && average < 70) {
            return 'P';
        } else if(40 <= average && average < 55) {
            return 'D';
        } else {
            return 'T';
        }
    }
}