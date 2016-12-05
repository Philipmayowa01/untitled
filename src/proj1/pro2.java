package proj1;

/**
 * Created by g on 12/1/2016.
 */
import java.util.Scanner;
public class pro2 {
    private String name,classes, age;int ages;


    public void setname(String a){
        name=a;
    }
    public void setclass(String b){
        classes=b;
    }
    public void setage(String c){
        age=c;
    }
    public int setages(int ag){
        ages=ag;
        return ages;
    }

    public String getname(){
        return name;
    }
    public String getclasses(){
        return classes;
    }
    public  String getage(){
        return age;
    }
    public int getages(){
        return ages;
    }
    public void message(){
        System.out.println("the name of your ex is "+getname());
    }
}