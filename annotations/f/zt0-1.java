/*  1 */ package f;public final class zt0 extends me { public Y00 GH; public K70 Lpt5; public wI0 X0; public final void Gv0(fo0 paramfo0, K70 paramK70, Ih0 paramIh0) { if (this.GH != null && UB0.PU.j2(135)) { this.GH.dispose(); this.Lpt5.dispose(); this.GH = null; }  if (this.GH == null) { int k = (int)paramIh0.gV; this.GH = new Y00(Uc.xi0, k, (int)paramIh0.oA, true);
/*  2 */       String str1 = Uu.Cw.resolve("invert.fragment.glsl").QM(null);
/*    */       
/*  4 */       String str2 = Uu.Cw.resolve("default.vertex.glsl").QM(null);
/*  5 */       this.Lpt5 = new K70(new X3(str2, str1), new lt()); }  Y00 y00 = this.GH;
/*  6 */     UB0.re0
/*    */       
/*  8 */       .glBindFramebuffer(36160, y00.EE0);
/*  9 */     int i = y00.E80.rS, j = y00.E80.Z; UB0.re0.glViewport(0, 0, i, j);
/* 10 */     UB0.go.glClearColor(0.0F, 0.0F, 0.0F, 0.0F); UB0.go.glClear(16640); this.Lpt5.mx0(paramIh0); for (Hc0 hc0 = this.Zn.r30(); hc0.hasNext(); ) { lpt1 lpt1 = (lpt1)hc0.next(); this.Lpt5.tx0(lpt1); }  qA0 qA0; (qA0 = this.hQ.iC()).getClass(); while (qA0.hasNext()) { Il0 il0; if ((il0 = (Il0)qA0.next()).oK != 2) this.Lpt5.tx0(il0.sI0);  }  this.Lpt5.end(); this.GH.end(); Texture texture;
/* 11 */     if ((texture = this.X0.vF0) == null || texture != this
/* 12 */       .GH.P10()) { this.X0
/* 13 */         .Xe0 = 0.035F;
/* 14 */       this.X0.mE0
/* 15 */         .x = 0.5F;
/* 16 */       this.X0.mE0.y = 0.425F;
/*    */       
/* 18 */       this.X0.vF0 = (Texture)this.GH.P10(); }  } public fQ Zn; public eM hQ = new eM(); public boolean for = false; public zt0(hB0 paramhB0, wI0 paramwI0) { super(paramhB0); this.X0 = paramwI0; this.Zn = new fQ(6); eI.Lj().getClass(); lpt1.mh.bb0(2.625F, -0.2F, 2.875F); eo eo; lpt1.mh.N8(eo = eo.X, -75.0F); lpt1.Yr0 = false; lpt1.k = 0.66F; lpt1.ml0(0, true); this.Zn.Com3(lpt1); lpt1 lpt1; kc(lpt1 = eI.Yp0((byte)4, 124, false)); eI.Lj().getClass(); lpt1.mh.bb0(4.125F, -0.2F, 13.125F); lpt1.mh.N8(eo, -75.0F); lpt1.Yr0 = false; lpt1.k = 0.66F; lpt1.ml0(0, true); this.Zn.Com3(lpt1); kc(lpt1 = eI.Yp0((byte)4, 125, false)); } public final void Ic0(float paramFloat) { for (Hc0 hc0 = this.Zn.r30(); hc0.hasNext(); ((lpt1)hc0.next()).wP(paramFloat)); qA0 qA0; (qA0 = this.hQ.iC()).getClass(); for (; qA0.hasNext(); ((Il0)qA0.next()).sI0.wP(paramFloat)); for (Iterator<tc> iterator = km.a3.iterator(); iterator.hasNext();) { if (tc = iterator.next() instanceof Kr0 && tc.D4() == 219) { tc = tc; Il0 il0; if ((il0 = (Il0)this.hQ.MF(Integer.valueOf(tc.Jg), null)) == null) { Il0 il01; eI.Lj().getClass(); lpt1 lpt1; (lpt1 = eI.Yp0((byte)4, 126, false)).Yr0 = false; (eI.Yp0((byte)4, 126, false)).k = 0.66F; eI.Yp0((byte)4, 126, false).rd(0, true, null); eI.Yp0((byte)4, 126, false).C50(); this.UH.Com3(lpt1); this(lpt1); this.hQ.Ed0(Integer.valueOf(tc.Jg), il01); il0 = il01; }  if (this.for && il0.oK == 2) il0.oK = 3;  if (((Kr0)tc).R3 == -1 && il0.oK == 1 && km.wI0.K7 != null) il0.oK = 2;  eo eo = tc.Y1.lpt8; il0.sI0.mh.gv0(eo.x, -0.5F, eo.z + 0.75F); il0.sI0.mh.N8(eo.X, -75.0F); }  }  this
/* 19 */       .for = false; super.Ic0(paramFloat); }
/*    */ 
/*    */   
/*    */   public final void dispose() {
/*    */     super.dispose();
/*    */     this.Lpt5.dispose();
/*    */     this.GH.dispose();
/*    */     this.X0.Xe0 = 0.045F;
/*    */     this.X0.mE0.x = 0.5F;
/*    */     this.X0.mE0.y = 0.5F;
/*    */     this.X0.vF0 = null;
/*    */   }
/*    */   
/*    */   public final void Ad0(short[] paramArrayOfshort) {
/*    */     if (paramArrayOfshort.length < 1)
/*    */       return; 
/*    */     if (paramArrayOfshort[0] == 4707)
/*    */       this.for = true; 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/zt0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */