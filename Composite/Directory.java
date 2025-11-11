import java.util.ArrayList;

public class Directory extends Component {
    ArrayList<Component> children = new ArrayList<Component>();
    public Directory(String name) {
        super(name);
    }
    @Override
    public void Display(int depth) {
        System.out.println("Directory: ");
        for(Component i : children) {
            i.Display(depth + 1);
        }
    }
    @Override
    public void Add(Component component){
        children.add(component);
    }
    @Override
    public void Remove(Component component){
        children.remove(component);
    }
    @Override
    public Component GetChild(int index){
        return children.get(index);
    }
}
