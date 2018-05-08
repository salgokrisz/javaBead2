package restaurant;

public abstract class Item <T> implements Comparable<Item>{
  private int price;
  private ItemState state = ItemState.ORDERED;
  private int tax;
  private String name;
  public static final int SERVICE_CHARGE = 15;

  Item(int price, int tax, String name){
    this.price = price;
    this.tax = tax;
    this.name = name;
  }
  @Override
  public int compareTo(Item item){
    if (this.getTax() > item.getTax()){
      return 1;
    }
    else if (this.getTax() < item.getTax()){
      return -1;
    }
    else if (this.getTax() == item.getTax()){
      if (this.getPrice() > item.getPrice()){
        return 1;
      }
      else if (this.getPrice() < item.getPrice()){
        return -1;
      }
    }
    return 0;
  }

  public int finalPrice(){
    return this.price * (this.tax + this.SERVICE_CHARGE + 100) / 100;
  }

  @Override
  public String toString(){
    int finalPrice = finalPrice();
    String outLine = this.name + ": " + finalPrice;
    return outLine;
  }

  public void setState(){
    if (this.state == ItemState.ORDERED){
      this.state = ItemState.PROCESSING;
    }
    else if(this.state == ItemState.PROCESSING){
      this.state = ItemState.READY;
    }
    else if (this.state == ItemState.READY){
      this.state = ItemState.DELIVERED;
    }
  }

  public int getPrice(){
    return this.price;
  }
  public int getTax(){
    return this.tax;
  }
  public String getName(){
    return this.name;
  }
  public ItemState getState(){
    return this.state;
  }
}
