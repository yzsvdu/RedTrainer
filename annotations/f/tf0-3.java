package f;

import java.nio.ByteBuffer;

public final class tf0 {
  public int nJ;
  
  public int qf;
  
  public SK iu0;
  
  public SK T;
  
  public SK YE;
  
  public U1 Zt0;
  
  public Jw0 Gt0;
  
  public Jw0 Ye;
  
  public Jw0 ED0;
  
  public tf0(int paramInt1, int paramInt2, int paramInt3, int paramInt4, ByteBuffer paramByteBuffer) {
    this.nJ = paramInt1;
    this.qf = paramByteBuffer.getShort() & 0xFFFF;
    paramByteBuffer.get();
    paramByteBuffer.get();
    if ((this.qf & 0x1L) == 0L) {
      if (Qp0()) {
        boolean bool;
        SK sK = new SK();
        if ((this.qf & 0x8L) != 0L) {
          bool = true;
        } else {
          bool = false;
        } 
        this(paramByteBuffer, paramInt2, bool, paramInt1);
        this.iu0 = sK;
        sK = new SK();
        if ((this.qf & 0x10L) != 0L) {
          bool = true;
        } else {
          bool = false;
        } 
        this(paramByteBuffer, paramInt2, bool, paramInt1);
        this.T = sK;
        sK = new SK();
        if ((this.qf & 0x20L) != 0L) {
          bool = true;
        } else {
          bool = false;
        } 
        this(paramByteBuffer, paramInt2, bool, paramInt1);
        this.YE = sK;
      } 
      if (Lx0()) {
        U1 u1;
        boolean bool = Id();
        this(paramInt2, paramInt3, paramInt4, bool, paramInt1, paramByteBuffer);
        this.Zt0 = u1;
      } 
      if (LL0()) {
        Jw0 jw0 = new Jw0();
        if ((this.qf & 0x800L) != 0L) {
          paramInt4 = 1;
        } else {
          paramInt4 = 0;
        } 
        this(paramByteBuffer, paramInt2, paramInt4, paramInt1);
        this.Gt0 = jw0;
        jw0 = new Jw0();
        if ((this.qf & 0x1000L) != 0L) {
          paramInt4 = 1;
        } else {
          paramInt4 = 0;
        } 
        this(paramByteBuffer, paramInt2, paramInt4, paramInt1);
        this.Ye = jw0;
        jw0 = new Jw0();
        if ((this.qf & 0x2000L) != 0L) {
          paramInt4 = 1;
        } else {
          paramInt4 = 0;
        } 
        this(paramByteBuffer, paramInt2, paramInt4, paramInt1);
        this.ED0 = jw0;
      } 
    } 
  }
  
  public final boolean Qp0() {
    int i;
    return (((i = this.qf) & 0x2L) == 0L && (i & 0x4L) == 0L);
  }
  
  public final boolean Id() {
    return ((this.qf & 0x100L) != 0L);
  }
  
  public final boolean Lx0() {
    int i;
    return (((i = this.qf) & 0x40L) == 0L && (i & 0x80L) == 0L);
  }
  
  public final boolean LL0() {
    int i;
    return (((i = this.qf) & 0x200L) == 0L && (i & 0x400L) == 0L);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/tf0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */