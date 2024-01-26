/* 1 */ package f;public final class iU { public final void aD0(s40 params40) { if (params40.in() != 0) return;  params40.pr();
/* 2 */     int i = params40.wJ.nz(uq.Km);
/*   */     
/* 4 */     int j = params40.wJ.nz(uq.H60); int k; byte b2;
/*   */     zh0[] arrayOfZh03;
/* 6 */     for (k = params40.wJ.nz(uq.bO), this.KZ = new U70(new FS(params40, i, j)), this.LY = new U70(new ol0(params40, i, j)), this.K3 = new zh0[6], b2 = 0; b2 < (arrayOfZh03 = this.K3).length; ) { zh0 zh01; U70 u701 = this.LY; int m = b2 * 32; this(u701, 0, m, 16, 32); arrayOfZh03[b2] = zh01; b2++; }  zh0[] arrayOfZh02; for (this.O50 = new U70(new lE0(params40, i, k)), this.kB = new U70(new Nx(params40, i, j)), this.zk0 = new zh0[2], k = 0; k < (arrayOfZh02 = this.zk0).length; ) { zh0 zh01; U70 u701 = this.kB; int m = k * 64; this(u701, 0, m, 64, 64); arrayOfZh02[k] = zh01; k++; }  this(new Xs(params40, i, j)); U70 u70; byte b1; zh0[] arrayOfZh01; for (this.cA0 = new zh0[4], b1 = 0; b1 < (arrayOfZh01 = this.cA0).length; ) { zh0 zh01; j = b1 * 8; this(u70, 0, j, 8, 8); arrayOfZh01[b1] = zh01; b1++; }
/*   */      }
/*   */ 
/*   */   
/*   */   public static iU uN;
/*   */   public U70 KZ = null;
/*   */   public U70 LY = null;
/*   */   public zh0[] K3 = null;
/*   */   public U70 O50 = null;
/*   */   public U70 kB = null;
/*   */   public zh0[] zk0 = null;
/*   */   public zh0[] cA0 = null;
/*   */   
/*   */   public static iU mH() {
/*   */     if (uN == null)
/*   */       uN = new iU(); 
/*   */     return uN;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/iU.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */