package f;

import java.io.ByteArrayOutputStream;

public final class OK extends Hn {
  public OK(Xb0 paramXb0, RD0 paramRD0) {
    super(paramXb0);
    ByteArrayOutputStream byteArrayOutputStream;
    Jm jm;
    AH0 aH0;
    if (paramXb0.jj0)
      return; 
    this(4096);
    this(paramRD0.Yc());
    this();
    Object object = null;
    byte b = -1;
    int i = -1;
    try {
      while (true) {
        qR qR;
        Ym0 ym0;
        if ((ym0 = aH0.sv()) == null) {
          aH0.ov();
          return;
        } 
        if (object == null) {
          byte b1;
          qR qR1;
          if (ym0.Kb() == 3) {
            b1 = 1;
          } else {
            b1 = 2;
          } 
          this(b1);
          jm.qO(qR1);
          i = ym0.Wb();
          i = b1;
          int k = i;
          qR = qR1;
        } 
        try {
          jm.t0(aH0, ym0);
        } catch (Exception exception) {}
        aH0.nt();
        byte[] arrayOfByte = qR.E4();
        boolean bool = false;
        int j = qR.CJ();
        byteArrayOutputStream.write(arrayOfByte, bool, j);
      } 
    } finally {
      byteArrayOutputStream = null;
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/OK.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */