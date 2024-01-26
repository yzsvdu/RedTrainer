/*  1 */ package f;public class JG0 { public static final Ll e30; public static final Ll OL0; public static final Ll jz0; public static final Ll PA; public static final ThreadLocal Kc; public static final boolean zE0; public JG0 fr0; public int Kd; public int er0; public int xY; public int HC; public int kM; public boolean l0; public boolean dP; public boolean q50; public boolean kN; public boolean fx; public String cl; public dS Lg; public mX td0; public mX C50; public Object z4; public Object qy0; public dH yl; public gg0 cu; public I db0; public PropertyChangeSupport kD0; public volatile throws Bo0; public final Sa0 O; public final boolean lPt4; public short px; public short X20; public short EA; public short WU; public short Tb0; public short yf; public short fu; public short Rr; public d10 Li0; public JG0 pb0; public JG0 LG; public JE0 v10; public vN a1; public boolean a3; public boolean zI0; public boolean te; public int jl; public String Az0; public et xc; public Object DA0; public int fd; public JG0() { this(null, false); } public JG0(Sa0 paramSa0, boolean paramBoolean) { Sa0 sa0; this.dP = true; this.kN = true; this.fx = true; this.a3 = true; this.te = true; this.jl = 1000; this.Az0 = ""; this.xc = et.F30; this.fd = -1; this.cl = TI(); if (paramSa0 == null || paramBoolean) { this(paramSa0); this.O = this; this.lPt4 = false; return; }  ((JG0)super).O = paramSa0; ((JG0)super).lPt4 = true; } public static int Fr(int paramInt1, int paramInt2, int paramInt3) { if (paramInt3 > 0) paramInt2 = Math.min(paramInt2, paramInt3);  return Math.max(paramInt1, paramInt2); } static { Logger.getLogger(JG0.class.getName()); e30 = Ll.F10("keyboardFocus"); OL0 = Ll.F10("hasOpenPopups"); jz0 = Ll.F10("hasFocusedChild"); PA = Ll.F10("disabled"); Kc = new ThreadLocal(); try { bool = Boolean.getBoolean("warnOnUnhandledAction"); } catch (SecurityException securityException) { bool = false; }
/*  2 */      zE0 = bool; } public static void Sz(JG0 paramJG0) { while (paramJG0 != null) { JG0 jG0 = paramJG0.LG; if (!paramJG0.lPt4) paramJG0.O.gf0(e30, false);  try { paramJG0.GD(); } catch (Exception exception) { Ni0().log(Level.SEVERE, "Exception in keyboardFocusLost()", exception); }  paramJG0.LG = null; paramJG0 = jG0; }  } private static Logger Ni0() { return Logger.getLogger(JG0.class.getName()); } public final int rl(ArrayList<JG0> paramArrayList) { d10 d101; if ((d101 = this.Li0) == null) return -1;  int i; Hc0 hc0; for (i = -1, hc0 = d101.r30(); hc0.hasNext();) { if ((jG0 = (JG0)hc0.next()).dP && jG0.kN) { if (jG0.zI0) { if (jG0 == this.LG) i = paramArrayList.size();  paramArrayList.add(jG0); }  int j; if (jG0.te && (j = jG0.rl(paramArrayList)) != -1) i = j;  }  }  return i; } public final void Wi0(throws paramthrows) { if (kx0 || this.Bo0 == null) { this.Bo0 = paramthrows; d10 d101; if ((d101 = this.Li0) != null) { JG0[] arrayOfJG0 = (JG0[])d101.Jv0(); int i = this.Li0.Z8; while (i-- > 0) arrayOfJG0[i].Wi0(paramthrows);  this.Li0.At0(); }  return; }  throw new AssertionError("guiInstance must be null"); } public final void A8(throws paramthrows) { if (kx0 || this.Bo0 == paramthrows) { if (this.kM != 0) paramthrows.RF = true;  if (!this.lPt4) this.O.lg0(paramthrows);  try { LM(paramthrows); } catch (Exception exception) { Ni0().log(Level.SEVERE, "Exception in afterAddToGUI()", exception); }  d10 d101; if ((d101 = this.Li0) != null) { JG0[] arrayOfJG0 = (JG0[])d101.Jv0(); int i = this.Li0.Z8; while (i-- > 0) arrayOfJG0[i].A8(paramthrows);  this.Li0.At0(); }  return; }  throw new AssertionError("guiInstance must be equal to gui"); } public final void gb(throws paramthrows) { if (kx0 || this.Bo0 == paramthrows) { this.Bo0 = null; this.Lg = null; d10 d101; if ((d101 = this.Li0) != null) { JG0[] arrayOfJG0 = (JG0[])d101.Jv0(); int i = this.Li0.Z8; while (i-- > 0) arrayOfJG0[i].gb(paramthrows);  this.Li0.At0(); }  return; }  throw new AssertionError("guiInstance must be null"); } public final void Zk(JG0 paramJG0) { throws throws1 = this.Bo0; if (paramJG0.q50) if (kx0 || throws1 != null)
/*  3 */       { for (int k = throws1.Ub() - 2; k-- > 1; )
/*    */         { iz0 iz0; JG0 jG0;
/*  5 */           for (jG0 = (iz0 = (iz0)throws1.lPt3(k)).AU; jG0 != null && jG0 != paramJG0;)
/*  6 */             jG0 = jG0.fr0;  if ((jG0 == paramJG0)) throws1
/*  7 */               .Kc(iz0);  }  } else { throw new AssertionError(); }
/*  8 */         Sz(paramJG0); if (throws1 != null) paramJG0.yF0(throws1);  paramJG0.gb(throws1); paramJG0.fr0 = null; try { paramJG0.jA0(); } catch (Exception exception) { Ni0().log(Level.SEVERE, "Exception in destroy()", exception); }  int i = -this.Kd, j = -this.er0; paramJG0
/*  9 */       .ME(paramJG0.Kd + i, paramJG0.er0 + j);
/* 10 */     paramJG0.o40(null, paramJG0.fx); } public final void yF0(throws paramthrows) { if (kx0 || this.Bo0 == paramthrows) { d10 d101; if ((d101 = this.Li0) != null) { JG0[] arrayOfJG0 = (JG0[])d101.Jv0(); int i = this.Li0.Z8; while (i-- > 0) arrayOfJG0[i].yF0(paramthrows);  this.Li0.At0(); }  this.LG = null; if (!this.lPt4) this.O.lg0(null);  try { ED0(paramthrows); } catch (Exception exception) { Ni0().log(Level.SEVERE, "Exception in beforeRemoveFromGUI()", this); }  return; }  throw new AssertionError("guiInstance must be equal to gui"); } public final void o40(throws paramthrows, boolean paramBoolean) { paramBoolean &= this.fx; if (this.kN != paramBoolean) { this.kN = paramBoolean; if (!this.lPt4) { Ll ll = PA; this.O.gf0(ll, paramBoolean ^ true); }  if (!paramBoolean) { if (paramthrows != null) { if (this instanceof iz0) paramthrows.Kc((iz0)this);  paramthrows.Uj0(this); }  try { V7(); } catch (Exception exception) { Ni0().log(Level.SEVERE, "Exception in widgetDisabled()", exception); }  try { xI0(); } catch (Exception exception) { Ni0().log(Level.SEVERE, "Exception in giveupKeyboardFocus()", exception); }  }  try { String str = "enabled"; lH(str, paramBoolean ^ true, paramBoolean); } catch (Exception exception) { Ni0().log(Level.SEVERE, "Exception in firePropertyChange(\"enabled\")", exception); }  d10 d101; if ((d101 = this.Li0) != null) { JG0[] arrayOfJG0; int i; for (arrayOfJG0 = (JG0[])d101.Jv0(), i = this.Li0.Z8; i-- > 0; arrayOfJG0[i].o40(paramthrows, paramBoolean)); this.Li0.At0(); }  }  } public final void NL0(throws paramthrows) { C7 c72; if (this.db0.en) zG0();  float f1 = this.db0.transient[0], f2 = this.db0.transient[1], f3 = this.db0.transient[2], f4 = this.db0.transient[3]; tw tw; C7 c71; if ((c71 = (tw = (tw)paramthrows.IB0).Ma).JJ == null) { C7 c7; this(c71); c71.JJ = c7; }  c71.prn *= f1; c71.cu0 *= f2; c71.ew0 *= f3; c71.JS *= f4; tw.Ma = c71.JJ; 
/* 11 */     try { if (this.l0) { Kr0(paramthrows); } else { V90(paramthrows); }  return; } finally { tw.w1(); }  } public final void Kr0(throws paramthrows) { tw tw; int i = this.Kd, j = this.er0, k = this.xY, m = this.HC; tw.X2(i, j, k, m); try { int n = this.Kd, i1 = this.er0; i = this.xY; j = this.HC; WN(paramthrows, n, i1, i, j); return; } finally { tw.Hq0(); }  } public final void w00(dS paramdS, nY paramnY, lI paramlI) { d10 d101; if ((d101 = this.Li0) != null && paramnY != null) { JG0[] arrayOfJG0; byte b; int i; for (arrayOfJG0 = (JG0[])d101.Jv0(), b = 0, i = this.Li0.Z8; b < i; ) { nY nY1; JG0 jG0; (jG0 = arrayOfJG0[b]).Lg = paramdS; if ((arrayOfJG0[b]).cl.length() > 0) { try { boolean bool; String str; if ((str = jG0.cl).length() > 1 && str.charAt(0) == '/') { bool = true; } else { bool = false; }  if (bool) {  } else { String str1 = jG0.cl; }  nY1 = ((L00)paramnY).mn0(str1, true); } finally { this = null; }  } else { nY1 = paramnY; }  jG0.w00(paramdS, nY1, paramlI); b++; }  this.Li0.At0(); }  } public final StringBuilder Jr(int paramInt) { StringBuilder stringBuilder; boolean bool; paramInt = this.cl.length() + paramInt; String str; if ((str = this.cl).length() > 1 && str.charAt(0) == '/') { bool = true; } else { bool = false; }  JG0 jG0; if ((jG0 = this.fr0) != null && !bool) { stringBuilder = jG0.Jr(paramInt + 1); if (this.cl.length() > 0 && stringBuilder.length() > 0) stringBuilder.append('.');  } else { StringBuilder stringBuilder1; this(stringBuilder); stringBuilder = stringBuilder1; }  return bool ? stringBuilder.append(this.cl.substring(1)) : stringBuilder.append(this.cl); } public String TI() { return "widget"; } public final void HM(PropertyChangeListener paramPropertyChangeListener) { if (this.kD0 == null) { PropertyChangeSupport propertyChangeSupport; this(this); this.kD0 = propertyChangeSupport; }  this.kD0.addPropertyChangeListener(paramPropertyChangeListener); } public final JG0 Mv0() { return this.fr0; } public final boolean Ji0(JG0 paramJG0) { return ((this = this.fr0) == null) ? false : ((this == paramJG0) ? true : Ji0(paramJG0)); } public void jA0() { d10 d101; if ((d101 = this.Li0) != null) { JG0[] arrayOfJG0; byte b; int i; for (arrayOfJG0 = (JG0[])d101.Jv0(), b = 0, i = this.Li0.Z8; b < i; ) { arrayOfJG0[b].jA0(); b++; }  this.Li0.At0(); }  if (this.fd > 0) { vw vw = ((tw)this.Bo0.IB0).fw; int i = this.fd; if (this.VK == null) { fQ fQ; if (i == (fQ = this.Bs).Z8 - 1) { dd0 = (Dd0)fQ.Hc(i); this.n3.Dt0.w0().limit(dd0.Zr0); if (this.VK == null) { this.n3.rs0
/* 12 */               .pP();
/*    */ 
/*    */ 
/*    */             
/* 16 */             this(this.Bs.Z8, this.n3.Dt0.w0().limit()); this.VK = new Dd0(); this.Bs.Com3(dd0); this.n3
/* 17 */               .Dt0
/* 18 */               .w0()
/* 19 */               .compact(); } else { throw new IllegalStateException("endCache must be called before begin."); }  } else { this
/* 20 */             .VK = (Dd0)fQ.get(dd0); this.n3
/* 21 */             .Dt0
/* 22 */             .w0()
/* 23 */             .position(this.VK.Zr0); }
/* 24 */          Dd0 dd0; if ((dd0 = this.VK) != null)
/*    */         
/*    */         { 
/* 27 */           int k, j = this.n3.Dt0.w0().position() - dd0.Zr0; Texture[] arrayOfTexture; if ((arrayOfTexture = dd0.Yl) == null) { for (dd0.m4 = j, dd0.Hs0 = this.qH0.Z8, dd0.Yl = (Texture[])this.qH0.Ib(Texture.class), dd0.YD = new int[dd0.Hs0], j = 0, k = this.Rf.mG0; j < k; ) { dd0.YD[j] = this.Rf.Vl(j); j++; }  this.n3
/* 28 */               .Dt0
/* 29 */               .w0()
/* 30 */               .flip(); } else if (j <= dd0.m4) { dd0.Hs0 = j = this.qH0.Z8; if (k.length < j) dd0.Yl = new Texture[j];  for (k = 0; k < j; ) { dd0.Yl[k] = (Texture)this.qH0.get(k); k++; }  if (dd0.YD.length < (j = dd0.Hs0)) dd0.YD = new int[j];  for (k = 0; k < j; ) { dd0.YD[k] = this.Rf.Vl(k); k++; }  this.n3
/* 31 */               .Dt0
/* 32 */               .w0()
/* 33 */               .position(0); this.n3.Dt0.w0().limit((dd0 = (Dd0)this.Bs.get(this.Bs.Z8 - 1)).Zr0 + dd0.m4); }
/*    */           else
/* 35 */           { throw new JU(
/*    */ 
/*    */                 
/* 38 */                 N.Gl0(HB0.DH0("If a cache is not the last created, it cannot be redefined with more entries than when it was first created: ", j, " ("), dd0.m4, " max)")); }  this.VK = null; this.qH0.clear(); this.Rf.mG0 = 0; }
/* 39 */         else { throw new IllegalStateException("beginCache must be called before endCache."); }  }
/* 40 */       else { throw new IllegalStateException("endCache must be called before begin."); }
/*    */        }
/*    */      }
/*    */ 
/*    */   
/*    */   public final boolean qh0() {
/*    */     return this.dP;
/*    */   }
/*    */   
/*    */   public void wI0(boolean paramBoolean) {
/*    */     if (this.dP != paramBoolean) {
/*    */       this.dP = paramBoolean;
/*    */       if (!paramBoolean) {
/*    */         throws throws1;
/*    */         if ((throws1 = this.Bo0) != null) {
/*    */           boolean bool;
/*    */           UB0.Kg0.fN(new nr0(throws1, this));
/*    */           JG0 jG01;
/*    */           for (jG01 = throws1.Sw0; jG01 != null && jG01 != this;)
/*    */             jG01 = jG01.fr0; 
/*    */           if (jG01 == this) {
/*    */             bool = true;
/*    */           } else {
/*    */             bool = false;
/*    */           } 
/*    */           if (bool) {
/*    */             throws1.final();
/*    */             throws1.ax = false;
/*    */           } 
/*    */         } 
/*    */         JG0 jG0;
/*    */         if ((jG0 = this.fr0) != null) {
/*    */           JG0 jG01;
/*    */           if ((jG01 = jG0.LG) == this) {
/*    */             Sz(jG01);
/*    */             jG0.LG = null;
/*    */           } 
/*    */           if (jG0.pb0 == this)
/*    */             jG0.pb0 = null; 
/*    */         } 
/*    */       } 
/*    */       if ((this = this.fr0) != null)
/*    */         Q2(); 
/*    */     } 
/*    */   }
/*    */   
/*    */   public final boolean Ws() {
/*    */     return this.kN;
/*    */   }
/*    */   
/*    */   public void sk0(boolean paramBoolean) {
/*    */     if (this.fx != paramBoolean) {
/*    */       boolean bool;
/*    */       this.fx = paramBoolean;
/*    */       lH("locallyEnabled", paramBoolean ^ true, paramBoolean);
/*    */       throws throws1 = this.Bo0;
/*    */       JG0 jG0;
/*    */       if ((jG0 = this.fr0) != null) {
/*    */         bool = jG0.kN;
/*    */       } else {
/*    */         bool = true;
/*    */       } 
/*    */       o40(throws1, bool);
/*    */     } 
/*    */   }
/*    */   
/*    */   public final int a40() {
/*    */     return this.Kd;
/*    */   }
/*    */   
/*    */   public final int CB() {
/*    */     return this.er0;
/*    */   }
/*    */   
/*    */   public final int kG0() {
/*    */     return this.xY;
/*    */   }
/*    */   
/*    */   public final int kz0() {
/*    */     return this.HC;
/*    */   }
/*    */   
/*    */   public final int Xq() {
/*    */     return this.Kd + this.xY;
/*    */   }
/*    */   
/*    */   public final int yR() {
/*    */     return this.er0 + this.HC;
/*    */   }
/*    */   
/*    */   public final int RS() {
/*    */     return this.Kd + this.px;
/*    */   }
/*    */   
/*    */   public final int e3() {
/*    */     return this.er0 + this.X20;
/*    */   }
/*    */   
/*    */   public final int qF() {
/*    */     return Math.max(0, this.xY - this.px - this.EA);
/*    */   }
/*    */   
/*    */   public final int Hy() {
/*    */     return Math.max(0, this.HC - this.X20 - this.WU);
/*    */   }
/*    */   
/*    */   public final int m40() {
/*    */     int i = this.Kd;
/*    */     return Math.max(this.px, this.xY - this.EA) + i;
/*    */   }
/*    */   
/*    */   public final int mD() {
/*    */     int i = this.er0;
/*    */     return Math.max(this.X20, this.HC - this.WU) + i;
/*    */   }
/*    */   
/*    */   public final boolean mu0(int paramInt1, int paramInt2) {
/*    */     int i;
/*    */     int j;
/*    */     return (paramInt1 >= (i = this.Kd) && paramInt2 >= (j = this.er0) && paramInt1 < i + this.xY && paramInt2 < j + this.HC);
/*    */   }
/*    */   
/*    */   public void Xg0(int paramInt1, int paramInt2) {
/*    */     Tm(paramInt1, paramInt2);
/*    */     uh0(paramInt1, paramInt2);
/*    */     RI(paramInt1, paramInt2);
/*    */   }
/*    */   
/*    */   public final void QI() {
/*    */     Xg0(this.Bo0.xY, this.Bo0.HC);
/*    */     Ol0(0, 0);
/*    */   }
/*    */   
/*    */   public final boolean Tm(int paramInt1, int paramInt2) {
/*    */     if (paramInt1 < 0 || paramInt2 < 0) {
/*    */       Ni0().log(Level.SEVERE, B40.df("Exception in setSize() ").append(dA()).toString(), new IllegalArgumentException("negative size"));
/*    */       return false;
/*    */     } 
/*    */     int j = this.HC;
/*    */     int i;
/*    */     if ((i = this.xY) != paramInt1 || j != paramInt2) {
/*    */       this.xY = paramInt1;
/*    */       this.HC = paramInt2;
/*    */       Gu();
/*    */       if (this.kD0 != null) {
/*    */         US(i, paramInt1, "width");
/*    */         US(j, paramInt2, "height");
/*    */       } 
/*    */       return true;
/*    */     } 
/*    */     return false;
/*    */   }
/*    */   
/*    */   public final short VJ0() {
/*    */     return this.X20;
/*    */   }
/*    */   
/*    */   public final short dN() {
/*    */     return this.px;
/*    */   }
/*    */   
/*    */   public final short Rx0() {
/*    */     return this.WU;
/*    */   }
/*    */   
/*    */   public final short IL() {
/*    */     return this.EA;
/*    */   }
/*    */   
/*    */   public final int Ho() {
/*    */     return this.px + this.EA;
/*    */   }
/*    */   
/*    */   public final int Et() {
/*    */     return this.X20 + this.WU;
/*    */   }
/*    */   
/*    */   public final boolean kN(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*    */     if (paramInt1 >= 0 && paramInt2 >= 0 && paramInt3 >= 0 && paramInt4 >= 0) {
/*    */       if (this.X20 != paramInt1 || this.WU != paramInt3 || this.px != paramInt2 || this.EA != paramInt4) {
/*    */         paramInt1 = qF();
/*    */         paramInt2 = Hy();
/*    */         paramInt3 = paramInt2 - this.px;
/*    */         paramInt4 = paramInt1 - this.X20;
/*    */         this.px = (short)paramInt2;
/*    */         this.X20 = (short)paramInt1;
/*    */         this.EA = (short)paramInt4;
/*    */         this.WU = (short)paramInt3;
/*    */         d10 d101;
/*    */         if ((d101 = this.Li0) != null && (paramInt3 != 0 || paramInt4 != 0)) {
/*    */           JG0[] arrayOfJG0;
/*    */           byte b;
/*    */           int i;
/*    */           for (arrayOfJG0 = (JG0[])d101.Jv0(), b = 0, i = this.Li0.Z8; b < i; ) {
/*    */             JG0 jG0;
/*    */             arrayOfJG0[b].ME((jG0 = arrayOfJG0[b]).Kd + paramInt3, jG0.er0 + paramInt4);
/*    */             b++;
/*    */           } 
/*    */           this.Li0.At0();
/*    */         } 
/*    */         yN(paramInt1, paramInt2);
/*    */         MJ0();
/*    */         return true;
/*    */       } 
/*    */       return false;
/*    */     } 
/*    */     throw new IllegalArgumentException("negative border size");
/*    */   }
/*    */   
/*    */   public int AW() {
/*    */     return Math.max(this.Tb0, this.px + this.EA);
/*    */   }
/*    */   
/*    */   public int HY() {
/*    */     return Math.max(this.yf, this.X20 + this.WU);
/*    */   }
/*    */   
/*    */   public void uh0(int paramInt1, int paramInt2) {
/*    */     if (paramInt1 >= 0 && paramInt2 >= 0) {
/*    */       this.Tb0 = (short)Math.min(paramInt1, 32767);
/*    */       this.yf = (short)Math.min(paramInt2, 32767);
/*    */       return;
/*    */     } 
/*    */     throw new IllegalArgumentException("negative size");
/*    */   }
/*    */   
/*    */   public int R80() {
/*    */     int i = RS();
/*    */     d10 d101;
/*    */     if ((d101 = this.Li0) != null) {
/*    */       JG0[] arrayOfJG0 = (JG0[])d101.Jv0();
/*    */       byte b = 0;
/*    */       int j = this.Li0.Z8;
/*    */       while (b < j) {
/*    */         i = Math.max(i, arrayOfJG0[b].Xq());
/*    */         b++;
/*    */       } 
/*    */       this.Li0.At0();
/*    */     } 
/*    */     return i - RS();
/*    */   }
/*    */   
/*    */   public int J50() {
/*    */     int i = this.px + this.EA;
/*    */     i = R80() + i;
/*    */     mX mX1;
/*    */     if ((mX1 = mA()) != null)
/*    */       i = Math.max(i, mX1.Vb()); 
/*    */     return Math.max(this.Tb0, i);
/*    */   }
/*    */   
/*    */   public int tJ0() {
/*    */     int i = e3();
/*    */     d10 d101;
/*    */     if ((d101 = this.Li0) != null) {
/*    */       JG0[] arrayOfJG0 = (JG0[])d101.Jv0();
/*    */       byte b = 0;
/*    */       int j = this.Li0.Z8;
/*    */       while (b < j) {
/*    */         i = Math.max(i, arrayOfJG0[b].yR());
/*    */         b++;
/*    */       } 
/*    */       this.Li0.At0();
/*    */     } 
/*    */     return i - e3();
/*    */   }
/*    */   
/*    */   public int tj0() {
/*    */     int i = this.X20 + this.WU;
/*    */     i = tJ0() + i;
/*    */     mX mX1;
/*    */     if ((mX1 = mA()) != null)
/*    */       i = Math.max(i, mX1.wu0()); 
/*    */     return Math.max(this.yf, i);
/*    */   }
/*    */   
/*    */   public int W3() {
/*    */     return this.fu;
/*    */   }
/*    */   
/*    */   public int Hj() {
/*    */     return this.Rr;
/*    */   }
/*    */   
/*    */   public void RI(int paramInt1, int paramInt2) {
/*    */     if (paramInt1 >= 0 && paramInt2 >= 0) {
/*    */       this.fu = (short)Math.min(paramInt1, 32767);
/*    */       this.Rr = (short)Math.min(paramInt2, 32767);
/*    */       return;
/*    */     } 
/*    */     throw new IllegalArgumentException("negative size");
/*    */   }
/*    */   
/*    */   public void mM() {
/*    */     int j = J50();
/*    */     int i = tj0();
/*    */     Tm(Fr(AW(), j, W3()), Fr(HY(), i, Hj()));
/*    */     uW();
/*    */   }
/*    */   
/*    */   public void MJ0() {
/*    */     rq0();
/*    */     JG0 jG0;
/*    */     if (this.kM < 3 && (jG0 = this.fr0) != null) {
/*    */       this.kM = 3;
/*    */       jG0.UW(this);
/*    */     } 
/*    */   }
/*    */   
/*    */   public void uW() {
/*    */     if (this.kM != 0) {
/*    */       this.kM = 0;
/*    */       d40();
/*    */     } 
/*    */     d10 d101;
/*    */     if ((d101 = this.Li0) != null) {
/*    */       JG0[] arrayOfJG0 = (JG0[])d101.Jv0();
/*    */       byte b = 0;
/*    */       int i = this.Li0.Z8;
/*    */       while (b < i) {
/*    */         arrayOfJG0[b].uW();
/*    */         b++;
/*    */       } 
/*    */       this.Li0.At0();
/*    */     } 
/*    */   }
/*    */   
/*    */   public String xp0() {
/*    */     return this.cl;
/*    */   }
/*    */   
/*    */   public final void Xu(String paramString) {
/*    */     if (paramString != null) {
/*    */       IllegalArgumentException illegalArgumentException;
/*    */       StringBuilder stringBuilder;
/*    */       if (paramString.length() > 0) {
/*    */         int i;
/*    */         if ((i = paramString.lastIndexOf('/')) <= 0) {
/*    */           if (i < 0) {
/*    */             if (paramString.indexOf('.') >= 0)
/*    */               throw new IllegalArgumentException("'.' is only allowed for absolute theme paths"); 
/*    */           } else if (paramString.length() == 1) {
/*    */             throw new IllegalArgumentException("'/' requires a theme path");
/*    */           } 
/*    */           int j;
/*    */           for (i = 0, j = paramString.length(); i < j; ) {
/*    */             String str;
/*    */             char c;
/*    */             if (Character.isISOControl(c = paramString.charAt(i)) || c == '*') {
/*    */               illegalArgumentException = new IllegalArgumentException();
/*    */               stringBuilder = B40.df("invalid character '");
/*    */               if (Character.isISOControl(c)) {
/*    */                 str = '\\' + Integer.toOctalString(c);
/*    */               } else {
/*    */                 str = Character.toString(c);
/*    */               } 
/*    */               this(UQ.Vr0(stringBuilder, str, "' in theme name"));
/*    */               throw this;
/*    */             } 
/*    */             str++;
/*    */           } 
/*    */         } else {
/*    */           throw new IllegalArgumentException("'/' is only allowed as first character in theme name");
/*    */         } 
/*    */       } 
/*    */       ((JG0)super).cl = (String)stringBuilder;
/*    */       return;
/*    */     } 
/*    */     throw new IllegalArgumentException("theme is null");
/*    */   }
/*    */   
/*    */   public final void jz0(String paramString) {
/*    */     if (paramString.equals(this.cl))
/*    */       return; 
/*    */     Xu(paramString);
/*    */     cZ();
/*    */   }
/*    */   
/*    */   public final String dA() {
/*    */     return Jr(0).toString();
/*    */   }
/*    */   
/*    */   public mX mA() {
/*    */     return this.td0;
/*    */   }
/*    */   
/*    */   public JE0 pB0(oa0 paramoa0) {
/*    */     return this.v10;
/*    */   }
/*    */   
/*    */   public final int Ub() {
/*    */     d10 d101;
/*    */     return ((d101 = this.Li0) != null) ? this.Z8 : 0;
/*    */   }
/*    */   
/*    */   public final JG0 lPt3(int paramInt) {
/*    */     d10 d101;
/*    */     if ((d101 = this.Li0) != null)
/*    */       return (JG0)get(paramInt); 
/*    */     throw new IndexOutOfBoundsException();
/*    */   }
/*    */   
/*    */   public void J8(JG0 paramJG0) {
/*    */     si(paramJG0, Ub());
/*    */   }
/*    */   
/*    */   public void si(JG0 paramJG0, int paramInt) {
/*    */     if (paramJG0 != null) {
/*    */       if (paramJG0 != this) {
/*    */         if (paramJG0.fr0 == null) {
/*    */           if (this.Li0 == null) {
/*    */             d10 d101;
/*    */             this(true, 4, JG0.class);
/*    */             this.Li0 = d101;
/*    */           } 
/*    */           if (paramInt >= 0 && paramInt <= this.Li0.Z8) {
/*    */             paramJG0.lX(this);
/*    */             this.Li0.Tc(paramInt, paramJG0);
/*    */             throws throws1;
/*    */             if ((throws1 = this.Bo0) != null)
/*    */               paramJG0.Wi0(throws1); 
/*    */             int i = this.Kd + this.px, j = this.er0 + this.X20;
/*    */             paramJG0.ME(paramJG0.Kd + i, paramJG0.er0 + j);
/*    */             paramJG0.o40(null, this.kN);
/*    */             if (throws1 != null)
/*    */               paramJG0.A8(throws1); 
/*    */             dS dS1;
/*    */             if ((dS1 = this.Lg) != null)
/*    */               paramJG0.XX(dS1); 
/*    */             try {
/*    */               t30();
/*    */             } catch (Exception exception) {
/*    */               Ni0().log(Level.SEVERE, "Exception in childAdded()", this);
/*    */             } 
/*    */             return;
/*    */           } 
/*    */           throw new IndexOutOfBoundsException();
/*    */         } 
/*    */         throw new IllegalArgumentException("child widget already in tree");
/*    */       } 
/*    */       throw new IllegalArgumentException("can't add to self");
/*    */     } 
/*    */     throw new IllegalArgumentException("child is null");
/*    */   }
/*    */   
/*    */   public final int ID(JG0 paramJG0) {
/*    */     d10 d101;
/*    */     return ((d101 = this.Li0) != null) ? JF0(paramJG0, true) : -1;
/*    */   }
/*    */   
/*    */   public boolean ra0() {
/*    */     jA0();
/*    */     JG0 jG0;
/*    */     return ((jG0 = this.fr0) != null) ? jG0.jf0(this) : false;
/*    */   }
/*    */   
/*    */   public boolean jf0(JG0 paramJG0) {
/*    */     int i;
/*    */     if ((i = ID(paramJG0)) >= 0) {
/*    */       fG0(i);
/*    */       return true;
/*    */     } 
/*    */     return false;
/*    */   }
/*    */   
/*    */   public JG0 fG0(int paramInt) {
/*    */     d10 d101;
/*    */     if ((d101 = this.Li0) != null) {
/*    */       JG0 jG0;
/*    */       Zk(jG0 = (JG0)d101.Hc(paramInt));
/*    */       if (this.pb0 == jG0)
/*    */         this.pb0 = null; 
/*    */       if (this.LG == jG0)
/*    */         this.LG = null; 
/*    */       HK0();
/*    */       return jG0;
/*    */     } 
/*    */     throw new IndexOutOfBoundsException();
/*    */   }
/*    */   
/*    */   public void gx() {
/*    */     d10 d101;
/*    */     if ((d101 = this.Li0) != null) {
/*    */       JG0[] arrayOfJG0;
/*    */       byte b;
/*    */       int i;
/*    */       for (this.LG = null, this.pb0 = null, arrayOfJG0 = (JG0[])d101.Jv0(), b = 0, i = this.Li0.Z8; b < i; ) {
/*    */         Zk(arrayOfJG0[b]);
/*    */         b++;
/*    */       } 
/*    */       this.Li0.At0();
/*    */       this.Li0.clear();
/*    */       if (this.q50) {
/*    */         throws throws1 = this.Bo0;
/*    */         if (kx0 || throws1 != null) {
/*    */           pO(throws1);
/*    */         } else {
/*    */           throw new AssertionError();
/*    */         } 
/*    */       } 
/*    */       zE();
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void Zf0(boolean paramBoolean) {
/*    */     this.zI0 = paramBoolean;
/*    */   }
/*    */   
/*    */   public boolean BA() {
/*    */     JG0 jG0;
/*    */     if ((jG0 = this.fr0) != null && this.dP) {
/*    */       boolean bool;
/*    */       if (jG0.LG == this)
/*    */         return true; 
/*    */       if ((JG0[])Kc.get() == null) {
/*    */         jG0 = this;
/*    */         JG0 jG01;
/*    */         for (; (jG01 = jG0.fr0) != null; jG0 = jG01);
/*    */         jG01 = jG0;
/*    */         JG0 jG02;
/*    */         for (; (jG02 = jG01.LG) != null; jG01 = jG02);
/*    */         if (jG01 == jG0)
/*    */           jG01 = null; 
/*    */         Kc.set(new JG0[] { jG01 });
/*    */         bool = true;
/*    */       } else {
/*    */         bool = false;
/*    */       } 
/*    */       try {
/*    */         return bool1;
/*    */       } finally {
/*    */         this = null;
/*    */         if (bool)
/*    */           Kc.set(null); 
/*    */       } 
/*    */     } 
/*    */     return false;
/*    */   }
/*    */   
/*    */   public void xI0() {
/*    */     JG0 jG0;
/*    */     if ((jG0 = this.fr0) != null && jG0.LG == this)
/*    */       jG0.gA0(null); 
/*    */   }
/*    */   
/*    */   public boolean p3() {
/*    */     JG0 jG0;
/*    */     return ((jG0 = this.fr0) != null) ? ((jG0.LG == this)) : false;
/*    */   }
/*    */   
/*    */   public final Sa0 cOm7() {
/*    */     return this.O;
/*    */   }
/*    */   
/*    */   public final I xk0() {
/*    */     return this.db0;
/*    */   }
/*    */   
/*    */   public final void Vo0(I paramI) {
/*    */     this.db0 = paramI;
/*    */   }
/*    */   
/*    */   public Object Gq() {
/*    */     return this.z4;
/*    */   }
/*    */   
/*    */   public void Gq0(Object paramObject) {
/*    */     this.z4 = paramObject;
/*    */     zn();
/*    */   }
/*    */   
/*    */   public final gg0 Uz() {
/*    */     if (this.cu == null) {
/*    */       gg0 gg01;
/*    */       this();
/*    */       this.cu = gg01;
/*    */     } 
/*    */     return this.cu;
/*    */   }
/*    */   
/*    */   public JG0 Va0(int paramInt1, int paramInt2) {
/*    */     d10 d101;
/*    */     if ((d101 = this.Li0) != null) {
/*    */       JG0[] arrayOfJG0;
/*    */       int i;
/*    */       for (arrayOfJG0 = (JG0[])d101.Jv0(), i = this.Li0.Z8; i-- > 0;) {
/*    */         if ((jG01 = arrayOfJG0[i]).dP && jG01.mu0(paramInt1, paramInt2)) {
/*    */           if (jG01 != null)
/*    */             return jG01.Va0(paramInt1, paramInt2); 
/*    */           return this;
/*    */         } 
/*    */       } 
/*    */       this.Li0.At0();
/*    */     } 
/*    */     JG0 jG0 = null;
/*    */     if (jG0 != null)
/*    */       return jG0.Va0(paramInt1, paramInt2); 
/*    */     return this;
/*    */   }
/*    */   
/*    */   public void Xw(nY paramnY) {
/*    */     YZ(paramnY);
/*    */     TE(paramnY);
/*    */     U8(paramnY);
/*    */     int i = uE0.ie;
/*    */     int j = uE0.nG0;
/*    */     int k = uE0.oN;
/*    */     q80 q80;
/*    */     uE0 uE0;
/*    */     if ((uE0 = (uE0)(q80 = (q80)paramnY).Yz0("offscreenExtra", false, uE0.class, null)) == null || (uE0.M7 >= 0 && i >= 0 && j >= 0 && k >= 0)) {
/*    */       EX(paramnY);
/*    */       hC0(paramnY);
/*    */       r30(paramnY);
/*    */       this.yl = (dH)q80.Yz0("inputMap", false, dH.class, null);
/*    */       String str = "tooltip";
/*    */       this.qy0 = q80.Fy.VV(str);
/*    */       if (this.z4 == null)
/*    */         zn(); 
/*    */       MJ0();
/*    */       return;
/*    */     } 
/*    */     throw new IllegalArgumentException("negative offscreen extra size");
/*    */   }
/*    */   
/*    */   public void YZ(nY paramnY) {
/*    */     this.td0 = ((q80)paramnY).w2("background");
/*    */   }
/*    */   
/*    */   public void TE(nY paramnY) {
/*    */     this.C50 = ((q80)paramnY).w2("overlay");
/*    */   }
/*    */   
/*    */   public void U8(nY paramnY) {
/*    */     String str = "border";
/*    */     int i = 0;
/*    */     Class<uE0> clazz = uE0.class;
/*    */     uE0 uE0;
/*    */     if ((uE0 = (uE0)((q80)paramnY).Yz0(str, i, clazz, null)) == null) {
/*    */       kN(0, 0, 0, 0);
/*    */     } else {
/*    */       int j = uE0.M7;
/*    */       int k = uE0.ie;
/*    */       i = uE0.nG0;
/*    */       int m = uE0.oN;
/*    */       kN(j, k, i, m);
/*    */     } 
/*    */   }
/*    */   
/*    */   public void EX(nY paramnY) {
/*    */     uh0(((q80)paramnY).Km(0, "minWidth"), ((q80)paramnY).Km(0, "minHeight"));
/*    */   }
/*    */   
/*    */   public void hC0(nY paramnY) {
/*    */     RI(((q80)paramnY).Km(32767, "maxWidth"), ((q80)paramnY).Km(32767, "maxHeight"));
/*    */   }
/*    */   
/*    */   public void r30(nY paramnY) {
/*    */     this.v10 = ((q80)paramnY).sL("mouseCursor");
/*    */   }
/*    */   
/*    */   public Object t2(int paramInt1, int paramInt2) {
/*    */     Object object;
/*    */     if ((object = Gq()) == null)
/*    */       object = this.qy0; 
/*    */     return object;
/*    */   }
/*    */   
/*    */   public final void zn() {
/*    */     throws throws1;
/*    */     if ((throws1 = this.Bo0) != null)
/*    */       throws1.pC0(this, false); 
/*    */   }
/*    */   
/*    */   public final void qe0() {
/*    */     throws throws1;
/*    */     if ((throws1 = this.Bo0) != null)
/*    */       throws1.pC0(this, true); 
/*    */   }
/*    */   
/*    */   public void Wf() {}
/*    */   
/*    */   public final void L3(String paramString, Runnable paramRunnable) {
/*    */     Uz().ch0(paramString, paramRunnable, 1);
/*    */   }
/*    */   
/*    */   public void cZ() {
/*    */     dS dS1;
/*    */     if ((dS1 = this.Lg) != null)
/*    */       XX(dS1); 
/*    */   }
/*    */   
/*    */   public boolean yw0(oa0 paramoa0) {
/*    */     int i = paramoa0.aK;
/*    */     return mu0(i, paramoa0.gk0);
/*    */   }
/*    */   
/*    */   public boolean i2(oa0 paramoa0) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: getfield cz0 : I
/*    */     //   4: invokestatic Wm0 : (I)Z
/*    */     //   7: ifeq -> 397
/*    */     //   10: aload_0
/*    */     //   11: getfield Li0 : Lf/d10;
/*    */     //   14: ifnull -> 108
/*    */     //   17: aload_0
/*    */     //   18: getfield a3 : Z
/*    */     //   21: ifeq -> 81
/*    */     //   24: aload_0
/*    */     //   25: getfield Bo0 : Lf/throws;
/*    */     //   28: ifnull -> 81
/*    */     //   31: aload_0
/*    */     //   32: getfield Bo0 : Lf/throws;
/*    */     //   35: dup
/*    */     //   36: astore_2
/*    */     //   37: getfield kg0 : Lf/JG0;
/*    */     //   40: ifnonnull -> 81
/*    */     //   43: aload_2
/*    */     //   44: getfield lO : Lf/oa0;
/*    */     //   47: dup
/*    */     //   48: astore_3
/*    */     //   49: getfield GG0 : I
/*    */     //   52: bipush #61
/*    */     //   54: if_icmpne -> 72
/*    */     //   57: aload_3
/*    */     //   58: getfield com8 : I
/*    */     //   61: sipush #1590
/*    */     //   64: iand
/*    */     //   65: ifne -> 72
/*    */     //   68: iconst_1
/*    */     //   69: goto -> 73
/*    */     //   72: iconst_0
/*    */     //   73: ifeq -> 81
/*    */     //   76: aload_2
/*    */     //   77: aload_0
/*    */     //   78: putfield kg0 : Lf/JG0;
/*    */     //   81: aload_0
/*    */     //   82: getfield LG : Lf/JG0;
/*    */     //   85: dup
/*    */     //   86: astore_2
/*    */     //   87: ifnull -> 108
/*    */     //   90: aload_2
/*    */     //   91: getfield dP : Z
/*    */     //   94: ifeq -> 108
/*    */     //   97: aload_2
/*    */     //   98: aload_1
/*    */     //   99: invokevirtual i2 : (Lf/oa0;)Z
/*    */     //   102: ifeq -> 108
/*    */     //   105: goto -> 345
/*    */     //   108: aload_0
/*    */     //   109: getfield yl : Lf/dH;
/*    */     //   112: dup
/*    */     //   113: astore_2
/*    */     //   114: ifnull -> 395
/*    */     //   117: aload_1
/*    */     //   118: getfield cz0 : I
/*    */     //   121: invokestatic Wm0 : (I)Z
/*    */     //   124: ifeq -> 330
/*    */     //   127: aload_1
/*    */     //   128: getfield com8 : I
/*    */     //   131: dup
/*    */     //   132: istore_3
/*    */     //   133: iconst_0
/*    */     //   134: istore #4
/*    */     //   136: bipush #9
/*    */     //   138: iand
/*    */     //   139: ifeq -> 145
/*    */     //   142: iconst_1
/*    */     //   143: istore #4
/*    */     //   145: iload_3
/*    */     //   146: bipush #36
/*    */     //   148: iand
/*    */     //   149: ifeq -> 158
/*    */     //   152: iload #4
/*    */     //   154: iconst_2
/*    */     //   155: ior
/*    */     //   156: istore #4
/*    */     //   158: iload_3
/*    */     //   159: bipush #18
/*    */     //   161: iand
/*    */     //   162: ifeq -> 171
/*    */     //   165: iload #4
/*    */     //   167: iconst_4
/*    */     //   168: ior
/*    */     //   169: istore #4
/*    */     //   171: iload_3
/*    */     //   172: iconst_2
/*    */     //   173: iand
/*    */     //   174: ifeq -> 184
/*    */     //   177: iload #4
/*    */     //   179: bipush #20
/*    */     //   181: ior
/*    */     //   182: istore #4
/*    */     //   184: iload_3
/*    */     //   185: sipush #1536
/*    */     //   188: iand
/*    */     //   189: ifeq -> 199
/*    */     //   192: iload #4
/*    */     //   194: bipush #8
/*    */     //   196: ior
/*    */     //   197: istore #4
/*    */     //   199: aload_2
/*    */     //   200: getfield Sg : [Lf/dY;
/*    */     //   203: dup
/*    */     //   204: astore_2
/*    */     //   205: arraylength
/*    */     //   206: istore_3
/*    */     //   207: iconst_0
/*    */     //   208: istore #5
/*    */     //   210: iload #5
/*    */     //   212: iload_3
/*    */     //   213: if_icmpge -> 330
/*    */     //   216: iload #4
/*    */     //   218: aload_2
/*    */     //   219: iload #5
/*    */     //   221: aaload
/*    */     //   222: dup
/*    */     //   223: astore #6
/*    */     //   225: getfield pu : I
/*    */     //   228: if_icmpeq -> 234
/*    */     //   231: goto -> 307
/*    */     //   234: aload #6
/*    */     //   236: getfield Xb : I
/*    */     //   239: dup
/*    */     //   240: istore #7
/*    */     //   242: ifeq -> 257
/*    */     //   245: iload #7
/*    */     //   247: aload_1
/*    */     //   248: getfield GG0 : I
/*    */     //   251: if_icmpeq -> 257
/*    */     //   254: goto -> 307
/*    */     //   257: aload #6
/*    */     //   259: getfield nS : C
/*    */     //   262: dup
/*    */     //   263: istore #7
/*    */     //   265: ifeq -> 311
/*    */     //   268: aload_1
/*    */     //   269: getfield cz0 : I
/*    */     //   272: bipush #9
/*    */     //   274: if_icmpne -> 290
/*    */     //   277: aload_1
/*    */     //   278: getfield Z9 : C
/*    */     //   281: ifeq -> 290
/*    */     //   284: iconst_1
/*    */     //   285: istore #8
/*    */     //   287: goto -> 293
/*    */     //   290: iconst_0
/*    */     //   291: istore #8
/*    */     //   293: iload #8
/*    */     //   295: ifeq -> 307
/*    */     //   298: iload #7
/*    */     //   300: aload_1
/*    */     //   301: getfield Z9 : C
/*    */     //   304: if_icmpeq -> 311
/*    */     //   307: iconst_0
/*    */     //   308: goto -> 312
/*    */     //   311: iconst_1
/*    */     //   312: ifeq -> 324
/*    */     //   315: aload #6
/*    */     //   317: getfield Es0 : Ljava/lang/String;
/*    */     //   320: astore_2
/*    */     //   321: goto -> 332
/*    */     //   324: iinc #5, 1
/*    */     //   327: goto -> 210
/*    */     //   330: aconst_null
/*    */     //   331: astore_2
/*    */     //   332: aload_2
/*    */     //   333: ifnull -> 395
/*    */     //   336: aload_0
/*    */     //   337: aload_1
/*    */     //   338: aload_2
/*    */     //   339: invokevirtual fv : (Lf/oa0;Ljava/lang/String;)Z
/*    */     //   342: ifeq -> 349
/*    */     //   345: iconst_1
/*    */     //   346: goto -> 396
/*    */     //   349: getstatic f/JG0.zE0 : Z
/*    */     //   352: ifeq -> 395
/*    */     //   355: aload_0
/*    */     //   356: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   359: invokevirtual getName : ()Ljava/lang/String;
/*    */     //   362: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
/*    */     //   365: getstatic java/util/logging/Level.WARNING : Ljava/util/logging/Level;
/*    */     //   368: iconst_2
/*    */     //   369: anewarray java/lang/Object
/*    */     //   372: dup
/*    */     //   373: astore_1
/*    */     //   374: aload_0
/*    */     //   375: aload_1
/*    */     //   376: iconst_0
/*    */     //   377: aload_2
/*    */     //   378: aastore
/*    */     //   379: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   382: invokevirtual getName : ()Ljava/lang/String;
/*    */     //   385: iconst_1
/*    */     //   386: swap
/*    */     //   387: aastore
/*    */     //   388: ldc_w 'Unhandled action ''{0}'' for class ''{1}'''
/*    */     //   391: aload_1
/*    */     //   392: invokevirtual log : (Ljava/util/logging/Level;Ljava/lang/String;[Ljava/lang/Object;)V
/*    */     //   395: iconst_0
/*    */     //   396: ireturn
/*    */     //   397: iconst_0
/*    */     //   398: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 1
/*    */     //   #2	-> 4
/*    */     //   #3	-> 11
/*    */     //   #4	-> 37
/*    */     //   #5	-> 44
/*    */     //   #6	-> 78
/*    */     //   #7	-> 82
/*    */     //   #8	-> 91
/*    */     //   #9	-> 99
/*    */     //   #10	-> 118
/*    */     //   #11	-> 121
/*    */     //   #12	-> 128
/*    */     //   #13	-> 200
/*    */     //   #14	-> 225
/*    */     //   #15	-> 236
/*    */     //   #16	-> 248
/*    */     //   #17	-> 259
/*    */     //   #18	-> 269
/*    */     //   #19	-> 301
/*    */     //   #20	-> 317
/*    */     //   #21	-> 339
/*    */   }
/*    */   
/*    */   public final void Tb0(int paramInt1, int paramInt2) {
/*    */     d10 d101;
/*    */     if ((d101 = this.Li0) != null) {
/*    */       int i;
/*    */       if (paramInt2 >= 0 && paramInt2 < (i = d101.Z8)) {
/*    */         if (paramInt1 >= 0 && paramInt1 < i) {
/*    */           this = (JG0)d101.Hc(paramInt1);
/*    */           this.Li0.Tc(paramInt2, this);
/*    */           return;
/*    */         } 
/*    */         throw new IndexOutOfBoundsException("from");
/*    */       } 
/*    */       throw new IndexOutOfBoundsException("to");
/*    */     } 
/*    */     throw new IndexOutOfBoundsException();
/*    */   }
/*    */   
/*    */   public boolean gA0(JG0 paramJG0) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ifnull -> 26
/*    */     //   4: aload_1
/*    */     //   5: getfield fr0 : Lf/JG0;
/*    */     //   8: aload_0
/*    */     //   9: if_acmpne -> 15
/*    */     //   12: goto -> 26
/*    */     //   15: new java/lang/IllegalArgumentException
/*    */     //   18: dup
/*    */     //   19: ldc_w 'not a direct child'
/*    */     //   22: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   25: athrow
/*    */     //   26: aload_0
/*    */     //   27: getfield LG : Lf/JG0;
/*    */     //   30: dup
/*    */     //   31: astore_2
/*    */     //   32: aload_1
/*    */     //   33: if_acmpeq -> 301
/*    */     //   36: aload_1
/*    */     //   37: ifnonnull -> 57
/*    */     //   40: aload_0
/*    */     //   41: dup
/*    */     //   42: aload_2
/*    */     //   43: invokestatic Sz : (Lf/JG0;)V
/*    */     //   46: aconst_null
/*    */     //   47: putfield LG : Lf/JG0;
/*    */     //   50: aconst_null
/*    */     //   51: invokevirtual yw : (Lf/JG0;)V
/*    */     //   54: goto -> 301
/*    */     //   57: getstatic f/JG0.Kc : Ljava/lang/ThreadLocal;
/*    */     //   60: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   63: checkcast [Lf/JG0;
/*    */     //   66: ifnonnull -> 129
/*    */     //   69: aload_0
/*    */     //   70: astore_2
/*    */     //   71: aload_2
/*    */     //   72: getfield fr0 : Lf/JG0;
/*    */     //   75: dup
/*    */     //   76: astore_3
/*    */     //   77: ifnull -> 85
/*    */     //   80: aload_3
/*    */     //   81: astore_2
/*    */     //   82: goto -> 71
/*    */     //   85: aload_2
/*    */     //   86: astore_3
/*    */     //   87: aload_3
/*    */     //   88: getfield LG : Lf/JG0;
/*    */     //   91: dup
/*    */     //   92: astore #4
/*    */     //   94: ifnull -> 103
/*    */     //   97: aload #4
/*    */     //   99: astore_3
/*    */     //   100: goto -> 87
/*    */     //   103: aload_3
/*    */     //   104: aload_2
/*    */     //   105: if_acmpne -> 110
/*    */     //   108: aconst_null
/*    */     //   109: astore_3
/*    */     //   110: getstatic f/JG0.Kc : Ljava/lang/ThreadLocal;
/*    */     //   113: iconst_1
/*    */     //   114: anewarray f/JG0
/*    */     //   117: dup
/*    */     //   118: iconst_0
/*    */     //   119: aload_3
/*    */     //   120: aastore
/*    */     //   121: invokevirtual set : (Ljava/lang/Object;)V
/*    */     //   124: iconst_1
/*    */     //   125: istore_2
/*    */     //   126: goto -> 131
/*    */     //   129: iconst_0
/*    */     //   130: istore_2
/*    */     //   131: aload_0
/*    */     //   132: getfield a1 : Lf/vN;
/*    */     //   135: dup
/*    */     //   136: astore_3
/*    */     //   137: ifnonnull -> 147
/*    */     //   140: aload_0
/*    */     //   141: getstatic f/vN.Kz0 : Lf/vN;
/*    */     //   144: putfield a1 : Lf/vN;
/*    */     //   147: aload_0
/*    */     //   148: invokevirtual BA : ()Z
/*    */     //   151: ifne -> 174
/*    */     //   154: iload_2
/*    */     //   155: aload_0
/*    */     //   156: iconst_0
/*    */     //   157: istore_0
/*    */     //   158: aload_3
/*    */     //   159: putfield a1 : Lf/vN;
/*    */     //   162: ifeq -> 172
/*    */     //   165: getstatic f/JG0.Kc : Ljava/lang/ThreadLocal;
/*    */     //   168: aconst_null
/*    */     //   169: invokevirtual set : (Ljava/lang/Object;)V
/*    */     //   172: iload_0
/*    */     //   173: ireturn
/*    */     //   174: aload_1
/*    */     //   175: aload_0
/*    */     //   176: aload_1
/*    */     //   177: aload_0
/*    */     //   178: aload_1
/*    */     //   179: aload_0
/*    */     //   180: dup
/*    */     //   181: aload_3
/*    */     //   182: putfield a1 : Lf/vN;
/*    */     //   185: getfield LG : Lf/JG0;
/*    */     //   188: invokestatic Sz : (Lf/JG0;)V
/*    */     //   191: putfield LG : Lf/JG0;
/*    */     //   194: invokevirtual yw : (Lf/JG0;)V
/*    */     //   197: getfield lPt4 : Z
/*    */     //   200: ifne -> 214
/*    */     //   203: aload_1
/*    */     //   204: getfield O : Lf/Sa0;
/*    */     //   207: getstatic f/JG0.e30 : Lf/Ll;
/*    */     //   210: iconst_1
/*    */     //   211: invokevirtual gf0 : (Lf/Ll;Z)V
/*    */     //   214: aload_1
/*    */     //   215: getfield a1 : Lf/vN;
/*    */     //   218: dup
/*    */     //   219: astore_3
/*    */     //   220: getstatic f/JG0.Kc : Ljava/lang/ThreadLocal;
/*    */     //   223: dup
/*    */     //   224: astore #4
/*    */     //   226: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   229: checkcast [Lf/JG0;
/*    */     //   232: astore #5
/*    */     //   234: ifnull -> 240
/*    */     //   237: goto -> 244
/*    */     //   240: getstatic f/vN.QE : Lf/vN;
/*    */     //   243: astore_3
/*    */     //   244: aload #5
/*    */     //   246: ifnull -> 258
/*    */     //   249: aload #5
/*    */     //   251: iconst_0
/*    */     //   252: aaload
/*    */     //   253: astore #5
/*    */     //   255: goto -> 261
/*    */     //   258: aconst_null
/*    */     //   259: astore #5
/*    */     //   261: iload_2
/*    */     //   262: aload_1
/*    */     //   263: aload_3
/*    */     //   264: aload #5
/*    */     //   266: invokevirtual LB : (Lf/vN;Lf/JG0;)V
/*    */     //   269: ifeq -> 301
/*    */     //   272: aload #4
/*    */     //   274: aconst_null
/*    */     //   275: invokevirtual set : (Ljava/lang/Object;)V
/*    */     //   278: goto -> 301
/*    */     //   281: aload_0
/*    */     //   282: aload_3
/*    */     //   283: putfield a1 : Lf/vN;
/*    */     //   286: athrow
/*    */     //   287: astore_0
/*    */     //   288: iload_2
/*    */     //   289: ifeq -> 299
/*    */     //   292: getstatic f/JG0.Kc : Ljava/lang/ThreadLocal;
/*    */     //   295: aconst_null
/*    */     //   296: invokevirtual set : (Ljava/lang/Object;)V
/*    */     //   299: aload_0
/*    */     //   300: athrow
/*    */     //   301: aload_0
/*    */     //   302: getfield lPt4 : Z
/*    */     //   305: ifne -> 337
/*    */     //   308: aload_0
/*    */     //   309: dup
/*    */     //   310: getfield O : Lf/Sa0;
/*    */     //   313: astore_1
/*    */     //   314: getstatic f/JG0.jz0 : Lf/Ll;
/*    */     //   317: astore_2
/*    */     //   318: getfield LG : Lf/JG0;
/*    */     //   321: ifnull -> 329
/*    */     //   324: iconst_1
/*    */     //   325: istore_3
/*    */     //   326: goto -> 331
/*    */     //   329: iconst_0
/*    */     //   330: istore_3
/*    */     //   331: aload_1
/*    */     //   332: aload_2
/*    */     //   333: iload_3
/*    */     //   334: invokevirtual gf0 : (Lf/Ll;Z)V
/*    */     //   337: aload_0
/*    */     //   338: getfield LG : Lf/JG0;
/*    */     //   341: ifnull -> 348
/*    */     //   344: iconst_1
/*    */     //   345: goto -> 349
/*    */     //   348: iconst_0
/*    */     //   349: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 57
/*    */     //   #2	-> 72
/*    */     //   #3	-> 88
/*    */     //   #4	-> 132
/*    */     //   #5	-> 165
/*    */     //   #6	-> 182
/*    */     //   #7	-> 275
/*    */     //   #8	-> 283
/*    */     //   #9	-> 292
/*    */     //   #10	-> 300
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   131	135	287	finally
/*    */     //   140	147	287	finally
/*    */     //   147	151	281	finally
/*    */     //   158	162	287	finally
/*    */     //   174	200	287	finally
/*    */     //   203	218	287	finally
/*    */     //   220	223	287	finally
/*    */     //   226	232	287	finally
/*    */     //   240	243	287	finally
/*    */     //   249	253	287	finally
/*    */     //   261	269	287	finally
/*    */     //   281	287	287	finally
/*    */   }
/*    */   
/*    */   public void ED0(throws paramthrows) {}
/*    */   
/*    */   public void LM(throws paramthrows) {}
/*    */   
/*    */   public void d40() {}
/*    */   
/*    */   public void oi() {}
/*    */   
/*    */   public void Gu() {
/*    */     rq0();
/*    */   }
/*    */   
/*    */   public void UW(JG0 paramJG0) {
/*    */     MJ0();
/*    */   }
/*    */   
/*    */   public void zE() {
/*    */     MJ0();
/*    */   }
/*    */   
/*    */   public void yw(JG0 paramJG0) {}
/*    */   
/*    */   public void GD() {}
/*    */   
/*    */   public void pm() {}
/*    */   
/*    */   public void LB(vN paramvN, JG0 paramJG0) {
/*    */     pm();
/*    */   }
/*    */   
/*    */   public void V7() {}
/*    */   
/*    */   public void V90(throws paramthrows) {
/*    */     yV(paramthrows);
/*    */     J00(paramthrows);
/*    */     d10 d101;
/*    */     if ((d101 = this.Li0) != null) {
/*    */       JG0[] arrayOfJG0;
/*    */       byte b;
/*    */       int i;
/*    */       for (arrayOfJG0 = (JG0[])d101.Jv0(), b = 0, i = this.Li0.Z8; b < i; ) {
/*    */         JG0 jG0;
/*    */         if ((jG0 = arrayOfJG0[b]) != null && jG0.dP) {
/*    */           I i1;
/*    */           if ((i1 = jG0.db0) != null && i1.mi) {
/*    */             jG0.NL0(paramthrows);
/*    */           } else if (jG0.l0) {
/*    */             jG0.Kr0(paramthrows);
/*    */           } else {
/*    */             jG0.V90(paramthrows);
/*    */           } 
/*    */         } 
/*    */         b++;
/*    */       } 
/*    */       this.Li0.At0();
/*    */     } 
/*    */     R60(paramthrows);
/*    */   }
/*    */   
/*    */   public void WN(throws paramthrows, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*    */     yV(paramthrows);
/*    */     J00(paramthrows);
/*    */     d10 d101;
/*    */     if ((d101 = this.Li0) != null) {
/*    */       JG0[] arrayOfJG0;
/*    */       byte b;
/*    */       int i;
/*    */       for (arrayOfJG0 = (JG0[])d101.Jv0(), b = 0, i = this.Li0.Z8; b < i; ) {
/*    */         JG0 jG0;
/*    */         if ((jG0 = arrayOfJG0[b]).dP) {
/*    */           I i1;
/*    */           if ((i1 = jG0.db0) != null && i1.mi) {
/*    */             jG0.NL0(paramthrows);
/*    */           } else if (jG0.l0) {
/*    */             jG0.Kr0(paramthrows);
/*    */           } else {
/*    */             int j;
/*    */             int k;
/*    */             if ((paramInt2 < (j = jG0.er0) + (k = jG0.HC) && paramInt2 + paramInt4 > j) || paramInt4 < k)
/*    */               jG0.WN(paramthrows, paramInt1, paramInt2, paramInt3, paramInt4); 
/*    */           } 
/*    */         } 
/*    */         b++;
/*    */       } 
/*    */       this.Li0.At0();
/*    */     } 
/*    */     R60(paramthrows);
/*    */   }
/*    */   
/*    */   public void J00(throws paramthrows) {}
/*    */   
/*    */   public void yV(throws paramthrows) {
/*    */     mX mX1;
/*    */     if ((mX1 = mA()) != null) {
/*    */       Sa0 sa0 = this.O;
/*    */       int i = this.Kd, j = this.er0, k = this.xY, m = this.HC;
/*    */       mX1.W8(this, i, j, k, m);
/*    */     } 
/*    */   }
/*    */   
/*    */   public void R60(throws paramthrows) {
/*    */     mX mX1;
/*    */     if ((mX1 = this.C50) != null) {
/*    */       Sa0 sa0 = this.O;
/*    */       int i = this.Kd, j = this.er0, k = this.xY, m = this.HC;
/*    */       mX1.W8(this, i, j, k, m);
/*    */     } 
/*    */   }
/*    */   
/*    */   public void Ve(throws paramthrows, int paramInt1, int paramInt2, int paramInt3) {}
/*    */   
/*    */   public final void rq0() {
/*    */     this.kM = 1;
/*    */     if (this.kM < 1 && (this = this.Bo0) != null)
/*    */       ((throws)this).RF = true; 
/*    */   }
/*    */   
/*    */   public final void S20(JG0 paramJG0) {
/*    */     if (paramJG0.fr0 == this) {
/*    */       int i = RS();
/*    */       paramJG0.Ol0(i, e3());
/*    */       i = qF();
/*    */       paramJG0.Tm(i, Hy());
/*    */       return;
/*    */     } 
/*    */     throw new IllegalArgumentException("can only layout direct children");
/*    */   }
/*    */   
/*    */   public void zG0() {
/*    */     this.db0.s90();
/*    */   }
/*    */   
/*    */   public final void lH(String paramString, boolean paramBoolean1, boolean paramBoolean2) {
/*    */     PropertyChangeSupport propertyChangeSupport;
/*    */     if ((propertyChangeSupport = this.kD0) != null)
/*    */       firePropertyChange(paramString, paramBoolean1, paramBoolean2); 
/*    */   }
/*    */   
/*    */   public void lX(JG0 paramJG0) {
/*    */     this.fr0 = paramJG0;
/*    */   }
/*    */   
/*    */   public final void dc0(throws paramthrows, boolean paramBoolean) {
/*    */     if (this.q50 != paramBoolean) {
/*    */       this.q50 = paramBoolean;
/*    */       if (!this.lPt4)
/*    */         this.O.gf0(OL0, paramBoolean); 
/*    */       if ((this = this.fr0) != null)
/*    */         if (paramBoolean) {
/*    */           dc0(paramthrows, true);
/*    */         } else {
/*    */           pO(paramthrows);
/*    */         }  
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void pO(throws paramthrows) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: invokevirtual Ub : ()I
/*    */     //   4: iconst_2
/*    */     //   5: isub
/*    */     //   6: istore_2
/*    */     //   7: iload_2
/*    */     //   8: dup
/*    */     //   9: iconst_m1
/*    */     //   10: iadd
/*    */     //   11: istore_2
/*    */     //   12: iconst_1
/*    */     //   13: if_icmple -> 36
/*    */     //   16: aload_1
/*    */     //   17: iload_2
/*    */     //   18: invokevirtual lPt3 : (I)Lf/JG0;
/*    */     //   21: checkcast f/iz0
/*    */     //   24: getfield AU : Lf/JG0;
/*    */     //   27: aload_0
/*    */     //   28: if_acmpne -> 7
/*    */     //   31: iconst_1
/*    */     //   32: istore_2
/*    */     //   33: goto -> 38
/*    */     //   36: iconst_0
/*    */     //   37: istore_2
/*    */     //   38: iload_2
/*    */     //   39: ifeq -> 49
/*    */     //   42: aload_0
/*    */     //   43: aload_1
/*    */     //   44: iconst_1
/*    */     //   45: invokevirtual dc0 : (Lf/throws;Z)V
/*    */     //   48: return
/*    */     //   49: aload_0
/*    */     //   50: getfield Li0 : Lf/d10;
/*    */     //   53: dup
/*    */     //   54: astore_2
/*    */     //   55: ifnull -> 105
/*    */     //   58: aload_0
/*    */     //   59: aload_2
/*    */     //   60: invokevirtual Jv0 : ()[Ljava/lang/Object;
/*    */     //   63: checkcast [Lf/JG0;
/*    */     //   66: astore_2
/*    */     //   67: getfield Li0 : Lf/d10;
/*    */     //   70: getfield Z8 : I
/*    */     //   73: istore_3
/*    */     //   74: iload_3
/*    */     //   75: dup
/*    */     //   76: iconst_m1
/*    */     //   77: iadd
/*    */     //   78: istore_3
/*    */     //   79: ifle -> 98
/*    */     //   82: aload_2
/*    */     //   83: iload_3
/*    */     //   84: aaload
/*    */     //   85: getfield q50 : Z
/*    */     //   88: ifeq -> 74
/*    */     //   91: aload_0
/*    */     //   92: aload_1
/*    */     //   93: iconst_1
/*    */     //   94: invokevirtual dc0 : (Lf/throws;Z)V
/*    */     //   97: return
/*    */     //   98: aload_0
/*    */     //   99: getfield Li0 : Lf/d10;
/*    */     //   102: invokevirtual At0 : ()V
/*    */     //   105: aload_0
/*    */     //   106: aload_1
/*    */     //   107: iconst_0
/*    */     //   108: invokevirtual dc0 : (Lf/throws;Z)V
/*    */     //   111: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 1
/*    */     //   #2	-> 18
/*    */     //   #3	-> 24
/*    */     //   #4	-> 45
/*    */   }
/*    */   
/*    */   public JG0 gg() {
/*    */     if (!this.dP)
/*    */       return null; 
/*    */     JG0 jG0;
/*    */     while ((jG0 = this.pb0) != null && this.dP)
/*    */       this = jG0; 
/*    */     return this;
/*    */   }
/*    */   
/*    */   public final boolean ME(int paramInt1, int paramInt2) {
/*    */     int j = paramInt2 - this.er0;
/*    */     int i;
/*    */     if ((i = paramInt1 - this.Kd) != 0 || j != 0) {
/*    */       this.Kd = paramInt1;
/*    */       this.er0 = paramInt2;
/*    */       d10 d101;
/*    */       if ((d101 = this.Li0) != null) {
/*    */         JG0[] arrayOfJG0;
/*    */         byte b;
/*    */         int k;
/*    */         for (arrayOfJG0 = (JG0[])d101.Jv0(), b = 0, k = this.Li0.Z8; b < k; ) {
/*    */           JG0 jG0;
/*    */           arrayOfJG0[b].ME((jG0 = arrayOfJG0[b]).Kd + i, jG0.er0 + j);
/*    */           b++;
/*    */         } 
/*    */         this.Li0.At0();
/*    */       } 
/*    */       oi();
/*    */       if (this.kD0 != null) {
/*    */         US(paramInt1 - i, paramInt1, "x");
/*    */         US(paramInt2 - j, paramInt2, "y");
/*    */       } 
/*    */       return true;
/*    */     } 
/*    */     return false;
/*    */   }
/*    */   
/*    */   public void XX(dS paramdS) {
/*    */     JG0[] arrayOfJG0;
/*    */     this.Lg = paramdS;
/*    */     String str;
/*    */     if ((str = dA()).length() == 0) {
/*    */       d10 d101;
/*    */       if ((d101 = this.Li0) != null) {
/*    */         byte b;
/*    */         int i;
/*    */         for (arrayOfJG0 = (JG0[])d101.Jv0(), b = 0, i = this.Li0.Z8; b < i; ) {
/*    */           arrayOfJG0[b].XX(paramdS);
/*    */           b++;
/*    */         } 
/*    */         this.Li0.At0();
/*    */       } 
/*    */       return;
/*    */     } 
/*    */     lI lI;
/*    */     (lI = lI.wb()).getClass();
/*    */     try {
/*    */       nY nY;
/*    */       if ((nY = paramdS.GK((String)arrayOfJG0, true, true)) != null && this.cl.length() > 0)
/*    */         try {
/*    */           Xw(nY);
/*    */         } catch (Exception exception) {
/*    */           Ni0().log(Level.SEVERE, "Exception in applyTheme()", exception);
/*    */         }  
/*    */       return;
/*    */     } finally {
/*    */       this = null;
/*    */     } 
/*    */   }
/*    */   
/*    */   public JG0 Oz0(oa0 paramoa0) {
/*    */     if (kx0 || !paramoa0.Ua) {
/*    */       d10 d101;
/*    */       if ((d101 = this.Li0) != null) {
/*    */         JG0[] arrayOfJG0;
/*    */         int i;
/*    */         for (arrayOfJG0 = (JG0[])d101.Jv0(), i = this.Li0.Z8; i-- > 0;) {
/*    */           if ((jG0 = arrayOfJG0[i]).dP && jG0.yw0(paramoa0) && zo(jG0, paramoa0)) {
/*    */             int j;
/*    */             if ((j = paramoa0.cz0) == 1 || j == 7)
/*    */               return jG0; 
/*    */             JG0 jG01;
/*    */             if ((jG01 = jG0.Oz0(paramoa0)) != null) {
/*    */               if (paramoa0.cz0 == 3 && this.LG != jG0)
/*    */                 try {
/*    */                   jG0.a1 = vN.Am;
/*    */                   if (jG0.kN && jG0.zI0)
/*    */                     gA0(jG0); 
/*    */                 } finally {
/*    */                   jG0.a1 = null;
/*    */                 }  
/*    */               return jG01;
/*    */             } 
/*    */           } 
/*    */         } 
/*    */         this.Li0.At0();
/*    */       } 
/*    */       if (paramoa0.cz0 == 3 && this.kN && this.zI0)
/*    */         try {
/*    */           this.a1 = vN.Am;
/*    */           if (this.LG == null) {
/*    */           
/*    */           } else {
/*    */           
/*    */           } 
/*    */           gA0(null);
/*    */         } finally {
/*    */           this.a1 = null;
/*    */         }  
/*    */       if (paramoa0.cz0 != 8)
/*    */         zo(null, paramoa0); 
/*    */       if (!this.kN) {
/*    */         int i;
/*    */         if ((i = paramoa0.cz0) == 3 || i == 4 || i == 5 || i == 6) {
/*    */           i = 1;
/*    */         } else {
/*    */           i = 0;
/*    */         } 
/*    */         if (i != 0)
/*    */           return this; 
/*    */       } 
/*    */       return i2(paramoa0) ? this : null;
/*    */     } 
/*    */     throw new AssertionError();
/*    */   }
/*    */   
/*    */   public final void ut(oa0 paramoa0) {
/*    */     i2(paramoa0);
/*    */     d10 d101;
/*    */     if ((d101 = this.Li0) != null) {
/*    */       JG0[] arrayOfJG0 = (JG0[])d101.Jv0();
/*    */       byte b = 0;
/*    */       int i = this.Li0.Z8;
/*    */       while (b < i) {
/*    */         arrayOfJG0[b].ut(paramoa0);
/*    */         b++;
/*    */       } 
/*    */       this.Li0.At0();
/*    */     } 
/*    */   }
/*    */   
/*    */   public final boolean zo(JG0 paramJG0, oa0 paramoa0) {
/*    */     if (this.pb0 != paramJG0) {
/*    */       if (paramJG0 != null) {
/*    */         boolean bool = true;
/*    */         if (paramoa0.pD0 == null) {
/*    */           oa0 oa02;
/*    */           this();
/*    */           paramoa0.pD0 = oa02;
/*    */         } 
/*    */         oa01.cz0 = bool;
/*    */         oa01.aK = paramoa0.aK;
/*    */         oa01.gk0 = paramoa0.gk0;
/*    */         oa01.vl = paramoa0.vl;
/*    */         oa01.kB0 = paramoa0.kB0;
/*    */         oa01.uC = paramoa0.uC;
/*    */         oa01.Ua = paramoa0.Ua;
/*    */         oa01.sj = paramoa0.sj;
/*    */         oa01.Z9 = paramoa0.Z9;
/*    */         oa01.GG0 = paramoa0.GG0;
/*    */         oa0 oa01;
/*    */         (oa01 = paramoa0.pD0).com8 = paramoa0.com8;
/*    */         if (paramJG0.Oz0(paramoa0.pD0) == null)
/*    */           return false; 
/*    */       } 
/*    */       JG0 jG0;
/*    */       if ((jG0 = this.pb0) != null) {
/*    */         byte b = 7;
/*    */         if (paramoa0.pD0 == null) {
/*    */           oa0 oa02;
/*    */           this();
/*    */           paramoa0.pD0 = oa02;
/*    */         } 
/*    */         oa01.cz0 = b;
/*    */         oa01.aK = paramoa0.aK;
/*    */         oa01.gk0 = paramoa0.gk0;
/*    */         oa01.vl = paramoa0.vl;
/*    */         oa01.kB0 = paramoa0.kB0;
/*    */         oa01.uC = paramoa0.uC;
/*    */         oa01.Ua = paramoa0.Ua;
/*    */         oa01.sj = paramoa0.sj;
/*    */         oa01.Z9 = paramoa0.Z9;
/*    */         oa01.GG0 = paramoa0.GG0;
/*    */         oa0 oa01;
/*    */         (oa01 = paramoa0.pD0).com8 = paramoa0.com8;
/*    */         jG0.Oz0(paramoa0.pD0);
/*    */       } 
/*    */       this.pb0 = paramJG0;
/*    */     } 
/*    */     return true;
/*    */   }
/*    */   
/*    */   public final void A90(ArrayList<JG0> paramArrayList) {
/*    */     if (this.kM != 0)
/*    */       paramArrayList.add(this); 
/*    */     d10 d101;
/*    */     if ((d101 = this.Li0) != null) {
/*    */       JG0[] arrayOfJG0 = (JG0[])d101.Jv0();
/*    */       byte b = 0;
/*    */       int i = this.Li0.Z8;
/*    */       while (b < i) {
/*    */         arrayOfJG0[b].A90(paramArrayList);
/*    */         b++;
/*    */       } 
/*    */       this.Li0.At0();
/*    */     } 
/*    */   }
/*    */   
/*    */   public int Zs0() {
/*    */     return this.jl;
/*    */   }
/*    */   
/*    */   public void Pb0(int paramInt) {
/*    */     this.jl = paramInt;
/*    */   }
/*    */   
/*    */   public int YR() {
/*    */     return 0;
/*    */   }
/*    */   
/*    */   public int t8() {
/*    */     return 0;
/*    */   }
/*    */   
/*    */   public void D8() {
/*    */     d10 d101;
/*    */     if ((d101 = this.Li0) != null) {
/*    */       JG0[] arrayOfJG0 = (JG0[])d101.Jv0();
/*    */       byte b = 0;
/*    */       int i = this.Li0.Z8;
/*    */       while (b < i) {
/*    */         JG0 jG0;
/*    */         if ((jG0 = arrayOfJG0[b]).dP)
/*    */           jG0.D8(); 
/*    */         b++;
/*    */       } 
/*    */       this.Li0.At0();
/*    */     } 
/*    */   }
/*    */   
/*    */   public boolean fC() {
/*    */     return false;
/*    */   }
/*    */   
/*    */   public final JG0 e9() {
/*    */     if (!p3())
/*    */       return null; 
/*    */     JG0 jG0;
/*    */     while ((jG0 = this.LG) != null)
/*    */       this = jG0; 
/*    */     return this;
/*    */   }
/*    */   
/*    */   public final boolean hq0(int paramInt, boolean paramBoolean) {
/*    */     this();
/*    */     ArrayList arrayList;
/*    */     JG0 jG0;
/*    */     int i = rl(new ArrayList());
/*    */     if (isEmpty())
/*    */       return false; 
/*    */     if (paramInt < 0) {
/*    */       if (!paramBoolean || (paramInt = i + -1) < 0)
/*    */         paramInt = size() - 1; 
/*    */     } else if (!paramBoolean || (paramInt = i + 1) >= size()) {
/*    */       paramInt = 0;
/*    */     } 
/*    */     try {
/*    */       (jG0 = (JG0)get(paramInt)).a1 = vN.N1;
/*    */       ((JG0)get(paramInt)).gA0(null);
/*    */       ((JG0)get(paramInt)).BA();
/*    */       return true;
/*    */     } finally {
/*    */       this.a1 = null;
/*    */     } 
/*    */   }
/*    */   
/*    */   public boolean fv(oa0 paramoa0, String paramString) {
/*    */     gg0 gg01;
/*    */     return ((gg01 = this.cu) != null) ? xW(paramoa0, paramString) : false;
/*    */   }
/*    */   
/*    */   public final void US(int paramInt1, int paramInt2, String paramString) {
/*    */     PropertyChangeSupport propertyChangeSupport;
/*    */     if ((propertyChangeSupport = this.kD0) != null)
/*    */       firePropertyChange(paramString, paramInt1, paramInt2); 
/*    */   }
/*    */   
/*    */   public final void IF0(Xv0 paramXv0) {
/*    */     this.DA0 = paramXv0;
/*    */   }
/*    */   
/*    */   public void Ol0(int paramInt1, int paramInt2) {
/*    */     ME(paramInt1, paramInt2);
/*    */   }
/*    */   
/*    */   public final void js0(et paramet) {
/*    */     JG0 jG0;
/*    */     if ((jG0 = this.fr0) == null)
/*    */       return; 
/*    */     int i = jG0.xY;
/*    */     i = paramet.Sp(i, this.xY);
/*    */     int j = this.fr0.HC;
/*    */     ME(i, paramet.nV(j, this.HC));
/*    */   }
/*    */   
/*    */   public final void qB0(et paramet) {
/*    */     if (this.fr0 == null)
/*    */       return; 
/*    */     int i = this.Bo0.xY;
/*    */     i = paramet.Sp(i, this.xY);
/*    */     int j = this.Bo0.HC;
/*    */     ME(i, paramet.nV(j, this.HC));
/*    */   }
/*    */   
/*    */   public final void Ez(et paramet, int paramInt1, int paramInt2) {
/*    */     if (this.fr0 == null)
/*    */       return; 
/*    */     int i = this.Bo0.xY;
/*    */     i = paramet.Sp(i, this.xY) + paramInt1;
/*    */     int j = this.Bo0.HC;
/*    */     ME(i, paramet.nV(j, this.HC) + paramInt2);
/*    */   }
/*    */   
/*    */   public final void QJ0(et paramet, int paramInt1, int paramInt2) {
/*    */     JG0 jG0;
/*    */     if ((jG0 = this.fr0) == null)
/*    */       return; 
/*    */     int i = jG0.xY;
/*    */     i = paramet.Sp(i, this.xY) + paramInt1;
/*    */     int j = this.fr0.HC;
/*    */     ME(i, paramet.nV(j, this.HC) + paramInt2);
/*    */   }
/*    */   
/*    */   public final boolean ec(et paramet, int paramInt) {
/*    */     int k = 0;
/*    */     JG0 jG0;
/*    */     if ((jG0 = this.fr0) == null)
/*    */       return false; 
/*    */     int i = jG0.Kd;
/*    */     int j = jG0.xY;
/*    */     i = paramet.Sp(j, this.xY) + i + k;
/*    */     j = this.fr0.er0;
/*    */     k = this.fr0.HC;
/*    */     return ME(i, paramet.nV(k, this.HC) + j + paramInt);
/*    */   }
/*    */   
/*    */   public final void yN(int paramInt1, int paramInt2) {
/*    */     paramInt1 = paramInt1 + this.px + this.EA;
/*    */     Tm(paramInt1, paramInt2 + this.X20 + this.WU);
/*    */   }
/*    */   
/*    */   public final void xL0() {
/*    */     this.l0 = true;
/*    */   }
/*    */   
/*    */   public final void Vo() {
/*    */     this.a3 = false;
/*    */   }
/*    */   
/*    */   public final void hn(pE parampE) {
/*    */     this.td0 = parampE;
/*    */   }
/*    */   
/*    */   public final void lv() {
/*    */     Class<Qa0> clazz = Qa0.class;
/*    */     d10 d101;
/*    */     if ((d101 = this.Li0) != null) {
/*    */       fQ fQ;
/*    */       this.LG = null;
/*    */       this.pb0 = null;
/*    */       JG0[] arrayOfJG0 = (JG0[])d101.Jv0();
/*    */       this();
/*    */       byte b;
/*    */       int i;
/*    */       for (b = 0, i = this.Li0.Z8; b < i; ) {
/*    */         JG0 jG0;
/*    */         if (clazz.isInstance(jG0 = arrayOfJG0[b])) {
/*    */           fQ.Com3(jG0);
/*    */           Zk(jG0);
/*    */         } 
/*    */         b++;
/*    */       } 
/*    */       this.Li0.At0();
/*    */       this.Li0.tF(fQ, false);
/*    */       if (this.q50) {
/*    */         throws throws1 = this.Bo0;
/*    */         if (kx0 || throws1 != null) {
/*    */           pO(throws1);
/*    */           return;
/*    */         } 
/*    */         throw new AssertionError();
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void fk() {
/*    */     this.te = false;
/*    */   }
/*    */   
/*    */   public final void oZ() {
/*    */     hq0(1, true);
/*    */   }
/*    */   
/*    */   public final void q0() {
/*    */     hq0(-1, true);
/*    */   }
/*    */   
/*    */   public void Ev0() {
/*    */     hq0(1, false);
/*    */   }
/*    */   
/*    */   public final void lpt5() {
/*    */     this.yl = dH.TB;
/*    */   }
/*    */   
/*    */   public void t30() {
/*    */     MJ0();
/*    */   }
/*    */   
/*    */   public void HK0() {
/*    */     MJ0();
/*    */   }
/*    */   
/*    */   public void Q2() {}
/*    */   
/*    */   static {
/*    */     boolean bool;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/JG0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */