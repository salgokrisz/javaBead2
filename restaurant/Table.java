package restaurant;

import java.util.Random;

public class Table extends Item implements List<T>{
  private T table;
  private final int uID;
  private TableState state;
  private int currentBill = 0;
  private List<T> list = new List<>();
  private static int counter = 0;

  public Table(){
    this.list = new List<T>();
    this.uID = counter;
    counter++;
    this.state = TableState.CLEAN;
  }

  private void increaseBill () {
    //Meghívandó: Minden egyes alkalommal, miután új item került a list-be
    currentBill += list.get(list.size() - 1).finalPrice();
  }

  private void adder (Item item) {
      list.add((T) item);
      increaseBill();
  }

  private void remove (Item item) {
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).equals(item)) {
        //decreaseBill(i); //Szerintem kell ez ide. DE csak szerintem.
        list.remove(i);
      }
    }
  }

  public String printBill () {
    String bill = "";
    for (int i = 0; i < list.size(); i++) {
      bill = bill + list.get(i).toString() + System.lineSeparator();
    }
    bill = bill + currentBill;
    return bill;
  }

  private int refreshBill(T Item){
    currentBill += Item.prize;
    return currentBill;
  }

  @Override
	public boolean equals (Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!( obj instanceof Table )) {
			return false;
		}
		Table other = (Table) obj;
		return this.uID == other.uID;
	}

	@Override
	public int hashCode () {
		return tableID * 71 +  997;
	}


  public TableState getState(){
    return this.state;
  }
  public TableState setState(TableState state){
    return this.state =  state;
  }
  public int getCurrentBill(){
    return this.currentBill;
  }

  public int getUID(){
    return this.uID
  }
}
