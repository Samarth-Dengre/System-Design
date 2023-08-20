package CreationalDesignPatterns.CompositePattern.FileSystemNotComposite;

import java.util.ArrayList;

public class Directory {
    String name;
    ArrayList<Object> objectsList;
    Directory(String name){
        this.name = name;
        objectsList = new ArrayList<>();
    }

//    Not Following composite, we have to put multiple if-else and instance of
    void ls(){
        System.out.println("Directory Name: " + name);
        for(Object o : objectsList){
            if(o instanceof File){
                ((File) o).ls();
            }else{
                ((Directory) o).ls();
            }
        }
    }
}
