/*  1 */ package f;public class Wr extends JG0 { public static final Ll Ny = Ll.F10("fade"); public String c7 = ""; public final JE0[] sT = new JE0[(hC0._values()).length]; public int Xo = 4; public boolean dy = true; public boolean fs0 = false; public int zi0 = 1; public int bw; public int W7; public int ti; public int TM; public int nK0; public int U40; public pRn sY = pRn.WHITE; public int aG0; public int tp; public int Ss0; public int Jd; public Ap Io0; public int He; public int wb; public int Oi0; public int JG0; public boolean Wt; public Un Ki; public int ox; public int pu; public boolean switch; public JG0 lo0; public int Gj0; public int su; public int sc; public Wr() { Zf0(true); } public final String TI() { return "resizableframe"; } public final void Lo(String paramString) { this.c7 = paramString; Ap ap; if ((ap = this.Io0) != null) HC(paramString);  } public final void jJ0(boolean paramBoolean) { this.dy = paramBoolean; } public final void No(boolean paramBoolean) { this.fs0 = paramBoolean; } public final void TG0(Runnable paramRunnable) { this(); this.Ki = un; Un un; (un = new Un()).Xu("closeButton"); (un = this.Ki).zI0 = false;
/*  2 */     si(un, Ub());
/*  3 */     if (this.Ki == null && (un = this.Ki) != null) { un.mM(); un = this.Ki; int i; if ((i = this.ox) < 0)
/*  4 */       { i = Xq() + i; }
/*  5 */       else { i = this.Kd + i; }
/*  6 */        int j; if ((j = this.pu) < 0)
/*  7 */       { j = yR() + j; }
/*  8 */       else { j = this.er0 + j; }  un
/*  9 */         .ME(i, j);
/* 10 */       if ((un = this.Ki).Wg0() && this.Wt) { i = 1; } else { i = 0; }  un.wI0(i); }  this
/* 11 */       .Ki.wI0(this.Wt); this.Ki.tW(paramRunnable); }
/* 12 */   public void CQ(boolean paramBoolean) { super.wI0(paramBoolean); } public void hF(nY paramnY) { int arrayOfInt[], i; byte b; for (i = (arrayOfInt = Zk0.s6(10)).length, b = 0; b < i; ) { int j = arrayOfInt[b]; j = Zk0.yE(j); String str = hC0.wZ(j); this.sT[j] = ((q80)paramnY).sL(str); b++; }  this.He = q80.Km(0, "titleAreaTop"); this.wb = q80.Km(0, "titleAreaLeft"); this.Oi0 = q80.Km(0, "titleAreaRight"); this.JG0 = q80.Km(0, "titleAreaBottom"); this.ox = q80.Km(0, "closeButtonX"); this.pu = q80.Km(0, "closeButtonY"); this.Wt = q80.Mw0("hasCloseButton", false); this.switch = q80.Mw0("hasResizeHandle", false); this.Gj0 = q80.Km(0, "resizeHandleX"); this.su = q80.Km(0, "resizeHandleY"); pRn pRn1 = pRn.WHITE; q80 q80; pRn pRn2; if ((pRn2 = (pRn)(q80 = (q80)paramnY).Yz0("fadeColorInactive", true, pRn.class, null)) == null) pRn2 = pRn1;  this.sY = pRn2; this.aG0 = q80.Km(0, "fadeDurationActivate"); this.tp = q80.Km(0, "fadeDurationDeactivate"); this.Ss0 = q80.Km(0, "fadeDurationShow"); this.Jd = q80.Km(0, "fadeDurationHide"); MJ0(); if (this.dP && !p3() && (this.db0 != null || !pRn1.equals(this.sY))) EI0(this.sY, 0);  } public void Xw(nY paramnY) { super.Xw(paramnY); hF(paramnY); } public void wI0(boolean paramBoolean) { if (paramBoolean) { I i; if (((i = this.db0) != null && i.mi) || !this.dP) { pRn pRn1; if (p3()) { pRn1 = pRn.WHITE; } else { pRn1 = this.sY; }  EI0(pRn1, this.Ss0); }  } else if (this.dP) { int i; if ((i = this.Jd) <= 0) { CQ(false); } else { this(new KO(this.O, Ny), pRn.WHITE);
/* 13 */         this.db0 = new I(); I i1;
/* 14 */         if ((i1 = this.db0) == null && !this.dP) i1
/* 15 */             .oC0(0);  i1
/* 16 */           .oC0(i); }  }  } public final void zG0() { I i; (i = this.db0).s90(); if (!this.db0.en) { boolean bool; if (i.transient[3] <= 0.001F) { bool = true; } else { bool = false; }  if (bool) CQ(false);  }  } public final void EI0(pRn parampRn, int paramInt) { this(new KO(this.O, Ny), pRn.WHITE); this.db0 = new I(); I i; if ((i = this.db0) == null && !this.dP) i.oC0(0);  i.sz(parampRn, paramInt); if (!this.dP && parampRn.cj() != 0) CQ(true);  } public final boolean dm0(JG0 paramJG0) { if (paramJG0 == this.Io0 || paramJG0 == this.Ki || paramJG0 == this.lo0) return true;  } public void d40() { int i = AW(), j = HY(); int k; if ((k = this.xY) < i || this.HC < j) { i = Math.max(k, i); j = Math.max(this.HC, j); JG0 jG0; if ((jG0 = this.fr0) != null) ME(Math.min(this.Kd, jG0.m40() - i), Math.min(this.er0, this.fr0.mD() - j));  Tm(i, j); }  for (i = 0, j = Ub(); i < j; ) { JG0 jG0; if (!dm0(jG0 = lPt3(i))) S20(jG0);  i++; }  SM(); Un un; if ((un = this.Ki) != null) { un.mM(); un = this.Ki; if ((j = this.ox) < 0) { j = Xq() + j; } else { j = this.Kd + j; }
/* 17 */        if ((k = this.pu) < 0)
/* 18 */       { k = yR() + k; }
/* 19 */       else { k = this.er0 + k; }  un
/* 20 */         .ME(j, k);
/* 21 */       if ((un = this.Ki).Wg0() && this.Wt) { j = 1; } else { j = 0; }  un.wI0(j); }
/* 22 */      xy0(); } public final void SM() { int i; if ((i = this.wb) < 0) { i = Xq() + i; } else { i = this.Kd + i; }  int j; if ((j = this.He) < 0) { j = yR() + j; } else { j = this.er0 + j; }  int k; if ((k = this.Oi0) < 0) { k = Xq() + k; } else { k = this.Kd + k; }  k = Math.max(0, k - i); int m; if ((m = this.JG0) < 0) { m = yR() + m; } else { m = this.er0 + m; }  m = Math.max(0, m - j); if (this.wb != this.Oi0 && this.He != this.JG0) { if (this.Io0 == null) { (this.Io0 = new Ap(this.O, false)).Xu("title"); this.Io0.v10 = this.sT[9]; this.Io0.HC(this.c7); this.Io0.l0 = true; }  Ap ap; if ((ap = this.Io0).fr0 == null) si(ap, 0);  this.Io0.ME(i, j);
/* 23 */       this.Io0.Tm(k, m); } else { Ap ap; if ((ap = this.Io0) != null && ap
/* 24 */         .fr0 == this) ap
/* 25 */           .ra0();  }  } public final void xy0() { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield switch : Z
/*    */     //   4: ifeq -> 47
/*    */     //   7: aload_0
/*    */     //   8: getfield lo0 : Lf/JG0;
/*    */     //   11: ifnonnull -> 47
/*    */     //   14: aload_0
/*    */     //   15: dup
/*    */     //   16: new f/JG0
/*    */     //   19: dup
/*    */     //   20: aload_0
/*    */     //   21: swap
/*    */     //   22: dup
/*    */     //   23: aload_0
/*    */     //   24: getfield O : Lf/Sa0;
/*    */     //   27: iconst_1
/*    */     //   28: invokespecial <init> : (Lf/Sa0;Z)V
/*    */     //   31: putfield lo0 : Lf/JG0;
/*    */     //   34: ldc_w 'resizeHandle'
/*    */     //   37: invokevirtual Xu : (Ljava/lang/String;)V
/*    */     //   40: getfield lo0 : Lf/JG0;
/*    */     //   43: iconst_0
/*    */     //   44: invokevirtual si : (Lf/JG0;I)V
/*    */     //   47: aload_0
/*    */     //   48: getfield lo0 : Lf/JG0;
/*    */     //   51: dup
/*    */     //   52: astore_1
/*    */     //   53: ifnull -> 213
/*    */     //   56: aload_0
/*    */     //   57: getfield Gj0 : I
/*    */     //   60: ifle -> 88
/*    */     //   63: aload_0
/*    */     //   64: getfield su : I
/*    */     //   67: ifle -> 79
/*    */     //   70: aload_0
/*    */     //   71: bipush #6
/*    */     //   73: putfield sc : I
/*    */     //   76: goto -> 110
/*    */     //   79: aload_0
/*    */     //   80: bipush #7
/*    */     //   82: putfield sc : I
/*    */     //   85: goto -> 110
/*    */     //   88: aload_0
/*    */     //   89: getfield su : I
/*    */     //   92: ifle -> 104
/*    */     //   95: aload_0
/*    */     //   96: bipush #9
/*    */     //   98: putfield sc : I
/*    */     //   101: goto -> 110
/*    */     //   104: aload_0
/*    */     //   105: bipush #8
/*    */     //   107: putfield sc : I
/*    */     //   110: aload_0
/*    */     //   111: dup
/*    */     //   112: aload_1
/*    */     //   113: invokevirtual mM : ()V
/*    */     //   116: getfield lo0 : Lf/JG0;
/*    */     //   119: astore_1
/*    */     //   120: getfield Gj0 : I
/*    */     //   123: dup
/*    */     //   124: istore_2
/*    */     //   125: ifge -> 138
/*    */     //   128: aload_0
/*    */     //   129: invokevirtual Xq : ()I
/*    */     //   132: iload_2
/*    */     //   133: iadd
/*    */     //   134: istore_2
/*    */     //   135: goto -> 145
/*    */     //   138: aload_0
/*    */     //   139: getfield Kd : I
/*    */     //   142: iload_2
/*    */     //   143: iadd
/*    */     //   144: istore_2
/*    */     //   145: aload_0
/*    */     //   146: getfield su : I
/*    */     //   149: dup
/*    */     //   150: istore_3
/*    */     //   151: ifge -> 164
/*    */     //   154: aload_0
/*    */     //   155: invokevirtual yR : ()I
/*    */     //   158: iload_3
/*    */     //   159: iadd
/*    */     //   160: istore_3
/*    */     //   161: goto -> 171
/*    */     //   164: aload_0
/*    */     //   165: getfield er0 : I
/*    */     //   168: iload_3
/*    */     //   169: iadd
/*    */     //   170: istore_3
/*    */     //   171: aload_0
/*    */     //   172: dup
/*    */     //   173: aload_1
/*    */     //   174: iload_2
/*    */     //   175: iload_3
/*    */     //   176: invokevirtual ME : (II)Z
/*    */     //   179: pop
/*    */     //   180: getfield lo0 : Lf/JG0;
/*    */     //   183: astore_1
/*    */     //   184: getfield switch : Z
/*    */     //   187: ifeq -> 203
/*    */     //   190: aload_0
/*    */     //   191: getfield Xo : I
/*    */     //   194: iconst_4
/*    */     //   195: if_icmpne -> 203
/*    */     //   198: iconst_1
/*    */     //   199: istore_0
/*    */     //   200: goto -> 205
/*    */     //   203: iconst_0
/*    */     //   204: istore_0
/*    */     //   205: aload_1
/*    */     //   206: iload_0
/*    */     //   207: invokevirtual wI0 : (Z)V
/*    */     //   210: goto -> 218
/*    */     //   213: aload_0
/*    */     //   214: iconst_1
/*    */     //   215: putfield sc : I
/*    */     //   218: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 24
/*    */     //   #2	-> 28
/*    */     //   #3	-> 129
/*    */     //   #4	-> 139
/*    */     //   #5	-> 146
/*    */     //   #6	-> 155
/*    */     //   #7	-> 165
/*    */     //   #8	-> 176
/*    */     //   #9	-> 180 } public void pm() { pRn pRn1 = pRn.WHITE; EI0(this, this.aG0); }
/* 26 */   public boolean i2(oa0 paramoa0) { JG0 jG01; int j; if (paramoa0.cz0 == 7) { j = 1; } else { j = 0; }  JG0 jG03; if (j && (jG03 = this.lo0) != null && jG03.dP) jG03.O.gf0(Ap.b00, false);  int k; if (this.zi0 != (k = 1)) { if (paramoa0.Ud()) { this.zi0 = k; } else if (paramoa0.cz0 == 6) { JG0 jG0; int n = paramoa0.aK - this.bw; j = paramoa0.gk0 - this.W7; k = AW(); int i1 = HY(), i3 = Hj(); int i2; if ((i2 = W3()) > 0 && i2 < k) i2 = k;  if (i3 > 0 && i3 < i1) i3 = i1;  int i4 = this.ti, i5 = this.TM, i6 = this.nK0, i7 = this.U40; switch (Zk0.yE(this.zi0)) { case 9: if ((jG0 = this.fr0) != null) { k = jG0.RS(); i4 = Math.max(k, Math.min(i2 - (k = this.nK0 - this.ti), i4 + n)); i6 = Math.min(i2 = this.fr0.m40(), Math.max(k + k, i6 + n)); break; }  i4 += n; i6 += n; break;case 3: case 6: case 7: i6 = Math.max(i6 + n, i4 + k); if (i2 > 0) i6 = Math.min(i6, Math.max(this.nK0, i4 + i2));  break;case 1: case 5: case 8: i4 = Math.min(i4 + n, i6 - k); if (i2 > 0) i4 = Math.max(i4, Math.min(this.ti, i6 - i2));  break; }  switch (Zk0.yE(this.zi0)) { case 9: if ((jG01 = this.fr0) != null) { int i8 = jG01.e3(); i5 = Math.max(i8, Math.min(k - (i8 = this.U40 - this.TM), i5 + j)); i7 = Math.min(k = this.fr0.mD(), Math.max(i8 + i8, i7 + j)); break; }  i5 += j; i7 += j; break;case 4: case 7: case 8: i7 = Math.max(i7 + j, i5 + i1); if (i3 > 0) i7 = Math.min(i7, Math.max(this.U40, i5 + i3));  break;case 2: case 5: case 6: i5 = Math.min(i5 + j, i7 - i1); if (i3 > 0) i5 = Math.max(i5, Math.min(this.TM, i7 - i3));  break; }  if ((jG01 = this.fr0) != null) { i5 = Math.max(i5, jG01.e3()); i4 = Math.max(i4, jG01.RS()); i6 = Math.min(i6, jG01.m40()); i7 = Math.min(i7, jG01.mD()); }  ME(i4, i5); Tm(Math.max(AW(), i6 - i4), Math.max(HY(), i7 - i5)); }  return true; }  JG0 jG02; if (j == 0 && (jG02 = this.lo0) != null && jG02.dP) { Ll ll = Ap.b00;
/* 27 */       int n = ((oa0)jG01).aK;
/*    */ 
/*    */       
/* 30 */       jG02.O.gf0(ll, jG02.mu0(n, ((oa0)jG01).gk0)); }
/*    */ 
/*    */ 
/*    */     
/* 34 */     int i = ((oa0)jG01).aK;
/* 35 */     int m = ((oa0)jG01).gk0;
/* 36 */     this.bw = i; this.W7 = m;
/*    */     
/* 38 */     this.ti = this.Kd;
/*    */     
/* 40 */     this.TM = this.er0; this.nK0 = Xq(); this.U40 = yR(); this.zi0 = i; if (!((oa0)jG01).Ua && ((oa0)jG01).cz0 == 3 && ((oa0)jG01).vl == 0 && (((i = LPT4(i, m)) != k))) return true;  if (super
/* 41 */       .i2((oa0)jG01)) return true; 
/* 42 */     return B8.Pg(((oa0)jG01).cz0); }
/*    */ 
/*    */   
/*    */   public void GD() {
/*    */     if (!this.q50 && this.dP) {
/*    */       pRn pRn1 = this.sY;
/*    */       EI0(this, this.tp);
/*    */     } 
/*    */   }
/*    */   
/*    */   public int AW() {
/*    */     int i;
/*    */     byte b;
/*    */     int j;
/*    */     for (i = super.AW(), b = 0, j = Ub(); b < j; ) {
/*    */       JG0 jG0;
/*    */       if (!dm0(jG0 = lPt3(b))) {
/*    */         i = jG0.AW();
/*    */         i = Math.max(i, Ho() + i);
/*    */       } 
/*    */       b++;
/*    */     } 
/*    */     Ap ap;
/*    */     if ((ap = this.Io0) != null && ap.fr0 == this) {
/*    */       j = 1;
/*    */     } else {
/*    */       j = 0;
/*    */     } 
/*    */     if (j != 0 && this.Oi0 < 0)
/*    */       i = Math.max(i, ap.J50() + this.wb - this.Oi0); 
/*    */     return i;
/*    */   }
/*    */   
/*    */   public int HY() {
/*    */     int i = super.HY();
/*    */     byte b = 0;
/*    */     int j = Ub();
/*    */     while (b < j) {
/*    */       JG0 jG0;
/*    */       if (!dm0(jG0 = lPt3(b))) {
/*    */         i = jG0.HY();
/*    */         i = Math.max(i, Et() + i);
/*    */       } 
/*    */       b++;
/*    */     } 
/*    */     return i;
/*    */   }
/*    */   
/*    */   public final int W3() {
/*    */     int i = this.fu;
/*    */     byte b = 0;
/*    */     for (int j = Ub(); b < j; ) {
/*    */       int k = Ho() + k;
/*    */       JG0 jG0;
/*    */       if (!dm0(jG0 = lPt3(b)) && (k = jG0.W3()) > 0 && (i == 0 || k < i))
/*    */         i = k; 
/*    */       b++;
/*    */     } 
/*    */     return i;
/*    */   }
/*    */   
/*    */   public final int Hj() {
/*    */     int i = this.Rr;
/*    */     byte b = 0;
/*    */     for (int j = Ub(); b < j; ) {
/*    */       int k = Et() + k;
/*    */       JG0 jG0;
/*    */       if (!dm0(jG0 = lPt3(b)) && (k = jG0.Hj()) > 0 && (i == 0 || k < i))
/*    */         i = k; 
/*    */       b++;
/*    */     } 
/*    */     return i;
/*    */   }
/*    */   
/*    */   public final int R80() {
/*    */     int i = 0;
/*    */     byte b = 0;
/*    */     int j = Ub();
/*    */     while (b < j) {
/*    */       JG0 jG0;
/*    */       if (!dm0(jG0 = lPt3(b)))
/*    */         i = Math.max(i, jG0.J50()); 
/*    */       b++;
/*    */     } 
/*    */     return i;
/*    */   }
/*    */   
/*    */   public final int J50() {
/*    */     boolean bool;
/*    */     int i = super.J50();
/*    */     Ap ap;
/*    */     if ((ap = this.Io0) != null && ap.fr0 == this) {
/*    */       bool = true;
/*    */     } else {
/*    */       bool = false;
/*    */     } 
/*    */     if (bool && this.Oi0 < 0)
/*    */       i = Math.max(i, ap.J50() + this.wb - this.Oi0); 
/*    */     return i;
/*    */   }
/*    */   
/*    */   public final int tJ0() {
/*    */     int i = 0;
/*    */     byte b = 0;
/*    */     int j = Ub();
/*    */     while (b < j) {
/*    */       JG0 jG0;
/*    */       if (!dm0(jG0 = lPt3(b)))
/*    */         i = Math.max(i, jG0.tj0()); 
/*    */       b++;
/*    */     } 
/*    */     return i;
/*    */   }
/*    */   
/*    */   public void mM() {
/*    */     SM();
/*    */     super.mM();
/*    */   }
/*    */   
/*    */   public final JE0 pB0(oa0 paramoa0) {
/*    */     int i = paramoa0.aK;
/*    */     int j;
/*    */     boolean bool;
/*    */     if ((j = this.zi0) == (bool = true) && (j = LPT4(i, paramoa0.gk0)) == bool)
/*    */       return this.v10; 
/*    */     return this.sT[Zk0.yE(j)];
/*    */   }
/*    */   
/*    */   public final int LPT4(int paramInt1, int paramInt2) {
/*    */     boolean bool1;
/*    */     boolean bool2;
/*    */     boolean bool3;
/*    */     boolean bool4;
/*    */     if (paramInt1 < RS()) {
/*    */       bool1 = true;
/*    */     } else {
/*    */       bool1 = false;
/*    */     } 
/*    */     if (paramInt1 >= m40()) {
/*    */       bool2 = true;
/*    */     } else {
/*    */       bool2 = false;
/*    */     } 
/*    */     if (paramInt2 < e3()) {
/*    */       bool3 = true;
/*    */     } else {
/*    */       bool3 = false;
/*    */     } 
/*    */     if (paramInt2 >= mD()) {
/*    */       bool4 = true;
/*    */     } else {
/*    */       bool4 = false;
/*    */     } 
/*    */     Ap ap;
/*    */     if ((ap = this.Io0) != null && ap.fr0 == this) {
/*    */       if (ap.mu0(paramInt1, paramInt2))
/*    */         return this.dy ? 10 : 1; 
/*    */       if (paramInt2 < this.Io0.er0) {
/*    */         bool3 = true;
/*    */       } else {
/*    */         bool3 = false;
/*    */       } 
/*    */     } 
/*    */     if (this.fs0) {
/*    */       if (mu0(paramInt1, paramInt2))
/*    */         return this.dy ? 10 : 1; 
/*    */       if (paramInt2 < this.er0) {
/*    */         bool3 = true;
/*    */       } else {
/*    */         bool3 = false;
/*    */       } 
/*    */     } 
/*    */     if ((ap = this.Ki) != null && ap.dP && ap.mu0(paramInt1, paramInt2))
/*    */       return 1; 
/*    */     if (this.Xo == 1)
/*    */       return 1; 
/*    */     JG0 jG0;
/*    */     if ((jG0 = this.lo0) != null && jG0.dP && jG0.mu0(paramInt1, paramInt2))
/*    */       return this.sc; 
/*    */     int i;
/*    */     if (!Kr.q00(i = this.Xo)) {
/*    */       bool1 = false;
/*    */       bool2 = false;
/*    */     } 
/*    */     if (!Kr.C4(i)) {
/*    */       bool3 = false;
/*    */       bool4 = false;
/*    */     } 
/*    */     return bool1 ? (bool3 ? 6 : (bool4 ? 9 : 2)) : (bool2 ? (bool3 ? 7 : (bool4 ? 8 : 4)) : (bool3 ? 3 : (bool4 ? 5 : 1)));
/*    */   }
/*    */   
/*    */   public final void EP(int paramInt) {
/*    */     if (paramInt != 0) {
/*    */       this.Xo = paramInt;
/*    */       if (this.lo0 != null)
/*    */         xy0(); 
/*    */       return;
/*    */     } 
/*    */     throw new NullPointerException("resizableAxis");
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Wr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */