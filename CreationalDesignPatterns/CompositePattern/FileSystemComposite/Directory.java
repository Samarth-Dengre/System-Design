package CreationalDesignPatterns.CompositePattern.FileSystemComposite;

import java.util.ArrayList;
import java.util.SortedMap;

public class Directory implements FileSystem{
    String name;
    ArrayList<FileSystem> fileSystemList;

    Directory(String name){
        this.name = name;
        fileSystemList = new ArrayList<>();
    }

    void add(FileSystem f){
        fileSystemList.add(f);
    }
    @Override
    public void ls() {
        System.out.println("Directory Name: " + name);
        for(FileSystem f : fileSystemList){
            f.ls();
        }
    }
}
