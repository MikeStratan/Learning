package day11;

public class Picker implements Worker {
    private int salary;

    public Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary+=80;
        warehouse.setCountOrder(warehouse.getCountOrder()+1);
    }

    @Override
    public void bonus() {
            salary *= 3;
        }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                '}';
    }
}
/*
А также при вызове doWork() у Сборщика, происходит увеличение значения поля
countOrder в классе Warehouse на 1. При вызове doWork() у Курьера, происходит
увеличение переменной balance в классе Warehouse на 1000.
Сотрудникам полагается бонус (индивидуальный расчет для каждого): когда на складе
отгружен 1500-й заказ, заработанная к тому моменту ЗП сборщика утраивается. Когда
складом заработан 1.000.000, заработанная к тому моменту ЗП курьера удваивается.
 */