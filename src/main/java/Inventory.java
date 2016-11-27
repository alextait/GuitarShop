import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
  private LinkedList<Guitar> guitars = new LinkedList<Guitar>();

  public Inventory() {

  }

  public void addGuitar(String serialNumber, double price,
                        Builder builder, String model,
                        Type type, Wood backWood, Wood topWood) {
    Guitar guitar = new Guitar(serialNumber, price, builder,
                               model, type, backWood, topWood);
    guitars.add(guitar);
  }

  public Guitar getGuitar(String serialNumber) {
    guitars.forEach(guitar->{
        if(guitar.getSerialNumber().equals(serialNumber)) {
          //return guitar;
        }
      });
    return null;
  }


  public List search (Guitar searchGuitar){
      List matchingGuitars = new LinkedList();
      guitars.forEach(guitar->{
        if (searchGuitar.getBuilder() != guitar.getBuilder())
          return;
        String model = searchGuitar.getModel().toLowerCase();
        if ((model != null) && (!model.equals("")) && (!model.equals(guitar.getModel().toLowerCase())))
          return;
        if (searchGuitar.getType() != guitar.getType())
          return;
        if (searchGuitar.getBackWood() != guitar.getBackWood())
          return;
        if (searchGuitar.getTopWood() != guitar.getTopWood())
          return;
        matchingGuitars.add(guitar);
      });
      return matchingGuitars;
  }

}
