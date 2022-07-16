public abstract class Component {

    private int level;
    private String name;
    
    public abstract void recursiveTreeDisplay();

    public Component(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return this.name;
    }

    public int getLevel() {
        return this.level;
    }
}
