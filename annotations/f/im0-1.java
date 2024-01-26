/*  1 */ package f;public final class im0 extends Bw { public final int pe(BufferedInputStream paramBufferedInputStream) { this.lPT3 = 0; this.Ee = 0; this(); Vector vector; this.RZ = vector; this.pj0 = null; if (paramBufferedInputStream != null) { this
/*  2 */         .QF0 = paramBufferedInputStream; String str; int i;
/*  3 */       for (str = "", i = 0; i < 6; )
/*    */       
/*  5 */       { str = B40.df(str).append((char)jy()).toString(); i++; }  if (!str.startsWith("GIF")) { this.lPT3 = 1; } else { this
/*  6 */           .DS = pX(); this.Z4 = pX(); int j; if (((j = jy()) & 0x80) != 0) { i = 1; } else { i = 0; }  this.QJ = i; this.jM = 2 << (j & 0x7); this.xU = jy(); jy(); if (this
/*  7 */           .QJ && !LPT4()) { this.pj0 = arrayOfInt; int[] arrayOfInt; this.X00 = (arrayOfInt = fr(this.jM))[this.xU]; }  }
/*  8 */        if (!LPT4()) { boolean bool; label245: for (bool = false; !bool && 
/*  9 */           !LPT4(); ) { if ((i = jy()) != 33) { Pk0 pk0; if (i != 44) { if (i != 59) { this.lPT3 = 1; continue; }  bool = true; continue; }  this
/* 10 */               .Ea = pX(); this.lPT9 = pX(); this.NI0 = pX(); this.Qw = pX(); if (((i = jy()) & 0x80) != 0) { k = 1; } else { k = 0; }  this.u50 = k; double d = ((i & 0x7) + 1); int j = (int)Math.pow(2.0D, d); if ((i & 0x40) != 0) { k = 1; } else { k = 0; }  this.b = k; if (this.u50) { this.gN = fr(j); } else { this.gN = this.pj0; if (this.xU == this.Ly) this.X00 = 0;  }  j = 0; if (this.vN) { k = this.gN[j = this.Ly]; this.gN[j] = 0; j = k; }  if (this.gN == null) this.lPT3 = 1;  if (LPT4()) continue;  int k = -1;
/* 11 */             int n = this.NI0 * this.Qw; byte[] arrayOfByte; if ((arrayOfByte = this.SY) == null || arrayOfByte.length < n) this.SY = new byte[n];  if (this.er0 == null) this.er0 = new short[4096];  if (this.iu0 == null) this.iu0 = new byte[4096];  if (this.native == null) this.native = new byte[4097];  int i1, i2, i3, i4, i5, i6; for (i1 = jy(), i3 = (i2 = 1 << i1) + 1, i4 = i2 + 2, i5 = (1 << ++i1) - 1, i6 = 0; i6 < i2; ) { this.er0[i6] = 0; this.iu0[i6] = (byte)i6; i6++; }  int i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17; for (i6 = 0, i7 = 0, i12 = i6, i11 = i6, i10 = i6, i9 = i6, i17 = i4, i16 = i5, i8 = i6, i15 = i1, i7 = i6, i14 = k, i13 = i7; i13 < n; ) { int i18; if (i6 == 0) { if (i7 < i15) { if (i9 == 0) { if ((i9 = Ns()) <= 0) break;  i10 = 0; }  i8 += (this.lpT7[i10] & 0xFF) << i7; i7 += 8; i10++; i9--; continue; }  i7 = i8 >> i15; i8 = i7 - i15; if ((i18 = i8 & i16) > i17 || i18 == i3) break;  if (i18 == i2) { i17 = i4; i16 = i5; i8 = i7; i15 = i1; i7 = i8; i14 = k; continue; }  if (i14 == k) { i6++; this.native[i6] = this.iu0[i18]; i11 = i18; i7 = i8 = i7; i14 = i18; continue; }  if (i18 == i17) { i6++; this.native[i6] = (byte)i11; i11 = i14; } else { i11 = i18; }  while (i11 > i2) { i6++; this.native[i6] = this.iu0[i11]; i11 = this.er0[i11]; }  byte[] arrayOfByte1; i11 = (arrayOfByte1 = this.iu0)[i11] & 0xFF; if (i17 >= 4096) break;  i6++; byte b = (byte)i11; this.er0[i17] = (short)i14; arrayOfByte1[i17] = b; if (((i14 = i17 + 1) & i16) == 0 && i14 < 4096) { i15++; i16 += i14; }  i17 = i14; i7 = i8 = i7; } else { i18 = i14; }  i6--; i12++; this.SY[i12] = this.native[i6]; i13++; i14 = i18; }  while (i12 < n) { this.SY[i12] = 0; i12++; }
/* 12 */              do { Ns(); } while (this.a1 > 0 && !LPT4());
/* 13 */             if (LPT4()) continue;  this.Ee = k = this.Ee + 1;
/* 14 */             int[] arrayOfInt = new int[this.DS * this.Z4]; if ((i1 = this.Wo) > 0) { if (i1 == 3) if ((i1 = k - 2) > 0) { byte b; Pk0 pk02; i1--; if (k <= 0) { b = null; }
/* 15 */                   else { int i18 = i1 % b; pk02 = ((oA)this.RZ.elementAt(i18)).sv; }  this
/* 16 */                     .fJ = pk02; } else { this.fJ = null; }   Pk0 pk01; if ((pk01 = this.fJ) != null) { int i18 = 0; i1 = this.DS; i2 = 0; i3 = 0; i4 = this.Z4;
/* 17 */                 for (ByteBuffer byteBuffer = pk01.tp0(); i6 < i3 + i4; ) { for (i8 = i18, i7 = i2; i7 < i2 + i1; )
/* 18 */                   { i8++; arrayOfInt[i8] = (i9 = byteBuffer.getInt((i6 * i1 + i7) * 4)) >> 8 & 0xFFFFFF | i9 << 24 & 0xFF000000; i7++; }  i18 += i1; i6++; }  if (this
/* 19 */                   .Wo == 2) { i18 = 0; if (!this.vN) i18 = this.VQ;  for (i1 = 0; i1 < this.Nn0; ) { for (i3 = (i2 = (this.lpt5 + i1) * this.DS + this.y20) + this.Xi; i2 < i3; ) { arrayOfInt[i2] = i18; i2++; }  i1++; }  }  }  }  for (k = 1, i1 = 8, i2 = 0, i3 = 0; i3 < (i4 = this.Qw); ) { if (this.b) { if (i2 >= i4) if (++k != 2) { if (k != 3) { if (k == 4) { i2 = 1; i1 = 2; }  } else { i2 = 2; i1 = 4; }  } else { i2 = 4; }   i4 = i2 + i1; } else { i4 = i2; i2 = i3; }  if ((i2 += this.lPT9) < this.Z4) { i6 = (i2 = i2 * (i2 = this.DS) + this.Ea) + (i5 = this.NI0); if ((i7 = i2 * (i2 = this.DS) + i2) < i6) i6 = i7;  for (i5 = i3 * i5; i2 < i6; ) { i7 = this.SY[i5++] & 0xFF; if ((i7 = this.gN[i7]) != 0) arrayOfInt[i2] = i7;  i2++; }  }  i3++; i2 = i4; }  int m = this.DS; i1 = this.Z4; this(arrayOfInt, m, i1, Uc.xi0); this.l3 = new Pk0(); this
/* 20 */               .RZ.addElement(new oA(pk0, this.FA0)); if (this.vN) this.gN[this.Ly] = j;  this
/* 21 */               .Wo = this.zB0; this.y20 = this.Ea; this.lpt5 = this.lPT9; this.Xi = this.NI0; this.Nn0 = this.Qw; this.fJ = this.l3; this.VQ = this.X00; this.zB0 = 0; this.vN = false; this.FA0 = 0; continue; }
/* 22 */            if ((i = jy()) != 1) if (i != 249) { if (i != 254 && i == 255) { Ns(); String str1; byte b; for (str1 = "", b = 0; b < 11; )
/*    */                 
/* 24 */                 { str1 = B40.df(str1).append((char)this.lpT7[b]).toString(); b++; }  if (str1.equals("NETSCAPE2.0"))
/* 25 */                   while (true) { Ns(); byte[] arrayOfByte; if ((arrayOfByte = this.lpT7)[0] == 1) { arrayOfByte[1]; arrayOfByte[2]; }  if (this.a1 > 0) { if (LPT4())
/* 26 */                         continue label245;  continue; }  continue label245; }   }  } else { jy(); if ((this.zB0 = ((i = jy()) & 0x1C) >> 2) == 0) this.zB0 = 1;  if ((i & 0x1) != 0) { i = 1; } else { i = 0; }  this.vN = i; this.FA0 = pX() * 10; this.Ly = jy(); jy(); continue; }
/* 27 */               do { Ns(); } while (this.a1 > 0 && !LPT4()); }  if (this
/* 28 */           .Ee < 0) this.lPT3 = 1;  }  } else { this.lPT3 = 2; }  try { paramBufferedInputStream.close(); } catch (Exception exception) {} return this.lPT3; }
/*    */ 
/*    */   
/*    */   public InputStream QF0;
/*    */   public int lPT3;
/*    */   public int DS;
/*    */   public int Z4;
/*    */   public boolean QJ;
/*    */   public int jM;
/*    */   public int[] pj0;
/*    */   public int[] gN;
/*    */   public int xU;
/*    */   public int X00;
/*    */   public int VQ;
/*    */   public boolean u50;
/*    */   public boolean b;
/*    */   public int Ea;
/*    */   public int lPT9;
/*    */   public int NI0;
/*    */   public int Qw;
/*    */   public int y20;
/*    */   public int lpt5;
/*    */   public int Xi;
/*    */   public int Nn0;
/*    */   public Pk0 l3;
/*    */   public Pk0 fJ;
/*    */   public byte[] lpT7 = new byte[256];
/*    */   public int a1 = 0;
/*    */   public int zB0 = 0;
/*    */   public int Wo = 0;
/*    */   public boolean vN = false;
/*    */   public int FA0 = 0;
/*    */   public int Ly;
/*    */   public short[] er0;
/*    */   public byte[] iu0;
/*    */   public byte[] native;
/*    */   public byte[] SY;
/*    */   public Vector RZ;
/*    */   public int Ee;
/*    */   public boolean Uw = false;
/*    */   
/*    */   public final int w30() {
/*    */     return this.Ee;
/*    */   }
/*    */   
/*    */   public final boolean LPT4() {
/*    */     return (this.lPT3 != 0);
/*    */   }
/*    */   
/*    */   public final int jy() {
/*    */     int i = 0;
/*    */     try {
/*    */       i = this.QF0.read();
/*    */     } catch (Exception exception) {
/*    */       this.lPT3 = 1;
/*    */     } 
/*    */     return i;
/*    */   }
/*    */   
/*    */   public final int Ns() {
/*    */     int i = 0;
/*    */     if ((this.a1 = jy()) > 0) {
/*    */       try {
/*    */         int j;
/*    */         while (i < (j = this.a1)) {
/*    */           byte[] arrayOfByte = this.lpT7;
/*    */           int m = j - i;
/*    */           int k;
/*    */           if ((k = this.QF0.read(arrayOfByte, i, m)) == -1)
/*    */             break; 
/*    */           i += k;
/*    */         } 
/*    */       } catch (Exception exception) {
/*    */         null.printStackTrace();
/*    */       } 
/*    */       if (i < this.a1)
/*    */         this.lPT3 = 1; 
/*    */     } 
/*    */     return i;
/*    */   }
/*    */   
/*    */   public final int[] fr(int paramInt) {
/*    */     int[] arrayOfInt = null;
/*    */     int i;
/*    */     byte[] arrayOfByte = new byte[i = paramInt * 3];
/*    */     int j = 0;
/*    */     try {
/*    */       j = this.QF0.read(arrayOfByte);
/*    */     } catch (Exception exception) {
/*    */       null.printStackTrace();
/*    */     } 
/*    */     if (j < i) {
/*    */       this.lPT3 = 1;
/*    */     } else {
/*    */       arrayOfInt = new int[256];
/*    */       byte b = 0;
/*    */       i = 0;
/*    */       while (b < paramInt) {
/*    */         j = arrayOfByte[i++] & 0xFF;
/*    */         int k = arrayOfByte[i++] & 0xFF;
/*    */         b++;
/*    */         arrayOfInt[b] = (arrayOfByte[i++] & 0xFF) << 16 | 0xFF000000 | j << 8 | k;
/*    */       } 
/*    */     } 
/*    */     return arrayOfInt;
/*    */   }
/*    */   
/*    */   public final int pX() {
/*    */     return jy() | jy() << 8;
/*    */   }
/*    */   
/*    */   public final void yM() {
/*    */     if (this.Uw)
/*    */       return; 
/*    */     this.Uw = true;
/*    */     try {
/*    */       Pk0 pk0;
/*    */       if ((pk0 = this.l3) != null) {
/*    */         pk0.dispose();
/*    */         this.l3 = null;
/*    */       } 
/*    */     } catch (Exception exception) {}
/*    */     try {
/*    */       Pk0 pk0;
/*    */       if ((pk0 = this.fJ) != null) {
/*    */         pk0.dispose();
/*    */         this.fJ = null;
/*    */       } 
/*    */     } catch (Exception exception) {}
/*    */     try {
/*    */       Iterator iterator = this.RZ.iterator();
/*    */       while (iterator.hasNext())
/*    */         ((oA)iterator.next()).sv.dispose(); 
/*    */     } catch (Exception exception) {}
/*    */     this.RZ.clear();
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/im0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */