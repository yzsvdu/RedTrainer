package f;

public abstract class PJ extends GS implements Np0 {
  public final byte uv;
  
  public final int[] XC;
  
  public final short[] XH0;
  
  public PJ(byte paramByte, int[] paramArrayOfint, short[] paramArrayOfshort) {
    this.uv = paramByte;
    this.XC = paramArrayOfint;
    this.XH0 = paramArrayOfshort;
    if (paramArrayOfint.length == paramArrayOfshort.length)
      return; 
    throw new IllegalArgumentException();
  }
  
  public final short dQ(int paramInt) {
    int[] arrayOfInt;
    for (byte b = 0; b < (arrayOfInt = this.XC).length; b++) {
      if (paramInt == arrayOfInt[b])
        return this.XH0[b]; 
    } 
    return -1;
  }
  
  public final boolean a60(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield XC : [I
    //   4: astore_0
    //   5: iconst_0
    //   6: istore_2
    //   7: iload_2
    //   8: aload_0
    //   9: arraylength
    //   10: if_icmpge -> 29
    //   13: iload_1
    //   14: aload_0
    //   15: iload_2
    //   16: iaload
    //   17: if_icmpne -> 23
    //   20: goto -> 31
    //   23: iinc #2, 1
    //   26: goto -> 7
    //   29: iconst_m1
    //   30: istore_2
    //   31: iload_2
    //   32: iconst_m1
    //   33: if_icmple -> 40
    //   36: iconst_1
    //   37: goto -> 41
    //   40: iconst_0
    //   41: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 9
  }
  
  public final boolean Lt() {
    return false;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/PJ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */