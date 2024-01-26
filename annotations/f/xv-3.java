/*    */ package f;public final class xv extends la0 { public final void ih0(YN paramYN) {
/*  2 */     float f3 = color.g, f4 = color.b;
/*    */     Color color;
/*  4 */     float f1 = Color.toFloatBits((color = ((JX)this.BM).Bm).r, f3, f4, color.a * paramYN.ln0);
/*  5 */     int i = paramYN.zt0;
/*  6 */     int j = paramYN.mc0;
/*    */     
/*  8 */     float f5, f6 = paramYN.Uz * (f5 = this.Gx);
/*  9 */     f5 = paramYN.gO * f5;
/* 10 */     float f7 = paramYN.Xk() * this.Gx;
/* 11 */     if (paramYN.xU) paramYN.Ey();  float f2; int k; cx0 cx01; int m, n; cx0 cx02; float[] arrayOfFloat;
/* 12 */     for (f2 = -paramYN.Cx0 * this.Gx, j = Math.max(0, (int)((this.K7.dA - f7) / f6)), k = Math.min(i, (int)(((cx01 = this.K7).dA + cx01.af + f6 - f7) / f6)), m = Math.max(0, (int)((this.K7.zA0 - f2) / f5)), n = Math.min(j, (int)(((cx02 = this.K7).zA0 + cx02.sf0 + f5 - f2) / f5)), f2 = n * f5 + f2, f7 = j * f6 + f7, arrayOfFloat = this.OM; n >= m; ) { int i1; float f; for (f = f7, i1 = j; i1 < k; ) { H40 h40; if (i1 < 0 || i1 >= paramYN
/* 13 */           .zt0 || n < 0 || n >= paramYN.mc0) { h40 = null; } else { h40 = paramYN.aT[i1][n]; }  else else; if (h40 != null && (
/* 14 */           else = h40.yH) != null)
/*    */         
/* 16 */         { boolean bool = h40.NI0;
/* 17 */           int i2 = h40.lv;
/* 18 */           float f8 = else.Dh0() * this.Gx + f; float f9, f10 = else.static() * (f9 = this.Gx) + f2; pe0 pe0;
/* 19 */           float f11 = (pe0 = else.LPT8()).H0 * f9 + f8;
/* 20 */           f9 = (else.LPT8()).Vn0 * f9 + f10;
/* 21 */           float f12 = (else.LPT8()).mP;
/* 22 */           float f13 = (else.LPT8()).bh0;
/* 23 */           float f14 = (else.LPT8()).zV;
/* 24 */           float f15 = (else.LPT8()).WT; arrayOfFloat[0] = f8;
/* 25 */           arrayOfFloat[1] = f10; arrayOfFloat[2] = f1; arrayOfFloat[3] = f12; arrayOfFloat[4] = f13; arrayOfFloat[5] = f8; arrayOfFloat[6] = f9; arrayOfFloat[7] = f1; arrayOfFloat[8] = f12; arrayOfFloat[9] = f15; arrayOfFloat[10] = f11; arrayOfFloat[11] = f9; arrayOfFloat[12] = f1; arrayOfFloat[13] = f14; arrayOfFloat[14] = f15; arrayOfFloat[15] = f11; arrayOfFloat[16] = f10; arrayOfFloat[17] = f1; arrayOfFloat[18] = f14; arrayOfFloat[19] = f13; if (h40.dj0) { arrayOfFloat[3] = f14; arrayOfFloat[13] = f12; arrayOfFloat[8] = f14; arrayOfFloat[18] = f12; }  if (bool) { arrayOfFloat[4] = f15; arrayOfFloat[14] = f13; arrayOfFloat[9] = f13; arrayOfFloat[19] = f15; }  if (i2 != 0) if (i2 != 1) { if (i2 != 2) { if (i2 == 3) { float f16 = arrayOfFloat[4]; arrayOfFloat[4] = arrayOfFloat[19]; arrayOfFloat[19] = arrayOfFloat[14]; arrayOfFloat[14] = arrayOfFloat[9]; arrayOfFloat[9] = f16; f16 = arrayOfFloat[3]; arrayOfFloat[3] = arrayOfFloat[18]; arrayOfFloat[18] = arrayOfFloat[13]; arrayOfFloat[13] = arrayOfFloat[8]; arrayOfFloat[8] = f16; }  } else { float f16 = arrayOfFloat[3]; arrayOfFloat[3] = arrayOfFloat[13]; arrayOfFloat[13] = f16; f16 = arrayOfFloat[8]; arrayOfFloat[8] = arrayOfFloat[18]; arrayOfFloat[18] = f16; f16 = arrayOfFloat[4]; arrayOfFloat[4] = arrayOfFloat[14]; arrayOfFloat[14] = f16; f16 = arrayOfFloat[9]; arrayOfFloat[9] = arrayOfFloat[19]; arrayOfFloat[19] = f16; }  } else { float f16 = arrayOfFloat[4]; arrayOfFloat[4] = arrayOfFloat[9]; arrayOfFloat[9] = arrayOfFloat[14]; arrayOfFloat[14] = arrayOfFloat[19]; arrayOfFloat[19] = f16; f16 = arrayOfFloat[3]; arrayOfFloat[3] = arrayOfFloat[8]; arrayOfFloat[8] = arrayOfFloat[13]; arrayOfFloat[13] = arrayOfFloat[18]; arrayOfFloat[18] = f16; }   this.BM
/*    */             
/* 27 */             .xu(pe0.G3, arrayOfFloat, 20); }  f += f6; i1++; }  f2 -= f5; n--; }
/*    */   
/*    */   }
/*    */   
/*    */   public xv(pB0 parampB0) {
/*    */     super(parampB0);
/*    */   }
/*    */   
/*    */   public xv(pB0 parampB0, M30 paramM30) {
/*    */     super(parampB0, paramM30);
/*    */   }
/*    */   
/*    */   public xv(pB0 parampB0, float paramFloat) {
/*    */     super(parampB0, paramFloat);
/*    */   }
/*    */   
/*    */   public xv(pB0 parampB0, float paramFloat, M30 paramM30) {
/*    */     super(parampB0, paramFloat, paramM30);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/xv.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */