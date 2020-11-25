package day6;

class Car {
    private int year;
    private String colour;
    private String model;
    public void setYear(int carYear){
        year = carYear;
    }
    public int getYear(){
        return year;
    }
    public void setColour(String carColour){
        colour = carColour;
    }
    public String getColour(){
        return colour;
    }
    public void setModel(String carModel){
        model = carModel;
    }
    public String getModel(){
        return model;
    }
    void info(){
        System.out.println("Это автомобиль");
    }
    int yearDifference(int years){
        return years - this.year;
    }
}

