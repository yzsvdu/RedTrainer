/*  1 */ package f;public class Et0 extends Cc { public static final I4 Do0 = new I4(); public static float[] Sg0; public static float[] kP; public static xf0 mF = new xf0(); public static aL L3 = new aL(); public static lY uf0 = new lY(); public static or0 Qn = new or0(); public int Lf0; public int iY; public boolean dr0; public final fQ X0 = new fQ(4); public final cOm2 UA0 = iE(); public final fQ vd0 = new fQ(2); public boolean Jl0 = true; public float[] C70; public float[] lpT4; public float[] r1; public float[] Md0; public float JF; public float ei; public float an; public float ck; public float[] Zz; public float[] o0; public float[] Ug0; public float[] jB0; public xf0 w1 = mF; public aL W9 = L3; public lY cE = uf0; public or0 Rx0 = Qn; public int com9 = 1; public bP HM = bP.M20; public fQ Ky; public ES rm; public boolean dq0 = true; public Et0() { this(null); } public Et0(Mw paramMw) { MJ0(); O00(i80.HX); } public static cOm2 iE() { ((cOm2)Do0.obtain()).getClass(); return (cOm2)Do0.obtain(); } public static float[] tT(int paramInt, float[] paramArrayOffloat) { if (paramArrayOffloat == null || paramArrayOffloat.length < paramInt) return new float[paramInt];  Arrays.fill(paramArrayOffloat, 0, paramInt, 0.0F); return paramArrayOffloat; } public final void Rn0() { this.Jl0 = false; Object[] arrayOfObject = this.X0.Uq0; int i, j; if ((i = this.X0.Z8) > 0 && !((cOm2)arrayOfObject[j = i - 1]).bm) { int n; cOm2 cOm21; for (n = 0; j >= 0 && !(cOm21 = (cOm2)arrayOfObject[j]).bm; ) { n = cOm21.kg0.intValue() + n; j--; }  this.Lf0 = Math.max(this.Lf0, n); this.iY++; ((cOm2)this.X0.peek()).bm = true; this
/*  2 */         .dr0 = true; }  int k; float arrayOfFloat1[], arrayOfFloat2[], arrayOfFloat3[], arrayOfFloat4[], arrayOfFloat5[], arrayOfFloat6[], f4; byte b3; for (j = this.Lf0, this.C70 = arrayOfFloat1 = tT(j, this.C70), this.lpT4 = arrayOfFloat2 = tT(k, this.lpT4), this.r1 = arrayOfFloat3 = tT(j, this.r1), this.Md0 = arrayOfFloat4 = tT(k, this.Md0), this.Zz = tT(j, this.Zz), this.o0 = tT(k, this.o0), this.Ug0 = arrayOfFloat5 = tT(j, this.Ug0), this.jB0 = arrayOfFloat6 = tT(k = this.iY, this.jB0), f4 = 0.0F, b3 = 0; b3 < i; ) { cOm2 cOm21; int n = (cOm21 = (cOm2)arrayOfObject[b3]).i7, i1 = ((cOm2)arrayOfObject[b3]).k90, i2 = ((cOm2)arrayOfObject[b3]).kg0.intValue(); eF0 eF0 = ((cOm2)arrayOfObject[b3]).Wu0; if (((cOm2)arrayOfObject[b3]).p20.intValue() != 0 && arrayOfFloat6[i1] == 0.0F) arrayOfFloat6[i1] = cOm21.p20.intValue();  if (i2 == 1 && cOm21.zw.intValue() != 0 && arrayOfFloat5[n] == 0.0F) arrayOfFloat5[n] = cOm21.zw.intValue();  float f10 = cOm21.na.ad(eF0); if (n == 0) { f4 = 0.0F; } else { f4 = Math.max(0.0F, cOm21.HG0.ad(eF0) - f4); }  cOm21.kf0 = f10 + f4; cOm21.nb = f4 = cOm21.YK.ad(eF0); int i3; if ((i3 = cOm21.sH) != -1) { cOm2 cOm22 = (cOm2)arrayOfObject[i3]; cOm21.nb = Math.max(0.0F, cOm21.qM.ad(eF0) - cOm22.O4.ad(eF0)) + f4; }  f4 = cOm21.Px.ad(eF0); float f9 = cOm21.lg0.ad(eF0); if (n + i2 == j) { f11 = 0.0F; } else { f11 = f4; }  cOm21.el0 = f9 + f11; f9 = cOm21.c1.ad(eF0); if (i1 == k - 1) { f11 = 0.0F; } else { f11 = cOm21.O4.ad(eF0); }  cOm21.yX = f9 + f11; float f11 = cOm21.fq0.ad(eF0), f13 = cOm21.E90.ad(eF0), f14 = cOm21.NB0.ad(eF0), f8 = cOm21.OC0.ad(eF0); float f12; if ((f9 = cOm21.gI.ad(eF0)) < (f12 = cOm21.Is0.ad(eF0))) f9 = f12;  if (f11 < f13) f11 = f13;  if (f14 <= 0.0F || f9 <= f14) f14 = f9;  if (f8 <= 0.0F || f11 <= f8) f8 = f11;  if (this.dq0) { f12 = (float)Math.ceil(f12); f13 = (float)Math.ceil(f13); f14 = (float)Math.ceil(f14); f8 = (float)Math.ceil(f8); }  if (i2 == 1) { float f = cOm21.kf0 + cOm21.el0; arrayOfFloat3[n] = Math.max(arrayOfFloat3[n], f14 + f); arrayOfFloat1[n] = Math.max(arrayOfFloat1[n], f12 + f); }  float f7 = cOm21.nb + cOm21.yX; arrayOfFloat4[i1] = Math.max(arrayOfFloat4[i1], f8 + f7); arrayOfFloat2[i1] = Math.max(arrayOfFloat2[i1], f13 + f7); b3++; }  float f3, f5, f6; int m; label144: for (f3 = 0.0F, f4 = 0.0F, f5 = 0.0F, f6 = 0.0F, m = 0; m < i; ) { cOm2 cOm21; int n = (cOm21 = (cOm2)arrayOfObject[m]).i7; int i1; if ((i1 = ((cOm2)arrayOfObject[m]).zw.intValue()) != 0) { int i2; int i3; for (i2 = cOm21.kg0.intValue() + n, i3 = n; i3 < i2; ) { if (arrayOfFloat5[i3] != 0.0F) continue label144;  i3++; }  for (i3 = n; i3 < i2; ) { arrayOfFloat5[i3] = i1; i3++; }  }  Boolean bool; if (cOm21.gp0 == (bool = Boolean.TRUE) && cOm21.kg0.intValue() == 1) { f3 = cOm21.kf0 + cOm21.el0; f5 = Math.max(f3, arrayOfFloat1[n] - f3); f3 = Math.max(f5, arrayOfFloat3[n] - f3); f5 = f3 = f5; }  if (cOm21.ni0 == bool) { f4 = cOm21.nb + cOm21.yX; f6 = Math.max(f4, arrayOfFloat2[cOm21.k90] - f4); f4 = Math.max(f6, arrayOfFloat4[cOm21.k90] - f4); f6 = f4 = f6; }  m++; }  if ((m = f5 cmp 0.0F) > 0 || f6 > 0.0F) for (byte b = 0; b < i; ) { cOm2 cOm21 = (cOm2)arrayOfObject[b]; if (m > 0 && cOm21.gp0 == Boolean.TRUE && cOm21.kg0.intValue() == 1) { float f = cOm21.kf0 + cOm21.el0; int n = cOm21.i7; arrayOfFloat1[n] = f3 + f; arrayOfFloat3[n] = f5 + f; }  if (f6 > 0.0F && cOm21.ni0 == Boolean.TRUE) { float f = cOm21.nb + cOm21.yX; int n = cOm21.k90; arrayOfFloat2[n] = f4 + f; arrayOfFloat4[n] = f6 + f; }  b++; }   for (byte b2 = 0; b2 < i; ) { cOm2 cOm21; int n; if ((n = (cOm21 = (cOm2)arrayOfObject[b2]).kg0.intValue()) != 1) { int i1 = cOm21.i7; eF0 eF0 = cOm21.Wu0; float f9 = cOm21.Is0.ad(eF0), f8 = cOm21.NB0.ad(eF0); float f10; if ((f10 = cOm21.gI.ad(eF0)) < f9) f10 = f9;  if (f8 <= 0.0F || f10 <= f8) f8 = f10;  if (this.dq0) { f9 = (float)Math.ceil(f9); f8 = (float)Math.ceil(f8); }  float f7; int i2; float f11; int i3; for (f7 = -(cOm21.kf0 + cOm21.el0), f10 = 0.0F, i2 = i1 + n, f11 = f10, f10 = f7, i3 = i1; i3 < i2; ) { f7 += arrayOfFloat1[i3]; f10 += arrayOfFloat3[i3]; f11 += arrayOfFloat5[i3]; i3++; }  for (f7 = Math.max(0.0F, f9 - f7), f8 = Math.max(0.0F, f8 - f10); i1 < i2; ) { if (f11 == 0.0F) { f9 = 1.0F / n; } else { f9 = arrayOfFloat5[i1] / f11; }  f9 = arrayOfFloat1[i1]; arrayOfFloat1[i1] = f7 * f9 + f9; f9 = arrayOfFloat3[i1]; arrayOfFloat3[i1] = f8 * f9 + f9; i1++; }  }  b2++; }  byte b1; float f2; for (float f1 = this.W9.ad(this), f1 = this.Rx0.ad(this) + f1; b1 < j; ) { this.JF += arrayOfFloat1[b1]; this.an += arrayOfFloat3[b1]; b1++; }  for (this.ei = f2, this.ck = f2, b1 = 0; b1 < k; ) { f2 = this.ei; this.ei = f2 + f; f2 = this.ck; float f; this.ck = Math.max(f = arrayOfFloat2[b1], arrayOfFloat4[b1]) + f2; b1++; }  this.an = Math.max(this.JF, this.an); this.ck = Math.max(this.ei, this.ck); } public final eF0 QI0(float paramFloat1, float paramFloat2, boolean paramBoolean) { return super.QI0(paramFloat1, paramFloat2, paramBoolean); } public final void lp0() { this.Jl0 = true; this.Ot0 = true; } public final boolean Td(eF0 parameF0, boolean paramBoolean) { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: aload_1
/*    */     //   2: iload_2
/*    */     //   3: invokespecial Td : (Lf/eF0;Z)Z
/*    */     //   6: ifne -> 11
/*    */     //   9: iconst_0
/*    */     //   10: ireturn
/*    */     //   11: aload_1
/*    */     //   12: ifnull -> 76
/*    */     //   15: aload_0
/*    */     //   16: getfield X0 : Lf/fQ;
/*    */     //   19: dup
/*    */     //   20: getfield Uq0 : [Ljava/lang/Object;
/*    */     //   23: astore_0
/*    */     //   24: iconst_0
/*    */     //   25: istore_2
/*    */     //   26: getfield Z8 : I
/*    */     //   29: istore_3
/*    */     //   30: iload_2
/*    */     //   31: iload_3
/*    */     //   32: if_icmpge -> 60
/*    */     //   35: aload_0
/*    */     //   36: iload_2
/*    */     //   37: aaload
/*    */     //   38: checkcast f/cOm2
/*    */     //   41: dup
/*    */     //   42: astore #4
/*    */     //   44: getfield Wu0 : Lf/eF0;
/*    */     //   47: aload_1
/*    */     //   48: if_acmpne -> 54
/*    */     //   51: goto -> 63
/*    */     //   54: iinc #2, 1
/*    */     //   57: goto -> 30
/*    */     //   60: aconst_null
/*    */     //   61: astore #4
/*    */     //   63: aload #4
/*    */     //   65: ifnull -> 74
/*    */     //   68: aload #4
/*    */     //   70: aconst_null
/*    */     //   71: putfield Wu0 : Lf/eF0;
/*    */     //   74: iconst_1
/*    */     //   75: ireturn
/*    */     //   76: new java/lang/IllegalArgumentException
/*    */     //   79: dup
/*    */     //   80: ldc_w 'actor cannot be null.'
/*    */     //   83: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   86: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 16
/*    */     //   #2	-> 71
/*    */     //   #3	-> 76 } public final eF0 PA(int paramInt, boolean paramBoolean) { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: dup
/*    */     //   2: iload_1
/*    */     //   3: iload_2
/*    */     //   4: invokespecial PA : (IZ)Lf/eF0;
/*    */     //   7: astore_0
/*    */     //   8: getfield X0 : Lf/fQ;
/*    */     //   11: dup
/*    */     //   12: getfield Uq0 : [Ljava/lang/Object;
/*    */     //   15: astore_1
/*    */     //   16: iconst_0
/*    */     //   17: istore_2
/*    */     //   18: getfield Z8 : I
/*    */     //   21: istore_3
/*    */     //   22: iload_2
/*    */     //   23: iload_3
/*    */     //   24: if_icmpge -> 52
/*    */     //   27: aload_1
/*    */     //   28: iload_2
/*    */     //   29: aaload
/*    */     //   30: checkcast f/cOm2
/*    */     //   33: dup
/*    */     //   34: astore #4
/*    */     //   36: getfield Wu0 : Lf/eF0;
/*    */     //   39: aload_0
/*    */     //   40: if_acmpne -> 46
/*    */     //   43: goto -> 55
/*    */     //   46: iinc #2, 1
/*    */     //   49: goto -> 22
/*    */     //   52: aconst_null
/*    */     //   53: astore #4
/*    */     //   55: aload #4
/*    */     //   57: ifnull -> 66
/*    */     //   60: aload #4
/*    */     //   62: aconst_null
/*    */     //   63: putfield Wu0 : Lf/eF0;
/*    */     //   66: aload_0
/*    */     //   67: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 8
/*  2 */     //   #2	-> 63 } public final void NL(ES paramES) { if (this.rm == paramES) return;  float f1 = this.W9.ad(this);
/*  3 */     float f3 = this.cE.ad(this);
/*  4 */     float f4 = this.Rx0.ad(this);
/*  5 */     this.rm = paramES;
/*  6 */     float f5 = this.w1.ad(this);
/*  7 */     float f6 = this.W9.ad(this);
/*  8 */     float f7 = this.cE.ad(this);
/*  9 */     float f8 = this.Rx0.ad(this); float f2; if ((f2 = this.w1.ad(this)) + f3 != f5 + f7 || f1 + f4 != f6 + f8)
/* 10 */     { dD0(); return; }  if (f2 != f5 || f1 != f6 || f3 != f7 || f4 != f8) lp0();  } public float DB0() { if (this.Jl0) Rn0();  float f = this.an; ES eS; if ((eS = this.rm) != null) return Math.max(f, ((uB)eS).uz);  return f; } public float d6() { if (this.Jl0) Rn0();  float f = this.ck; ES eS; if ((eS = this.rm) != null) return Math.max(f, ((uB)eS).B90);  return f; } public float OI() { if (this.Jl0) Rn0();  return this.JF; } public float Mb() { if (this.Jl0) Rn0();  return this.ei; } public final void QY() { float[] arrayOfFloat3; if (this.Jl0) Rn0();  float f1 = this.ZP; float f2 = this.xr0; int j = this.Lf0, k = this.iY; float arrayOfFloat1[] = this.Zz, arrayOfFloat2[] = this.o0, f5 = this.W9.ad(this), f6 = this.Rx0.ad(this) + f5, f7 = this.w1.ad(this), f8 = this.cE.ad(this) + f7; float f10, f13; if ((f13 = this.an - (f10 = this.JF)) == 0.0F) { arrayOfFloat3 = this.C70; } else { float f; float[] arrayOfFloat6; float[] arrayOfFloat7; float[] arrayOfFloat8; byte b; for (f = Math.min(f13, Math.max(0.0F, f1 - arrayOfFloat3)), Sg0 = arrayOfFloat6 = tT(j, Sg0), arrayOfFloat7 = this.C70, arrayOfFloat8 = this.r1, b = 0; b < j; ) { float f15; arrayOfFloat6[b] = (arrayOfFloat8[b] - (f15 = arrayOfFloat7[b])) / f13 * f + f15; b++; }  arrayOfFloat3 = arrayOfFloat6; }  if ((f13 = this.ck - this.ei) == 0.0F) { arrayOfFloat4 = this.lpT4; } else { float[] arrayOfFloat6; float f; float[] arrayOfFloat7; float[] arrayOfFloat8; byte b; for (kP = arrayOfFloat6 = tT(k, kP), f = Math.min(arrayOfFloat4, Math.max(0.0F, f2 - this.ei)), arrayOfFloat7 = this.lpT4, arrayOfFloat8 = this.Md0, b = 0; b < k; ) { float f15; arrayOfFloat6[b] = (arrayOfFloat8[b] - (f15 = arrayOfFloat7[b])) / arrayOfFloat4 * f + f15; b++; }  arrayOfFloat4 = arrayOfFloat6; }  Object[] arrayOfObject; int m; byte b5; for (arrayOfObject = this.X0.Uq0, m = this.X0.Z8, b5 = 0; b5 < m; ) { cOm2 cOm21; int i2, i3; eF0 eF0; float f16; int i4, i5, i6; for (i3 = cOm21.k90, eF0 = cOm21.Wu0, f16 = 0.0F, i5 = (i2 = (cOm21 = (cOm2)arrayOfObject[b5]).i7) + (i4 = cOm21.kg0.intValue()), i6 = i2; i6 < i5; ) { f16 += arrayOfFloat3[i6]; i6++; }  float f17 = arrayOfFloat4[i3], f19 = cOm21.fq0.ad(eF0), f21 = cOm21.E90.ad(eF0), f22 = cOm21.NB0.ad(eF0), f15 = cOm21.OC0.ad(eF0); float f18, f20; if ((f18 = cOm21.gI.ad(eF0)) < (f20 = cOm21.Is0.ad(eF0))) f18 = f20;  if (f19 < f21) f19 = f21;  if (f22 <= 0.0F || f18 <= f22) f22 = f18;  if (f15 <= 0.0F || f19 <= f15) f15 = f19;  cOm21.e20 = Math.min(f16 - cOm21.kf0 - cOm21.el0, f22); cOm21.LPt7 = Math.min(f17 - cOm21.nb - cOm21.yX, f15); if (i4 == 1) arrayOfFloat1[i2] = Math.max(arrayOfFloat1[i2], f16);  arrayOfFloat2[i3] = Math.max(arrayOfFloat2[i3], f17); b5++; }  float arrayOfFloat4[], arrayOfFloat5[], f14; int i1; for (arrayOfFloat4 = this.Ug0, arrayOfFloat5 = this.jB0, f14 = 0.0F, i1 = 0; i1 < j; ) { f14 += arrayOfFloat4[i1]; i1++; }  if (f14 > 0.0F) { float f; byte b; for (f = f1 - f6, b = 0; b < j; ) { f -= arrayOfFloat1[b]; b++; }  if (f > 0.0F) { float f16; byte b6, b7; for (f16 = 0.0F, b6 = 0, b7 = 0; b7 < j; ) { float f17; if ((f17 = arrayOfFloat4[b7]) != 0.0F) { f16 = f * f17 / f14; arrayOfFloat1[b7] = arrayOfFloat1[b7] + f16; f16 += f16; b6 = b7; }  b7++; }  float f15 = arrayOfFloat1[b6]; arrayOfFloat1[b6] = f - f16 + f15; }  }  float f12; int n; for (f12 = 0.0F, n = 0; n < k; ) { f12 += arrayOfFloat5[n]; n++; }  if (f12 > 0.0F) { float f; for (f = f2 - f8, i1 = 0; i1 < k; ) { f -= arrayOfFloat2[i1]; i1++; }  if (f > 0.0F) { float f15; byte b6; byte b7; for (f15 = 0.0F, b6 = 0, b7 = 0; b7 < k; ) { float f16; if ((f16 = arrayOfFloat5[b7]) != 0.0F) { f15 = f * f16 / f12; arrayOfFloat2[b7] = arrayOfFloat2[b7] + f15; f15 += f15; b6 = b7; }  b7++; }  f12 = arrayOfFloat2[b6]; arrayOfFloat2[b6] = f - f15 + f12; }  }  for (byte b4 = 0; b4 < m; ) { cOm2 cOm21; if ((n = (cOm21 = (cOm2)arrayOfObject[b4]).kg0.intValue()) != 1) { float f; int i2; int i3; for (f = 0.0F, i3 = (i2 = cOm21.i7) + n; i2 < i3; ) { f = arrayOfFloat3[i2] - arrayOfFloat1[i2] + f; i2++; }  if ((f = (f - Math.max(0.0F, cOm21.kf0 + cOm21.el0)) / n) > 0.0F) { int i4; for (n = (i4 = cOm21.i7) + n; i4 < n; ) { arrayOfFloat1[i4] = arrayOfFloat1[i4] + f; i4++; }  }  }  b4++; }  float f11; for (byte b3 = 0; b3 < j; ) { f11 += arrayOfFloat1[b3]; b3++; }  float f9; for (j = 0, f9 = f8; j < k; ) { f9 += arrayOfFloat2[j]; j++; }  if (((j = this.com9) & 0x10) != 0) { f5 = f1 - f11 + f5; } else if ((j & 0x8) == 0) { f5 = (f1 - f11) / 2.0F + f5; }  if ((j & 0x4) != 0) { f7 = f2 - f9 + f7; } else if ((j & 0x2) == 0) { f7 = (f2 - f9) / 2.0F + f7; }  byte b1; float f3, f4; for (b1 = 0, f4 = f7, f3 = f5; b1 < m; ) { cOm2 cOm21; float f15; int i3; for (f15 = 0.0F, i1 = (cOm21 = (cOm2)arrayOfObject[b1]).i7, i3 = ((cOm2)arrayOfObject[b1]).kg0.intValue() + i1; i1 < i3; ) { f15 += arrayOfFloat1[i1]; i1++; }  f15 -= (f3 = cOm21.kf0) + cOm21.el0; f3 += f3; float f17 = cOm21.PW.floatValue(); cOm21.e20 = Math.max(f15 * f16, cOm21.Is0.ad(cOm21.Wu0)); float f16; if ((f16 = cOm21.H20.floatValue()) > 0.0F && (f16 = cOm21.NB0.ad(cOm21.Wu0)) > 0.0F) cOm21.e20 = Math.min(cOm21.e20, f16);  cOm21.LPt7 = Math.max(arrayOfFloat2[cOm21.k90] * f17 - cOm21.nb - cOm21.yX, cOm21.E90.ad(cOm21.Wu0)); if (f17 > 0.0F && (f16 = cOm21.OC0.ad(cOm21.Wu0)) > 0.0F) cOm21.LPt7 = Math.min(cOm21.LPt7, f16);  int i2; if (((i2 = cOm21.WF0.intValue()) & 0x8) != 0) { cOm21.Uy0 = f3; } else if ((i2 & 0x10) != 0) { cOm21.Uy0 = f3 + f15 - cOm21.e20; } else { cOm21.Uy0 = (f15 - cOm21.e20) / 2.0F + f3; }  if ((i2 & 0x2) != 0) { cOm21.FQ = cOm21.nb; } else if ((i2 & 0x4) != 0) { cOm21.FQ = arrayOfFloat2[cOm21.k90] - cOm21.LPt7 - cOm21.yX; } else { cOm21.FQ = (arrayOfFloat2[cOm21.k90] - cOm21.LPt7 + cOm21.nb - cOm21.yX) / 2.0F; }  cOm21.FQ = f2 - f4 - cOm21.FQ - cOm21.LPt7; if (this.dq0) { cOm21.e20 = (float)Math.ceil(cOm21.e20); cOm21.LPt7 = (float)Math.ceil(cOm21.LPt7); cOm21.Uy0 = (float)Math.floor(cOm21.Uy0); cOm21.FQ = (float)Math.floor(cOm21.FQ); }  eF0 eF0; if ((eF0 = cOm21.Wu0) != null) { float f18 = cOm21.Uy0; f17 = cOm21.FQ; float f19 = cOm21.e20, f20 = cOm21.LPt7; eF0.DD(f18, f17, f19, f20); }  if (cOm21.bm) { f4 += arrayOfFloat2[cOm21.k90]; f3 = f5; } else { f3 = f15 + cOm21.el0 + f3; }  b1++; }  eF0[] arrayOfEF0; byte b2; int i; for (arrayOfEF0 = (eF0[])this.sl0.Uq0, b2 = 0, i = this.sl0.Z8; b2 < i; ) { eF0 eF0; if (eF0 = arrayOfEF0[b2] instanceof vh) ((vh)eF0).kn0();  b2++; }  if (this.HM != bP.M20) { float f15 = f11 - f6, f16 = f9 - f8; if (this.Ky == null) { fQ fQ1; this(); this.Ky = fQ1; }  kl.z8.freeAll(this.Ky); this.Ky.clear(); bP bP1; if ((bP1 = this.HM) == bP.U9 || bP1 == bP.N1) { f16 = this.ZP; float f18 = this.xr0; f4 = 0.0F; float f19 = 0.0F; kl2.getClass(); kl kl2; (kl2 = (kl)kl.z8.obtain()).jG(f4, f19, f16, f18); this.Ky.Com3(kl2);
/* 11 */         f16 = this.xr0 - f7; f18 = -f16;
/* 12 */         kl1.getClass(); kl kl1; (kl1 = (kl)kl.z8.obtain()).jG(f5, f16, f15, f18); this.Ky.Com3(kl1); }  byte b = 0; int i2; float f17;
/* 13 */       for (i2 = this.X0.Z8, f17 = f5; b < i2; ) { cOm2 cOm21 = (cOm2)this.X0.get(b); bP bP2; if ((bP2 = this.HM) == bP.pK0 || bP2 == bP.N1) { float f18 = cOm21.Uy0, f19 = cOm21.FQ; f6 = cOm21.e20; f8 = cOm21.LPt7;
/* 14 */           kl.getClass(); kl kl; (kl = (kl)kl.z8.obtain()).jG(f18, f19, f6, f8); this.Ky.Com3(kl); }  float f = 0.0F;
/* 15 */         for (int i3 = cOm21.i7, i4 = cOm21.kg0.intValue() + i3; i3 < i4; ) { f += this.Zz[i3]; i3++; }  f -= (f17 = cOm21.kf0) + cOm21.el0; f17 += f17; bP bP3; if ((bP3 = this.HM) == bP.sF || bP3 == bP.N1) { float f18 = f7 + f18;
/* 16 */           f18 = this.xr0 - f18; float f19 = -(this.o0[cOm21.k90] - (f18 = cOm21.nb) - cOm21.yX);
/* 17 */           kl.getClass(); kl kl; (kl = (kl)kl.z8.obtain()).jG(f17, f18, f, f19); this.Ky.Com3(kl); }  if (cOm21
/* 18 */           .bm) { f7 = f17 = f7 + this.o0[cOm21.k90]; f17 = f5; } else { f17 = f + cOm21.el0 + f17; }  b++; }  }  } public void cD(JX paramJX, float paramFloat) { Matrix4 matrix4; kn0(); if (this.wj0) { Matrix4 matrix41 = Ug(); Matrix4 matrix42 = paramJX.q0; this.g0.getClass(); this.g0.Qw(matrix42.Z0); if (paramJX.V10) paramJX.ot();  paramJX.q0.getClass(); paramJX.q0.Qw(matrix41.Z0); if (paramJX.V10) paramJX.A6();  float f1 = 0.0F, f2 = 0.0F; if (this.rm != null) { Color color; float f4 = (color = this.As0).r, f5 = this.As0.g, f6 = this.As0.b, f3 = color.a * paramFloat; paramJX.implements(f4, f5, f6, f3); f3 = this.ZP; f4 = this.xr0; this.rm.JD(paramJX, f1, f2, f3, f4); }  Oi(paramJX, paramFloat); matrix4 = this.g0;
/* 19 */       if (paramJX.V10) paramJX
/* 20 */           .ot();  paramJX.q0.getClass(); paramJX.q0
/* 21 */         .Qw(this.Z0);
/* 22 */       if (paramJX.V10) paramJX.A6();  }
/* 23 */     else { float f1 = ((eF0)this).bs;
/* 24 */       float f2 = ((eF0)this).kl;
/* 25 */       if (((Et0)super).rm != null)
/*    */       { Color color;
/* 27 */         float f4 = (color = ((eF0)this).As0).r, f5 = ((eF0)this).As0.g, f6 = ((eF0)this).As0.b, f3 = color.a * paramFloat; paramJX.implements(f4, f5, f6, f3);
/* 28 */         f3 = ((eF0)this).ZP;
/* 29 */         f4 = ((eF0)this).xr0;
/* 30 */         ((Et0)super).rm.JD(paramJX, f1, f2, f3, f4); }  super
/* 31 */         .cD(paramJX, paramFloat); }
/*    */      }
/*    */ 
/*    */   
/*    */   public final void X6(eF0 parameF0) {
/*    */     cOm2 cOm21;
/*    */     (cOm21 = iE()).Wu0 = parameF0;
/*    */     if (this.dr0) {
/*    */       this.dr0 = false;
/*    */       this.iY--;
/*    */       ((cOm2)this.X0.peek()).bm = false;
/*    */     } 
/*    */     fQ fQ1;
/*    */     int j;
/*    */     if ((j = (fQ1 = this.X0).Z8) > 0) {
/*    */       int k;
/*    */       cOm2 cOm22;
/*    */       if (!(cOm22 = (cOm2)fQ1.peek()).bm) {
/*    */         k = cOm22.i7;
/*    */         cOm21.i7 = cOm22.kg0.intValue() + k;
/*    */         cOm21.k90 = cOm22.k90;
/*    */       } else {
/*    */         cOm21.i7 = 0;
/*    */         cOm21.k90 = k.k90 + 1;
/*    */       } 
/*    */       if (cOm21.k90 > 0) {
/*    */         Object[] arrayOfObject = this.X0.Uq0;
/*    */         while (--j >= 0) {
/*    */           int m = ((cOm2)arrayOfObject[j]).i7;
/*    */           int n = ((cOm2)arrayOfObject[j]).kg0.intValue() + m;
/*    */           while (m < n) {
/*    */             if (m == cOm21.i7) {
/*    */               cOm21.sH = j;
/*    */               // Byte code: goto -> 215
/*    */             } 
/*    */             m++;
/*    */           } 
/*    */           j--;
/*    */         } 
/*    */       } 
/*    */     } else {
/*    */       cOm21.i7 = 0;
/*    */       cOm21.k90 = 0;
/*    */     } 
/*    */     this.X0.Com3(cOm21);
/*    */     cOm21.tT(this.UA0);
/*    */     int i;
/*    */     fQ fQ2;
/*    */     if ((i = cOm21.i7) < (fQ2 = this.vd0).Z8)
/*    */       cOm21.wB0((cOm2)fQ2.get(i)); 
/*    */     if (parameF0 != null)
/*    */       gx0(parameF0); 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Et0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */