package f;

import com.badlogic.gdx.utils.BufferUtils;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;

public final class fy implements EB0 {
  public final ShortBuffer Ij0;
  
  public final ByteBuffer K60;
  
  public int Xp0;
  
  public boolean VF0 = true;
  
  public boolean Iv = false;
  
  public final int Fg0;
  
  public fy(boolean paramBoolean, int paramInt) {
    ByteBuffer byteBuffer = BufferUtils.ar(paramInt * 2);
    if (paramBoolean) {
      paramInt = 35044;
    } else {
      paramInt = 35048;
    } 
    this.Fg0 = paramInt;
    (this.Ij0 = byteBuffer.asShortBuffer()).flip();
    byteBuffer.flip();
    this.Xp0 = YE0();
  }
  
  public fy(int paramInt) {
    this.K60 = byteBuffer;
    this.Fg0 = 35044;
    ByteBuffer byteBuffer;
    (this.Ij0 = (byteBuffer = BufferUtils.ar(paramInt * 2)).asShortBuffer()).flip();
    BufferUtils.ar(paramInt * 2).flip();
    this.Xp0 = YE0();
  }
  
  public final int pP() {
    return this.Ij0.limit();
  }
  
  public final int Bt() {
    return this.Ij0.capacity();
  }
  
  public final void q10(int paramInt, short[] paramArrayOfshort) {
    this.VF0 = true;
    this.Ij0.clear();
    this.Ij0.put(paramArrayOfshort, 0, paramInt);
    this.Ij0.flip();
    this.K60.position(0);
    this.K60.limit(paramInt << 1);
    if (this.Iv) {
      int i = this.K60.limit();
      ByteBuffer byteBuffer = this.K60;
      UB0.re0.glBufferSubData(34963, 0, i, byteBuffer);
      this.VF0 = false;
    } 
  }
  
  public final ShortBuffer w0() {
    this.VF0 = true;
    return this.Ij0;
  }
  
  public final void bind() {
    int i;
    if ((i = this.Xp0) != 0) {
      UB0.re0.glBindBuffer(34963, i);
      if (this.VF0) {
        this.K60.limit(this.Ij0.limit() * 2);
        i = this.K60.limit();
        ByteBuffer byteBuffer = this.K60;
        UB0.re0.glBufferSubData(34963, 0, i, byteBuffer);
        this.VF0 = false;
      } 
      this.Iv = true;
      return;
    } 
    throw new JU("IndexBufferObject cannot be used after it has been disposed.");
  }
  
  public final void bj0() {
    UB0.re0.glBindBuffer(34963, 0);
    this.Iv = false;
  }
  
  public final void dispose() {
    UB0.re0.glBindBuffer(34963, 0);
    UB0.re0.glDeleteBuffer(this.Xp0);
    this.Xp0 = 0;
  }
  
  public final int YE0() {
    UB0.re0.glBindBuffer(34963, j);
    int i = this.K60.capacity();
    int j = this.Fg0;
    UB0.re0.glBufferData(34963, i, null, j);
    UB0.re0.glBindBuffer(34963, 0);
    return j = UB0.re0.glGenBuffer();
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/fy.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */