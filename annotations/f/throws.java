/*  1 */ package f;public class throws extends JG0 { public static final NC0 Qa0; public static final int BE; public int rI = 1000; public int bJ = 100; public final VI IB0; public final L8 UG; public final lpT4 xr; public long fC; public int Q30; public JG0 r70; public boolean RF; public final oa0 lO; public boolean QY; public boolean l30; public int Ek; public int LH0 = -1; public int UI0; public int po; public int wr; public int Et0; public int yi0; public int IG0; public long JL0; public long else; public long HH; public final void final() { tl0 tl02; if ((tl02 = this.Zt).dP) { this
/*  2 */         .V00 = this.fC; this.ax = true; }  tl02.wI0(false); this.Sw0 = null; tl0 tl01; if (this.lF
/*  3 */       .fr0 != (
/*  4 */       tl01 = this.Zt)) super.gx();  } public long EJ0; public int El0; public boolean ip0; public JG0 F20; public JG0 vD; public JG0 kg0; public int t2 = 60; public boolean Kd; public jo0 Lc; public final JG0 i70; public final tl0 Zt; public final dQ lF; public JG0 Sw0; public boolean ax; public long V00; public final ArrayList BT; public final Object zr0; public Runnable[] AT; public int ey; public Runnable[] vl; public ny ZX; public boolean xQ; static { Qa0 = new NC0(); BE = yl.fX() ? 10 : 3; } public throws(JG0 paramJG0, tw paramtw, JP paramJP, xR paramxR, Tm paramTm) { if (paramJG0 != null) { if (paramtw != null) { this.Bo0 = this; this.IB0 = paramtw; this.UG = paramJP; this.xr = paramxR; this.lO = new oa0(); this.r70 = paramJG0; paramJG0.Vo(); this(); this.i70 = paramJG0; (paramJG0 = new JG0()).Xu(""); this.lF = new dQ(); this(); this.Zt = tl01; tl0 tl01; (tl01 = new tl0()).wI0(false); this.BT = new ArrayList(); Executors.newSingleThreadExecutor(new CG0()); this.zr0 = new Object(); this.AT = new Runnable[16]; this.vl = new Runnable[16]; this.ZX = paramTm; Xu(""); Vo(); R8(); super.si(paramJG0, 0); super.si(tl01, 1); super.si(paramJG0, 0); Js0(); return; }  throw new IllegalArgumentException("renderer is null"); }  throw new IllegalArgumentException("rootPane is null"); } public final JG0 LPT5() { return lPt3(Ub() - 3); } public final String TI() { return "gui"; } public final void XX(dS paramdS) { if (paramdS != null) { super.XX(paramdS); return; }  throw new IllegalArgumentException("themeManager is null"); } public final int Zs0() { return this.rI; } public final void Pb0(int paramInt) { if (paramInt >= 1) { this.rI = paramInt; return; }  throw new IllegalArgumentException("tooltipDelay"); } public final int YR() { return 0; } public final int t8() { return 0; } public final void si(JG0 paramJG0, int paramInt) { throw new UnsupportedOperationException(); } public final void gx() { throw new UnsupportedOperationException(); } public final JG0 fG0(int paramInt) { throw new UnsupportedOperationException(); } public final void mM() {} public final void d40() { S20(this.r70); } public final void uW() { if (this.RF) { boolean bool; for (byte b = 0; (bool = this.RF) && b < 'Ϩ'; ) { this.RF = false; super.uW(); b++; }  ArrayList arrayList = null; if (bool) { this(); A90(arrayList); }  lI.wb().getClass(); if (arrayList != null) { lI.u4.severe("layout loop detected - printing"); byte b1 = 1; for (JG0 jG0 : arrayList) { lI.u4.severe(b1 + ": " + jG0); b1++; }  }  }  } public final void R8() { VI vI; Tm(((tw)(vI = this.IB0)).ck0, ((tw)this).za); } public void update() { R8(); long l; this.Q30 = Math.max(0, (int)((l = System.currentTimeMillis()) - this.fC)); this.fC = l; int i; if ((i = this.El0) != 0 && l - this.EJ0 > i) { this.EJ0 = l; this.El0 = 33; this.lO.sj = true; W50(9); }  MH0(); QF(); Pp(); uW(); LW(); } public final void Js0() { this.Q30 = 0; } public final void QF() { for (byte b = 0; b < this.BT.size(); ) { boolean bool; fx0 fx0 = this.BT.get(b); int i; if ((i = fx0.Sa0 - this.Q30) <= 0) { int j = fx0.bo ^ true; fx0.Sa0 = -1; Runnable runnable; if ((runnable = fx0.NY) != null) try { runnable.run(); } finally { runnable = null; }   int k; if ((k = fx0.Sa0) == -3 || (j != 0 && k != -2)) { fx0.Sa0 = 0; bool = false; } else { bool.Sa0 = Math.max(1, i + bool.package); bool = true; }  } else { bool.Sa0 = i; bool = true; }  if (!bool) { this
/*  5 */           .BT.remove(b); continue; }  b++; }  } public final void Pp() { Runnable[] arrayOfRunnable = null; synchronized (this.zr0) { int j; if ((j = this.ey) > 0) { this.ey = 0; arrayOfRunnable = this.AT; this.AT = this.vl; this.vl = arrayOfRunnable; }  int i = 0; while (i < j) { arrayOfRunnable[i++] = null; try {  } finally { null = null; }  }  return; }  } public final void VB() { tw tw; if ((tw = (tw)this.IB0).ck0 <= 0 || tw.za <= 0) {  } else { tw.jg = false; tw.Ma = tw.HA0; tw.f20.QE = 0; }  if (true) { if (this.xQ)
/*    */       
/*    */       { 
/*  8 */         Matrix4 matrix4 = this.ZX.VD0;
/*  9 */         tw.Rq.D70
/* 10 */           .getClass();
/* 11 */         tw.Rq.D70.Qw(matrix4.Z0);
/* 12 */         tw.Rq.dA0 = true;
/* 13 */         tw.Rq.d8(F1.IF0); }  try { V90(this); JG0 jG0; if (this.l30 && (jG0 = this.F20) != null) { int i = this.lO.aK, j = this.lO.gk0, k = this.lO.com8; jG0.Ve(this, i, j, k); }
/*    */          }
/*    */       finally
/*    */       
/* 17 */       { if (this
/* 18 */           .xQ)
/* 19 */           ((tw)this.IB0)
/* 20 */             .Rq
/* 21 */             .end();  ((tw)this.IB0).com9(); }
/*    */        }
/*    */      }
/*    */ 
/*    */   
/*    */   public boolean Qg0(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
/*    */     boolean bool1;
/*    */     float f1 = paramInt1, f2 = paramInt2;
/*    */     nC0.x = f1;
/*    */     nC0.y = f2;
/*    */     ((tw)this.IB0).P9.qD0(nC0);
/*    */     NC0 nC0;
/*    */     int i = (int)(nC0 = Qa0).x, j = (int)Qa0.y;
/*    */     long l = this.fC;
/*    */     this.else = l;
/*    */     oa0 oa01;
/*    */     (oa01 = this.lO).vl = paramInt3;
/*    */     int k, m = (k = this.lO.com8) & 0x1C0;
/*    */     char c = Character.MIN_VALUE;
/*    */     if (paramInt3 != 0) {
/*    */       if (paramInt3 != 1) {
/*    */         if (paramInt3 == 2)
/*    */           c = 'Ā'; 
/*    */       } else {
/*    */         c = '';
/*    */       } 
/*    */     } else {
/*    */       c = '@';
/*    */     } 
/*    */     if (paramBoolean) {
/*    */       oa01.com8 = k | c;
/*    */     } else {
/*    */       oa01.com8 = k & (c ^ 0xFFFFFFFF);
/*    */     } 
/*    */     if ((m & c) != 0) {
/*    */       bool1 = true;
/*    */     } else {
/*    */       bool1 = false;
/*    */     } 
/*    */     uP uP;
/*    */     (uP = ((tw)this.IB0).S5).getClass();
/*    */     if (c != '\000' && paramInt3 >= 0 && paramInt3 < 3 && uP.gl[paramInt3] != paramBoolean) {
/*    */       uP.jO[paramInt3] = System.currentTimeMillis();
/*    */       uP.gl[paramInt3] = paramBoolean;
/*    */     } 
/*    */     boolean bool2;
/*    */     if ((bool2 = this.l30) || m == 0) {
/*    */       this.lO.aK = i;
/*    */       this.lO.gk0 = j;
/*    */     } else {
/*    */       this.lO.aK = this.UI0;
/*    */       this.lO.gk0 = this.po;
/*    */     } 
/*    */     bool2 = false;
/*    */     boolean bool = false;
/*    */     if (!bool2)
/*    */       if (!mu0(i, j)) {
/*    */         paramBoolean = false;
/*    */         this.Ek = 0;
/*    */         if (this.QY) {
/*    */           MW(7, null);
/*    */           this.QY = false;
/*    */         } 
/*    */       } else {
/*    */         this.QY = true;
/*    */         if (!this.QY && MW(1, null) != null)
/*    */           bool2 = true; 
/*    */       }  
/*    */     if (i != this.wr || j != this.Et0) {
/*    */       JG0 jG0;
/*    */       this.wr = i;
/*    */       this.Et0 = j;
/*    */       int n;
/*    */       if (m != 0 && !this.l30 && (Math.abs(i - this.UI0) > (n = BE) || Math.abs(j - this.po) > n)) {
/*    */         this.l30 = true;
/*    */         this.Ek = 0;
/*    */         final();
/*    */         this.ax = false;
/*    */         this.Sw0 = this.F20;
/*    */       } 
/*    */       if (this.l30) {
/*    */         if ((jG0 = this.F20) != null)
/*    */           MW(6, jG0); 
/*    */       } else if (jG0 == null && MW(2, null) != null) {
/*    */         bool2 = true;
/*    */       } 
/*    */     } 
/*    */     if (c != '\000' && paramBoolean != bool1) {
/*    */       if (paramBoolean) {
/*    */         if (this.LH0 < 0) {
/*    */           this.UI0 = i;
/*    */           this.po = j;
/*    */           this.LH0 = paramInt3;
/*    */           this.F20 = MW(3, null);
/*    */         } else {
/*    */           JG0 jG01;
/*    */           if ((jG01 = this.F20) != null)
/*    */             MW(3, jG01); 
/*    */         } 
/*    */       } else {
/*    */         MW(4, jG01);
/*    */         JG0 jG01;
/*    */         if (this.LH0 >= 0 && (jG01 = this.F20) != null && (this.ip0 || !yl.fX()))
/*    */           bool = true; 
/*    */       } 
/*    */       JG0 jG0;
/*    */       if ((jG0 = this.F20) != null)
/*    */         bool2 = true; 
/*    */       if (paramInt3 == 0 && !this.ip0 && !paramBoolean && !this.l30) {
/*    */         if (this.Ek == 0 || this.fC - this.HH > 500L || this.vD != jG0) {
/*    */           this.yi0 = i;
/*    */           this.IG0 = j;
/*    */           this.vD = jG0;
/*    */           this.Ek = 0;
/*    */           this.HH = this.fC;
/*    */         } 
/*    */         if (Math.abs(i - this.yi0) < (i = BE) && Math.abs(j - this.IG0) < i) {
/*    */           oa02.aK = this.yi0;
/*    */           oa02.gk0 = this.IG0;
/*    */           int n = this.Ek + 1;
/*    */           oa0 oa02;
/*    */           (oa02 = this.lO).uC = n;
/*    */           this.HH = this.fC;
/*    */           JG0 jG01;
/*    */           if ((jG01 = this.vD) != null)
/*    */             MW(5, jG01); 
/*    */         } else {
/*    */           this.vD = null;
/*    */         } 
/*    */       } 
/*    */     } 
/*    */     if (this.lO.Ud()) {
/*    */       if (this.l30) {
/*    */         this.l30 = false;
/*    */         MW(2, null);
/*    */       } 
/*    */       this.LH0 = -1;
/*    */     } 
/*    */     if (bool && yl.fX())
/*    */       this.F20 = null; 
/*    */     return bool2;
/*    */   }
/*    */   
/*    */   public final boolean G50(int paramInt, char paramChar, boolean paramBoolean1, boolean paramBoolean2) {
/*    */     oa01.GG0 = paramInt;
/*    */     oa01.Z9 = paramChar;
/*    */     oa01.sj = false;
/*    */     oa0 oa01;
/*    */     (oa01 = this.lO).Q5 = paramBoolean2;
/*    */     this.EJ0 = this.fC;
/*    */     if (paramInt != 0 || paramChar != '\000') {
/*    */       if (paramInt != 129) {
/*    */         if (paramInt != 130) {
/*    */           switch (paramInt) {
/*    */             case 60:
/*    */               paramInt = 8;
/*    */               if (paramBoolean1) {
/*    */                 oa01.com8 |= paramInt;
/*    */                 break;
/*    */               } 
/*    */             case 59:
/*    */               paramInt = 1;
/*    */               if (paramBoolean1) {
/*    */                 oa01.com8 |= paramInt;
/*    */                 break;
/*    */               } 
/*    */             case 58:
/*    */               paramInt = 1024;
/*    */               if (paramBoolean1) {
/*    */                 oa01.com8 |= paramInt;
/*    */                 break;
/*    */               } 
/*    */             case 57:
/*    */               paramInt = 512;
/*    */               if (paramBoolean1) {
/*    */                 oa01.com8 |= paramInt;
/*    */                 break;
/*    */               } 
/*    */           } 
/*    */         } else {
/*    */           paramInt = 32;
/*    */           if (paramBoolean1) {
/*    */             oa01.com8 |= paramInt;
/*    */             break;
/*    */           } 
/*    */         } 
/*    */       } else {
/*    */         paramInt = 4;
/*    */         if (paramBoolean1) {
/*    */           oa01.com8 |= paramInt;
/*    */           break;
/*    */         } 
/*    */       } 
/*    */       if (paramBoolean1) {
/*    */         this.El0 = 250;
/*    */         return W50(9);
/*    */       } 
/*    */       this.El0 = 0;
/*    */       return W50(10);
/*    */     } 
/*    */     this.El0 = 0;
/*    */     return false;
/*    */   }
/*    */   
/*    */   public final void MH0() {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: invokevirtual LPT5 : ()Lf/JG0;
/*    */     //   4: invokevirtual gg : ()Lf/JG0;
/*    */     //   7: dup
/*    */     //   8: astore_1
/*    */     //   9: aload_0
/*    */     //   10: getfield Sw0 : Lf/JG0;
/*    */     //   13: if_acmpeq -> 617
/*    */     //   16: aload_1
/*    */     //   17: ifnull -> 613
/*    */     //   20: aload_0
/*    */     //   21: getfield fC : J
/*    */     //   24: aload_0
/*    */     //   25: getfield else : J
/*    */     //   28: lsub
/*    */     //   29: aload_1
/*    */     //   30: invokevirtual Zs0 : ()I
/*    */     //   33: i2l
/*    */     //   34: lcmp
/*    */     //   35: ifgt -> 63
/*    */     //   38: aload_0
/*    */     //   39: getfield ax : Z
/*    */     //   42: ifeq -> 613
/*    */     //   45: aload_0
/*    */     //   46: getfield fC : J
/*    */     //   49: aload_0
/*    */     //   50: getfield V00 : J
/*    */     //   53: lsub
/*    */     //   54: aload_0
/*    */     //   55: getfield bJ : I
/*    */     //   58: i2l
/*    */     //   59: lcmp
/*    */     //   60: ifge -> 613
/*    */     //   63: aload_1
/*    */     //   64: aload_0
/*    */     //   65: aload_1
/*    */     //   66: dup
/*    */     //   67: dup
/*    */     //   68: getfield Kd : I
/*    */     //   71: istore_2
/*    */     //   72: getfield xY : I
/*    */     //   75: iconst_2
/*    */     //   76: idiv
/*    */     //   77: iload_2
/*    */     //   78: iadd
/*    */     //   79: istore_2
/*    */     //   80: getfield er0 : I
/*    */     //   83: istore_3
/*    */     //   84: getfield lO : Lf/oa0;
/*    */     //   87: dup
/*    */     //   88: getfield aK : I
/*    */     //   91: istore #4
/*    */     //   93: getfield gk0 : I
/*    */     //   96: iload #4
/*    */     //   98: swap
/*    */     //   99: invokevirtual t2 : (II)Ljava/lang/Object;
/*    */     //   102: dup
/*    */     //   103: astore #4
/*    */     //   105: aload_1
/*    */     //   106: getfield xc : Lf/et;
/*    */     //   109: astore #5
/*    */     //   111: ifnonnull -> 121
/*    */     //   114: aload_0
/*    */     //   115: invokevirtual final : ()V
/*    */     //   118: goto -> 617
/*    */     //   121: aload_1
/*    */     //   122: getfield Az0 : Ljava/lang/String;
/*    */     //   125: invokevirtual isEmpty : ()Z
/*    */     //   128: ifne -> 156
/*    */     //   131: aload_0
/*    */     //   132: dup
/*    */     //   133: aload_1
/*    */     //   134: getfield Az0 : Ljava/lang/String;
/*    */     //   137: astore #6
/*    */     //   139: getfield Zt : Lf/tl0;
/*    */     //   142: aload #6
/*    */     //   144: invokevirtual Xu : (Ljava/lang/String;)V
/*    */     //   147: getfield Zt : Lf/tl0;
/*    */     //   150: invokevirtual cZ : ()V
/*    */     //   153: goto -> 166
/*    */     //   156: aload_0
/*    */     //   157: dup
/*    */     //   158: ldc_w 'tooltipwindow'
/*    */     //   161: astore #6
/*    */     //   163: goto -> 139
/*    */     //   166: aload #4
/*    */     //   168: instanceof java/lang/String
/*    */     //   171: ifeq -> 250
/*    */     //   174: aload #4
/*    */     //   176: checkcast java/lang/String
/*    */     //   179: dup
/*    */     //   180: astore #4
/*    */     //   182: invokevirtual length : ()I
/*    */     //   185: ifne -> 191
/*    */     //   188: goto -> 284
/*    */     //   191: aload_0
/*    */     //   192: getfield lF : Lf/dQ;
/*    */     //   195: getfield fr0 : Lf/JG0;
/*    */     //   198: aload_0
/*    */     //   199: getfield Zt : Lf/tl0;
/*    */     //   202: dup
/*    */     //   203: astore #6
/*    */     //   205: if_acmpeq -> 233
/*    */     //   208: aload_0
/*    */     //   209: aload #6
/*    */     //   211: invokevirtual gx : ()V
/*    */     //   214: getfield Zt : Lf/tl0;
/*    */     //   217: dup
/*    */     //   218: aload_0
/*    */     //   219: getfield lF : Lf/dQ;
/*    */     //   222: astore #6
/*    */     //   224: invokevirtual Ub : ()I
/*    */     //   227: aload #6
/*    */     //   229: swap
/*    */     //   230: invokevirtual si : (Lf/JG0;I)V
/*    */     //   233: aload_0
/*    */     //   234: getfield lF : Lf/dQ;
/*    */     //   237: dup
/*    */     //   238: aconst_null
/*    */     //   239: putfield td0 : Lf/mX;
/*    */     //   242: aload #4
/*    */     //   244: invokevirtual E1 : (Ljava/lang/String;)V
/*    */     //   247: goto -> 312
/*    */     //   250: aload #4
/*    */     //   252: instanceof f/JG0
/*    */     //   255: ifeq -> 602
/*    */     //   258: aload #4
/*    */     //   260: checkcast f/JG0
/*    */     //   263: dup
/*    */     //   264: astore #4
/*    */     //   266: getfield fr0 : Lf/JG0;
/*    */     //   269: dup
/*    */     //   270: astore #6
/*    */     //   272: ifnull -> 291
/*    */     //   275: aload #6
/*    */     //   277: aload_0
/*    */     //   278: getfield Zt : Lf/tl0;
/*    */     //   281: if_acmpeq -> 291
/*    */     //   284: aload_0
/*    */     //   285: invokevirtual final : ()V
/*    */     //   288: goto -> 617
/*    */     //   291: aload_0
/*    */     //   292: dup
/*    */     //   293: getfield Zt : Lf/tl0;
/*    */     //   296: invokevirtual gx : ()V
/*    */     //   299: getfield Zt : Lf/tl0;
/*    */     //   302: dup
/*    */     //   303: aload #4
/*    */     //   305: swap
/*    */     //   306: invokevirtual Ub : ()I
/*    */     //   309: invokevirtual si : (Lf/JG0;I)V
/*    */     //   312: aload_0
/*    */     //   313: dup
/*    */     //   314: getfield Zt : Lf/tl0;
/*    */     //   317: invokevirtual mM : ()V
/*    */     //   320: getfield Zt : Lf/tl0;
/*    */     //   323: dup
/*    */     //   324: astore #4
/*    */     //   326: getfield kM : I
/*    */     //   329: ifeq -> 338
/*    */     //   332: iconst_1
/*    */     //   333: istore #6
/*    */     //   335: goto -> 341
/*    */     //   338: iconst_0
/*    */     //   339: istore #6
/*    */     //   341: iload #6
/*    */     //   343: ifeq -> 351
/*    */     //   346: aload #4
/*    */     //   348: invokevirtual mM : ()V
/*    */     //   351: aload #5
/*    */     //   353: aload_0
/*    */     //   354: getfield Zt : Lf/tl0;
/*    */     //   357: dup
/*    */     //   358: getfield xY : I
/*    */     //   361: istore #4
/*    */     //   363: getfield HC : I
/*    */     //   366: istore #6
/*    */     //   368: invokevirtual ordinal : ()I
/*    */     //   371: tableswitch default -> 416, 1 -> 427, 2 -> 419, 3 -> 427, 4 -> 427, 5 -> 416, 6 -> 419, 7 -> 416, 8 -> 419
/*    */     //   416: goto -> 434
/*    */     //   419: iload_2
/*    */     //   420: iload #4
/*    */     //   422: isub
/*    */     //   423: istore_2
/*    */     //   424: goto -> 434
/*    */     //   427: iload_2
/*    */     //   428: iload #4
/*    */     //   430: iconst_2
/*    */     //   431: idiv
/*    */     //   432: isub
/*    */     //   433: istore_2
/*    */     //   434: aload #5
/*    */     //   436: invokevirtual ordinal : ()I
/*    */     //   439: tableswitch default -> 488, 0 -> 499, 1 -> 499, 2 -> 499, 3 -> 488, 4 -> 491, 5 -> 488, 6 -> 488, 7 -> 491, 8 -> 491
/*    */     //   488: goto -> 506
/*    */     //   491: iload_3
/*    */     //   492: iload #6
/*    */     //   494: isub
/*    */     //   495: istore_3
/*    */     //   496: goto -> 506
/*    */     //   499: iload_3
/*    */     //   500: iload #6
/*    */     //   502: iconst_2
/*    */     //   503: idiv
/*    */     //   504: isub
/*    */     //   505: istore_3
/*    */     //   506: aload_1
/*    */     //   507: invokevirtual YR : ()I
/*    */     //   510: iload_2
/*    */     //   511: iadd
/*    */     //   512: dup
/*    */     //   513: istore_2
/*    */     //   514: iload #4
/*    */     //   516: aload_1
/*    */     //   517: invokevirtual t8 : ()I
/*    */     //   520: iload_3
/*    */     //   521: iadd
/*    */     //   522: istore_3
/*    */     //   523: iadd
/*    */     //   524: aload_0
/*    */     //   525: getfield xY : I
/*    */     //   528: dup
/*    */     //   529: istore #5
/*    */     //   531: if_icmple -> 540
/*    */     //   534: iload #5
/*    */     //   536: iload #4
/*    */     //   538: isub
/*    */     //   539: istore_2
/*    */     //   540: iload_3
/*    */     //   541: iload #6
/*    */     //   543: iadd
/*    */     //   544: aload_0
/*    */     //   545: getfield HC : I
/*    */     //   548: dup
/*    */     //   549: istore #4
/*    */     //   551: if_icmple -> 560
/*    */     //   554: iload #4
/*    */     //   556: iload #6
/*    */     //   558: isub
/*    */     //   559: istore_3
/*    */     //   560: iload_2
/*    */     //   561: ifge -> 566
/*    */     //   564: iconst_0
/*    */     //   565: istore_2
/*    */     //   566: iload_3
/*    */     //   567: ifge -> 572
/*    */     //   570: iconst_0
/*    */     //   571: istore_3
/*    */     //   572: aload_1
/*    */     //   573: aload_0
/*    */     //   574: dup
/*    */     //   575: dup
/*    */     //   576: aload_1
/*    */     //   577: putfield Sw0 : Lf/JG0;
/*    */     //   580: getfield Zt : Lf/tl0;
/*    */     //   583: iload_2
/*    */     //   584: iload_3
/*    */     //   585: invokevirtual ME : (II)Z
/*    */     //   588: pop
/*    */     //   589: getfield Zt : Lf/tl0;
/*    */     //   592: iconst_1
/*    */     //   593: invokevirtual wI0 : (Z)V
/*    */     //   596: invokevirtual Wf : ()V
/*    */     //   599: goto -> 617
/*    */     //   602: new java/lang/IllegalArgumentException
/*    */     //   605: dup
/*    */     //   606: ldc_w 'Unsupported data type'
/*    */     //   609: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   612: athrow
/*    */     //   613: aload_0
/*    */     //   614: invokevirtual final : ()V
/*    */     //   617: aload_0
/*    */     //   618: getfield fC : J
/*    */     //   621: aload_0
/*    */     //   622: getfield JL0 : J
/*    */     //   625: lsub
/*    */     //   626: aload_0
/*    */     //   627: getfield t2 : I
/*    */     //   630: i2l
/*    */     //   631: lcmp
/*    */     //   632: ifle -> 640
/*    */     //   635: iconst_1
/*    */     //   636: istore_1
/*    */     //   637: goto -> 642
/*    */     //   640: iconst_0
/*    */     //   641: istore_1
/*    */     //   642: aload_0
/*    */     //   643: getfield Kd : Z
/*    */     //   646: iload_1
/*    */     //   647: if_icmpeq -> 655
/*    */     //   650: aload_0
/*    */     //   651: iload_1
/*    */     //   652: putfield Kd : Z
/*    */     //   655: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 1
/*    */     //   #2	-> 10
/*    */     //   #3	-> 68
/*    */     //   #4	-> 72
/*    */     //   #5	-> 76
/*    */     //   #6	-> 80
/*    */     //   #7	-> 84
/*    */     //   #8	-> 106
/*    */     //   #9	-> 115
/*    */     //   #10	-> 122
/*    */     //   #11	-> 125
/*    */     //   #12	-> 134
/*    */     //   #13	-> 139
/*    */     //   #14	-> 158
/*    */     //   #15	-> 195
/*    */     //   #16	-> 199
/*    */     //   #17	-> 224
/*    */     //   #18	-> 230
/*    */     //   #19	-> 234
/*    */     //   #20	-> 239
/*    */     //   #21	-> 244
/*    */     //   #22	-> 266
/*    */     //   #23	-> 278
/*    */     //   #24	-> 306
/*    */     //   #25	-> 309
/*    */     //   #26	-> 314
/*    */     //   #27	-> 326
/*    */     //   #28	-> 348
/*    */     //   #29	-> 358
/*    */     //   #30	-> 363
/*    */     //   #31	-> 368
/*    */     //   #32	-> 525
/*    */     //   #33	-> 545
/*    */     //   #34	-> 577
/*    */     //   #35	-> 585
/*    */     //   #36	-> 589
/*    */     //   #37	-> 614
/*    */   }
/*    */   
/*    */   public final JG0 gg() {
/*    */     return LPT5().gg();
/*    */   }
/*    */   
/*    */   public final void uz(iz0 paramiz0) {
/*    */     JG0 jG0;
/*    */     if ((jG0 = paramiz0.fr0) == this) {
/*    */       Kc(paramiz0);
/*    */     } else if (jG0 != null) {
/*    */       throw new IllegalArgumentException("popup must not be added anywhere");
/*    */     } 
/*    */     final();
/*    */     this.ax = false;
/*    */     byte b = 11;
/*    */     this.ip0 = false;
/*    */     this.lO.cz0 = b;
/*    */     this.lO.Ua = false;
/*    */     try {
/*    */       LPT5().ut(this.lO);
/*    */     } catch (Exception exception) {
/*    */       Logger.getLogger(throws.class.getName()).log(Level.SEVERE, "Exception in sendPopupEvent()", exception);
/*    */     } 
/*    */     super.si(paramiz0, Ub() - 2);
/*    */     paramiz0.AU.dc0(this, true);
/*    */     this.ip0 = true;
/*    */     jo0 jo01;
/*    */     if ((jo01 = this.Lc) != null)
/*    */       Ek(jo01); 
/*    */   }
/*    */   
/*    */   public final void Kc(iz0 paramiz0) {
/*    */     int i;
/*    */     if ((i = ID(paramiz0)) > 0)
/*    */       super.fG0(i); 
/*    */     paramiz0.AU.pO(this);
/*    */     i = 12;
/*    */     this.ip0 = false;
/*    */     this.lO.cz0 = i;
/*    */     this.lO.Ua = false;
/*    */     try {
/*    */       LPT5().ut(this.lO);
/*    */     } catch (Exception exception) {
/*    */       Logger.getLogger(throws.class.getName()).log(Level.SEVERE, "Exception in sendPopupEvent()", exception);
/*    */     } 
/*    */     this.ip0 = true;
/*    */     Uj0(paramiz0);
/*    */     gA0(LPT5());
/*    */     if (!this.l30)
/*    */       MW(2, null); 
/*    */   }
/*    */   
/*    */   public final boolean fC() {
/*    */     JG0 jG0;
/*    */     return (this.l30 && (jG0 = this.F20) != null && fC());
/*    */   }
/*    */   
/*    */   public final void Uj0(JG0 paramJG0) {
/*    */     jo0 jo01;
/*    */     if ((jo01 = this.Lc) != null) {
/*    */       if (jo01 != paramJG0) {
/*    */         boolean bool;
/*    */         JG0 jG0;
/*    */         for (jG0 = jo01.nV; jG0 != null && jG0 != paramJG0;)
/*    */           jG0 = jG0.fr0; 
/*    */         if (jG0 == paramJG0) {
/*    */           bool = true;
/*    */         } else {
/*    */           bool = false;
/*    */         } 
/*    */         if (bool) {
/*    */           Ek(this.Lc);
/*    */           return;
/*    */         } 
/*    */         return;
/*    */       } 
/*    */     } else {
/*    */       return;
/*    */     } 
/*    */     Ek(this.Lc);
/*    */   }
/*    */   
/*    */   public final void fJ0(jo0 paramjo0) {
/*    */     int i;
/*    */     super.fG0(i = Ub() - 2);
/*    */     super.si(paramjo0, i);
/*    */     this.Lc = paramjo0;
/*    */   }
/*    */   
/*    */   public final void Ek(jo0 paramjo0) {
/*    */     if (paramjo0 == this.Lc) {
/*    */       int i;
/*    */       super.fG0(i = Ub() - 2);
/*    */       super.si(this.i70, i);
/*    */       this.Lc = null;
/*    */       try {
/*    */         paramjo0.mg0();
/*    */       } catch (Exception exception) {
/*    */         Logger.getLogger(throws.class.getName()).log(Level.SEVERE, "Exception in infoWindowClosed()", this);
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public final boolean BA() {
/*    */     return true;
/*    */   }
/*    */   
/*    */   public final boolean gA0(JG0 paramJG0) {
/*    */     return (paramJG0 != null && paramJG0 != LPT5()) ? false : super.gA0(paramJG0);
/*    */   }
/*    */   
/*    */   public final void pC0(JG0 paramJG0, boolean paramBoolean) {
/*    */     this.Sw0 = null;
/*    */     if (this.Sw0 == paramJG0 && paramBoolean) {
/*    */       final();
/*    */       this.ax = false;
/*    */       this.else = this.fC;
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void Ol0(int paramInt1, int paramInt2) {
/*    */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   public final void LW() {
/*    */     cOm1 cOm1;
/*    */     UB0.Kg0.getClass();
/*    */     UB0.Kg0.getClass();
/*    */     Dp0 dp0;
/*    */     if ((dp0 = Dp0.Ro0) == Dp0.uM || dp0 == Dp0.QG)
/*    */       return; 
/*    */     this.lO.cz0 = 2;
/*    */     JE0 jE0;
/*    */     for (JG0 jG0 = LPT5().gg(); jG0 != null && (!jG0.kN || (jE0 = jG0.pB0(this.lO)) == null);)
/*    */       jG0 = jG0.fr0; 
/*    */     tw tw;
/*    */     (tw = (tw)this.IB0).LV = null;
/*    */     if (jE0 instanceof g30) {
/*    */       cOm1 = ((g30)jE0).MA0;
/*    */       GLFW.glfwSetCursor(UB0.M60.AW.ne0, this.vc0);
/*    */     } else if (jE0 instanceof xw) {
/*    */       tw.Ps();
/*    */       ((tw)this).LV = (xw)jE0;
/*    */     } else {
/*    */       tw.Ps();
/*    */     } 
/*    */   }
/*    */   
/*    */   public final JG0 MW(int paramInt, JG0 paramJG0) {
/*    */     // Byte code:
/*    */     //   0: getstatic f/throws.m3 : Z
/*    */     //   3: dup
/*    */     //   4: istore_3
/*    */     //   5: ifne -> 26
/*    */     //   8: iload_1
/*    */     //   9: invokestatic Pg : (I)Z
/*    */     //   12: ifeq -> 18
/*    */     //   15: goto -> 26
/*    */     //   18: new java/lang/AssertionError
/*    */     //   21: dup
/*    */     //   22: invokespecial <init> : ()V
/*    */     //   25: athrow
/*    */     //   26: aload_0
/*    */     //   27: dup
/*    */     //   28: dup
/*    */     //   29: iconst_0
/*    */     //   30: putfield ip0 : Z
/*    */     //   33: getfield lO : Lf/oa0;
/*    */     //   36: dup
/*    */     //   37: astore #4
/*    */     //   39: iload_1
/*    */     //   40: putfield cz0 : I
/*    */     //   43: getfield l30 : Z
/*    */     //   46: dup
/*    */     //   47: istore #5
/*    */     //   49: ifeq -> 58
/*    */     //   52: iconst_1
/*    */     //   53: istore #6
/*    */     //   55: goto -> 61
/*    */     //   58: iconst_0
/*    */     //   59: istore #6
/*    */     //   61: aload_2
/*    */     //   62: aload_0
/*    */     //   63: aload #4
/*    */     //   65: iload #6
/*    */     //   67: putfield Ua : Z
/*    */     //   70: getfield IB0 : Lf/VI;
/*    */     //   73: aload #4
/*    */     //   75: dup
/*    */     //   76: getfield aK : I
/*    */     //   79: istore #6
/*    */     //   81: getfield gk0 : I
/*    */     //   84: istore #7
/*    */     //   86: checkcast f/tw
/*    */     //   89: dup
/*    */     //   90: iload #7
/*    */     //   92: swap
/*    */     //   93: iload #6
/*    */     //   95: putfield FO : I
/*    */     //   98: putfield Qr : I
/*    */     //   101: ifnull -> 155
/*    */     //   104: aload_2
/*    */     //   105: getfield kN : Z
/*    */     //   108: ifne -> 146
/*    */     //   111: iload_1
/*    */     //   112: iconst_3
/*    */     //   113: if_icmpeq -> 140
/*    */     //   116: iload_1
/*    */     //   117: iconst_4
/*    */     //   118: if_icmpeq -> 140
/*    */     //   121: iload_1
/*    */     //   122: iconst_5
/*    */     //   123: if_icmpeq -> 140
/*    */     //   126: iload_1
/*    */     //   127: bipush #6
/*    */     //   129: if_icmpne -> 135
/*    */     //   132: goto -> 140
/*    */     //   135: iconst_0
/*    */     //   136: istore_0
/*    */     //   137: goto -> 142
/*    */     //   140: iconst_1
/*    */     //   141: istore_0
/*    */     //   142: iload_0
/*    */     //   143: ifne -> 153
/*    */     //   146: aload_2
/*    */     //   147: aload #4
/*    */     //   149: invokevirtual i2 : (Lf/oa0;)Z
/*    */     //   152: pop
/*    */     //   153: aload_2
/*    */     //   154: areturn
/*    */     //   155: iload_3
/*    */     //   156: ifne -> 175
/*    */     //   159: iload #5
/*    */     //   161: ifne -> 167
/*    */     //   164: goto -> 175
/*    */     //   167: new java/lang/AssertionError
/*    */     //   170: dup
/*    */     //   171: invokespecial <init> : ()V
/*    */     //   174: athrow
/*    */     //   175: aload_0
/*    */     //   176: aconst_null
/*    */     //   177: astore_1
/*    */     //   178: getfield Lc : Lf/jo0;
/*    */     //   181: dup
/*    */     //   182: astore_2
/*    */     //   183: ifnull -> 220
/*    */     //   186: aload_2
/*    */     //   187: iload #6
/*    */     //   189: iload #7
/*    */     //   191: invokevirtual mu0 : (II)Z
/*    */     //   194: ifeq -> 220
/*    */     //   197: aload_0
/*    */     //   198: dup
/*    */     //   199: dup
/*    */     //   200: getfield Lc : Lf/jo0;
/*    */     //   203: astore_2
/*    */     //   204: getfield lO : Lf/oa0;
/*    */     //   207: aload_2
/*    */     //   208: swap
/*    */     //   209: invokevirtual zo : (Lf/JG0;Lf/oa0;)Z
/*    */     //   212: ifeq -> 220
/*    */     //   215: aload_0
/*    */     //   216: getfield Lc : Lf/jo0;
/*    */     //   219: astore_1
/*    */     //   220: aload_1
/*    */     //   221: ifnonnull -> 240
/*    */     //   224: aload_0
/*    */     //   225: dup
/*    */     //   226: dup
/*    */     //   227: invokevirtual LPT5 : ()Lf/JG0;
/*    */     //   230: astore_1
/*    */     //   231: getfield lO : Lf/oa0;
/*    */     //   234: aload_1
/*    */     //   235: swap
/*    */     //   236: invokevirtual zo : (Lf/JG0;Lf/oa0;)Z
/*    */     //   239: pop
/*    */     //   240: aload_1
/*    */     //   241: aload_0
/*    */     //   242: getfield lO : Lf/oa0;
/*    */     //   245: invokevirtual Oz0 : (Lf/oa0;)Lf/JG0;
/*    */     //   248: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 95
/*    */     //   #2	-> 98
/*    */     //   #3	-> 105
/*    */     //   #4	-> 149
/*    */     //   #5	-> 191
/*    */     //   #6	-> 200
/*    */   }
/*    */   
/*    */   public final boolean W50(int paramInt) {
/*    */     if (m3 || B8.Wm0(paramInt)) {
/*    */       this.ip0 = false;
/*    */       this.kg0 = null;
/*    */       this.lO.cz0 = paramInt;
/*    */       this.lO.Ua = false;
/*    */       boolean bool;
/*    */       JG0 jG0;
/*    */       if (!(bool = LPT5().i2(this.lO)) && (jG0 = this.kg0) != null) {
/*    */         oa0 oa01;
/*    */         if ((oa01 = this.lO).oO())
/*    */           if ((oa01.com8 & 0x9) != 0) {
/*    */             jG0.q0();
/*    */           } else {
/*    */             jG0.oZ();
/*    */           }  
/*    */         bool = true;
/*    */       } 
/*    */       this.kg0 = null;
/*    */       return bool;
/*    */     } 
/*    */     throw new AssertionError();
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/throws.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */