package day6;

class Motorcycle {
    private int year;
    private String colour;
    private String model;

    public Motorcycle(int year, String colour, String model){
        this.year = year;
        this.colour = colour;
        this.model = model;
    }
    public int getYear(){
        return year;
    }
    public String getColour(){
        return colour;
    }
    public String getModel(){
        return model;
    }
    void info(){
        System.out.println("Это мотоцикл");
    }
    int yearDifference (int years){
        return years - this.year;
    }
}

