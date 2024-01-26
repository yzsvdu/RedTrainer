package f;

import java.util.ArrayList;

public final class Pg {
  public static final Pg nc = new Pg();
  
  public ArrayList GO;
  
  public Pg() {
    (this.GO = new ArrayList<>()).add(new Or0());
    this.GO.add(new fI());
    this.GO.add(new b5());
    this.GO.add(new JV());
    this.GO.add(new aA());
    this.GO.add(new Aa0());
    this.GO.add(new at0());
    this.GO.add(new Cw0());
    this.GO.add(new r5());
    this.GO.add(new ee());
    this.GO.add(new Ph());
    this.GO.add(new en0());
    this.GO.add(new Ml());
    this.GO.add(new D40());
    this.GO.add(new mI());
    this.GO.add(new Yz0());
    this.GO.add(new y7());
    this.GO.add(new D4());
    this.GO.add(new U30());
    this.GO.add(new b20());
    this.GO.add(new dC0());
    this.GO.add(new Zu());
    ZY[] arrayOfZY;
    int i = (arrayOfZY = ZY.R70).length;
    for (byte b = 0; b < i; b++) {
      ZY zY;
      if ((zY = arrayOfZY[b]).Rz() != null) {
        String[] arrayOfString;
        int j = (arrayOfString = zY.Rz()).length;
        for (byte b1 = 0; b1 < j; b1++) {
          String str = arrayOfString[b1];
          if (zY == ZY.Nd0) {
            this.GO.add(new nUl(str));
          } else {
            this.GO.add(new c7(str, zY));
          } 
        } 
      } 
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Pg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */