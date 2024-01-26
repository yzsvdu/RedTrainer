package f;

import java.io.RandomAccessFile;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;

public final class kL0 extends IZ {
  public static final ik of = C00.gd(kL0.class);
  
  public lm qq0;
  
  public lm kE0;
  
  public lm Mj;
  
  public kL0() {
    super(62914560, (byte)2);
    lm lm1;
    this();
    this.qq0 = this;
    this();
    this.kE0 = this;
    this();
    this.Mj = this;
  }
  
  public final lpt1 VE0(int paramInt, Ew paramEw) {
    if (!this.QK)
      return null; 
    if ((paramInt = this.qq0.uv0(paramInt, -1)) > 0) {
      this.ec0.position(paramInt);
      return (new iR(this.ec0, paramEw)).Xv0;
    } 
    return null;
  }
  
  public final lpt1 yd0(VV paramVV, int paramInt1, int paramInt2, Iq paramIq) {
    if (!this.QK)
      return null; 
    int i;
    if ((i = ((paramVV.ordinal() != 2) ? this.kE0 : this.Mj).uv0(paramInt1 * 100 + paramInt2, -1)) > 0) {
      this.ec0.position(i);
      return (new iR(this.ec0, paramIq)).Xv0;
    } 
    return null;
  }
  
  public final boolean zl0() {
    int i;
    if ((i = (int)this.Pu.tN()) == 0) {
      of.error("File cache = 0");
      return false;
    } 
    if (i > 62914560) {
      of.error("File cache extended limit " + i + " / " + 62914560);
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
      if (this.ec0.getInt() != 3)
        return false; 
      this.qq0.clear();
      int j = this.ec0.getInt();
      byte b;
      for (b = 0; b < j; b++) {
        int k = this.ec0.getInt();
        int m = this.ec0.getInt();
        int n = this.ec0.position();
        this.qq0.Oe(k, n);
        this.ec0.position(n + m);
      } 
      this.kE0.clear();
      j = this.ec0.getInt();
      for (b = 0; b < j; b++) {
        int k = this.ec0.getInt();
        for (byte b1 = 0; b1 < k; b1++) {
          int m = this.ec0.getInt();
          int n = this.ec0.position();
          this.kE0.Oe(b * 100 + b1, n);
          this.ec0.position(n + m);
        } 
      } 
      this.Mj.clear();
      j = this.ec0.getInt();
      for (b = 0; b < j; b++) {
        int k = this.ec0.getInt();
        for (byte b1 = 0; b1 < k; b1++) {
          int m = this.ec0.getInt();
          int n = this.ec0.position();
          this.Mj.Oe(b * 100 + b1, n);
          this.ec0.position(n + m);
        } 
      } 
      this.QK = true;
      return true;
    } catch (Exception exception) {
      of.error("Error loading", this);
      return false;
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/kL0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */