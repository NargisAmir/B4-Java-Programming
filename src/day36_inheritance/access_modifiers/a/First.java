package day36_inheritance.access_modifiers.a;
//Same package same class
public class First {
    public int one = 1;
  protected  int two = 2;
    int three = 3;
   private int four = 4;

   public static void main(String[] args) {

       First f = new First();
       System.out.println(f.one);
       System.out.println(f.two);
       System.out.println(f.three);
       System.out.println(f.four);

   }


}
//Object "f" is in the same package and same class
/*
public -> accessible same package,same class
protected -> accessible same package,same class
default ->accessible same package,same class
private ->accessible same package,same class
 */


