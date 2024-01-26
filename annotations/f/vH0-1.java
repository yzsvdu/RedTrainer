/* 1 */ package f;public final class vH0 extends WC { public final void J00(throws paramthrows) { if (this.Kk == null) { aE(paramthrows); this.j8 = true; }  if (this.Kk != null) { if (this.j8) bW(); 
/* 2 */       Sa0 sa0 = this.O;
/* 3 */       int i = RS(), j = e3(), k = qF(), m = Hy(); this.Kk.W8(sa0, i, j, k, m); }  if (this
/* 4 */       .QC0 != null) { this.i3.ov0.getClass(); float f = this.i3.ov0.m20(this.hn0); int i = (int)((this.i3.aB[this.hn0] - f) * (Hy() - 1) / (0.0F - f) + 0.5F);
/* 5 */       Sa0 sa0 = this.O;
/* 6 */       int j = RS(); i = e3() + i; int k = qF(); this.QC0.W8(this, j, i, k, 1); }
/*   */      }
/*   */ 
/*   */   
/*   */   public final int hn0;
/*   */   public ZH ZR;
/*   */   public ByteBuffer PC;
/*   */   public IntBuffer qC;
/*   */   
/*   */   public vH0(int paramInt, LPT6 paramLPT6) {
/*   */     this.hn0 = paramInt;
/*   */     byte b = 0;
/*   */     int i = paramLPT6.GR();
/*   */     while (b < i) {
/*   */       if (b != paramInt)
/*   */         paramLPT6.G1[b].Ac0(this); 
/*   */       b++;
/*   */     } 
/*   */   }
/*   */   
/*   */   public final String TI() {
/*   */     return "colorarea1d";
/*   */   }
/*   */   
/*   */   public final void aE(throws paramthrows) {
/*   */     pE pE = ((tw)paramthrows.IB0).Sn0(1);
/*   */     (this.PC = (this.ZR = pE.fF0.G3.getTextureData().Jw()).tp0()).order(ByteOrder.BIG_ENDIAN);
/*   */     this.qC = this.PC.asIntBuffer();
/*   */   }
/*   */   
/*   */   public final void bW() {
/*   */     float[] arrayOfFloat;
/*   */     IntBuffer intBuffer;
/*   */     GD gD;
/*   */     float f1;
/*   */     float f2;
/*   */     byte b;
/*   */     for (arrayOfFloat = (float[])this.i3.aB.clone(), intBuffer = this.qC, f1 = (gD = this.i3.ov0).m20(this.hn0), f2 = (0.0F - f1) / 63.0F, b = 0; b < 64; ) {
/*   */       arrayOfFloat[this.hn0] = f1;
/*   */       intBuffer.put(b, gD.gl(arrayOfFloat) << 8 | 0xFF);
/*   */       f1 += f2;
/*   */       b++;
/*   */     } 
/*   */     this.Kk.fF0.G3.load(this.Kk.fF0.G3.getTextureData());
/*   */     this.j8 = false;
/*   */   }
/*   */   
/*   */   public final void ED0(throws paramthrows) {
/*   */     this.Kk.fF0.G3.dispose();
/*   */     this.ZR.dispose();
/*   */   }
/*   */   
/*   */   public final void lD0(int paramInt1, int paramInt2) {
/*   */     this.i3.ov0.getClass();
/*   */     float f = this.i3.ov0.m20(this.hn0);
/*   */     int i;
/*   */     f = (0.0F - f) * Math.max(0, Math.min(i = Hy(), paramInt2)) / i + f;
/*   */     this.i3.G1[this.hn0].Ej0(f);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/vH0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */