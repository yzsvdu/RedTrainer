package f;

public final class Ty0 extends BO {
  public int LPt9;
  
  public int zr;
  
  public float eq;
  
  public float S6;
  
  public float cOm1;
  
  public int[] cOM1 = new int[] { 0 };
  
  public float[] eT = new float[] { 0.0F };
  
  public float[] lH = new float[3];
  
  public float[] oV = new float[] { 0.0F };
  
  public float[] AL0 = new float[] { 0.0F };
  
  public Ty0(int paramInt) {
    super(paramInt);
  }
  
  public final void rH(AH0 paramAH0, Ym0 paramYm0, ls0 paramls0) {
    int i;
    this.K10 = paramAH0.Ze0(i = lPT6(paramYm0));
    this.LPt9 = paramAH0.Ze0(i);
    if (paramls0 != null) {
      paramls0.Zc0(this.K10, i);
      paramls0.Zc0(this.LPt9, i);
    } 
  }
  
  public final void qJ(AH0 paramAH0, ls0 paramls0) {
    int j = paramAH0.Ze0(2);
    if (this.K10 != 0 && paramls0 != null)
      paramls0.Zc0(j, 2); 
    int i = paramAH0.Ze0(2);
    if (this.LPt9 != 0 && paramls0 != null)
      paramls0.Zc0(i, 2); 
  }
  
  public final void ai0(AH0 paramAH0, Ym0 paramYm0) {
    super.ai0(paramAH0, paramYm0);
    if (this.LPt9 != 0) {
      float f;
      float[] arrayOfFloat2;
      switch (this.zr) {
        case 3:
          this.eq = arrayOfFloat2[paramAH0.Ze0(6)];
          this.cOm1 = f = (arrayOfFloat2 = K30.dr0)[paramAH0.Ze0(6)];
          this.S6 = f;
          break;
        case 2:
          this.cOm1 = f = K30.dr0[f.Ze0(6)];
          this.S6 = f;
          this.eq = f;
          break;
        case 1:
          this.S6 = f = arrayOfFloat2[f.Ze0(6)];
          this.eq = f;
          this.cOm1 = (arrayOfFloat2 = K30.dr0)[f.Ze0(6)];
          break;
        case 0:
          this.eq = arrayOfFloat2[f.Ze0(6)];
          this.S6 = arrayOfFloat2[f.Ze0(6)];
          this.cOm1 = (arrayOfFloat2 = K30.dr0)[f.Ze0(6)];
          break;
      } 
      int i = this.LPt9;
      float[] arrayOfFloat1 = this.eT;
      int[] arrayOfInt = this.cOM1;
      float[] arrayOfFloat3 = this.oV;
      float[] arrayOfFloat4 = this.AL0;
      gY(paramYm0, i, 1, arrayOfFloat1, arrayOfInt, arrayOfFloat3, arrayOfFloat4);
    } 
  }
  
  public final boolean Pg0(AH0 paramAH0) {
    boolean bool = super.Pg0(paramAH0);
    if (this.LPt9 != 0) {
      float[] arrayOfFloat;
      int i;
      if (this.L9[1] != null) {
        i = paramAH0.Ze0(this.cOM1[0]) + (paramAH0.Ze0(this.cOM1[0]) << 1);
        arrayOfFloat1[0] = this[i];
        arrayOfFloat1[1] = this[i];
        float[] arrayOfFloat1;
        (arrayOfFloat1 = this.lH)[2] = (arrayOfFloat = this.L9[1])[++i + 1];
      } else {
        ((Ty0)super).lH[0] = (float)((i.Ze0(((Ty0)super).cOM1[0]) * ((Ty0)super).eT[0]) - 1.0D);
        ((Ty0)super).lH[1] = (float)((i.Ze0(((Ty0)super).cOM1[0]) * ((Ty0)super).eT[0]) - 1.0D);
        ((Ty0)super).lH[2] = (float)((i.Ze0(((Ty0)super).cOM1[0]) * ((Ty0)super).eT[0]) - 1.0D);
      } 
    } 
    return bool;
  }
  
  public final boolean cOM7(int paramInt, Va paramVa1, Va paramVa2) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iload_1
    //   3: aload_2
    //   4: aload_3
    //   5: invokespecial cOM7 : (ILf/Va;Lf/Va;)Z
    //   8: istore #4
    //   10: getfield LPt9 : I
    //   13: ifeq -> 145
    //   16: iload_1
    //   17: iconst_1
    //   18: if_icmpeq -> 145
    //   21: aload_0
    //   22: dup
    //   23: getfield lH : [F
    //   26: aload_0
    //   27: getfield KN : I
    //   30: iconst_1
    //   31: isub
    //   32: faload
    //   33: fstore #5
    //   35: getfield L9 : [[F
    //   38: iconst_1
    //   39: aaload
    //   40: ifnonnull -> 61
    //   43: fload #5
    //   45: aload_0
    //   46: getfield AL0 : [F
    //   49: iconst_0
    //   50: faload
    //   51: fadd
    //   52: aload_0
    //   53: getfield oV : [F
    //   56: iconst_0
    //   57: faload
    //   58: fmul
    //   59: fstore #5
    //   61: aload_0
    //   62: getfield pL : I
    //   65: dup
    //   66: istore #6
    //   68: iconst_4
    //   69: if_icmpgt -> 84
    //   72: fload #5
    //   74: aload_0
    //   75: getfield eq : F
    //   78: fmul
    //   79: fstore #5
    //   81: goto -> 112
    //   84: iload #6
    //   86: bipush #8
    //   88: if_icmpgt -> 103
    //   91: fload #5
    //   93: aload_0
    //   94: getfield S6 : F
    //   97: fmul
    //   98: fstore #5
    //   100: goto -> 112
    //   103: fload #5
    //   105: aload_0
    //   106: getfield cOm1 : F
    //   109: fmul
    //   110: fstore #5
    //   112: iload_1
    //   113: ifne -> 132
    //   116: aload_3
    //   117: aload_0
    //   118: getfield nul : I
    //   121: istore_0
    //   122: getfield z0 : [F
    //   125: iload_0
    //   126: fload #5
    //   128: fastore
    //   129: goto -> 145
    //   132: aload_2
    //   133: aload_0
    //   134: getfield nul : I
    //   137: istore_0
    //   138: getfield z0 : [F
    //   141: iload_0
    //   142: fload #5
    //   144: fastore
    //   145: iload #4
    //   147: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 122
    //   #2	-> 128
    //   #3	-> 134
    //   #4	-> 138
    //   #5	-> 144
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ty0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */