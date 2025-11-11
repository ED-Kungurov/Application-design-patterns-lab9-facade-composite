public class Main1 {
    public static void main(String[] args) {
        Directory direct = new Directory("root");
        File file1 = new File("file1");
        File file2 = new File("file1");
        File SubFile = new File("file2");
        Directory subDirect = new Directory("SubDirectory");
        direct.Add(file1);
        direct.Add(file2);
        subDirect.Add(SubFile);
        direct.Add(subDirect);
        direct.Display(2);
    }
}
