/* 1 */ package f;public final class zc extends dj { public static final long U7 = dj.tv0("blended"); public boolean lv0; public int fi; public int Wy; public float yg0; public zc() { this((zc)null); } public final int hashCode() { int i = (((super.hashCode() * 947 + this.lv0) * 947 + this.fi) * 947 + this.Wy) * 947; return Float.floatToRawIntBits(this.yg0) + i; } public zc(boolean paramBoolean, int paramInt1, int paramInt2, float paramFloat) { super(U7); this.lv0 = paramBoolean; this.fi = paramInt1; this.Wy = paramInt2; this.yg0 = paramFloat; } public zc(int paramInt1, int paramInt2, float paramFloat) { this(true, paramInt1, paramInt2, paramFloat); } public zc(int paramInt1, int paramInt2) { this(paramInt1, paramInt2, 1.0F); } public zc(boolean paramBoolean, float paramFloat) { this(paramBoolean, 770, 771, paramFloat); } public zc(float paramFloat) { this(true, paramFloat); } public zc(zc paramzc) { this(bool, i, j, f); } public final dj Mi0() { return new zc(this); }
/*   */ 
/*   */   
/*   */   public final int compareTo(Object paramObject) {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: aload_1
/*   */     //   2: checkcast f/dj
/*   */     //   5: astore_1
/*   */     //   6: getfield tL : J
/*   */     //   9: dup2
/*   */     //   10: lstore_2
/*   */     //   11: aload_1
/*   */     //   12: getfield tL : J
/*   */     //   15: dup2
/*   */     //   16: lstore #4
/*   */     //   18: lcmp
/*   */     //   19: ifeq -> 31
/*   */     //   22: lload_2
/*   */     //   23: lload #4
/*   */     //   25: lsub
/*   */     //   26: l2i
/*   */     //   27: istore_0
/*   */     //   28: goto -> 137
/*   */     //   31: aload_0
/*   */     //   32: aload_1
/*   */     //   33: checkcast f/zc
/*   */     //   36: astore_1
/*   */     //   37: getfield lv0 : Z
/*   */     //   40: dup
/*   */     //   41: istore_2
/*   */     //   42: aload_1
/*   */     //   43: getfield lv0 : Z
/*   */     //   46: if_icmpeq -> 63
/*   */     //   49: iload_2
/*   */     //   50: ifeq -> 58
/*   */     //   53: iconst_1
/*   */     //   54: istore_0
/*   */     //   55: goto -> 137
/*   */     //   58: iconst_m1
/*   */     //   59: istore_0
/*   */     //   60: goto -> 137
/*   */     //   63: aload_0
/*   */     //   64: getfield fi : I
/*   */     //   67: dup
/*   */     //   68: istore_2
/*   */     //   69: aload_1
/*   */     //   70: getfield fi : I
/*   */     //   73: dup
/*   */     //   74: istore_3
/*   */     //   75: if_icmpeq -> 85
/*   */     //   78: iload_2
/*   */     //   79: iload_3
/*   */     //   80: isub
/*   */     //   81: istore_0
/*   */     //   82: goto -> 137
/*   */     //   85: aload_0
/*   */     //   86: getfield Wy : I
/*   */     //   89: dup
/*   */     //   90: istore_2
/*   */     //   91: aload_1
/*   */     //   92: getfield Wy : I
/*   */     //   95: dup
/*   */     //   96: istore_3
/*   */     //   97: if_icmpeq -> 103
/*   */     //   100: goto -> 78
/*   */     //   103: aload_0
/*   */     //   104: getfield yg0 : F
/*   */     //   107: aload_1
/*   */     //   108: getfield yg0 : F
/*   */     //   111: invokestatic JC0 : (FF)Z
/*   */     //   114: ifeq -> 122
/*   */     //   117: iconst_0
/*   */     //   118: istore_0
/*   */     //   119: goto -> 137
/*   */     //   122: aload_0
/*   */     //   123: getfield yg0 : F
/*   */     //   126: aload_1
/*   */     //   127: getfield yg0 : F
/*   */     //   130: fcmpg
/*   */     //   131: ifge -> 58
/*   */     //   134: goto -> 53
/*   */     //   137: iload_0
/*   */     //   138: ireturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 6
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/zc.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */