package day11;

public class Task01 {
    public static void main(String[] args){
         Warehouse warehouse1 = new Warehouse(0,0);
         Picker picker1 = new Picker(warehouse1);
         Courier courier1 = new Courier(warehouse1);
         int i;
         for (i=0; i<1500; i++)
         {
             picker1.doWork();
             courier1.doWork();
             if(warehouse1.getBalance()==1000000)
             {
                 courier1.bonus();
             }
         }
         picker1.bonus();
        System.out.println(warehouse1+ " "+ picker1+" "+ courier1);

        Warehouse warehouse2 = new Warehouse(0,0);
        Picker picker2 = new Picker(warehouse2);
        Courier courier2 = new Courier(warehouse2);
        picker2.doWork();
        courier2.doWork();
        System.out.println(warehouse1+ " "+ picker1+" "+ courier1);
    }
}
/*
Для демонстрации и тестирования работы программы создайте склад и по 1 рабочему,
вызовите у каждого методы doWork() и bonus() , столько раз, чтобы каждый из
сотрудников получил бонус. Выведите в консоль баланс и количество выполненных
заказов на складе и ЗП каждого из сотрудников.
Создать второй склад, также принять по 1 сотруднику с однократным вызовом
doWork() у каждого. Проконтролировать, что у склада 1 и его сотрудников при этом
значения не меняются.
Рекомендации: для получения данных склада внутри классов сотрудников реализуйте
хранение ссылки на объект Warehouse и передавайте ее с помощью конструктора или
set метода.
СКАЧАНО
Сотрудникам полагается бонус (индивидуальный расчет для каждого): когда на складе
отгружен 1500-й заказ, заработанная к тому моменту ЗП сборщика утраивается. Когда
складом заработан 1.000.000, заработанная к тому моменту ЗП курьера удваивается.
 */