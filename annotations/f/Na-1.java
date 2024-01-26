/*  1 */ package f;public abstract class Na extends JG0 implements lPt9, qF0 { public static final Ll Ut; public static final Ll L8; public static final Ll dr; public static final Ll A90; public static final Ll Hw; public static final Ll ry0; public static final Ll fW; public static final Ll O9; public static final Ll Zj0; public static final Ll I7; public final kk0 AL0; public final WZ T1; public final Zs0 ys0; public final DN Lk; public final BJ r4; public final hE r90; public final e20 Cf; public mY Qe0; public fs F9; public boolean nn0; public j8[] W30; public xy0[] Bb; public n8 Wz0; public qe[] cOm3; public mX l90; public mX Kh0; public mX c40; public nY a70; public int zK; public int fN; public JE0 Yl0; public JE0 wm; public JE0 hg; public boolean O50; public int ge0; public int sm0; public int XK; public int mg; public boolean Vp0; public boolean pE; public boolean Wi0; public int ch0; public int ZW; public int eS; public int I1; public int w70; public int GG; public boolean tR; public boolean Ui; public int xw0; public int HF; public int El0; public int KI; public int Ha0; public int LPt4; public int sD; public int PY; public int qq; public Na() { DN dN; this.XK = 32; this.mg = 256; this.xw0 = -1; this.HF = Integer.MIN_VALUE; this.El0 = -1; this.KI = -1; this.r4 = new BJ(); this.AL0 = new kk0(); this.r90 = new hE(); this.T1 = new WZ(this); this.ys0 = new Zs0(this); this.Cf = new e20(this); this.Bb = new xy0[8]; this(); this.Lk = new DN(); si(this, 0); Zf0(true); } static { Ut = Ll.F10("firstColumnHeader"); L8 = Ll.F10("lastColumnHeader"); dr = Ll.F10("rowSelected"); A90 = Ll.F10("rowHover"); Hw = Ll.F10("rowDropTarget"); ry0 = Ll.F10("rowOdd"); fW = Ll.F10("leadRow"); O9 = Ll.F10("selected"); Zj0 = Ll.F10("sortAscending"); I7 = Ll.F10("sortDescending"); } public final void Uy0(mX parammX, int paramInt) { Sa0 sa0 = this.O;
/*  2 */     int i = G20(), j = this.Cf.HK0();
/*  3 */     int k = e3() - this.ZW + this.zK; int m, n;
/*  4 */     for (m = Zj0(this.eS), n = this.eS; n <= this.w70; ) { int i1, i2 = (i1 = k20(n)) - m; m = k + m; Ll ll = dr; n8 n81;
/*  5 */       if ((n81 = this.Wz0) != null)
/*    */       
/*    */       { 
/*    */         
/*  9 */         i3 = ((eG)n81.Ha).Va.get(n); } else { i3 = 0; }  sa0
/* 10 */         .gf0(ll, i3); ll = A90; int i3; if (this.Ha0 == 0 && (i3 = this.HF) >= m && i3 < m + i2) { i3 = 1; } else { i3 = 0; }  sa0.gf0(ll, i3); ll = fW; if (n == paramInt) { i3 = 1; } else { i3 = 0; }  sa0.gf0(ll, i3); ll = Hw; if (n == this.xw0) { i3 = 1; } else { i3 = 0; }  sa0.gf0(ll, i3); ll = ry0; if ((n & 0x1) == 1) { i3 = 1; } else { i3 = 0; }  sa0.gf0(ll, i3); parammX.W8(sa0, i, m, j, i2); n++; m = i1; }  } public final void Ha(int paramInt) { if (sH0()) { if (aG0 || this.LPt4 + 1 < this.sm0) { (arrayOfJ8[this.LPt4]).mx0 = paramInt = Math.min(paramInt, this.qq - this.fN * 2); j8[] arrayOfJ8; ((arrayOfJ8 = this.W30)[this.LPt4 + 1]).mx0 = this.qq - paramInt; this.Wi0 = true; MJ0(); return; }  throw new AssertionError(); }  Ye(this.LPt4, paramInt); } public final void zs0() { this(); n8 n81; eG eG; this(eG); n8 n82; if ((n82 = this.Wz0) != n81) { Na na2 = null; Na na3; if (n82 != null && (na3 = n82.oT) != null) { n82.oT = na2; eG eG1; if (((eG1 = (eG)n82.Ha).Rh0 >= eG1.e60)) { eG1.e60 = Integer.MAX_VALUE; eG1.Rh0 = Integer.MIN_VALUE; eG1.Va.clear(); }  n82.Ha.Mg0 = -1; n82.Ha.v2 = -1; }  this
/* 11 */         .Wz0 = n81; Na na1;
/* 12 */       if ((na1 = n81.oT) != this) if (na1 == null) { n81.oT = this;
/*    */           
/* 14 */           if ((eG.Rh0 >= eG.e60)) { eG
/* 15 */               .e60 = Integer.MAX_VALUE; eG.Rh0 = Integer.MIN_VALUE; eG.Va.clear(); }  eG
/* 16 */             .Mg0 = -1;
/* 17 */           eG.v2 = -1; }
/* 18 */         else { throw new IllegalStateException("selection manager still in use"); }   }  } public final void uB(qe paramqe) { this.cOm3 = (qe[])hm.LpT6((Object[])this.cOm3, paramqe, qe.class); } public final void Gb0(boolean paramBoolean) { fs fs1; if (paramBoolean && this.F9 == null) { this(this, this.ge0); this.F9 = fs1; this.Vp0 = true; MJ0(); } else if (fs1 == null) { this.F9 = null; }  } public final int Yc(int paramInt) { return (paramInt >= 0) ? (((fs1 = this.F9) != null) ? fs1.zn0(paramInt) : Math.min(this.ge0 - 1, paramInt / this.XK)) : -1; } public final int Zj0(int paramInt) { if (paramInt >= 0 && paramInt < this.ge0) { fs fs1; return ((fs1 = this.F9) != null) ? fs1.at(paramInt) : (paramInt * this.XK); }  throw new IndexOutOfBoundsException("row"); } public final int k20(int paramInt) { if (paramInt >= 0 && paramInt < this.ge0) { fs fs1; return ((fs1 = this.F9) != null) ? fs1.at(paramInt + 1) : ((paramInt + 1) * this.XK); }  throw new IndexOutOfBoundsException("row"); } public final int aQ(int paramInt) { if (paramInt >= 0 && paramInt < this.sm0) return this.Cf.at(paramInt + 1);  throw new IndexOutOfBoundsException("column"); } public final void df0(int paramInt, fA0 paramfA0) { for (byte b = 0; b < this.sm0; ) { boolean bool; Sa0 sa0 = (this.W30[b]).O; Ll ll = Zj0; if (b == paramInt && paramfA0 == fA0.pz) { bool = true; } else { bool = false; }  sa0.gf0(ll, bool); ll = I7; if (b == paramInt && paramfA0 == fA0.tk) { bool = true; } else { bool = false; }  sa0.gf0(ll, bool); b++; }  } public final int HY() { return Math.max(super.HY(), this.zK); } public final int R80() { Ip ip; if (qF() == 0) { boolean bool; e20 e201; int j = (e201 = this.Cf).hS.sm0; if (!(e201 = this.Cf).hS.sH0()) { byte b; for (bool = false, b = 0; b < j; ) { int k = this.hS.W30[b].J50(); bool = Math.max(this.hS.fN * 2 + 1, k) + bool; b++; }  } else if (this.hS.W30 != null) { ArrayList<QM> arrayList; this(); this(); j8[] arrayOfJ8; int k; byte b; for (k = (arrayOfJ8 = this.hS.W30).length, b = 0; b < k; ) { arrayList.add((arrayOfJ8[b]).VT); aH(); b++; }  bool = false; k = 0; b = 0; for (int m = arrayList.size(); b < m; ) { eD0 eD0 = arrayList.get(b); if (this.N00 || eD0.Cg()) k = eD0.fV(bool) + k;  b++; }  bool = k; } else { bool = false; }  return bool; }  if (((Na)super).Wi0 && qF() > 0) { e20 e201 = ((Na)super).Cf; int j = ((Na)super).sm0; if (e201.mE0.length < j) e201.mE0 = new int[j];  e201.NW = j; e201.kr(0, j); e201.em0(0, j); ((Na)super).Wi0 = false; }  int i; return ((i = ((Na)super).sm0) > 0) ? super.aQ(i - 1) : 0; } public final int tJ0() { byte b; if (this.Vp0) { fs fs1; if ((fs1 = this.F9) != null) { int k = this.ge0; if (fs1.mE0.length < k) fs1.mE0 = new int[k];  fs1.NW = k; fs1.kr(0, k); fs1.em0(0, k); }  this.Vp0 = false; }  int i = this.zK + 1; int j; if ((j = this.ge0) > 0) { b = k20(j - 1); } else { b = 0; }  return i + b; } public final void ek(Class paramClass, xy0 paramxy0) { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield r4 : Lf/BJ;
/*    */     //   4: dup
/*    */     //   5: astore_3
/*    */     //   6: getfield uF : [Lf/p4;
/*    */     //   9: dup
/*    */     //   10: astore #4
/*    */     //   12: arraylength
/*    */     //   13: istore #5
/*    */     //   15: iconst_0
/*    */     //   16: istore #6
/*    */     //   18: iload #6
/*    */     //   20: iload #5
/*    */     //   22: if_icmpge -> 154
/*    */     //   25: aload #4
/*    */     //   27: iload #6
/*    */     //   29: aaload
/*    */     //   30: astore #7
/*    */     //   32: aload #7
/*    */     //   34: ifnull -> 148
/*    */     //   37: aload #7
/*    */     //   39: dup
/*    */     //   40: getfield FK0 : Lf/gy0;
/*    */     //   43: checkcast f/p4
/*    */     //   46: astore #8
/*    */     //   48: getfield zO : Z
/*    */     //   51: ifeq -> 141
/*    */     //   54: aload_3
/*    */     //   55: getfield uF : [Lf/p4;
/*    */     //   58: dup
/*    */     //   59: astore #9
/*    */     //   61: aload #7
/*    */     //   63: getfield ks : I
/*    */     //   66: aload #9
/*    */     //   68: arraylength
/*    */     //   69: iconst_1
/*    */     //   70: isub
/*    */     //   71: iand
/*    */     //   72: dup
/*    */     //   73: istore #10
/*    */     //   75: aaload
/*    */     //   76: dup
/*    */     //   77: astore #11
/*    */     //   79: aload #7
/*    */     //   81: if_acmpne -> 98
/*    */     //   84: aload #9
/*    */     //   86: aload #11
/*    */     //   88: getfield FK0 : Lf/gy0;
/*    */     //   91: iload #10
/*    */     //   93: swap
/*    */     //   94: aastore
/*    */     //   95: goto -> 121
/*    */     //   98: aload #11
/*    */     //   100: getfield FK0 : Lf/gy0;
/*    */     //   103: dup
/*    */     //   104: astore #9
/*    */     //   106: aload #7
/*    */     //   108: if_acmpne -> 134
/*    */     //   111: aload #11
/*    */     //   113: aload #9
/*    */     //   115: getfield FK0 : Lf/gy0;
/*    */     //   118: putfield FK0 : Lf/gy0;
/*    */     //   121: aload_3
/*    */     //   122: dup
/*    */     //   123: getfield BG : I
/*    */     //   126: iconst_1
/*    */     //   127: isub
/*    */     //   128: putfield BG : I
/*    */     //   131: goto -> 141
/*    */     //   134: aload #9
/*    */     //   136: astore #11
/*    */     //   138: goto -> 98
/*    */     //   141: aload #8
/*    */     //   143: astore #7
/*    */     //   145: goto -> 32
/*    */     //   148: iinc #6, 1
/*    */     //   151: goto -> 18
/*    */     //   154: aload_3
/*    */     //   155: getfield uF : [Lf/p4;
/*    */     //   158: aload_1
/*    */     //   159: invokestatic Hr0 : ([Lf/gy0;Ljava/lang/Object;)Lf/gy0;
/*    */     //   162: checkcast f/p4
/*    */     //   165: dup
/*    */     //   166: astore #4
/*    */     //   168: ifnull -> 258
/*    */     //   171: aload_3
/*    */     //   172: getfield uF : [Lf/p4;
/*    */     //   175: dup
/*    */     //   176: astore #5
/*    */     //   178: aload #4
/*    */     //   180: getfield ks : I
/*    */     //   183: aload #5
/*    */     //   185: arraylength
/*    */     //   186: iconst_1
/*    */     //   187: isub
/*    */     //   188: iand
/*    */     //   189: dup
/*    */     //   190: istore #6
/*    */     //   192: aaload
/*    */     //   193: dup
/*    */     //   194: astore #7
/*    */     //   196: aload #4
/*    */     //   198: if_acmpne -> 215
/*    */     //   201: aload #5
/*    */     //   203: aload #7
/*    */     //   205: getfield FK0 : Lf/gy0;
/*    */     //   208: iload #6
/*    */     //   210: swap
/*    */     //   211: aastore
/*    */     //   212: goto -> 238
/*    */     //   215: aload #7
/*    */     //   217: getfield FK0 : Lf/gy0;
/*    */     //   220: dup
/*    */     //   221: astore #5
/*    */     //   223: aload #4
/*    */     //   225: if_acmpne -> 251
/*    */     //   228: aload #7
/*    */     //   230: aload #5
/*    */     //   232: getfield FK0 : Lf/gy0;
/*    */     //   235: putfield FK0 : Lf/gy0;
/*    */     //   238: aload_3
/*    */     //   239: dup
/*    */     //   240: getfield BG : I
/*    */     //   243: iconst_1
/*    */     //   244: isub
/*    */     //   245: putfield BG : I
/*    */     //   248: goto -> 258
/*    */     //   251: aload #5
/*    */     //   253: astore #7
/*    */     //   255: goto -> 215
/*    */     //   258: aload_2
/*    */     //   259: aload_3
/*    */     //   260: dup
/*    */     //   261: dup
/*    */     //   262: new f/p4
/*    */     //   265: dup
/*    */     //   266: astore #4
/*    */     //   268: aload_1
/*    */     //   269: aload_2
/*    */     //   270: iconst_0
/*    */     //   271: invokespecial <init> : (Ljava/lang/Class;Ljava/lang/Object;Z)V
/*    */     //   274: getfield uF : [Lf/p4;
/*    */     //   277: aload_3
/*    */     //   278: getfield BG : I
/*    */     //   281: invokestatic else : ([Lf/gy0;I)[Lf/gy0;
/*    */     //   284: checkcast [Lf/p4;
/*    */     //   287: dup
/*    */     //   288: astore_1
/*    */     //   289: aload #4
/*    */     //   291: aload_1
/*    */     //   292: aload #4
/*    */     //   294: aload_3
/*    */     //   295: aload_1
/*    */     //   296: putfield uF : [Lf/p4;
/*    */     //   299: getfield ks : I
/*    */     //   302: aload_1
/*    */     //   303: arraylength
/*    */     //   304: iconst_1
/*    */     //   305: isub
/*    */     //   306: iand
/*    */     //   307: dup
/*    */     //   308: istore_1
/*    */     //   309: aaload
/*    */     //   310: putfield FK0 : Lf/gy0;
/*    */     //   313: iload_1
/*    */     //   314: aload #4
/*    */     //   316: aastore
/*    */     //   317: getfield BG : I
/*    */     //   320: iconst_1
/*    */     //   321: iadd
/*    */     //   322: putfield BG : I
/*    */     //   325: instanceof f/UY
/*    */     //   328: ifeq -> 336
/*    */     //   331: aload_0
/*    */     //   332: iconst_1
/*    */     //   333: putfield nn0 : Z
/*    */     //   336: aload_0
/*    */     //   337: getfield a70 : Lf/nY;
/*    */     //   340: ifnull -> 348
/*    */     //   343: aload_0
/*    */     //   344: aload_2
/*    */     //   345: invokevirtual Uz0 : (Lf/xy0;)V
/*    */     //   348: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 6
/*    */     //   #2	-> 12
/*    */     //   #3	-> 40
/*    */     //   #4	-> 43
/*    */     //   #5	-> 63
/*    */     //   #6	-> 123
/*    */     //   #7	-> 155
/*    */     //   #8	-> 180
/*    */     //   #9	-> 240
/*    */     //   #10	-> 274
/*    */     //   #11	-> 299
/*    */     //   #12	-> 317
/* 18 */     //   #13	-> 325 } public final void Wj0(int paramInt) { if (paramInt >= 0 && paramInt < this.ge0) { rS rS = rS.ck(this); int i, j, k = (i = this.w70) - (j = this.eS); boolean bool; if (!(bool = this.Ui)) k++;  if (k >= 1 && rS != null) { if (paramInt < j || (paramInt == j && this.tR)) { rS.rt(Zj0(paramInt)); return; }  if (paramInt > i || (paramInt == i && bool)) { int m = Math.max(0, Hy() - this.zK); rS.rt(Math.max(0, k20(paramInt) - m)); }  }  return; }  throw new IndexOutOfBoundsException("row"); } public final boolean sH0() { rS rS; return !((rS = rS.ck(this)) != null && this.YP != 2); } public void Xw(nY paramnY) { super.Xw(paramnY); this.a70 = paramnY; this.l90 = q80.w2("columnDivider"); this.Kh0 = q80.w2("row.background"); this.c40 = q80.w2("row.overlay"); q80.w2("row.dropmarker"); this.XK = q80.Km(32, "rowHeight"); this.mg = q80.Km(256, "columnHeaderWidth"); this.zK = q80.Km(10, "columnHeaderHeight"); this.fN = q80.Km(3, "columnDividerDragableDistance"); q80 q80; this.O50 = (q80 = (q80)paramnY).Mw0("ensureColumnHeaderMinWidth", false); this.r4.getClass(); this(); HashSet<Object> hashSet; p4[] arrayOfP4; int i; byte b; for (i = (arrayOfP4 = this.r4.uF).length, b = 0; b < i; ) { for (p4 p4 = arrayOfP4[b]; p4 != null; ) { if (!p4.zO) hashSet.add(p4.xF);  p4 = (p4)p4.FK0; }  b++; }  for (Iterator<xy0> iterator = hashSet.iterator(); iterator.hasNext(); Uz0(iterator.next())); Uz0(this.AL0); this.Wi0 = true; if (!((this.r90.q10.sX == 0) ? 1 : 0)) { this.Lk.gx(); Arrays.fill((Object[])this.r90.q10.B60, (Object)null); this.r90.q10.sX = 0; this.r90.vt0 = 1; }  if (this.F9 != null) this.Vp0 = true;  this.pE = true; this.Wi0 = true; MJ0(); } public final void Ye(int paramInt1, int paramInt2) { if (paramInt1 >= 0 && paramInt1 < this.sm0) { int i; (this.W30[paramInt1]).mx0 = paramInt2; e20 e201; if ((e201 = this.Cf).hS.sH0()) { if (e201.hS.W30 != null) { Ip ip; cr0 cr0; this(); this(ip); j8[] arrayOfJ8; int k; byte b; for (k = (arrayOfJ8 = e201.hS.W30).length, b = 0; b < k; ) { cr0.G90((arrayOfJ8[b]).VT); b++; }  int j = e201.hS.qF(); cr0.bO(0, 0, j); }  i = (e201.hS.W30[paramInt1]).am0; i = Math.max(e201.hS.fN * 2 + 1, i); } else { i = e201.hS.W30[paramInt1].J50(); i = Math.max(e201.hS.fN * 2 + 1, i); Na na; if ((na = e201.hS).O50) i = Math.max(i, na.W30[paramInt1].AW());  }  if (e201.dy0(paramInt1, i)) MJ0();  return; }  throw new IndexOutOfBoundsException("column"); } public final void r30(nY paramnY) { this.Yl0 = ((q80)paramnY).sL("columnResizeCursor"); this.wm = ((q80)paramnY).sL("mouseCursor"); this.hg = ((q80)paramnY).sL("dragNotPossibleCursor"); } public final void Uz0(xy0 paramxy0) { String str = paramxy0.xp0(); if (!aG0) { boolean bool; if (str.length() > 1 && str.charAt(0) == '/') { bool = true; } else { bool = false; }  if (bool) throw new AssertionError();  }  nY nY1; if ((nY1 = ((L00)this.a70).mn0(str, true)) != null) paramxy0.Xw(this);  } public final void gx() { throw new UnsupportedOperationException(); } public final int G20() { return RS() - this.ch0; } public final void oi() {} public final void Gu() { rq0(); if (sH0()) this.Wi0 = true;  } public final Object t2(int paramInt1, int paramInt2) { int i; Object object; int j; if ((i = this.El0) >= 0 && i < this.ge0 && (j = this.KI) >= 0 && j < this.sm0 && (object = HV(i, j)) != null) return object;  return super.t2(paramInt1, paramInt2); } public void d40() { int i = qF(), j = Math.max(0, Hy() - this.zK); this.Lk.ME(RS(), e3() + this.zK); this.Lk.Tm(i, j); if (this.Wi0 && qF() > 0) { e20 e201 = this.Cf; int i2 = this.sm0; if (e201.mE0.length < i2) e201.mE0 = new int[i2];  e201.NW = i2; e201.kr(0, i2); e201.em0(0, i2); this.Wi0 = false; }  if (this.Vp0) { fs fs1; if ((fs1 = this.F9) != null) { int i2 = this.ge0; if (fs1.mE0.length < i2) fs1.mE0 = new int[i2];  fs1.NW = i2; fs1.kr(0, i2); fs1.em0(0, i2); }  this.Vp0 = false; }  if (this.pE) { byte b; if (this.r90.q10.sX == 0) { b = 1; } else { b = 0; }  if (!b || this.nn0) for (b = 0; b < this.ge0; ) { for (byte b1 = 0; b1 < this.sm0; ) { bv(b, b1); b1++; }  b++; }   this.pE = false; }  i = this.ch0 + i; int k; j = (k = this.ZW) + j; k = Math.min(this.ge0 - 1, Math.max(0, Yc(k))); int m = this.sm0 - 1; int n; if ((n = this.ch0) >= 0) { n = this.Cf.zn0(n); } else { n = -1; }  m = Math.min(m, Math.max(0, n)); n = Math.min(this.ge0 - 1, Math.max(k, Yc(j))); int i1 = this.sm0 - 1; if (i >= 0)
/* 19 */     { i = this.Cf.zn0(i); } else { i = -1; }
/* 20 */      i = Math.min(i1, Math.max(m, i)); if (this.ge0 > 0) { if (Zj0(k) < this.ZW) { i1 = 1; } else { i1 = 0; }  this.tR = i1; if (k20(n) > j) { j = 1; } else { j = 0; }  this.Ui = j; } else { this.tR = false; this.Ui = false; }
/* 21 */      hE hE1; if ((hE1 = this.r90).q10
/* 22 */       .sX == 0) { i1 = 1; } else { i1 = 0; }  if (i1 == 0) { if (k > (
/* 23 */         i1 = this.eS)) { int i3 = k - 1, i4 = this.sm0; WZ wZ = this.T1; hE1.jh(i1, i3, i4, wZ); }  int i2; if (n < (i2 = this.w70)) { i1 = n + 1; int i3 = this.sm0; WZ wZ = this.T1; this.r90.jh(i1, i2, i3, wZ); }  i2 = this.sm0; Zs0 zs0 = this.ys0; this.r90.jh(k, n, i2, zs0); }  this.eS = k; this.I1 = m; this.w70 = n; this.GG = i; if (this.sm0 > 0) { i = G20(); int i2 = 0; if (this
/* 24 */         .sm0 > 0)
/* 25 */       { i2 = this.Cf.at(i2); k = 0; while (k < this
/* 26 */           .sm0) { m = aQ(k); j8 j81; if ((j81 = this.W30[k]) != null) if (aG0 || j81
/* 27 */               .fr0 == this)
/* 28 */             { i2 = i + i2 + this.fN; j81
/* 29 */                 .ME(i2, e3());
/* 30 */               i2 = Math.max(0, m - i2 - this.fN * 2); j81.Tm(i2, this.zK); if (this.zK > 0) { i2 = 1; } else { i2 = 0; }  j81.wI0(i2);
/* 31 */               Sa0 sa0 = j81.O;
/* 32 */               Ll ll = Ut; if (k == 0) { i1 = 1; } else { i1 = 0; }  sa0.gf0(ll, i1); ll = L8; if (k == this.sm0 - 1) { i1 = 1; } else { i1 = 0; }  sa0.gf0(ll, i1); } else { throw new AssertionError(); }   k++; i2 = m; }  }
/* 33 */       else { throw new IndexOutOfBoundsException("column"); }  }  } public final void J00(throws paramthrows) { int i; if ((i = this.eS) < 0 || i >= this.ge0) return;  i = RS(); int j = e3() + this.zK, k = qF(), m = Hy() - this.zK, n = G20(), i1 = e3() - this.ZW + this.zK; tw tw; (tw = (tw)paramthrows.IB0).X2(i, j, k, m); try { byte b; Sa0 sa0 = this.O; n8 n81; if ((n81 = this.Wz0) != null) { b = n81.Ha.v2; n81.getClass(); } else { b = -1; }  mX mX2; if ((mX2 = this.Kh0) != null) Uy0(mX2, b);  if (this.l90 != null) { sa0.gf0(dr, false); for (int i3 = this.I1; i3 <= this.GG; ) { int i4 = n + aQ(i3); this.l90.W8(sa0, i4, j, 1, m); i3++; }  }  for (int i2 = Zj0(this.eS); j <= this.w70; ) { boolean bool; int i3 = (m = k20(j)) - i2; i2 = i1 + i2; bF0 bF0 = Oq0(j); n8 n82; if ((n82 = this.Wz0) != null) { bool = ((eG)n82.Ha).Va.get(j); } else { bool = false; }  if (bool) { bool = true; } else { bool = false; }  int i4; if ((i4 = this.I1) >= 0 && i4 < this.sm0) { i4 = this.Cf.at(i4); int i5; for (i5 = this.I1; i5 <= this.GG; ) { int i7, i6 = aQ(i5); xy0 xy01 = SH(j, i5, bF0); if (!bool) { i7 = 0; } else { i7 = 1; }  int i8 = n + i4, i9 = 1; if (xy01 != null) { if ((i9 = xy01.cf0()) > 1) i6 = aQ(Math.max(this.sm0 - 1, i5 + i9 - 1));  i4 = i6 - i4; JG0 jG0; if ((jG0 = xy01.Lpt8(i8, i2, i4, i3, i7)) != null) { if (jG0.fr0 != this) { int i10 = jG0.Kd; i7 = jG0.er0; jG0.wI0(false); si(jG0, Ub()); jG0.Ol0(i10, i7); }  if (jG0.fr0 == this) { jG0.V90(paramthrows); } else { throw new IllegalArgumentException("can only render direct children"); }  }  }  i4 = i6; i5 += Math.max(1, i9); }  j++; i2 = m; continue; }  throw new IndexOutOfBoundsException("column"); }  return; } finally { this = null; tw.Hq0(); }  } public abstract bF0 Oq0(int paramInt); public abstract Object mB0(int paramInt1, int paramInt2, bF0 parambF0); public abstract Object HV(int paramInt1, int paramInt2); public xy0 SH(int paramInt1, int paramInt2, bF0 parambF0) { Object object; if ((object = mB0(paramInt1, paramInt2, parambF0)) != null) { kY(paramInt2, object).lk(object); return kY(paramInt2, object); }  return null; } public final void bv(int paramInt1, int paramInt2) { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield r90 : Lf/hE;
/*    */     //   4: dup
/*    */     //   5: astore_3
/*    */     //   6: getfield q10 : Lf/bn;
/*    */     //   9: dup
/*    */     //   10: astore #4
/*    */     //   12: getfield sX : I
/*    */     //   15: ifle -> 123
/*    */     //   18: aload_3
/*    */     //   19: getfield vt0 : I
/*    */     //   22: istore_3
/*    */     //   23: aload #4
/*    */     //   25: checkcast f/bn
/*    */     //   28: dup
/*    */     //   29: astore #4
/*    */     //   31: iload_1
/*    */     //   32: aload #4
/*    */     //   34: getfield sX : I
/*    */     //   37: iload_2
/*    */     //   38: swap
/*    */     //   39: invokevirtual xn : (III)I
/*    */     //   42: dup
/*    */     //   43: istore #5
/*    */     //   45: aload #4
/*    */     //   47: getfield sX : I
/*    */     //   50: if_icmpne -> 56
/*    */     //   53: goto -> 123
/*    */     //   56: aload #4
/*    */     //   58: getfield B60 : [Lf/t40;
/*    */     //   61: iload #5
/*    */     //   63: aaload
/*    */     //   64: astore #4
/*    */     //   66: iload_3
/*    */     //   67: iconst_m1
/*    */     //   68: iadd
/*    */     //   69: dup
/*    */     //   70: istore_3
/*    */     //   71: ifgt -> 23
/*    */     //   74: getstatic f/hE.HH0 : Z
/*    */     //   77: ifne -> 96
/*    */     //   80: aload #4
/*    */     //   82: ifnull -> 88
/*    */     //   85: goto -> 96
/*    */     //   88: new java/lang/AssertionError
/*    */     //   91: dup
/*    */     //   92: invokespecial <init> : ()V
/*    */     //   95: athrow
/*    */     //   96: aload #4
/*    */     //   98: getfield O20 : I
/*    */     //   101: iload_1
/*    */     //   102: isub
/*    */     //   103: dup
/*    */     //   104: istore_3
/*    */     //   105: ifne -> 116
/*    */     //   108: aload #4
/*    */     //   110: getfield GP : I
/*    */     //   113: iload_2
/*    */     //   114: isub
/*    */     //   115: istore_3
/*    */     //   116: iload_3
/*    */     //   117: ifne -> 123
/*    */     //   120: goto -> 126
/*    */     //   123: aconst_null
/*    */     //   124: astore #4
/*    */     //   126: aload #4
/*    */     //   128: checkcast f/tH0
/*    */     //   131: dup
/*    */     //   132: astore_3
/*    */     //   133: ifnull -> 145
/*    */     //   136: aload_3
/*    */     //   137: getfield fh0 : Lf/JG0;
/*    */     //   140: astore #4
/*    */     //   142: goto -> 148
/*    */     //   145: aconst_null
/*    */     //   146: astore #4
/*    */     //   148: aload_0
/*    */     //   149: iload_1
/*    */     //   150: aload_0
/*    */     //   151: iload_1
/*    */     //   152: aconst_null
/*    */     //   153: astore #5
/*    */     //   155: invokevirtual Oq0 : (I)Lf/bF0;
/*    */     //   158: iload_2
/*    */     //   159: swap
/*    */     //   160: invokevirtual SH : (IILf/bF0;)Lf/xy0;
/*    */     //   163: dup
/*    */     //   164: astore #6
/*    */     //   166: instanceof f/UY
/*    */     //   169: ifeq -> 589
/*    */     //   172: aload_3
/*    */     //   173: aload #6
/*    */     //   175: checkcast f/UY
/*    */     //   178: astore #5
/*    */     //   180: ifnull -> 220
/*    */     //   183: aload_3
/*    */     //   184: getfield p2 : Lf/UY;
/*    */     //   187: aload #5
/*    */     //   189: if_acmpeq -> 220
/*    */     //   192: aload_0
/*    */     //   193: getfield Lk : Lf/DN;
/*    */     //   196: aload #4
/*    */     //   198: invokevirtual ID : (Lf/JG0;)I
/*    */     //   201: dup
/*    */     //   202: istore #4
/*    */     //   204: iflt -> 217
/*    */     //   207: aload_0
/*    */     //   208: getfield Lk : Lf/DN;
/*    */     //   211: iload #4
/*    */     //   213: invokevirtual fG0 : (I)Lf/JG0;
/*    */     //   216: pop
/*    */     //   217: aconst_null
/*    */     //   218: astore #4
/*    */     //   220: aload #5
/*    */     //   222: aload #4
/*    */     //   224: invokeinterface BL : (Lf/JG0;)Lf/JG0;
/*    */     //   229: dup
/*    */     //   230: astore #6
/*    */     //   232: ifnull -> 585
/*    */     //   235: aload_3
/*    */     //   236: ifnonnull -> 566
/*    */     //   239: aload_0
/*    */     //   240: new f/tH0
/*    */     //   243: dup
/*    */     //   244: astore_3
/*    */     //   245: invokespecial <init> : ()V
/*    */     //   248: getfield r90 : Lf/hE;
/*    */     //   251: dup
/*    */     //   252: astore #7
/*    */     //   254: aload_3
/*    */     //   255: dup
/*    */     //   256: aload #7
/*    */     //   258: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   261: pop
/*    */     //   262: iload_1
/*    */     //   263: putfield O20 : I
/*    */     //   266: iload_2
/*    */     //   267: putfield GP : I
/*    */     //   270: getfield q10 : Lf/bn;
/*    */     //   273: dup
/*    */     //   274: astore #8
/*    */     //   276: getfield sX : I
/*    */     //   279: dup
/*    */     //   280: istore #9
/*    */     //   282: ifne -> 353
/*    */     //   285: aload #8
/*    */     //   287: dup
/*    */     //   288: dup
/*    */     //   289: iconst_0
/*    */     //   290: istore #10
/*    */     //   292: getfield B60 : [Lf/t40;
/*    */     //   295: dup
/*    */     //   296: astore #11
/*    */     //   298: iload #10
/*    */     //   300: iload #9
/*    */     //   302: iload #10
/*    */     //   304: isub
/*    */     //   305: istore #9
/*    */     //   307: aload #11
/*    */     //   309: iconst_1
/*    */     //   310: iload #9
/*    */     //   312: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
/*    */     //   315: getfield B60 : [Lf/t40;
/*    */     //   318: iload #10
/*    */     //   320: aload_3
/*    */     //   321: aastore
/*    */     //   322: getfield sX : I
/*    */     //   325: dup
/*    */     //   326: aload #8
/*    */     //   328: swap
/*    */     //   329: iconst_1
/*    */     //   330: iadd
/*    */     //   331: putfield sX : I
/*    */     //   334: ifne -> 342
/*    */     //   337: aload #8
/*    */     //   339: invokevirtual xk0 : ()V
/*    */     //   342: aload #7
/*    */     //   344: getfield q10 : Lf/bn;
/*    */     //   347: invokevirtual xk0 : ()V
/*    */     //   350: goto -> 566
/*    */     //   353: aload #8
/*    */     //   355: aload #7
/*    */     //   357: getfield vt0 : I
/*    */     //   360: aload_3
/*    */     //   361: invokevirtual zB0 : (ILf/tH0;)Z
/*    */     //   364: ifne -> 566
/*    */     //   367: aload #7
/*    */     //   369: getfield q10 : Lf/bn;
/*    */     //   372: astore #8
/*    */     //   374: new f/bn
/*    */     //   377: dup
/*    */     //   378: astore #9
/*    */     //   380: aload #8
/*    */     //   382: aload #9
/*    */     //   384: aload #8
/*    */     //   386: dup
/*    */     //   387: aload #9
/*    */     //   389: aload #8
/*    */     //   391: aload #9
/*    */     //   393: aload #8
/*    */     //   395: aload #9
/*    */     //   397: dup
/*    */     //   398: aload #8
/*    */     //   400: aload #9
/*    */     //   402: aload #8
/*    */     //   404: getfield B60 : [Lf/t40;
/*    */     //   407: arraylength
/*    */     //   408: invokespecial <init> : (I)V
/*    */     //   411: getfield sX : I
/*    */     //   414: dup
/*    */     //   415: iconst_2
/*    */     //   416: idiv
/*    */     //   417: dup
/*    */     //   418: istore #10
/*    */     //   420: isub
/*    */     //   421: dup
/*    */     //   422: istore #11
/*    */     //   424: aload #8
/*    */     //   426: dup
/*    */     //   427: getfield B60 : [Lf/t40;
/*    */     //   430: iload #10
/*    */     //   432: aload #9
/*    */     //   434: getfield B60 : [Lf/t40;
/*    */     //   437: iconst_0
/*    */     //   438: iload #11
/*    */     //   440: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
/*    */     //   443: getfield B60 : [Lf/t40;
/*    */     //   446: iload #10
/*    */     //   448: aload #8
/*    */     //   450: getfield sX : I
/*    */     //   453: aconst_null
/*    */     //   454: invokestatic fill : ([Ljava/lang/Object;IILjava/lang/Object;)V
/*    */     //   457: putfield sX : I
/*    */     //   460: invokevirtual xk0 : ()V
/*    */     //   463: putfield nt : Lf/bn;
/*    */     //   466: getfield ww : Lf/bn;
/*    */     //   469: putfield ww : Lf/bn;
/*    */     //   472: iload #10
/*    */     //   474: putfield sX : I
/*    */     //   477: invokevirtual xk0 : ()V
/*    */     //   480: putfield ww : Lf/bn;
/*    */     //   483: getfield ww : Lf/bn;
/*    */     //   486: dup
/*    */     //   487: astore #8
/*    */     //   489: ifnull -> 499
/*    */     //   492: aload #8
/*    */     //   494: aload #9
/*    */     //   496: putfield nt : Lf/bn;
/*    */     //   499: new f/bn
/*    */     //   502: dup
/*    */     //   503: astore #8
/*    */     //   505: aload #7
/*    */     //   507: dup
/*    */     //   508: dup
/*    */     //   509: aload #8
/*    */     //   511: dup
/*    */     //   512: dup2
/*    */     //   513: aload #7
/*    */     //   515: getfield q10 : Lf/bn;
/*    */     //   518: getfield B60 : [Lf/t40;
/*    */     //   521: arraylength
/*    */     //   522: invokespecial <init> : (I)V
/*    */     //   525: getfield B60 : [Lf/t40;
/*    */     //   528: dup
/*    */     //   529: aload #7
/*    */     //   531: getfield q10 : Lf/bn;
/*    */     //   534: iconst_0
/*    */     //   535: swap
/*    */     //   536: aastore
/*    */     //   537: iconst_1
/*    */     //   538: aload #9
/*    */     //   540: aastore
/*    */     //   541: iconst_2
/*    */     //   542: putfield sX : I
/*    */     //   545: putfield q10 : Lf/bn;
/*    */     //   548: getfield vt0 : I
/*    */     //   551: iconst_1
/*    */     //   552: iadd
/*    */     //   553: dup
/*    */     //   554: istore #7
/*    */     //   556: putfield vt0 : I
/*    */     //   559: iload #7
/*    */     //   561: aload_3
/*    */     //   562: invokevirtual zB0 : (ILf/tH0;)Z
/*    */     //   565: pop
/*    */     //   566: aload_3
/*    */     //   567: dup
/*    */     //   568: aload #6
/*    */     //   570: putfield fh0 : Lf/JG0;
/*    */     //   573: aload #5
/*    */     //   575: putfield p2 : Lf/UY;
/*    */     //   578: aload #6
/*    */     //   580: astore #5
/*    */     //   582: goto -> 589
/*    */     //   585: aload #6
/*    */     //   587: astore #5
/*    */     //   589: aload #5
/*    */     //   591: ifnonnull -> 706
/*    */     //   594: aload_3
/*    */     //   595: ifnull -> 706
/*    */     //   598: aload_0
/*    */     //   599: getfield r90 : Lf/hE;
/*    */     //   602: dup
/*    */     //   603: astore_3
/*    */     //   604: getfield q10 : Lf/bn;
/*    */     //   607: dup
/*    */     //   608: astore #6
/*    */     //   610: getfield sX : I
/*    */     //   613: ifne -> 619
/*    */     //   616: goto -> 706
/*    */     //   619: aload #6
/*    */     //   621: iload_1
/*    */     //   622: aload_3
/*    */     //   623: getfield vt0 : I
/*    */     //   626: iload_2
/*    */     //   627: swap
/*    */     //   628: invokevirtual hn : (III)Lf/t40;
/*    */     //   631: ifnull -> 706
/*    */     //   634: aload_3
/*    */     //   635: getfield vt0 : I
/*    */     //   638: dup
/*    */     //   639: istore_1
/*    */     //   640: iconst_1
/*    */     //   641: if_icmple -> 691
/*    */     //   644: aload_3
/*    */     //   645: getfield q10 : Lf/bn;
/*    */     //   648: dup
/*    */     //   649: astore_2
/*    */     //   650: getfield sX : I
/*    */     //   653: iconst_1
/*    */     //   654: if_icmpne -> 691
/*    */     //   657: aload_3
/*    */     //   658: iload_1
/*    */     //   659: aload_2
/*    */     //   660: getfield B60 : [Lf/t40;
/*    */     //   663: iconst_0
/*    */     //   664: aaload
/*    */     //   665: checkcast f/bn
/*    */     //   668: dup
/*    */     //   669: dup
/*    */     //   670: aload_3
/*    */     //   671: swap
/*    */     //   672: putfield q10 : Lf/bn;
/*    */     //   675: aconst_null
/*    */     //   676: putfield nt : Lf/bn;
/*    */     //   679: aconst_null
/*    */     //   680: putfield ww : Lf/bn;
/*    */     //   683: iconst_1
/*    */     //   684: isub
/*    */     //   685: putfield vt0 : I
/*    */     //   688: goto -> 634
/*    */     //   691: aload_3
/*    */     //   692: getfield q10 : Lf/bn;
/*    */     //   695: getfield sX : I
/*    */     //   698: ifne -> 706
/*    */     //   701: aload_3
/*    */     //   702: iconst_1
/*    */     //   703: putfield vt0 : I
/*    */     //   706: aload #4
/*    */     //   708: ifnull -> 741
/*    */     //   711: aload #5
/*    */     //   713: aload #4
/*    */     //   715: if_acmpeq -> 741
/*    */     //   718: aload_0
/*    */     //   719: getfield Lk : Lf/DN;
/*    */     //   722: aload #4
/*    */     //   724: invokevirtual ID : (Lf/JG0;)I
/*    */     //   727: dup
/*    */     //   728: istore_1
/*    */     //   729: iflt -> 741
/*    */     //   732: aload_0
/*    */     //   733: getfield Lk : Lf/DN;
/*    */     //   736: iload_1
/*    */     //   737: invokevirtual fG0 : (I)Lf/JG0;
/*    */     //   740: pop
/*    */     //   741: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 6
/*    */     //   #2	-> 12
/*    */     //   #3	-> 98
/*    */     //   #4	-> 110
/*    */     //   #5	-> 128
/*    */     //   #6	-> 193
/*    */     //   #7	-> 224
/*    */     //   #8	-> 263
/*    */     //   #9	-> 292
/*    */     //   #10	-> 344
/*    */     //   #11	-> 369
/*    */     //   #12	-> 374
/*    */     //   #13	-> 404
/*    */     //   #14	-> 407
/*    */     //   #15	-> 499
/*    */     //   #16	-> 562
/*    */     //   #17	-> 570
/*    */     //   #18	-> 604
/*    */     //   #19	-> 610
/*    */     //   #20	-> 635
/* 33 */     //   #21	-> 719 } public final TI0 Q8(int paramInt) { nY nY1; if ((nY1 = this.a70) != null) { nW nW = ((q80)this).Uz("columnWidths"); Object object; if (object = ((q80)this).Fy.VV(Integer.toString(paramInt)) instanceof TI0) return (TI0)this;  if (this instanceof Integer) return new TI0(((Integer)this).intValue());  }  return null; } public final boolean i2(oa0 paramoa0) { int i; if (this.Ha0 != 0) { if (paramoa0.oO() && paramoa0.GG0 == 111) if ((i = this.Ha0) != 1) { if (i == 2 && i == 2) this.Ha0 = 3;  } else { Ha(this.PY); this.Ha0 = 3; }   return B8.Pg(paramoa0.cz0) ? Zm0(paramoa0) : true; }  B8.Wm0(i.cz0); if (super.i2(i)) return true;  int j; if (B8.Pg(j = i.cz0)) return Zm0(i);  B8.Wm0(j); return false; } public final JG0 Oz0(oa0 paramoa0) { if (paramoa0.cz0 == 7) { this.HF = Integer.MIN_VALUE; this.El0 = -1; this.KI = -1; } else { this.HF = paramoa0.gk0; }  if (this.Ha0 == 0) { int i; if ((i = paramoa0.gk0 - e3()) >= 0 && i < this.zK) { i = 1; } else { i = 0; }  if (i != 0) { if (this.El0 != -1 || this.KI != -1) { this.El0 = -1; this.KI = -1; qe0(); }  } else { i = Yc(paramoa0.gk0 - e3() - this.ZW + this.zK); int j = paramoa0.aK - G20(); j = this.Cf.zn0(j); if (this.El0 != i || this.KI != j) { this.El0 = i; this.KI = j; qe0(); }  }  }  return super.Oz0(paramoa0); } public final boolean Zm0(oa0 paramoa0) { int i = paramoa0.cz0; int j; if ((j = this.Ha0) != 0) { if (j != 1) { if (j != 2) { if (j != 3) throw new AssertionError();  } else { throw null; }  } else { i = qF(); if (this.LPt4 >= 0 && i > 0) { i = paramoa0.aK - this.sD; Ha(Math.max(this.fN * 2 + 1, i)); }  }  if (paramoa0.Ud()) this.Ha0 = 0;  return true; }  if ((j = paramoa0.gk0 - e3()) >= 0 && j < this.zK) { j = 1; } else { j = 0; }  if (j != 0) { j = this.Cf.zn0(j); if ((j = paramoa0.aK - G20() + this.fN) - this.Cf.at(j) < this.fN * 2) { j--; } else { j = -1; }  boolean bool = sH0(); int k; if (j >= 0 && (j < (k = this.sm0) - 1 || !bool)) { if (i == 3) if (j >= 0 && j < k) { e20 e201; int m; this.PY = i = (e201 = this.Cf).at(m = j + 1) - e201.at(j); this.LPt4 = j; this.sD = paramoa0.aK - i; if (bool) { e20 e202; for (i = 0; i < (j = this.sm0); ) { j8 j81 = this.W30[i]; if (i >= 0 && i < j) { int n; j81.mx0 = (e202 = this.Cf).at(n = i + 1) - e202.at(i); i = n; continue; }  throw new IndexOutOfBoundsException("column"); }  i = this.PY; if (m >= 0 && m < e202) { this.qq = (e202 = this.Cf).at(m + 1) - e202.at(m) + i; } else { throw new IndexOutOfBoundsException("column"); }  }  } else { throw new IndexOutOfBoundsException("column"); }   if (paramoa0.Ua) this.Ha0 = 1;  return true; }  } else { j = this.El0; if (paramoa0.Ua) { this
/* 34 */           .Ha0 = 3; return true; }  n8 n81; if ((n81 = this.Wz0) != null)
/* 35 */       { int m; int k; if (((k = paramoa0.com8) & 0x9) != 0) { m = 1; } else { m = 0; }  if ((k & 0x24) != 0) { k = 1; } else { k = 0; }  if (paramoa0
/* 36 */           .cz0 == 3 && paramoa0
/* 37 */           .vl == 0) { eG eG; if (j < 0 || j >= n81
/* 38 */             .ei())
/*    */           
/*    */           { 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */             
/* 66 */             if (!m && (
/*    */               
/* 68 */               ((eG = (eG)n81.Ha).Rh0 >= eG.e60))) { eG
/* 69 */                 .e60 = Integer.MAX_VALUE; eG.Rh0 = Integer.MIN_VALUE; eG.Va.clear(); }  } else { boolean bool; ((n8)eG).oT.Wj0(j); wJ wJ; int n; if ((n = (wJ = ((n8)eG).Ha).Mg0) == -1) { n = 0; bool = false; } else { bool = ((eG)bool).Va.get(n); }  if (k != 0) { if (m) { if (bool) { eG.Mg0 = n; (eG = (eG)((n8)eG).Ha).v2 = j; for (k = Math.min(n, j), m = Math.max(n, j); k <= m; ) { if (!eG.Va.get(k)) { eG.Va.set(k); if (k < eG.e60) eG.e60 = k;  if (k > eG.Rh0) eG.Rh0 = k;  }  k++; }  } else { eG.Mg0 = n; (eG = (eG)((n8)eG).Ha).v2 = j; if ((((eG)((n8)eG).Ha).Rh0 >= eG.e60)) for (k = Math.min(n, j), m = Math.max(n, j); k <= m; ) { eG.uh(k); k++; }   }  } else if (((eG)((n8)eG).Ha).Va.get(j)) { eG.Mg0 = j; (eG = (eG)((n8)eG).Ha).v2 = j; if ((((eG)((n8)eG).Ha).Rh0 >= eG.e60)) for (k = Math.min(j, j), m = Math.max(j, j); k <= m; ) { eG.uh(k); k++; }   } else { eG.Mg0 = j; (eG = (eG)((n8)eG).Ha).v2 = j; for (k = Math.min(j, j), m = Math.max(j, j); k <= m; ) { if (!eG.Va.get(k)) { eG.Va.set(k); if (k < eG.e60) eG.e60 = k;  if (k > eG.Rh0) eG.Rh0 = k;  }  k++; }  }  } else if (m != 0) { ((n8)eG).Ha.Yb(n, j); } else { ((n8)eG).Ha.Yb(j, j); }  }  }  }  qe[] arrayOfQe2; if (i == 5 && paramoa0
/* 70 */         .uC == 2 && (
/* 71 */         arrayOfQe2 = this.cOm3) != null) { int k; byte b; for (k = arrayOfQe2.length, b = 0; b < k; ) { arrayOfQe2[b].j70(); b++; }  }  qe[] arrayOfQe1; if (i == 4 && paramoa0
/* 72 */         .vl == 1 && (
/* 73 */         arrayOfQe1 = this.cOm3) != null) { int k; byte b; for (k = this.length, b = 0; b < k; ) { this[b].e3(j, paramoa0); b++; }  }  }  return (i != 8); }
/*    */ 
/*    */   
/*    */   public final JE0 pB0(oa0 paramoa0) {
/*    */     int i;
/*    */     if ((i = this.Ha0) != 1) {
/*    */       if (i != 2) {
/*    */         if (i != 3) {
/*    */           if ((i = paramoa0.gk0 - e3()) >= 0 && i < this.zK) {
/*    */             i = 1;
/*    */           } else {
/*    */             i = 0;
/*    */           } 
/*    */           if (i != 0) {
/*    */             int j = this.Cf.zn0(j);
/*    */             if ((j = paramoa0.aK - G20() + this.fN) - this.Cf.at(j) < this.fN * 2) {
/*    */               j--;
/*    */             } else {
/*    */               j = -1;
/*    */             } 
/*    */             boolean bool = sH0();
/*    */             if (j >= 0 && (j < this.sm0 - 1 || !bool))
/*    */               return this.Yl0; 
/*    */           } 
/*    */           return this.wm;
/*    */         } 
/*    */         return this.hg;
/*    */       } 
/*    */       return null;
/*    */     } 
/*    */     return this.Yl0;
/*    */   }
/*    */   
/*    */   public void Ki(int paramInt) {
/*    */     qe[] arrayOfQe;
/*    */     if ((arrayOfQe = this.cOm3) != null) {
/*    */       paramInt = this.length;
/*    */       for (byte b = 0; b < paramInt; b++)
/*    */         this[b].qd0(); 
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void yH0() {
/*    */     j8[] arrayOfJ81;
/*    */     if ((arrayOfJ81 = this.W30) != null) {
/*    */       byte b1;
/*    */       int i;
/*    */       byte b2;
/*    */       for (b1 = 0, i = arrayOfJ81.length, b2 = 0; b2 < i; ) {
/*    */         int j;
/*    */         if ((j = ID(this.W30[b1 + b2])) >= 0)
/*    */           fG0(j); 
/*    */         b2++;
/*    */       } 
/*    */     } 
/*    */     byte b;
/*    */     for (this.xw0 = -1, this.W30 = new j8[this.sm0], b = 0; b < this.sm0; ) {
/*    */       j8 j81;
/*    */       this(this);
/*    */       (new j8()).Xu("columnHeader");
/*    */       (new j8()).zI0 = false;
/*    */       si(j81, Ub());
/*    */       this.W30[b] = j81;
/*    */       this.W30[b].s6(this.Qe0.zd(b));
/*    */       this.Qe0.getClass();
/*    */       b++;
/*    */     } 
/*    */     b = 0;
/*    */     j8[] arrayOfJ82;
/*    */     while (b < (arrayOfJ82 = this.W30).length) {
/*    */       (arrayOfJ82[b]).SZ = b;
/*    */       b++;
/*    */     } 
/*    */     n8 n81;
/*    */     if ((n81 = this.Wz0) != null) {
/*    */       eG eG;
/*    */       if (((eG = (eG)n81.Ha).Rh0 >= eG.e60)) {
/*    */         eG.e60 = Integer.MAX_VALUE;
/*    */         eG.Rh0 = Integer.MIN_VALUE;
/*    */         eG.Va.clear();
/*    */       } 
/*    */       n81.Ha.Mg0 = -1;
/*    */       n81.Ha.v2 = -1;
/*    */     } 
/*    */     if (!((this.r90.q10.sX == 0) ? 1 : 0)) {
/*    */       this.Lk.gx();
/*    */       Arrays.fill((Object[])this.r90.q10.B60, (Object)null);
/*    */       this.r90.q10.sX = 0;
/*    */       this.r90.vt0 = 1;
/*    */     } 
/*    */     if (this.F9 != null)
/*    */       this.Vp0 = true; 
/*    */     this.pE = true;
/*    */     this.Wi0 = true;
/*    */     MJ0();
/*    */   }
/*    */   
/*    */   public final void av0(int paramInt1, int paramInt2) {
/*    */     // Byte code:
/*    */     //   0: iload_1
/*    */     //   1: iflt -> 480
/*    */     //   4: iload_2
/*    */     //   5: iflt -> 480
/*    */     //   8: iload_2
/*    */     //   9: aload_0
/*    */     //   10: getfield ge0 : I
/*    */     //   13: dup
/*    */     //   14: istore_3
/*    */     //   15: if_icmpgt -> 480
/*    */     //   18: iload_1
/*    */     //   19: iload_3
/*    */     //   20: iload_2
/*    */     //   21: isub
/*    */     //   22: if_icmpgt -> 480
/*    */     //   25: aload_0
/*    */     //   26: getfield F9 : Lf/fs;
/*    */     //   29: dup
/*    */     //   30: astore_3
/*    */     //   31: ifnull -> 140
/*    */     //   34: aload_3
/*    */     //   35: getfield NW : I
/*    */     //   38: dup
/*    */     //   39: istore #4
/*    */     //   41: iload_2
/*    */     //   42: iadd
/*    */     //   43: dup
/*    */     //   44: istore #5
/*    */     //   46: aload_3
/*    */     //   47: getfield mE0 : [I
/*    */     //   50: dup
/*    */     //   51: astore #6
/*    */     //   53: arraylength
/*    */     //   54: if_icmplt -> 82
/*    */     //   57: aload_3
/*    */     //   58: dup
/*    */     //   59: iload #5
/*    */     //   61: newarray int
/*    */     //   63: astore #6
/*    */     //   65: iconst_0
/*    */     //   66: iload #4
/*    */     //   68: aload #6
/*    */     //   70: invokevirtual yE : (II[I)I
/*    */     //   73: pop
/*    */     //   74: aload #6
/*    */     //   76: putfield mE0 : [I
/*    */     //   79: goto -> 92
/*    */     //   82: aload_3
/*    */     //   83: iconst_0
/*    */     //   84: iload #4
/*    */     //   86: aload #6
/*    */     //   88: invokevirtual yE : (II[I)I
/*    */     //   91: pop
/*    */     //   92: aload_3
/*    */     //   93: dup
/*    */     //   94: iload_1
/*    */     //   95: aload_3
/*    */     //   96: iload #5
/*    */     //   98: aload_3
/*    */     //   99: getfield mE0 : [I
/*    */     //   102: dup
/*    */     //   103: astore #4
/*    */     //   105: iload_1
/*    */     //   106: aload_3
/*    */     //   107: iload_1
/*    */     //   108: iload_2
/*    */     //   109: iadd
/*    */     //   110: istore_3
/*    */     //   111: getfield NW : I
/*    */     //   114: iload_1
/*    */     //   115: isub
/*    */     //   116: istore #6
/*    */     //   118: aload #4
/*    */     //   120: iload_3
/*    */     //   121: iload #6
/*    */     //   123: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
/*    */     //   126: putfield NW : I
/*    */     //   129: iload_2
/*    */     //   130: invokevirtual kr : (II)V
/*    */     //   133: iconst_0
/*    */     //   134: iload #5
/*    */     //   136: invokevirtual em0 : (II)I
/*    */     //   139: pop
/*    */     //   140: aload_0
/*    */     //   141: getfield xw0 : I
/*    */     //   144: dup
/*    */     //   145: istore_3
/*    */     //   146: iload_1
/*    */     //   147: if_icmpgt -> 153
/*    */     //   150: goto -> 160
/*    */     //   153: aload_0
/*    */     //   154: iload_3
/*    */     //   155: iload_2
/*    */     //   156: iadd
/*    */     //   157: putfield xw0 : I
/*    */     //   160: aload_0
/*    */     //   161: getfield r90 : Lf/hE;
/*    */     //   164: getfield q10 : Lf/bn;
/*    */     //   167: getfield sX : I
/*    */     //   170: ifne -> 178
/*    */     //   173: iconst_1
/*    */     //   174: istore_3
/*    */     //   175: goto -> 180
/*    */     //   178: iconst_0
/*    */     //   179: istore_3
/*    */     //   180: iload_3
/*    */     //   181: ifeq -> 191
/*    */     //   184: aload_0
/*    */     //   185: getfield nn0 : Z
/*    */     //   188: ifeq -> 281
/*    */     //   191: iload_2
/*    */     //   192: aload_0
/*    */     //   193: dup
/*    */     //   194: getfield Lk : Lf/DN;
/*    */     //   197: invokevirtual gx : ()V
/*    */     //   200: getfield r90 : Lf/hE;
/*    */     //   203: astore_3
/*    */     //   204: ifle -> 236
/*    */     //   207: aload_3
/*    */     //   208: getfield q10 : Lf/bn;
/*    */     //   211: dup
/*    */     //   212: astore #4
/*    */     //   214: getfield sX : I
/*    */     //   217: ifle -> 241
/*    */     //   220: aload #4
/*    */     //   222: aload_3
/*    */     //   223: getfield vt0 : I
/*    */     //   226: istore_3
/*    */     //   227: iload_1
/*    */     //   228: iload_2
/*    */     //   229: iload_3
/*    */     //   230: invokevirtual m4 : (III)V
/*    */     //   233: goto -> 241
/*    */     //   236: aload_3
/*    */     //   237: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   240: pop
/*    */     //   241: iconst_0
/*    */     //   242: istore_3
/*    */     //   243: iload_3
/*    */     //   244: iload_2
/*    */     //   245: if_icmpge -> 281
/*    */     //   248: iconst_0
/*    */     //   249: istore #4
/*    */     //   251: iload #4
/*    */     //   253: aload_0
/*    */     //   254: getfield sm0 : I
/*    */     //   257: if_icmpge -> 275
/*    */     //   260: aload_0
/*    */     //   261: iload_1
/*    */     //   262: iload_3
/*    */     //   263: iadd
/*    */     //   264: iload #4
/*    */     //   266: invokevirtual bv : (II)V
/*    */     //   269: iinc #4, 1
/*    */     //   272: goto -> 251
/*    */     //   275: iinc #3, 1
/*    */     //   278: goto -> 243
/*    */     //   281: iload_1
/*    */     //   282: aload_0
/*    */     //   283: dup
/*    */     //   284: dup
/*    */     //   285: invokevirtual MJ0 : ()V
/*    */     //   288: getfield ZW : I
/*    */     //   291: invokevirtual Yc : (I)I
/*    */     //   294: if_icmpge -> 336
/*    */     //   297: aload_0
/*    */     //   298: invokestatic ck : (Lf/JG0;)Lf/rS;
/*    */     //   301: dup
/*    */     //   302: astore_3
/*    */     //   303: ifnull -> 336
/*    */     //   306: aload_3
/*    */     //   307: aload_0
/*    */     //   308: dup
/*    */     //   309: iload_1
/*    */     //   310: iload_2
/*    */     //   311: aload_0
/*    */     //   312: iload_1
/*    */     //   313: invokevirtual Zj0 : (I)I
/*    */     //   316: istore_3
/*    */     //   317: iadd
/*    */     //   318: iconst_1
/*    */     //   319: isub
/*    */     //   320: invokevirtual k20 : (I)I
/*    */     //   323: istore #4
/*    */     //   325: getfield ZW : I
/*    */     //   328: iload #4
/*    */     //   330: iadd
/*    */     //   331: iload_3
/*    */     //   332: isub
/*    */     //   333: invokevirtual rt : (I)V
/*    */     //   336: aload_0
/*    */     //   337: getfield Wz0 : Lf/n8;
/*    */     //   340: dup
/*    */     //   341: astore_0
/*    */     //   342: ifnull -> 479
/*    */     //   345: iload_1
/*    */     //   346: aload_0
/*    */     //   347: getfield Ha : Lf/wJ;
/*    */     //   350: checkcast f/eG
/*    */     //   353: dup
/*    */     //   354: astore_0
/*    */     //   355: getfield Rh0 : I
/*    */     //   358: dup
/*    */     //   359: istore_3
/*    */     //   360: if_icmpgt -> 445
/*    */     //   363: iload_3
/*    */     //   364: iload_1
/*    */     //   365: if_icmplt -> 408
/*    */     //   368: aload_0
/*    */     //   369: getfield Va : Ljava/util/BitSet;
/*    */     //   372: iload_3
/*    */     //   373: invokevirtual get : (I)Z
/*    */     //   376: ifeq -> 392
/*    */     //   379: aload_0
/*    */     //   380: getfield Va : Ljava/util/BitSet;
/*    */     //   383: iload_3
/*    */     //   384: iload_2
/*    */     //   385: iadd
/*    */     //   386: invokevirtual set : (I)V
/*    */     //   389: goto -> 402
/*    */     //   392: aload_0
/*    */     //   393: getfield Va : Ljava/util/BitSet;
/*    */     //   396: iload_3
/*    */     //   397: iload_2
/*    */     //   398: iadd
/*    */     //   399: invokevirtual clear : (I)V
/*    */     //   402: iinc #3, -1
/*    */     //   405: goto -> 363
/*    */     //   408: iload_1
/*    */     //   409: aload_0
/*    */     //   410: dup
/*    */     //   411: dup2
/*    */     //   412: getfield Va : Ljava/util/BitSet;
/*    */     //   415: iload_1
/*    */     //   416: dup
/*    */     //   417: iload_2
/*    */     //   418: iadd
/*    */     //   419: invokevirtual clear : (II)V
/*    */     //   422: getfield Rh0 : I
/*    */     //   425: iload_2
/*    */     //   426: iadd
/*    */     //   427: putfield Rh0 : I
/*    */     //   430: getfield e60 : I
/*    */     //   433: dup
/*    */     //   434: istore_3
/*    */     //   435: if_icmpgt -> 445
/*    */     //   438: aload_0
/*    */     //   439: iload_3
/*    */     //   440: iload_2
/*    */     //   441: iadd
/*    */     //   442: putfield e60 : I
/*    */     //   445: aload_0
/*    */     //   446: getfield v2 : I
/*    */     //   449: dup
/*    */     //   450: istore_3
/*    */     //   451: iload_1
/*    */     //   452: if_icmplt -> 462
/*    */     //   455: aload_0
/*    */     //   456: iload_3
/*    */     //   457: iload_2
/*    */     //   458: iadd
/*    */     //   459: putfield v2 : I
/*    */     //   462: aload_0
/*    */     //   463: getfield Mg0 : I
/*    */     //   466: dup
/*    */     //   467: istore_3
/*    */     //   468: iload_1
/*    */     //   469: if_icmplt -> 479
/*    */     //   472: aload_0
/*    */     //   473: iload_3
/*    */     //   474: iload_2
/*    */     //   475: iadd
/*    */     //   476: putfield Mg0 : I
/*    */     //   479: return
/*    */     //   480: new java/lang/IllegalArgumentException
/*    */     //   483: dup
/*    */     //   484: ldc_w 'row'
/*    */     //   487: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   490: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 10
/*    */     //   #2	-> 26
/*    */     //   #3	-> 35
/*    */     //   #4	-> 141
/*    */     //   #5	-> 164
/*    */     //   #6	-> 167
/*    */     //   #7	-> 185
/*    */     //   #8	-> 194
/*    */     //   #9	-> 200
/*    */     //   #10	-> 208
/*    */     //   #11	-> 214
/*    */     //   #12	-> 237
/*    */     //   #13	-> 347
/*    */     //   #14	-> 350
/*    */     //   #15	-> 355
/*    */     //   #16	-> 369
/*    */     //   #17	-> 446
/*    */     //   #18	-> 480
/*    */   }
/*    */   
/*    */   public final void KS(int paramInt1, int paramInt2) {
/*    */     boolean bool;
/*    */     int i;
/*    */     rS rS;
/*    */     if ((i = paramInt1 + paramInt2) <= Yc(this.ZW) && (rS = rS.ck(this)) != null) {
/*    */       int k = Zj0(paramInt1);
/*    */       bool = k20(i - 1);
/*    */       rS.rt(this.ZW - bool + k);
/*    */     } 
/*    */     fs fs1;
/*    */     if ((fs1 = this.F9) != null) {
/*    */       int k = fs1.NW, arrayOfInt[] = fs1.mE0;
/*    */       fs1.yE(0, k, arrayOfInt);
/*    */       k = fs1.NW - paramInt2;
/*    */       arrayOfInt = fs1.mE0;
/*    */       int m = k - paramInt1;
/*    */       System.arraycopy(arrayOfInt, i, arrayOfInt, paramInt1, m);
/*    */       fs1.NW = k;
/*    */       fs1.em0(0, k);
/*    */     } 
/*    */     int j;
/*    */     if ((j = this.xw0) >= paramInt1)
/*    */       if (j < i) {
/*    */         this.xw0 = -1;
/*    */       } else {
/*    */         this.xw0 = j - paramInt2;
/*    */       }  
/*    */     hE hE1;
/*    */     if ((hE1 = this.r90).q10.sX == 0) {
/*    */       bool = true;
/*    */     } else {
/*    */       bool = false;
/*    */     } 
/*    */     if (!bool) {
/*    */       i--;
/*    */       int k = this.sm0;
/*    */       WZ wZ = this.T1;
/*    */       hE1.jh(paramInt1, i, k, wZ);
/*    */       hE hE2 = this.r90;
/*    */       if (paramInt2 > 0) {
/*    */         hE2.q10.GW(paramInt1, paramInt2, hE2.vt0);
/*    */         bn bn;
/*    */         while ((k = hE2.vt0) > 1 && (bn = hE2.q10).sX == 1) {
/*    */           (hE2.q10 = (bn)bn.B60[0]).nt = null;
/*    */           ((bn)bn.B60[0]).ww = null;
/*    */           hE2.vt0 = k - 1;
/*    */         } 
/*    */         if (hE2.q10.sX == 0)
/*    */           hE2.vt0 = 1; 
/*    */       } else {
/*    */         hE2.getClass();
/*    */       } 
/*    */     } 
/*    */     n8 n81;
/*    */     if ((n81 = this.Wz0) != null) {
/*    */       eG eG;
/*    */       if (paramInt1 <= (eG = (eG)n81.Ha).Rh0) {
/*    */         int m = paramInt1;
/*    */         while (m <= eG.Rh0) {
/*    */           if (eG.Va.get(m + paramInt2)) {
/*    */             eG.Va.set(m);
/*    */           } else {
/*    */             eG.Va.clear(m);
/*    */           } 
/*    */           m++;
/*    */         } 
/*    */         if ((eG.e60 = eG.Va.nextSetBit(0)) < 0) {
/*    */           eG.e60 = Integer.MAX_VALUE;
/*    */           eG.Rh0 = Integer.MIN_VALUE;
/*    */         } else {
/*    */           for (; (m = eG.Rh0) >= eG.e60 && !eG.Va.get(m); eG.Rh0--);
/*    */         } 
/*    */       } 
/*    */       int k;
/*    */       if ((k = eG.v2) >= paramInt1)
/*    */         eG.v2 = Math.max(paramInt1, k - paramInt2); 
/*    */       if ((k = eG.Mg0) >= paramInt1)
/*    */         eG.Mg0 = Math.max(paramInt1, k - paramInt2); 
/*    */     } 
/*    */     MJ0();
/*    */   }
/*    */   
/*    */   public final xy0 kY(int paramInt, Object<?> paramObject) {
/*    */     p4 p41;
/*    */     paramObject = (Object<?>)paramObject.getClass();
/*    */     BJ bJ;
/*    */     p4 p42;
/*    */     if ((p42 = (p4)gy0.Hr0((gy0[])(bJ = this.r4).uF, paramObject)) != null) {
/*    */       paramObject = (Object<?>)p42.xF;
/*    */     } else {
/*    */       p42 = null;
/*    */       Object<?> object = paramObject;
/*    */       do {
/*    */         p4 p4;
/*    */         Class clazz;
/*    */         Class[] arrayOfClass;
/*    */         int j;
/*    */         byte b;
/*    */         for (j = (arrayOfClass = object.getInterfaces()).length, b = 0, clazz = arrayOfClass[b]; b < j && (p4 = (p4)gy0.Hr0((gy0[])bJ.uF, clazz)) == null; b++);
/*    */       } while ((object = (Object<?>)object.getSuperclass()) != null && (p42 = (p4)gy0.Hr0((gy0[])bJ.uF, object)) == null);
/*    */       if (p42 != null) {
/*    */         Object object1 = p42.xF;
/*    */       } else {
/*    */         p42 = null;
/*    */       } 
/*    */       super((Class)paramObject, p42, true);
/*    */       bJ.uF = arrayOfP4;
/*    */       int i;
/*    */       ((gy0)object).FK0 = arrayOfP4[i = ((gy0)object).ks & arrayOfP4.length - 1];
/*    */       p4[] arrayOfP4;
/*    */       (arrayOfP4 = (p4[])gy0.else((gy0[])bJ.uF, bJ.BG))[i] = (p4)object;
/*    */       bJ.BG++;
/*    */       p41 = p42;
/*    */     } 
/*    */     xy0 xy01;
/*    */     if ((xy01 = (xy0)p41) == null) {
/*    */       xy0[] arrayOfXy0;
/*    */       if (paramInt < (arrayOfXy0 = this.Bb).length) {
/*    */         xy0 xy02 = arrayOfXy0[paramInt], xy03 = xy02;
/*    */       } else {
/*    */         xy0[] arrayOfXy01 = null;
/*    */       } 
/*    */       if (arrayOfXy0 == null)
/*    */         xy01 = this.AL0; 
/*    */     } 
/*    */     return xy01;
/*    */   }
/*    */   
/*    */   public final boolean fv(oa0 paramoa0, String paramString) {
/*    */     if (!super.fv(paramoa0, paramString)) {
/*    */       n8 n81;
/*    */       if ((n81 = this.Wz0) == null)
/*    */         return false; 
/*    */       if (!n81.Kz0.xW(paramoa0, paramString))
/*    */         return false; 
/*    */     } 
/*    */     gA0(null);
/*    */     return true;
/*    */   }
/*    */   
/*    */   public final void t30() {}
/*    */   
/*    */   public final void HK0() {} }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Na.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */