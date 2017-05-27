import java.util.ArrayList;
import visitor.*;
import enclosures.*;

public class Zoo {
  private int entryFee;
  private ArraList<Visitor> visitors;
  private ArraList<Enclosure> enclosures;

  public Zoo() {
    entryFee = 15;
    visitors = new ArrayList<Visitor>();
    enclosures = new ArrayList<Enclosure>();
  }


}