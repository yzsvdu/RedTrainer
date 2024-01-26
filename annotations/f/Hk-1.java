/*  1 */ package f;public final class Hk { public static short C00 = 0; public static final Vp0[] Vm = new Vp0[] { Vp0.MP, Vp0.bG }; public static final byte[] bl = new byte[] { 0, 2, 1 }; public static final byte[] Ys0 = new byte[] { 3, 5, 4 }; public static final pe0[][] dA = new pe0[(new byte[3]).length][]; public static final Matrix4 Ww0 = new Matrix4(); public static final TG0 X5 = new TG0(); public static final eo A1 = new eo(0.01171875F, 0.01171875F, 0.01171875F); public static final eo lK = new eo(); public static final eo Iy = new eo(); public static final eo nH = new eo(); public static final ik qU = C00.gd(Hk.class); public static final Color SW = Color.WHITE.cpy(); public static boolean Ki0 = false; public static float Pn = 1.0F; public pe0[][][] RW; public uT[][] OC; public ByteBuffer G90; public float lE0; public Ut0[] hG0 = new Ut0[3]; public Hk() { lPT9[] arrayOfLPT9; int i = (arrayOfLPT9 = lPT9.AUX).length; for (byte b = 0; b < i; b++) { lPT9 lPT9 = arrayOfLPT9[b]; this.hG0[lPT9.hW()] = new Ut0(); }  } public static void QH(tH paramtH, pe0 parampe0, Vp0 paramVp0, short paramShort, UX paramUX, float paramFloat1, float paramFloat2, boolean paramBoolean1, boolean paramBoolean2, float paramFloat3) { if (parampe0 == null) return;  if (paramUX == null || !paramVp0.Ko(paramShort))
/*  2 */     { if (paramBoolean2) { paramtH.og0(Xc0.Nn0); } else if (paramFloat3 == 1.0F) { paramtH.og0(Color.WHITE_FLOAT_BITS); } else { Color color; (color = SW).a = paramFloat3; paramtH.HK0(color); }  } else { paramtH.HK0(paramUX.US); }  if (paramBoolean1) { f3 = 42.75F; } else { f3 = 0.0F; }  float f3 = paramFloat1 + f3, f4 = 0.0F, f5 = 0.0F;
/*  3 */     int i = parampe0.H0; if (paramBoolean1) { byte b = -1; } else { paramBoolean1 = true; }  float f1 = (i * paramBoolean1);
/*  4 */     float f2 = parampe0.Vn0;
/*  5 */     paramtH.dR(parampe0, f3, paramFloat2, f4, f5, f1, f2, 0.75F, 0.75F, 0.0F); paramtH.og0(Xc0.Nn0); } public static void fS(Vp0 paramVp0, byte paramByte, OE0 paramOE0, ArrayList<C30> paramArrayList, int paramInt) { short s; if ((s = paramOE0.JM(paramVp0)) == -1) return;  wc wc; if ((wc = paramVp0.fM0(s)) == null) return;  X9 x9; if ((x9 = wc.ml(lPT9.fh0)) == null)
/*  6 */       return;  x9.st0(); byte b; for (b = 0; b < 3; ) { pe0 pe01; if (b != 1 && (pe01 = x9.QB0(c70.Pj0(paramInt, b), paramByte)) != null) { C30 c30; this(pe01); UX uX; if (b == 0 && (uX = paramOE0.F00(paramVp0)) != null && paramVp0.Ko(s)) { c30.Mm0 = uX.S1; c30.go0(); c30.bE0 = uX.PH0 * 2; c30.go0(); }  paramArrayList
/*  7 */           .add(c30); }  b = (byte)(b + 1); }  } public static void Yr(Vp0 paramVp0, OE0 paramOE0, ArrayList<uT> paramArrayList, boolean paramBoolean) { lPT9 lPT9 = lPT9.jR; short s; if ((s = paramOE0.JM(paramVp0)) == -1) return;  wc wc; if ((wc = paramVp0.fM0(s)) == null) return;  X9 x9; if ((x9 = wc.ml(lPT9)) == null)
/*  8 */       return;  x9.st0(); byte b; for (b = 0; b < 3; ) { if (b != 1) { byte b2; byte b1 = paramOE0.QM; if (paramBoolean) { b2 = (byte)(b + 3); } else { b2 = b; }  pe0 pe01; if ((pe01 = x9.QB0(b2, b1)) != null) { uT uT1; int i = pe01.H0; this(i, pe01.Vn0, pe01, true); UX uX; if (b != 0 || (
/*  9 */             uX = paramOE0.F00(paramVp0)) == null || !paramVp0.Ko(s))
/*    */           
/* 11 */           { uT1.DD(Color.WHITE); } else { uT1.DD(uX.xK0); }  paramArrayList.add(uT1); }  }  b = (byte)(b + 1); }  } public final void EB(K70 paramK70, fo0 paramfo0, Jo paramJo, Vp0 paramVp0, byte paramByte, UX paramUX, Matrix4 paramMatrix4, boolean paramBoolean1, boolean paramBoolean2) { byte[] arrayOfByte; short s; if ((s = paramJo.lB0.JM(paramVp0)) == -1)
/*    */       return;  vd vd = paramJo.lB0.ew0[paramVp0.gw0]; if (paramBoolean2) { arrayOfByte = Ys0; } else { arrayOfByte = bl; }  int i; byte b; for (i = arrayOfByte.length, b = 0; b < i; ) { byte b1 = arrayOfByte[b]; pe0 pe01; if ((pe01 = hI(lPT9.U4, paramVp0, s, paramByte, b1, false, vd)) != null) { boolean bool; UX uX; if (b1 == 5 || b1 == 2 || b1 == 6) { bool = true; } else { bool = false; }  if (bool) { uX = null; } else { uX = paramUX; }  kd(b1, paramK70, paramfo0, pe01, paramVp0, s, uX, paramMatrix4, paramBoolean1, 1.0F); }  b++; }  }
/* 13 */   public final boolean bg() { long l = System.currentTimeMillis(); this.RW = new pe0[3][5][52]; try { int i; int j; for (this.G90 = UB0.vj0.aP("data/sprites/addons.pak").fg0(FileChannel.MapMode.READ_ONLY).order(ByteOrder.LITTLE_ENDIAN), i = Vp0.zG.length, j = 0; j < i; ) { lPT9[] arrayOfLPT9; int k; byte b1; for (k = (arrayOfLPT9 = lPT9.AUX).length, b1 = 0; b1 < k; ) { lPT9 lPT9 = arrayOfLPT9[b1]; X9 x9; int m; byte b2; for (m = (x9 = Vp0.zG[j].ml(lPT9)).ls.length, b2 = 0; b2 < m; ) { byte b3; ZH zH; pe0 pe01; int n = 0; n = ((x9.ls[b2]).jA0[n]).wq; int i1; if ((i1 = ((x9.ls[b2]).jA0[n]).Ai0) <= 0) { b3 = null; } else if (b3 >= null) { if (b3 + i1 <= this.G90.capacity()) { ZH zH1; this(this.G90, b3, i1); zH = zH1; } else { throw new RuntimeException(); }  } else { throw new RuntimeException(); }  Texture texture = null; if (zH != null) { pe0 pe02; this(zH); (new Texture()).setFilter(cu0.Fh, cu0.Fh); (new Texture()).setWrap(A00.IB0, A00.IB0); this(texture); zH.dispose(); pe01 = pe02; }  this.RW[lPT9.nV][j][b2] = pe01; b2 = (byte)(b2 + 1); }  b1++; }  j = (byte)(j + 1); }
/* 14 */        Vp0[] arrayOfVp0; byte b; for (j = (arrayOfVp0 = Vp0.Jo).length, b = 0; b < j; )
/* 15 */       { qw0 qw0; (qw0 = (arrayOfVp0[b]).aU)
/* 16 */           .getClass();
/*    */         
/* 18 */         for (Iterator iterator = (new iL(qw0)).iterator(); ((DA0)iterator).hasNext();) { for (wc = (wc)((Ke)iterator).q00(), k = (arrayOfLPT9 = lPT9.AUX).length, b1 = 0; b1 < k; ) { (wc.ml(arrayOfLPT9[b1])).UW = this; b1++; }  }  b++; }  qU
/*    */         
/* 20 */         .info(B40.df("Loaded addons in ").append(System.currentTimeMillis() - l).append(" milliseconds").toString()); return true; } catch (Exception exception) { if (km.VH.NZ(this)) return true;  qU.error("Error loading addons.pak", this); return false; }  } public final void hI0(wc paramwc, lPT9 paramlPT9, boolean paramBoolean) { if (paramBoolean) { k00(paramwc, paramlPT9, 0, null, paramBoolean); return; }  A1.L7.ac0(new Py(this, paramwc, paramlPT9, paramBoolean), 0L); } public final void k00(wc paramwc, lPT9 paramlPT9, int paramInt, eM parameM, boolean paramBoolean) { try { Vp0 vp0 = paramwc.Hl0; int i = paramwc.Mv.length; if (paramInt == 0) this();  for (byte b = 0; b < i; ) { X9 x9; byte b1; for (int j = (x9 = paramwc.Mv[b][paramlPT9.nV]).ls.length; b1 < j; ) { byte b2 = 0; Gh0 gh0; while (b2 < (gh0 = x9.ls[b1]).sc) { wa wa; if ((wa = gh0.jA0[b2]) != null) { byte b3; short s = (short)((b + 1) * 100 + wa.M10); if (paramInt == 0 && !parameM.uW(Short.valueOf(s))) { Short short_ = Short.valueOf(s); parameM.Ed0(short_, new ZH[j]); }  if (paramInt == 1) { if (!wa.Hg0) { pe0 pe01 = null; ZH zH; if ((zH = ((ZH[])parameM.MF(Short.valueOf(s), null))[b1]) != null) { Texture texture; this(zH); this(texture); }  b3 = wa.M10; Gh0 gh01; if ((gh01 = x9.ls[b1]).Ru0 == Gh0.h40) gh01.Ru0 = new pe0[9];  gh01.Ru0[b3] = pe01; if (vp0 != Vp0.MP && zH != null) zH.dispose();  } else { s = b3.Zi0; int k = b3.Ux0, m = b3.wT; pe0 pe01; if ((pe01 = x9.QB0(b3.M10, s)) != null) { pe0 pe02; b3 = b3.M10; int n = -k; k = -m; m = pe01.H0;
/* 21 */                     int i1 = pe01.Vn0;
/* 22 */                     this(pe01, n, k, m, i1); Gh0 gh01;
/* 23 */                     if ((gh01 = x9.ls[b1])
/* 24 */                       .Ru0 == 
/* 25 */                       Gh0.h40) gh01.Ru0 = new pe0[9];  gh01.Ru0[b3] = pe02; }  }  } else { BitSet bitSet; byte b4; if (b3
/* 26 */                   .Hg0) { Gh0 gh01; s = b3.Zi0; int k = b3.Ux0, m = b3.wT; if (vp0 == Vp0.MP) { ZH zH; byte b5 = b3.M10; Gh0 gh02, arrayOfGh0[];
/* 27 */                     if ((arrayOfGh0 = x9.ls) == null || s < 0 || s >= arrayOfGh0.length || (gh02 = arrayOfGh0[s]) == null) { gh02 = null; }
/*    */                     else
/* 29 */                     { zH = gh02.JX[b5]; }  if (zH != null)
/*    */                     { ZH zH1;
/* 31 */                       int n = zH.Con.ju;
/* 32 */                       int i1 = zH.Con.Og0;
/* 33 */                       Uc uc = zH.TU(); this(n, i1, uc); for (byte b6 = 0; b6 < n; ) { int i2; if ((i2 = k + b6) >= 0 && i2 < n) for (byte b7 = 0; b7 < i1; ) { int i3; if ((i3 = m + b7) >= 0 && i3 < i1)
/* 34 */                             { int i4 = zH.Con.Fl(b6, b7);
/* 35 */                               zH1.Con.YO(i2, i3, i4); }  b7++; }   b6++; }
/* 36 */                        b3 = b3.M10;
/* 37 */                       if ((gh01 = x9.ls[b1])
/* 38 */                         .JX == 
/* 39 */                         Gh0.Ip0) gh01.JX = new ZH[9];  gh01.JX[b3] = zH1; }  } else if (vp0 == 
/* 40 */                     Vp0.bG)
/* 41 */                   { BitSet[] arrayOfBitSet; if ((arrayOfBitSet = x9.N5) == null) { arrayOfBitSet = null; } else { bitSet = arrayOfBitSet[gh01]; }  if (bitSet != null) { BitSet bitSet1; b4 = 57; byte b5 = 56;
/* 42 */                       this(3192); for (byte b6 = 0; b6 < b4; ) { for (byte b7 = 0; b7 < b5; ) { int n; int i1; if ((n = k + b6) < 0 || n >= b4 || (i1 = m + b7) < 0 || i1 >= b5) { bitSet1.set(b7 * b4 + b6, true); } else { n = i1 * b4 + n; bitSet1.set(n, bitSet.get(b7 * b4 + b6)); }  b7++; }  b6++; }  if (x9
/* 43 */                         .N5 == null) x9.N5 = new BitSet[x9.ls.length];  x9.N5[b1] = bitSet1; }  }  }
/* 44 */                 else { byte b5; ZH zH; int k = ((wa)bitSet).wq; int m; if ((m = ((wa)bitSet).Ai0) <= 0) { b5 = null; } else if (b5 >= null) { if (b5 + m <= this
/* 45 */                       .G90.capacity()) { ZH zH1; this(this.G90, b5, m); zH = zH1;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */                       
/*    */                        }
/*    */                     
/*    */                     else
/*    */                     
/*    */                     { 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */                       
/* 62 */                       throw new RuntimeException(); }  } else { throw new RuntimeException(); }  if (zH != null) { BitSet bitSet1; zH.r1(y1.Zj); m = zH.Con.ju; int n = zH.Con.Og0; this(m * n); for (byte b6 = 0; b6 < m; ) { for (byte b7 = 0; b7 < n; ) { if (zH.Con.Fl(b6, b7) == -15428609) { boolean bool = false; zH.Con.YO(b6, b7, bool); if (vp0 == Vp0.bG) bitSet1.set(b7 * m + b6, true);  }  b7++; }  b6++; }  if (vp0 == Vp0.bG && ((wa)bitSet).M10 == 0) { if (x9.N5 == null) x9.N5 = new BitSet[x9.ls.length];  x9.N5[b1] = bitSet1; }  if (vp0 == Vp0.MP) { byte b7 = ((wa)bitSet).M10; Gh0 gh01; if ((gh01 = x9.ls[b1]).JX == Gh0.Ip0) gh01.JX = new ZH[9];  gh01.JX[b7] = zH; }  }  ((ZH[])parameM.MF(Short.valueOf(b4), null))[b1] = zH; }  }  }  b2 = (byte)(b2 + 1); }  b1 = (byte)(b1 + 1); }  if (paramInt != 0) x9
/* 63 */             .vi = true;  b++; }  } catch (Exception exception) {} if (paramInt == 0) if (paramBoolean) { super
/* 64 */           .k00(paramwc, paramlPT9, 1, parameM, paramBoolean); } else { UB0.Kg0.fN(new Xg0((Hk)this, paramwc, paramlPT9, parameM, paramBoolean)); }   } public final uT Y0(K70 paramK70, fo0 paramfo0, Jo paramJo, uT paramuT, uT[][] paramArrayOfuT, byte paramByte, Matrix4 paramMatrix4, boolean paramBoolean1, boolean paramBoolean2) { uT uT1; byte b1; boolean bool1, bool2; byte b; this.OC = paramArrayOfuT; nl nl; if ((nl = paramJo.pm.Mv) != nl.Qt && nl != nl.rm) if (paramJo.UG() || paramJo.VO()) { paramByte = (byte)(paramByte + 27); } else if (paramJo.XC()) { paramByte = (byte)(paramByte + 18); }   Vp0 vp01; short s1 = paramJo.lB0.JM(vp01 = Vp0.CR); Vp0 vp02; short s2 = paramJo.lB0.JM(vp02 = Vp0.c6); if (paramJo.HW.g50 == 1 && vp01.O5(s1)) { bool1 = true; } else { bool1 = false; }  if (paramJo.HW.g50 == 1 && vp02.O5(s2)) { bool2 = true; } else { bool2 = false; }  if (s2 != 2 && s2 != 12 && s2 != 17) { b = 0; } else { b = 1; }  if (b && paramJo.XC() && !paramJo.UG() && !paramJo.VO()) { switch (paramByte) { default: b = 20; break;case 19: case 23: case 24: b = 19; break;case 18: case 21: case 22: b = 18; break; }  if (ih0.o7(s2) && !paramBoolean2) { paramJo.lB0.F00(vp02); fx(paramK70, paramfo0, paramJo, vp02, s2, b, paramMatrix4, paramBoolean1, false); }  } else { b = paramByte; }  if (s1 == 68 || s1 == 73) { paramJo.lB0.F00(vp02); Bq(paramK70, paramfo0, paramJo, vp01, s1, b, paramMatrix4, paramBoolean1, false); }  if (paramBoolean2) { b1 = 1; } else { b1 = 2; }  for (byte b2 = 0; b2 < b1; ) { boolean bool3, bool4; if (b2 == 0) { bool3 = true; } else { bool3 = false; }  if (b2 == 1 || b1 == 1) { byte b3; lPT9 lPT9 = lPT9.U4; if (paramBoolean2) { b3 = 0; } else { b3 = paramJo.lB0.Xu.goto; }  pe0 pe01; if ((pe01 = zK0(lPT9, b3, b)) != null) { if (paramuT == null) { uT uT2; int i = pe01.H0; int j = pe01.Vn0; this(i, j, pe01, true); uT1 = uT2; }  uT1.lM(Xi.WB); uT1.sA0(pe01, paramBoolean1); if (paramBoolean2) { if ((uT1.G10()).a > 0.5F) uT1.Bp(0.0F, 0.0F, 0.0F, 0.33F);  } else if ((uT1.G10()).a < 1.0F) { uT1.Bp(1.0F, 1.0F, 1.0F, 1.0F); }  uT1.Jb.getClass(); uT1.Jb.Qw(paramMatrix4.Z0); paramK70.q10(uT1, paramfo0); }  if (paramBoolean2) return uT1;  }  Vp0 vp03 = Vp0.Rj; UX uX2 = paramJo.lB0.F00(vp03); EB(paramK70, paramfo0, paramJo, vp03, b, uX2, paramMatrix4, paramBoolean1, bool3); if (!bool2 && !ih0.o7(s2)) { vp03 = Vp0.c6; uX2 = paramJo.lB0.F00(vp03); EB(paramK70, paramfo0, paramJo, vp03, paramByte, uX2, paramMatrix4, paramBoolean1, bool3); }  if ((vp03 = Vp0.Sz0).Jz0(paramJo.lB0.JM(vp03))) { Vp0 vp0 = Vp0.M9; UX uX = paramJo.lB0.F00(vp0); EB(paramK70, paramfo0, paramJo, vp0, b, uX, paramMatrix4, paramBoolean1, bool3); }  if (vp03.G6(paramJo.lB0.JM(vp03))) { Vp0 vp0 = Vp0.sg0; UX uX = paramJo.lB0.F00(vp0); EB(paramK70, paramfo0, paramJo, vp0, b, uX, paramMatrix4, paramBoolean1, bool3); }  Vp0 vp04; if (paramJo.lB0.JM(vp04 = Vp0.rK) != 1) { bool4 = true; } else { bool4 = false; }  if (!bool4) { UX uX = paramJo.lB0.F00(vp04); EB(paramK70, paramfo0, paramJo, vp04, b, uX, paramMatrix4, paramBoolean1, bool3); }  UX uX1 = paramJo.lB0.F00(vp03); EB(paramK70, paramfo0, paramJo, vp03, b, uX1, paramMatrix4, paramBoolean1, bool3); if (!bool1) { vp03 = Vp0.CR; uX1 = paramJo.lB0.F00(vp03); EB(paramK70, paramfo0, paramJo, vp03, b, uX1, paramMatrix4, paramBoolean1, bool3); }  vp03 = Vp0.Pa0; uX1 = paramJo.lB0.F00(vp03); EB(paramK70, paramfo0, paramJo, vp03, b, uX1, paramMatrix4, paramBoolean1, bool3); vp03 = Vp0.K7; uX1 = paramJo.lB0.F00(vp03); EB(paramK70, paramfo0, paramJo, vp03, b, uX1, paramMatrix4, paramBoolean1, bool3); if (paramJo.lB0.JM(vp03 = Vp0.bG) != -1) { byte[] arrayOfByte; short s3 = paramJo.lB0.JM(Vp0.MP); short s4 = paramJo.lB0.JM(vp03); vd vd = paramJo.lB0.ew0[vp03.gw0]; Arrays.fill((Object[])dA, (Object)null); if (bool3) { arrayOfByte = Ys0; } else { arrayOfByte = bl; }  Vp0[] arrayOfVp0; for (byte b3 = 0; b3 < (arrayOfVp0 = Vm).length; ) { Vp0 vp0; byte b4; for (vp0 = arrayOfVp0[b3], b4 = 0; b4 < arrayOfByte.length; ) { byte b5 = arrayOfByte[b4]; pe0[][] arrayOfPe01; if ((arrayOfPe01 = dA)[b4] == null) arrayOfPe01[b4] = WJ(lPT9.U4, s3, s4, b, b5, false, vd);  pe0 pe01, arrayOfPe0[]; if ((arrayOfPe0 = arrayOfPe01[b4]) != null && (pe01 = arrayOfPe0[b3]) != null) { short s; boolean bool; UX uX; if (vp0 == Vp0.MP) { s = s3; } else { s = s4; }  if (b5 == 5 || b5 == 2 || b5 == 6) { bool = true; } else { bool = false; }  if (bool) { uX = null; } else { uX = paramJo.lB0.F00(vp0); }
/* 65 */                kd(b5, paramK70, paramfo0, pe01, vp0, s, uX, paramMatrix4, paramBoolean1, 1.0F); }  b4++; }  b3++; }  }
/* 66 */       else { vp03 = Vp0.MP;
/*    */         
/* 68 */         uX1 = paramJo.lB0.F00(vp03); EB(paramK70, paramfo0, paramJo, vp03, b, uX1, paramMatrix4, paramBoolean1, bool3); }  if (bool4) { vp03 = Vp0.rK;
/*    */         
/* 70 */         uX1 = paramJo.lB0.F00(vp03); EB(paramK70, paramfo0, paramJo, vp03, b, uX1, paramMatrix4, paramBoolean1, bool3); }  if (bool1) { vp03 = Vp0.CR;
/*    */         
/* 72 */         uX1 = paramJo.lB0.F00(vp03); EB(paramK70, paramfo0, paramJo, vp03, b, uX1, paramMatrix4, paramBoolean1, bool3); }  if (bool2 && !ih0.o7(s2)) { vp03 = Vp0.c6;
/*    */         
/* 74 */         uX1 = paramJo.lB0.F00(vp03); EB(paramK70, paramfo0, paramJo, vp03, paramByte, uX1, paramMatrix4, paramBoolean1, bool3); }  if (ih0.o7(s2) && paramJo.XC()) { Vp0 vp0 = Vp0.c6; paramJo
/* 75 */           .lB0
/* 76 */           .F00(vp0); fx(paramK70, paramfo0, paramJo, vp0, s2, b, paramMatrix4, paramBoolean1, true); }  b2++; }  if (s1 == 68 || s1 == 73) { Vp0 vp0 = Vp0.CR; paramJo
/* 77 */         .lB0
/* 78 */         .F00(Vp0.c6); Bq(paramK70, paramfo0, paramJo, this, s1, b, paramMatrix4, paramBoolean1, true); }  return uT1; }
/*    */ 
/*    */   
/*    */   public final pe0 zK0(lPT9 paramlPT9, int paramInt1, int paramInt2) {
/*    */     if (paramInt1 < 0 || paramInt1 >= (this.RW[paramlPT9.nV]).length)
/*    */       paramInt1 = 0; 
/*    */     pe0[] arrayOfPe0;
/*    */     if (paramInt2 < 0 || paramInt2 >= (arrayOfPe0 = this.RW[paramlPT9.nV][paramInt1]).length)
/*    */       return null; 
/*    */     return this[paramInt2];
/*    */   }
/*    */   
/*    */   public final pe0 hI(lPT9 paramlPT9, Vp0 paramVp0, short paramShort, byte paramByte1, byte paramByte2, boolean paramBoolean, vd paramvd) {
/*    */     // Byte code:
/*    */     //   0: iload_3
/*    */     //   1: iconst_m1
/*    */     //   2: if_icmpne -> 7
/*    */     //   5: aconst_null
/*    */     //   6: areturn
/*    */     //   7: aload_2
/*    */     //   8: iload_3
/*    */     //   9: invokevirtual fM0 : (S)Lf/wc;
/*    */     //   12: dup
/*    */     //   13: astore_2
/*    */     //   14: ifnonnull -> 19
/*    */     //   17: aconst_null
/*    */     //   18: areturn
/*    */     //   19: aload #7
/*    */     //   21: ifnull -> 38
/*    */     //   24: aload #7
/*    */     //   26: getfield Ul : S
/*    */     //   29: iload_3
/*    */     //   30: if_icmpne -> 38
/*    */     //   33: iconst_1
/*    */     //   34: istore_3
/*    */     //   35: goto -> 40
/*    */     //   38: iconst_0
/*    */     //   39: istore_3
/*    */     //   40: iload_3
/*    */     //   41: ifeq -> 58
/*    */     //   44: aload #7
/*    */     //   46: getfield iD0 : I
/*    */     //   49: i2f
/*    */     //   50: ldc_w 1000.0
/*    */     //   53: fdiv
/*    */     //   54: fstore_0
/*    */     //   55: goto -> 63
/*    */     //   58: aload_0
/*    */     //   59: getfield lE0 : F
/*    */     //   62: fstore_0
/*    */     //   63: iload_3
/*    */     //   64: ifeq -> 82
/*    */     //   67: aload_2
/*    */     //   68: fload_0
/*    */     //   69: invokevirtual th0 : (F)Z
/*    */     //   72: ifeq -> 82
/*    */     //   75: aload #7
/*    */     //   77: iconst_m1
/*    */     //   78: fconst_0
/*    */     //   79: invokevirtual f3 : (SF)V
/*    */     //   82: iload #6
/*    */     //   84: aload_2
/*    */     //   85: aload_1
/*    */     //   86: iload_3
/*    */     //   87: fload_0
/*    */     //   88: invokevirtual Ra0 : (Lf/lPT9;ZF)Lf/X9;
/*    */     //   91: astore_0
/*    */     //   92: ifeq -> 99
/*    */     //   95: aload_0
/*    */     //   96: invokevirtual st0 : ()V
/*    */     //   99: aload_0
/*    */     //   100: iload #5
/*    */     //   102: iload #4
/*    */     //   104: invokevirtual QB0 : (BB)Lf/pe0;
/*    */     //   107: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 26
/*    */     //   #2	-> 46
/*    */     //   #3	-> 59
/*    */   }
/*    */   
/*    */   public final pe0[] WJ(lPT9 paramlPT9, short paramShort1, short paramShort2, byte paramByte1, byte paramByte2, boolean paramBoolean, vd paramvd) {
/*    */     if (paramShort2 == -1 && paramShort1 == -1)
/*    */       return null; 
/*    */     Vp0 vp01;
/*    */     wc wc2;
/*    */     if ((wc2 = (vp01 = Vp0.bG).fM0(paramShort2)) == null)
/*    */       return null; 
/*    */     byte b1;
/*    */     short arrayOfShort[], arrayOfShort1[][];
/*    */     if ((b1 = (byte)paramlPT9.nV) < (arrayOfShort1 = wc2.Am0).length && (arrayOfShort = arrayOfShort1[b1]).length != 0 && Arrays.binarySearch(arrayOfShort, paramShort1) >= 0)
/*    */       paramShort1 = 0; 
/*    */     Vp0 vp02;
/*    */     wc wc3;
/*    */     if ((wc3 = (vp02 = Vp0.MP).fM0(paramShort1)) == null)
/*    */       return null; 
/*    */     if (paramvd != null && paramvd.Ul == paramShort2) {
/*    */       m = 1;
/*    */     } else {
/*    */       m = 0;
/*    */     } 
/*    */     if (m) {
/*    */       f = paramvd.iD0 / 1000.0F;
/*    */     } else {
/*    */       f = this.lE0;
/*    */     } 
/*    */     if (m && wc2.th0(f))
/*    */       paramvd.f3((short)-1, 0.0F); 
/*    */     Ua ua;
/*    */     if ((ua = wc2.tX[m]) == null) {
/*    */       b2 = 0;
/*    */     } else {
/*    */       b2 = ((Byte)b2.kg0.Hf(f)).byteValue();
/*    */     } 
/*    */     int n = (paramShort1 & 0x7F) << 25 | (paramShort2 & 0x3FF) << 15 | (paramByte2 & 0xF) << 11 | (paramByte1 & 0x3F) << 5 | b2 & 0x1F;
/*    */     if (this.hG0[paramlPT9.nV].return(n))
/*    */       return (pe0[])this.hG0[paramlPT9.nV].Z6(n); 
/*    */     if (paramBoolean) {
/*    */       wc2.ml(paramlPT9).st0();
/*    */       wc3.ml(paramlPT9).st0();
/*    */     } 
/*    */     pe0 pe03 = hI(paramlPT9, vp02, paramShort1, paramByte1, paramByte2, paramBoolean, null), pe02 = hI(paramlPT9, vp01, paramShort2, paramByte1, paramByte2, paramBoolean, paramvd);
/*    */     if (!(wc2.Ra0(paramlPT9, m, f)).vi || !(wc3.Ra0(paramlPT9, false, f)).vi)
/*    */       return new pe0[] { pe03, pe02 }; 
/*    */     if (pe03 == null) {
/*    */       arrayOfPe02[0] = pe03;
/*    */       arrayOfPe02[1] = pe02;
/*    */       this.hG0[paramlPT9.nV].A3(n, arrayOfPe02);
/*    */       return arrayOfPe02 = new pe0[2];
/*    */     } 
/*    */     int j;
/*    */     BitSet[] arrayOfBitSet;
/*    */     if ((arrayOfBitSet = (wc2.Mv[b2][j = paramlPT9.nV]).N5) == null) {
/*    */       arrayOfBitSet = null;
/*    */     } else {
/*    */       bitSet = arrayOfBitSet[paramByte1];
/*    */     } 
/*    */     if (bitSet == null) {
/*    */       arrayOfPe01[0] = pe03;
/*    */       arrayOfPe01[1] = pe02;
/*    */       this.hG0[j].A3(n, arrayOfPe01);
/*    */       return arrayOfPe01 = new pe0[2];
/*    */     } 
/*    */     Gh0 gh0;
/*    */     wc wc1;
/*    */     Gh0[] arrayOfGh0;
/*    */     if (arrayOfPe02 == -1 || (wc1 = vp02.fM0(arrayOfPe02)) == null || (arrayOfGh0 = (wc1.ml((lPT9)arrayOfPe01)).ls) == null || paramByte1 < 0 || paramByte1 >= arrayOfGh0.length || (gh0 = arrayOfGh0[paramByte1]) == null) {
/*    */       zH1 = null;
/*    */     } else {
/*    */       zH1 = gh0.JX[zH1];
/*    */     } 
/*    */     if (zH1 == null) {
/*    */       System.out.println("COULD NOT FIND HAIR2 = " + arrayOfPe02 + " frame_id = " + paramByte1);
/*    */       return null;
/*    */     } 
/*    */     pe0[] arrayOfPe02 = new pe0[2];
/*    */     paramByte1 = 0;
/*    */     int i = zH1.Con.ju;
/*    */     int k = zH1.Con.Og0;
/*    */     this(i, k, zH1.TU());
/*    */     pe0 pe01, arrayOfPe01[];
/*    */     ZH zH1;
/*    */     BitSet bitSet;
/*    */     ZH zH2;
/*    */     int m;
/*    */     float f;
/*    */     byte b2;
/*    */     (new ZH()).r1(y1.hM);
/*    */     for (byte b = 0; b < i; ) {
/*    */       for (byte b3 = 0; b3 < k; ) {
/*    */         if (bitSet.get(b3 * i + b)) {
/*    */           m = 0;
/*    */         } else {
/*    */           m = zH1.Con.Fl(b, b3);
/*    */         } 
/*    */         zH2.Con.YO(b, b3, m);
/*    */         b3++;
/*    */       } 
/*    */       b++;
/*    */     } 
/*    */     this(new Texture(zH2));
/*    */     zH2.dispose();
/*    */     arrayOfPe02[paramByte1] = this;
/*    */     arrayOfPe02[1] = pe02;
/*    */     this.hG0[((lPT9)arrayOfPe01).nV].A3(n, arrayOfPe02);
/*    */     return arrayOfPe02;
/*    */   }
/*    */   
/*    */   public final C30[] zZ(OE0 paramOE0) {
/*    */     C30[] arrayOfC30;
/*    */     byte b;
/*    */     for (arrayOfC30 = new C30[5], b = 0; b < 5; ) {
/*    */       bh0 bh0;
/*    */       ArrayList<C30> arrayList;
/*    */       boolean bool = Vp0.CR.O5(paramOE0.JM(Vp0.CR));
/*    */       this();
/*    */       for (byte b2 = 0; b2 < 3; ) {
/*    */         boolean bool1;
/*    */         pe0 pe01;
/*    */         if (b2 == 1 && (pe01 = zK0(lPT9.fh0, paramOE0.Xu.goto, b)) != null) {
/*    */           C30 c30;
/*    */           this(pe01);
/*    */           arrayList.add(c30);
/*    */         } 
/*    */         Vp0 vp01;
/*    */         if ((vp01 = Vp0.Sz0).Jz0(paramOE0.JM(vp01)))
/*    */           fS(Vp0.M9, b, paramOE0, arrayList, b2); 
/*    */         Vp0 vp02;
/*    */         if (paramOE0.JM(vp02 = Vp0.rK) != 1) {
/*    */           bool1 = true;
/*    */         } else {
/*    */           bool1 = false;
/*    */         } 
/*    */         if (!bool1)
/*    */           fS(vp02, b, paramOE0, arrayList, b2); 
/*    */         fS(vp01, b, paramOE0, arrayList, b2);
/*    */         if (!bool)
/*    */           fS(Vp0.CR, b, paramOE0, arrayList, b2); 
/*    */         fS(Vp0.Pa0, b, paramOE0, arrayList, b2);
/*    */         fS(Vp0.K7, b, paramOE0, arrayList, b2);
/*    */         if (paramOE0.JM(vp01 = Vp0.bG) != -1) {
/*    */           byte b3;
/*    */           for (short s1 = paramOE0.JM(Vp0.MP), s2 = paramOE0.JM(vp01); b3 < 2; ) {
/*    */             Vp0 vp0;
/*    */             if (b3 == 0) {
/*    */               vp0 = Vp0.MP;
/*    */             } else {
/*    */               vp0 = Vp0.bG;
/*    */             } 
/*    */             byte b4;
/*    */             for (b4 = 0; b4 < 3; ) {
/*    */               byte b5 = c70.Pj0(b2, b4);
/*    */               pe0[] arrayOfPe0;
/*    */               if (b4 != 1 && (arrayOfPe0 = WJ(lPT9.fh0, s1, s2, b, b5, true, null)) != null && arrayOfPe0[b3] != null) {
/*    */                 C30 c30;
/*    */                 this(arrayOfPe0[b3]);
/*    */                 UX uX;
/*    */                 if (b4 == 0 && (uX = paramOE0.F00(vp0)) != null) {
/*    */                   short s;
/*    */                   if (vp0 == Vp0.MP) {
/*    */                     s = s1;
/*    */                   } else {
/*    */                     s = s2;
/*    */                   } 
/*    */                   if (vp0.Ko(s)) {
/*    */                     c30.Mm0 = uX.S1;
/*    */                     c30.go0();
/*    */                     c30.bE0 = uX.PH0 * 2;
/*    */                     c30.go0();
/*    */                   } 
/*    */                 } 
/*    */                 arrayList.add(c30);
/*    */               } 
/*    */               b4 = (byte)(b4 + 1);
/*    */             } 
/*    */             b3 = (byte)(b3 + 1);
/*    */           } 
/*    */         } else {
/*    */           wc wc;
/*    */           X9 x9;
/*    */           short s;
/*    */           if ((s = paramOE0.JM(vp01 = Vp0.MP)) != -1 && (wc = vp01.fM0(s)) != null && (x9 = wc.ml(lPT9.fh0)) != null) {
/*    */             x9.st0();
/*    */             byte b3;
/*    */             for (b3 = 0; b3 < 3; ) {
/*    */               pe0 pe02;
/*    */               if (b3 != 1 && (pe02 = x9.QB0(c70.Pj0(b2, b3), b)) != null) {
/*    */                 C30 c30;
/*    */                 this(pe02);
/*    */                 Vp0 vp0;
/*    */                 UX uX;
/*    */                 if (b3 == 0 && (uX = paramOE0.F00(vp0 = Vp0.MP)) != null && vp0.Ko(s)) {
/*    */                   c30.Mm0 = uX.S1;
/*    */                   c30.go0();
/*    */                   c30.bE0 = uX.PH0 * 2;
/*    */                   c30.go0();
/*    */                 } 
/*    */                 arrayList.add(c30);
/*    */               } 
/*    */               b3 = (byte)(b3 + 1);
/*    */             } 
/*    */           } 
/*    */         } 
/*    */         if (bool1)
/*    */           fS(Vp0.rK, b, paramOE0, arrayList, b2); 
/*    */         if (bool)
/*    */           fS(Vp0.CR, b, paramOE0, arrayList, b2); 
/*    */         b2++;
/*    */       } 
/*    */       this(arrayList.<C30>toArray(new C30[0]));
/*    */       arrayOfC30[b] = bh0;
/*    */       byte b1 = (byte)(b + 1);
/*    */     } 
/*    */     return arrayOfC30;
/*    */   }
/*    */   
/*    */   public final uT qi0(K70 paramK70, fo0 paramfo0, Jo paramJo, uT paramuT, uT[][] paramArrayOfuT, byte paramByte, eo parameo1, eo parameo2, eo parameo3, boolean paramBoolean1, boolean paramBoolean2) {
/*    */     eo3.getClass();
/*    */     float f2 = parameo2.x, f6 = parameo2.y, f7 = parameo2.z;
/*    */     f2 = parameo1.x;
/*    */     f6 = parameo1.y;
/*    */     f7 = parameo1.z;
/*    */     eo eo3;
/*    */     (eo3 = nH).TG0(f2, f6, f7).uD(f2, f6, f7).WC0();
/*    */     eo1.getClass();
/*    */     float f4 = parameo3.x;
/*    */     f6 = parameo3.y;
/*    */     f7 = parameo3.z;
/*    */     eo eo1;
/*    */     (eo1 = lK).TG0(f4, f6, f7).Nz(eo3).WC0();
/*    */     eo2.getClass();
/*    */     f6 = eo3.x;
/*    */     f7 = eo3.y;
/*    */     float f8 = eo3.z;
/*    */     eo eo2;
/*    */     (eo2 = Iy).TG0(f6, f7, f8).Nz(eo1).WC0();
/*    */     float f1 = eo1.x, f3 = eo2.x, f5 = eo3.x;
/*    */     f7 = eo1.y;
/*    */     f8 = eo2.y;
/*    */     float f9 = eo3.y, f10 = eo1.z, f11 = eo2.z, f12 = eo3.z;
/*    */     TG0 tG0;
/*    */     (tG0 = X5).hE0(false, f1, f3, f5, f7, f8, f9, f10, f11, f12);
/*    */     f1 = 0.0F;
/*    */     G5 g5;
/*    */     xr0 xr0;
/*    */     if ((g5 = paramJo.HW).FB == 3 && (xr0 = g5.CJ0()) != null && xr0.Y00()) {
/*    */       f1 = xr0.Kn();
/*    */       if (nx0.JC0(90.0F, f1)) {
/*    */         parameo1.uD(0.2F, 0.25F, -0.05F);
/*    */       } else if (nx0.JC0(270.0F, f1)) {
/*    */         parameo1.uD(-0.15F, 0.2F, 0.0F);
/*    */       } 
/*    */     } 
/*    */     Matrix4 matrix4;
/*    */     (matrix4 = Ww0).mT(parameo1, tG0, A1);
/*    */     if (!nx0.JC0(f1, 0.0F))
/*    */       matrix4.N8(eo.Z, f1); 
/*    */     return Y0(paramK70, paramfo0, paramJo, paramuT, paramArrayOfuT, paramByte, matrix4, paramBoolean1, paramBoolean2);
/*    */   }
/*    */   
/*    */   public final void Vw0(tH paramtH, Jo paramJo, Vp0 paramVp0, byte paramByte, float paramFloat1, float paramFloat2, boolean paramBoolean1, boolean paramBoolean2) {
/*    */     byte[] arrayOfByte;
/*    */     short s;
/*    */     if ((s = paramJo.lB0.JM(paramVp0)) == -1)
/*    */       return; 
/*    */     UX uX = paramJo.lB0.F00(paramVp0);
/*    */     vd vd = paramJo.lB0.ew0[paramVp0.gw0];
/*    */     if (paramBoolean2) {
/*    */       arrayOfByte = Ys0;
/*    */     } else {
/*    */       arrayOfByte = bl;
/*    */     } 
/*    */     int i;
/*    */     byte b;
/*    */     for (i = arrayOfByte.length, b = 0; b < i; ) {
/*    */       byte b1 = arrayOfByte[b];
/*    */       pe0 pe01;
/*    */       if ((pe01 = hI(lPT9.U4, paramVp0, s, paramByte, b1, false, vd)) != null) {
/*    */         boolean bool;
/*    */         UX uX1;
/*    */         if (b1 == 5 || b1 == 2 || b1 == 6) {
/*    */           bool = true;
/*    */         } else {
/*    */           bool = false;
/*    */         } 
/*    */         if (!bool) {
/*    */           uX1 = uX;
/*    */         } else {
/*    */           uX1 = null;
/*    */         } 
/*    */         if (b1 != 1 && b1 != 4) {
/*    */           b1 = 1;
/*    */         } else {
/*    */           b1 = 0;
/*    */         } 
/*    */         QH(paramtH, pe01, paramVp0, s, uX1, paramFloat1, paramFloat2, paramBoolean1, b1, 1.0F);
/*    */       } 
/*    */       b++;
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void vo(tH paramtH, Jo paramJo, Vp0 paramVp0, short paramShort, byte paramByte, float paramFloat1, float paramFloat2, boolean paramBoolean1, boolean paramBoolean2) {
/*    */     byte b;
/*    */     boolean bool = true;
/*    */     switch (paramByte) {
/*    */       case 18:
/*    */       case 20:
/*    */       case 21:
/*    */       case 22:
/*    */       case 25:
/*    */       case 26:
/*    */         bool = false;
/*    */         break;
/*    */     } 
/*    */     d7 d7;
/*    */     long l1 = zm0.u20 - (d7 = paramJo.pm).yE;
/*    */     long l2 = zm0.u20 - d7.HQ;
/*    */     float f1 = d7.tD0 / 1000.0F * 1000.0F + 250.0F;
/*    */     short s = 0;
/*    */     if (paramShort != 17) {
/*    */       s = ih0.com5[(int)(l1 / 200L % 4L)];
/*    */     } else if (l1 < 200L) {
/*    */       paramShort = 21;
/*    */       s = 27;
/*    */     } else if (l2 < 400L) {
/*    */       switch ((int)((l1 - 200L) / 200L % 4L)) {
/*    */         case 2:
/*    */           paramShort = 20;
/*    */           s = 25;
/*    */           break;
/*    */         case 1:
/*    */         case 3:
/*    */           paramShort = 19;
/*    */           s = 24;
/*    */           break;
/*    */         case 0:
/*    */           paramShort = 18;
/*    */           s = 23;
/*    */           break;
/*    */       } 
/*    */     } else if (l2 < 600L) {
/*    */       paramShort = 22;
/*    */       s = 26;
/*    */     } 
/*    */     UX uX = UX.km;
/*    */     float f2;
/*    */     int i;
/*    */     pe0 pe02;
/*    */     if ((i = (f2 = (float)l2) cmp f1) < 0 && !paramBoolean2 && paramBoolean2 == bool && (pe02 = hI(lPT9.U4, paramVp0, s, paramByte, (byte)0, false, null)) != null) {
/*    */       float f = Math.min(1.0F, (f1 - f2) / 250.0F);
/*    */       QH(paramtH, pe02, paramVp0, s, uX, paramFloat1, paramFloat2, paramBoolean1, false, f);
/*    */     } 
/*    */     lPT9 lPT9 = lPT9.U4;
/*    */     if (paramBoolean2) {
/*    */       b = 0;
/*    */     } else {
/*    */       b = 2;
/*    */     } 
/*    */     pe0 pe03;
/*    */     if ((pe03 = hI(lPT9, paramVp0, paramShort, paramByte, b, false, null)) != null)
/*    */       QH(paramtH, pe03, paramVp0, paramShort, uX, paramFloat1, paramFloat2, paramBoolean1, true, 1.0F); 
/*    */     if (paramBoolean2 && (pe03 = hI(lPT9, paramVp0, paramShort, paramByte, (byte)1, false, null)) != null)
/*    */       QH(paramtH, pe03, paramVp0, paramShort, uX, paramFloat1, paramFloat2, paramBoolean1, false, 1.0F); 
/*    */     pe0 pe01;
/*    */     if (i < 0 && paramBoolean2 && paramBoolean2 == bool && (pe01 = hI(lPT9, paramVp0, s, paramByte, (byte)0, false, null)) != null) {
/*    */       float f = Math.min(1.0F, (f1 - f2) / 250.0F);
/*    */       QH(paramtH, this, paramVp0, s, uX, paramFloat1, paramFloat2, paramBoolean1, false, f);
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void un(tH paramtH, Jo paramJo, Vp0 paramVp0, short paramShort, byte paramByte, float paramFloat1, float paramFloat2, boolean paramBoolean1, boolean paramBoolean2) {
/*    */     boolean bool = false;
/*    */     switch (paramByte) {
/*    */       case 1:
/*    */       case 5:
/*    */       case 6:
/*    */       case 12:
/*    */       case 13:
/*    */       case 14:
/*    */       case 19:
/*    */       case 23:
/*    */       case 24:
/*    */       case 28:
/*    */       case 31:
/*    */       case 34:
/*    */       case 43:
/*    */       case 44:
/*    */       case 45:
/*    */       case 46:
/*    */         bool = true;
/*    */         break;
/*    */     } 
/*    */     if (paramBoolean2 != bool)
/*    */       return; 
/*    */     UX uX = UX.km;
/*    */     float f1 = d7.tD0 / 1000.0F * 1000.0F + 250.0F;
/*    */     d7 d7;
/*    */     long l;
/*    */     float f2;
/*    */     if ((f2 = (float)((l = zm0.u20) - (d7 = paramJo.pm).HQ)) < f1) {
/*    */       short[] arrayOfShort;
/*    */       if (paramShort == 68) {
/*    */         arrayOfShort = ih0.qS;
/*    */       } else {
/*    */         arrayOfShort = ih0.VF0;
/*    */       } 
/*    */       short s = arrayOfShort[(int)(l / 200L % arrayOfShort.length)];
/*    */       pe0 pe01;
/*    */       if ((pe01 = hI(lPT9.U4, paramVp0, s, paramByte, (byte)0, false, null)) != null) {
/*    */         float f = Math.min(1.0F, (f1 - f2) / 250.0F);
/*    */         QH(paramtH, pe01, paramVp0, s, uX, paramFloat1, paramFloat2, paramBoolean1, false, f);
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void kd(int paramInt, K70 paramK70, fo0 paramfo0, pe0 parampe0, Vp0 paramVp0, short paramShort, UX paramUX, Matrix4 paramMatrix4, boolean paramBoolean, float paramFloat) {
/*    */     // Byte code:
/*    */     //   0: aload #4
/*    */     //   2: ifnonnull -> 6
/*    */     //   5: return
/*    */     //   6: aload_0
/*    */     //   7: getfield OC : [[Lf/uT;
/*    */     //   10: iload_1
/*    */     //   11: aaload
/*    */     //   12: aload #5
/*    */     //   14: getfield gw0 : B
/*    */     //   17: aaload
/*    */     //   18: dup
/*    */     //   19: astore #11
/*    */     //   21: ifnonnull -> 55
/*    */     //   24: aload_0
/*    */     //   25: aload #4
/*    */     //   27: getfield H0 : I
/*    */     //   30: aload #4
/*    */     //   32: getfield Vn0 : I
/*    */     //   35: aload #4
/*    */     //   37: invokestatic xz : (IILf/pe0;)Lf/uT;
/*    */     //   40: astore #11
/*    */     //   42: getfield OC : [[Lf/uT;
/*    */     //   45: iload_1
/*    */     //   46: aaload
/*    */     //   47: aload #5
/*    */     //   49: getfield gw0 : B
/*    */     //   52: aload #11
/*    */     //   54: aastore
/*    */     //   55: getstatic f/Xi.WB : Z
/*    */     //   58: ifeq -> 96
/*    */     //   61: iload_1
/*    */     //   62: iconst_4
/*    */     //   63: if_icmpeq -> 85
/*    */     //   66: iload_1
/*    */     //   67: iconst_1
/*    */     //   68: if_icmpeq -> 85
/*    */     //   71: iload_1
/*    */     //   72: bipush #6
/*    */     //   74: if_icmpne -> 80
/*    */     //   77: goto -> 85
/*    */     //   80: iconst_0
/*    */     //   81: istore_0
/*    */     //   82: goto -> 87
/*    */     //   85: iconst_1
/*    */     //   86: istore_0
/*    */     //   87: iload_0
/*    */     //   88: ifne -> 96
/*    */     //   91: iconst_1
/*    */     //   92: istore_0
/*    */     //   93: goto -> 98
/*    */     //   96: iconst_0
/*    */     //   97: istore_0
/*    */     //   98: aload #7
/*    */     //   100: aload #11
/*    */     //   102: dup
/*    */     //   103: aload #4
/*    */     //   105: aload #11
/*    */     //   107: iload_0
/*    */     //   108: invokevirtual lM : (Z)V
/*    */     //   111: iload #9
/*    */     //   113: invokevirtual sA0 : (Lf/pe0;Z)V
/*    */     //   116: getfield Jb : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   119: dup
/*    */     //   120: aload #8
/*    */     //   122: swap
/*    */     //   123: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   126: pop
/*    */     //   127: getfield Z0 : [F
/*    */     //   130: invokevirtual Qw : ([F)Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   133: pop
/*    */     //   134: ifnull -> 163
/*    */     //   137: aload #5
/*    */     //   139: iload #6
/*    */     //   141: invokevirtual Ko : (S)Z
/*    */     //   144: ifne -> 150
/*    */     //   147: goto -> 163
/*    */     //   150: aload #11
/*    */     //   152: aload #7
/*    */     //   154: getfield xK0 : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   157: invokevirtual DD : (Lcom/badlogic/gdx/graphics/Color;)V
/*    */     //   160: goto -> 197
/*    */     //   163: fload #10
/*    */     //   165: fconst_1
/*    */     //   166: fcmpl
/*    */     //   167: ifne -> 181
/*    */     //   170: aload #11
/*    */     //   172: getstatic com/badlogic/gdx/graphics/Color.WHITE : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   175: invokevirtual DD : (Lcom/badlogic/gdx/graphics/Color;)V
/*    */     //   178: goto -> 197
/*    */     //   181: aload #11
/*    */     //   183: getstatic f/Hk.SW : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   186: dup
/*    */     //   187: astore_0
/*    */     //   188: fload #10
/*    */     //   190: putfield a : F
/*    */     //   193: aload_0
/*    */     //   194: invokevirtual DD : (Lcom/badlogic/gdx/graphics/Color;)V
/*    */     //   197: aload_2
/*    */     //   198: aload #11
/*    */     //   200: aload_3
/*    */     //   201: invokevirtual q10 : (Lf/tk;Lf/fo0;)V
/*    */     //   204: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 14
/*    */     //   #2	-> 17
/*    */     //   #3	-> 27
/*    */     //   #4	-> 32
/*    */     //   #5	-> 37
/*    */     //   #6	-> 49
/*    */     //   #7	-> 54
/*    */     //   #8	-> 127
/*    */     //   #9	-> 141
/*    */     //   #10	-> 154
/*    */     //   #11	-> 157
/*    */   }
/*    */   
/*    */   public final void fx(K70 paramK70, fo0 paramfo0, Jo paramJo, Vp0 paramVp0, short paramShort, byte paramByte, Matrix4 paramMatrix4, boolean paramBoolean1, boolean paramBoolean2) {
/*    */     byte b;
/*    */     boolean bool = true;
/*    */     switch (paramByte) {
/*    */       case 18:
/*    */       case 20:
/*    */       case 21:
/*    */       case 22:
/*    */       case 25:
/*    */       case 26:
/*    */         bool = false;
/*    */         break;
/*    */     } 
/*    */     d7 d7;
/*    */     long l1 = zm0.u20 - (d7 = paramJo.pm).yE;
/*    */     long l2 = zm0.u20 - d7.HQ;
/*    */     float f1 = d7.tD0 / 1000.0F * 1000.0F + 250.0F;
/*    */     short s = 0;
/*    */     if (paramShort != 17) {
/*    */       s = ih0.com5[(int)(l1 / 200L % 4L)];
/*    */     } else if (l1 < 200L) {
/*    */       paramShort = 21;
/*    */       s = 27;
/*    */     } else if (l2 < 400L) {
/*    */       switch ((int)((l1 - 200L) / 200L % 4L)) {
/*    */         case 2:
/*    */           paramShort = 20;
/*    */           s = 25;
/*    */           break;
/*    */         case 1:
/*    */         case 3:
/*    */           paramShort = 19;
/*    */           s = 24;
/*    */           break;
/*    */         case 0:
/*    */           paramShort = 18;
/*    */           s = 23;
/*    */           break;
/*    */       } 
/*    */     } else if (l2 < 600L) {
/*    */       paramShort = 22;
/*    */       s = 26;
/*    */     } 
/*    */     float f2;
/*    */     int i;
/*    */     pe0 pe02;
/*    */     if ((i = (f2 = (float)l2) cmp f1) < 0 && !paramBoolean2 && paramBoolean2 == bool && (pe02 = hI(lPT9.U4, paramVp0, s, paramByte, (byte)0, false, null)) != null) {
/*    */       float f = Math.min(1.0F, (f1 - f2) / 250.0F);
/*    */       kd(1, paramK70, paramfo0, pe02, paramVp0, s, null, paramMatrix4, paramBoolean1, f);
/*    */     } 
/*    */     lPT9 lPT9 = lPT9.U4;
/*    */     if (paramBoolean2) {
/*    */       b = 0;
/*    */     } else {
/*    */       b = 2;
/*    */     } 
/*    */     pe0 pe03;
/*    */     if ((pe03 = hI(lPT9, paramVp0, paramShort, paramByte, b, false, null)) != null) {
/*    */       byte b1;
/*    */       if (paramBoolean2) {
/*    */         b1 = 0;
/*    */       } else {
/*    */         b1 = 2;
/*    */       } 
/*    */       kd(b1, paramK70, paramfo0, pe03, paramVp0, paramShort, null, paramMatrix4, paramBoolean1, 1.0F);
/*    */     } 
/*    */     if (paramBoolean2 && (pe03 = hI(lPT9, paramVp0, paramShort, paramByte, (byte)1, false, null)) != null)
/*    */       kd(4, paramK70, paramfo0, pe03, paramVp0, paramShort, null, paramMatrix4, paramBoolean1, 1.0F); 
/*    */     pe0 pe01;
/*    */     if (i < 0 && paramBoolean2 && paramBoolean2 == bool && (pe01 = hI(lPT9, paramVp0, s, paramByte, (byte)0, false, null)) != null) {
/*    */       float f = Math.min(1.0F, (f1 - f2) / 250.0F);
/*    */       kd(1, paramK70, paramfo0, pe01, paramVp0, s, null, paramMatrix4, paramBoolean1, f);
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void Bq(K70 paramK70, fo0 paramfo0, Jo paramJo, Vp0 paramVp0, short paramShort, byte paramByte, Matrix4 paramMatrix4, boolean paramBoolean1, boolean paramBoolean2) {
/*    */     boolean bool = false;
/*    */     switch (paramByte) {
/*    */       case 1:
/*    */       case 5:
/*    */       case 6:
/*    */       case 12:
/*    */       case 13:
/*    */       case 14:
/*    */       case 19:
/*    */       case 23:
/*    */       case 24:
/*    */       case 28:
/*    */       case 31:
/*    */       case 34:
/*    */       case 43:
/*    */       case 44:
/*    */       case 45:
/*    */       case 46:
/*    */         bool = true;
/*    */         break;
/*    */     } 
/*    */     if (paramBoolean2 != bool)
/*    */       return; 
/*    */     float f1 = d7.tD0 / 1000.0F * 1000.0F + 250.0F;
/*    */     d7 d7;
/*    */     float f2;
/*    */     long l;
/*    */     if ((f2 = (float)((l = zm0.u20) - (d7 = paramJo.pm).HQ)) < f1) {
/*    */       short[] arrayOfShort;
/*    */       if (paramShort == 68) {
/*    */         arrayOfShort = ih0.qS;
/*    */       } else {
/*    */         arrayOfShort = ih0.VF0;
/*    */       } 
/*    */       short s = arrayOfShort[(int)(l / 200L % arrayOfShort.length)];
/*    */       pe0 pe01;
/*    */       if ((pe01 = hI(lPT9.U4, paramVp0, s, paramByte, (byte)0, false, null)) != null) {
/*    */         float f = Math.min(1.0F, (f1 - f2) / 250.0F);
/*    */         kd(1, paramK70, paramfo0, pe01, paramVp0, s, null, paramMatrix4, paramBoolean1, f);
/*    */       } 
/*    */     } 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Hk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */