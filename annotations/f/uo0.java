/* 1 */ package f;public final class uo0 extends Kl0 { public final void sM() { this
/* 2 */       .EL = yM.qx0(this.Ws.get()); if (R00() == 1) { b = 1; } else { b = 0; }  byte b; nH0[] arrayOfNH0; for (this.cC = b, this.wk = new nH0[Gc0()], b = 0; b < (arrayOfNH0 = this.wk).length; ) {
/* 3 */       nH0 nH01; ByteBuffer byteBuffer = this.Ws;
/* 4 */       int i = byteBuffer.getInt(); short s1 = byteBuffer.getShort(), s2 = byteBuffer.getShort(); byteBuffer.get(); byte b1 = byteBuffer.get(), b2 = byteBuffer.get(); yM yM1 = yM.qx0(byteBuffer.get()); this(i, s1, s2, b1, b2, yM1); arrayOfNH0[b] = nH01;
/* 5 */       b++;
/*   */     }  }
/*   */ 
/*   */   
/*   */   public yM EL;
/*   */   public nH0[] wk;
/*   */   public boolean cC;
/*   */   
/*   */   public uo0(c4 paramc4, ByteBuffer paramByteBuffer) {
/*   */     super(paramc4, paramByteBuffer);
/*   */   }
/*   */   
/*   */   public final void Cx() {
/*   */     ro ro;
/*   */     if (this.cC) {
/*   */       zr0 zr0;
/*   */       this(this.wk);
/*   */       ro = r8();
/*   */       this.Fe[this.EL.Xv0] = zr0;
/*   */     } else {
/*   */       nH0[] arrayOfNH0;
/*   */       int i;
/*   */       byte b;
/*   */       for (i = (arrayOfNH0 = ((uo0)super).wk).length, b = 0; b < i; ) {
/*   */         nH0 nH01 = arrayOfNH0[b];
/*   */         r8().gN(((uo0)super).EL).Bd0(nH01);
/*   */         b++;
/*   */       } 
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/uo0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */