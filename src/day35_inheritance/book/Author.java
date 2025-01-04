package day35_inheritance.book;

import my_utilities.StringUtil;

public class Author {
   private String authorName;
   private  int authorAge;
   private String nationality;

    public Author(String authorName, int authorAge) {
        this.authorName = authorName;
        this.authorAge = authorAge;

    }
//make sure age is more than 0//
    //make sure name is full name(always2)


    public void setAuthorName(String authorName) {
       // for (int i = 0; i < authorName.length() ; i++) {
      ///     this.authorName = authorName;
      //  }
        String result ="";

        if(authorName.split(" ").length==2){
            for ( String each: authorName.split(" ")) {
             result += StringUtil.fixFormat(each)+ " " ;
            }


            this.authorName = result.trim();
        }
    }

    public void setAuthorAge(int authorAge) {
        if (authorAge > 4) {}
        this.authorAge = authorAge;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorName='" + authorName + '\'' +
                ", authorAge=" + authorAge +
                '}';
    }
}
