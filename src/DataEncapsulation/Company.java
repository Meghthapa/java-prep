package DataEncapsulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by meght on 4/3/2018.
 */
// POJO (plain old java object)
public class Company {

    private String name;
    private List<String> employees= new ArrayList<>();


    public void printSorted(){
        System.out.println("ComanyName= "+ name);
        Collections.sort(employees);
        System.out.println(employees);
    }
    public void setName(String name){
        if(name ==null){
            System.out.println("Name cannot be null");
        }else {
            this.name = name;
        }
    }
    public String getName(){
        return name;
    }
    public void addEmployees(String name){
        if(name == null){
            System.out.println("Cannot add null value");
        }else{
            employees.add(name);
        }

    }
}
