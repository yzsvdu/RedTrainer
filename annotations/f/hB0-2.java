/*  1 */ package f;public final class hB0 extends Cy { public BE kw; public final boolean J4() { boolean bool; if (this.l1 != null) { bool = true; } else { bool = false; }  if (bool) return true;
/*    */ 
/*    */     
/*  4 */     return !!km.u4.fF0.y5(this.E10, (short)1360); }
/*  5 */   public hB0(BE paramBE, short paramShort1, byte paramByte, short paramShort2, h30 paramh30) { super(paramBE, paramShort1, paramByte, paramShort2, paramh30); vF vF; this.kw = paramBE; if (this.br0.F70 != 0) { vF = vF.ud0; } else { vF = vF.IQ; }  this.UZ = vF; t8(); } public final void t8() { super.t8(); for (short s = 0; s < this.xk0.X7; ) { lF0 lF0; for (short s1 = 0; s1 < (lF0 = this.xk0).cB0; ) { int i; if (this.hp && (i = lF0.H80[s][s1]) >= 0) { this.UF[s][s1] = this.lG0.gH0(i); this.xk0.H80[s][s1]; }  if ((i = this.xk0.U1[s][s1]) >= 0) { i = (short)i; if (this.Jb0.Fb(i)) i = this.Jb0.Z90(i);  yU yU = (yU)this.kw.Ea0(i); if (this.et0 == 0 && this.ey == 0) { this.et0 = yU.ar0;
/*    */             
/*  7 */             this.ey = yU.Rc0; }  if (this.et0 == yU
/*  8 */             .ar0 && this
/*  9 */             .ey == yU
/* 10 */             .Rc0)
/* 11 */           { short[][][][] arrayOfShort; if ((arrayOfShort = yU.nK).length > this.FD) this.FD = arrayOfShort.length;  } else { throw new RuntimeException("Matrix has mismatching footer sizes"); }  }  s1 = (short)(s1 + 1); }  s = (short)(s + 1); }
/*    */      }
/*    */ 
/*    */   
/*    */   public final boolean zV() {
/*    */     return false;
/*    */   }
/*    */   
/*    */   public final void zf(short paramShort1, short paramShort2) {
/*    */     int i;
/*    */     if ((i = this.xk0.U1[paramShort1][paramShort2]) >= 0) {
/*    */       hH0 hH0;
/*    */       i = (short)i;
/*    */       if (this.Jb0.Fb(i))
/*    */         i = this.Jb0.Z90(i); 
/*    */       yU yU = (yU)this.kw.Ea0(i);
/*    */       lF0 lF0 = this.xk0;
/*    */       this(paramShort1, paramShort2, this, yU, lF0);
/*    */       this.eG[paramShort1][paramShort2] = hH0;
/*    */     } 
/*    */   }
/*    */   
/*    */   public final iy0 GF(int paramInt1, int paramInt2) {
/*    */     return (iy0)super.XJ0(paramInt1, paramInt2);
/*    */   }
/*    */   
/*    */   public final Ws0 XJ0(int paramInt1, int paramInt2) {
/*    */     return super.XJ0(paramInt1, paramInt2);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/hB0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */