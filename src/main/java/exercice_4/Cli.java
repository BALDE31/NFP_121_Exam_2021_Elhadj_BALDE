package exercice_4;

import java.util.HashSet;
import java.util.Set;

public class Cli {
    private Set<Option> myOptions= new HashSet<Option>();

    public Cli(Set<Option> myOptions) {
        this.myOptions = myOptions;
    }

    public Cli() {
    }

    public Set<Option> getMyOptions() {
        return myOptions;
    }

    public void setMyOptions(Set<Option> myOptions) {
        this.myOptions = myOptions;
    }
    public  void addOption(Option option){
        myOptions.add(option);
    }
    public  static MyApplication analyze(MyApplication application){
        return  application;
    }

}
