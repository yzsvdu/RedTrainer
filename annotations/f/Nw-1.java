/* 1 */ package f;public final class Nw extends cg { public uT PK0; public uT MA0; public UA0 Jf; public Nw(byte paramByte) { super(paramByte); } public final void Ti() { int i; if ((i = this.to0) > -1) { Matrix4 matrix4 = (this.yl0[i]).mh; matrix4.on0(eo); eo.y += 0.18F; float f = eo.z - 0.05F; this.Jl.He0.x = eo.x; this.Jl.He0.z = f; eo eo; (eo = cg.Qg).TG0(0.0F, 0.5F, 1.0F); this.Jl.W5(eo, this.vn.nj0); }  super.Ti(); } public final void xA() { super.xA(); lpt1 lpt1 = (this.Rt = new Yo0(km.mI0.MT)).zt0; this.lPt7.Com3(lpt1);
/* 2 */     lpt1 = this.Rt.C70;
/* 3 */     this.lPt7.Com3(lpt1);
/* 4 */     this.Rt.C70.mh.g7(0.0F, -0.5F, 0.0F); this.Rt.C70.mh.GJ(4.0F, 4.0F, 4.0F); this.vn.Ce0 = 0.1F; this.vn.l6 = 200.0F; this.vn.Bj = 40.0F; this.vn.Mp = 0.0F; this.vn.IG0 = 0.0F; this.vn.yF.TG0(0.0F, 0.0F, -1.0F); this.vn.H.TG0(0.0F, 2.5F, 2.5F); eo eo; this.vn.nj0.JL(eo = eo.Y); this.vn.Ff(eo.X, -50.0F); this.vn.Ff(eo, 0.0F); this.vn.Ff(eo.Z, 0.0F); this.vn
/* 5 */       .abstract(true);
/* 6 */     So.k60().eC().PL(Wz0.aG(4, this.vn).qw0(0.0F, 6.0F, 6.0F)).PL(Wz0.gq(this.vn, 4, 1.5F).qw0(0.0F, 3.25F, 4.0F)).PL(Wz0.OC(new MC0(this))).Kr()
/*   */       
/* 8 */       .mg(km.wI0.pB0); } public final void lpt6() { super.lpt6(); if (this.PK0 != null && this.MA0 != null && this.Tc >= 2) { UA0 uA0; if ((uA0 = this.Jf) != null) UB0.Kg0.fN(uA0);  eo eo; (eo = cg.Qg).TG0(0.0F, 0.5F, 1.0F); this.MA0.W5(eo, this.vn.nj0); this.MA0.Gz(); this.MA0.SG0(UB0.M60.Qy); this.PK0.W5(eo, this.vn.nj0); this.PK0.Gz(); this.PK0.SG0(UB0.M60.Qy); uT uT2 = this.PK0; this.L7.q10(uT2, this.xo0); uT uT1 = this.MA0; this.L7.q10(this, this.xo0); }  } public final void E4() { short s = (short)(this.to0 * 3 + 387); UA0 uA0; if ((uA0 = this.Jf) != null) { uA0.dispose(); this.Jf = null; }
/* 9 */      (this.Jf = um0.Kt0.vt((byte)0, s, false, false)).Zz(h1.UD0); (this.MA0 = uT.NI(this.Jf)).zO(0.0125F); this(this.Rt.ED); pe0 pe0; int i = pe0.H0; (this.PK0 = new uT(i, pe0.Vn0, pe0, false)).zO(0.00125F); Matrix4 matrix4 = (this.yl0[this.to0]).mh; matrix4.on0(eo2); eo eo1; (this.yl0[this.to0]).mh.on0(eo1 = cg.Qg); eo eo2; (eo2 = cg.kW).y += 1.5F; cg.kW.z = 1.5F; cg.kW.x = 0.0F; this.MA0.Bp(1.0F, 1.0F, 1.0F, 0.0F); this.MA0.WI0(eo2); this.PK0.WI0(eo1); float f1 = eo2.x, f2 = eo2.y - 0.4F, f3 = eo2.z; this.Nk0 = (So)So.k60().eC().L5().PL(Wz0.gq(this.PK0, 4, 0.25F).qw0(f1, f2, f3)).PL(Wz0.gq(this.PK0, 7, 0.5F).a(1.25F)).Kr().PL(Wz0.gq(this.MA0, 9, 0.1F).a(1.0F)).Kr().PL(Wz0.OC((paramInt, paramsh) -> D0.MJ0((short)(this.to0 * 3 + 387)))).mg(km.wI0.pB0); }
/*   */ 
/*   */   
/*   */   public final void coM4() {
/*   */     int i = this.to0 + 1;
/*   */     char c = 'Ũ';
/*   */     String arrayOfString[] = Ml0.EH0, str = Ml0.tG((byte)3, F40.ef0, c, i, arrayOfString);
/*   */     ((new h70(this, this::vm0, null)).Id(this::yE)).sD0 = true;
/*   */     js.vu0.uh((new h70(this, this::vm0, null)).Id(this::yE));
/*   */   }
/*   */   
/*   */   public final void vm0() {
/*   */     this.Nk0 = (So)So.k60().eC().PL(Wz0.OC((paramInt, paramsh) -> D0.MJ0((short)(this.to0 * 3 + 387)))).PL(Wz0.gq(this.vn, 8, 0.8F).a(24.0F)).PL(Wz0.OC((paramInt, paramsh) -> {
/*   */             km.u4.lx0(this.z50, (byte)(this.to0 + 1));
/*   */             this.Tc = 4;
/*   */           })).Kr().mg(km.wI0.pB0);
/*   */   }
/*   */   
/*   */   public final void dispose() {
/*   */     UA0 uA0;
/*   */     if ((uA0 = this.Jf) != null)
/*   */       uA0.dispose(); 
/*   */     super.dispose();
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Nw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */