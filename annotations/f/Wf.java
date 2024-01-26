/*  1 */ package f;public final class Wf { public byte[] Y4; public final int Qt; public int UR; public Wf(int paramInt1, int paramInt2, int paramInt3, int paramInt4, ByteBuffer paramByteBuffer) { byte[] arrayOfByte; this.UR = paramInt2; if (paramInt4 == 1) { paramByteBuffer.position(paramInt1); if (LF.va0(paramByteBuffer, 1) > 0) { this.Y4 = LF.sf(paramInt1, paramByteBuffer); } else { this.Y4 = arrayOfByte = new byte[paramInt2 * paramInt3 * 32]; paramByteBuffer.get(arrayOfByte); }  } else if (paramInt4 == 2) { paramByteBuffer.position(arrayOfByte); if (LF.va0(paramByteBuffer, 1) > 0) { this.Y4 = LF.sf(arrayOfByte, paramByteBuffer); } else { this.Y4 = arrayOfByte = new byte[paramInt2 * paramInt3 * 64]; paramByteBuffer.get(arrayOfByte); }  } else { throw new RuntimeException("uhhh"); }  this.Qt = paramInt4; } public final ZH wQ(f1 paramf1) { ZH zH; if (this.Qt == 1) { int i; this((i = this.UR) * 8, this.Y4.length / 2 / i * 8 / 16, Uc.xi0); int j; byte b; byte[] arrayOfByte; for (i = 0, j = 0, b = 0; b < (arrayOfByte = this.Y4).length; ) { int k = b1 >> 4 & 0xF; byte b1; int m; if ((m = (b1 = arrayOfByte[b]) & 0xF) > 0)
/*    */         
/*  3 */         { m = paramf1.LPT2[m];
/*  4 */           zH.Con.YO(i, j, m); }  if (k > 0) { m = i + 1;
/*    */           
/*  6 */           k = paramf1.LPT2[k];
/*  7 */           zH.Con.YO(m, j, k); }  if ((i += 2) % 8 == 
/*  8 */           0) { if (++j % 8 == 0) { j -= 8; } else { i -= 8; }  if (i == this.UR * 8) { i = j + 8; j = 0; i = j = i; }  }  b++; }  }
/*  9 */     else { int i; this((i = this.UR) * 8, this.Y4.length / 4 / i * 8 / 16, Uc.xi0); int j; byte b; byte[] arrayOfByte; for (i = 0, j = 0, b = 0; b < (arrayOfByte = this.Y4).length; ) { int k = arrayOfByte[b] & 0xFF;
/*    */         
/* 11 */         k = paramf1.LPT2[k];
/* 12 */         zH.Con.YO(i, j, k); if (++i % 8 == 
/* 13 */           0) { if (++j % 8 == 0) { j -= 8; } else { i -= 8; }  if (i == this.UR * 8) { i = j + 8; j = 0; i = j = i; }  }  b++; }  }  return zH; } public final void COm5(ZH paramZH, int paramInt1, int paramInt2, int paramInt3, f1 paramf1, int paramInt4, boolean paramBoolean1, boolean paramBoolean2) { int i = 64; if (this.Qt == 1) { j = 2; } else { j = 1; }  int j, k, m; byte[] arrayOfByte; for (paramInt3 = i / j, i = 0, j = 0, m = k = paramInt3 * paramInt3; m < k + paramInt3 && m < (arrayOfByte = this.Y4).length; ) { int n; if (this.Qt == 1) { n = b >> 4 & 0xF; byte b; int i1; if ((i1 = (b = arrayOfByte[m]) & 0xF) > 0) { if (paramBoolean1) { i2 = 8 - i - 1; } else { i2 = i; }  int i2 = paramInt1 + i2; if (paramBoolean2) { i3 = 8 - j - 1; } else { i3 = j; }  i1 = paramInt2 + i3; int i3 = i1 + paramInt4; i3 = paramf1.LPT2[i3]; paramZH.Con.YO(i2, i1, i3); }  if (n > 0) { if (paramBoolean1) { i1 = 8 - i + 1 - 1; } else { i1 = i + 1; }  i1 = paramInt1 + i1; if (paramBoolean2) { i2 = 8 - j - 1; } else { i2 = j; }  n = paramInt2 + i2; int i2 = n + paramInt4; i2 = paramf1.LPT2[i2]; paramZH.Con.YO(i1, n, i2); }  i += 2; } else { if (paramBoolean1) { i1 = 8 - i - 1; } else { i1 = i; }  int i1 = paramInt1 + i1; if (paramBoolean2) { i2 = 8 - j - 1; } else { i2 = j; }  n = paramInt2 + i2; int i2 = (n[m] & 0xFF) + paramInt4; i2 = paramf1.LPT2[i2]; paramZH.Con.YO(i1, n, i2); i++; }  if (i == 8) { i = j + 1; j = 0; i = j = i; }  m++; }
/*    */      }
/*    */ 
/*    */   
/*    */   public final ZH kl0(int paramInt, f1 paramf1) {
/*    */     if (this.Qt == 1) {
/*    */       ZH zH1;
/*    */       boolean bool = false;
/*    */       Uc uc1 = Uc.xi0;
/*    */       this(8, 8, uc1);
/*    */       for (byte b1 = 0; b1 < 8; ) {
/*    */         for (byte b2 = 0; b2 < 4; ) {
/*    */           int i = paramInt * 32;
/*    */           byte[] arrayOfByte;
/*    */           if ((i = b1 * 4 + i + b2) >= (arrayOfByte = this.Y4).length) {
/*    */             i = 0;
/*    */           } else {
/*    */             i = arrayOfByte[i];
/*    */           } 
/*    */           i = i >> 4 & 0xF;
/*    */           int j;
/*    */           if ((j = i & 0xF) > 0) {
/*    */             bool = true;
/*    */             int k = b2 * 2;
/*    */             j = paramf1.LPT2[j];
/*    */             zH1.Con.YO(k, b1, j);
/*    */           } 
/*    */           if (i > 0) {
/*    */             bool = true;
/*    */             j = b2 * 2 + 1;
/*    */             i = paramf1.LPT2[i];
/*    */             zH1.Con.YO(j, b1, i);
/*    */           } 
/*    */           b2++;
/*    */         } 
/*    */         b1++;
/*    */       } 
/*    */       if (!bool) {
/*    */         zH1.dispose();
/*    */         zH1 = null;
/*    */       } 
/*    */       return zH1;
/*    */     } 
/*    */     Uc uc = Uc.xi0;
/*    */     this(8, 8, uc);
/*    */     ZH zH;
/*    */     for (byte b = 0; b < 8; ) {
/*    */       for (byte b1 = 0; b1 < 8; ) {
/*    */         int i = paramInt * 64;
/*    */         byte[] arrayOfByte;
/*    */         i = (((i = b * 8 + i + b1) >= (arrayOfByte = this.Y4).length) ? 0 : arrayOfByte[i]) & 0xFF;
/*    */         i = paramf1.LPT2[i];
/*    */         zH.Con.YO(b1, b, i);
/*    */         b1++;
/*    */       } 
/*    */       b++;
/*    */     } 
/*    */     return zH;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Wf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */