/*  1 */ package f;public final class uC0 extends yp0 { public final void wL() { kf kf1; if (!(kf1 = this.Sl instanceof qq0)) return;  qq0 qq0 = (qq0)kf1; getClass(); short[][] arrayOfShort; int j; hG[] arrayOfHG; byte b1; for (arrayOfHG = new hG[j = (arrayOfShort = this.yk0.jP).length], b1 = 0; b1 < arrayOfShort.length && b1 < this.S3.length; ) { hG hG; int k; short s1; byte b2; for (k = 0, s1 = arrayOfShort[b1][0], b2 = 1; b2 < 6; ) { k += arrayOfShort[b1][b2]; b2++; }  k = (int)Math.ceil((s1 / 51.0F)); int m = (int)Math.ceil((k / 80.0F)); short s2 = arrayOfShort[b1][6]; this(b1, s2, k + m); arrayOfHG[b1] = hG; (this.S3[b1])
/*  2 */         .He = m;
/*  3 */       (this.S3[b1]).wa0 = k; b1 = (byte)(b1 + 1); }
/*  4 */      Collections.sort(Arrays.asList((Comparable[])arrayOfHG)); int i; for (i = 0, b1 = 0; b1 < j; ) { hG hG = arrayOfHG[b1]; (this.S3[hG.Os])
/*  5 */         .Dv
/*    */ 
/*    */         
/*  8 */         .qt(new U70[] { a80.Oz0.Ah[b1] }); if (b1 == 0)
/*  9 */       { i = hG.yh; this.synchronized = hG.Os; }  b1 = (byte)(b1 + 1); }  float f = 1.0F / i; this.ln.wI0(false); this.hV.wI0(false); this.d.wI0(false); this.M80.wI0(false); PK0(); this.Jj = true; this.tR.wI0(true); byte b; dQ dQ; for ((dQ = this.tR)
/* 10 */       .db0 = new I(dQ, pRn.TRANSPARENT), b = 0; b < 4; ) { this
/* 11 */         .rM[b].Se(false); this.S3[b].wI0(true); (this.S3[b])
/* 12 */         .XB0 = f;
/* 13 */       (this.S3[b]).gL = 0;
/* 14 */       (this.S3[b]).wu = 0; (this.S3[b]).wz.Nu(0.0F);
/*    */       
/* 16 */       (this.S3[b]).oD0 = zm0.u20; b++; }  this
/* 17 */       .b7 = 0;
/*    */     
/* 19 */     this.Pd0 = zm0.u20; km.pm0.Wk0((byte)1, (short)446); }
/*    */ 
/*    */   
/*    */   public kf Sl;
/*    */   
/*    */   public uC0(Dw0 paramDw0, kf paramkf) {
/*    */     this.Sl = paramkf;
/*    */   }
/*    */   
/*    */   public final boolean Ie() {
/*    */     boolean bool;
/*    */     kf kf1;
/*    */     if (!(kf1 = this.Sl instanceof qq0))
/*    */       return true; 
/*    */     if (((qq0)(kf1 = this)).b7 == 3 && zm0.u20 - ((qq0)this).Pd0 > 10000L) {
/*    */       bool = true;
/*    */     } else {
/*    */       bool = false;
/*    */     } 
/*    */     return bool;
/*    */   }
/*    */   
/*    */   public final int zE() {
/*    */     return 7;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/uC0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */