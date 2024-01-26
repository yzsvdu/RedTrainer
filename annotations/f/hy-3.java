/*  1 */ package f;public final class hy extends me { public boolean P7; public lpt1 eF; public eo pr; public eo Fb0; public short Ok0; public short wh0; public float[] sn; public Jo tn0; public hy(xV paramxV) { super(paramxV); eo eo1; this.P7 = false; this.eF = null; this(); this.pr = this; this(); this.Fb0 = this; this.Ok0 = 0; this.wh0 = 0; float[] arrayOfFloat; (arrayOfFloat = new float[2])[0] = 0.0F; (new float[2])[1] = 5.0F; this.sn = this; this.tn0 = null; } public final void Ic0(float paramFloat) { if (!this.P7)
/*  2 */     { W9 w9; if ((w9 = (W9)km.wI0.iJ0)
/*  3 */         .wN
/*  4 */         .isEmpty())
/*    */         return; 
/*  6 */       for (Hc0 hc0 = w9.wN.r30(); hc0.hasNext(); ) { Ah ah = (Ah)hc0.next(); if (h20() == 185) ah.K9.Q1(2.0F, 6.0F, 2.0F);  for (Hc0 hc01 = ah.W7.r30(); hc01.hasNext();) { if ((lpt11 = (lpt1)hc01.next()).Zl0.equalsIgnoreCase("lift_base01") || lpt11.Zl0.equalsIgnoreCase("leage_lift")) { this.eF = lpt11; lpt11.uq(); }  }  }  if (this.eF == null) { char c; eI eI = eI.Lj(); byte b = 3; if (h20() > 290) { c = 'Ă'; } else { c = 'Ƕ'; }  eI
/*  7 */           .getClass();
/*  8 */         lpt1 lpt11 = eI.Yp0(b, c, true);
/*  9 */         kc(lpt11); }  this.eF.Yr0 = false; switch (h20()) { default: this.Ok0 = 4; this.wh0 = 11; this.sn[0] = 5.0F; this.sn[1] = 0.0F; break;case 294: this.Ok0 = 9; this.wh0 = 11; this.sn[0] = 9.0F; this.sn[1] = 1.0F; break;case 293: this.Ok0 = 19; this.wh0 = 44; this.sn[0] = 9.0F; this.sn[1] = 1.0F; break;case 291: this.Ok0 = 11; this.wh0 = 23; this.sn[0] = 9.0F; this.sn[1] = 1.0F; break;case 185: this.Ok0 = 8; this.wh0 = 8; this.sn[0] = 15.0F; this.sn[1] = 0.0F; break;case 184: this.Ok0 = 4; this.wh0 = 19; this.sn[0] = 5.0F; this.sn[1] = 0.0F; break;case 176: this.Ok0 = 4; this.wh0 = 11; this.sn[0] = 10.0F; this.sn[1] = 0.0F; break; }  float f = this.sn[0] * 0.25F + 0.04F; this.eF.mh.bb0(this.Ok0 * 0.25F + 0.125F, f, this.wh0 * 0.25F + 0.125F); this.P7 = true; }  this.eF.mh.on0(this.pr); if (!nx0.JC0(this.pr.y, this.Fb0.y))
/* 10 */     { eo1
/* 11 */         .y = f1;
/* 12 */       eo1
/* 13 */         .y = f1; eo eo1; float f1; eo eo2; float f2; if (((f1 = (eo1 = this.pr).y) < (f2 = (eo2 = this.Fb0).y)) ? ((f1 = UB0.M60.Qy * 1.5F + f1) >= (f1 = eo2.y)) : (f1 > f2 && (f1 -= UB0.M60.Qy * 1.5F) <= (f1 = eo2.y))) { eo1.y = f1; stop(); }  this.eF.mh.b8(this.pr); this.eF.C50(); }  } public final void Am0(short paramShort, Jo paramJo) { float f; if (paramJo == null) { this.eF.mh.on0(this.pr); eo eo1; (eo1 = this.pr).y = this.sn[paramShort] * 0.25F + 0.04F; eo2.getClass(); f = eo1.x; float f1 = eo1.y, f2 = eo1.z; eo eo2; (eo2 = this.Fb0).TG0(f, f1, f2); this.eF.mh.b8(this.pr); this.eF.C50(); this.tn0 = null; } else { this.Fb0.y = this.sn[paramShort] * 0.25F + 0.04F; lpt1 lpt11 = this.eF; f.pm.getClass(); eo eo1 = eo.Zero; f.pm.KC(lpt11, true, eo1); lpt1 lpt12 = this.eF; f.Ae.pm.getClass(); f.Ae.pm.KC(lpt12, true, eo1); km.u4.hB0 = new cc0(this); this.tn0 = f; }  for (short s = -1; s < 2; ) { for (byte b = 0; b < 2; ) { xr0 xr0; if ((xr0 = this.im0.v50(this.Ok0 + s, this.wh0 + b, 0)) == null)
/* 14 */           return;  float f1 = this.sn[paramShort];
/* 15 */         ((il)xr0).xJ = f1; short s1 = (short)(b + 1); }  s = (short)(s + 1); }
/*    */      }
/*    */ 
/*    */   
/*    */   public final void stop() {
/*    */     Jo jo;
/*    */     if ((jo = this.tn0) != null) {
/*    */       jo.pm.getClass();
/*    */       eo eo1 = eo.Zero;
/*    */       jo.pm.KC(null, false, this);
/*    */       this.tn0.Ae.pm.getClass();
/*    */       this.tn0.Ae.pm.KC(null, false, this);
/*    */       this.tn0 = null;
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void Ad0(short[] paramArrayOfshort) {
/*    */     Jo jo;
/*    */     if (paramArrayOfshort.length < 1)
/*    */       return; 
/*    */     if (!this.P7) {
/*    */       UB0.Kg0.fN(new qz0(this, paramArrayOfshort));
/*    */       return;
/*    */     } 
/*    */     short s;
/*    */     if ((s = paramArrayOfshort[0]) != 4699) {
/*    */       if (s == 4700) {
/*    */         vh0 vh0;
/*    */         if ((vh0 = km.a3) == null)
/*    */           return; 
/*    */         jo = vh0.Ct;
/*    */         Am0(paramArrayOfshort[1], this);
/*    */       } 
/*    */     } else {
/*    */       super.Am0(paramArrayOfshort[1], null);
/*    */     } 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/hy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */