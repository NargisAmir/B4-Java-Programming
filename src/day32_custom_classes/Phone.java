package day32_custom_classes;
//template class-we set the instructions how the object of this class will behave
public class Phone {
    String name;
    String brand;
    int memory;
    double version;


//non parameterized constructor
    public Phone(String name,String brand,int memory,double version){

  this.name = name;
  this.brand = brand;
  this.memory=memory;
  this.version= version;


    }

    @Override
    public String toString() {
        String msg = "";
        if(name !=null){
            msg +="\n\tName: " + name;

        }else{
            msg +="\n\tName: Info not avaliable" ;
        }
        if(brand !=null){
            msg +="\n\tBrand: " + brand;

        }else {
            msg += "\n\tBrand: Info not avaliable";
        }

        if(memory != 0){
        msg +="\n\tMmoery: " + memory;

    }else {
        msg += "\n\tMemory: Info not avaliable";
    }

        if(version != 0.0){
        msg +="\n\tVersion: " + version;

    }else {
        msg += "\n\tversion: Info not avaliable";
    }


        return msg;



//        return "Phone info: " +
//                "\n\tName:" + name +
//                "\n\tBrand:" + brand +
//                "\n\tMemory:" + memory +
//                "\n\tVersion:" + version;
    }
    public Phone(String name){
   this.name= name;

    }
    public Phone(String name,String brand,int memory){
        this.name = name;
        this.brand= brand;
        this.memory=memory;
    }
}
