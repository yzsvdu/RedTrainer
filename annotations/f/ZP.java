/*    */ package f;public abstract class ZP { public JN BT; public Object Vs; public int Nb0; public int AJ; public final ArrayList XC; public final nJ0 RT; public final ArrayList lw0; public nJ0 qa; public boolean iO; public float[] Gn; public float[] id0; public float[] Py0; public float[] qs; public float lC0; public float Bg; public float xx; public float C20; public float[] DF0; public float[] fy; public float[] zH0; public float[] RR; public float[] VT; public float[] Z60; public Ln cOn; public Ln g8; public Ln gI0; public Ln zk; public int Fh; public int C70; public ZP(Aa paramAa) { ArrayList arrayList; this(4); this.XC = arrayList; this(2); this.lw0 = arrayList; this.iO = true; this.Fh = 1; this.C70 = 1; this.BT = paramAa; (this.RT = paramAa.Zj0(this)).hC(); } public static float qd(Ir paramIr, nJ0 paramnJ0) { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: ifnonnull -> 9
/*    */     //   4: fconst_0
/*    */     //   5: fstore_0
/*    */     //   6: goto -> 22
/*    */     //   9: getstatic f/JN.fl0 : Lf/Aa;
/*    */     //   12: aload_0
/*    */     //   13: aload_1
/*    */     //   14: invokevirtual je0 : (Lf/nJ0;)F
/*    */     //   17: fstore_0
/*    */     //   18: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   21: pop
/*    */     //   22: fload_0
/*    */     //   23: freturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 9 } public static float VL0(Ir paramIr, nJ0 paramnJ0) { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: ifnonnull -> 9
/*    */     //   4: fconst_0
/*    */     //   5: fstore_0
/*    */     //   6: goto -> 22
/*    */     //   9: getstatic f/JN.fl0 : Lf/Aa;
/*    */     //   12: aload_0
/*    */     //   13: aload_1
/*    */     //   14: invokevirtual je0 : (Lf/nJ0;)F
/*    */     //   17: fstore_0
/*    */     //   18: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   21: pop
/*    */     //   22: fload_0
/*    */     //   23: freturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*  1 */     //   #1	-> 9 } public static float[] iy(int paramInt, float[] paramArrayOffloat) { if (paramArrayOffloat == null || paramArrayOffloat.length < paramInt) return new float[paramInt];  Arrays.fill(paramArrayOffloat, 0, paramInt, 0.0F); return paramArrayOffloat; } public final void Jp() { int i; int j; nJ0 nJ01; for (i = 0, j = this.XC.size() - 1; j >= 0 && !(nJ01 = this.XC.get(j)).Sb0; ) { i = nJ01.ss.intValue() + i; j--; }  this.Nb0 = Math.max(this.Nb0, i); this.AJ++; ((nJ0)this.XC.get(this.XC.size() - 1)).Sb0 = true; ((YA0)this.Vs)
/*  2 */       .MJ0(); } public final void r3() { float f3; this.iO = false; ArrayList<?> arrayList; if ((arrayList = this.XC).size() > 0 && !((nJ0)arrayList.get(arrayList.size() - 1)).Sb0) Jp();  float f5, arrayOfFloat[]; int i, j; for (arrayOfFloat = this.Gn, this.Gn = iy(this.Nb0, arrayOfFloat), arrayOfFloat = this.id0, this.id0 = iy(this.AJ, arrayOfFloat), arrayOfFloat = this.Py0, this.Py0 = iy(this.Nb0, arrayOfFloat), arrayOfFloat = this.qs, this.qs = iy(this.AJ, arrayOfFloat), arrayOfFloat = this.DF0, this.DF0 = iy(this.Nb0, arrayOfFloat), arrayOfFloat = this.fy, this.fy = iy(this.AJ, arrayOfFloat), arrayOfFloat = this.zH0, this.zH0 = iy(this.Nb0, arrayOfFloat), arrayOfFloat = this.RR, this.RR = iy(this.AJ, arrayOfFloat), f5 = 0.0F, i = 0, j = arrayList.size(); i < j; ) { nJ0 nJ01; if (!(nJ01 = (nJ0)arrayList.get(i)).nul.booleanValue()) { float[] arrayOfFloat1; int i3; if (nJ01.C10.intValue() != 0 && (arrayOfFloat1 = this.RR)[i3 = nJ01.VJ] == 0.0F) arrayOfFloat1[i3] = nJ01.C10.intValue();  if (nJ01.ss.intValue() == 1 && nJ01.Ls.intValue() != 0 && (arrayOfFloat1 = this.zH0)[i3 = nJ01.mh] == 0.0F) arrayOfFloat1[i3] = nJ01.Ls.intValue();  float f10 = qd(nJ01.YX, nJ01); if (nJ01.mh == 0) { f5 = 0.0F; } else { f5 = Math.max(0.0F, qd(nJ01.gL, nJ01) - f5); }  nJ01.zv0 = f10 + f5; nJ01.ia = VL0(nJ01.Et0, nJ01); int n; if ((n = nJ01.dM) != -1) { nJ0 nJ02 = (nJ0)arrayList.get(n); f10 = nJ01.ia; nJ01.ia = Math.max(0.0F, VL0(nJ01.x90, nJ01) - VL0(nJ02.Ph, nJ02)) + f10; }  f3 = qd(nJ01.B5, nJ01); f10 = qd(nJ01.Qj0, nJ01); i3 = nJ01.mh; if (nJ01.ss.intValue() + i3 == this.Nb0) { f11 = 0.0F; } else { f11 = f3; }  nJ01.LH = f10 + f11; f10 = VL0(nJ01.U30, nJ01); if (nJ01.VJ == this.AJ - 1) { f11 = 0.0F; } else { f11 = VL0(nJ01.Ph, nJ01); }  nJ01.It = f10 + f11; float f11 = VL0(nJ01.t00, nJ01), f13 = VL0(nJ01.Vs0, nJ01), f14 = qd(nJ01.Of0, nJ01), f15 = VL0(nJ01.d90, nJ01); float f12; if ((f10 = qd(nJ01.WF0, nJ01)) < (f12 = qd(nJ01.Vr, nJ01))) f10 = f12;  if (f11 < f13) f11 = f13;  if (f14 <= 0.0F || f10 <= f14) f14 = f10;  if (f15 <= 0.0F || f11 <= f15) f15 = f11;  if (nJ01.ss.intValue() == 1) { f10 = nJ01.zv0 + nJ01.LH; int i4; this.Py0[i4] = Math.max(this.Py0[i4 = nJ01.mh], f14 + f10); this.Gn[i4] = Math.max(this.Gn[i4 = nJ01.mh], f12 + f10); }  f10 = nJ01.ia + nJ01.It; int i2; this.qs[i2] = Math.max(this.qs[i2 = nJ01.VJ], f15 + f10); int i1; this.id0[i1] = Math.max(this.id0[i1 = nJ01.VJ], f13 + f10); }  i++; }  byte b2; label174: for (b2 = 0, i = arrayList.size(); b2 < i; ) { nJ0 nJ01; if (!(nJ01 = (nJ0)arrayList.get(b2)).nul.booleanValue() && nJ01.Ls.intValue() != 0) { int n; int i1; for (n = nJ01.mh, i1 = nJ01.ss.intValue() + n; n < i1; ) { if (this.zH0[n] != 0.0F) continue label174;  n++; }  for (n = nJ01.mh, i1 = nJ01.ss.intValue() + n; n < i1; ) { this.zH0[n] = nJ01.Ls.intValue(); n++; }  }  b2++; }  for (b2 = 0, i = arrayList.size(); b2 < i; ) { nJ0 nJ01; if (!(nJ01 = (nJ0)arrayList.get(b2)).nul.booleanValue() && nJ01.ss.intValue() != 1) { float f10 = qd(nJ01.Vr, nJ01), f12 = qd(nJ01.Of0, nJ01); float f11; if ((f11 = qd(nJ01.WF0, nJ01)) < f10) f11 = f10;  if (f12 <= 0.0F || f11 <= f12) f12 = f11;  int i2; float f13; int i3, i4; for (f11 = -(nJ01.zv0 + nJ01.LH), i2 = nJ01.mh, i3 = nJ01.ss.intValue() + i2, f13 = f11, i4 = i2; i4 < i3; ) { f11 = f13 + this.Gn[i4]; f13 = f11 + this.Py0[i4]; i4++; f11 = f13 = f11; }  float f14; int i5; for (f14 = 0.0F, i4 = nJ01.mh, i5 = nJ01.ss.intValue() + i4; i4 < i5; ) { f14 += this.zH0[i4]; i4++; }  int n, i1; for (f10 = Math.max(0.0F, f10 - f13), f11 = Math.max(0.0F, f12 - f11), n = nJ01.mh, i1 = nJ01.ss.intValue() + n; n < i1; ) { if (f14 == 0.0F) { f15 = 1.0F / nJ01.ss.intValue(); } else { f15 = this.zH0[n] / f14; }  float f16 = arrayOfFloat2[n]; float[] arrayOfFloat2; (arrayOfFloat2 = this.Gn)[n] = f10 * f15 + f16; float f15 = arrayOfFloat1[n]; float[] arrayOfFloat1; (arrayOfFloat1 = this.Py0)[n] = f11 * f15 + f15; n++; }  }  b2++; }  float f4, f7, f8, f9; int k, m; for (f4 = 0.0F, f7 = 0.0F, f8 = 0.0F, f9 = 0.0F, k = 0, m = arrayList.size(); k < m; ) { nJ0 nJ01; if (!(nJ01 = (nJ0)arrayList.get(k)).nul.booleanValue()) { Boolean bool; if (nJ01.Ay0 == (bool = Boolean.TRUE) && nJ01.ss.intValue() == 1) { f4 = nJ01.zv0 + nJ01.LH; f8 = Math.max(f4, this.Gn[nJ01.mh] - f4); f4 = Math.max(f8, this.Py0[nJ01.mh] - f4); f8 = f4 = f8; }  if (nJ01.vm == bool) { f7 = nJ01.ia + nJ01.It; f9 = Math.max(f7, this.id0[nJ01.VJ] - f7); f7 = Math.max(f9, this.qs[nJ01.VJ] - f7); f9 = f7 = f9; }  }  k++; }  if ((k = f8 cmp 0.0F) > 0 || f9 > 0.0F) { int n; for (m = 0, n = arrayList.size(); m < n; ) { nJ0 nJ01; if (!(nJ01 = (nJ0)arrayList.get(m)).nul.booleanValue()) { if (k > 0 && nJ01.Ay0 == Boolean.TRUE && nJ01.ss.intValue() == 1) { float f = nJ01.zv0 + nJ01.LH; int i1 = nJ01.mh; this.Gn[i1] = f4 + f; this.Py0[i1] = f8 + f; }  if (f9 > 0.0F && nJ01.vm == Boolean.TRUE) { float f = nJ01.ia + nJ01.It; int i1 = nJ01.VJ; this.id0[i1] = f7 + f; this.qs[i1] = f9 + f; }  }  m++; }  }  byte b1; for (this.lC0 = 0.0F, this.Bg = 0.0F, this.xx = 0.0F, this.C20 = 0.0F, b1 = 0; b1 < this.Nb0; ) { this.lC0 += this.Gn[b1]; this.xx += this.Py0[b1]; b1++; }  for (b1 = 0; b1 < this.AJ; ) { f4 = this.Bg; this.Bg = f4 + f7; f4 = this.C20; this.C20 = Math.max(f7 = this.id0[b1], this.qs[b1]) + f4; b1++; }  Ln ln1; if ((ln1 = this.g8) == null) { f1 = 0.0F; } else { f1 = f1.h80;
/*  3 */       JN.fl0.getClass(); }
/*  4 */      Ln ln3; if ((ln3 = this.zk) == null) { f3 = 0.0F; }
/*    */     else
/*  6 */     { f3 = f3.h80;
/*  7 */       JN.fl0.getClass(); }  float f1 = f3 + f1; Ln ln2;
/*  8 */     if ((ln2 = this.cOn) == null) { f2 = 0.0F; }
/*    */     else
/* 10 */     { f2 = f2.h80;
/* 11 */       JN.fl0.getClass(); }
/* 12 */      Ln ln4; if ((ln4 = this.gI0) == null) { f6 = 0.0F; }
/*    */     else
/* 14 */     { f6 = f6.h80;
/* 15 */       JN.fl0.getClass(); }  float f2 = f6 + f2;
/* 16 */     float f6 = this.lC0 + f1; this.Bg += f2; this.xx = Math.max(this.xx + f1, f6); this.C20 = Math.max(this.C20 + f2, this.Bg); }
/*    */ 
/*    */   
/*    */   public final nJ0 S7(Object paramObject) {
/*    */     nJ0 nJ01;
/*    */     (nJ01 = this.BT.Zj0(this)).ZX = paramObject;
/*    */     if (this.XC.size() > 0) {
/*    */       int i;
/*    */       nJ0 nJ03;
/*    */       if (!(nJ03 = this.XC.get(this.XC.size() - 1)).Sb0) {
/*    */         i = nJ03.mh;
/*    */         nJ01.mh = nJ03.ss.intValue() + i;
/*    */         nJ01.VJ = nJ03.VJ;
/*    */       } else {
/*    */         nJ01.mh = 0;
/*    */         nJ01.VJ = i.VJ + 1;
/*    */       } 
/*    */       if (nJ01.VJ > 0)
/*    */         for (i = this.XC.size() - 1; i >= 0; ) {
/*    */           for (int j = ((nJ0)this.XC.get(i)).mh, k = ((nJ0)this.XC.get(i)).ss.intValue() + j; j < k; ) {
/*    */             if (j == nJ01.mh) {
/*    */               nJ01.dM = i;
/*    */               // Byte code: goto -> 187
/*    */             } 
/*    */             j++;
/*    */           } 
/*    */           i--;
/*    */         }  
/*    */     } else {
/*    */       nJ01.mh = 0;
/*    */       nJ01.VJ = 0;
/*    */     } 
/*    */     this.XC.add(nJ01);
/*    */     nJ0 nJ02;
/*    */     nJ01.Vr = (nJ02 = this.RT).Vr;
/*    */     nJ01.Vs0 = nJ02.Vs0;
/*    */     nJ01.WF0 = nJ02.WF0;
/*    */     nJ01.t00 = nJ02.t00;
/*    */     nJ01.Of0 = nJ02.Of0;
/*    */     nJ01.d90 = nJ02.d90;
/*    */     nJ01.x90 = nJ02.x90;
/*    */     nJ01.gL = nJ02.gL;
/*    */     nJ01.Ph = nJ02.Ph;
/*    */     nJ01.B5 = nJ02.B5;
/*    */     nJ01.Et0 = nJ02.Et0;
/*    */     nJ01.YX = nJ02.YX;
/*    */     nJ01.U30 = nJ02.U30;
/*    */     nJ01.Qj0 = nJ02.Qj0;
/*    */     nJ01.X50 = nJ02.X50;
/*    */     nJ01.Q7 = nJ02.Q7;
/*    */     nJ01.tf = nJ02.tf;
/*    */     nJ01.Ls = nJ02.Ls;
/*    */     nJ01.C10 = nJ02.C10;
/*    */     nJ01.nul = nJ02.nul;
/*    */     nJ01.ss = nJ02.ss;
/*    */     nJ01.Ay0 = nJ02.Ay0;
/*    */     nJ01.vm = nJ02.vm;
/*    */     if (nJ01.mh < this.lw0.size() && (nJ02 = this.lw0.get(nJ01.mh)) != null)
/*    */       nJ01.s10(nJ02); 
/*    */     nJ01.s10(this.qa);
/*    */     if (paramObject != null) {
/*    */       JN jN = this.BT;
/*    */       ((Aa)this).getClass();
/*    */       JG0 jG0 = (JG0)paramObject;
/*    */       ((JG0)this.Vs).si(this, ((JG0)this.Vs).Ub());
/*    */     } 
/*    */     return nJ01;
/*    */   }
/*    */   
/*    */   public final nJ0 wP() {
/*    */     if (this.XC.size() > 0)
/*    */       Jp(); 
/*    */     if (this.qa != null)
/*    */       this.BT.getClass(); 
/*    */     (this.qa = this.BT.Zj0(this)).pl0();
/*    */     return this.qa;
/*    */   }
/*    */   
/*    */   public final nJ0 JP(int paramInt) {
/*    */     nJ0 nJ01;
/*    */     if (this.lw0.size() > paramInt) {
/*    */       nJ01 = this.lw0.get(paramInt);
/*    */     } else {
/*    */       nJ01 = null;
/*    */     } 
/*    */     if (nJ01 == null) {
/*    */       (nJ01 = this.BT.Zj0(this)).pl0();
/*    */       if (paramInt >= this.lw0.size()) {
/*    */         for (int i = this.lw0.size(); i < paramInt; i++)
/*    */           this.lw0.add(null); 
/*    */         this.lw0.add(nJ01);
/*    */       } else {
/*    */         this.lw0.set(paramInt, nJ01);
/*    */       } 
/*    */     } 
/*    */     return nJ01;
/*    */   }
/*    */   
/*    */   public final void QK() {
/*    */     kp0();
/*    */     this.cOn = null;
/*    */     this.g8 = null;
/*    */     this.gI0 = null;
/*    */     this.zk = null;
/*    */     this.Fh = 1;
/*    */     byte b;
/*    */     if (this.C70 != (b = 1))
/*    */       this.BT.mL0((SA)this); 
/*    */     this.C70 = b;
/*    */     this.RT.hC();
/*    */     b = 0;
/*    */     int i = this.lw0.size();
/*    */     while (b < i) {
/*    */       if ((nJ0)this.lw0.get(b) != null)
/*    */         this.BT.getClass(); 
/*    */       b++;
/*    */     } 
/*    */     this.lw0.clear();
/*    */   }
/*    */   
/*    */   public final void kp0() {
/*    */     for (int i = this.XC.size() - 1; i >= 0; ) {
/*    */       Object object;
/*    */       if ((object = ((nJ0)this.XC.get(i)).ZX) != null) {
/*    */         JN jN = this.BT;
/*    */         ((Aa)jN).getClass();
/*    */         ((JG0)this.Vs).jf0((JG0)object);
/*    */       } 
/*    */       this.BT.getClass();
/*    */       i--;
/*    */     } 
/*    */     this.XC.clear();
/*    */     this.AJ = 0;
/*    */     this.Nb0 = 0;
/*    */     if (this.qa != null)
/*    */       this.BT.getClass(); 
/*    */     this.qa = null;
/*    */     ((YA0)this.Vs).MJ0();
/*    */   }
/*    */   
/*    */   public final void r10(Object paramObject) {
/*    */     this.Vs = paramObject;
/*    */   }
/*    */   
/*    */   public final nJ0 cM() {
/*    */     return this.RT;
/*    */   }
/*    */   
/*    */   public final ZP F(float paramFloat) {
/*    */     this(paramFloat);
/*    */     Ln ln;
/*    */     this.cOn = this;
/*    */     this.iO = true;
/*    */     return this;
/*    */   }
/*    */   
/*    */   public final ZP to(float paramFloat) {
/*    */     this(paramFloat);
/*    */     Ln ln;
/*    */     this.g8 = this;
/*    */     this.iO = true;
/*    */     return this;
/*    */   }
/*    */   
/*    */   public final ZP pd0() {
/*    */     this.Fh = 1;
/*    */     return this;
/*    */   }
/*    */   
/*    */   public final ZP HI0() {
/*    */     this.Fh = (this.Fh | 0x2) & 0xFFFFFFFB;
/*    */     return this;
/*    */   }
/*    */   
/*    */   public final void Dl0(float paramFloat) {
/*    */     this(paramFloat);
/*    */     Ln ln;
/*    */     this.cOn = this;
/*    */     this(paramFloat);
/*    */     this.g8 = this;
/*    */     this(paramFloat);
/*    */     this.gI0 = this;
/*    */     this(paramFloat);
/*    */     this.zk = this;
/*    */     this.iO = true;
/*    */   }
/*    */   
/*    */   public final void Ve0(float paramFloat) {
/*    */     this(paramFloat);
/*    */     Ln ln;
/*    */     this.gI0 = this;
/*    */     this.iO = true;
/*    */   }
/*    */   
/*    */   public final void Ty0(float paramFloat) {
/*    */     this(paramFloat);
/*    */     Ln ln;
/*    */     this.zk = this;
/*    */     this.iO = true;
/*    */   }
/*    */   
/*    */   public final void yh0() {
/*    */     this.Fh = (this.Fh | 0x8) & 0xFFFFFFEF;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ZP.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */