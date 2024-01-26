/*  1 */ package f;public final class LPT6 extends Ip { public static final String[] ro = new String[] { "Red", "Green", "Blue", "Alpha" }; public GD ov0; public float[] aB; public Ld0[] G1; public boolean hh = true; public boolean cd = false; public boolean wi = true; public boolean Lc0 = false; public boolean OB = true; public boolean k0 = true; public boolean Dx0 = true; public Runnable[] mC; public int eT; public Ti0[] XE0; public cz0 V30; public I Iz; public boolean dj; public LPT6(O7 paramO7) { pRn pRn; int i = (pRn = pRn.WHITE).LpT2(); GD gD;
/*  2 */     if ((gD = this.ov0) != paramO7) { this.ov0 = paramO7; this
/*    */         
/*  4 */         .aB = new float[paramO7.nG.length]; if ((gD != null)) { Yy0(i); } else { this
/*  5 */           .eT = pRn.LpT2(); byte b = 0; while (b < this.ov0
/*  6 */           .nG.length)
/*    */         
/*  8 */         { float f, arrayOfFloat[] = this.aB; if (b == 0) { f = 0.0F; } else { f = 50.0F; }  arrayOfFloat[b] = f; b++; }  hV(); dA0(true); }  this
/*  9 */         .dj = true; MJ0(); }  } public final void Gf0() { this.dj = false; WN(null); gx(); this(); YA0 yA0; Ti0 ti0; g0 g0; SA sA = (new YA0()).Dv0; this(16, this); (this.XE0 = new Ti0[4])[0] = ti0; this(8, this); (new Ti0[4])[1] = ti0; this(0, this); (new Ti0[4])[2] = ti0; this(24, this); (new Ti0[4])[3] = ti0; int i = GR(); U90 u903 = (new cr0(this)).Em0(); this(this); int j; U90[] arrayOfU90; byte b2; for (arrayOfU90 = new U90[j = i + 4], b2 = 0; b2 < j; ) { g0 g01; this(this); arrayOfU90[b2] = g01; b2++; }
/* 10 */      sA.RT.Xj0(1.0F).J80(5.0F); sA.JP(0).fu(); for (this.G1 = new Ld0[i], j = 0; j < 3; ) { Ld0 ld0; this(j, this); this.G1[j] = ld0; String str = this.ov0.nG[j];
/* 11 */       (new dQ()).E1(str);
/* 12 */       sA.S7(new dQ()).fu(); sA.S7(new Lj0(this.G1[j])).Kw();
/* 13 */       if (this.k0)
/* 14 */       { rh rh; this(this.XE0[j]); (sA.IR(ro[j]).fu())
/* 15 */           .Ox.S7(rh)
/* 16 */           .Kw(); }  sA.wP(); j++; }  if (this
/* 17 */       .Dx0)
/* 18 */     { rh rh; this(this.XE0[3]);
/* 19 */       ((sA.IR(ro[3])).Ox.S7(rh))
/*    */         
/* 21 */         .ss = Integer.valueOf(3);
/* 22 */       ((sA.IR(ro[3])).Ox.S7(rh).Kw())
/* 23 */         .Ox.wP(); }  byte b1 = 0; if (this
/* 24 */       .hh) while ((j = b1 + 1) < i)
/* 25 */       { wy0 wy0; this(this, b1, j); (new wy0())
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */           
/* 32 */           .z4 = this.ov0.nG[b1] + " / " + this.ov0.nG[j]; (new wy0()).zn();
/* 33 */         u903.Ya(new wy0()); g0.Ya(wy0); b1 += 2; }   while (b1 < i) { this(b1, this); vH0 vH0; (vH0 = new vH0())
/*    */ 
/*    */         
/* 36 */         .z4 = this.ov0.nG[b1]; (new vH0()).zn();
/* 37 */       u903.Ya(new vH0()); g0.Ya(vH0); b1++; }  if (this
/* 38 */       .Lc0 && this
/* 39 */       .V30 == null)
/* 40 */     { jh0 jh0; (this.V30 = new cz0()).Xu("hexColorEditField"); this.V30
/* 41 */         .rE = 8;
/* 42 */       this(this);
/*    */       
/* 44 */       this.V30.kc = (a70[])hm.LpT6((Object[])this.V30.kc, jh0, a70.class); }  if (this
/* 45 */       .cd) { cr0 cr0; if (this
/* 46 */         .Iz == null)
/* 47 */       { pRn pRn; this(this.eT);
/*    */         
/* 49 */         this.Iz = new I(new Ja0(this), pRn); }  this(); jG0.Xu("colorarea"); JG0 jG0; (jG0 = new JG0())
/* 50 */         .db0 = this.Iz;
/* 51 */       this(); fp.Xu("preview"); Fp fp; (fp = new Fp())
/* 52 */         .si(jG0, fp.Ub());
/* 53 */       super(); jG0.Xu("previewLabel"); (jG0 = new dQ()).VH(fp);
/* 54 */       this(this);
/* 55 */       this(this); g0 g01;
/* 56 */       u903.ee0((g01 = new g0()).Ya(jG0).Ya(fp)); g0.ee0(cr0.Em0().Ya(jG0).Ya(fp));
/* 57 */       if (this.Lc0) { g01
/* 58 */           .Ya(this.V30); cr0.Em0().Ya(this.V30); }
/*    */        }
/* 60 */      U90 u902 = (new g0(this)).ee0(u903.Em0()).Ya(yA0);
/*    */     
/* 62 */     U90 u901 = (new cr0(this)).ee0(g0).Ya(yA0);
/* 63 */     if (this.Lc0) { if (this
/* 64 */         .V30 == null) {
/* 65 */         jh0 jh0; (this.V30 = new cz0()).Xu("hexColorEditField"); this.V30
/* 66 */           .rE = 8;
/* 67 */         this(this);
/*    */         
/* 69 */         this.V30.kc = (a70[])hm.LpT6((Object[])this.V30.kc, jh0, a70.class);
/* 70 */       }  if (!this.cd) { u902
/* 71 */           .Ya(this.V30); u901.Ya(this.V30); }  Tq(); }  rK0(u902); WN(u901.Em0()); }
/*    */ 
/*    */   
/*    */   public final void dA0(boolean paramBoolean) {
/*    */     if (paramBoolean)
/*    */       this.eT = this.eT & 0xFF000000 | this.ov0.gl(this.aB); 
/*    */     hm.Fz0(this.mC);
/*    */     Ti0[] arrayOfTi0;
/*    */     if ((arrayOfTi0 = this.XE0) != null) {
/*    */       int j;
/*    */       byte b;
/*    */       for (j = arrayOfTi0.length, b = 0; b < j; ) {
/*    */         hm.Fz0((arrayOfTi0[b]).kG0);
/*    */         b++;
/*    */       } 
/*    */     } 
/*    */     I i;
/*    */     if ((i = this.Iz) != null)
/*    */       i.Ix(new pRn(this.eT)); 
/*    */     Tq();
/*    */   }
/*    */   
/*    */   public final void d40() {
/*    */     if (this.dj)
/*    */       Gf0(); 
/*    */     super.d40();
/*    */   }
/*    */   
/*    */   public final int tJ0() {
/*    */     if (this.dj)
/*    */       Gf0(); 
/*    */     return super.tJ0();
/*    */   }
/*    */   
/*    */   public final void Tq() {
/*    */     cz0 cz01;
/*    */     if ((cz01 = this.V30) != null) {
/*    */       Object[] arrayOfObject;
/*    */       (arrayOfObject = new Object[1])[0] = Integer.valueOf(this.eT);
/*    */       cz01.Be0(String.format("%08X", arrayOfObject), false);
/*    */     } 
/*    */   }
/*    */   
/*    */   public final int HY() {
/*    */     if (this.dj)
/*    */       Gf0(); 
/*    */     return super.HY();
/*    */   }
/*    */   
/*    */   public final int R80() {
/*    */     if (this.dj)
/*    */       Gf0(); 
/*    */     return super.R80();
/*    */   }
/*    */   
/*    */   public final int AW() {
/*    */     if (this.dj)
/*    */       Gf0(); 
/*    */     return super.AW();
/*    */   }
/*    */   
/*    */   public final int GR() {
/*    */     return this.ov0.nG.length;
/*    */   }
/*    */   
/*    */   public final void Yy0(int paramInt) {
/*    */     float f7;
/*    */     this.eT = paramInt;
/*    */     GD gD = this.ov0;
/*    */     ((O7)gD).getClass();
/*    */     float f2 = (i >> 8 & 0xFF) / 255.0F, f3 = (i & 0xFF) / 255.0F;
/*    */     float f1;
/*    */     int i;
/*    */     float f4, f5, f6 = (f4 = Math.max(Math.max(f1 = ((i = paramInt & 0xFFFFFF) >> 16 & 0xFF) / 255.0F, f2), f3)) + (f5 = Math.min(Math.min(f1, f2), f3));
/*    */     int j;
/*    */     if ((j = (f5 = Math.max(Math.max(f1 = ((i = paramInt & 0xFFFFFF) >> 16 & 0xFF) / 255.0F, f2), f3) - f5) cmp 0.0F) > 0) {
/*    */       if (f6 > 1.0F) {
/*    */         f7 = 2.0F - f6;
/*    */       } else {
/*    */         f7 = f6;
/*    */       } 
/*    */       f7 = f5 / f7;
/*    */     } else {
/*    */       f7 = f5;
/*    */     } 
/*    */     float[] arrayOfFloat = new float[3];
/*    */     boolean bool = false;
/*    */     float f8 = 360.0F;
/*    */     if (j > 0) {
/*    */       if (f4 == f1) {
/*    */         if ((f1 = (f2 - f3) / f5) < 0.0F)
/*    */           f1 += 6.0F; 
/*    */       } else if (f4 == f2) {
/*    */         f1 = (f3 - f1) / f5 + 2.0F;
/*    */       } else {
/*    */         f1 = (f1 - f2) / f5 + 4.0F;
/*    */       } 
/*    */       f5 = f1 / 6.0F;
/*    */     } 
/*    */     arrayOfFloat[bool] = f5 * f8;
/*    */     arrayOfFloat[1] = f7 * 100.0F;
/*    */     arrayOfFloat[2] = f6 * 50.0F;
/*    */     this.aB = arrayOfFloat;
/*    */     hV();
/*    */   }
/*    */   
/*    */   public final void hV() {
/*    */     Ld0[] arrayOfLd0;
/*    */     if ((arrayOfLd0 = this.G1) != null) {
/*    */       int i;
/*    */       byte b;
/*    */       for (i = arrayOfLd0.length, b = 0; b < i; ) {
/*    */         hm.Fz0((arrayOfLd0[b]).kG0);
/*    */         b++;
/*    */       } 
/*    */       dA0(false);
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void LM(throws paramthrows) {
/*    */     this.k1 = false;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/LPT6.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */