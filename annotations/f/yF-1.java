/*  1 */ package f;public class yF extends static { public static final eo yh0 = new eo(); public static final Matrix4 Y30 = new Matrix4(); public Pn0 cb; public Pn0 Vw; public short CF; public byte LPt7; public zh0[] Hp; public float[] Lpt6; public uT GP; public fQ gw0; public boolean ZZ; public long WG0; public int Rg; public boolean Rl0; public boolean g9; public boolean On; public yF(tc paramtc) { super(paramtc); Pn0 pn0 = (new Pn0(4, 332)).WJ(); this.Vw = (new Pn0(2, 166)).cO(Ua()); this.CF = -1; this.LPt7 = -1; this.Hp = null; this.Lpt6 = null; this.gw0 = new fQ(2); this.ZZ = false; this.WG0 = -1L; this.Rg = 0; this.Rl0 = false; this.g9 = false; } public boolean t0(tH paramtH, int paramInt, boolean paramBoolean) { boolean bool1; float f3; byte b; boolean bool3; zh0 zh01; if ((zh01 = fk(null)) == null) return true;  xS(this.Rg, paramtH); boolean bool2 = false; if (this.Rg != 255) { float f = (Xc0.Com4.cpy()).a; (Xc0.Com4.cpy()).a = this.Rg / 255.0F * f; paramtH.HK0(Xc0.Com4.cpy()); bool2 = true; }  if (this.Hp.length < 7 && paramBoolean) { paramBoolean = true; } else { paramBoolean = false; }  int i = 0, j = 0; float[] arrayOfFloat; if ((arrayOfFloat = this.Lpt6) != null) { j = (int)(d - arrayOfFloat[1] * 0.25D); double d; i = (int)((d = j) - arrayOfFloat[2] * 0.25D); }  pe0 pe0 = zh01.Uu0(); int k = zh01.Fj; if (((this.LPt7 & Byte.MIN_VALUE) != 0)) { b = 3; } else { b = 4; }
/*  2 */      k = k / b * 3; eo eo1; float f6 = (eo1 = this.ao).x - j - 4.0F - ((j = k - 24) / 2); if (paramBoolean) { bool3 = k; } else { bool3 = false; }  float f5 = f6 + bool3, f4 = eo1.y - i - 8.0F - j;
/*  3 */     if ((j = h1.rl0) != 2 && (j != 1 || 
/*  4 */       zm0.u20 - 
/*    */       
/*  6 */       this.zS.pm
/*  7 */       .HQ <= 300L) && this
/*  8 */       .Vw.Nn0() == 0) { bool1 = true; } else { bool1 = false; }  float f1 = f4 - bool1; if (paramBoolean) { f3 = -k; } else { f3 = k; }  float f2 = k; paramtH
/*  9 */       .Yo0(pe0, f5, f1, f3, f2); if (bool2) paramtH.og0(Xc0.Nn0);  return true; } public boolean II0(Ih0 paramIh0, K70 paramK70, fo0 paramfo0, int paramInt, boolean paramBoolean) { zh0 zh01; if ((zh01 = fk(paramfo0)) == null) return true;  if (this.Rg > 125) lpt6(paramIh0, paramK70, paramfo0, false, false);  if (((this.LPt7 & Byte.MIN_VALUE) != 0)) { f1 = 1.3333334F; } else { f1 = 1.0F; }  eo1.JL(this.ao); pe0 pe0 = zh01.Uu0(); eo eo1; float f3 = (eo1 = yh0).z - 0.02F, f4 = yh0.y - 0.01F; int k; if ((k = zh01.Fj) > 32 || f1 > 1.0F) { eo1.y = (k * f1 - 32.0F) / 32.0F * 0.08F + f4; eo1.z = f3 - (k * f1 - 32.0F) / 32.0F * 0.16F; }  float f1 = zh01.Ys0 * 0.01171875F * f1; float[] arrayOfFloat; if ((arrayOfFloat = this.Lpt6) != null) { if ((f4 = arrayOfFloat[0]) > 0.0F) f1 *= f4;  float f = eo1.x; eo1.x = arrayOfFloat[1] * 0.01F + f; f = eo1.y; eo1.y = arrayOfFloat[2] * 0.01F + f; f = eo1.z; eo1.z = arrayOfFloat[3] * 0.01F + f; }  if (this.GP == null) { uT uT2; boolean bool1 = true, bool2 = true; this(bool1, bool2, pe0, true); this.GP = uT2; }  float f2 = 0.0F; G5 g5; xr0 xr0; if ((g5 = this.zS.HW)
/* 10 */       .FB == 3 && g5
/* 11 */       .LB0 && (
/* 12 */       xr0 = g5.CJ0()).Kn() != 0.0F) { f2 = xr0.Kn(); if (nx0.JC0(90.0F, f2)) { eo1.uD(0.2F, 0.25F, -0.05F); } else if (nx0.JC0(270.0F, f2)) { eo1.uD(-0.15F, 0.2F, 0.0F); }  }  uT uT1 = this.GP; if ((this.Hp.length < 7 || this.g9) && paramBoolean) { paramBoolean = true; } else { paramBoolean = false; }  uT1.sA0(pe0, paramBoolean); int j; if ((j = this.Rg) != 255) { float f = f1 * 0.75F; eo1.y -= (1.0F - j / 255.0F) * f; }
/* 13 */      if ((j = h1.rl0) != 2 && (j != 1 || 
/* 14 */       zm0.u20 - 
/*    */       
/* 16 */       this.zS.pm
/* 17 */       .HQ <= 300L) && this
/* 18 */       .Vw.Nn0() == 0) { j = 1; } else { j = 0; }  if (j != 0)
/*    */     
/*    */     { 
/* 21 */       float f = o80.Ry;
/*    */       O80 o80;
/* 23 */       (o80 = this.GP.RC).Ry = 1.5F / zh01.Fj * o80.yh0 + f; }  this.GP.WI0(eo1); this.GP.si(this.Yk0, this.K70.nj0); this.GP.zO(f1 * this.Rg / 255.0F); this.GP.lM(Xi.WB); if (!nx0.JC0(f2, 0.0F)) this.GP.Jb.N8(eo.Z, f2);  Y30.Jo(this.ao); for (Hc0 hc0 = this.gw0.r30(); hc0.hasNext(); ) { ParticleEffectExt particleEffectExt; if ((particleEffectExt = (ParticleEffectExt)hc0.next()).isComplete()) { this.gw0.Ct(particleEffectExt, true); continue; }  particleEffectExt.setTransform(Y30); }  int i; if ((i = this.Rg) != 255) { float f = 1.0F - i / 255.0F; this.GP.hA0(1.0F, 1.0F, 1.0F, f); } else { this.GP.hA0(0.0F, 0.0F, 0.0F, 0.0F); this.GP.DD(Color.WHITE); }  this.GP.Gz(); paramK70.q10(this.GP, paramfo0); return true; } public final zh0 fk(fo0 paramfo0) { boolean bool = false; tc tc1 = null; short s1 = this.zS.nX(); byte b = this.zS.wo(); tc tc2; if (tc2 = this.zS instanceof zk0) { G5 g51 = tc2.HW, g52 = (tc1 = ((zk0)tc2).jU).HW; if ((g51.FB == g52.FB && g51.kD0 == g52.kD0 && g51.vu0 == g52.vu0 && g51.mm == g52.mm && g51.Yu0 == g52.Yu0 && g51.Qf0 == g52.Qf0 && g51.LB0 == g52.LB0)) { this.Rg = 0; this.WG0 = zm0.u20; return null; }  xr0 xr0; if ((xr0 = g51.CJ0()) != null) { if (xr0.i2(this.zS) != null) { this.Rg = 0; this.WG0 = zm0.u20; return null; }  if (xr0.Gc(this.zS.HW.Qf0)) { this.Rg = 0; this.WG0 = zm0.u20; return null; }  }  }  short s2; if (!this.ZZ && ((s2 = this.CF) != s1 || this.LPt7 != b || this.On) && s2 != -1 && this.Hp != null) { this.ZZ = true; this.WG0 = zm0.u20; }  if (this.ZZ) { s1 = this.CF; b = this.LPt7; }
/* 24 */      if (this.CF != s1 || this.LPt7 != b) { this.WG0 = zm0.u20; this.CF = s1; this.LPt7 = b; this.Hp = switch.TK.e4(s1, true, b); this.Lpt6 = (float[])switch.TK.FK.Z90(s1);
/* 25 */       switch.TK
/* 26 */         .dA0
/* 27 */         .return(s1 | b << 16);
/* 28 */       if (C90.NH(0, s1) > 0) { s2 = 1; } else { s2 = 0; }  this.Rl0 = s2; if (C90.Ym0(s1) > 0) { s2 = 1; } else { s2 = 0; }  this.g9 = s2; bool = true; if (tc1 != null && tc1.Pf() && s1 > 0) if (this.Hp != null) { R8 r8; if (km.MR == null || (r8 = km.u4) == null || r8.NR()) D0.MJ0(s1);  } else if (tc1 = this.zS instanceof zk0 && 
/* 29 */           !((zk0)tc1).vj)
/* 30 */         { km.u4.Pq(Ml0.OH0(6910)); }   if (tc1 = this.zS instanceof zk0) ((zk0)tc1)
/* 31 */           .vj = false;  if (this
/* 32 */         .Hp == null) return null;  }  if (s1 < 1 || this.Hp == null)
/*    */     {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 65 */       return null; }  int i = (int)(zm0.u20 - this.WG0); if (this.ZZ) { if ((this.Rg = Math.max(0, 255 - (int)(i / 300.0F * 255.0F))) < 1 && !this.On) { this.ZZ = false; this.CF = -1; }  } else if (i >= 150) { this.Rg = Math.min(255, (int)((i - 150) / 300.0F * 255.0F)); }  i = (byte)this.cb.Nn0(); s2 = this.zS.HW.g50; switch switch = switch.TK; boolean bool1 = this.Rl0; switch.getClass(); int j = 0; boolean bool2; if (!(bool2 = this.g9) && switch.dA0.return(s1 | b << 16)) { byte[] arrayOfByte; if ((arrayOfByte = switch.AG0[s2]).length < i) i = (byte)(i - 2);  i = arrayOfByte[i]; } else { if (bool2) { switch (s2) { case 2: case 3: j = 7; break;case 1: j = 5; break;case 0: j = 3; break; }  } else if (bool1) { switch (s2) { case 3: j = 9; break;case 0: case 2: j = 6; break;case 1: j = 0; break; }  } else { switch (s2) { case 3: case 2: j = 4; break;case 1: case 0: j = 2; break; }  }  i = (byte)(i % 2 + j); }  if (i >= this.Hp.length) i = (byte)(i - 2);  this.gw0.clear(); kg0 kg0; if (bool && paramfo0 != null && !h1.Vy && (kg0 = km.wI0.iJ0.eA0()) != null) { String str = ""; if (((b = this.LPt7) & 0x40) != 0) { s2 = 1; } else { s2 = 0; }  if ((b & Byte.MIN_VALUE) != 0) { b = 1; } else { b = 0; }  if (s2 != 0) str = m0.tF0(str, "_shiny");  if (b != 0) str = m0.tF0(str, "_alpha");  ParticleEffectExt particleEffectExt1, particleEffectExt2; j40 j40, arrayOfJ40[]; byte b3; for (particleEffectExt1 = kg0.gi0("custom/spawn_follower" + str), particleEffectExt2 = kg0.gi0("custom/spawn_follower_ball"), j40 = null, j = (arrayOfJ40 = km.u4.s40(aq0.LI).zc0()).length, b3 = 0; b3 < j; ) { j40 j401; Q90 q90; if ((j401 = arrayOfJ40[b3]) != null && (q90 = j401.Zs).Cw0 == this.CF && q90.da() == b && j401.Zs.tm0() == s2) j40 = j401;  b3++; }  if (j40 != null) { b = j40.Zs.qz; } else { b = 3; }  particleControllerExt.aps_id = b * 4 + 46; particleControllerExt.getRenderer().getBatch().getTexture().dispose(); Texture texture; particleEffectExt2.addResource((iq0)(texture = kg0.vb0(particleControllerExt))); particleControllerExt.getRenderer().getBatch().setTexture(texture); qo qo; Influencer influencer; ParticleControllerExt particleControllerExt; if ((particleControllerExt = particleEffectExt2.findController("Ball")) != null && (influencer = particleControllerExt.findInfluencer(ColorInfluencer.class)) != null && (qo = (qo)paramfo0.cOM1(qo.iu0)) != null) { Color color; float[] arrayOfFloat; byte b4; for (color = qo.vF0, arrayOfFloat = new float[9], b4 = 0; b4 < 3; ) { int k = b4 * 3; arrayOfFloat[k] = color.r; int m = k + 1; arrayOfFloat[m] = color.g; k += 2; arrayOfFloat[k] = color.b; b4++; }  ((ColorInfluencer.Single)influencer).colorValue.setColors(arrayOfFloat); }  byte b1; ParticleEffectExt[] arrayOfParticleEffectExt2; (arrayOfParticleEffectExt2 = new ParticleEffectExt[b1 = 2])[0] = particleEffectExt1; (new ParticleEffectExt[b1 = 2])[1] = particleEffectExt2; kg0 kg01; (kg01 = km.wI0.iJ0.eA0()).getClass(); for (byte b2 = 0; b2 < b1; ) { kg01.L40(arrayOfParticleEffectExt2[b2]); arrayOfParticleEffectExt2[b2].init(); arrayOfParticleEffectExt2[b2].start(); b2++; }  Y30.Jo(this.ao); ParticleEffectExt[] arrayOfParticleEffectExt1; (arrayOfParticleEffectExt1 = new ParticleEffectExt[2])[0] = particleEffectExt1; (new ParticleEffectExt[2])[1] = particleEffectExt2; this.gw0.getClass(); this.gw0.tu0((Object[])arrayOfParticleEffectExt1, 0, 2); for (Hc0 hc0 = this.gw0.r30(); hc0.hasNext(); ((ParticleEffectExt)hc0.next()).setTransform(Y30)); }  return this.Hp[i]; }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/yF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */