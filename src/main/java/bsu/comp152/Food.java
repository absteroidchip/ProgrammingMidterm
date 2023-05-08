package bsu.comp152;

public class Food {
    private String name;
    private int temp;

    public Food (String nm){
        name = nm;
        temp = 40;
    }

    public int getTemp() {
        return temp;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return String.format(name + " (" + temp + ")");
    }

    public boolean equals(Food other){
        String otherName = other.getName();
        return otherName.equals(name);
    }

    public boolean hotEnough (int minTemp){
        return temp >= minTemp;
    }

    public boolean isCooler(Food other){
        int otherTemp = other.getTemp();
        return otherTemp >= temp;
    }

    public int changeTemp(int tempDifference){
        temp = temp + tempDifference;
        return temp;
    }

    public int setTemp(int newTemp){
        temp = newTemp;
        return temp;
    }

}
