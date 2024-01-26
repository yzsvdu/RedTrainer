/*  1 */ package f;public final class wL0 extends me { public final void Ic0(float paramFloat) { if (!this.Ak0) {
/*    */       
/*  3 */       for (Hc0 hc0 = km.wI0.iJ0.wN.r30(); hc0.hasNext(); ) { Ah ah; if ((ah = (Ah)hc0.next()).wg0.Ga != this.im0.Xg0()) continue;  Hc0 hc01; for (this.Ak0 = true, hc01 = ah.W7.r30(); hc01.hasNext(); ) { eo eo1; zP zP; lpt1 lpt11; String str; (str = (lpt11 = (lpt1)hc01.next()).Zl0).getClass(); byte b1 = -1; switch ((lpt11 = (lpt1)hc01.next()).Zl0.hashCode()) { case 436820593: if (!str.equals("gym02switch")) break;  b1 = 3; break;case 400997218: if (!str.equals("gym02rope_2")) break;  b1 = 2; break;case 400997217: if (!str.equals("gym02rope_1")) break;  b1 = 1; break;case -1122202076: if (!str.equals("gym02switch_r")) break;  b1 = 0; break; }  switch (b1) { default: continue;case 3: lpt11.mh.on0(eo1 = vm0); if (eo1.x > 2.0F) { if (eo1.z > 4.0F) { this.YV[0] = lpt11; continue; }  this.YV[2] = lpt11; continue; }  this.YV[1] = lpt11; continue;case 2: this.FU = lpt11; continue;case 1: this.TP = lpt11;
/*  4 */               if ((zP = lpt11.kB0("g02rope_1b", true)) != null) { zP
/*  5 */                   .nH.TG0(1.0F, 1.0F, 1.0F); lpt11.o6(); }  continue;case 0: break; }  this.AD0 = lpt11; }  }  this.TP
/*  6 */         .rd(0, false, null);
/*  7 */       this.FU
/*  8 */         .rd(0, false, null);
/*  9 */     }  Zb0[] arrayOfZb0; int i; byte b; for (i = (arrayOfZb0 = this.k00).length, b = 0; b < i; ) { Zb0 zb0; if ((zb0 = arrayOfZb0[b])
/* 10 */         .DT)
/* 11 */       { int j; int k; if ((j = zb0.fd0) != (k = zb0.MH0)) { int m; eo arrayOfEo[], eo2 = (arrayOfEo = zb0.JM)[j]; if (k > j) { j++; } else { j--; }  eo eo1; float f1 = eo2.u50(eo1 = arrayOfEo[j]);
/* 12 */           zb0
/* 13 */             .q50 = f2; float f2; if ((f2 = zb0.q50 + UB0.M60.Qy) >= f1) { zb0.zL0.mh.b8(eo1); zb0.q50 = 0.0F; if (zb0.MH0 > (m = zb0.fd0)) { zb0.fd0 = m + 1; } else { zb0.fd0 = m - 1; }  }
/* 14 */           else { eo3
/* 15 */               .getClass();
/* 16 */             float f3 = eo2.x, f4 = eo2.y, f5 = eo2.z; eo eo3; (eo3 = vm0).TG0(f3, f4, f5)
/* 17 */               .x50(m, zb0.q50 / f1); zb0.zL0.mh.b8(eo3); }  }
/* 18 */         else { j = 1; k = 0; tr.Jv
/* 19 */             .MD0 = 0L; tr.Jv.hn0 = 0; tr.Jv.fm = k; tr.Jv.Am = j;
/*    */           
/* 21 */           tr.Jv.oZ = zm0.u20 + 60L; tr.Jv.Ty0 = 60;
/* 22 */           zb0.DT = false; zb0.zL0.uq(); if (zb0.OL != null) { km.pm0.RO((byte)4, (short)1623); zb0.OL
/* 23 */               .pm
/* 24 */               .getClass();
/* 25 */             eo eo1 = eo.Zero; zb0.OL.pm.KC(null, false, eo1);
/*    */             
/* 27 */             zb0.OL.Ae
/* 28 */               .pm
/* 29 */               .getClass();
/* 30 */             zb0.OL.Ae.pm.KC(null, false, eo1);
/* 31 */             if (zb0.yn0) { zb0.OL
/* 32 */                 .pm
/* 33 */                 .Kk(new nl[] { nl.fC }); } else { zb0.OL
/* 34 */                 .pm
/* 35 */                 .Kk(new nl[] { nl.IL }); }  Runnable runnable; if ((runnable = zb0.Yq0) != null) zb0.OL
/* 36 */                 .pm
/* 37 */                 .nZ(runnable);  zb0.OL = null; zb0.Yq0 = null; }  }  }  b++; }  super
/* 38 */       .Ic0(paramFloat); }
/*    */ 
/*    */   
/*    */   public static final eo vm0 = new eo();
/*    */   public static final eo[][] sV;
/*    */   public static final int[][] kZ;
/*    */   public Zb0[] k00 = new Zb0[4];
/*    */   public boolean Ak0 = false;
/*    */   public lpt1[] YV = new lpt1[3];
/*    */   public lpt1 AD0 = null;
/*    */   public lpt1 TP = null;
/*    */   public lpt1 FU = null;
/*    */   public boolean[] jI0 = new boolean[] { false, false };
/*    */   
/*    */   public wL0(hB0 paramhB0) {
/*    */     super(paramhB0);
/*    */     eI.Lj().getClass();
/*    */     lpt1 lpt11 = eI.Yp0((byte)4, 118, false);
/*    */     int i;
/*    */     Zb0[] arrayOfZb0;
/*    */     for (i = 0; i < (arrayOfZb0 = this.k00).length; i = (byte)(i + 1)) {
/*    */       lpt1 lpt12;
/*    */       Zb0 zb0 = new Zb0();
/*    */       if (i == 0) {
/*    */         lpt12 = lpt11;
/*    */       } else {
/*    */         lpt12 = lpt11.ro0();
/*    */       } 
/*    */       eo[] arrayOfEo = sV[i];
/*    */       this(this, i, lpt12, arrayOfEo);
/*    */       arrayOfZb0[i] = zb0;
/*    */     } 
/*    */     for (byte b = 6; b <= 11; b++) {
/*    */       byte b1;
/*    */       i = b % 3 * 6 + 3;
/*    */       if (b > 8) {
/*    */         b1 = 9;
/*    */       } else {
/*    */         b1 = 17;
/*    */       } 
/*    */       paramhB0.G1(i, b1).wu0(new jG(this, 3, b));
/*    */     } 
/*    */     paramhB0.G1(3, 32).wu0(new jG(this, 0, 0));
/*    */     paramhB0.G1(9, 32).wu0(new jG(this, 1, 1));
/*    */     paramhB0.G1(15, 32).wu0(new jG(this, 2, 2));
/*    */     paramhB0.G1(3, 24).wu0(new jG(this, 2, 3));
/*    */     paramhB0.G1(9, 24).wu0(new jG(this, 0, 4));
/*    */     paramhB0.G1(15, 24).wu0(new jG(this, 1, 5));
/*    */   }
/*    */   
/*    */   public static boolean EF0(int paramInt) {
/*    */     if ((paramInt >= 3 && paramInt <= 5) || paramInt >= 9) {
/*    */       paramInt = 1;
/*    */     } else {
/*    */       paramInt = 0;
/*    */     } 
/*    */     return paramInt;
/*    */   }
/*    */   
/*    */   static {
/*    */     this(0.875F, 0.0F, 7.75F);
/*    */     eo eo1;
/*    */     eo[] arrayOfEo;
/*    */     (arrayOfEo = new eo[8])[0] = eo1;
/*    */     this(0.875F, 0.0F, 7.25F);
/*    */     (new eo[8])[1] = eo1;
/*    */     this(2.375F, 0.0F, 7.25F);
/*    */     (new eo[8])[2] = eo1;
/*    */     this(2.375F, 0.0F, 6.75F);
/*    */     (new eo[8])[3] = eo1;
/*    */     this(3.875F, 0.0F, 7.0F);
/*    */     (new eo[8])[4] = eo1;
/*    */     this(3.875F, 0.0F, 6.25F);
/*    */     (new eo[8])[5] = eo1;
/*    */     this(2.375F, 0.0F, 6.25F);
/*    */     (new eo[8])[6] = eo1;
/*    */     this(2.375F, 0.0F, 6.0F);
/*    */     (new eo[8])[7] = eo1;
/*    */     (new eo[4][])[0] = arrayOfEo;
/*    */     this(2.375F, 0.0F, 7.75F);
/*    */     (arrayOfEo = new eo[8])[0] = eo1;
/*    */     this(2.375F, 0.0F, 7.25F);
/*    */     (new eo[8])[1] = eo1;
/*    */     this(0.875F, 0.0F, 7.25F);
/*    */     (new eo[8])[2] = eo1;
/*    */     this(0.875F, 0.0F, 6.75F);
/*    */     (new eo[8])[3] = eo1;
/*    */     this(2.375F, 0.0F, 6.5F);
/*    */     (new eo[8])[4] = eo1;
/*    */     this(2.375F, 0.0F, 6.25F);
/*    */     (new eo[8])[5] = eo1;
/*    */     this(3.875F, 0.0F, 6.25F);
/*    */     (new eo[8])[6] = eo1;
/*    */     this(3.875F, 0.0F, 6.0F);
/*    */     (new eo[8])[7] = eo1;
/*    */     (new eo[4][])[1] = arrayOfEo;
/*    */     this(3.875F, 0.0F, 7.75F);
/*    */     (arrayOfEo = new eo[6])[0] = eo1;
/*    */     this(3.875F, 0.0F, 7.0F);
/*    */     (new eo[6])[1] = eo1;
/*    */     this(2.375F, 0.0F, 6.75F);
/*    */     (new eo[6])[2] = eo1;
/*    */     this(2.375F, 0.0F, 6.5F);
/*    */     (new eo[6])[3] = eo1;
/*    */     this(0.875F, 0.0F, 6.75F);
/*    */     (new eo[6])[4] = eo1;
/*    */     this(0.875F, 0.0F, 6.0F);
/*    */     (new eo[6])[5] = eo1;
/*    */     (new eo[4][])[2] = arrayOfEo;
/*    */     this(2.375F, 0.0F, 4.0F);
/*    */     (arrayOfEo = new eo[2])[0] = eo1;
/*    */     this(0.875F, 0.0F, 2.25F);
/*    */     (new eo[2])[1] = eo1;
/*    */     sV = new eo[][] { null, null, null, arrayOfEo };
/*    */     int[] arrayOfInt;
/*    */     (arrayOfInt = new int[3])[0] = 9;
/*    */     (new int[3])[1] = 10;
/*    */     (new int[3])[2] = 11;
/*    */     (new int[8][])[0] = arrayOfInt;
/*    */     (arrayOfInt = new int[3])[0] = 21;
/*    */     (new int[3])[1] = 21;
/*    */     (new int[3])[2] = 0;
/*    */     (new int[8][])[1] = arrayOfInt;
/*    */     (arrayOfInt = new int[3])[0] = 0;
/*    */     (new int[3])[1] = 0;
/*    */     (new int[3])[2] = 20;
/*    */     (new int[8][])[2] = arrayOfInt;
/*    */     (arrayOfInt = new int[3])[0] = 1;
/*    */     (new int[3])[1] = 20;
/*    */     (new int[3])[2] = 0;
/*    */     (new int[8][])[3] = arrayOfInt;
/*    */     (arrayOfInt = new int[3])[0] = 0;
/*    */     (new int[3])[1] = 1;
/*    */     (new int[3])[2] = 0;
/*    */     (new int[8][])[4] = arrayOfInt;
/*    */     (arrayOfInt = new int[3])[0] = 0;
/*    */     (new int[3])[1] = 2;
/*    */     (new int[3])[2] = 2;
/*    */     (new int[8][])[5] = arrayOfInt;
/*    */     (arrayOfInt = new int[3])[0] = 0;
/*    */     (new int[3])[1] = 0;
/*    */     (new int[3])[2] = 0;
/*    */     (new int[8][])[6] = arrayOfInt;
/*    */     (arrayOfInt = new int[3])[0] = 6;
/*    */     (new int[3])[1] = 7;
/*    */     (new int[3])[2] = 8;
/*    */     kZ = new int[][] { null, null, null, null, null, null, null, arrayOfInt };
/*    */   }
/*    */   
/*    */   public final void Ad0(short[] paramArrayOfshort) {
/*    */     if (paramArrayOfshort.length < 1)
/*    */       return; 
/*    */     if (paramArrayOfshort[0] == 4701) {
/*    */       boolean bool;
/*    */       byte b = (byte)paramArrayOfshort[1];
/*    */       if (paramArrayOfshort[2] == 1) {
/*    */         bool = true;
/*    */       } else {
/*    */         bool = false;
/*    */       } 
/*    */       this.jI0[b] = bool;
/*    */       if (b == 1) {
/*    */         this.TP.rd(bool, false, null);
/*    */         this.AD0.rd(bool, false, null);
/*    */       } else {
/*    */         this.FU.rd(bool, false, null);
/*    */         lpt1[] arrayOfLpt1;
/*    */         int i;
/*    */         byte b1;
/*    */         for (i = (arrayOfLpt1 = this.YV).length, b1 = 0; b1 < i; ) {
/*    */           this[b1].rd(bool, false, null);
/*    */           b1++;
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/wL0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */