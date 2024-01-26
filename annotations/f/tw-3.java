/*  1 */ package f;public final class tw implements VI, iq0 { public static final float kI0 = Color.WHITE.toFloatBits(); public static final Ll lN = Ll.F10("leftMouseButton"); public static final Ll gL = Ll.F10("middleMouseButton"); public static final Ll nS = Ll.F10("rightMouseButton"); public static final v2 qY = dt.cj(Integer.valueOf(0), "offsetX"); public static final v2 K30 = dt.cj(Integer.valueOf(0), "offsetY"); public static final v2 mo0 = dt.cj(Integer.valueOf(0), "underlineOffset"); public final int Fz; public Color Hs0; public int ck0; public int za; public boolean jg; public final C7 HA0; public xw LV; public int FO; public int Qr; public static void Ps() { w70 w70 = UB0.M60;
/*  2 */     long l = w70.AW.ne0;
/*    */     Ys0 ys0;
/*  4 */     if ((ys0 = Ys0.WD) == Ys0.Xy0) { GLFW.glfwSetInputMode(l, 208897, 212994); } else { GLFW.glfwSetInputMode(l, 208897, 212993); HashMap<?, Long> hashMap; Long long_; if ((long_ = (hashMap = cOm1.tN).get(ys0)) == null) { long l1; if ((l1 = GLFW.glfwCreateStandardCursor(221185)) == 0L) return;  long_ = Long.valueOf(l1); hashMap.put(ys0, long_); }  GLFW.glfwSetCursor(l, long_.longValue()); }  } public li0 nv0; public final uP S5; public final fQ Yf0; public final fQ Mb0; public final fQ cd0; public JX yT; public vw fw; public Ur0 P9; public C7 Ma; public final Xt f20; public final a7 xg; public final cx0 KD0; public final cx0 coM1; public em Rq; public hK0 FF; public tw(JX paramJX, Ur0 paramUr0) { C7 c7; this.Hs0 = new Color(); this.KD0 = new cx0(); this.coM1 = new cx0(); this.FF = new hK0(); this.yT = paramJX; this.Yf0 = new fQ(); this.Mb0 = new fQ(); this.cd0 = new fQ(); this(paramJX); this.HA0 = new C7(); this.Ma = this; this.f20 = new Xt(); this.xg = new a7(); this.P9 = paramUr0; this.Rq = new em(); n8(); UB0.go.glGetIntegerv(3379, intBuffer); IntBuffer intBuffer; this.Fz = (intBuffer = BufferUtils.mt0(16)).get(0); this.S5 = new uP(); this.fw = new vw(); } public final void n8() { this.P9.getClass(); this.ck0 = (int)ur0.w00; this.za = (int)ur0.ow; Ur0 ur0; (ur0 = this.P9).getClass(); } public final void com9() { xw xw1; if ((xw1 = this.LV) != null) { uP uP1; int j; this.Ma = this.HA0; int i = this.FO, k = this.Qr; mX mX; if ((mX = xw1.eI0) != null) { uP1 = xw1.D7.Dk0.S5; j = i - xw1.eX; k -= xw1.pG0; mX.Gt0(this, j, k); } else { Texture texture = nK.pd0; float f3 = (uP1 - j.eX), f4 = (k - j.pG0), f1 = j.sl, f2 = j.N5; nK nK; (nK = j.D7).Dk0.yT.Ap0(this, f3, f4, f1, f2); }  }  } public final void X2(int paramInt1, int paramInt2, int paramInt3, int paramInt4) { Xt xt; int j; tE[] arrayOfTE2; if ((j = (xt = this.f20).QE) == (arrayOfTE2 = xt.k30).length) { arrayOfTE2 = new tE[j * 2]; System.arraycopy(arrayOfTE2, 0, arrayOfTE2, 0, j); xt.k30 = arrayOfTE2; }  tE[] arrayOfTE1; int k; tE tE2; if ((tE2 = (arrayOfTE1 = xt.k30)[k = xt.QE]) == null) { this(); arrayOfTE1[k] = tE2; }  xt.QE = k + 1; tE2
/*  5 */       .Lpt2 = paramInt1; tE2.m6 = paramInt2; tE2.WG = Math.max(0, paramInt3) + paramInt1; tE2.x00 = Math.max(0, paramInt4) + paramInt2; tE tE1;
/*  6 */     (tE1 = xt.k30[paramInt1 - 2]).getClass(); tE2
/*    */       
/*  8 */       .Lpt2 = Math.max(tE2.Lpt2, tE1.Lpt2); tE2.m6 = Math.max(tE2.m6, tE1.m6); tE2.WG = Math.min(tE2.WG, tE1.WG); int i = Math.min(tE2.x00, tE1.x00); if ((paramInt1 = xt.QE) > 1 && (tE2.WG < (paramInt2 = tE2.Lpt2) || i < tE2.m6)) { tE2.WG = paramInt2; tE2.x00 = tE2.m6; }
/*  9 */      Rp0(); } public final void Hq0() { Xt xt; int i; if ((i = (xt = this.f20).QE) != 0) { xt.QE = i - 1; Rp0(); return; }  throw new IllegalStateException("empty"); } public final boolean lPT4() { Xt xt; tE tE; if ((tE = (xt = this.f20).k30[this.QE - 1]).WG <= this.Lpt2 || this.x00 <= this.m6) return true;  return false; } public final void w1() { this.Ma = this.Ma.bg; } public final Color we(pRn parampRn) { C7 c7; this.Hs0.r = (c7 = this.Ma).prn * (parampRn.Ge & 0xFF); this.Hs0.g = this.cu0 * (parampRn.fk & 0xFF); this.Hs0.b = this.ew0 * (parampRn.Ff0 & 0xFF); this.Hs0.a = this.JS * (parampRn.ls & 0xFF); return this.Hs0; } public final void Rp0() { a7 a71 = this.xg; tE tE = xt.k30[i - 1]; a71.getClass(); a71.Lpt2 = tE.Lpt2; a71.m6 = tE.m6; a71.WG = tE.WG; a71.x00 = tE.x00; Xt xt; int i; if (!((i = (xt = this.f20).QE) == 0)) { this.yT.ot(); int j; float f3 = (j = a71.Lpt2); int k = a71.m6; float f1 = k; float f2 = (a71.WG - j); f3 = (a71.x00 - k); this.KD0.jG(f3, f1, f2, f3); cx0 cx01 = this.KD0, cx02 = this.coM1;
/* 10 */       this.P9
/*    */         
/* 12 */         .DR(this.yT.q0, cx01, cx02);
/* 13 */       Matrix4 matrix4 = this.yT.q0;
/* 14 */       this.P9.DR(matrix4, cx01, cx02);
/* 15 */       if (this.jg) { Ye0.Kw0(); this.jg = false; }  if (Ye0.lf0(this.coM1)) this.jg = true;  } else if (this.jg) { this.yT.ot(); Ye0.Kw0(); this.jg = false; }
/*    */      }
/*    */ 
/*    */   
/*    */   public final void dispose() {
/*    */     this.fw.dispose();
/*    */     this.Rq.dispose();
/*    */   }
/*    */   
/*    */   public final void Ls(li0 paramli0) {
/*    */     if (paramli0.pY) {
/*    */       if (paramli0.C70 == this) {
/*    */         this.nv0 = paramli0;
/*    */         try {
/*    */           Hc0 hc0;
/*    */           for (hc0 = this.Yf0.r30(); hc0.hasNext(); ((n90)hc0.next()).getClass());
/*    */           for (hc0 = this.Mb0.r30(); hc0.hasNext(); ((hs)hc0.next()).getClass());
/*    */           return;
/*    */         } finally {
/*    */           this.Yf0.clear();
/*    */           this.Mb0.clear();
/*    */         } 
/*    */       } 
/*    */       throw new IllegalArgumentException("CacheContext object not from this renderer");
/*    */     } 
/*    */     throw new IllegalStateException("CacheContext is invalid");
/*    */   }
/*    */   
/*    */   public final nK z10(URL paramURL, String paramString) {
/*    */     if (this.nv0 == null) {
/*    */       li0 li02;
/*    */       this(this);
/*    */       Ls(li02);
/*    */     } 
/*    */     li0 li01;
/*    */     (li01 = this.nv0).getClass();
/*    */     String str = paramURL.toString();
/*    */     nK nK;
/*    */     if ((nK = (nK)this.Iu0.get(str)) == null)
/*    */       if (this.pY) {
/*    */         RD0 rD0;
/*    */         URL uRL;
/*    */         nK = null;
/*    */         try {
/*    */           rD0 = (RD0)paramURL.getContent();
/*    */         } catch (IOException iOException) {
/*    */           null.printStackTrace();
/*    */         } 
/*    */         if (rD0 == null || !rD0.L0()) {
/*    */           System.out.println("failed to load texture = " + paramURL + " file = " + rD0 + " path = " + paramURL.getPath());
/*    */           uRL = paramURL = null;
/*    */         } else {
/*    */           nK nK1;
/*    */           this(this.C70, (RD0)uRL, paramString);
/*    */           this.Kv0.add(nK1);
/*    */           nK = nK1;
/*    */         } 
/*    */         this.Iu0.put(str, nK);
/*    */       } else {
/*    */         throw new IllegalStateException("CacheContext already destroyed");
/*    */       }  
/*    */     return nK;
/*    */   }
/*    */   
/*    */   public final pE Sn0(int paramInt) {
/*    */     byte b = 64;
/*    */     if (paramInt > 0) {
/*    */       Texture texture;
/*    */       int j;
/*    */       if (paramInt > (j = this.Fz) || b > j) {
/*    */         arrayOfObject[0] = Integer.valueOf(paramInt);
/*    */         arrayOfObject[1] = Integer.valueOf(b);
/*    */         Object[] arrayOfObject;
/*    */         (arrayOfObject = new Object[3])[2] = Integer.valueOf(this.Fz);
/*    */         Logger.getLogger(tw.class.getName()).log(Level.WARNING, "requested size {0} x {1} exceeds maximum texture size {3}", arrayOfObject);
/*    */         return null;
/*    */       } 
/*    */       this(new AB(new ZH(paramInt, b, Uc.xi0), null, false, false));
/*    */       (new Texture()).setFilter(cu0.IE, cu0.IE);
/*    */       int i = texture.getWidth(), k = texture.getHeight();
/*    */       pRn pRn = pRn.WHITE;
/*    */       this(this, texture, paramInt, 64, i, k, pRn);
/*    */       this.cd0.Com3(pE);
/*    */       pE pE;
/*    */       return pE = new pE();
/*    */     } 
/*    */     throw new IllegalArgumentException("width");
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/tw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */