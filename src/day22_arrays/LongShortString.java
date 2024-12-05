package day22_arrays;

public class LongShortString {
    public static void main(String[] args) {

       String [] words = {"java", "selenium", "softskills","mentors"};

        String longest = words[0];
        String shortest = words[0];

        for(String eachEmelent : words) {
            if (eachEmelent.length() > longest.length()) {
                longest = eachEmelent;
            }
            if (eachEmelent.length() < shortest.length()) {
                shortest = eachEmelent;
            }
        }
        System.out.println("Longest String: " + longest);
        System.out.println("Shortest String: " + shortest);




    }
}
