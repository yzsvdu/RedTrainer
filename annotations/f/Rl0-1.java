/*  1 */ package f;public class Rl0 extends cg { public void xA() { super.xA(); this
/*    */       
/*  3 */       .JC = new tH(256, (new NH0()).Za0); this(UB0.M60.fG0(), UB0.M60.dL()); pe0 pe0; this.gz = tm; Tm tm; (tm = new Tm()).nUl = 1.0F; this.Wo = new Sp(QJ0.Ww, 512.0F, 256.0F, tm); if (this.Rt == null) this.Rt = new Yo0(km.mI0.AN);  lpt1 lpt12 = this.Rt.eA0; this
/*  4 */       .lPt7.Com3(lpt12);
/*  5 */     this.Rt.eA0
/*  6 */       .co0("psel_s02", false, null); Yo0 yo0;
/*  7 */     this.tB0 = (yo0 = this.Rt).de0; this.yl0 = arrayOfLpt12; arrayOfLpt12[0] = lpt11; lpt1 lpt11, arrayOfLpt12[]; (arrayOfLpt12 = new lpt1[3])[1] = (lpt11 = yo0.mx0).ro0(); this.yl0[2] = this.Rt.mx0.ro0(); (this.yl0[0]).mh.g7(-0.2F, 0.425F, 0.0225F); (this.yl0[1]).mh.g7(0.0F, 0.425F, -0.125F); (this.yl0[2]).mh.g7(0.2F, 0.425F, 0.0225F); byte b1; for (this.U2 = new NC0[3], b1 = 0; b1 < 3; ) { byte b3; NC0 nC0; int j = b1 * 80; if (b1 == 1) { b3 = 24; } else { b3 = 32; }  Ui0[] arrayOfUi01; int k; byte b4; for (k = (arrayOfUi01 = this.Rt.Uf[b1]).length, b4 = 0; b4 < k; ) { float f1 = j; arrayOfUi01[b4].Hc0(f1, b3); arrayOfUi01[b4].t(0.0F); arrayOfUi01[b4].Zk(0.5F); b4++; }  float f = j; this(f, b3); this.U2[b1] = nC0; b1++; }  Ui0[] arrayOfUi0; int i; byte b2; for (i = (arrayOfUi0 = this.Rt.YH).length, b2 = 0; b2 < i; ) { arrayOfUi0[b2].t(0.0F); b2++; }  for (i = (arrayOfUi0 = this.Rt.qa).length, b2 = 0; b2 < i; ) { arrayOfUi0[b2].t(0.0F); b2++; }  this(this.Rt.Q0);
/*    */     
/*  9 */     i = pe0.H0;
/*    */ 
/*    */     
/* 12 */     (this.Jl = new uT(i, pe0.Vn0, pe0, false)).zO(0.00325F); this.Jl.He0.y = 0.605F;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 20 */     this.TC0 = (So)((So)So.k60().eC().PL(Wz0.gq(this.Jl, 2, 0.4F).a(this.Jl.He0.y + 0.05F)).PL(Wz0.gq(this.Jl, 2, 0.4F).a(this.Jl.He0.y)).Kr().Ck0(9999999, 0.0F)).mg(km.wI0.pB0); So so = So.k60(); (so.eC().PL(Wz0.gq(this.Rt.YH[0], 8, 1.0F).a(1.0F)).L5().PL(Wz0.gq(this.Rt.Uf[0][1], 8, 0.6F).a(1.0F)).PL(Wz0.gq(this.Rt.Uf[1][1], 8, 0.6F).a(1.0F)).PL(Wz0.gq(this.Rt.Uf[2][1], 8, 0.6F).a(1.0F)).Kr().Wz0(1.0F).Kr())
/* 21 */       .C00 = new Af0(this);
/* 22 */     this.Nk0
/*    */       
/* 24 */       .mg(km.wI0.pB0); lpt1[] arrayOfLpt11; for (i = (arrayOfLpt11 = this.yl0).length, b2 = 0; b2 < i; ) { lpt1 lpt1 = arrayOfLpt11[b2]; this
/* 25 */         .lPt7.Com3(lpt1); b2++; }
/*    */      }
/*    */ 
/*    */   
/*    */   public static final int[] bQ = new int[] { 40, 50, 60 };
/*    */   public static final int[] vB0 = new int[] { 70, 130, 190 };
/*    */   public static final int[] jn = new int[] { 1, 0, 2 };
/*    */   public static final int[] Uh = new int[] { 2, 1, 3 };
/*    */   public vn tB0;
/*    */   public Sp Wo;
/*    */   public Tm gz;
/*    */   public tH JC;
/*    */   public NC0[] U2;
/*    */   
/*    */   public Rl0(byte paramByte) {
/*    */     super(paramByte);
/*    */   }
/*    */   
/*    */   public final void Ti() {
/*    */     int i;
/*    */     if ((i = this.to0) > -1) {
/*    */       Matrix4 matrix4 = (this.yl0[i]).mh;
/*    */       matrix4.on0(eo);
/*    */       eo.y += 0.18F;
/*    */       float f = eo.z - 0.05F;
/*    */       this.Jl.He0.x = eo.x;
/*    */       this.Jl.He0.z = f;
/*    */       eo eo;
/*    */       (eo = cg.Qg).TG0(0.0F, 0.5F, 1.0F);
/*    */       this.Jl.W5(eo, this.vn.nj0);
/*    */     } 
/*    */     super.Ti();
/*    */   }
/*    */   
/*    */   public final int ce0(int paramInt) {
/*    */     int j, m;
/*    */     if ((paramInt = super.ce0(paramInt)) == -2)
/*    */       return -2; 
/*    */     So so1 = (this.Nk0 = So.k60()).eC();
/*    */     int i = this.to0;
/*    */     Ui0[][] arrayOfUi0 = this.Rt.Uf;
/*    */     if (paramInt < 0) {
/*    */       j = 0;
/*    */     } else {
/*    */       j = paramInt;
/*    */     } 
/*    */     Ui0[] arrayOfUi01 = arrayOfUi0[j], arrayOfUi02 = arrayOfUi0[i];
/*    */     int[] arrayOfInt = Uh;
/*    */     if (paramInt < 0) {
/*    */       m = 0;
/*    */     } else {
/*    */       m = paramInt;
/*    */     } 
/*    */     i = arrayOfInt[m];
/*    */     int k = arrayOfInt[i];
/*    */     So so2 = So.k60().L5().eC().PL(Wz0.gq(this.Rt.YH[k], 8, 0.75F).a(1.0F)).PL(Wz0.gq(this.Rt.qa[k], 8, 0.1F).a(1.0F)).Kr().L5().PL(Wz0.gq(this.Rt.YH[i], 8, 0.75F).a(0.0F)).PL(Wz0.aG(8, this.Rt.qa[i]).a(0.0F));
/*    */     if (paramInt > -1) {
/*    */       float f2 = (this.U2[paramInt]).x, f1 = (this.U2[paramInt]).x;
/*    */       so2.PL(Wz0.gq(arrayOfUi01[0], 8, 0.75F).a(0.0F)).PL(Wz0.gq(arrayOfUi01[0], 6, 0.75F).n20(0.5F, 0.5F)).PL(Wz0.gq(arrayOfUi01[1], 6, 0.75F).n20(0.5F, 0.5F)).PL(Wz0.gq(arrayOfUi01[0], 3, 0.75F).n20(f2, (this.U2[paramInt]).y)).PL(Wz0.gq(arrayOfUi01[1], 3, 0.75F).n20(f1, (this.U2[paramInt]).y));
/*    */     } 
/*    */     NC0 nC0;
/*    */     so2.PL(Wz0.gq(arrayOfUi02[0], 8, 0.75F).a(1.0F)).PL(Wz0.gq(arrayOfUi02[0], 6, 0.75F).n20(1.0F, 1.0F)).PL(Wz0.gq(arrayOfUi02[1], 6, 0.75F).n20(1.0F, 1.0F)).PL(Wz0.gq(arrayOfUi02[0], 3, 0.75F).n20((nC0 = this.U2[1]).x, nC0.y + 24.0F)).PL(Wz0.gq(arrayOfUi02[1], 3, 0.75F).n20((nC0 = this.U2[1]).x, nC0.y + 24.0F)).Kr().Kr();
/*    */     so1.Zo0(so2).PL(Wz0.OC((paramInt, paramsh) -> D0.MJ0((short)(this.to0 * 3 + 495)))).Kr();
/*    */     this.Nk0.mg(km.wI0.pB0);
/*    */     return paramInt;
/*    */   }
/*    */   
/*    */   public final void og(boolean paramBoolean) {
/*    */     if (paramBoolean) {
/*    */       int i = UB0.M60.fG0();
/*    */       int j = UB0.M60.dL();
/*    */       ou0.com8(0, 0, i, j);
/*    */     } else {
/*    */       int i = UB0.M60.fG0() / 2;
/*    */       int j = UB0.M60.dL();
/*    */       ou0.com8(0, 0, i, j);
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void LD0(int paramInt1, int paramInt2) {
/*    */     int i;
/*    */     super.LD0(i = paramInt1 / 2, paramInt2);
/*    */     this.Wo.cOM2(paramInt1, paramInt2);
/*    */     this.Wo.G80 = i;
/*    */     this.gz.Wt(UB0.M60.fG0(), UB0.M60.dL(), true);
/*    */     this.gz.UX(true);
/*    */     this.JC.d60(this.gz.VD0);
/*    */   }
/*    */   
/*    */   public final void Ye() {
/*    */     int i = (int)(this.TI0 * 40.0F);
/*    */     switch (this.Tc) {
/*    */       case 3:
/*    */       case 4:
/*    */         if ((i = Math.min(i, 59)) == 0)
/*    */           D0.MJ0((short)(this.to0 * 3 + 495)); 
/*    */         if (i == 59 && this.Tc != 4) {
/*    */           this.Tc = 4;
/*    */           km.u4.lx0(this.z50, (byte)(this.to0 + 1));
/*    */         } 
/*    */         i += vB0[this.to0];
/*    */         break;
/*    */       case 2:
/*    */         i = Math.min(i, 9) + bQ[this.to0];
/*    */         break;
/*    */       case 0:
/*    */       case 1:
/*    */         i = Math.min(i, 40);
/*    */         break;
/*    */     } 
/*    */     float f1 = this.tB0.P3(3, i) / 64.0F, f3 = this.tB0.P3(4, i) / 64.0F, f4 = this.tB0.P3(5, i) / 64.0F, f5 = this.tB0.P3(0, i), f6 = this.tB0.P3(1, i), f2 = this.tB0.P3(2, i);
/*    */     this.vn.Ce0 = 0.1F;
/*    */     this.vn.l6 = 200.0F;
/*    */     this.vn.Bj = 80.0F;
/*    */     this.vn.Mp = 0.0F;
/*    */     this.vn.IG0 = 0.0F;
/*    */     this.vn.yF.TG0(0.0F, 0.0F, -1.0F);
/*    */     this.vn.H.TG0(f1, f3, f4);
/*    */     eo eo;
/*    */     this.vn.nj0.JL(eo = eo.Y);
/*    */     this.vn.Ff(eo.X, f5);
/*    */     this.vn.Ff(this, f6);
/*    */     this.vn.Ff(eo.Z, f2);
/*    */     this.vn.abstract(true);
/*    */     super.Ye();
/*    */   }
/*    */   
/*    */   public final void fu() {
/*    */     this.Wo.wO(true);
/*    */     this.JC.d60(this.gz.VD0);
/*    */     this.JC.getClass();
/*    */     this.JC.Tx();
/*    */     Ui0[] arrayOfUi0;
/*    */     int i = (arrayOfUi0 = this.Rt.YH).length;
/*    */     byte b;
/*    */     for (b = 0; b < i; b++)
/*    */       arrayOfUi0[b].Ne(this.JC); 
/*    */     i = (arrayOfUi0 = this.Rt.qa).length;
/*    */     for (b = 0; b < i; b++)
/*    */       arrayOfUi0[b].Ne(this.JC); 
/*    */     int[] arrayOfInt = jn;
/*    */     i = 3;
/*    */     for (b = 0; b < i; b++) {
/*    */       int j = arrayOfInt[b];
/*    */       this.Rt.Uf[j][1].Ne(this.JC);
/*    */       this.Rt.Uf[j][0].Ne(this.JC);
/*    */     } 
/*    */     this.JC.ot();
/*    */     this.JC.end();
/*    */   }
/*    */   
/*    */   public final void coM4() {
/*    */     String str = Ml0.Qf0(F40.wI, 430, 20);
/*    */     ((new h70(this, this::vm0, null)).Id(this::yE)).sD0 = true;
/*    */     js.vu0.uh((new h70(this, this::vm0, null)).Id(this::yE));
/*    */   }
/*    */   
/*    */   public final void dispose() {
/*    */     super.dispose();
/*    */     this.JC.dispose();
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Rl0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */