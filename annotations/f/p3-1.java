package f;

import java.io.DataInputStream;
import java.nio.charset.StandardCharsets;

public final class p3 {
  public String Gb;
  
  public byte ny0;
  
  public RD0 ro;
  
  public Xj0 oe;
  
  public p3(RD0 paramRD0) {
    this.ro = paramRD0;
  }
  
  public final boolean oz(boolean paramBoolean) {
    try {
      if (this.oe != null)
        return true; 
      this(this.ro.hQ(1024));
      byte[] arrayOfByte;
      dataInputStream.read(arrayOfByte = new byte[4]);
      this.Gb = new String(arrayOfByte, StandardCharsets.UTF_8);
      this.ny0 = dataInputStream.readByte();
      DataInputStream dataInputStream;
      int i;
      if ((i = (dataInputStream = new DataInputStream()).readInt()) < 0 || i > 100000)
        return false; 
      if (paramBoolean) {
        Xj0 xj0;
        this(i);
        this.oe = xj0;
        for (byte b = 0; b < i; b++) {
          int j = dataInputStream.readInt();
          this.oe.B3(j, dataInputStream.readInt());
        } 
      } 
      dataInputStream.close();
      return true;
    } catch (Exception exception) {
      return false;
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/p3.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */