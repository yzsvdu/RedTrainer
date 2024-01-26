/* 1 */ package f;public final class yG0 { public static final Comparator AG0 = yG0::VH0; public static final Comparator VC0 = yG0::u70; public static final Comparator w50 = Comparator.comparingInt(yG0::cj); public final short Vo; public static int cj(yG0 paramyG0) { int i; if (paramyG0 != null) { i = paramyG0.L30; } else { i = Integer.MAX_VALUE; }  return i; }
/* 2 */   public byte L30; public int iA; public int IE; public float g20; public yG0(short paramShort, int paramInt1, int paramInt2) { this.Vo = paramShort; this.iA = paramInt1; this.IE = paramInt2; aI(); } public static int u70(yG0 paramyG01, yG0 paramyG02) { float f1; float f2; return ((f1 = paramyG01.g20) == (f2 = paramyG02.g20)) ? 0 : ((f2 > f1) ? 1 : -1); } public static int VH0(yG0 paramyG01, yG0 paramyG02) { int i; int j; return ((i = paramyG01.iA) == (j = paramyG02.iA)) ? 0 : ((j > i) ? 1 : -1); }
/*   */ 
/*   */   
/*   */   public final void aI() {
/*   */     this.g20 = this.IE / this.iA * 100.0F;
/*   */   }
/*   */   
/*   */   static {
/*   */     C00.gd(yG0.class);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/yG0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */