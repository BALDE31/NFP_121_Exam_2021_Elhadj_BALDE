import exercice_4.Mode;

public class CLIClassique {

	public static Configuration configure(String... args) {
		Configuration config = new Configuration();
		boolean finOptions = false;
		int i = 0;
		while (i < args.length && ! finOptions) {
			String arg = args[i];
			switch (arg) {
				case "-K": // Valeur de l'indice à calculer
                    try {
                        config.setIndex(Integer.parseInt(args[++i]));
                    } catch (NumberFormatException e) {
                        System.out.println("Your index must be an int");
                        e.printStackTrace();
                    }
					break;
				case "-E": // Valeur de la précision à atteindre
                    try {
                        config.setEpsilon(Double.parseDouble(args[++i]));
                    } catch (NumberFormatException e) {
                        System.out.println("The epsilon must be a double");
                        e.printStackTrace();
                    }
					break;
				case "-A": // Valeur de alpha
                    try {
                        config.setAlpha(Double.parseDouble(args[++i]));
                    } catch (NumberFormatException e) {
                        System.out.println("Alpha must be a double");
                        e.printStackTrace();
                    }
					break;
				case "-C": // Mode matrice creuse
                    config.setMode(Mode.CREUSE);
					break;
				case "-P": // Mode matrice pleine
                    config.setMode(Mode.PLEINE);
					break;
				default:
					finOptions = arg.length() == 0 || arg.charAt(0) != '-';
					if (! finOptions) {
						System.out.println("Unknown option  : " + arg);
					}
			}
			i++;
		}
		return config;
	}

	public static void main(String[] args) {
		System.out.println(configure(args));
	}
}

