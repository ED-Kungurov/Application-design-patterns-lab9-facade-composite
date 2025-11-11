public class File extends Component{
    String name;
    public File(String name) {
        super(name);
    }
    @Override
    public void Display(int depth) {
        System.out.println(name + " file depth: " + depth);
    }
}
