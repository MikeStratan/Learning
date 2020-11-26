package day7;

class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight){
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }
    public void setYear(int airplaneYear){
        year = airplaneYear;
    }
    public void setLength(int airplaneLength){
        length = airplaneLength;
    }
    void info(){
        System.out.println("Изготовитель: "+producer+", год выпуска: "+year+", длина: "+length+", вес: "+weight+", количество топлива в баке: "+fuel);
    }
    void fillUp(int addition){
        this.fuel+=addition;
    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2){
        if (airplane1.length>airplane2.length){
            System.out.println("Первый самолет длиннее второго");
        } else if (airplane2.length>airplane1.length){
            System.out.println("Второй самолет длиннее первого");
        } else{
            System.out.println("Длина самолетов равна");
        }
    }
}
  /*  Для этого задания скопируйте класс Самолет из предыдущего дня в пакет текущего
дня.
В классе Самолет создать статический метод compareAirplanes , который в
качестве аргументов принимает два объекта класса Airplane (два самолета) и выводит
сообщение в консоль о том, какой из самолетов длиннее.

   */

