package f;

import java.nio.IntBuffer;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

public final class fE extends I10 implements ib {
  public final void Hs(int paramInt, IntBuffer paramIntBuffer) {
    int i = paramIntBuffer.limit();
    paramIntBuffer.limit(paramInt);
    GL20.glDrawBuffers(paramIntBuffer);
    paramIntBuffer.limit(i);
  }
  
  public final void glBindFramebuffer(int paramInt1, int paramInt2) {
    GL30.glBindFramebuffer(36160, paramInt2);
  }
  
  public final void glBindRenderbuffer(int paramInt1, int paramInt2) {
    GL30.glBindRenderbuffer(36161, paramInt2);
  }
  
  public final int glCheckFramebufferStatus(int paramInt) {
    return GL30.glCheckFramebufferStatus(36160);
  }
  
  public final void glDeleteFramebuffer(int paramInt) {
    GL30.glDeleteFramebuffers(paramInt);
  }
  
  public final void glDeleteRenderbuffer(int paramInt) {
    GL30.glDeleteRenderbuffers(paramInt);
  }
  
  public final void glGenerateMipmap(int paramInt) {
    GL30.glGenerateMipmap(paramInt);
  }
  
  public final int glGenFramebuffer() {
    return GL30.glGenFramebuffers();
  }
  
  public final int glGenRenderbuffer() {
    return GL30.glGenRenderbuffers();
  }
  
  public final void glRenderbufferStorage(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    GL30.glRenderbufferStorage(36161, paramInt2, paramInt3, paramInt4);
  }
  
  public final void glFramebufferTexture2D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    GL30.glFramebufferTexture2D(36160, paramInt2, 3553, paramInt4, 0);
  }
  
  public final void glFramebufferRenderbuffer(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    GL30.glFramebufferRenderbuffer(36160, paramInt2, 36161, paramInt4);
  }
  
  public final void yy0(int paramInt) {
    GL30.glBindVertexArray(paramInt);
  }
  
  public final void Qu0(IntBuffer paramIntBuffer) {
    GL30.glDeleteVertexArrays(paramIntBuffer);
  }
  
  public final void Vl(IntBuffer paramIntBuffer) {
    GL30.glGenVertexArrays(paramIntBuffer);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/fE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */