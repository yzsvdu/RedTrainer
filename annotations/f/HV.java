/*  1 */ package f;public abstract class HV { public final NI0 yz(boolean paramBoolean, short paramShort1, short paramShort2, byte paramByte, float paramFloat) { NI0[] arrayOfNI0; int i; byte b; for (i = (arrayOfNI0 = this.et).length, b = 0; b < i; ) { NI0 nI0 = this[b]; short s; if (paramBoolean && nI0.f30 && paramShort1 >= (
/*  2 */         s = nI0.qF) && paramShort1 < s + nI0
/*  3 */         .wR && paramShort2 >= (
/*  4 */         s = nI0.ls0) && paramShort2 < s + nI0
/*  5 */         .f90 && paramByte == nI0
/*  6 */         .Ix) return nI0;  if (!paramBoolean && 
/*  7 */         !nI0.f30 && paramShort1 >= nI0
/*  8 */         .Sn0() && paramShort1 < nI0.Sn0() + nI0
/*  9 */         .wR && paramShort2 >= nI0
/* 10 */         .Qq0() && paramShort2 < nI0.Qq0() + nI0
/* 11 */         .f90 && 
/* 12 */         Math.abs(paramFloat - nI0.kS()) < 2.0F) return nI0;  b++; }  return null; }
/*    */ 
/*    */   
/*    */   public a40[] oj = new a40[0];
/*    */   public cm0[] KH = new cm0[0];
/*    */   public NI0[] et = new NI0[0];
/*    */   public C2[] xx0 = new C2[0];
/*    */   
/*    */   public final NI0 YE0(short paramShort) {
/*    */     NI0[] arrayOfNI0;
/*    */     return (paramShort < 0 || paramShort >= (arrayOfNI0 = this.et).length) ? null : this[paramShort];
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/HV.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */