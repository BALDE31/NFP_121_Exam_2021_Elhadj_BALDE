package exercice_4;

public  abstract class Action {
    protected Option opption;
    Action(Option opption){
        this.opption= opption;
    }
    abstract  public  void  doAction(String actionName);
}