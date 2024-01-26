/*  1 */ package f;public final class r80 extends uB implements Nv0 { public Cz0 Fi; public r80() {} public final void JD(JX paramJX, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) { this.Fi.kE0(paramJX, paramFloat1, paramFloat2, paramFloat3, paramFloat4);
/*  2 */     Texture texture = this.Fi.DK0; float[] arrayOfFloat = this.Fi.Lc0; int i = this.Fi.Z80; paramJX.xu(this, arrayOfFloat, i); } public r80(Cz0 paramCz0) { Ec0(paramCz0); } public r80(r80 paramr80) { super(paramr80); this.Fi = paramr80.Fi; } public final void MF(JX paramJX, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8, float paramFloat9) { kE0(paramJX, paramFloat1, paramFloat2, paramFloat5, paramFloat6); paramFloat1 += paramFloat3; paramFloat2 += paramFloat4; Cz0 cz0; int i = (cz0 = this.Fi).Z80; float[] arrayOfFloat = this.Fi.Lc0; if (paramFloat9 != 0.0F) { for (byte b = 0; b < i; ) { paramFloat6 = (arrayOfFloat[b] - paramFloat1) * paramFloat7; int j; float f2 = (arrayOfFloat[j = b + 1] - paramFloat2) * paramFloat8, f3 = nx0.Tu0(paramFloat9); arrayOfFloat[b] = f3 * paramFloat6 - f1 * f2 + paramFloat1; float f1; paramFloat6 = (f1 = nx0.nH(paramFloat9)) * paramFloat6; arrayOfFloat[j] = f3 * f2 + paramFloat6 + paramFloat2; b += 5; }  } else if (paramFloat7 != 1.0F || paramFloat8 != 1.0F) { for (byte b = 0; b < i; ) { arrayOfFloat[b] = NUL.df(arrayOfFloat[b], paramFloat1, paramFloat7, paramFloat1); int j; arrayOfFloat[j] = NUL.df(arrayOfFloat[j = b + 1], paramFloat2, paramFloat8, paramFloat2); b += 5; }  }  paramJX.xu(this.DK0, arrayOfFloat, i); } public final void Ec0(Cz0 paramCz0) { this.Fi = paramCz0; if (paramCz0 != null) { float f2, f3; this.uz = (f2 = paramCz0.pG0) + paramCz0.xe0 + (f3 = paramCz0.fv0);
/*    */       float f4, f5;
/*  4 */       this.B90 = (f4 = paramCz0.Oy) + paramCz0.LZ + (f5 = paramCz0.G9); float f6;
/*  5 */       if ((f6 = paramCz0.uR) != -1.0F) f4 = f6;  this
/*  6 */         .Ji = f4;
/*  7 */       if ((f4 = paramCz0.nu0) != -1.0F) f3 = f4;  this
/*  8 */         .jM = f3;
/*  9 */       if ((f3 = paramCz0.iF0) != -1.0F) f5 = f3;  this
/* 10 */         .Xm0 = f5; float f1;
/* 11 */       if ((f1 = paramCz0.cOm2) != -1.0F) f2 = f1;  this
/* 12 */         .e = f2; }
/*    */      }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/r80.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */