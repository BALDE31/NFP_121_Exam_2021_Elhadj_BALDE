package exercice_4;

import java.util.Set;

public class MyApplication {
    private Set<Action> actions;

    public MyApplication(Set<Action> myActions) {
            this.actions = myActions;
    }

    public MyApplication() {
    }

    public Set<Action> getActions() {
        return actions;
    }

    public void setActions(Set<Action> actions) {
        this.actions = actions;
    }
}
