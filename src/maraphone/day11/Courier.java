package maraphone.day11;

public class Courier implements Worker{
    private int salary;
    public Warehouse warehouse;                         //ссылка на класс склада, чтобы ее предать нужен сеттер или конструктор

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
    if(warehouse.getBalance()>1000000)
    salary*=2;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                '}';
    }
}
