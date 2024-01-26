/*  1 */ package f;public final class t90 implements pe { public void init(dS paramdS) { if (this.sJ0) return;  this.sJ0 = true; if (this.qO) { this.p20.init(paramdS); this.u00 = (this = this.p20).u00; this.GS = this.GS; this.Xe = this.Xe; this.x4 = this.x4; return; }  Logger.getLogger(t90.class.getName())
/*    */ 
/*    */ 
/*    */       
/*  5 */       .info(B40.df("Generating atlas for font ").append(this.jb0.ml.getName()).toString()); float f; if ((f = jI) <= 0.001D) f = 1.0F;  G g2; if ((g2.A = (int)((g2 = this.wd).A / f)) < 3) g2.A = 3;  g2.Lp = (int)(g2.Lp / f); g2.YA = (int)(g2.YA / f); g2.hj /= f; if (Xb0) { cu0 cu0 = cu0.IE; g2.IS = cu0; }  if (g2.gJ) { oF0 oF0; Uc uc; if (this.w70) { uc = Uc.xi0; this(2048, 2048, uc, 1, false); g2.I30 = oF0; }
/*  6 */       else { oF0 oF01; if ((oF01 = ((dS)oF0).d70) == null)
/*  7 */         { eV eV; this(); Uc uc1 = Uc.xi0; this(1024, 1024, uc1, 1, false, eV); ((dS)oF0).d70 = new oF0(); Color color = Color.WHITE; oF01
/*  8 */             .LS
/*  9 */             .set(color);
/*    */           
/* 11 */           (oF01 = ((dS)oF0).d70).LS
/* 12 */             .a = 0.0F; }  ((G)uc)
/* 13 */           .I30 = oF01; }  }  this.xJ0 = new RD0[0]; if (this.wd.gJ) if (this.jb0
/* 14 */         .ml
/* 15 */         .getName()
/* 16 */         .equals("NotoSansCJK-Medium.ttc")) { this.xJ0 = new RD0[] { this.jb0.wT().f0("NotoSans-Medium.ttf") }; } else if (this.jb0
/* 17 */         .ml
/* 18 */         .getName()
/* 19 */         .equals("NotoSansCJK-Bold.ttc")) { this.xJ0 = new RD0[] { this.jb0.wT().f0("NotoSans-Bold.ttf") }; }   RD0[] arrayOfRD0; byte b2; for (this.x4 = new Me[(arrayOfRD0 = this.xJ0).length], this.GS = new Gf[arrayOfRD0.length], this.p3 = new OZ[arrayOfRD0.length], b2 = 0; b2 < this.x4.length; ) { Gf[] arrayOfGf = this.GS; RD0 rD01 = this.xJ0[b2]; boolean bool = false; hK0 hK02; (hK02 = this.cD).getClass();
/*    */ 
/*    */       
/* 22 */       String str1 = rD01.KU.ordinal() + rD01.rw() + "-" + bool; PL0 pL01; if ((pL01 = (PL0)this.cD.s30.pd0(str1)) == null) { this(); (new PL0()).GL = new Gf(rD01, bool); hK02.s30.X00(str1, pL01); }  pL01.Or++; arrayOfGf[b2] = pL01.GL; this
/* 23 */         .p3[b2] = new OZ(); this.x4[b2] = this.GS[b2].Ga0(this.wd, this.p3[b2]); b2++; }  this.pK0 = new lm0(this); RD0 rD0 = this.jb0; int i = this.JC0; hK0 hK01; (hK01 = this.cD).getClass();
/*    */ 
/*    */     
/* 26 */     String str = rD0.KU.ordinal() + rD0.rw() + "-" + i; PL0 pL0; if ((pL0 = (PL0)this.cD.s30.pd0(str)) == null) { this(); (new PL0()).GL = new Gf(rD0, i); hK01.s30.X00(str, pL0); }  pL0.Or++; byte b1; Me[] arrayOfMe;
/* 27 */     for (G g1 = this.wd; b1 < (arrayOfMe = this.x4).length; )
/* 28 */     { lm0 lm01; (arrayOfMe[b1]).XO
/* 29 */         .p30 = ((vQ)(lm01 = this.pK0)).p30; (arrayOfMe[b1]).XO.Y5 = ((vQ)lm01).Y5; (arrayOfMe[b1]).XO.nO = ((vQ)lm01).nO; (arrayOfMe[b1]).XO.am = ((vQ)lm01).am; (arrayOfMe[b1]).XO.DD = ((vQ)lm01).DD; (arrayOfMe[b1]).XO.nu = ((vQ)lm01).nu; (arrayOfMe[b1]).XO.kw = ((vQ)lm01).kw; (arrayOfMe[b1]).XO.j90 = ((vQ)lm01).j90; b1++; }  if (!nx0.JC0(f, 1.0F)) { this.Xe
/* 30 */         .Hr0 = false;
/* 31 */       this.Xe.Ca
/* 32 */         .Ns = false; }  this
/* 33 */       .pK0.rM(f); dt[] arrayOfDt; for (this.ye = new R3(), b1 = 0; b1 < (arrayOfDt = this.I80).length; ) { Nq nq; this(arrayOfDt[b1]); this.FL0[b1] = nq; b1++; }
/*    */      }
/*    */ 
/*    */   
/*    */   public static float jI = 1.0F;
/*    */   public static boolean Xb0 = false;
/*    */   public static String md0;
/*    */   public static boolean w40 = true;
/*    */   public tw u00;
/*    */   public final Nq[] FL0;
/*    */   public final vc Hq;
/*    */   public final String wC;
/*    */   public boolean qO = false;
/*    */   public t90 p20;
/*    */   public RD0 jb0;
/*    */   public RD0[] xJ0;
/*    */   public String[] yj;
/*    */   public int JC0;
/*    */   public boolean w70;
/*    */   public hK0 cD;
/*    */   public lm0 pK0;
/*    */   public OZ[] p3;
/*    */   public Gf[] GS;
/*    */   public Me Xe;
/*    */   public Me[] x4;
/*    */   public R3 ye;
/*    */   public G wd;
/*    */   public dt[] I80;
/*    */   public boolean sJ0;
/*    */   public boolean lg0;
/*    */   public boolean nQ;
/*    */   
/*    */   public t90(String paramString, tw paramtw, RD0 paramRD0, G paramG, vc paramvc, String[] paramArrayOfString, boolean paramBoolean1, boolean paramBoolean2, hK0 paramhK0, dt... paramVarArgs) {
/*    */     this.p20 = null;
/*    */     this.JC0 = 0;
/*    */     this.w70 = false;
/*    */     this.sJ0 = false;
/*    */     this.lg0 = false;
/*    */     this.wC = paramString;
/*    */     this.u00 = paramtw;
/*    */     this.jb0 = paramRD0;
/*    */     this.cD = paramhK0;
/*    */     this.Hq = paramvc;
/*    */     this.yj = paramArrayOfString;
/*    */     this.JC0 = LPT8();
/*    */     this.w70 = paramBoolean1;
/*    */     this.FL0 = new Nq[paramVarArgs.length];
/*    */     this.wd = paramG;
/*    */     this.I80 = paramVarArgs;
/*    */     this.nQ = paramBoolean2;
/*    */   }
/*    */   
/*    */   public t90(String paramString, t90 paramt90, vc paramvc, dt... paramVarArgs) {
/*    */     this.JC0 = 0;
/*    */     this.w70 = false;
/*    */     this.sJ0 = false;
/*    */     this.lg0 = false;
/*    */     this.wC = paramString;
/*    */     this.p20 = paramt90;
/*    */     this.ye = new R3();
/*    */     this.Hq = paramvc;
/*    */     this.FL0 = new Nq[paramVarArgs.length];
/*    */     for (byte b = 0; b < paramVarArgs.length; b++) {
/*    */       Nq nq;
/*    */       this(paramVarArgs[b]);
/*    */       this.FL0[b] = nq;
/*    */     } 
/*    */     this.qO = true;
/*    */   }
/*    */   
/*    */   public static boolean bigCJKFontSizes() {
/*    */     return (md0 != null && w40);
/*    */   }
/*    */   
/*    */   public final int LPT8() {
/*    */     if (md0 != null && this.yj.length > 1) {
/*    */       String[] arrayOfString;
/*    */       for (byte b = 0; b < (arrayOfString = this.yj).length; b++) {
/*    */         if (arrayOfString[b].equalsIgnoreCase(md0))
/*    */           return b; 
/*    */       } 
/*    */     } 
/*    */     return 0;
/*    */   }
/*    */   
/*    */   public String getName() {
/*    */     return this.wC;
/*    */   }
/*    */   
/*    */   public boolean isMarkupEnabled() {
/*    */     return this.nQ;
/*    */   }
/*    */   
/*    */   public pe clone(String paramString, vc paramvc, dt... paramVarArgs) {
/*    */     return new t90(paramString, this, paramvc, paramVarArgs);
/*    */   }
/*    */   
/*    */   public Me getFont() {
/*    */     return this.Xe;
/*    */   }
/*    */   
/*    */   public OZ getFreeTypeFontData() {
/*    */     return this.pK0;
/*    */   }
/*    */   
/*    */   public JX getBatch() {
/*    */     return this.u00.yT;
/*    */   }
/*    */   
/*    */   public void destroy() {
/*    */     if (this.lg0)
/*    */       return; 
/*    */     this.lg0 = true;
/*    */     if (this.qO)
/*    */       return; 
/*    */     this.pK0.dispose();
/*    */     this.Xe.dispose();
/*    */     RD0 rD0 = this.jb0;
/*    */     int i = this.JC0;
/*    */     hK0 hK01;
/*    */     (hK01 = this.cD).getClass();
/*    */     String str = rD0.KU.ordinal() + rD0.rw() + "-" + i;
/*    */     PL0 pL0;
/*    */     if ((pL0 = (PL0)this.cD.s30.pd0(str)) != null && --pL0.Or < 1) {
/*    */       pL0.GL.dispose();
/*    */       hK01.s30.HH(str);
/*    */     } 
/*    */     byte b = 0;
/*    */     while (b < this.xJ0.length) {
/*    */       this.p3[b].dispose();
/*    */       this.x4[b].dispose();
/*    */       RD0 rD01 = this.xJ0[b];
/*    */       boolean bool = false;
/*    */       hK0 hK02;
/*    */       (hK02 = this.cD).getClass();
/*    */       String str1 = rD01.KU.ordinal() + rD01.rw() + "-" + bool;
/*    */       PL0 pL01;
/*    */       if ((pL01 = (PL0)this.cD.s30.pd0(str1)) != null && --pL01.Or < 1) {
/*    */         pL01.GL.dispose();
/*    */         hK02.s30.HH(str1);
/*    */       } 
/*    */       b++;
/*    */     } 
/*    */   }
/*    */   
/*    */   public boolean isProportional() {
/*    */     return false;
/*    */   }
/*    */   
/*    */   public int getSpaceWidth() {
/*    */     return (int)this.Xe.XO.kw;
/*    */   }
/*    */   
/*    */   public int getLineHeight() {
/*    */     return (int)this.Xe.XO.p30;
/*    */   }
/*    */   
/*    */   public float getLineHeightF() {
/*    */     return this.Xe.XO.p30;
/*    */   }
/*    */   
/*    */   public int getBaseLine() {
/*    */     return (int)this.Xe.XO.nO;
/*    */   }
/*    */   
/*    */   public int getEM() {
/*    */     return (int)this.Xe.XO.p30;
/*    */   }
/*    */   
/*    */   public int getEX() {
/*    */     return (int)this.Xe.XO.j90;
/*    */   }
/*    */   
/*    */   public int drawText(fB0 paramfB0, int paramInt1, int paramInt2, CharSequence paramCharSequence) {
/*    */     int i = paramCharSequence.length();
/*    */     return drawText(paramfB0, paramInt1, paramInt2, paramCharSequence, 0, i);
/*    */   }
/*    */   
/*    */   public int drawText(fB0 paramfB0, int paramInt1, int paramInt2, CharSequence paramCharSequence, int paramInt3, int paramInt4) {
/*    */     Nq nq;
/*    */     paramInt1 += (nq = this.FL0[this.Hq.iX(paramfB0)]).we0;
/*    */     Color color = this.u00.we(nq.ck0);
/*    */     this.Xe.Ca.Yb.set(this);
/*    */     Me me = this.Xe;
/*    */     JX jX = this.u00.yT;
/*    */     float f1 = paramInt1, f2 = (paramInt2 + nq.Ge);
/*    */     this.Ca.RV();
/*    */     this.Ca.d9(jX);
/*    */     return (int)(this.Ca.QL(paramCharSequence, f1, f2, paramInt3, paramInt4, 0.0F, 8, false, null)).e20;
/*    */   }
/*    */   
/*    */   public int drawMultiLineText(fB0 paramfB0, int paramInt1, int paramInt2, CharSequence paramCharSequence, int paramInt3, Mo paramMo) {
/*    */     Nq nq;
/*    */     paramInt1 += (nq = this.FL0[this.Hq.iX(paramfB0)]).we0;
/*    */     paramInt2 += nq.Ge;
/*    */     byte b = 8;
/*    */     int j;
/*    */     if ((j = paramMo.ordinal()) != 1) {
/*    */       if (j == 2)
/*    */         b = 16; 
/*    */     } else {
/*    */       b = 1;
/*    */     } 
/*    */     Color color = this.u00.we(nq.ck0);
/*    */     this.Xe.Ca.Yb.set(color);
/*    */     JX jX = this.u00.yT;
/*    */     float f1 = paramInt1, f2 = paramInt2, f3 = paramInt3;
/*    */     Me me;
/*    */     (me = this.Xe).Ca.RV();
/*    */     gE.getClass();
/*    */     int i = paramCharSequence.length();
/*    */     me.Ca.d9(this);
/*    */     GE gE;
/*    */     return (int)((gE = this.Xe.Ca).QL(paramCharSequence, f1, f2, 0, i, f3, b, true, null)).e20;
/*    */   }
/*    */   
/*    */   public void drawFromCache(GE paramGE, fB0 paramfB0, int paramInt1, int paramInt2) {
/*    */     Nq nq;
/*    */     paramInt1 += (nq = this.FL0[this.Hq.iX(paramfB0)]).we0;
/*    */     paramInt2 += nq.Ge;
/*    */     paramGE.getClass();
/*    */     float f1 = this.u00.we(nq.ck0).toFloatBits();
/*    */     byte b = 0;
/*    */     int i;
/*    */     for (i = paramGE.Xs.length; b < i; ) {
/*    */       float[] arrayOfFloat;
/*    */       byte b1;
/*    */       int j;
/*    */       for (arrayOfFloat = paramGE.Xs[b], b1 = 2, j = paramGE.UQ[b]; b1 < j; ) {
/*    */         arrayOfFloat[b1] = f1;
/*    */         b1 += 5;
/*    */       } 
/*    */       b++;
/*    */     } 
/*    */     f1 = paramInt2;
/*    */     f1 -= paramGE.Ij;
/*    */     float f2;
/*    */     if ((f2 = paramInt1 - paramGE.bX) != 0.0F || f1 != 0.0F) {
/*    */       if (paramGE.Ns) {
/*    */         f2 = Math.round(f2);
/*    */         f1 = Math.round(f1);
/*    */       } 
/*    */       float[][] arrayOfFloat;
/*    */       for (paramGE.bX += f2, paramGE.Ij += f1, b = 0, i = (arrayOfFloat = paramGE.Xs).length; b < i; ) {
/*    */         float[] arrayOfFloat1;
/*    */         byte b1;
/*    */         int j;
/*    */         for (arrayOfFloat1 = arrayOfFloat[b], b1 = 0, j = paramGE.UQ[b]; b1 < j; ) {
/*    */           arrayOfFloat1[b1] = arrayOfFloat1[b1] + f2;
/*    */           int k;
/*    */           arrayOfFloat1[k] = arrayOfFloat1[k = b1 + 1] + f1;
/*    */           b1 += 5;
/*    */         } 
/*    */         b++;
/*    */       } 
/*    */     } 
/*    */     paramGE.d9(this.u00.yT);
/*    */   }
/*    */   
/*    */   public int computeVisibleGlpyhs(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {
/*    */     int i;
/*    */     byte[][] arrayOfByte;
/*    */     int j;
/*    */     for (i = 0, arrayOfByte = null, j = paramInt1; j < paramInt2; ) {
/*    */       char c = paramCharSequence.charAt(j);
/*    */       Jk0 jk0;
/*    */       if ((jk0 = this.Xe.XO.LF(c)) != null) {
/*    */         if (arrayOfByte != null) {
/*    */           byte b;
/*    */           byte[] arrayOfByte1;
/*    */           if ((arrayOfByte = ((Jk0)arrayOfByte).Wx) != null && (arrayOfByte1 = arrayOfByte[c >>> 9]) != null) {
/*    */             b = arrayOfByte1[c & 0x1FF];
/*    */           } else {
/*    */             b = 0;
/*    */           } 
/*    */           i = b + i;
/*    */         } 
/*    */         if (isProportional()) {
/*    */           if ((i += jk0.Ek) > paramInt3)
/*    */             break; 
/*    */           Jk0 jk01 = jk0;
/*    */         } else {
/*    */           if (i + jk0.zq + jk0.eJ > paramInt3)
/*    */             break; 
/*    */           i += jk0.Ek;
/*    */           Jk0 jk01 = jk0;
/*    */         } 
/*    */       } 
/*    */       j++;
/*    */     } 
/*    */     return j - paramInt1;
/*    */   }
/*    */   
/*    */   public int computeTextWidth(CharSequence paramCharSequence) {
/*    */     this.ye.HD(this.Xe, paramCharSequence);
/*    */     return (int)Math.ceil((this.ye.e20 + 0.5F));
/*    */   }
/*    */   
/*    */   public int computeTextWidth(CharSequence paramCharSequence, int paramInt1, int paramInt2) {
/*    */     Color color = this.Xe.Ca.Yb;
/*    */     this.ye.bq0(this.Xe, paramCharSequence, paramInt1, paramInt2, this, 0.0F, 8, false, null);
/*    */     return (int)Math.ceil((this.ye.e20 + 0.5F));
/*    */   }
/*    */   
/*    */   public int computeMultiLineTextWidth(CharSequence paramCharSequence) {
/*    */     Me me = this.Xe;
/*    */     boolean bool = false;
/*    */     int i = paramCharSequence.length();
/*    */     Color color = this.Xe.Ca.Yb;
/*    */     this.ye.bq0(me, paramCharSequence, bool, i, this, 0.0F, 8, false, null);
/*    */     return (int)Math.ceil((this.ye.e20 + 0.5F));
/*    */   }
/*    */   
/*    */   public R3 cacheText(GE paramGE, CharSequence paramCharSequence) {
/*    */     int i = paramCharSequence.length();
/*    */     return cacheText(paramGE, paramCharSequence, 0, i);
/*    */   }
/*    */   
/*    */   public R3 cacheText(GE paramGE, CharSequence paramCharSequence, int paramInt1, int paramInt2) {
/*    */     if (paramGE == null)
/*    */       paramGE = this.Xe.ag0(); 
/*    */     float f1 = 0.0F, f2 = 0.0F, f3 = 0.0F;
/*    */     byte b = 8;
/*    */     boolean bool = false;
/*    */     paramGE.RV();
/*    */     vQ vQ;
/*    */     (paramGE.QL(paramCharSequence, f1, f2, paramInt1, paramInt2, f3, b, bool, null)).Df0 = (paramGE.QL(paramCharSequence, f1, f2, paramInt1, paramInt2, f3, b, bool, null)).Df0 - (vQ = this.Xe.XO).Y5 + this.p30;
/*    */     return paramGE.QL(paramCharSequence, f1, f2, paramInt1, paramInt2, f3, b, bool, null);
/*    */   }
/*    */   
/*    */   public R3 cacheMultiLineText(GE paramGE, CharSequence paramCharSequence, int paramInt, Mo paramMo) {
/*    */     return cacheMultiLineText(paramGE, paramCharSequence, paramInt, paramMo, null);
/*    */   }
/*    */   
/*    */   public R3 cacheMultiLineText(GE paramGE, CharSequence paramCharSequence, int paramInt, Mo paramMo, String paramString) {
/*    */     byte b = 8;
/*    */     int i;
/*    */     if ((i = paramMo.ordinal()) != 1) {
/*    */       if (i == 2)
/*    */         b = 16; 
/*    */     } else {
/*    */       b = 1;
/*    */     } 
/*    */     if (paramGE == null)
/*    */       paramGE = this.Xe.ag0(); 
/*    */     float f1 = 0.0F, f2 = 0.0F;
/*    */     boolean bool1 = false;
/*    */     paramInt = paramCharSequence.length();
/*    */     float f3 = paramInt;
/*    */     boolean bool2 = false;
/*    */     paramGE.RV();
/*    */     return paramGE.QL(paramCharSequence, f1, f2, bool1, paramInt, f3, b, bool2, paramString);
/*    */   }
/*    */   
/*    */   public int drawText(int paramInt1, int paramInt2, HZ paramHZ) {
/*    */     paramHZ.length();
/*    */     return 0;
/*    */   }
/*    */   
/*    */   public int drawText(int paramInt1, int paramInt2, HZ paramHZ, int paramInt3, int paramInt4) {
/*    */     paramHZ.length();
/*    */     return 0;
/*    */   }
/*    */   
/*    */   public void drawMultiLineText(int paramInt1, int paramInt2, HZ paramHZ) {
/*    */     paramHZ.length();
/*    */   }
/*    */   
/*    */   public void drawMultiLineText(int paramInt1, int paramInt2, HZ paramHZ, int paramInt3, int paramInt4) {}
/*    */   
/*    */   public Gc cacheText(Gc paramGc, HZ paramHZ) {
/*    */     paramHZ.length();
/*    */     return null;
/*    */   }
/*    */   
/*    */   public Gc cacheText(Gc paramGc, HZ paramHZ, int paramInt1, int paramInt2) {
/*    */     return null;
/*    */   }
/*    */   
/*    */   public Gc cacheMultiLineText(Gc paramGc, HZ paramHZ) {
/*    */     paramHZ.length();
/*    */     return null;
/*    */   }
/*    */   
/*    */   public Gc cacheMultiLineText(Gc paramGc, HZ paramHZ, int paramInt1, int paramInt2) {
/*    */     return null;
/*    */   }
/*    */   
/*    */   public boolean isCopy() {
/*    */     return this.qO;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/t90.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */