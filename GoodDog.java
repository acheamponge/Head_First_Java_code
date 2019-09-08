import com.sun.deploy.security.SelectableSecurityManager;

public class GoodDog {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String bark() {
        if (size > 60) {
            return("Woof! Woof");
        } else if (size > 14) {
            return("Ruff! Ruff!");
        } else {
            return("Yip! Yip");
        }
    }
}
