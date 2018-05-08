package restaurant.personnsel;

import java.util.LinkedList;
import rastaurant.Table;
import restaurant.Item;
import restaurant.TableState;

public abstract class Worker{
  protected LuxuryRestaurant restaurant;
  protected String name;
  protected LinkedList<Table> tables = new LinkedList<>(15);

  public int getTablesNumber(){
    return this.tables.size();
  }

  public void cleanTable(Table table){
    if(table.getState() == TableState.UNCELAN){
      table.setState(TableState.Clean);
    }
  }

  public void deliver(Item item, Table table){
    table.list.add(item);
  }

  public void addTable(Table table){
    
  }

}
