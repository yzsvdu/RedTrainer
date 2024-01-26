/*  1 */ package f;public final class t70 { public static final eo Y = new eo(); public final lpT7 D2 = new lpT7(); public final lpT7 Gl = new lpT7(); public final lpT7 Gm = new lpT7(); public final lpT7 f5 = new lpT7(); public final Color i70 = new Color(); public Ao Qa; public G3 bg0 = new G3(); public Wk0 Is0 = new Wk0(); public int j10; public int gp; public int coM5; public int tc0; public int f0; public int H50; public int Ui; public int wm0; public int yD; public int tq; public int TP; public int sU; public COM6 ZP; public fQ Hc0 = new fQ(); public final Color z20 = new Color(Color.WHITE); public boolean kK0 = false; public int Yo; public float hd = 0.0F; public float KQ = 1.0F; public float Fr = 0.0F; public float Zk = 1.0F; public boolean k3 = false; public float[] AN; public boolean bw0 = false; public final Matrix4 bB0 = new Matrix4(); public final sX jH = new sX(); public final Eb EO = new Eb(); public int wr = -1; public final eo Hj0 = new eo(); public static final void qc0(float[] paramArrayOffloat, int paramInt, sX paramsX) { float f1 = paramArrayOffloat[paramInt]; int i; float f2 = paramArrayOffloat[i = paramInt + 1]; float f3 = paramArrayOffloat[paramInt += 2]; eo1.TG0(f1, f2, f3).DT(paramsX).WC0(); paramArrayOffloat[paramInt] = eo1.x; paramArrayOffloat[i] = eo1.y; eo eo1; paramArrayOffloat[paramInt] = (eo1 = Y).z; } public final void pU() { COM6 cOM6; if ((cOM6 = this.ZP) != null) { Eb eb = this.EO; cOM6.dK
/*  2 */         .JL(eb.sD);
/*  3 */       eb = this.EO; this.ZP.H40
/*    */         
/*  5 */         .JL(eb.LW)
/*  6 */         .uu(0.5F); this.ZP.XF = this.ZP.H40.Ab0(); this.EO.Te0(); int i = this.coM5; int j; this.ZP.Dr = (j = this.Is0.AK0) - i; this.coM5 = j; this.ZP = null; }  } public final short Bn(lpT7 paramlpT7) { float[] arrayOfFloat; eo eo1; Color color; if (paramlpT7.K) { arrayOfFloat = (float[])paramlpT7.J1; } else { arrayOfFloat = null; }  if (paramlpT7.ZU) { eo1 = paramlpT7.K10; } else { eo1 = null; }  if (paramlpT7.XR) { color = paramlpT7.bE0; } else { color = null; }  if (paramlpT7.nB0) { NC0 nC0 = paramlpT7.Oe0; } else { paramlpT7 = null; }  if (this.gp <= 65535) { float f1, f4; int i1 = this.tc0; float[] arrayOfFloat3; (arrayOfFloat3 = this.AN)[i1] = ((eo)arrayOfFloat).x; int i2; if ((i2 = this.f0) > 1) { int i3 = i1 + 1; arrayOfFloat3[i3] = ((eo)arrayOfFloat).y; }  if (i2 > 2) { int i3 = i1 + 2; arrayOfFloat3[i3] = ((eo)arrayOfFloat).z; }  if (this.H50 >= 0) { eo eo3; if (eo1 == null) { eo1.getClass(); float f8 = ((eo)arrayOfFloat).x, f9 = ((eo)arrayOfFloat).y, f10 = ((eo)arrayOfFloat).z; eo3 = (eo1 = this.Hj0).TG0(f8, f9, f10).WC0(); }  int i3 = this.H50; arrayOfFloat[i3] = eo3.x; int i4 = i3 + 1; arrayOfFloat[i4] = eo3.y; i3 += 2; (arrayOfFloat = this.AN)[i3] = eo3.z; }  int k; if ((k = this.yD) >= 0) { if (color == null) color = Color.WHITE;  arrayOfFloat4[k] = color.r; int i3 = k + 1; arrayOfFloat4[i3] = color.g; i3 = k + 2; float[] arrayOfFloat4; (arrayOfFloat4 = this.AN)[i3] = color.b; if (this.tq > 3) { k += 3; arrayOfFloat4[k] = color.a; }  } else if ((k = this.TP) > 0) { if (color == null) color = Color.WHITE;  this.AN[k] = color.toFloatBits(); }  if (paramlpT7 != null && (k = this.sU) >= 0) { this.AN[k] = ((NC0)paramlpT7).x; int i3 = k + 1; this.AN[i3] = ((NC0)paramlpT7).y; }  float[] arrayOfFloat2 = this.AN; k = this.bg0.NB0; this.bg0.p(0, this.j10, arrayOfFloat2); int j; this.gp = (j = this.gp) + 1; this.wr = j; if (this.bw0) { float f, arrayOfFloat4[] = this.bg0.By0; int i4 = k + this.tc0; Matrix4 matrix4 = this.bB0; int i5; if ((i5 = this.f0) > 2) { f = arrayOfFloat4[i4]; f4 = arrayOfFloat4[i5 = i4 + 1]; float f8 = arrayOfFloat4[i4 += 2]; eo3.TG0(f, f4, f8).eM(matrix4); arrayOfFloat4[i4] = eo3.x; arrayOfFloat4[i5] = eo3.y; eo eo3; arrayOfFloat4[i4] = (eo3 = Y).z; } else if (i5 > 1) { f = f[i4]; eo3.TG0(f, f[++i4], 0.0F).eM(matrix4); f[i4] = eo3.x; eo eo3; f[i4] = (eo3 = Y).y; } else { f[i4] = (Y.TG0(f[i4], 0.0F, 0.0F).eM(matrix4)).x; }  int i3; if ((i3 = this.H50) >= 0) { i3 = k + i3; qc0(this.bg0.By0, i3, this.jH); }  if ((i3 = this.Ui) >= 0) { i3 = k + i3; qc0(this.bg0.By0, i3, this.jH); }  if ((i3 = this.wm0) >= 0) { i3 = k + i3; qc0(this.bg0.By0, i3, this.jH); }  }  float[] arrayOfFloat1; int m; float f3 = (arrayOfFloat1 = this.bg0.By0)[m = k + this.tc0]; int n; if ((n = this.f0) > 1) { f4 = arrayOfFloat1[m + 1]; } else { f4 = 0.0F; }  if (n > 2) { f1 = arrayOfFloat1[m + 2]; } else { f1 = 0.0F; }
/*    */        Eb eb; eo eo2; float f5;
/*  8 */       if ((f5 = (eo2 = (eb = this.EO).pp0).x) > f3) f5 = f3;  float f6; if ((f6 = eo2.y) > f4) f6 = f4;  float f7; if ((f7 = eo2.z) > f1) f7 = f1;  eo2 = eo2.TG0(f5, f6, f7); float f2 = Eb.Po(eb.s60.y, f4); eb.kX(eo2, eb.s60.TG0(Eb.Po(eb.s60.x, f3), f2, Eb.Po(eb.s60.z, f1))); if (this
/*  9 */         .kK0) { int i3; if ((i3 = this.yD) >= 0) { float[] arrayOfFloat4; Color color1; this.bg0.By0[i3] = (arrayOfFloat4 = this.bg0.By0)[i3 = k + i3] * (color1 = this.z20).r; int i4; this.bg0.By0[i4] = this.bg0.By0[i4 = i3 + 1] * color1.g; this.bg0.By0[i4] = this.bg0.By0[i4 = i3 + 2] * color1.b; if (this.tq > 3) arrayOfFloat4[i3] = arrayOfFloat4[i3 += 3] * color1.a;  } else if ((i3 = this.TP) >= 0) { Color.abgr8888ToColor(this.i70, this.bg0.By0[k + i3]); this.bg0.By0[k + this.TP] = this.i70.mul(this.z20).toFloatBits(); }  }  int i; if (this.k3 && (i = this.sU) >= 0) { i = k + i; float f = this.hd; arrayOfFloat4[i] = this.KQ * arrayOfFloat4[i] + f; i++; f = this.Fr; float[] arrayOfFloat4; (arrayOfFloat4 = this.bg0.By0)[i] = this.Zk * arrayOfFloat4[i] + f; }
/* 10 */        return (short)this.wr; }  throw new JU("Too many vertices used"); }
/*    */ 
/*    */   
/*    */   public final void kV(Matrix4 paramMatrix4) {
/*    */     boolean bool;
/*    */     if (paramMatrix4 != null) {
/*    */       bool = true;
/*    */     } else {
/*    */       bool = false;
/*    */     } 
/*    */     this.bw0 = bool;
/*    */     if (bool) {
/*    */       this.bB0.getClass();
/*    */       this.bB0.Qw(paramMatrix4.Z0);
/*    */       this.jH.M30(paramMatrix4).H0().YZ();
/*    */     } else {
/*    */       this.bB0.WU();
/*    */       this.jH.le();
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void bk(int paramInt) {
/*    */     G3 g3 = this.bg0;
/*    */     if ((paramInt = this.j10 * paramInt) >= 0) {
/*    */       if ((paramInt = this.NB0 + paramInt) > this.By0.length)
/*    */         Jd0(Math.max(Math.max(8, paramInt), (int)(this.NB0 * 1.75F))); 
/*    */       return;
/*    */     } 
/*    */     getClass();
/*    */     throw new IllegalArgumentException(XD0.SD0("additionalCapacity must be >= 0: ", paramInt));
/*    */   }
/*    */   
/*    */   public final void PI0(int paramInt) {
/*    */     int i;
/*    */     if ((i = this.Yo) == 0) {
/*    */       paramInt *= 4;
/*    */     } else if (i == 1) {
/*    */       paramInt *= 8;
/*    */     } else {
/*    */       paramInt *= 6;
/*    */     } 
/*    */     this.Is0.JA0(paramInt);
/*    */   }
/*    */   
/*    */   public final void C90(short paramShort1, short paramShort2, short paramShort3) {
/*    */     int i;
/*    */     if ((i = this.Yo) == 4 || i == 0) {
/*    */       this.Is0.JA0(3);
/*    */       this.Is0.GG0(paramShort1);
/*    */       this.Is0.GG0(paramShort2);
/*    */       this.Is0.GG0(paramShort3);
/*    */       return;
/*    */     } 
/*    */     if (i == 1) {
/*    */       this.Is0.JA0(6);
/*    */       this.Is0.GG0(paramShort1);
/*    */       this.Is0.GG0(paramShort2);
/*    */       this.Is0.GG0(paramShort2);
/*    */       this.Is0.GG0(paramShort3);
/*    */       this.Is0.GG0(paramShort3);
/*    */       this.Is0.GG0(paramShort1);
/*    */     } else {
/*    */       throw new JU("Incorrect primitive type");
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void SH(short paramShort1, short paramShort2, short paramShort3, short paramShort4) {
/*    */     int i;
/*    */     if ((i = this.Yo) == 4) {
/*    */       this.Is0.JA0(6);
/*    */       this.Is0.GG0(paramShort1);
/*    */       this.Is0.GG0(paramShort2);
/*    */       this.Is0.GG0(paramShort3);
/*    */       this.Is0.GG0(paramShort3);
/*    */       this.Is0.GG0(paramShort4);
/*    */       this.Is0.GG0(paramShort1);
/*    */     } else if (i == 1) {
/*    */       this.Is0.JA0(8);
/*    */       this.Is0.GG0(paramShort1);
/*    */       this.Is0.GG0(paramShort2);
/*    */       this.Is0.GG0(paramShort2);
/*    */       this.Is0.GG0(paramShort3);
/*    */       this.Is0.GG0(paramShort3);
/*    */       this.Is0.GG0(paramShort4);
/*    */       this.Is0.GG0(paramShort4);
/*    */       this.Is0.GG0(paramShort1);
/*    */     } else {
/*    */       if (i == 0) {
/*    */         this.Is0.JA0(4);
/*    */         this.Is0.GG0(paramShort1);
/*    */         this.Is0.GG0(paramShort2);
/*    */         this.Is0.GG0(paramShort3);
/*    */         this.Is0.GG0(paramShort4);
/*    */         return;
/*    */       } 
/*    */       throw new JU("Incorrect primitive type");
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void ba0(eo parameo1, eo parameo2, eo parameo3, eo parameo4, eo parameo5) {
/*    */     lpT7 lpT71 = this.D2.Ma(parameo1, parameo5).u(0.0F, 1.0F), lpT72 = this.Gl.Ma(parameo2, parameo5).u(1.0F, 1.0F), lpT73 = this.Gm.Ma(parameo3, parameo5).u(1.0F, 0.0F), lpT74 = this.f5.Ma(parameo4, parameo5).u(0.0F, 0.0F);
/*    */     bk(4);
/*    */     short s1 = Bn(this), s2 = Bn(lpT72), s3 = Bn(lpT73), s4 = Bn(lpT74);
/*    */     SH(s1, s2, s3, s4);
/*    */   }
/*    */   
/*    */   public final void We() {
/*    */     this.k3 = false;
/*    */     this.Fr = 0.0F;
/*    */     this.hd = 0.0F;
/*    */     this.Zk = 1.0F;
/*    */     this.KQ = 1.0F;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/t70.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */