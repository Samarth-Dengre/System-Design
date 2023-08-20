package CreationalDesignPatterns.CompositePattern.FileSystemNotComposite;

public class Client {
    public static void main(String[] args) {
        Directory mainDirectory = new Directory("Main");
        Directory child1 = new Directory("Child1");
        Directory child2 = new Directory("Child2");
        mainDirectory.objectsList.add(child1);
        child1.objectsList.add(child2);

        File f1 = new File("File1");
        File f2 = new File("File2");
        File f3 = new File("File3");
        File f4 = new File("File4");

        mainDirectory.objectsList.add(f1);
        child1.objectsList.add(f2);
        child2.objectsList.add(f3);
        child2.objectsList.add(f4);

        mainDirectory.ls();
    }
}
