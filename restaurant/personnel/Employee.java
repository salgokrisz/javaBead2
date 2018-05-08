package restaurant.personnsel;

import restaurant.Table;
import restaurant.Item;

public interface Employee{
  public boolean canDeliver = false;
  public boolean canBringBill = false;

  public void deliver(Item item, Table table);
  public void cleanTable(Table table);
  public int getTablesNumber();

}
