import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
  private List guitars;
  private String tester;

  public Inventory() {
    guitars = new LinkedList();
    String tester = new String();
  }

  public void addGuitar(String serialNumber, double price,
                        Builder builder, String model,
                        Type type, Wood backWood, Wood topWood) {
    Guitar guitar = new Guitar(serialNumber, price, builder,
                               model, type, backWood, topWood);
    guitars.add(guitar);
  }

  public Guitar getGuitar(String serialNumber) {
    for (Iterator i = guitars.iterator(); i.hasNext(); ) {
      Guitar guitar = (Guitar)i.next();
      if (guitar.getSerialNumber().equals(serialNumber)) {
        return guitar;
      }
    }
    return null;
  }


  public List search (Guitar searchGuitar){
      List matchingGuitars = new LinkedList();

      guitars.forEach(Guitar -> System.out.println(Guitar.getModel()));


      //guitars.forEach(guitar -> System.out.println(guitar));
      return matchingGuitars;
  }


/*

  public List search(Guitar searchGuitar) {
    List matchingGuitars = new LinkedList();
    for (Iterator i = guitars.iterator(); i.hasNext(); ) {
      Guitar guitar = (Guitar)i.next();
      tester = 'TRET';
      // Ignore serial number since that's unique
      // Ignore price since that's unique
      if (searchGuitar.getBuilder() != guitar.getBuilder())
        continue;
      String model = searchGuitar.getModel().toLowerCase();
      if ((model != null) && (!model.equals("")) &&
          (!model.equals(guitar.getModel().toLowerCase())))
        continue;
      if (searchGuitar.getType() != guitar.getType())
        continue;
      if (searchGuitar.getBackWood() != guitar.getBackWood())
        continue;
      if (searchGuitar.getTopWood() != guitar.getTopWood())
        continue;
      matchingGuitars.add(guitar);
    }
    return matchingGuitars;
  }
  */
}
