public abstract class Component {
    private String name;
    public Component(String name) {
        this.name = name;
    }
    public abstract void Display(int depth);
    public void Add(Component component){
        throw new UnsupportedOperationException();
    }
    public void Remove(Component component){
        throw new UnsupportedOperationException();
    }
    public Component GetChild(int index){
        throw new UnsupportedOperationException();
    }
}

