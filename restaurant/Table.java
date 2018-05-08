package restaurant;

public class Table extends Item implements List{
  private T table;
  private final int uNo;
  private TableState state;
  private int currentBill = 0;
  private List<T> list = new List<>();

  public Table(){
    this.list = new List<T>();
  }




  private int refreshBill(T Item){
    currentBill += Item.prize;
    return currentBill;
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
}
