/* 1 */ package f;public final class AT { public final void rd(int paramInt1, int paramInt2) { if (this.eo0 == 2) { paramInt2 = this.kJ + paramInt2; if ((paramInt1 = this.mr + paramInt1) < 0) { paramInt1 = 2; } else if (paramInt1 > 2) { paramInt1 = 0; }  if (paramInt2 < 0) { paramInt2 = 1; } else if (paramInt2 > 1) { paramInt2 = 0; }  if (paramInt1 == 2) paramInt2 = 1;  this.mr = paramInt1; this.kJ = paramInt2; }
/* 2 */     else { fb0(this.lPt2 + paramInt1, this.MR + paramInt2); }
/*   */      }
/*   */ 
/*   */   
/*   */   public int qZ = 1;
/*   */   public int s3 = 0;
/*   */   public int lPt2 = 0;
/*   */   public int MR = 0;
/*   */   public int mr = 0;
/*   */   public int kJ = 0;
/*   */   public int eo0 = 0;
/*   */   public int Ox = 0;
/*   */   public wq0 Nl0 = new wq0(1, this);
/*   */   public e2 zc0 = (new e2(60000)).T30();
/*   */   
/*   */   public final void fb0(int paramInt1, int paramInt2) {
/*   */     if (this.Nl0.bq0())
/*   */       return; 
/*   */     if (paramInt1 < 0) {
/*   */       paramInt1 = 4;
/*   */     } else if (paramInt1 > 4) {
/*   */       paramInt1 = 0;
/*   */     } 
/*   */     if (paramInt2 < 0) {
/*   */       paramInt2 = 5;
/*   */     } else if (paramInt2 > 5) {
/*   */       paramInt2 = 0;
/*   */     } 
/*   */     if ((paramInt2 == 5 && (this.MR != 5 || this.eo0 != 0)) || (paramInt2 == 5 && paramInt1 > 1))
/*   */       paramInt1 = 0; 
/*   */     this.lPt2 = paramInt1;
/*   */     this.MR = paramInt2;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/AT.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */