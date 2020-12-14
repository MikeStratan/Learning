package day11;

public class Courier implements Worker {
    private int salary;

    public Warehouse warehouse;

    public int getSalary() {
        return salary;
    }

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void doWork() {
        salary+=100;
        warehouse.setBalance(warehouse.getBalance()+1000);
    }

    @Override
    public void bonus() {
            salary *= 2;
    }

    @Override
    public String toString() {
        return "Courier{" +
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