package exercice_4;

import java.util.Set;

public class Config extends  MyApplication{
    private int index = 150;
    private Mode mode = Mode.CREUSE;

    public Config(int index, Mode mode) {
        super();
        this.index = index;
        this.mode = mode;
    }

    public Config(){
        super();

    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Mode getMode() {
        return mode;
    }

    public void setMode(Mode mode) {
        this.mode = mode;
    }
    public Config(Set<Action> myActions, int index, Mode mode){
        super(myActions);
        this.index = index;
        this.mode = mode;

    }

    public void addAction(Action modeP) {
    }
}
