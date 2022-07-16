import java.util.ArrayList;

public class XmlFolder extends Component {

    ArrayList<Component> components = new ArrayList<Component>();

    public XmlFolder(String name, int level) {
        super(name, level);
    }

    public void addComponent(Component c) {
        components.add(c);
    }

    public void recursiveTreeDisplay() {

        int level = getLevel();
        for (int i = 0; i < level; i++) {
            System.out.print("│\t");
        }
        System.out.println("├──" + getName());
        for (Component c : components) {
            c.recursiveTreeDisplay();
        }
    }
}
