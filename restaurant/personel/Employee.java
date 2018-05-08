package restaurant.personel;

import restaurant.Table;

public interface Employee{
  public boolean canDeliver = false;
  public boolean canBringBill = false;

  public void deliver(Table table1, Table table2);
  public void cleanTable(Table table);
  public int getTablesNumber(Table table);

}
