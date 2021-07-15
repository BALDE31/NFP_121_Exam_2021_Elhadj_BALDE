package exercice_4;

public class Launcher {
    public  static  void  main(String[] args){

        Cli myCli = new Cli();

        Option optionK = new Option('K', "Value of index to calculate", true);
        Option optionP = new Option('P', "Full use mode", false);

        myCli.addOption(optionK);
        myCli.addOption(optionP);



        Config config = new Config();

        // On creer les actions et on les ajoute dans l'application
        Action indexK = new Action(optionK) {
            @Override
            public void doAction(String actionName) {
                config.setIndex(Integer.parseInt(actionName));
            }

        };

        Action modeP = new Action(optionK) {
            @Override
            public void doAction(String actionName) {
                config.setMode(Mode.PLEINE);
            }


        };

        config.addAction(indexK);
        config.addAction(modeP);
    }
}
