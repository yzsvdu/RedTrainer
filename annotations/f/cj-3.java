/* 1 */ package f;public abstract class cj implements iq0 { public fQ RK0; public boolean H6; public boolean Ar; public boolean vh0; public float az; public float Km; public boolean KQ; public boolean gf; public Runnable KI; public final boolean lx; public qo oD; public Ih0 YL; public fo0 lPt8; public final void KF0() { if (!this.vh0) { Wy(); QA0(); this.vh0 = true; this.KQ = true; this.Km = 0.0F; this.az = 0.0F; S50(); }
/* 2 */      update(); if (!this.hs) { int i = this.sD0, j = this.r9, k = this.hr; ou0.com8(this.we0, i, j, k); Ye0.lf0(this.nz0); }  float f1 = this.Xc0.r, f2 = this.Xc0.g, f3 = this.Xc0.b, f4 = this.Xc0.a; UB0.go.glClearColor(f1, f2, f3, f4); UB0.go.glClear(16640); if (this.lx) this.pK.mx0(this.YL);  tc0(); if (this.lx) this.pK.end();  if (!this.hs)
/* 3 */     { cx0 cx01; fQ fQ1; if ((fQ1 = Ye0.qg).Z8 == 0) { fQ1 = null; } else { cx01 = (cx0)peek(); }  if (this != null)
/* 4 */         Ye0.Kw0();  int i = UB0.M60.fG0(), j = UB0.M60.dL(); ou0.com8(0, 0, i, j); }  } public K70 pK; public G30 Rv0; public final boolean hs; public cx0 nz0; public int we0; public int sD0; public int hr; public int r9; public Color Xc0; public cj(boolean paramBoolean) { fQ fQ1; Color color; this(); this.RK0 = this; this.H6 = true; this(0.0F, 0.0F, 0.0F, 1.0F); this.Xc0 = this; this.hs = paramBoolean; this.lx = true; } public synchronized em() { this(); Ql ql; (new Ql()).xu = 32; return new X3(this); } public boolean pT(oa0 paramoa0) { return false; } public void Wy() { this.Rv0 = new G30(); if (this.lx) { qo qo1; K70 k70; this.YL = new Ih0(); this(); this.lPt8 = fo01; this(qo.iu0, 1.0F, 1.0F, 1.0F, 1.0F); this.oD = new qo(); fo0 fo01; (fo01 = new fo0()).Tz0(qo1); this(em(), new sg()); this.pK = new K70(); this.RK0.Com3(k70); }  } public void nW(int paramInt1, int paramInt2) { // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: getfield hs : Z
/*   */     //   4: ifne -> 161
/*   */     //   7: invokestatic XU : ()Z
/*   */     //   10: ifeq -> 35
/*   */     //   13: aload_0
/*   */     //   14: dup
/*   */     //   15: dup2
/*   */     //   16: iload_1
/*   */     //   17: putfield r9 : I
/*   */     //   20: iload_2
/*   */     //   21: putfield hr : I
/*   */     //   24: iconst_0
/*   */     //   25: putfield we0 : I
/*   */     //   28: iconst_0
/*   */     //   29: putfield sD0 : I
/*   */     //   32: goto -> 79
/*   */     //   35: aload_0
/*   */     //   36: iload_2
/*   */     //   37: aload_0
/*   */     //   38: iload_1
/*   */     //   39: aload_0
/*   */     //   40: dup
/*   */     //   41: getstatic f/h1.Ju0 : I
/*   */     //   44: iconst_0
/*   */     //   45: invokestatic IX : (IZ)V
/*   */     //   48: getstatic f/cf.hf0 : I
/*   */     //   51: dup
/*   */     //   52: istore_1
/*   */     //   53: putfield r9 : I
/*   */     //   56: getstatic f/cf.G30 : I
/*   */     //   59: dup
/*   */     //   60: istore_2
/*   */     //   61: putfield hr : I
/*   */     //   64: iload_1
/*   */     //   65: isub
/*   */     //   66: iconst_2
/*   */     //   67: idiv
/*   */     //   68: putfield we0 : I
/*   */     //   71: iload_2
/*   */     //   72: isub
/*   */     //   73: bipush #50
/*   */     //   75: isub
/*   */     //   76: putfield sD0 : I
/*   */     //   79: aload_0
/*   */     //   80: getfield nz0 : Lf/cx0;
/*   */     //   83: dup
/*   */     //   84: astore_1
/*   */     //   85: ifnonnull -> 128
/*   */     //   88: aload_0
/*   */     //   89: new f/cx0
/*   */     //   92: dup
/*   */     //   93: aload_0
/*   */     //   94: getfield we0 : I
/*   */     //   97: i2f
/*   */     //   98: aload_0
/*   */     //   99: dup
/*   */     //   100: dup
/*   */     //   101: getfield sD0 : I
/*   */     //   104: i2f
/*   */     //   105: fstore_1
/*   */     //   106: getfield r9 : I
/*   */     //   109: i2f
/*   */     //   110: fstore_2
/*   */     //   111: getfield hr : I
/*   */     //   114: i2f
/*   */     //   115: fstore_3
/*   */     //   116: fload_1
/*   */     //   117: fload_2
/*   */     //   118: fload_3
/*   */     //   119: invokespecial <init> : (FFFF)V
/*   */     //   122: putfield nz0 : Lf/cx0;
/*   */     //   125: goto -> 171
/*   */     //   128: aload_1
/*   */     //   129: aload_0
/*   */     //   130: getfield we0 : I
/*   */     //   133: i2f
/*   */     //   134: aload_0
/*   */     //   135: dup
/*   */     //   136: dup
/*   */     //   137: getfield sD0 : I
/*   */     //   140: i2f
/*   */     //   141: fstore_1
/*   */     //   142: getfield r9 : I
/*   */     //   145: i2f
/*   */     //   146: fstore_2
/*   */     //   147: getfield hr : I
/*   */     //   150: i2f
/*   */     //   151: fstore_3
/*   */     //   152: fload_1
/*   */     //   153: fload_2
/*   */     //   154: fload_3
/*   */     //   155: invokevirtual jG : (FFFF)V
/*   */     //   158: goto -> 171
/*   */     //   161: aload_0
/*   */     //   162: dup
/*   */     //   163: iload_1
/*   */     //   164: putfield r9 : I
/*   */     //   167: iload_2
/*   */     //   168: putfield hr : I
/*   */     //   171: aload_0
/*   */     //   172: getfield lx : Z
/*   */     //   175: ifeq -> 205
/*   */     //   178: aload_0
/*   */     //   179: getfield YL : Lf/Ih0;
/*   */     //   182: dup
/*   */     //   183: dup
/*   */     //   184: aload_0
/*   */     //   185: swap
/*   */     //   186: aload_0
/*   */     //   187: getfield r9 : I
/*   */     //   190: i2f
/*   */     //   191: putfield gV : F
/*   */     //   194: getfield hr : I
/*   */     //   197: i2f
/*   */     //   198: putfield oA : F
/*   */     //   201: iconst_1
/*   */     //   202: invokevirtual abstract : (Z)V
/*   */     //   205: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/* 4 */     //   #1	-> 202 } public abstract void tc0(); public abstract boolean ng(); public void QA0() {} public boolean ot() { return this instanceof k3; } public void update() { Runnable runnable; if (this.Ar) return;  if (ng()) { if (!this.Ar) { this.Ar = true; Jy(); }  if (ot()) pA.Dg0.wI0(true);  dispose(); if ((runnable = this.KI) != null) run();  return; }  if (((cj)super)
/* 5 */       .KQ)
/* 6 */     { float f = UB0.M60.Qy;
/* 7 */       ((cj)super).az += f; }  if (((cj)super).az < 0.0F) ((cj)super).az = 0.0F;  if (((cj)super).az >= Float.MAX_VALUE) ((cj)super).az = 0.0F;  ((cj)super).Rv0.cOm4(((cj)super).Km); }
/*   */ 
/*   */   
/*   */   public void S50() {
/*   */     this.az = 0.0F;
/*   */     this.KQ = true;
/*   */     this.Ar = false;
/*   */     if (ot())
/*   */       pA.Dg0.wI0(false); 
/*   */   }
/*   */   
/*   */   public void Jy() {
/*   */     hO hO;
/*   */     if (this.gf && (hO = km.kH0.tc()) != null)
/*   */       EE0(); 
/*   */     km.pm0.NR();
/*   */   }
/*   */   
/*   */   public void dispose() {
/*   */     Hc0 hc0 = this.RK0.r30();
/*   */     while (hc0.hasNext())
/*   */       ((iq0)hc0.next()).dispose(); 
/*   */     this.RK0.clear();
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/cj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */