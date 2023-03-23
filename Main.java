import java.util.ArrayList;
import java.util.Scanner;

class Inventory {
  String name;
  String serialID;
  int price;

  public String toString(){
    return name + "," + serialID + "," + price;
  }
  
  public Inventory(String name, String serialID, int price)
  {
    this.name=name;
    this.serialID=serialID;
    this.price=price;
  }
}

class Main {
	public static void main(String[] args) {
   String name;
    String serialID;
    int price;
    String option;
    Scanner input = new Scanner(System.in);
    ArrayList<Inventory> catalog = new ArrayList<Inventory>();
    
    do{
      System.out.println("Press 1 to add an item.");
      System.out.println("Press 2 to delete an item.");
      System.out.println("Press 3 to update an item.");
      System.out.println("Press 4 to show all the items.");
      System.out.println("Press 5 to quit the program.");
      option=input.nextLine();
      switch(option) {
        case "1":
        System.out.println("Enter the name:");
        name=input.nextLine();

        System.out.println("Enter the serial number:");
        serialID=input.nextLine();
          
        System.out.println("Enter the value in dollars (whole number):");
        price=input.nextInt();
          
        catalog.add(new Inventory(name, serialID, price));
        input.nextLine();
        break;

        case "2":
        System.out.println("Enter the serial number of the item to delete:");
        String delID=input.nextLine();
        for (int i = 0; i < catalog.size(); i++){
          if (catalog.get(i).serialID.equals(delID)) {
            catalog.remove(i);
          }
        }
        break;

        case "3":
        System.out.println("Enter the serial number of the item to change:");
      String changeID = input.nextLine();
          
        for (int i = 0; i < catalog.size(); i++){
          if (catalog.get(i).serialID.equals(changeID)){
            System.out.println("Enter the new name:");
            String newName = input.nextLine();
            
            catalog.get(i).name = newName;
            System.out.println("Enter the new value in dollars (whole number):");
            int newValue = input.nextInt();
            input.nextLine();
            catalog.get(i).price = newValue;
          }
        }
        
        break;

        case "4":
        for (int i = 0; i < catalog.size(); i++){
        System.out.println(catalog.get(i));
        }
        break;
      }
      }while(!option.equals("5"));
    input.close();
}
}