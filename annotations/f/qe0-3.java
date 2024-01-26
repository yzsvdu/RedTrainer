/*   */ package f;public final class qe0 extends xk { public final void tZ(K70 paramK70, fo0 paramfo0, Ih0 paramIh0, float paramFloat1, float paramFloat2, float paramFloat3) { eo eo2;
/* 2 */     LJ lJ = G00.Av0.Cx0((byte)10, 303, false);
/*   */     int i;
/* 4 */     if ((i = (int)((zm0.u20 - this.nc) / 75L)) < 0) { i = 0; } else if (i > 5) { i = 5; }  float f2 = 0.0F, f3 = 0.015F; if (this.fg0 == 4) { f2 = 0.01F; f3 = 0.1F; }  uT uT1; if ((uT1 = this.GD0) != null) { pe0 pe01 = lJ.LT(i).Ql0().Uu0(); uT1
/* 5 */         .RC
/* 6 */         .ID(this);
/* 7 */       this.GD0.lM(false); this.GD0.zO(0.1875F); float f = paramFloat2 + 0.05F + f2; this.GD0.WQ(paramFloat1, f, paramFloat3 + 0.0225F + f3); eo2 = paramIh0.H; this.GD0.si(this, paramIh0.nj0); paramK70.q10(this.GD0, paramfo0); return; }  pe0 pe0 = lJ.LT(i).Ql0().Uu0(); (((qe0)super).GD0 = uT.xz(1, 1, pe0)).zO(0.1875F); ((qe0)super).GD0.lM(false); float f1 = paramFloat2 + 0.05F + f2; ((qe0)super).GD0.WQ(paramFloat1, f1, paramFloat3 + 0.0225F + f3); eo eo1 = paramIh0.H; ((qe0)super).GD0.si(this, paramIh0.nj0); }
/*   */ 
/*   */   
/*   */   public final long nc = zm0.zg();
/*   */   public final byte fg0;
/*   */   public uT GD0;
/*   */   
/*   */   public qe0(byte paramByte) {
/*   */     this.fg0 = paramByte;
/*   */   }
/*   */   
/*   */   public final boolean i2() {
/*   */     return (zm0.u20 - this.nc > 450L);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/qe0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */