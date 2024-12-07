package day24_methods;

public class CreditScore {
    public static void main(String[] args) {
        String name1 = "Tom";
         getCreditScore("Tom");
        getCreditScore(name1);
        System.out.println(getCreditScore("Jerry"));
        System.out.println(getCreditScore(name1));

        int score = 650;
        isGoodScore(score);
        System.out.println(isGoodScore(score));
        System.out.println(isGoodScore(450));
        System.out.println("-----");

        boolean isGood = isGoodScore(900);
        System.out.println(isGood);

        System.out.println("------");
       int scoreJack= getCreditScore("Jack");
        boolean isGoodScoreMike = isGoodScore(scoreJack);
        System.out.println(isGoodScore(getCreditScore("Jack")));

    }
    public static int getCreditScore(String name) {
        int score = 0;

        if(name.equalsIgnoreCase("Tom")) {
            score = 800;
        } else if (name.equalsIgnoreCase("Jerry")) {
            score = 750;
        } else if(name.equalsIgnoreCase("merry")){
            score = 680;
        } else if (name.equalsIgnoreCase("Jack")){
            score=700;
         } else {
         score = -1;


            }
                return score;
            }
            public static boolean isGoodScore(int score) {
                boolean result = false;
                if (score <= 600) {
                    result = false;
                } else {
                    result = true;
                }
                return result;


            }


        }

