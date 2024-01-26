package f;

import java.io.RandomAccessFile;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;

public final class Yv0 extends IZ {
  public static final ik SD = C00.gd(Yv0.class);
  
  public lm bS;
  
  public lm Mq0;
  
  public lm Pi0;
  
  public Yv0() {
    super(62914560, (byte)4);
    lm lm1;
    this();
    this.bS = this;
    this();
    this.Mq0 = this;
    this();
    this.Pi0 = this;
  }
  
  public final lpt1 VE0(int paramInt, Ew paramEw) {
    if (!this.QK)
      return null; 
    if ((paramInt = this.bS.uv0(paramInt, -1)) > 0) {
      this.ec0.position(paramInt);
      return (new iR(this.ec0, paramEw)).Xv0;
    } 
    return null;
  }
  
  public final lpt1 oL0(VV paramVV, int paramInt, Iq paramIq) {
    int i;
    if (!this.QK)
      return null; 
    if (paramVV == VV.transient) {
      i = this.Mq0.uv0(paramInt, -1);
    } else {
      i = this.Pi0.uv0(paramInt, -1);
    } 
    if (i > 0) {
      boolean bool;
      this.ec0.position(i);
      lpt1 lpt1;
      (lpt1 = (new iR(this.ec0, paramIq)).Xv0).jx = paramInt;
      if (paramVV == VV.i60) {
        bool = true;
      } else {
        bool = false;
      } 
      this.bv = bool;
      return this;
    } 
    return null;
  }
  
  public final boolean zl0() {
    int i;
    if ((i = (int)this.Pu.tN()) == 0) {
      SD.error("File cache = 0");
      return false;
    } 
    if (i > 62914560) {
      SD.error("File cache extended limit " + i + " / " + 62914560);
      return false;
    } 
    try {
      this(this.Pu.bo(), "r");
      FileChannel.MapMode mapMode = FileChannel.MapMode.READ_ONLY;
      long l1 = 0L;
      long l2 = randomAccessFile.length();
      this.ec0 = randomAccessFile.getChannel().map(mapMode, l1, l2).order(ByteOrder.nativeOrder());
      RandomAccessFile randomAccessFile;
      (randomAccessFile = new RandomAccessFile()).close();
      if (this.ec0.getInt() != 9)
        return false; 
      this.bS.clear();
      int j = this.ec0.getInt();
      byte b;
      for (b = 0; b < j; b++) {
        int k = this.ec0.getInt();
        int m = this.ec0.getInt();
        int n = this.ec0.position();
        this.bS.Oe(k, n);
        this.ec0.position(n + m);
      } 
      this.Mq0.clear();
      j = this.ec0.getInt();
      for (b = 0; b < j; b++) {
        int k = this.ec0.getInt();
        int m = this.ec0.position();
        this.Mq0.Oe(b, m);
        this.ec0.position(m + k);
      } 
      this.Pi0.clear();
      j = this.ec0.getInt();
      for (b = 0; b < j; b++) {
        int k = this.ec0.getInt();
        int m = this.ec0.position();
        this.Pi0.Oe(b, m);
        this.ec0.position(m + k);
      } 
      this.QK = true;
      return true;
    } catch (Exception exception) {
      SD.error("Error loading", this);
      return false;
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Yv0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */