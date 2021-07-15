package exercice_4;

public  class Option {
    private char accessor;
    private String desc;
    private boolean value;

    public Option(char accessor, String desc, boolean value) {
        this.accessor = accessor;
        this.desc = desc;
        this.value = value;
    }

    public char getAccessor() {
        return accessor;
    }

    public void setAccessor(char accessor) {
        this.accessor = accessor;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean isValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }
}