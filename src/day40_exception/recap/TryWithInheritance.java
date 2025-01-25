package day40_exception.recap;

public class TryWithInheritance {
    public static void main(String[] args) {


       try {
           int[] nums = {23, 45, 2, 6, 2};
           System.out.println(nums[9]);//ArrayIndexOutOfBoundsException
       }catch (ArrayIndexOutOfBoundsException e){
     //  } catch (Exception e) {
         //  System.out.println("parent");

       }catch (IndexOutOfBoundsException e){
           System.out.println("child");
       } catch (Exception e) {

       }

     /**
    * Parent exception class can not be before the child exception class
      * * Because the Parent exception class can catch whatever the Child could catch
      * So ,Child exception will never be reached
      *
      *
      * All POSSIBLE REFERENCES OF ArrayIndexOutOfBoundsException

      * ArrayIndexOutOfBoundsException e = NEW ArrayIndexOutOfBoundsException()
      * IndexOutOfBoundsException e = NEW ArrayIndexOutOfBoundsException()
      * RunTime Exception e = NEW ArrayIndexOutOfBoundsException()
      * Exception e = NEW ArrayIndexOutOfBoundsException()
      * Throwable e = NEW ArrayIndexOutOfBoundsException()
     */
    }
}
