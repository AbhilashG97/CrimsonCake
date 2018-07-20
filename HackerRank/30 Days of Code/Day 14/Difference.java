public class Difference {

    private int[] elements;
    public int maximumDifference;
    private int difference;

    public Difference(int[] elements) {
        this.elements = elements;
    }

    public void computeDifference() {
        for(int i=0; i<elements.length; i++) {
            for(int j=1; j<elements.length; j++) {
                difference = Math.abs(elements[i] - elements[j]);
                if(difference >  maximumDifference) {
                    maximumDifference = difference;
                }
            }
        }
    }

}