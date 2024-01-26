package f;

import com.badlogic.gdx.utils.BufferUtils;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;

public final class Qg implements EB0 {
  public final ShortBuffer kH0;
  
  public final ByteBuffer Iu;
  
  public final boolean w3;
  
  public Qg(int paramInt) {
    boolean bool;
    if (paramInt == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    this.w3 = bool;
    if (bool)
      paramInt = 1; 
    (this.kH0 = (this.Iu = BufferUtils.xz(paramInt * 2)).asShortBuffer()).flip();
    BufferUtils.xz(paramInt * 2).flip();
  }
  
  public final int pP() {
    return this.w3 ? 0 : this.kH0.limit();
  }
  
  public final int Bt() {
    return this.w3 ? 0 : this.kH0.capacity();
  }
  
  public final void q10(int paramInt, short[] paramArrayOfshort) {
    this.kH0.clear();
    this.kH0.put(paramArrayOfshort, 0, paramInt);
    this.kH0.flip();
    this.Iu.position(0);
    this.Iu.limit(paramInt << 1);
  }
  
  public final ShortBuffer w0() {
    return this.kH0;
  }
  
  public final void bind() {}
  
  public final void bj0() {}
  
  public final void dispose() {
    BufferUtils.lf(this.Iu);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Qg.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */