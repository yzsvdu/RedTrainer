package f;

import java.io.RandomAccessFile;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;

public final class if extends IZ {
  public static final ik vm0 = C00.gd(if.class);
  
  public lm mM;
  
  public lm CH;
  
  public if() {
    super(47185920, (byte)3);
    lm lm1;
    this();
    this.mM = this;
    this();
    this.CH = this;
  }
  
  public final lpt1 VE0(int paramInt, Ew paramEw) {
    if (!this.QK)
      return null; 
    if ((paramInt = this.mM.uv0(paramInt, -1)) > 0) {
      this.ec0.position(paramInt);
      return (new iR(this.ec0, paramEw)).Xv0;
    } 
    return null;
  }
  
  public final lpt1 TA(int paramInt, Iq paramIq) {
    if (!this.QK)
      return null; 
    int i;
    if ((i = this.CH.uv0(paramInt, -1)) > 0) {
      this.ec0.position(i);
      (new iR(this.ec0, paramIq)).Xv0.jx = paramInt;
      return (new iR(this.ec0, paramIq)).Xv0;
    } 
    return null;
  }
  
  public final boolean zl0() {
    int i;
    if ((i = (int)this.Pu.tN()) == 0) {
      vm0.error("File cache = 0");
      return false;
    } 
    if (i > 47185920) {
      vm0.error("File cache extended limit " + i + " / " + 47185920);
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
      if (this.ec0.getInt() != 8)
        return false; 
      this.mM.clear();
      int j = this.ec0.getInt();
      byte b;
      for (b = 0; b < j; b++) {
        int k = this.ec0.getInt();
        int m = this.ec0.getInt();
        int n = this.ec0.position();
        this.mM.Oe(k, n);
        this.ec0.position(n + m);
      } 
      this.CH.clear();
      j = this.ec0.getInt();
      for (b = 0; b < j; b++) {
        int k = this.ec0.getInt();
        int m = this.ec0.position();
        this.CH.Oe(b, m);
        this.ec0.position(m + k);
      } 
      this.QK = true;
      return true;
    } catch (Exception exception) {
      vm0.error("Error loading", this);
      return false;
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/if.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */