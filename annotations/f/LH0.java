/* 1 */ package f;public final class LH0 extends Kl0 { public final void sM() { this
/* 2 */       .vW = yM.qx0(this.Ws.get());
/* 3 */     ByteBuffer byteBuffer = this.Ws;
/* 4 */     int i = getInt(); short s1 = getShort(), s2 = getShort(); get(); byte b1 = get(), b2 = get(); yM yM1 = yM.qx0(get());
/* 5 */     this.Ug = new nH0(i, s1, s2, b1, b2, this); }
/*   */ 
/*   */   
/*   */   public yM vW;
/*   */   public nH0 Ug;
/*   */   
/*   */   public LH0(c4 paramc4, ByteBuffer paramByteBuffer) {
/*   */     super(paramc4, paramByteBuffer);
/*   */   }
/*   */   
/*   */   public final void Cx() {
/*   */     zr0 zr0;
/*   */     if ((zr0 = r8().gN(this.vW)) == null)
/*   */       return; 
/*   */     zr0.Bd0(this.Ug);
/*   */     nH0 nH01 = this.Ug;
/*   */     ro ro;
/*   */     (ro = r8()).getClass();
/*   */     short[][][] arrayOfShort;
/*   */     int i;
/*   */     byte b;
/*   */     label24: for (i = (arrayOfShort = ro.H70).length, b = 0; b < i; ) {
/*   */       short[][] arrayOfShort1;
/*   */       int j;
/*   */       byte b1;
/*   */       for (j = (arrayOfShort1 = arrayOfShort[b]).length, b1 = 0; b1 < j; ) {
/*   */         short[] arrayOfShort2;
/*   */         int k;
/*   */         byte b2;
/*   */         for (k = (arrayOfShort2 = arrayOfShort1[b1]).length, b2 = 0; b2 < k; ) {
/*   */           if (arrayOfShort2[b2] == nH01.p1) {
/*   */             ro.Wp();
/*   */             break label24;
/*   */           } 
/*   */           b2++;
/*   */         } 
/*   */         b1++;
/*   */       } 
/*   */       b++;
/*   */     } 
/*   */     r8().ow();
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/LH0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */