/* 1 */ package f;public final class In extends xk { public final void tZ(K70 paramK70, fo0 paramfo0, Ih0 paramIh0, float paramFloat1, float paramFloat2, float paramFloat3) { pe0 pe0, arrayOfPe02[]; if (zm0.u20 - this
/* 2 */       .EJ < (this.LPt8 + this.Un0)) return;  if (this.R8 != null) { paramFloat1 = paramFloat2 + 0.25F; eo eo2; (eo2 = XU).TG0(paramFloat1, paramFloat1, paramFloat3 + 0.065F).zT(Xi.z6); this.R8.si(eo2, paramIh0.nj0);
/*   */       
/* 4 */       float f = this.E7 + UB0.M60.Qy;
/* 5 */       pe0 = (pe0)this.wd0.Hf(f); this.R8
/* 6 */         .RC
/* 7 */         .ID(this);
/* 8 */       paramK70.q10(this.R8, paramfo0); return; }  byte b = ((In)super).F90; pe0[] arrayOfPe01; (((In)super).R8 = uT.AM((arrayOfPe01 = zp0.vY().mF0(((In)super).YH, b))[0])).lM(Xi.WB); if (((In)super).F90 == 2) { ((In)super).R8.zO(0.012F); float f = paramFloat2 + 0.25F; paramFloat2 = paramFloat3 + 0.065F; ((In)super).R8.WQ(paramFloat1, f, paramFloat2); XU.TG0(paramFloat1, f, paramFloat2).zT(Xi.z6); } else { ((In)super).R8.zO(0.014F); float f = paramFloat2 + 0.25F; paramFloat2 = paramFloat3 + 0.143F; ((In)super).R8.WQ(paramFloat1, f, paramFloat2); XU.TG0(paramFloat1, f, paramFloat2).zT(Xi.z6); }  eo eo1 = XU; ((In)super).R8.si(eo1, paramIh0.nj0); if (((In)super).Un0 > 0) { arrayOfPe02[0] = arrayOfPe01[0]; arrayOfPe02[1] = arrayOfPe01[1]; arrayOfPe02[2] = arrayOfPe01[0]; (arrayOfPe02 = new pe0[4])[3] = arrayOfPe01[1]; } else { arrayOfPe02[0] = arrayOfPe01[0]; arrayOfPe02[1] = arrayOfPe01[1]; arrayOfPe02[2] = arrayOfPe01[0]; (arrayOfPe02 = new pe0[4])[3] = arrayOfPe01[1]; }  if (((In)super).wd0 == null) (((In)super).wd0 = new R30(0.075F, (Object[])arrayOfPe02))
/* 9 */         .sI = Qb.Oe;  }
/*   */ 
/*   */   
/*   */   public static final eo XU = new eo();
/*   */   public final long EJ = zm0.zg();
/*   */   public final int Un0;
/*   */   public final int LPt8;
/*   */   public final int YH;
/*   */   public R30 wd0;
/*   */   public uT R8;
/*   */   public float E7;
/*   */   public byte F90;
/*   */   
/*   */   public In(byte paramByte, int paramInt1, int paramInt2, int paramInt3) {
/*   */     this.F90 = paramByte;
/*   */     this.Un0 = paramInt1;
/*   */     this.LPt8 = paramInt2;
/*   */     this.YH = paramInt3;
/*   */   }
/*   */   
/*   */   public final boolean i2() {
/*   */     R30 r30;
/*   */     if ((r30 = this.wd0) == null)
/*   */       return false; 
/*   */     int i = (int)(this.E7 / r30.aB);
/*   */     if (r30.Bs.length - 1 < i) {
/*   */       i = 1;
/*   */     } else {
/*   */       i = 0;
/*   */     } 
/*   */     return i;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/In.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */