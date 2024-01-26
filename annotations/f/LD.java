/*  1 */ package f;public final class LD { public FA0 Ku; public Ie ql; public T7 zu0; public boolean V40; public ZH[] MJ; public LD(T7 paramT7) { this(paramT7, false); } public LD(T7 paramT7, boolean paramBoolean) { this.zu0 = paramT7; this.V40 = paramBoolean; tA(); } public static boolean Pr0(int paramInt1, int paramInt2) { return (paramInt1 >= 0 && paramInt1 < paramInt2); } public final ZH Ld0(ek0 paramek0, vJ paramvJ, int paramInt) { return Tx0(paramek0, paramvJ, paramInt, 32, 32, 0); } public final ZH Tx0(ek0 paramek0, dk paramdk, int paramInt1, int paramInt2, int paramInt3, int paramInt4) { int i = this.cm & 0x3;
/*  2 */     this(paramInt2, paramInt3, Uc.xi0); ZH zH; Ie ie; OG0[] arrayOfOG0; if ((arrayOfOG0 = ((ie = this.ql).ap0[paramInt1]).oD0).length == 0) { System.out.println("No OAM"); } else { int j; byte b; for (j = arrayOfOG0.length, b = 0; b < j; ) { OG0 oG0; short s1; short s2; if ((s1 = (oG0 = arrayOfOG0[b]).Qy) != 0 && (s2 = oG0.ip0) != 0) { Tw tw; int i3 = oG0.li0 << i; this();
/*  3 */           byte[] arrayOfByte2 = paramek0.v3;
/*  4 */           I30 i30 = paramek0.WF0;
/*  5 */           tw
/*  6 */             .v3 = arrayOfByte2; tw.WF0 = i30; tw.jA = i4;
/*  7 */           tw.Sw0 = s1; int m, i4; if (((i4 = paramek0.jA) == 2 || i4 == 3) && s1 < (m = tw.Gw)) tw.Sw0 = m;  tw
/*  8 */             .ve0 = s2; if ((i4 == 2 || i4 == 3) && s2 < (m = tw.Gw)) tw.ve0 = m;  tw
/*  9 */             .Gw = m = 8; if (i4 == 2 || i4 == 3) { if (tw.Sw0 < m) tw.Sw0 = m;  if (tw.ve0 < m) tw.ve0 = m;  }  tw
/*    */             
/* 11 */             .m80 = m = i30.mX; int i1 = arrayOfByte2.length; tw.yn0 = new byte[m / m * i1]; if ((m = i3 * 32) >= 0 && m < arrayOfByte2.length) {
/* 12 */             byte[] arrayOfByte = new byte[m = arrayOfByte2.length - m]; System.arraycopy(arrayOfByte2, m, arrayOfByte, 0, m); m = tw.v3.length; tw.yn0 = new byte[tw.Gw / tw.m80 * m];
/* 13 */           }  if ((m = oG0.GM) >= paramdk
/* 14 */             .f0.length)
/* 15 */             m = 0;  i1 = 0; byte[] arrayOfByte1; while (i1 < (
/* 16 */             arrayOfByte1 = tw.yn0).length)
/* 17 */           { arrayOfByte1[i1] = m; i1++; }  ZH zH1 = tw.H4(paramdk); boolean bool; if ((bool = oG0.o30) || oG0.o6) { zH1 = FX.tK0(zH1, bool, oG0.o6); zH1.dispose(); }  int n = paramInt2 / 2 + oG0.eH, i2 = paramInt3 / 2; if (paramInt4 == 0) { k = oG0.oR; } else { k = paramInt4; }  int k = i2 + k; zH.fL(zH1, n, k); zH1.dispose(); }  b++; }  }  return zH; } public final void D20(int paramInt, ek0 paramek0, vJ paramvJ, ZH paramZH, NC0 paramNC0) { for (OG0[] arrayOfOG0 = (this.ql.ap0[paramInt]).oD0; paramInt < this.length; ) { byte[] arrayOfByte1; ZH zH; OG0 oG0; short s1 = (short)(oG0 = this[this.length - paramInt - 1]).li0; int i = (this[this.length - paramInt - 1]).n10; short s3 = oG0.ip0; paramek0.getClass(); short s2; int j; byte[] arrayOfByte2 = new byte[j = (s2 = (this[this.length - paramInt - 1]).Qy) * s3]; pJ0 pJ0; if (((pJ0 = paramek0.D30).Vl0 & 0xFF) == 0) { int m; if (((m = pJ0.qu) & 0x10) == 0) { m = 5; } else { m = (m >> 20 & 0x3) + 5; }  int k = (s1 << m) * 2; if (!paramek0.Pm0(arrayOfByte2, i * 2 + k, j, 0)) continue;  for (arrayOfByte1 = new byte[j], i = 0, j = 0; j < s3 / 8; ) { for (m = 0; m < s2 / 8; ) { for (byte b = 0; b < 8; ) { for (byte b1 = 0; b1 < 8; ) { int n = m * 8 + b1; n = (j * 8 + b) * s2 + n; arrayOfByte1[n] = arrayOfByte2[i]; i++; b1++; }  b++; }  m++; }  j++; }  arrayOfByte2 = arrayOfByte1; } else { short s; byte b; int k; for (i = arrayOfByte1 / (s = (short)(paramek0.Sw0 / 8)) * 8, j = arrayOfByte1 % s * 8, b = 0; b < s3 && (k = i + b) / 8 < paramek0.ve0; ) { k = k * s * 8 + j; int m = b * s2; if (!paramek0.Pm0(arrayOfByte2, k, s2, m)) { arrayOfByte2 = null; break; }  b++; }  }  i = oG0.Qy; s2 = oG0.ip0; Uc uc = Uc.xi0; this(i, s2, uc); ao[][] arrayOfAo1; if ((s2 = oG0.GM) >= (arrayOfAo1 = paramvJ.f0).length) s2 = 0;  ao[] arrayOfAo = arrayOfAo1[s2]; if (zH.TU() == uc) { ByteBuffer byteBuffer; (byteBuffer = zH.tp0()).position(0); Gdx2DPixmap gdx2DPixmap; for (int n = Math.min((gdx2DPixmap = zH.Con).Og0 * gdx2DPixmap.ju, zH.tp0().remaining() / 4); j < n; ) { int i1; byteBuffer.putInt((i1 = (arrayOfAo[arrayOfByte2[j] & 0xFF]).O6) << 8 | i1 >>> 24); j++; }  byteBuffer.position(0); boolean bool;
/* 18 */         if ((bool = oG0.o30) || oG0.o6) { zH = FX.tK0(zH, bool, oG0.o6); zH.dispose(); }  int k = (int)paramNC0.x + oG0.eH, m = (int)paramNC0.y + oG0.oR; if (oG0.wA) { k = oG0.Qy / 2 + k; m = oG0.ip0 / 2 + m; }  paramZH.fL(zH, k, m); zH.dispose(); paramInt++; continue; }
/* 19 */        throw new RuntimeException("Invalid format"); }
/*    */      }
/*    */ 
/*    */   
/*    */   public final void rb0(int paramInt, NC0 paramNC01, NC0 paramNC02) {
/*    */     OF0 oF0;
/*    */     paramNC01.ON((oF0 = this.ql.ap0[paramInt]).XP);
/*    */     paramNC02.ON(this.IC0);
/*    */   }
/*    */   
/*    */   public final void Ll(int paramInt, ek0 paramek0, vJ paramvJ, ZH paramZH, NC0 paramNC0, short[] paramArrayOfshort) {
/*    */     this();
/*    */     NC0 nC01, nC02;
/*    */     this();
/*    */     rb0(paramInt, nC01, nC02);
/*    */     ZH zH;
/*    */     if ((zH = this.MJ[paramInt]) == null) {
/*    */       this((int)nC01.x, (int)nC01.y, Uc.xi0);
/*    */       D20(paramInt, paramek0, paramvJ, zH, nC02);
/*    */       this.MJ[paramInt] = zH;
/*    */     } 
/*    */     if (paramArrayOfshort == null) {
/*    */       int i = (int)(paramNC0.x - nC02.x);
/*    */       paramZH.fL(zH, i, (int)(paramNC0.y - nC02.y));
/*    */     } else {
/*    */       IntBuffer intBuffer1 = paramZH.tp0().asIntBuffer(), intBuffer2 = zH.tp0().asIntBuffer();
/*    */       int i = paramZH.Con.ju;
/*    */       int j = paramZH.Con.Og0;
/*    */       int k = zH.Con.ju;
/*    */       int m = zH.Con.Og0;
/*    */       byte b1 = 0, b2 = 0;
/*    */       paramZH.r1(y1.Zj);
/*    */       while (b1 < m) {
/*    */         for (byte b = b2; b < k; ) {
/*    */           float f1 = (paramNC0.y + b1 - nC02.y) * i;
/*    */           float f2;
/*    */           int n = (int)(paramNC0.x + (f2 = b) - nC02.x + f1);
/*    */           int i1, i2, i3 = (i2 = b - (i1 = (int)nC02.x)) * paramArrayOfshort[0];
/*    */           i2 *= paramArrayOfshort[2];
/*    */           i3 = (i2 = (i5 * paramArrayOfshort[3] + i2 >> 8) + i4) * k + i1;
/*    */           int i4, i5;
/*    */           if (Pr0((int)(paramNC0.y + b1 - nC02.y), j) && Pr0((int)(paramNC0.x + f2 - nC02.x), i) && Pr0(n, capacity()) && Pr0(i1 = ((i5 = b1 - (i4 = (int)nC02.y)) * paramArrayOfshort[1] + i3 >> 8) + i1, k) && Pr0(i2, m) && Pr0(i3, intBuffer2.capacity()) && zH.Con.Fl(i1, i2) != 0)
/*    */             put(n, intBuffer2.get(i3)); 
/*    */           b++;
/*    */         } 
/*    */         b1++;
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void VE0() {
/*    */     ZH[] arrayOfZH;
/*    */     for (byte b = 0; b < (arrayOfZH = this.MJ).length; b++) {
/*    */       ZH zH;
/*    */       if ((zH = arrayOfZH[b]) != null) {
/*    */         zH.dispose();
/*    */         this.MJ[b] = null;
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void tA() {
/*    */     (this.Ku = new FA0(byteBuffer)).sV(1313031506);
/*    */     this(byteBuffer);
/*    */     Ie ie1;
/*    */     this.ql = new Ie();
/*    */     ByteBuffer byteBuffer;
/*    */     (byteBuffer = this.zu0.rb(this.V40)).position(this.Ku.gc0 + ie1.o40 + 8);
/*    */     int i;
/*    */     Ie ie2;
/*    */     for (i = 0; i < (ie2 = this.ql).RM; ) {
/*    */       OF0 oF0;
/*    */       this(ie2, byteBuffer);
/*    */       ie2.ap0[i] = oF0;
/*    */       i++;
/*    */     } 
/*    */     if (ie2.eQ != 0) {
/*    */       i = byteBuffer.position();
/*    */       byteBuffer.position(this.Ku.gc0 + this.ql.eQ + 8);
/*    */       byteBuffer.getInt();
/*    */       this.ql.getClass();
/*    */       this.ql.import = byteBuffer.getInt();
/*    */       byteBuffer.position(this.Ku.gc0 + (ie2 = this.ql).eQ + ie2.import + 8);
/*    */       Ie ie;
/*    */       for (byte b1 = 0; b1 < (ie = this.ql).RM; ) {
/*    */         (ie.ap0[b1]).fr0 = byteBuffer.getInt();
/*    */         byteBuffer.getInt();
/*    */         this.ql.ap0[b1].getClass();
/*    */         b1++;
/*    */       } 
/*    */       byteBuffer.position(i);
/*    */     } 
/*    */     byte b;
/*    */     Ie ie3;
/*    */     int j;
/*    */     for (i = byteBuffer.position(), b = 0; b < (j = (ie3 = this.ql).RM); ) {
/*    */       byteBuffer.position(i + oF0.cY);
/*    */       OF0 oF0;
/*    */       for ((ie3.ap0[b]).x = new OG0[(oF0 = ie3.ap0[b]).An0], j = 0; j < oF0.An0; ) {
/*    */         OG0 oG0;
/*    */         this(byteBuffer);
/*    */         oF0.x[j] = oG0;
/*    */         if (this.ql.eQ != 0)
/*    */           (oF0.x[j]).n10 = oF0.fr0; 
/*    */         j = (short)(j + 1);
/*    */       } 
/*    */       Collections.sort(new ArrayList<>(Arrays.asList((Comparable[])oF0.x)));
/*    */       oF0.oD0 = (new ArrayList<>(Arrays.asList((Comparable[])oF0.x))).<OG0>toArray(new OG0[0]);
/*    */       int[] arrayOfInt1, arrayOfInt2;
/*    */       byte b1;
/*    */       OG0[] arrayOfOG0;
/*    */       for ((arrayOfInt1 = new int[2])[0] = Integer.MAX_VALUE, (new int[2])[1] = Integer.MAX_VALUE, (arrayOfInt2 = new int[2])[0] = Integer.MIN_VALUE, (new int[2])[1] = Integer.MIN_VALUE, b1 = 0; b1 < (arrayOfOG0 = oF0.x).length; ) {
/*    */         OG0 oG0;
/*    */         int m = (oG0 = arrayOfOG0[b1]).Qy, n = (arrayOfOG0[b1]).ip0;
/*    */         if ((arrayOfOG0[b1]).wA) {
/*    */           m = m * 2;
/*    */           n = n * 2;
/*    */         } 
/*    */         arrayOfInt1[0] = Math.min(arrayOfInt1[0], oG0.eH);
/*    */         arrayOfInt1[1] = Math.min(arrayOfInt1[1], oG0.oR);
/*    */         arrayOfInt2[0] = Math.max(arrayOfInt2[0], oG0.eH + m);
/*    */         arrayOfInt2[1] = Math.max(arrayOfInt2[1], oG0.oR + n);
/*    */         b1++;
/*    */       } 
/*    */       int k;
/*    */       oF0.XP.x = (arrayOfInt2[0] - (k = arrayOfInt1[0]));
/*    */       oF0.XP.y = (arrayOfInt2[1] - (j = arrayOfInt1[1]));
/*    */       oF0.IC0.x = (0 - k);
/*    */       oF0.IC0.y = (0 - j);
/*    */       b++;
/*    */     } 
/*    */     this.MJ = new ZH[j];
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/LD.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */