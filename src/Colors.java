public enum Colors {
    Red(1),Blue(2),Green(3) ;

    int value;



    private Colors (int values)
    {
        this.value = values;

    }

    public int getValue() {
        return value;
    }

    private void setValue(int value) {
        this.value = value;
    }
}
