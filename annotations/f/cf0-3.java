/*  1 */ package f;public class cf0 implements iq0 { public final void L7(YW paramYW, vf0 paramvf0) { Hc0 hc03 = paramYW.Lg.r30(); while (hc03
/*  2 */       .hasNext()) { boolean bool; Ao ao; int k = 0; mZ mZ; ow0[] arrayOfOw02; int i1;
/*  3 */       for (int n = (arrayOfOw02 = (mZ = (mZ)hc03.next()).i2).length; i1 < n; ) { k += (arrayOfOw02[i1]).xj.length; i1++; }  if (k > 0) { bool = true; } else { bool = false; }  this(mZ.e7); i1 = mZ.qL0.length / ao.Nb / 4; this(true, i1, k, ao); this.n6.Com3(re0); this.S9.Com3(re0);
/*    */       
/*  5 */       BufferUtils.BA0(mZ.qL0, re0.Dt0.w0(), mZ.qL0.length, 0); int j = 0; re0 re0;
/*  6 */       (re0 = new re0()).rs0.w0()
/*  7 */         .clear(); ow0[] arrayOfOw01; int m; byte b1; for (m = (arrayOfOw01 = mZ.i2).length, b1 = 0; b1 < m; ) { int i2; ow0 ow0 = arrayOfOw01[b1]; this(); cOM6.N40 = ow0.Qp0; cOM6.lm = ow0.Ff0; COM6 cOM6; (cOM6 = new COM6()).xI0 = j; if (bool) { i2 = ow0.xj.length; } else { i2 = i1; }  cOM6.Dr = i2; cOM6.u90 = re0; if (bool) re0
/*  8 */             .rs0.w0()
/*  9 */             .put(ow0.xj);  j += cOM6.Dr; this.xl0.Com3(cOM6); b1++; }  re0
/* 10 */         .rs0.w0()
/* 11 */         .position(0); for (Hc0 hc0 = this.xl0.r30(); hc0.hasNext(); ((COM6)hc0.next()).H90()); }
/*    */     
/* 13 */     hc03 = paramYW.ID.r30(); while (hc03
/* 14 */       .hasNext()) { f7 f71; QD qD = (QD)hc03.next(); fQ fQ1 = this.s30;
/* 15 */       this(); T0 t0; (t0 = new T0()).Xy0 = qD.KJ0; if (qD.W4 != null) { qo qo; long l = qo.bh0; Color color = qD.W4; this(l, color); t0.Tz0(qo); }  if (qD.sK != null) { qo qo; long l = qo.A80; Color color = qD.sK; this(l, color); t0.Tz0(qo); }  if (qD.yF0 != null) { qo qo; long l = qo.J9; Color color = qD.yF0; this(l, color); t0.Tz0(qo); }  if (qD.PC0 != null) { qo qo; long l = qo.cu0; Color color = qD.PC0; this(l, color); t0.Tz0(qo); }  if (qD.vI != null) { qo qo; long l = qo.Ib; Color color = qD.vI; this(l, color); t0.Tz0(qo); }  if (qD.Tu > 0.0F) { LPT9 lPT9; long l = LPT9.ft0; float f = qD.Tu; this(l, f); t0.Tz0(lPT9); }  if (qD.wC != 1.0F) { zc zc; float f = qD.wC; this(770, 771, f); t0.Tz0(zc); }  this(); fQ fQ2; if ((fQ2 = qD.Oi0) != null) for (Hc0 hc0 = fQ2.r30(); hc0.hasNext(); ) { Texture texture; float f1, f2, f3, f4; Ri0 ri0; if (f71.GB0((ri0 = (Ri0)hc0.next()).i0)) { texture = (Texture)f71.pd0(ri0.i0); } else { texture = paramvf0.j5(ri0.i0); f71.X00(ri0.i0, texture); this.S9.Com3(texture); }  this((zp)texture); iX.HF0 = texture.getMinFilter(); iX.OH0 = texture.getMagFilter(); iX.FZ = texture.getUWrap(); IX iX; (iX = new IX()).COm4 = texture.getVWrap(); NC0 nC01; if ((nC01 = ri0.jO) == null) { f2 = 0.0F; } else { f2 = nC01.x; }  if (nC01 == null) { f1 = 0.0F; } else { f1 = f1.y; }  NC0 nC02; if ((nC02 = ri0.ne0) == null) { f4 = 1.0F; } else { f4 = nC02.x; }  if (nC02 == null) { f3 = 1.0F; } else { f3 = f3.y; }  switch (ri0.kH) { default: continue;case 10: t0.Tz0(new O80(O80.La, iX, f2, f1, f4, f3)); continue;case 8: t0.Tz0(new O80(O80.wF0, iX, f2, f1, f4, f3)); continue;case 7: t0.Tz0(new O80(O80.tM, iX, f2, f1, f4, f3)); continue;case 5: t0.Tz0(new O80(O80.D8, iX, f2, f1, f4, f3)); continue;case 4: t0.Tz0(new O80(O80.Mc0, iX, f2, f1, f4, f3)); continue;case 3: t0.Tz0(new O80(O80.fS, iX, f2, f1, f4, f3)); continue;case 2: break; }  t0.Tz0(new O80(O80.Jg0, iX, f2, f1, f4, f3)); }   fQ1
/* 16 */         .Com3(t0); }
/* 17 */      this
/* 18 */       .Lo.t9();
/* 19 */     Hc0 hc02 = paramYW.nG0.r30(); while (hc02
/* 20 */       .hasNext()) { Jp jp = (Jp)hc02.next(); this.O0.Com3(fI0(jp)); }  oc oc; (oc = this.Lo.sh()).getClass(); while (oc.hasNext()) { yO yO; R70 r70; if ((r70 = (R70)(yO = oc.next()).Lb).tm == null) { eM eM; this(zP.class, Matrix4.class); r70.tm = eM; }  ((R70)yO.Lb).tm.clear(); y5 y5; (y5 = ((eM)yO.mm).HV()).getClass(); while (y5.hasNext()) { Matrix4 matrix4; eM eM = ((R70)yO.Lb).tm; yO yO1; String str = (String)(yO1 = (yO)y5.next()).Lb;
/* 21 */         zP zP = zP.le0(this.O0, str, true);
/* 22 */         this((Matrix4)yO1.mm);
/* 23 */         float f2, f3, f4, f5, f6 = (f3 = f1 * (f2 = arrayOfFloat[6])) * (f4 = arrayOfFloat[9]) * (f5 = arrayOfFloat[12]); f6 = Oq.R0(f10, f4, f5, f6); float f10, f11, f12; f6 = Oq.R0(f11 = f1 * (f10 = arrayOfFloat[5]), f12 = arrayOfFloat[10], f5, f6); float f13 = arrayOfFloat[1]; float f14; f6 = (f14 = f13 * f9) * f12 * f5 + f6; float f15, f16, f17, f18, f19, f20 = (f17 = (f15 = f8 * f10) * (f16 = arrayOfFloat[11])) * f5 + f6 - (f18 = (f6 = f13 * f2) * f16) * f5 - f3 * (f3 = arrayOfFloat[8]) * (f19 = arrayOfFloat[13]); float f8, f9; f20 = (f10 = (f8 = arrayOfFloat[2]) * (f9 = arrayOfFloat[7])) * f3 * f19 + f20; float arrayOfFloat[], f1, f21, f22; f20 = (f22 = (f1 = (arrayOfFloat = (new Matrix4()).Z0)[3]) * (f21 = arrayOfFloat[4])) * f12 * f19 + f20; f20 = Oq.R0(f24, f12, f19, f20) - (f14 = (f11 = f8 * f21) * f16) * f19; float f24; f20 = (f24 = (f22 = f23 * f2) * f16) * f19 + f20; float f25; f20 = Oq.R0(f22, f4, f25, Oq.R0(f14, f3, f25, f11 * f3 * (f25 = arrayOfFloat[14]) + f20)); f20 = (f24 = f23 * f9) * f4 * f25 + f20; float f26, f27; f20 = (f27 = (f26 = f13 * f21) * f16) * f25 + f20; float f29, f30 = f20 - (f20 = f28 * f16) * f25 - f15 * f3 * (f29 = arrayOfFloat[15]); f30 = f6 * f3 * f29 + f30; float f31 = Oq.R0(f22, f4, f29, f11 * f4 * f29 + f30) - (f30 = f26 * f12) * f29; float f23, f28, f32; if ((f31 = (f32 = (f28 = (f23 = (new Matrix4()).Z0[0]) * f10) * f12) * f29 + f31) != 0.0F) { float f34, f35, f36 = (f34 = f4 * f25) * f9 - (f35 = f19 * f12) * f9; float f37, f38, f39 = (f37 = f19 * f2) * f16 + f36 - (f36 = f10 * f25) * f16 - (f38 = f4 * f2) * f29; float f40; f39 = (f40 = f10 * f12) * f29 + f39; float f41, f42, f43, f44 = (f41 = f5 * f12) * f9 - (f42 = f3 * f25) * f9 - (f43 = f5 * f2) * f16; float f45; f44 = (f45 = f21 * f25) * f16 + f44; float f46, f47 = (f46 = f3 * f2) * f29 + f44 - (f44 = f21 * f12) * f29; float f48, f49 = (f48 = f3 * f19) * f9; f35 = f49 - f50 * f9; f42 = (f10 = f5 * f10) * f16 + f35 - (f35 = f21 * f19) * f16; f21 = f42 - f49 * f29; f21 = (f42 = f21 * f4) * f29 + f21; float f51 = f50 * f2 - f48 * f2 - f10 * f12; f51 = f35 * f12 + f51; f51 = (f49 = f3 * f10) * f25 + f51 - f42 * f25; f19 = f35 * f1 - f34 * f1 - (f34 = f19 * f8) * f16; float f52; f19 = (f52 = f13 * f25) * f16 + f19; float f53, f54 = (f53 = f4 * f8) * f29 + f19 - (f19 = f13 * f12) * f29; f41 = f42 * f1 - f41 * f1; float f55, f56 = (f55 = f5 * f8) * f16 + f41 - (f41 = f23 * f25) * f16 - (f3 *= f8) * f29; float f57; f56 = (f57 = f23 * f12) * f29 + f56; float f50; f13 = (f50 = f5 * f4) * f1 - f48 * f1 - (f5 *= f13) * f16; float f58; f13 = (f58 = f23 * f19) * f16 + f13; f4 = f16 * f29 + f13; f34 = f4 - f13 * f29; f3 = f48 * f8 - f50 * f8; f3 = f5 * f12 + f3 - f58 * f12 - f16 * f25; f3 = f13 * f25 + f3; f4 = f36 * f1 - f37 * f1; f4 = f34 * f9 + f4 - f52 * f9 - f15 * f29; f4 = f6 * f29 + f4; f6 = f43 * f1 - f45 * f1 - f55 * f9; f6 = f41 * f9 + f6; f6 = f11 * f29 + f6 - f22 * f29; f10 = f35 * f1 - f10 * f1; f10 = f5 * f9 + f10 - f58 * f9 - f26 * f29; f10 = f28 * f29 + f10; f35 = f10 * f8 - f35 * f8 - f5 * f2; f35 = f58 * f2 + f35; f35 = f26 * f25 + f35 - f28 * f25; f5 = f38 * f1 - f40 * f1 - f53 * f9; f5 = f19 * f9 + f5 + f17 - f18; f11 = f44 * f1 - f46 * f1; f11 = f3 * f9 + f11 - f57 * f9 - f14 + f24; f1 = f49 * f1 - f42 * f1 - f16 * f9; f1 = (f13 = f23 * f4) * f9 + f1 + f27 - f20; f8 = f42 * f8 - f49 * f8; float f33; arrayOfFloat[0] = f39 * (f33 = 1.0F / f31); arrayOfFloat[1] = f54 * f33; arrayOfFloat[2] = f4 * f33; arrayOfFloat[3] = f5 * f33; arrayOfFloat[4] = f47 * f33; arrayOfFloat[5] = f56 * f33; arrayOfFloat[6] = f6 * f33; arrayOfFloat[7] = f11 * f33; arrayOfFloat[8] = f21 * f33; arrayOfFloat[9] = f34 * f33; arrayOfFloat[10] = f10 * f33; arrayOfFloat[11] = f1 * f33; arrayOfFloat[12] = f51 * f33; arrayOfFloat[13] = f3 * f33; arrayOfFloat[14] = f35 * f33; arrayOfFloat[15] = ((f16 = f3 * f13) * f2 + f8 - f13 * f2 - f30 + f32) * f33; eM
/* 24 */             .Ed0(zP, matrix4); continue; }
/* 25 */          throw new RuntimeException("non-invertible matrix"); }
/*    */        }
/* 27 */      Hc0 hc01 = paramYW.If0.r30(); while (hc01
/* 28 */       .hasNext()) { this(); Hc0 hc0; mn mn; d4 d4; for ((d4 = new d4()).Ge = mn.qi, hc0 = (mn = (mn)hc01.next()).Nn.r30(); hc0.hasNext(); ) { tD tD; String str = (tD = (tD)hc0.next()).o20; zP zP;
/* 29 */         if ((zP = zP.le0(this.O0, str, true)) == null)
/* 30 */           continue;  this(); Kj0 kj0; (kj0 = new Kj0()).WW = zP; if (tD.iu != null) { this(); kj0.gc = fQ2; fQ fQ2; (fQ2 = new fQ()).ZY(tD.iu.Z8); for (Hc0 hc04 = tD.iu.r30(); hc04.hasNext(); ) { xj xj; float f; if ((f = (xj = (xj)hc04.next()).qo) > d4.Cd0) d4.Cd0 = f;  fQ fQ3 = kj0.gc; w6 w6 = new w6(); eo eo = new eo(); Serializable serializable; if ((serializable = xj.KG0) == null) { serializable = zP.z7; } else { serializable = serializable; }  this((eo)serializable); this(f, eo); fQ3.Com3(w6); }  }  if (tD.CH0 != null) { this(); kj0.I9 = fQ2; fQ fQ2; (fQ2 = new fQ()).ZY(tD.CH0.Z8); for (Hc0 hc04 = tD.CH0.r30(); hc04.hasNext(); ) { xj xj; float f; if ((f = (xj = (xj)hc04.next()).qo) > d4.Cd0) d4.Cd0 = f;  fQ fQ3 = kj0.I9; w6 w6 = new w6(); TG0 tG0 = new TG0(); Serializable serializable; if ((serializable = xj.KG0) == null) { serializable = zP.Nq0; } else { serializable = serializable; }  this((TG0)serializable); this(f, tG0); fQ3.Com3(w6); }  }  if (tD.Ha != null) { this(); kj0.lp = fQ2; fQ fQ2; (fQ2 = new fQ()).ZY(tD.Ha.Z8); for (Hc0 hc04 = tD.Ha.r30(); hc04.hasNext(); ) { xj xj; float f; if ((f = (xj = (xj)hc04.next()).qo) > d4.Cd0) d4.Cd0 = f;  fQ fQ3 = kj0.lp; w6 w6 = new w6(); eo eo = new eo(); Serializable serializable; if ((serializable = xj.KG0) == null) { serializable = zP.nH; } else { serializable = serializable; }  this((eo)serializable); this(f, eo); fQ3.Com3(w6); }  }  fQ fQ1; if (((fQ1 = kj0.gc) != null && fQ1.Z8 > 0) || ((fQ1 = kj0.I9) != null && fQ1.Z8 > 0) || ((fQ1 = kj0.lp) != null && fQ1.Z8 > 0)) d4.Jg.Com3(kj0);  }  if (d4.Jg.Z8 > 0) this.cs.Com3(d4);  }
/* 31 */      int i; byte b; for (i = this.O0.Z8, b = 0; b < i; ) { ((zP)this.O0.get(b)).kJ0(); b++; }  for (b = 0; b < i; ) { ((zP)this.O0.get(b)).x4(); b++; }
/*    */      }
/*    */ 
/*    */   
/*    */   public final fQ s30;
/*    */   public final fQ O0;
/*    */   public final fQ cs;
/*    */   public final fQ n6;
/*    */   public final fQ xl0;
/*    */   public final fQ S9;
/*    */   public f7 Lo;
/*    */   
/*    */   public cf0() {
/*    */     fQ fQ1;
/*    */     f7 f71;
/*    */     this();
/*    */     this.s30 = this;
/*    */     this();
/*    */     this.O0 = this;
/*    */     this();
/*    */     this.cs = this;
/*    */     this();
/*    */     this.n6 = this;
/*    */     this();
/*    */     this.xl0 = this;
/*    */     this();
/*    */     this.S9 = this;
/*    */     this();
/*    */     this.Lo = this;
/*    */   }
/*    */   
/*    */   public cf0(YW paramYW) {
/*    */     this();
/*    */     bL bL;
/*    */     this(paramYW, this);
/*    */   }
/*    */   
/*    */   public cf0(YW paramYW, vf0 paramvf0) {
/*    */     fQ fQ1;
/*    */     f7 f71;
/*    */     this();
/*    */     this.s30 = this;
/*    */     this();
/*    */     this.O0 = this;
/*    */     this();
/*    */     this.cs = this;
/*    */     this();
/*    */     this.n6 = this;
/*    */     this();
/*    */     this.xl0 = this;
/*    */     this();
/*    */     this.S9 = this;
/*    */     this();
/*    */     this.Lo = this;
/*    */     L7(paramYW, paramvf0);
/*    */   }
/*    */   
/*    */   public final zP fI0(Jp paramJp) {
/*    */     this();
/*    */     zP zP;
/*    */     (zP = new zP()).v30 = paramJp.Qk0;
/*    */     eo eo2;
/*    */     if ((eo2 = paramJp.XD0) != null) {
/*    */       eo.getClass();
/*    */       float f1 = eo2.x, f2 = eo2.y, f3 = eo2.z;
/*    */       eo eo;
/*    */       (eo = zP.z7).TG0(f1, f2, f3);
/*    */     } 
/*    */     TG0 tG0;
/*    */     if ((tG0 = paramJp.Ea0) != null) {
/*    */       tG01.getClass();
/*    */       float f1 = tG0.D80, f2 = tG0.tb0, f3 = tG0.z60, f4 = tG0.AD;
/*    */       TG0 tG01;
/*    */       (tG01 = zP.Nq0).vp0(f1, f2, f3, f4);
/*    */     } 
/*    */     eo eo1;
/*    */     if ((eo1 = paramJp.pB) != null) {
/*    */       eo.getClass();
/*    */       float f1 = eo1.x, f2 = eo1.y, f3 = eo1.z;
/*    */       eo eo;
/*    */       (eo = zP.nH).TG0(f1, f2, f3);
/*    */     } 
/*    */     bj0[] arrayOfBj0;
/*    */     if ((arrayOfBj0 = paramJp.Sz) != null) {
/*    */       int i;
/*    */       byte b;
/*    */       for (i = arrayOfBj0.length, b = 0; b < i; ) {
/*    */         COM6 cOM6 = null;
/*    */         T0 t0 = null;
/*    */         bj0 bj0;
/*    */         if ((bj0 = arrayOfBj0[b]).E00 != null)
/*    */           for (Hc0 hc0 = this.xl0.r30(); hc0.hasNext(); ) {
/*    */             COM6 cOM61 = (COM6)hc0.next();
/*    */             if (bj0.E00.equals(cOM61.N40)) {
/*    */               cOM6 = cOM61;
/*    */               break;
/*    */             } 
/*    */           }  
/*    */         if (bj0.const != null)
/*    */           for (Hc0 hc0 = this.s30.r30(); hc0.hasNext(); ) {
/*    */             T0 t01 = (T0)hc0.next();
/*    */             if (bj0.const.equals(t01.Xy0)) {
/*    */               t0 = t01;
/*    */               break;
/*    */             } 
/*    */           }  
/*    */         if (cOM6 != null && t0 != null) {
/*    */           this();
/*    */           r70.xn = cOM6;
/*    */           R70 r70;
/*    */           (r70 = new R70()).Zz0 = t0;
/*    */           zP.zx0.Com3(r70);
/*    */           eM eM;
/*    */           if ((eM = bj0.fu) != null)
/*    */             this.Lo.X00(r70, eM); 
/*    */           b++;
/*    */           continue;
/*    */         } 
/*    */         throw new JU(B40.df("Invalid node: ").append(zP.v30).toString());
/*    */       } 
/*    */     } 
/*    */     Jp[] arrayOfJp;
/*    */     if ((arrayOfJp = paramJp.JX) != null) {
/*    */       int i;
/*    */       byte b;
/*    */       for (i = arrayOfJp.length, b = 0; b < i; ) {
/*    */         zP.V0(fI0(arrayOfJp[b]));
/*    */         b++;
/*    */       } 
/*    */     } 
/*    */     return zP;
/*    */   }
/*    */   
/*    */   public final void dispose() {
/*    */     Hc0 hc0 = this.S9.r30();
/*    */     while (hasNext())
/*    */       ((iq0)next()).dispose(); 
/*    */   }
/*    */   
/*    */   public final zP r4(String paramString, boolean paramBoolean) {
/*    */     return zP.le0(this.O0, paramString, paramBoolean);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/cf0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */