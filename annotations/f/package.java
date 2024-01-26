/*  1 */ package f;public final class package extends cg { public uT cl; public UA0 Ws0; public lpt1[] Ay0; public float B9 = 0.0F; public float k60 = 0.0F; public package(byte paramByte) { super(paramByte); } private void Wz0(int paramInt, sh paramsh) { D0.MJ0((short)(this.to0 * 3 + 152)); (this.yl0[this.to0]).k = 1.0F; this.yl0[this.to0].rd(1, false, null); this
/*  2 */       .Ay0[this.to0]
/*  3 */       .rd(0, false, null);
/*  4 */     char c = '׸'; km.pm0
/*  5 */       .bA0(true, (byte)4, c, 0.0F); } public final void xA() { super.xA(); this.to0 = 0; this(km.mI0.yE); Yo0 yo0; this.Rt = new Yo0(); (((zP)yo0.zt0.vC0.get(0)).kv0(0).kv0(0)).nH.Qh0(4.0F, 2.0F, 1.25F); (((zP)yo0.zt0.vC0.get(0)).kv0(0).kv0(0)).z7.Tz(0.0F, -15.0F, 0.0F); this.Rt.zt0.o6(); lpt1 lpt11 = this.Rt.zt0; this.lPt7.Com3(lpt11); lpt11 = this.Rt.eA0; this.lPt7.Com3(lpt11); this.Rt.eA0.rd(0, true, null);
/*  6 */     this.vn.Ce0 = 0.1F; this.vn.l6 = 200.0F; this.vn.Bj = 60.0F; this.vn.Mp = 0.0F; this.vn.IG0 = 0.0F; this.vn.el0 = 20.0F; this.vn.H.TG0(0.0F, 2.0F, 2.0F); this.vn.nq0(0.0F, 0.0F, 0.0F); this.vn.nj0.JL(eo.Y); this.vn
/*  7 */       .abstract(true);
/*  8 */     ((O80)((T0)this.Rt.mx0.xl0.get(2))
/*  9 */       .cOM1(O80.Jg0))
/* 10 */       .cv0.vv0(((O80)((T0)this.Rt.mx0.xl0.get(2)).cOM1(O80.Jg0)).cv0.ze, cu0.Fh, cu0.Fh, A00.IB0, A00.IB0); lpt1[] arrayOfLpt1; byte b; lpt1 lpt12; for (this.yl0 = arrayOfLpt1, arrayOfLpt1[0] = lpt12, (arrayOfLpt1 = new lpt1[3])[1] = (lpt12 = this.Rt.mx0).ro0(), this.yl0[2] = this.Rt.mx0.ro0(), this.Ay0 = arrayOfLpt1, arrayOfLpt1[0] = lpt12, (arrayOfLpt1 = new lpt1[3])[1] = (lpt12 = this.Rt.Nh0).ro0(), this.Ay0[2] = this.Rt.Nh0.ro0(), b = 0; b < 3; ) { lpt12 = this.yl0[b]; eo eo1; lpt12.mh.b8(eo1 = eo.Zero); eo eo2 = eo.Y; float f = (b * -120); lpt12.mh.Rn0(eo2, f); lpt12.mh.g7(0.0F, 0.22F, 0.5F); lpt1 lpt13; (lpt13 = this.Ay0[b]).mh.b8(eo1); (this.Ay0[b]).mh.Rn0(eo2, f); (this.Ay0[b]).mh.g7(0.0F, 0.22F, 0.5F); this
/* 11 */         .lPt7.Com3(lpt12); this.lPt7.Com3(lpt13); b++; }  this
/* 12 */       .Tc = 1; Is(this.to0); }
/*    */ 
/*    */   
/*    */   public final void Ti() {
/*    */     super.Ti();
/*    */     int i;
/*    */     if ((i = this.to0) < 0) {
/*    */       i = 0;
/*    */     } else {
/*    */       i *= -120;
/*    */     } 
/*    */     float f;
/*    */     if (!nx0.JC0(this.B9, f = i)) {
/*    */       float f1;
/*    */       if ((f1 = (this.k60 = this.k60 + UB0.M60.Qy) / 0.33F) >= 1.0F) {
/*    */         this.B9 = f;
/*    */         D0.MJ0((short)(this.to0 * 3 + 152));
/*    */         Is(this.to0);
/*    */       } else {
/*    */         f = (((f - (f = this.B9) + 360.0F + 180.0F) % 360.0F - 180.0F) * f1 + f + 360.0F) % 360.0F;
/*    */       } 
/*    */     } else {
/*    */       f = this.B9;
/*    */     } 
/*    */     this.vn.H.TG0(0.0F, 3.0F, 3.0F);
/*    */     this.vn.nq0(0.0F, 0.0F, 0.0F);
/*    */     eo eo;
/*    */     this.vn.nj0.JL(eo = eo.Y);
/*    */     this.vn.e20(eo.Zero, eo, f);
/*    */     this.vn.abstract(true);
/*    */     cg.Qg.TG0(0.0F, 1.15F, 0.4F);
/*    */     cg.Qg.vS(eo, f);
/*    */     this.Rt.zt0.mh.Rn0(eo, f);
/*    */     uT uT1;
/*    */     if ((uT1 = this.cl) != null) {
/*    */       eo eo1 = this.vn.H;
/*    */       uT1.si(this, this.vn.nj0);
/*    */     } 
/*    */   }
/*    */   
/*    */   public final int ce0(int paramInt) {
/*    */     int i;
/*    */     if ((i = this.to0) < 0) {
/*    */       i = 0;
/*    */     } else {
/*    */       i *= -120;
/*    */     } 
/*    */     if (!nx0.JC0(this.B9, i))
/*    */       return -2; 
/*    */     this.Nk0 = (So)So.k60().eC().PL(Wz0.gq(this.cl, 9, 0.25F).a(0.0F)).Kr().mg(km.wI0.pB0);
/*    */     km.pm0.bA0(true, (byte)4, (short)1543, 0.0F);
/*    */     this.k60 = 0.0F;
/*    */     return super.ce0(paramInt);
/*    */   }
/*    */   
/*    */   public final void Kl(int paramInt) {
/*    */     (this.yl0[paramInt]).k = 99999.0F;
/*    */     this.yl0[paramInt].rd(0, false, null);
/*    */   }
/*    */   
/*    */   public final void lpt6() {
/*    */     super.lpt6();
/*    */     if (this.cl != null && this.Tc >= 1) {
/*    */       UA0 uA0;
/*    */       if ((uA0 = this.Ws0) != null)
/*    */         UB0.Kg0.fN(uA0); 
/*    */       this.cl.Gz();
/*    */       this.cl.SG0(UB0.M60.Qy);
/*    */       uT uT1 = this.cl;
/*    */       this.L7.q10(this, this.xo0);
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void E4() {
/*    */     this.Nk0 = (So)So.k60().eC().PL(Wz0.gq(this.vn, 8, 0.8F).a(50.0F)).PL(Wz0.OC((paramInt, paramsh) -> coM4())).Kr().mg(km.wI0.pB0);
/*    */   }
/*    */   
/*    */   public final void yE() {
/*    */     super.yE();
/*    */     this.Nk0 = (So)So.k60().eC().PL(Wz0.gq(this.vn, 8, 0.8F).a(67.0F)).Kr().mg(km.wI0.pB0);
/*    */   }
/*    */   
/*    */   public final void coM4() {
/*    */     String str = Ml0.bM0(190, this.to0 + 1);
/*    */     ((new h70(this, this::vm0, null)).Id(this::yE)).sD0 = true;
/*    */     js.vu0.uh((new h70(this, this::vm0, null)).Id(this::yE));
/*    */   }
/*    */   
/*    */   public final void vm0() {
/*    */     this.Nk0 = (So)So.k60().eC().PL(Wz0.OC(this::Wz0)).PL(Wz0.gq(this.vn, 8, 0.8F).a(24.0F)).PL(Wz0.OC((paramInt, paramsh) -> {
/*    */             km.u4.lx0(this.z50, (byte)(this.to0 + 1));
/*    */             this.Tc = 4;
/*    */           })).Kr().mg(km.wI0.pB0);
/*    */   }
/*    */   
/*    */   public final void dispose() {
/*    */     UA0 uA0;
/*    */     if ((uA0 = this.Ws0) != null)
/*    */       uA0.dispose(); 
/*    */     super.dispose();
/*    */   }
/*    */   
/*    */   public final void Is(int paramInt) {
/*    */     short s = (short)(paramInt * 3 + 152);
/*    */     UA0 uA0;
/*    */     if ((uA0 = this.Ws0) != null) {
/*    */       uA0.dispose();
/*    */       this.Ws0 = null;
/*    */     } 
/*    */     (this.Ws0 = um0.Kt0.vt((byte)0, s, false, false)).Zz(h1.UD0);
/*    */     (this.cl = uT.NI(this.Ws0)).zO(0.0125F);
/*    */     int i = paramInt * -120;
/*    */     eo eo2;
/*    */     (eo2 = cg.Qg).TG0(0.0F, 1.15F, 0.4F);
/*    */     if (paramInt != 0) {
/*    */       if (paramInt == 1)
/*    */         eo2.x = 0.025F; 
/*    */     } else {
/*    */       eo2.x = 0.075F;
/*    */     } 
/*    */     eo eo1 = eo.Y;
/*    */     eo2.vS(eo1, i);
/*    */     this.cl.Bp(1.0F, 1.0F, 1.0F, 0.0F);
/*    */     this.cl.WI0(eo2);
/*    */     this.Nk0 = (So)So.k60().eC().PL(Wz0.gq(this.cl, 9, 0.25F).a(1.0F)).Kr().mg(km.wI0.pB0);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/package.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */