import java.util.ArrayList;
import java.util.Scanner;

class Inventory {
  String name, serialID;
  int price;

  public String toString(){
    return name + "," + serialID + "," + price;
  }
  
  public Inventory(String name, String serialID, int price)
  {
    name=this.name;
    serialID=this.serialID;
    price=this.price;
  }
}

class Main {
	public static void main(String[] args) {
    String name, serialID;
    int price, choice;
    Scanner input = new Scanner(System.in);
    
    ArrayList<Inventory> catalog = new ArrayList<Inventory>();
    
    do{
      System.out.printf("Press 1 to add an item.\nPress 2 to delete an item.\nPress 3 to update an item.\nPress 4 to show all the items.\nPress 5 to quit the program.\n");
      choice=input.nextInt();

      
      switch(choice){
        case 1:
        System.out.println("Enter the name:");
        name=input.nextLine();
          
        serialID=input.nextLine();
        System.out.println("Enter the serial number:");
        serialID=input.nextLine();
          
        System.out.println("Enter the value in dollars (whole number):");
        price=input.nextInt();
        catalog.add(new Inventory(name, serialID, price));
        break;

        case 2:
        System.out.println("Enter the serial number of the intem to delete:");
        String delID=input.nextLine();
        for (int i = 0; i < catalog.size(); i++){
          if (catalog.get(i).serialID.equals(delID)) {
            catalog.remove(i);
          }
        }
        break;

        case 3:
        System.out.println("Enter the serial number of the item to change:");
      String changeID = scanner.nextLine();
          
        for (int i = 0; i < catalog.size(); i++){
          if (catalog.get(i).serialID.equals(changeID)){
            System.out.println("Enter the new name:");
            String newName = scanner.nextLine();
            
            catalog.get(i).name = newName;
            System.out.println("Enter the new value in dollars(whole number):");
            int newValue = scanner.nextInt();
            scanner.nextLine();
            catalog.get(i).value = newValue;
          }
        }
        
        break;

        case 4:
        for (int i = 0; i < catalog.size(); i++){
        System.out.println(catalog.get(i));
        }
        break;
      }
      }while(choice!=5);
}
}