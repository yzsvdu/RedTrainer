/* 1 */ package f;public final class j8 extends Un implements Runnable { public int SZ; public int mx0; public int am0; public final QM VT; public j8(Na paramNa) { QM qM; this(this); this.VT = qM; tW(this); } public final boolean i2(oa0 paramoa0) { if (paramoa0.Cz0()) { this.o.HF = Integer.MIN_VALUE; this.o
/* 2 */         .El0 = -1; this.o.KI = -1; }
/* 3 */      return super.i2(paramoa0); } public final String TI() { return "columnheader"; } public final int J50() { int i; TI0 tI0; return ((i = this.mx0) > 0) ? i : Math.max(((tI0 = this.o.Q8(this.SZ)) != null) ? tI0.j7 : this.o.mg, super.J50()); } public final int AW() { TI0 tI0; return Math.max(((tI0 = this.o.Q8(this.SZ)) != null) ? tI0.H70 : 0, super.J50()); } public final int W3() { TI0 tI0; return ((tI0 = this.o.Q8(this.SZ)) != null) ? this.th0 : 32767; } public final void mM() {} public final void J00(throws paramthrows) { tw tw; int i = this.Kd; int j = this.er0;
/* 4 */     int k = this.xY;
/* 5 */     int m = this.HC;
/* 6 */     tw.X2(i, j, k, m); try { return; }
/*   */     finally
/* 8 */     { this = null; tw.Hq0(); }
/*   */      }
/*   */ 
/*   */   
/*   */   public final void run() {
/*   */     this.o.Ki(this.SZ);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/j8.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */