/*  1 */ package f;public final class Cx extends me { public Y00 OR; public K70 Lk; public wI0 nt; public lpt1 k8; public lpt1 ue0; public ZH we0; public Texture Iy; public Cx(xV paramxV, wI0 paramwI0) { super(paramxV); this.nt = paramwI0; this.k8 = zp0.vY().n60(); Uc uc = Uc.eJ0; (this.we0 = new ZH(4, 4, uc)).Re(1.0F, 1.0F, 1.0F, 0.95F); this.we0.gc(); this.Iy = new Texture(this.we0); ((O80)((T0)this.k8.xl0.get(0)).ct0(O80.Jg0)).ID(new pe0(this.Iy)); } public final void Gv0(fo0 paramfo0, K70 paramK70, Ih0 paramIh0) { if (this.OR == null) { K70 k70; X3 x3; lt lt; Y00 y001 = new Y00(); Uc uc = Uc.xi0; int k, m; if ((k = UB0.M60.fG0()) > (m = I20.qa)) k = m;  int n;
/*  2 */       if ((m = UB0.M60.dL()) > (
/*  3 */         n = I20.qa)) m = n; 
/*  4 */       this(uc, k, m, true); this.OR = y001; this(); this(); this(x3, lt); this.Lk = k70; }  Y00 y00 = this.OR;
/*  5 */     UB0.re0
/*    */       
/*  7 */       .glBindFramebuffer(36160, y00.EE0);
/*  8 */     int i = y00.E80.rS, j = y00.E80.Z; UB0.re0.glViewport(0, 0, i, j);
/*  9 */     UB0.go.glClearColor(0.0F, 0.0F, 0.0F, 0.016666668F); UB0.go.glClear(16640); this.Lk.mx0(paramIh0); for (Iterator<tc> iterator = km.a3.iterator(); iterator.hasNext(); Dg0(iterator.next()));
/*    */     
/* 11 */     Dg0(km.a3.Ct); this.Lk.end(); this.OR.end(); Texture texture;
/* 12 */     if ((texture = this.nt.vF0) == null || texture != this
/* 13 */       .OR.P10()) this.nt
/* 14 */         .vF0 = (Texture)this.OR.P10();  super
/* 15 */       .Gv0(paramfo0, paramK70, paramIh0); } public final void Dg0(tc paramtc) { float f2; eo eo = (paramtc.default()).lpt8; lpt1 lpt11; (lpt11 = this.k8).mh.WU(); this.k8.mh.Ri0(eo); this.k8.mh.g7(0.0F, -0.25F, 0.0F); byte b; int i, j; byte b1; for (b = paramtc.HW.g50, i = 0, j = 0, b1 = 1; b1 < 5; ) { i = paramtc.HW.mm; j = paramtc.HW.Yu0; switch (b) { case 3: i += b1; break;case 2: i -= b1; break;case 1: j -= b1; break;
/* 16 */         case 0: j += b1; break; }  xr0 xr0; if ((xr0 = km.a3.Jr0().v50(i, j, paramtc.HW.Qf0)) != null && !xr0.T9() && !km.a3.bk(paramtc.HW.Qf0, xr0)) { if (paramtc.zl()) { boolean bool; byte b2 = paramtc.HW.Qf0; Jo jo;
/* 17 */           if ((jo = km.a3.Ct) == null) { bool = false; }
/* 18 */           else { bool = jo.jC(b2, bool); }  if (bool) break;  }  b1++; }  }  float f1 = 1.0F; switch (b) { case 3:
/* 19 */         f1 = i * 0.25F - eo.x; break;case 2: f1 = eo.x - (i + 1) * 0.25F; break;case 1: f1 = eo.z - (j + 1) * 0.25F; break;case 0: f1 = j * 0.25F - eo.z; break; }  f1 = Math.min(f1, 0.75F); switch (b) { case 3: lpt11.mh.g7(f1 + 0.1F, 0.0F, 0.0F); lpt11.mh.N8(eo.Z, 90.0F); lpt11.mh.N8(eo.Y, 15.0F); lpt11.mh.GJ(0.75F, f1, 0.75F); break;case 2: lpt11.mh.g7(-f1 - 0.1F, 0.0F, 0.0F); lpt11.mh.N8(eo.Z, -90.0F); lpt11.mh.N8(eo.Y, 270.0F); lpt11.mh.GJ(0.75F, f1, 0.75F); break;case 1: f2 = -f1 - 0.2F; lpt11.mh.g7(0.0F, -0.1F, f2); lpt11.mh.N8(eo.X, 90.0F); lpt11.mh.N8(eo.Y, 180.0F); lpt11.mh.GJ(0.75F, f1, 0.75F); break;case 0: lpt11.mh.g7(0.0F, 0.0F, f1); lpt11.mh.N8(eo.X, -90.0F); lpt11.mh.N8(eo.Y, 180.0F); lpt11.mh.GJ(0.75F, f1, 0.75F); break; }  this.Lk.tx0(lpt11); }
/*    */ 
/*    */   
/*    */   public final void dispose() {
/*    */     super.dispose();
/*    */     this.Lk.dispose();
/*    */     this.OR.dispose();
/*    */     this.nt.vF0 = null;
/*    */     this.we0.dispose();
/*    */     this.Iy.dispose();
/*    */   }
/*    */   
/*    */   public final void Ad0(short[] paramArrayOfshort) {
/*    */     if (paramArrayOfshort.length < 1)
/*    */       return; 
/*    */     if (paramArrayOfshort[0] == 4465) {
/*    */       lpt1 lpt12;
/*    */       if ((lpt12 = this.ue0) != null) {
/*    */         lpt12.Ea0();
/*    */         lpt12 = this.ue0;
/*    */         this.UH.Ct(lpt12, true);
/*    */       } 
/*    */       short s1 = paramArrayOfshort[1], s2 = paramArrayOfshort[2], s3 = paramArrayOfshort[3];
/*    */       zp0.vY().getClass();
/*    */       eI eI = eI.Lj();
/*    */       s1 += 116;
/*    */       int[] arrayOfInt = new int[0];
/*    */       eI.getClass();
/*    */       lpt1 lpt11 = eI.L4((zp0.vY()).A6[3], s1, arrayOfInt);
/*    */       this.mh.bb0(s2 * 0.25F + 0.125F, 0.0F, s3 * 0.25F);
/*    */       this.ue0.kg0();
/*    */       kc(this.ue0);
/*    */     } 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Cx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */