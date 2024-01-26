/*  1 */ package f;public final class nR implements iq0 { public static final int[][][] nn; public tH sD0; public Texture O10; public Texture LPt4; public Texture zj0; public Texture cn0; public pe0[] pn; public pe0[] wt; private void ie0(int paramInt, sh paramsh) { AT aT; if ((aT = this.xb)
/*  2 */       .Nl0
/*  3 */       .bq0()) { if (aT.Nl0.d20()) { if (aT.Nl0.Yg() + 1 > 7) { aT.s3++; } else { aT.s3 = 0; }  if (aT.s3 > 4) { aT.qZ = 8; } else { int n; if ((n = aT.qZ) < 8) aT.qZ = n + 1;  }  int j = aT.Ox, k = 0; v50[] arrayOfV50; int m;
/*    */         byte b1;
/*  5 */         for (m = (arrayOfV50 = aT.Nl0.r50).length, b1 = 0; b1 < m; ) { int n; v50 v50; if ((v50 = arrayOfV50[b1]).F4 && (n = v50.Ua0) > 0) if (!k) { k = n; } else { k *= n; }   b1++; }  aT
/*  6 */           .Ox = k + j; } else { aT.qZ = Math.max(Math.min(aT.Nl0.Yg(), aT.qZ), 1); aT.s3 = 0; }  aT.Nl0 = new wq0(aT.qZ, aT); aT.lPt2 = 0; aT.MR = 0; }
/*  7 */      GM[] arrayOfGM; int i; byte b; for (i = (arrayOfGM = this.Rc0).length, b = 0; b < i; ) { (this[b])
/*  8 */         .bM = false;
/*  9 */       (this[b]).Gd = 0; (this[b]).pS = 0; (this[b]).XR = null; b++; }  }
/* 10 */   public pe0[] z20; public Texture[] Fn0; public pe0[][] PZ; public GM[] Rc0; public YP[] eO; public AT xb; public int Ki0; public short Li; public nR(int paramInt) { ig ig; vJ vJ1; ek0 ek01; vJ vJ2; LD lD; vJ vJ3; ek0 ek02; FM fM1; FM fM2; this.sD0 = new tH(); this.pn = new pe0[4]; this.wt = new pe0[10]; this.z20 = new pe0[10]; this.Fn0 = new Texture[40]; this.PZ = new pe0[4][]; this.Rc0 = new GM[25]; this.eO = new YP[2]; this.xb = new AT(); this.Li = 0; this.Ki0 = paramInt; GM[] arrayOfGM; for (paramInt = 0; paramInt < (arrayOfGM = this.Rc0).length; paramInt++) { GM gM; this(this, paramInt); arrayOfGM[paramInt] = gM; }  YP[] arrayOfYP; for (paramInt = 0; paramInt < (arrayOfYP = this.eO).length; paramInt++) { YP yP; this(this, paramInt); arrayOfYP[paramInt] = yP; }  this(km.mI0.yE.Vz().B8("/a/2/6/4")); this(ig.Em0(0)); this(ig.Em0(1)); this(ig.Em0(10)); this(ig.Em0(2), true); this(ig.Em0(4), true); this(ig.Em0(3), true); this(ig.Em0(6), true); this.O10 = new Texture(zH4); ZH zH4; (zH4 = ek02.H4(vJ1)).dispose(); this.LPt4 = new Texture(zH4); ek0 ek03; (zH4 = (ek03 = new ek0()).H4(vJ2)).dispose(); byte b2; pe0[] arrayOfPe0; for (b2 = 0; b2 < (arrayOfPe0 = this.pn).length; b2++) { pe0 pe01; Texture texture = this.O10; this(texture, b2 * 8 + 8, 8, 8, 8); arrayOfPe0[b2] = pe01; }  for (b2 = 0; b2 < (arrayOfPe0 = this.wt).length; b2++) { pe0 pe01; Texture texture = this.O10; this(texture, b2 * 8 + 8, 0, 8, 8); arrayOfPe0[b2] = pe01; }  for (b2 = 0; b2 < (arrayOfPe0 = this.z20).length; b2++) { pe0 pe01; Texture texture = this.LPt4; this(texture, b2 * 16, 44, 16, 24); arrayOfPe0[b2] = pe01; }  for (b2 = 0; b2 < 4; b2++) { pe0 pe01; pe0 pe02; this(this.O10, 184, 0, 24, 24); (arrayOfPe0 = new pe0[5])[0] = pe01; this(this.O10, 184, 24, 24, 24); (new pe0[5])[1] = pe01; this(this.O10, 208, 0, 24, 24); (new pe0[5])[2] = pe01; char c = 'X'; if (b2 != 1) { if (b2 != 2) { if (b2 == 3) c = 'p';  } else { c = ''; }  } else { c = ' '; }  this(this.O10, c, 24, 24, 24); arrayOfPe0[3] = pe02; this(this.O10, c, 0, 24, 24); arrayOfPe0[4] = pe02; this.PZ[b2] = arrayOfPe0; }  ZH zH2 = fM1.VC0(vJ1, ek02); int j = zH2.WD0(); Uc uc = zH2.TU(); this(j, 200, uc); zH3.fL(zH2, 0, 0); zH2.dispose(); this.zj0 = new Texture(zH3); ZH zH3; (zH3 = new ZH()).dispose(); ZH zH1 = fM2.VC0(vJ2, ek03); int i = zH1.WD0(); uc = zH1.TU(); this(i, 84, uc); zH3.Wq(zH1, 0, 106, 256, 84); zH1.dispose(); this.cn0 = new Texture(zH3); (zH3 = new ZH()).dispose(); this(ig.Em0(11), true); this(ig.Em0(12), true); for (byte b1 = 0; b1 < 40; b1++) { NC0 nC01; NC0 nC02; this(); this(); lD.rb0(b1, new NC0(), new NC0()); this((int)nC01.x, (int)nC01.y, Uc.xi0); lD.Ll(b1, ek01, vJ3, zH, nC02, null); this.Fn0[b1] = new Texture(zH); ZH zH; (zH = new ZH()).dispose(); }  lD.VE0(); this.Li = km.u4.vC().eb((byte)4, (short)1495); } public static void DP(int paramInt, sh paramsh) { paramInt = 2348; km.pm0.bA0(true, (byte)4, paramInt, 0.0F); } public final boolean Je() { GM[] arrayOfGM; int j; byte b; for (j = (arrayOfGM = this.Rc0).length, b = 0; b < j; ) { So so; if (((so = (arrayOfGM[b]).XR) != null && !so.DD())) return true;  b++; }  YP[] arrayOfYP; for (int i = (arrayOfYP = this.eO).length; j < i; ) { int k; YP yP; int m = (yP = this[j]).ov; if ((this[j]).ID == 1) { k = yP.Dr.xb.Ox; } else { k = 0; v50[] arrayOfV50; int n;
/*    */         byte b1;
/* 12 */         for (n = (arrayOfV50 = k.Dr.xb.Nl0.r50).length, b1 = 0; b1 < n; ) { int i1; v50 v50; if ((v50 = arrayOfV50[b1]).F4 && (i1 = v50.Ua0) > 0) if (k == 0) { k = i1; } else { k *= i1; }   b1++; }  }  if ((m != k)) return true;  j++; }  return false; }
/*    */ 
/*    */   
/*    */   public static void OG(int paramInt, sh paramsh) {
/*    */     paramInt = 2348;
/*    */     km.pm0.bA0(true, (byte)4, paramInt, 0.0F);
/*    */   }
/*    */   
/*    */   static {
/*    */     int[] arrayOfInt1;
/*    */     (arrayOfInt1 = new int[4])[0] = 3;
/*    */     (new int[4])[1] = 1;
/*    */     (new int[4])[2] = 6;
/*    */     (new int[4])[3] = 24;
/*    */     int[][] arrayOfInt;
/*    */     (arrayOfInt = new int[5][])[0] = arrayOfInt1;
/*    */     (arrayOfInt1 = new int[4])[0] = 0;
/*    */     (new int[4])[1] = 3;
/*    */     (new int[4])[2] = 6;
/*    */     (new int[4])[3] = 27;
/*    */     (new int[5][])[1] = arrayOfInt1;
/*    */     (arrayOfInt1 = new int[4])[0] = 5;
/*    */     (new int[4])[1] = 0;
/*    */     (new int[4])[2] = 6;
/*    */     (new int[4])[3] = 32;
/*    */     (new int[5][])[2] = arrayOfInt1;
/*    */     (arrayOfInt1 = new int[4])[0] = 2;
/*    */     (new int[4])[1] = 2;
/*    */     (new int[4])[2] = 6;
/*    */     (new int[4])[3] = 36;
/*    */     (new int[5][])[3] = arrayOfInt1;
/*    */     (arrayOfInt1 = new int[4])[0] = 4;
/*    */     (new int[4])[1] = 1;
/*    */     (new int[4])[2] = 6;
/*    */     (new int[4])[3] = 48;
/*    */     (new int[5][])[4] = arrayOfInt1;
/*    */     (new int[8][][])[0] = arrayOfInt;
/*    */     (arrayOfInt1 = new int[4])[0] = 1;
/*    */     (new int[4])[1] = 3;
/*    */     (new int[4])[2] = 7;
/*    */     (new int[4])[3] = 54;
/*    */     (arrayOfInt = new int[5][])[0] = arrayOfInt1;
/*    */     (arrayOfInt1 = new int[4])[0] = 6;
/*    */     (new int[4])[1] = 0;
/*    */     (new int[4])[2] = 7;
/*    */     (new int[4])[3] = 64;
/*    */     (new int[5][])[1] = arrayOfInt1;
/*    */     (arrayOfInt1 = new int[4])[0] = 3;
/*    */     (new int[4])[1] = 2;
/*    */     (new int[4])[2] = 7;
/*    */     (new int[4])[3] = 72;
/*    */     (new int[5][])[2] = arrayOfInt1;
/*    */     (arrayOfInt1 = new int[4])[0] = 0;
/*    */     (new int[4])[1] = 4;
/*    */     (new int[4])[2] = 7;
/*    */     (new int[4])[3] = 81;
/*    */     (new int[5][])[3] = arrayOfInt1;
/*    */     (arrayOfInt1 = new int[4])[0] = 5;
/*    */     (new int[4])[1] = 1;
/*    */     (new int[4])[2] = 7;
/*    */     (new int[4])[3] = 96;
/*    */     (new int[5][])[4] = arrayOfInt1;
/*    */     (new int[8][][])[1] = arrayOfInt;
/*    */     (arrayOfInt1 = new int[4])[0] = 2;
/*    */     (new int[4])[1] = 3;
/*    */     (new int[4])[2] = 8;
/*    */     (new int[4])[3] = 108;
/*    */     (arrayOfInt = new int[5][])[0] = arrayOfInt1;
/*    */     (arrayOfInt1 = new int[4])[0] = 7;
/*    */     (new int[4])[1] = 0;
/*    */     (new int[4])[2] = 8;
/*    */     (new int[4])[3] = 128;
/*    */     (new int[5][])[1] = arrayOfInt1;
/*    */     (arrayOfInt1 = new int[4])[0] = 4;
/*    */     (new int[4])[1] = 2;
/*    */     (new int[4])[2] = 8;
/*    */     (new int[4])[3] = 144;
/*    */     (new int[5][])[2] = arrayOfInt1;
/*    */     (arrayOfInt1 = new int[4])[0] = 1;
/*    */     (new int[4])[1] = 4;
/*    */     (new int[4])[2] = 8;
/*    */     (new int[4])[3] = 162;
/*    */     (new int[5][])[3] = arrayOfInt1;
/*    */     (arrayOfInt1 = new int[4])[0] = 6;
/*    */     (new int[4])[1] = 1;
/*    */     (new int[4])[2] = 8;
/*    */     (new int[4])[3] = 192;
/*    */     (new int[5][])[4] = arrayOfInt1;
/*    */     (new int[8][][])[2] = arrayOfInt;
/*    */     (arrayOfInt1 = new int[4])[0] = 3;
/*    */     (new int[4])[1] = 3;
/*    */     (new int[4])[2] = 8;
/*    */     (new int[4])[3] = 216;
/*    */     (arrayOfInt = new int[5][])[0] = arrayOfInt1;
/*    */     (arrayOfInt1 = new int[4])[0] = 0;
/*    */     (new int[4])[1] = 5;
/*    */     (new int[4])[2] = 8;
/*    */     (new int[4])[3] = 243;
/*    */     (new int[5][])[1] = arrayOfInt1;
/*    */     (arrayOfInt1 = new int[4])[0] = 8;
/*    */     (new int[4])[1] = 0;
/*    */     (new int[4])[2] = 10;
/*    */     (new int[4])[3] = 256;
/*    */     (new int[5][])[2] = arrayOfInt1;
/*    */     (arrayOfInt1 = new int[4])[0] = 5;
/*    */     (new int[4])[1] = 2;
/*    */     (new int[4])[2] = 10;
/*    */     (new int[4])[3] = 288;
/*    */     (new int[5][])[3] = arrayOfInt1;
/*    */     (arrayOfInt1 = new int[4])[0] = 2;
/*    */     (new int[4])[1] = 4;
/*    */     (new int[4])[2] = 10;
/*    */     (new int[4])[3] = 324;
/*    */     (new int[5][])[4] = arrayOfInt1;
/*    */     (new int[8][][])[3] = arrayOfInt;
/*    */     (arrayOfInt1 = new int[4])[0] = 7;
/*    */     (new int[4])[1] = 1;
/*    */     (new int[4])[2] = 10;
/*    */     (new int[4])[3] = 384;
/*    */     (arrayOfInt = new int[5][])[0] = arrayOfInt1;
/*    */     (arrayOfInt1 = new int[4])[0] = 4;
/*    */     (new int[4])[1] = 3;
/*    */     (new int[4])[2] = 10;
/*    */     (new int[4])[3] = 432;
/*    */     (new int[5][])[1] = arrayOfInt1;
/*    */     (arrayOfInt1 = new int[4])[0] = 1;
/*    */     (new int[4])[1] = 5;
/*    */     (new int[4])[2] = 10;
/*    */     (new int[4])[3] = 486;
/*    */     (new int[5][])[2] = arrayOfInt1;
/*    */     (arrayOfInt1 = new int[4])[0] = 9;
/*    */     (new int[4])[1] = 0;
/*    */     (new int[4])[2] = 10;
/*    */     (new int[4])[3] = 512;
/*    */     (new int[5][])[3] = arrayOfInt1;
/*    */     (arrayOfInt1 = new int[4])[0] = 6;
/*    */     (new int[4])[1] = 2;
/*    */     (new int[4])[2] = 10;
/*    */     (new int[4])[3] = 576;
/*    */     (new int[5][])[4] = arrayOfInt1;
/*    */     (new int[8][][])[4] = arrayOfInt;
/*    */     (arrayOfInt1 = new int[4])[0] = 3;
/*    */     (new int[4])[1] = 4;
/*    */     (new int[4])[2] = 10;
/*    */     (new int[4])[3] = 648;
/*    */     (arrayOfInt = new int[5][])[0] = arrayOfInt1;
/*    */     (arrayOfInt1 = new int[4])[0] = 0;
/*    */     (new int[4])[1] = 6;
/*    */     (new int[4])[2] = 10;
/*    */     (new int[4])[3] = 729;
/*    */     (new int[5][])[1] = arrayOfInt1;
/*    */     (arrayOfInt1 = new int[4])[0] = 8;
/*    */     (new int[4])[1] = 1;
/*    */     (new int[4])[2] = 10;
/*    */     (new int[4])[3] = 768;
/*    */     (new int[5][])[2] = arrayOfInt1;
/*    */     (arrayOfInt1 = new int[4])[0] = 5;
/*    */     (new int[4])[1] = 3;
/*    */     (new int[4])[2] = 10;
/*    */     (new int[4])[3] = 864;
/*    */     (new int[5][])[3] = arrayOfInt1;
/*    */     (arrayOfInt1 = new int[4])[0] = 2;
/*    */     (new int[4])[1] = 5;
/*    */     (new int[4])[2] = 10;
/*    */     (new int[4])[3] = 972;
/*    */     (new int[5][])[4] = arrayOfInt1;
/*    */     (new int[8][][])[5] = arrayOfInt;
/*    */     (arrayOfInt1 = new int[4])[0] = 7;
/*    */     (new int[4])[1] = 2;
/*    */     (new int[4])[2] = 10;
/*    */     (new int[4])[3] = 1152;
/*    */     (arrayOfInt = new int[5][])[0] = arrayOfInt1;
/*    */     (arrayOfInt1 = new int[4])[0] = 4;
/*    */     (new int[4])[1] = 4;
/*    */     (new int[4])[2] = 10;
/*    */     (new int[4])[3] = 1296;
/*    */     (new int[5][])[1] = arrayOfInt1;
/*    */     (arrayOfInt1 = new int[4])[0] = 1;
/*    */     (new int[4])[1] = 6;
/*    */     (new int[4])[2] = 13;
/*    */     (new int[4])[3] = 1458;
/*    */     (new int[5][])[2] = arrayOfInt1;
/*    */     (arrayOfInt1 = new int[4])[0] = 9;
/*    */     (new int[4])[1] = 1;
/*    */     (new int[4])[2] = 13;
/*    */     (new int[4])[3] = 1536;
/*    */     (new int[5][])[3] = arrayOfInt1;
/*    */     (arrayOfInt1 = new int[4])[0] = 6;
/*    */     (new int[4])[1] = 3;
/*    */     (new int[4])[2] = 10;
/*    */     (new int[4])[3] = 1728;
/*    */     (new int[5][])[4] = arrayOfInt1;
/*    */     (new int[8][][])[6] = arrayOfInt;
/*    */     (arrayOfInt1 = new int[4])[0] = 0;
/*    */     (new int[4])[1] = 7;
/*    */     (new int[4])[2] = 10;
/*    */     (new int[4])[3] = 2187;
/*    */     (arrayOfInt = new int[5][])[0] = arrayOfInt1;
/*    */     (arrayOfInt1 = new int[4])[0] = 8;
/*    */     (new int[4])[1] = 2;
/*    */     (new int[4])[2] = 10;
/*    */     (new int[4])[3] = 2304;
/*    */     (new int[5][])[1] = arrayOfInt1;
/*    */     (arrayOfInt1 = new int[4])[0] = 5;
/*    */     (new int[4])[1] = 4;
/*    */     (new int[4])[2] = 10;
/*    */     (new int[4])[3] = 2592;
/*    */     (new int[5][])[2] = arrayOfInt1;
/*    */     (arrayOfInt1 = new int[4])[0] = 2;
/*    */     (new int[4])[1] = 6;
/*    */     (new int[4])[2] = 10;
/*    */     (new int[4])[3] = 2916;
/*    */     (new int[5][])[3] = arrayOfInt1;
/*    */     (arrayOfInt1 = new int[4])[0] = 7;
/*    */     (new int[4])[1] = 3;
/*    */     (new int[4])[2] = 10;
/*    */     (new int[4])[3] = 3456;
/*    */     (new int[5][])[4] = arrayOfInt1;
/*    */     nn = new int[][][] { null, null, null, null, null, null, null, arrayOfInt };
/*    */   }
/*    */   
/*    */   public final void iM() {
/*    */     GM[] arrayOfGM;
/*    */     int i;
/*    */     byte b;
/*    */     for (i = (arrayOfGM = this.Rc0).length, b = 0; b < i; ) {
/*    */       this[b].AE();
/*    */       b++;
/*    */     } 
/*    */     So.k60().eC().Wz0(0.033F).Wz0(0.066F).Wz0(0.033F).PL(Wz0.OC(nR::OG)).Kr().mg(km.wI0.pB0);
/*    */   }
/*    */   
/*    */   public final void BV() {
/*    */     So so;
/*    */     (so = So.k60()).eC();
/*    */     for (byte b = 0; b < 5; ) {
/*    */       so.L5();
/*    */       GM[] arrayOfGM;
/*    */       int i;
/*    */       byte b1;
/*    */       for (i = (arrayOfGM = this.Rc0).length, b1 = 0; b1 < i; ) {
/*    */         GM gM;
/*    */         if ((gM = arrayOfGM[b1]).Tx == b)
/*    */           gM.Y00(so); 
/*    */         b1++;
/*    */       } 
/*    */       so.Kr();
/*    */       so.PL(Wz0.OC(nR::DP));
/*    */       so.Wz0(0.066F);
/*    */       b++;
/*    */     } 
/*    */     so.PL(Wz0.OC(this::ie0));
/*    */     so.Kr().mg(km.wI0.pB0);
/*    */   }
/*    */   
/*    */   public final void dispose() {
/*    */     km.pm0.Wk0((byte)0, (short)0);
/*    */     this.sD0.dispose();
/*    */     this.O10.dispose();
/*    */     this.LPt4.dispose();
/*    */     this.zj0.dispose();
/*    */     this.cn0.dispose();
/*    */     Texture[] arrayOfTexture;
/*    */     int i;
/*    */     byte b;
/*    */     for (i = (arrayOfTexture = this.Fn0).length, b = 0; b < i; ) {
/*    */       this[b].dispose();
/*    */       b++;
/*    */     } 
/*    */   }
/*    */   
/*    */   public final AT WK() {
/*    */     return this.xb;
/*    */   }
/*    */   
/*    */   public final void WF(int paramInt) {
/*    */     this.xb.Ox = paramInt;
/*    */     (this.eO[1]).ov = paramInt;
/*    */     (this.eO[1]).TE0 = paramInt;
/*    */   }
/*    */   
/*    */   public final void aK(int paramInt) {
/*    */     String str;
/*    */     int i;
/*    */     byte b;
/*    */     for (i = 5 - (str = Integer.toString((this.eO[paramInt]).ov)).length(), b = 0; b < str.length(); ) {
/*    */       int j = str.charAt(b) - 48;
/*    */       pe0 pe01 = this.z20[j];
/*    */       float f1 = ((b + i) * 16 + 168), f2 = (paramInt * 40 + 210);
/*    */       this.sD0.TB(pe01, f1, f2);
/*    */       b++;
/*    */     } 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/nR.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */