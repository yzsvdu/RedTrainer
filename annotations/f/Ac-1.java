package f;

import java.nio.ByteBuffer;

public final class Ac {
  public o50[] hz0 = new o50[0];
  
  public Ev0[] vI = new Ev0[0];
  
  public oj0[] sW = new oj0[0];
  
  public Ll0[] l50 = new Ll0[0];
  
  public W3[] f00 = new W3[0];
  
  public Ac(T7 paramT7) {
    ByteBuffer byteBuffer;
    if ((byteBuffer = paramT7.l2()).getInt() == 0) {
      int i = byteBuffer.getInt();
      int j = byteBuffer.getInt();
      int k = byteBuffer.getInt();
      if (byteBuffer.getInt() > 0) {
        int m;
        this.hz0 = new o50[m = byteBuffer.getInt()];
        for (byte b = 0; b < m; b++) {
          o50 o501;
          this(byteBuffer);
          this.hz0[b] = o501;
        } 
      } else {
        this.hz0 = new o50[0];
      } 
      if (i > 0) {
        this.vI = new Ev0[i = byteBuffer.getInt()];
        for (byte b = 0; b < i; b++) {
          Ev0 ev0;
          this(byteBuffer);
          this.vI[b] = ev0;
        } 
      } else {
        this.vI = new Ev0[0];
      } 
      if (j > 0) {
        this.sW = new oj0[i = byteBuffer.getInt()];
        for (j = 0; j < i; j++) {
          oj0 oj01;
          this(byteBuffer);
          this.sW[j] = oj01;
        } 
      } else {
        this.sW = new oj0[0];
      } 
      if (k > 0) {
        i = byteBuffer.getInt();
        j = byteBuffer.getInt();
        byteBuffer.getInt();
        this.l50 = new Ll0[i];
        for (k = 0; k < i; k++) {
          Ll0 ll0;
          this(byteBuffer);
          this.l50[k] = ll0;
        } 
        this.f00 = new W3[j];
        for (i = 0; i < j; i++) {
          W3 w3;
          this(byteBuffer);
          this.f00[i] = w3;
        } 
      } else {
        this.l50 = new Ll0[0];
        this.f00 = new W3[0];
      } 
      return;
    } 
    throw new RuntimeException();
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ac.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */