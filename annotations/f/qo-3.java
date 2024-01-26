package f;

import com.badlogic.gdx.graphics.Color;

public final class qo extends dj {
  public static final long A80;
  
  public static final long J9;
  
  public static final long bh0;
  
  public static final long cu0;
  
  public static final long Ib;
  
  public static final long iu0;
  
  public static final long Ml;
  
  public static long JG;
  
  public final Color vF0 = new Color();
  
  public static final boolean jc(long paramLong) {
    return ((paramLong & JG) != 0L);
  }
  
  public static final qo SI(Color paramColor) {
    return new qo(A80, paramColor);
  }
  
  public qo(long paramLong) {
    super(paramLong);
    if (jc(paramLong))
      return; 
    throw new JU("Invalid type specified");
  }
  
  public qo(long paramLong, Color paramColor) {
    this(paramLong);
    if (paramColor != null)
      this.vF0.set(paramColor); 
  }
  
  public qo(long paramLong, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    this(paramLong);
    this.vF0.set(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
  }
  
  public qo(qo paramqo) {
    this(l, color);
  }
  
  static {
    long l1 = dj.tv0("diffuseColor");
    long l2 = dj.tv0("specularColor");
    bh0 = l3;
    cu0 = l1 = dj.tv0("emissiveColor");
    long l3 = dj.tv0("reflectionColor");
    long l4 = dj.tv0("ambientLightColor");
    long l5 = dj.tv0("fogColor");
    JG = (l3 = dj.tv0("ambientColor")) | l1 | l2 | l1 | l3 | l4 | l5;
  }
  
  public final dj Mi0() {
    return new qo(this);
  }
  
  public final int hashCode() {
    int i = super.hashCode() * 953;
    return this.vF0.toIntBits() + i;
  }
  
  public final int compareTo(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: checkcast f/dj
    //   5: astore_1
    //   6: getfield tL : J
    //   9: dup2
    //   10: lstore_2
    //   11: aload_1
    //   12: getfield tL : J
    //   15: dup2
    //   16: lstore #4
    //   18: lcmp
    //   19: ifeq -> 31
    //   22: lload_2
    //   23: lload #4
    //   25: lsub
    //   26: l2i
    //   27: istore_0
    //   28: goto -> 50
    //   31: aload_1
    //   32: checkcast f/qo
    //   35: getfield vF0 : Lcom/badlogic/gdx/graphics/Color;
    //   38: invokevirtual toIntBits : ()I
    //   41: aload_0
    //   42: getfield vF0 : Lcom/badlogic/gdx/graphics/Color;
    //   45: invokevirtual toIntBits : ()I
    //   48: isub
    //   49: istore_0
    //   50: iload_0
    //   51: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 6
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/qo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */