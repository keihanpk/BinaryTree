public class Node {
    private int key ;
    private int value ;

    /**
     Constructor
     */
    public Node(int key , int value){
        setKey(key);
        setValue(value);
    }

    /**
     Getters and Setters
     */
    public void setKey(int key) {
        this.key = key;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }
}
