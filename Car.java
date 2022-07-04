package com.company.vehicles;

import com.company.VoidToString;
import com.company.entities.Person;
import com.company.professions.Driver;

public class Car extends Driver implements VoidToString {
    String marks ;
    String klass ;
    double weight ;
    String driverTip ;
    String motor = "Engine";

public void start(){
    System.out.println("Go");
}
public void stop(){
    System.out.println("Stop");
}
public void ternRight(){
    System.out.println("Tern on Right");
}
public void ternLeft(){
    System.out.println("Tern on Left");
}
public void toString (String marks,String klass,double weight,String driverTip,String motor,String name){
    System.out.println("Data: "+"Marks auto-"+marks+", klass auto -"+klass+ ", Driver name - "+ name+ ", motor - "+motor);

}
}
