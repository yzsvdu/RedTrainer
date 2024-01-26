/* 1 */ package f;public final class wy0 extends WC { public final void J00(throws paramthrows) { if (this.Kk == null) { Zw(paramthrows); this.j8 = true; }  if (this.Kk != null) { if (this.j8) xk(); 
/* 2 */       Sa0 sa0 = this.O;
/* 3 */       int i = RS(), j = e3(), k = qF(), m = Hy(); this.Kk.W8(sa0, i, j, k, m); }  if (this
/* 4 */       .QC0 != null) { this.o70.ov0.getClass(); float f1 = this.o70.ov0.m20(this.Nu); this.o70.ov0.getClass(); float f2 = this.o70.ov0.m20(this.uh0); int j = (int)((this.o70.aB[this.Nu] - f1) * (qF() - 1) / (0.0F - f1) + 0.5F), k = (int)((this.o70.aB[this.uh0] - f2) * (Hy() - 1) / (0.0F - f2) + 0.5F);
/*   */       
/* 6 */       int i = RS() + j; this.QC0.W8(this.O, i, e3() + k, 1, 1); }
/*   */      }
/*   */ 
/*   */   
/*   */   public final int Nu;
/*   */   public final int uh0;
/*   */   public ZH yE0;
/*   */   public ByteBuffer gs;
/*   */   public IntBuffer hH;
/*   */   
/*   */   public wy0(LPT6 paramLPT6, int paramInt1, int paramInt2) {
/*   */     this.Nu = paramInt1;
/*   */     this.uh0 = paramInt2;
/*   */     byte b = 0;
/*   */     int i = paramLPT6.GR();
/*   */     while (b < i) {
/*   */       if (b != paramInt1 && b != paramInt2)
/*   */         paramLPT6.G1[b].Ac0(this); 
/*   */       b++;
/*   */     } 
/*   */   }
/*   */   
/*   */   public final String TI() {
/*   */     return "colorarea2d";
/*   */   }
/*   */   
/*   */   public final void Zw(throws paramthrows) {
/*   */     pE pE = ((tw)paramthrows.IB0).Sn0(64);
/*   */     (this.gs = (this.yE0 = pE.fF0.G3.getTextureData().Jw()).tp0()).order(ByteOrder.BIG_ENDIAN);
/*   */     this.hH = this.gs.asIntBuffer();
/*   */   }
/*   */   
/*   */   public final void xk() {
/*   */     float[] arrayOfFloat;
/*   */     IntBuffer intBuffer;
/*   */     GD gD;
/*   */     float f1;
/*   */     float f2;
/*   */     float f3;
/*   */     float f4;
/*   */     byte b1;
/*   */     byte b2;
/*   */     for (arrayOfFloat = (float[])this.o70.aB.clone(), intBuffer = this.hH, f1 = gD.m20(this.Nu), f2 = (0.0F - f1) / 63.0F, f3 = (gD = this.o70.ov0).m20(this.uh0), f4 = (0.0F - f3) / 63.0F, b1 = 0, b2 = 0; b1 < 64; ) {
/*   */       byte b;
/*   */       float f;
/*   */       for (arrayOfFloat[this.uh0] = f3, b = 0, f = f1; b < 64; ) {
/*   */         arrayOfFloat[this.Nu] = f;
/*   */         b2++;
/*   */         intBuffer.put(b2, gD.gl(arrayOfFloat) << 8 | 0xFF);
/*   */         f += f2;
/*   */         b++;
/*   */       } 
/*   */       f3 += f4;
/*   */       b1++;
/*   */     } 
/*   */     this.Kk.fF0.G3.load(this.Kk.fF0.G3.getTextureData());
/*   */     this.j8 = false;
/*   */   }
/*   */   
/*   */   public final void ED0(throws paramthrows) {
/*   */     this.Kk.fF0.G3.dispose();
/*   */     this.yE0.dispose();
/*   */   }
/*   */   
/*   */   public final void lD0(int paramInt1, int paramInt2) {
/*   */     this.o70.ov0.getClass();
/*   */     float f3 = this.o70.ov0.m20(this.Nu);
/*   */     this.o70.ov0.getClass();
/*   */     float f4 = this.o70.ov0.m20(this.uh0);
/*   */     int i = qF();
/*   */     paramInt1 = Math.max(0, Math.min(i, paramInt1));
/*   */     float f1 = (0.0F - f3) * paramInt1 / i + f3;
/*   */     int j;
/*   */     float f2 = (0.0F - f4) * Math.max(0, Math.min(j = Hy(), paramInt2)) / j + f4;
/*   */     this.o70.G1[this.Nu].Ej0(f1);
/*   */     this.o70.G1[this.uh0].Ej0(f2);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/wy0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */