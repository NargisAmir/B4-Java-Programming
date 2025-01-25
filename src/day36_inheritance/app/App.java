package day36_inheritance.app;
//Create an App class

 /*   - create variables:
name (app name), version

    - create constructor to initialize the variables

    - create method:
download()
Example output: prints $name is downloading version $version

 */
public class App {
    //instance variables
    //every object has its own set of copy
    String name;
    double version;

//constructor
    public App(String name, double version) {
        this.name = name;
        this.version = version;
    }
    //instance method in parent class
    public void download(){
        System.out.println("Downloading " + name + " version " + version);
    }

}
