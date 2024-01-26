/*  1 */ package f;public final class yI { public Texture AJ; public pe0[][] Z80; public S VC0; public final R30 o3(int paramInt1, int paramInt2) { pe0[] arrayOfPe0 = Dr(paramInt2); this(this.t70.Em0(130), false); fQ fQ; short s; jJ jJ;
/*  2 */     int i = (jJ = new jJ()).su(s = (short)paramInt1), j = 0; byte b = 5; this(); while (true) { int k; if ((k = (int)Math.floor((j * 0.6F))) >= i) { if (paramInt1 == 1) fQ.Com3(arrayOfPe0[0]);  return new R30(0.04F, fQ); }  k = jJ.yA0(k, s); k = ((jJ.UP.Py[paramInt1]).AE0[k]).Ri.BK0; if (arrayOfPe0.length <= k) { System.out.println("error frame_id > size " + k); j += b; continue; }  j += b; fQ.Com3(arrayOfPe0[k]); }  } public S t70; public S gN; public yI(ig paramig1, ig paramig2, ig paramig3) { this.VC0 = paramig1; this.t70 = paramig2; this.gN = paramig3; } static { C00.gd(yI.class); } public final pe0[] Dr(int paramInt) { if (this.AJ == null) { ZH zH; LD lD; byte b1 = 25; Uc uc = Uc.xi0; this(544, 800, uc); this(this.t70.Em0(129), false); int i; for (i = 0; i < 17; )
/*    */       { ek0 ek0; vJ vJ; int j;
/*  4 */         this(this.t70.Em0((j = i * 2) + 131), false);
/*  5 */         this(this.t70.Em0(j + 132)); for (j = 0; j < 17; )
/*  6 */         { int m; ZH zH1 = lD.Tx0(ek0, vJ, j, 32, 32, 0); if (i == 16) { m = 24; } else { m = i; }  int k = j * 32; zH
/*  7 */             .fL(zH1, k, m * 32); zH1.dispose(); j++; }  i++; }  for (byte b3 = 16; b3 <= 23; ) { i = b3 * 4 + 48; byte b5;
/*  8 */         for (iw0 iw02 = iw0.BE0(this.gN.Em0(i)); b5 < 8; ) { ZH zH1; if ((zH1 = iw02.VW(b5)) != null) { int j = b5 * 32, k = b3 * 32; zH.fL(zH1, j, k); if (b5 == 0) for (j = 11; j < 17; ) { ZH zH2; byte b = 0; switch (j) { default: case 16: b = 2;case 15: b = 2;case 14: b = 1;case 13: b = -2;case 12: b = -1; break; }
/*    */                 
/* 10 */                 int m = zH1.Con.ju;
/* 11 */                 int n = zH1.Con.Og0;
/* 12 */                 this(m, n, zH1.TU()); double d1, d2; byte b6; for (d1 = Math.cos(Math.toRadians(-33.0F)), d2 = Math.sin(Math.toRadians(-33.0F)), b6 = 0; b6 < m; ) { for (byte b7 = 0; b7 < n; ) { int i1 = m / 2, i2 = n / 2, i3 = b6 - i1; double d3, d4 = (d3 = i3) * d1; i2 = (int)Math.round(d5 * d1 - d3 * d2) + i2; double d5; if ((i1 = (int)Math.round((d5 = (b7 - i2)) * d2 + d4) + i1) >= 0 && i1 < m && i2 >= 0 && i2 < n)
/* 13 */                     { i1 = zH1.Con.Fl(i1, i2);
/* 14 */                       zH2.Con.YO(b6, b7, i1); }  b7++; }  b6++; }  zH
/* 15 */                   .fL(zH2, j * 32 + b, k); zH2.dispose(); j++; }   zH1.dispose(); }  b5++; }  iw0 iw01; byte b4; for (iw01 = iw0.BE0(this.gN.Em0(i + 1)), b4 = 8; b4 < 11; ) { b5 = 1; if (b4 == 9) b5 = 2;  if (b4 == 10) b5 = 4;  ZH zH1; if ((zH1 = iw01.VW(b5)) != null) { int j = b4 * 32; zH.fL(zH1, j, b3 * 32); zH1.dispose(); }  b4++; }  b3++; }  this
/* 16 */         .AJ = new Texture(zH); this.Z80 = new pe0[b1][]; zH.dispose(); for (byte b2 = 0; b2 < b1; ) { pe0[] arrayOfPe01; for (arrayOfPe01 = new pe0[b1], i = 0; i < 17; ) { pe0 pe01; Texture texture = this.AJ; int j = i * 32, k = b2 * 32; this(texture, j, k, 32, 32); arrayOfPe01[i] = pe01; i++; }  this.Z80[b2] = arrayOfPe01; b2++; }  }  pe0[][] arrayOfPe0; if (paramInt >= (
/* 17 */       arrayOfPe0 = this.Z80).length) paramInt = 3;  if (paramInt < 0) paramInt = 1;  return this[paramInt]; }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/yI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */