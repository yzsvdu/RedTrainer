package f;

import com.badlogic.gdx.utils.BufferUtils;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;

public final class Lu implements EB0 {
  public final ShortBuffer A80;
  
  public final ByteBuffer j0;
  
  public final boolean cV;
  
  public int VR;
  
  public boolean iT;
  
  public boolean np;
  
  public final int Qp;
  
  public final boolean ig0;
  
  public Lu(int paramInt) {
    this(true, paramInt);
  }
  
  public Lu(boolean paramBoolean, int paramInt) {
    char c;
    boolean bool;
    this.iT = true;
    this.np = false;
    if (paramInt == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    this.ig0 = bool;
    if (bool)
      paramInt = 1; 
    this.A80 = shortBuffer;
    this.cV = true;
    ShortBuffer shortBuffer;
    (shortBuffer = (this.j0 = BufferUtils.xz(paramInt * 2)).asShortBuffer()).flip();
    BufferUtils.xz(paramInt * 2).flip();
    this.VR = UB0.re0.glGenBuffer();
    if (paramBoolean) {
      c = '裤';
    } else {
      c = '裨';
    } 
    this.Qp = c;
  }
  
  public Lu(boolean paramBoolean, ByteBuffer paramByteBuffer) {
    char c;
    boolean bool;
    this.iT = true;
    this.np = false;
    if (paramByteBuffer.limit() == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    this.ig0 = bool;
    this.j0 = paramByteBuffer;
    this.A80 = paramByteBuffer.asShortBuffer();
    this.cV = false;
    this.VR = UB0.re0.glGenBuffer();
    if (paramBoolean) {
      c = '裤';
    } else {
      c = '裨';
    } 
    this.Qp = c;
  }
  
  public final int pP() {
    return this.ig0 ? 0 : this.A80.limit();
  }
  
  public final int Bt() {
    return this.ig0 ? 0 : this.A80.capacity();
  }
  
  public final void q10(int paramInt, short[] paramArrayOfshort) {
    this.iT = true;
    this.A80.clear();
    this.A80.put(paramArrayOfshort, 0, paramInt);
    this.A80.flip();
    this.j0.position(0);
    this.j0.limit(paramInt << 1);
    if (this.np) {
      int i = this.j0.limit();
      ByteBuffer byteBuffer = this.j0;
      int j = this.Qp;
      UB0.re0.glBufferData(34963, i, byteBuffer, j);
      this.iT = false;
    } 
  }
  
  public final ShortBuffer w0() {
    this.iT = true;
    return this.A80;
  }
  
  public final void bind() {
    int i;
    if ((i = this.VR) != 0) {
      UB0.re0.glBindBuffer(34963, i);
      if (this.iT) {
        this.j0.limit(this.A80.limit() * 2);
        i = this.j0.limit();
        ByteBuffer byteBuffer = this.j0;
        int j = this.Qp;
        UB0.re0.glBufferData(34963, i, byteBuffer, j);
        this.iT = false;
      } 
      this.np = true;
      return;
    } 
    throw new JU("No buffer allocated!");
  }
  
  public final void bj0() {
    UB0.re0.glBindBuffer(34963, 0);
    this.np = false;
  }
  
  public final void dispose() {
    UB0.re0.glBindBuffer(34963, 0);
    UB0.re0.glDeleteBuffer(this.VR);
    this.VR = 0;
    if (this.cV)
      BufferUtils.lf(this.j0); 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Lu.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */