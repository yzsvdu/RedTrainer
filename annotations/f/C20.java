package f;

import java.nio.ByteBuffer;

public final class C20 {
  public static final ik do = C00.gd(C20.class);
  
  public w00 EV;
  
  public Wd bl;
  
  public fQ PF0;
  
  public C20(ByteBuffer paramByteBuffer) {
    this(paramByteBuffer, false, false);
  }
  
  public C20(ByteBuffer paramByteBuffer, boolean paramBoolean1, boolean paramBoolean2) {
    Wd wd;
    w00 w001;
    if (paramBoolean2) {
      this.PF0 = new fQ(1);
      this(paramBoolean1, paramByteBuffer);
      this.bl = new Wd();
      this.PF0.Com3(this);
      return;
    } 
    this(paramByteBuffer, 811095106);
    ((C20)super).EV = new w00();
    if (!w001.ib) {
      do.error("Not a valid BTX0 file");
      return;
    } 
    ((C20)super).PF0 = new fQ(w001.gi);
    w00 w002;
    for (byte b = 0; b < (w002 = ((C20)super).EV).gi; b++) {
      paramByteBuffer.position(w002.fD[b]);
      if (paramByteBuffer.getInt() != 811091284) {
        do.error("unknown block header");
      } else {
        paramByteBuffer.position(paramByteBuffer.position() - 4);
        ((C20)super).PF0.Com3(new Wd(paramBoolean1, paramByteBuffer));
      } 
    } 
    ((C20)super).bl = (Wd)((C20)super).PF0.first();
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/C20.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */