/* 1 */ package f;public final class uT extends C0 { public static final eo ng0 = new eo(); public static final eo iz0 = new eo(); public static final eo HO = new eo(); public static final Ut0 OU = new Ut0(); public static final Ut0 FC = new Ut0(); public R30 BA; public float Ks0; public float Kh; public int Dx0; public int ex0; public boolean Eu0; public static uT NI(UA0 paramUA0) { pe0 pe01 = paramUA0.OB0(); float f = paramUA0.Nx0;
/* 2 */     int j = (int)(pe01.H0 / f);
/* 3 */     int i = (int)(pe01.Vn0 / f);
/* 4 */     (new uT(j, i, pe01, true))
/* 5 */       .L1 = paramUA0; return new uT(j, i, pe01, true); } public final eo He0; public final TG0 Qi; public final eo FC0; public boolean ir; public qo lp0; public s5 native; public O80 RC; public pe0 zq; public float IC; public float ys; public UA0 L1; public uT(uT paramuT) { super(t2(paramuT.Dx0, i, paramuT.Eu0)); qo qo1; this.Kh = 1.0F; this.ir = false; this.ys = 0.01F; this.L1 = null; this.Dx0 = paramuT.Dx0; this.ex0 = paramuT.ex0; this.Eu0 = paramuT.Eu0; this.He0 = new eo(); this.Qi = new TG0(); this.FC0 = new eo(1.0F, 1.0F, 1.0F); O80 o80; if ((o80 = paramuT.RC) != null) this.Os0.Tz0(o80);  if (paramuT.Os0.gV(zc.U7)) { this.Os0.Tz0(new zc(1.0F)); this.Os0.Tz0(new LPT9(LPT9.It0, 0.01F)); }  this(qo.A80, Color.WHITE); this.lp0 = new qo(); this.Os0.Tz0(qo1); if (paramuT.native != null) { s5 s51; this(s5.DR, 0); this.native = new s5(); this.Os0.Tz0(s51); }  this.L1 = paramuT.L1; } public static cf0 t2(int paramInt1, int paramInt2, boolean paramBoolean) { Ut0 ut0; paramInt2 = Math.abs(paramInt2); int i = (paramInt1 = Math.abs(paramInt1)) << 16 | paramInt2; if (paramBoolean) { ut0 = OU; } else { ut0 = FC; }  cf0 cf0; if ((cf0 = (cf0)ut0.Z6(i)) == null) { GL0 gL0; T0 t0; float f1 = paramInt1 / 2.0F; this(); float f3 = -f1; float f2; float f4 = -(f2 = paramInt2 / 2.0F); float f5 = 0.0F; float f6 = 0.0F; float f7 = 0.0F; float f8 = 0.0F; float f9 = 1.0F; float f10 = 1.0F; this(new dj[] { qo.SI(Color.WHITE) }); int j = 17; j = (paramBoolean ? 8 : 0) | j; long l = j; cf0 = gL0.YP(f3, f4, f5, f1, f4, f6, f1, f2, f7, f3, f2, f8, f9, f10, t0, l); ut0.A3(i, cf0); }  return cf0; } public final void W5(eo parameo1, eo parameo2) { getClass(); float f4 = parameo2.x, f5 = parameo2.y, f6 = parameo2.z; eo eo1; (eo1 = ng0).TG0(f4, f5, f6).Nz(parameo1).WC0(); eo2.getClass(); f5 = parameo1.x; f6 = parameo1.y; float f7 = parameo1.z; eo eo2; (eo2 = iz0).TG0(f5, f6, f7).Nz(this).WC0(); float f1 = this.x, f2 = eo2.x, f3 = parameo1.x; f5 = this.y; f6 = eo2.y; f7 = parameo1.y; float f8 = this.z, f9 = eo2.z, f10 = parameo1.z; this.Qi.hE0(false, f1, f2, f3, f5, f6, f7, f8, f9, f10);
/* 6 */     this.ir = false; Gz(); }
/*   */ 
/*   */   
/*   */   public uT(int paramInt1, int paramInt2, pe0 parampe0, boolean paramBoolean) {
/*   */     super(t2(paramInt1, paramInt2, true));
/*   */     O80 o80;
/*   */     qo qo1;
/*   */     this.Kh = 1.0F;
/*   */     this.ir = false;
/*   */     this.ys = 0.01F;
/*   */     this.L1 = null;
/*   */     this.Dx0 = paramInt1;
/*   */     this.ex0 = paramInt2;
/*   */     this.Eu0 = true;
/*   */     this.He0 = new eo();
/*   */     this.Qi = new TG0();
/*   */     this.FC0 = new eo(1.0F, 1.0F, 1.0F);
/*   */     this(O80.Jg0, parampe0);
/*   */     this.RC = new O80();
/*   */     this.zq = parampe0;
/*   */     this.Os0.Tz0(o80);
/*   */     this.Os0.Tz0(new zc(1.0F));
/*   */     this.Os0.Tz0(new LPT9(LPT9.It0, 0.1F));
/*   */     this(qo.A80, Color.WHITE);
/*   */     this.lp0 = new qo();
/*   */     this.Os0.Tz0(qo1);
/*   */     if (paramBoolean) {
/*   */       s5 s51;
/*   */       this(s5.DR, 0);
/*   */       this.native = new s5();
/*   */       this.Os0.Tz0(this);
/*   */     } 
/*   */   }
/*   */   
/*   */   public static uT xz(int paramInt1, int paramInt2, pe0 parampe0) {
/*   */     return new uT(paramInt1, paramInt2, parampe0, false);
/*   */   }
/*   */   
/*   */   public static uT AM(pe0 parampe0) {
/*   */     int i = parampe0.H0;
/*   */     return new uT(i, parampe0.Vn0, parampe0, false);
/*   */   }
/*   */   
/*   */   public final void Gz() {
/*   */     if (this.ir)
/*   */       return; 
/*   */     eo eo1 = this.He0;
/*   */     TG0 tG0 = this.Qi;
/*   */     eo eo2 = this.FC0;
/*   */     this.Jb.mT(this, tG0, eo2);
/*   */     this.ir = true;
/*   */   }
/*   */   
/*   */   public final void SG0(float paramFloat) {
/*   */     R30 r30;
/*   */     if ((r30 = this.BA) == null)
/*   */       return; 
/*   */     float f = this.Ks0;
/*   */     this.Ks0 = f = paramFloat * this.Kh + f;
/*   */     pe0 pe01 = (pe0)r30.Hf(f);
/*   */     this.RC.ID(this);
/*   */   }
/*   */   
/*   */   public final void si(eo parameo1, eo parameo2) {
/*   */     eo1.getClass();
/*   */     float f1 = parameo1.x, f2 = parameo1.y, f3 = parameo1.z;
/*   */     eo eo1;
/*   */     (eo1 = HO).TG0(f1, f2, f3).zy0(this.He0).WC0();
/*   */     W5(HO, parameo2);
/*   */   }
/*   */   
/*   */   public final void Bo(Texture paramTexture) {
/*   */     this.RC.cv0.ze = (zp)paramTexture;
/*   */   }
/*   */   
/*   */   public final void Sn0(boolean paramBoolean) {
/*   */     fp(paramBoolean, false);
/*   */   }
/*   */   
/*   */   public final void fp(boolean paramBoolean1, boolean paramBoolean2) {
/*   */     // Byte code:
/*   */     //   0: iload_1
/*   */     //   1: aload_0
/*   */     //   2: getfield RC : Lf/O80;
/*   */     //   5: astore_3
/*   */     //   6: ifeq -> 21
/*   */     //   9: aload_0
/*   */     //   10: getfield zq : Lf/pe0;
/*   */     //   13: getfield zV : F
/*   */     //   16: fstore #4
/*   */     //   18: goto -> 30
/*   */     //   21: aload_0
/*   */     //   22: getfield zq : Lf/pe0;
/*   */     //   25: getfield mP : F
/*   */     //   28: fstore #4
/*   */     //   30: iload_2
/*   */     //   31: aload_3
/*   */     //   32: fload #4
/*   */     //   34: putfield QG : F
/*   */     //   37: ifeq -> 52
/*   */     //   40: aload_0
/*   */     //   41: getfield zq : Lf/pe0;
/*   */     //   44: getfield bh0 : F
/*   */     //   47: fstore #5
/*   */     //   49: goto -> 61
/*   */     //   52: aload_0
/*   */     //   53: getfield zq : Lf/pe0;
/*   */     //   56: getfield WT : F
/*   */     //   59: fstore #5
/*   */     //   61: iload_1
/*   */     //   62: aload_3
/*   */     //   63: fload #5
/*   */     //   65: putfield Ry : F
/*   */     //   68: ifeq -> 82
/*   */     //   71: aload_0
/*   */     //   72: getfield zq : Lf/pe0;
/*   */     //   75: getfield mP : F
/*   */     //   78: fstore_1
/*   */     //   79: goto -> 90
/*   */     //   82: aload_0
/*   */     //   83: getfield zq : Lf/pe0;
/*   */     //   86: getfield zV : F
/*   */     //   89: fstore_1
/*   */     //   90: iload_2
/*   */     //   91: aload_3
/*   */     //   92: fload_1
/*   */     //   93: fload #4
/*   */     //   95: fsub
/*   */     //   96: putfield za : F
/*   */     //   99: ifeq -> 113
/*   */     //   102: aload_0
/*   */     //   103: getfield zq : Lf/pe0;
/*   */     //   106: getfield WT : F
/*   */     //   109: fstore_0
/*   */     //   110: goto -> 121
/*   */     //   113: aload_0
/*   */     //   114: getfield zq : Lf/pe0;
/*   */     //   117: getfield bh0 : F
/*   */     //   120: fstore_0
/*   */     //   121: aload_3
/*   */     //   122: fload_0
/*   */     //   123: fload #5
/*   */     //   125: fsub
/*   */     //   126: putfield yh0 : F
/*   */     //   129: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 13
/*   */     //   #2	-> 22
/*   */     //   #3	-> 25
/*   */     //   #4	-> 34
/*   */     //   #5	-> 44
/*   */     //   #6	-> 53
/*   */     //   #7	-> 56
/*   */     //   #8	-> 65
/*   */     //   #9	-> 75
/*   */     //   #10	-> 83
/*   */     //   #11	-> 86
/*   */     //   #12	-> 96
/*   */     //   #13	-> 106
/*   */     //   #14	-> 114
/*   */     //   #15	-> 117
/*   */     //   #16	-> 126
/*   */   }
/*   */   
/*   */   public final void sA0(pe0 parampe0, boolean paramBoolean) {
/*   */     this.RC.ID(parampe0);
/*   */     if (paramBoolean) {
/*   */       float f1 = parampe0.mP;
/*   */       float f2 = parampe0.zV;
/*   */       float f3 = parampe0.WT;
/*   */       float f4 = parampe0.bh0;
/*   */       o80.QG = f2;
/*   */       o80.Ry = f3;
/*   */       o80.za = f1 - f2;
/*   */       O80 o80;
/*   */       (o80 = this.RC).yh0 = f4 - f3;
/*   */     } 
/*   */   }
/*   */   
/*   */   public final void Bp(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
/*   */     this.lp0.vF0.set(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
/*   */   }
/*   */   
/*   */   public final void DD(Color paramColor) {
/*   */     this.lp0.vF0.set(paramColor);
/*   */   }
/*   */   
/*   */   public final Color G10() {
/*   */     qo qo1;
/*   */     return ((qo1 = this.lp0) != null) ? this.vF0 : null;
/*   */   }
/*   */   
/*   */   public final void hA0(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
/*   */     s5 s51;
/*   */     if ((s51 = this.native) != null)
/*   */       this.lx.set(paramFloat1, paramFloat2, paramFloat3, paramFloat4); 
/*   */   }
/*   */   
/*   */   public final void WI0(eo parameo) {
/*   */     getClass();
/*   */     float f1 = parameo.x, f2 = parameo.y, f3 = parameo.z;
/*   */     eo eo1;
/*   */     (eo1 = this.He0).TG0(f1, f2, f3);
/*   */     this.ir = false;
/*   */   }
/*   */   
/*   */   public final void WQ(float paramFloat1, float paramFloat2, float paramFloat3) {
/*   */     this.He0.TG0(paramFloat1, paramFloat2, paramFloat3);
/*   */     this.ir = false;
/*   */   }
/*   */   
/*   */   public final eo UK0() {
/*   */     return this.He0;
/*   */   }
/*   */   
/*   */   public final void Kk0(float paramFloat1, float paramFloat2) {
/*   */     eo eo1;
/*   */     if ((eo1 = this.FC0).x == paramFloat1 && eo1.y == paramFloat2)
/*   */       return; 
/*   */     eo1.x = paramFloat1;
/*   */     eo1.y = paramFloat2;
/*   */     this.ir = false;
/*   */   }
/*   */   
/*   */   public final void zO(float paramFloat) {
/*   */     eo eo1;
/*   */     if ((eo1 = this.FC0).x == paramFloat && eo1.y == paramFloat)
/*   */       return; 
/*   */     eo1.TG0(paramFloat, paramFloat, paramFloat);
/*   */     this.ir = false;
/*   */   }
/*   */   
/*   */   public final void lM(boolean paramBoolean) {
/*   */     if (this.Eu0 == paramBoolean)
/*   */       return; 
/*   */     this.Eu0 = paramBoolean;
/*   */     this.PB0 = ((R70)((zP)(t2(this.Dx0, this.ex0, paramBoolean)).O0.first()).zx0.first()).xn;
/*   */   }
/*   */   
/*   */   public final Object clone() {
/*   */     return new uT(this);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/uT.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */