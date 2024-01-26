package f;

public class pr {
  public DK zK;
  
  public byte xZ;
  
  public float A30;
  
  public short G20;
  
  public byte COM7;
  
  public int Xr0;
  
  public int Gm;
  
  public pr(DK paramDK, byte paramByte) {
    this.G20 = -1;
    this.zK = paramDK;
    this.xZ = paramByte;
    this.A30 = 500.0F;
  }
  
  public pr(DK paramDK, byte paramByte1, float paramFloat, short paramShort, byte paramByte2, int paramInt1, int paramInt2) {
    this.zK = paramDK;
    this.xZ = paramByte1;
    this.A30 = paramFloat;
    this.G20 = paramShort;
    this.COM7 = paramByte2;
    this.Xr0 = paramInt1;
    this.Gm = paramInt2;
  }
  
  public final rs0 dy() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Xr0 : I
    //   4: ifgt -> 32
    //   7: aload_0
    //   8: getfield Gm : I
    //   11: ifgt -> 32
    //   14: aload_0
    //   15: getfield A30 : F
    //   18: ldc 500.0
    //   20: fcmpl
    //   21: ifeq -> 27
    //   24: goto -> 32
    //   27: iconst_0
    //   28: istore_1
    //   29: goto -> 34
    //   32: iconst_1
    //   33: istore_1
    //   34: iload_1
    //   35: ifne -> 42
    //   38: getstatic f/rs0.protected : Lf/rs0;
    //   41: areturn
    //   42: aload_0
    //   43: getfield G20 : S
    //   46: dup
    //   47: istore_1
    //   48: iconst_1
    //   49: if_icmpne -> 56
    //   52: getstatic f/rs0.Xy0 : Lf/rs0;
    //   55: areturn
    //   56: iload_1
    //   57: ifle -> 64
    //   60: getstatic f/rs0.Wd : Lf/rs0;
    //   63: areturn
    //   64: aload_0
    //   65: getfield A30 : F
    //   68: fstore_0
    //   69: getstatic f/rs0.ai0 : [Lf/rs0;
    //   72: arraylength
    //   73: iconst_1
    //   74: isub
    //   75: istore_1
    //   76: iload_1
    //   77: iflt -> 104
    //   80: fload_0
    //   81: getstatic f/rs0.ai0 : [Lf/rs0;
    //   84: iload_1
    //   85: aaload
    //   86: dup
    //   87: astore_2
    //   88: getfield e8 : F
    //   91: fcmpl
    //   92: iflt -> 98
    //   95: goto -> 108
    //   98: iinc #1, -1
    //   101: goto -> 76
    //   104: getstatic f/rs0.protected : Lf/rs0;
    //   107: astore_2
    //   108: aload_2
    //   109: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 1
    //   #2	-> 38
    //   #3	-> 69
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/pr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */