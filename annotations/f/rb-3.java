/* 1 */ package f;public final class rb extends eD0 { public final int mt(int paramInt1, int paramInt2) { db db; if (paramInt2 >= 0) return paramInt2;  switch (paramInt2) { default: throw new IllegalArgumentException(XD0.SD0("Invalid gap size: ", paramInt2));
/* 2 */       case -1: db = this.TJ.cp0; break;case -2: db = ((rb)super).TJ.uR; break;case -3: db = ((rb)super).TJ.qA0; break;case -4: db = ((rb)super).TJ.lu0; break; }  if (this == null) return 0;  if (paramInt1 == 0)
/* 3 */       return this.PO; 
/* 4 */     return this.bJ0; }
/*   */ 
/*   */   
/*   */   public final int j7;
/*   */   public final int xN;
/*   */   public final int sb0;
/*   */   public final boolean Bm0;
/*   */   
/*   */   public rb(Ip paramIp, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
/*   */     mt(0, paramInt1);
/*   */     mt(0, paramInt2);
/*   */     mt(0, paramInt3);
/*   */     this.j7 = paramInt1;
/*   */     this.xN = paramInt2;
/*   */     this.sb0 = paramInt3;
/*   */     this.Bm0 = paramBoolean;
/*   */   }
/*   */   
/*   */   public final int iD(int paramInt) {
/*   */     return mt(paramInt, this.j7);
/*   */   }
/*   */   
/*   */   public final int fV(int paramInt) {
/*   */     return mt(paramInt, this.xN);
/*   */   }
/*   */   
/*   */   public final int Ab0(int paramInt) {
/*   */     return mt(paramInt, this.sb0);
/*   */   }
/*   */   
/*   */   public final void bO(int paramInt1, int paramInt2, int paramInt3) {} }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/rb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */