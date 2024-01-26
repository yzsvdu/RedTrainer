/* 1 */ package f;public final class QB extends Kl0 { public pE0 ws; public final void sM() { int i = Gc0(), j = Gc0(); BitSet bitSet = pE0.Dm(ee0(Gc0())); this
/* 2 */       .ws = new pE0(i, j, bitSet); } public QB(c4 paramc4, ByteBuffer paramByteBuffer) { super(paramc4, paramByteBuffer); } public final void Cx() { A1 a1 = A1.L7; this
/* 3 */       .nc
/* 4 */       .execute(this::Tn); }
/*   */ 
/*   */   
/*   */   public final void Tn() {
/*   */     p50[] arrayOfP50;
/*   */     int i = (arrayOfP50 = km.iE0.Tb0(this.ws)).length;
/*   */     int j = 0;
/*   */     while (true) {
/*   */       Do do_;
/*   */       int m;
/*   */       if (i > 10) {
/*   */         m = 10;
/*   */       } else {
/*   */         m = i;
/*   */       } 
/*   */       this(arrayOfP50, j, m);
/*   */       dr0(do_);
/*   */       j += m;
/*   */       int k;
/*   */       if ((k = i - m) <= 0) {
/*   */         Do do_1;
/*   */         this(null, 0, 0);
/*   */         dr0(this);
/*   */         return;
/*   */       } 
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/QB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */