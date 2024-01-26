/*  1 */ package f;public final class iR { public final lpt1 Eq(Ew paramEw) { this(); lpt1 lpt11; Eg eg; f7 f7; this.zq0.get(); String str; float f; eo eo1, eo2; short s; byte b1; for (str = N3(), f = this.zq0.getFloat(), eo1 = ls(), eo2 = ls(), s = this.zq0.getShort(), b1 = 0; b1 < s; ) { Ao ao; re0 re0; byte b3; lw0[] arrayOfLw0; int k, m, n; for (arrayOfLw0 = new lw0[b3 = this.zq0.get()], k = 0, m = 0, n = 0; n < b3; ) { int i3; if (((i3 = this.zq0.getInt()) & 0x1) != 0) { lw0 lw0; this(1, 3, "a_position"); arrayOfLw0[n] = lw0; }
/*  2 */          if ((i3 & 0x2) != 0) {
/*  3 */           lw0 lw0; this(2, 4, 5126, false, "a_color"); arrayOfLw0[n] = lw0;
/*  4 */         }  if ((i3 & 0x10) != 0) { lw0 lw0; int i4 = k + 1;
/*    */           
/*  6 */           String str1 = XD0.SD0("a_texCoord", k);
/*  7 */           this(16, 2, str1, k); arrayOfLw0[n] = lw0;
/*  8 */           k = i4; }  if ((i3 & 0x8) != 0) {
/*  9 */           lw0 lw0; this(8, 3, "a_normal"); arrayOfLw0[n] = lw0;
/* 10 */         }  if ((i3 & 0x40) != 0) { lw0 lw0; i3 = m + 1;
/*    */           
/* 12 */           String str1 = XD0.SD0("a_boneWeight", m);
/* 13 */           this(64, 2, str1, m); arrayOfLw0[n] = lw0;
/* 14 */           m = i3; }  n++; }  k = this.zq0.position(); this.zq0.position(k + (i *= 4)); m = this.zq0.getShort(); n = this.zq0.position(); int i1; this.zq0.position(n + (i1 = m * 2)); int i2 = this.zq0.position(); this(arrayOfLw0); int i, j = (i = this.zq0.getInt()) / (new Ao()).Nb / 4; this(true, j, m, ao); this.zq0.position(k);
/*    */       
/* 16 */       BufferUtils.Of0(this.zq0, re0.Dt0.w0(), i); this.zq0.position(n);
/*    */       
/* 18 */       BufferUtils.Of0(this.zq0, re0.rs0.w0(), i1); this.zq0.position(i2);
/* 19 */       eg.S9.Com3(re0);
/* 20 */       eg.n6.Com3(re0); b1++; }  for (s = this.zq0.getShort(), b1 = 0; b1 < s; ) { this(); cOM6.N40 = N3(); COM6 cOM6; (cOM6 = new COM6()).u90 = (re0)eg.n6.get(this.zq0.getInt()); eo eo = (new COM6()).dK; if (this
/* 21 */         .zq0.get() == 3) { float f1 = this.zq0.getFloat(); eo.TG0(this.zq0.getFloat(), f1, this.zq0.getFloat()); }
/* 22 */        eo = cOM6.H40;
/* 23 */       if (this.zq0.get() == 3) { float f1 = this.zq0.getFloat(); eo.TG0(this.zq0.getFloat(), f1, this.zq0.getFloat()); }  cOM6
/* 24 */         .XF = this.zq0.getFloat(); cOM6.xI0 = this.zq0.getInt(); cOM6.Dr = this.zq0.getInt(); cOM6.lm = 4; eg.xl0.Com3(cOM6); b1++; }  this(); byte b2; for (b1 = this.zq0.get(), b2 = 0; b2 < b1; ) { Texture texture; IX iX; this(); T0 t0; (t0 = new T0()).Xy0 = N3(); int i; if (((i = this.zq0.getInt()) & 0x1) != 0) t0.Tz0(new Xf0(Xf0.xZ, this.zq0.getInt()));  if ((i & 0x2) != 0) t0.Tz0(new IF(this.zq0.getInt(), true));  if ((i & 0x4) != 0) { float f1 = this.zq0.getFloat(), f2 = this.zq0.getFloat(), f3 = this.zq0.getFloat(), f4 = this.zq0.getFloat(); t0.Tz0(new qo(qo.iu0, f1, f2, f3, f4)); }  if ((i & 0x8) != 0) t0.Tz0(new Ra(Ra.SG0, this.zq0.getInt()));  if ((i & 0x10) != 0) { t0.Tz0(new zc(this.zq0.getFloat())); t0.Tz0(new LPT9(LPT9.It0, 0.01F)); }  if (f7.GB0(t0.Xy0)) { texture = (Texture)f7.pd0(t0.Xy0); } else { String str1 = t0.Xy0; texture = ((Iq)paramEw).j5(str1); f7.X00(t0.Xy0, texture); eg
/* 25 */           .S9.Com3(texture); }
/* 26 */        cu0 cu01 = texture.getMinFilter(), cu02 = texture.getMagFilter(); A00 a001 = texture.getUWrap(), a002 = texture.getVWrap(); this((zp)texture, cu01, cu02, a001, a002); t0.Tz0(new O80(O80.Jg0, iX, 0.0F, 0.0F, 1.0F, 1.0F)); eg.s30.Com3(t0); b2++; }  byte b; for (b = this.zq0.get(), b1 = 0; b1 < b; ) { eg.O0.Com3(BA(eg)); b1++; }  for (b = this.zq0.get(), b1 = 0; b1 < b; ) { this(); d4 d4; int i; byte b3; for (d4.Ge = N3(), (d4 = new d4()).Cd0 = this.zq0.getFloat(), i = this.zq0.getInt(), b3 = 0; b3 < i; ) { this(); String str1 = N3(); Kj0 kj0; (kj0 = new Kj0())
/*    */           
/* 28 */           .WW = zP.le0(eg.O0, str1, true); int j; if ((j = this.zq0.getInt()) > 0) { fQ fQ; this(j); byte b4; for (kj0.gc = fQ, b4 = 0; b4 < j; ) { float f1 = this.zq0.getFloat(); kj0.gc.Com3(new w6(f1, ls())); b4++; }  }  if ((j = this.zq0.getInt()) > 0) { fQ fQ; this(j); byte b4; for (kj0.I9 = fQ, b4 = 0; b4 < j; ) { Object object; fQ fQ1 = kj0.I9; w6 w6 = new w6(); float f1 = this.zq0.getFloat(); if (this
/* 29 */               .zq0.get() == 4) { float f2 = this.zq0.getFloat(), f3 = this.zq0.getFloat(), f4 = this.zq0.getFloat(); this(this.zq0.getFloat(), f2, f3, f4); } else { object = null; }
/* 30 */              this(f1, object); fQ1.Com3(w6); b4++; }  }  if ((j = this.zq0.getInt()) > 0) { fQ fQ; this(j); byte b4; for (kj0.lp = fQ, b4 = 0; b4 < j; ) { float f1 = this.zq0.getFloat(); kj0.lp.Com3(new w6(f1, ls())); b4++; }  }  d4.Jg.Com3(kj0); b3++; }  eg.cs.Com3(d4); b1++; }  this(eg, str, f, paramEw); if ((new lpt1())
/* 31 */       .Of == null) { Eb eb1; this(); this.Of = eb1; this(); this.AN = eb1; }  this.Of.kX(eo1, eo2); Eb eb = this.Of; this.SO
/*    */       
/* 33 */       .JL(eb.sD);
/* 34 */     eb = this.Of; this.xa
/*    */       
/* 36 */       .JL(eb.LW);
/* 37 */     this.xa.Ab0(); this.AN.rD0(this.Of);
/*    */     return this; }
/*    */ 
/*    */   
/*    */   public ByteBuffer zq0;
/*    */   public lpt1 Xv0;
/*    */   
/*    */   public iR(ByteBuffer paramByteBuffer, Ew paramEw) {
/*    */     this.zq0 = paramByteBuffer;
/*    */     this.Xv0 = Eq(paramEw);
/*    */   }
/*    */   
/*    */   public iR(MappedByteBuffer paramMappedByteBuffer, lpt1 paramlpt1) {
/*    */     this.zq0 = paramMappedByteBuffer;
/*    */     z5(paramlpt1);
/*    */   }
/*    */   
/*    */   public final void z5(lpt1 paramlpt1) {
/*    */     cf0 cf0 = paramlpt1.qY;
/*    */     this.zq0.put((byte)1);
/*    */     nl0(paramlpt1.Zl0);
/*    */     this.zq0.putFloat(paramlpt1.fv0);
/*    */     f0(paramlpt1.Of.pp0);
/*    */     f0(paramlpt1.Of.s60);
/*    */     this.zq0.putShort((short)cf0.n6.Z8);
/*    */     Hc0 hc0;
/*    */     for (hc0 = cf0.n6.r30(); hc0.hasNext(); ) {
/*    */       this.zq0.put((byte)(re0.Dt0.getAttributes()).rJ0.length);
/*    */       re0 re0;
/*    */       ki0 ki0;
/*    */       for (Iterator iterator = (re0 = (re0)hc0.next()).Dt0.getAttributes().iterator(); (ki0 = (ki0)iterator).hasNext(); ) {
/*    */         lw0 lw0 = (lw0)ki0.next();
/*    */         this.zq0.putInt(lw0.s00);
/*    */       } 
/*    */       int j = (re0.Dt0.getAttributes()).Nb / 4;
/*    */       float[] arrayOfFloat;
/*    */       re0.uk(re0.Dt0.dE() * j, arrayOfFloat = new float[j = re0.Dt0.dE() * j]);
/*    */       this.zq0.putInt(j);
/*    */       short s;
/*    */       for (s = 0; s < j; ) {
/*    */         float f = arrayOfFloat[s];
/*    */         this.zq0.putFloat(f);
/*    */         s++;
/*    */       } 
/*    */       int i;
/*    */       short[] arrayOfShort;
/*    */       re0.x2(re0.rs0.Bt(), arrayOfShort = new short[i = re0.rs0.Bt()]);
/*    */       this.zq0.putShort((short)i);
/*    */       for (byte b = 0; b < i; ) {
/*    */         s = arrayOfShort[b];
/*    */         this.zq0.putShort(s);
/*    */         b++;
/*    */       } 
/*    */     } 
/*    */     this.zq0.putShort((short)cf0.xl0.Z8);
/*    */     for (hc0 = cf0.xl0.r30(); hc0.hasNext(); ) {
/*    */       COM6 cOM6;
/*    */       nl0((cOM6 = (COM6)hc0.next()).N40);
/*    */       this.zq0.putInt(cf0.n6.JF0(cOM6.u90, true));
/*    */       f0(cOM6.dK);
/*    */       f0(cOM6.H40);
/*    */       this.zq0.putFloat(cOM6.XF);
/*    */       this.zq0.putInt(cOM6.xI0);
/*    */       this.zq0.putInt(cOM6.Dr);
/*    */     } 
/*    */     this.zq0.put((byte)cf0.s30.Z8);
/*    */     for (hc0 = cf0.s30.r30(); hc0.hasNext(); ) {
/*    */       boolean bool6;
/*    */       int i;
/*    */       nl0(t0.Xy0);
/*    */       T0 t0;
/*    */       long l1;
/*    */       boolean bool1 = (t0 = (T0)hc0.next()).gV(l1 = Xf0.xZ);
/*    */       long l3;
/*    */       boolean bool3 = t0.gV(l3 = qo.iu0);
/*    */       long l4;
/*    */       boolean bool4 = t0.gV(l4 = Ra.SG0);
/*    */       long l5;
/*    */       boolean bool5 = t0.gV(l5 = zc.U7);
/*    */       long l2;
/*    */       boolean bool2;
/*    */       if (bool2 = ((T0)hc0.next()).gV(l2 = IF.kA0)) {
/*    */         i = bool1 | 0x2;
/*    */       } else {
/*    */         bool6 = bool1;
/*    */       } 
/*    */       if (bool3)
/*    */         i = bool6 | 0x4; 
/*    */       if (bool4)
/*    */         i |= 0x8; 
/*    */       if (bool5)
/*    */         i |= 0x10; 
/*    */       this.zq0.putInt(i);
/*    */       if (bool1)
/*    */         this.zq0.putInt(((Xf0)t0.cOM1(l1)).S90); 
/*    */       if (bool2)
/*    */         this.zq0.putInt(((IF)t0.cOM1(l2)).Q5); 
/*    */       if (bool3) {
/*    */         Color color = ((qo)t0.cOM1(l3)).vF0;
/*    */         this.zq0.putFloat(color.r);
/*    */         this.zq0.putFloat(color.g);
/*    */         this.zq0.putFloat(color.b);
/*    */         this.zq0.putFloat(color.a);
/*    */       } 
/*    */       if (bool4)
/*    */         this.zq0.putInt(((Ra)t0.cOM1(l4)).ek0); 
/*    */       if (bool5)
/*    */         this.zq0.putFloat(((zc)t0.cOM1(l5)).yg0); 
/*    */     } 
/*    */     this.zq0.put((byte)cf0.O0.Z8);
/*    */     for (hc0 = cf0.O0.r30(); hc0.hasNext(); Q50(cf0, (zP)hc0.next()));
/*    */     this.zq0.put((byte)cf0.cs.Z8);
/*    */     for (hc0 = cf0.cs.r30(); hc0.hasNext(); ) {
/*    */       d4 d4;
/*    */       nl0((d4 = (d4)hc0.next()).Ge);
/*    */       this.zq0.putFloat(d4.Cd0);
/*    */       this.zq0.putInt(d4.Jg.Z8);
/*    */       for (Hc0 hc01 = d4.Jg.r30(); hc01.hasNext(); ) {
/*    */         nl0(kj0.WW.v30);
/*    */         Kj0 kj0;
/*    */         fQ fQ;
/*    */         if ((fQ = (kj0 = (Kj0)hc01.next()).gc) != null) {
/*    */           this.zq0.putInt(fQ.Z8);
/*    */           for (Hc0 hc02 = kj0.gc.r30(); hc02.hasNext(); ) {
/*    */             this.zq0.putFloat(((w6)hc02.next()).GY);
/*    */             f0((eo)((w6)hc02.next()).YJ);
/*    */           } 
/*    */         } else {
/*    */           this.zq0.putInt(0);
/*    */         } 
/*    */         if ((fQ = kj0.I9) != null) {
/*    */           this.zq0.putInt(fQ.Z8);
/*    */           for (Hc0 hc02 = kj0.I9.r30(); hc02.hasNext(); ) {
/*    */             this.zq0.putFloat(((w6)hc02.next()).GY);
/*    */             TG0 tG0;
/*    */             if ((tG0 = (TG0)((w6)hc02.next()).YJ) == null) {
/*    */               this.zq0.put((byte)0);
/*    */               continue;
/*    */             } 
/*    */             this.zq0.put((byte)4);
/*    */             this.zq0.putFloat(tG0.D80);
/*    */             this.zq0.putFloat(tG0.tb0);
/*    */             this.zq0.putFloat(tG0.z60);
/*    */             this.zq0.putFloat(tG0.AD);
/*    */           } 
/*    */         } else {
/*    */           this.zq0.putInt(0);
/*    */         } 
/*    */         if ((fQ = kj0.lp) != null) {
/*    */           this.zq0.putInt(fQ.Z8);
/*    */           for (Hc0 hc02 = kj0.lp.r30(); hc02.hasNext(); ) {
/*    */             this.zq0.putFloat(((w6)hc02.next()).GY);
/*    */             f0((eo)((w6)hc02.next()).YJ);
/*    */           } 
/*    */           continue;
/*    */         } 
/*    */         this.zq0.putInt(0);
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public final String N3() {
/*    */     byte[] arrayOfByte = new byte[this.zq0.get()];
/*    */     this.zq0.get(this);
/*    */     return new String(this);
/*    */   }
/*    */   
/*    */   public final void nl0(String paramString) {
/*    */     if (paramString == null) {
/*    */       this.zq0.put((byte)0);
/*    */       return;
/*    */     } 
/*    */     this.zq0.put((byte)paramString.length());
/*    */     this.zq0.put(paramString.getBytes());
/*    */   }
/*    */   
/*    */   public final eo ls() {
/*    */     if (this.zq0.get() == 3) {
/*    */       float f = this.zq0.getFloat();
/*    */       return new eo(this.zq0.getFloat(), f, this.zq0.getFloat());
/*    */     } 
/*    */     return null;
/*    */   }
/*    */   
/*    */   public final void f0(eo parameo) {
/*    */     if (parameo == null) {
/*    */       this.zq0.put((byte)0);
/*    */       return;
/*    */     } 
/*    */     this.zq0.put((byte)3);
/*    */     this.zq0.putFloat(parameo.x);
/*    */     this.zq0.putFloat(parameo.y);
/*    */     this.zq0.putFloat(parameo.z);
/*    */   }
/*    */   
/*    */   public final zP BA(Eg paramEg) {
/*    */     this();
/*    */     zP zP;
/*    */     (zP = new zP()).v30 = N3();
/*    */     eo eo2 = (new zP()).z7;
/*    */     if (this.zq0.get() == 3) {
/*    */       float f = this.zq0.getFloat();
/*    */       eo2.TG0(this.zq0.getFloat(), f, this.zq0.getFloat());
/*    */     } 
/*    */     TG0 tG0 = zP.Nq0;
/*    */     if (this.zq0.get() == 4) {
/*    */       float f1 = this.zq0.getFloat(), f2 = this.zq0.getFloat(), f3 = this.zq0.getFloat();
/*    */       tG0.vp0(this.zq0.getFloat(), f1, f2, f3);
/*    */     } 
/*    */     eo eo1 = zP.nH;
/*    */     if (this.zq0.get() == 3) {
/*    */       float f = this.zq0.getFloat();
/*    */       eo1.TG0(this.zq0.getFloat(), f, this.zq0.getFloat());
/*    */     } 
/*    */     byte b;
/*    */     byte b1;
/*    */     for (b = this.zq0.get(), b1 = 0; b1 < b; ) {
/*    */       zP.V0(BA(paramEg));
/*    */       b1++;
/*    */     } 
/*    */     for (b = this.zq0.get(), b1 = 0; b1 < b; ) {
/*    */       this();
/*    */       r70.xn = (COM6)paramEg.xl0.get(this.zq0.getInt());
/*    */       R70 r70;
/*    */       (r70 = new R70()).Zz0 = (T0)paramEg.s30.get(this.zq0.getInt());
/*    */       byte b2;
/*    */       if ((b2 = this.zq0.get()) > 0) {
/*    */         eM eM;
/*    */         this(b2);
/*    */         r70.tm = eM;
/*    */       } 
/*    */       for (byte b3 = 0; b3 < b2; ) {
/*    */         this();
/*    */         zP zP1;
/*    */         (zP1 = new zP()).v30 = N3();
/*    */         eM eM = r70.tm;
/*    */         Matrix4 matrix4 = new Matrix4();
/*    */         int i;
/*    */         if ((i = this.zq0.getInt()) >= 0 && i <= 50000) {
/*    */           float[] arrayOfFloat;
/*    */           byte b4;
/*    */           for (arrayOfFloat = new float[i], b4 = 0; b4 < i; ) {
/*    */             arrayOfFloat[b4] = this.zq0.getFloat();
/*    */             b4++;
/*    */           } 
/*    */           this(arrayOfFloat);
/*    */           eM.Ed0(zP1, matrix4);
/*    */           b3++;
/*    */           continue;
/*    */         } 
/*    */         throw new JU(B40.df("size < 0 getFloatArray ").append(this.zq0.position()).toString());
/*    */       } 
/*    */       zP.zx0.Com3(r70);
/*    */       b1++;
/*    */     } 
/*    */     return zP;
/*    */   }
/*    */   
/*    */   public final void Q50(cf0 paramcf0, zP paramzP) {
/*    */     nl0(paramzP.v30);
/*    */     f0(paramzP.z7);
/*    */     TG0 tG0;
/*    */     if ((tG0 = paramzP.Nq0) == null) {
/*    */       this.zq0.put((byte)0);
/*    */     } else {
/*    */       this.zq0.put((byte)4);
/*    */       this.zq0.putFloat(tG0.D80);
/*    */       this.zq0.putFloat(tG0.tb0);
/*    */       this.zq0.putFloat(tG0.z60);
/*    */       this.zq0.putFloat(tG0.AD);
/*    */     } 
/*    */     f0(paramzP.nH);
/*    */     this.zq0.put((byte)paramzP.cq.Z8);
/*    */     Hc0 hc02 = paramzP.cq.r30();
/*    */     for (; hc02.hasNext(); Q50(paramcf0, (zP)hc02.next()));
/*    */     this.zq0.put((byte)paramzP.zx0.Z8);
/*    */     for (Hc0 hc01 = paramzP.zx0.r30(); hc01.hasNext(); ) {
/*    */       this.zq0.putInt(paramcf0.xl0.JF0(r70.xn, true));
/*    */       this.zq0.putInt(paramcf0.s30.JF0(r70.Zz0, true));
/*    */       R70 r70;
/*    */       eM eM;
/*    */       if ((eM = (r70 = (R70)hc01.next()).tm) != null) {
/*    */         this.zq0.put((byte)eM.uJ0);
/*    */         y5 y5 = r70.tm.HV();
/*    */         while (y5.hasNext()) {
/*    */           yO yO;
/*    */           nl0(((zP)(yO = (yO)y5.next()).Lb).v30);
/*    */           this.zq0.putInt(arrayOfFloat.length);
/*    */           float[] arrayOfFloat;
/*    */           int i;
/*    */           byte b;
/*    */           for (i = (arrayOfFloat = ((Matrix4)yO.mm).Z0).length, b = 0; b < i; ) {
/*    */             float f = arrayOfFloat[b];
/*    */             this.zq0.putFloat(f);
/*    */             b++;
/*    */           } 
/*    */         } 
/*    */         continue;
/*    */       } 
/*    */       this.zq0.put((byte)0);
/*    */     } 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/iR.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */