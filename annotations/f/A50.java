package f;

import java.nio.ByteBuffer;

public final class A50 {
  public uz0[] Ek;
  
  public A50(HI paramHI) {
    if (paramHI.bO() == 2) {
      int i;
      this.Ek = new uz0[i = (paramHI.Vz().B8("/a/0/1/3")).zu0 / 10];
      ByteBuffer byteBuffer = paramHI.Vz().B8("/a/0/1/3").l2();
      for (byte b = 0; b < i; b++) {
        uz0 uz01;
        this(paramHI.bO(), byteBuffer);
        this.Ek[b] = uz01;
      } 
    } else if (paramHI.bO() == 3) {
      ig ig;
      this(paramHI.Vz().B8("/fielddata/areadata/area_data.narc"));
      int i = (new ig()).size();
      this.Ek = new uz0[(new ig()).size()];
      for (byte b = 0; b < i; b++) {
        uz0 uz01;
        ByteBuffer byteBuffer = ig.Em0(b).l2();
        this(paramHI.bO(), byteBuffer);
        this.Ek[b] = uz01;
      } 
    } else if (paramHI.bO() == 4) {
      ig ig;
      this(paramHI.Vz().B8("/a/0/4/2"));
      int i = (new ig()).size();
      this.Ek = new uz0[(new ig()).size()];
      for (byte b = 0; b < i; b++) {
        uz0 uz01;
        ByteBuffer byteBuffer = ig.Em0(b).l2();
        this(paramHI.bO(), byteBuffer);
        this.Ek[b] = uz01;
      } 
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/A50.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */