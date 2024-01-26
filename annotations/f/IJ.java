/*    */ package f;public final class IJ extends N50 { public final ZH ys0() { byte[] arrayOfByte;
/*  2 */     boolean bool = true; ByteBuffer byteBuffer; int j;
/*  3 */     (byteBuffer = this.Nd0.pr()).position(j = this.Nd0.wJ.nz(uq.l)); if (LF.va0(this.Nd0.pr(), 1) > 0) { arrayOfByte = LF.sf(j, byteBuffer); } else { arrayOfByte.get(arrayOfByte = new byte[128]); }
/*    */ 
/*    */ 
/*    */     
/*  7 */     int i = this.Nd0.wJ.nz(uq.Ks); f1 f1 = aM0.Ij0.Fo0(bool, i, this.Nd0); ZH[] arrayOfZH; byte b1, b2; int k;
/*  8 */     for (arrayOfZH = new ZH[j = arrayOfByte.length / 2 / 1 * 8 / 16 / 1 / 8], b1 = 8, b2 = 32, k = 0; k < j; )
/*  9 */     { byte b; ZH zH; int arrayOfInt[], m; if ((arrayOfInt = this.LPT2).length >= 
/*    */ 
/*    */         
/* 12 */         instanceof.IG(this.lu0) * (m = k + 1))
/*    */       
/* 14 */       { b = arrayOfInt.length / j * k; } else { b = 0; }  Uc uc = Uc.xi0; this(b1, b1, uc); int n, i1, i2, i3; for (arrayOfZH[k] = zH, n = 0, i1 = 0, i3 = i2 = k * b2; i3 < i2 + b2 && i3 < arrayOfByte.length; ) { int i4 = b3 >> 4 & 0xF; byte b3; int i5; if ((i5 = (b3 = arrayOfByte[i3]) & 0xF) > 0) { ZH zH1 = arrayOfZH[k]; int i7 = i5 + b;
/* 15 */           int i6 = this.LPT2[i7];
/* 16 */           zH1.Con
/* 17 */             .YO(n, i1, i6); }  if (i4 > 0)
/* 18 */         { ZH zH1 = arrayOfZH[k]; i5 = n + 1; int i7 = i4 + b;
/* 19 */           int i6 = this.LPT2[i7];
/* 20 */           zH1.Con
/* 21 */             .YO(i5, i1, i6); }  if ((n += 2) % 8 == 
/* 22 */           0) { if (++i1 % 8 == 0) { i1 -= 8; } else { n -= 8; }  if (n == b1) { n = i1 + 8; i1 = 0; n = i1 = n; }  }  i3++; }  k = m; }  arrayOfZH[0]
/* 23 */       .dispose(); return arrayOfZH[1]; }
/*    */ 
/*    */   
/*    */   public IJ(s40 params40) {} }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/IJ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */