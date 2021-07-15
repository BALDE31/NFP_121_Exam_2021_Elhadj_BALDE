import exercice_4.Mode;

public class Configuration {
	public double alpha = 0.85;
	public double epsilon = -1.0;
	public int index = 150;
	public Mode mode = Mode.CREUSE;

	@Override public String toString() {
		return "alpha=" + alpha + ", epsilon=" + epsilon
			+ ", indice=" + index + ", mode=" + mode;
	}

    public double getAlpha() {
        return alpha;
    }

    public void setAlpha(double alpha) {
        this.alpha = alpha;
    }

    public double getEpsilon() {
        return epsilon;
    }

    public void setEpsilon(double epsilon) {
        this.epsilon = epsilon;
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

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Configuration that = (Configuration) o;
        return Double.compare(that.alpha, alpha) == 0 && Double.compare(that.epsilon, epsilon) == 0 && index == that.index && mode == that.mode;
    }
}
