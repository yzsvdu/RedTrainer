/* 1 */ package f;public final class zT extends zA implements er { public final void Hr0(int paramInt) { if (this.hk != paramInt) { this.hk = paramInt; hm.Fz0(this.kG0); }
/*   */      }
/*   */ 
/*   */   
/*   */   public int Lpt3;
/*   */   public int lK;
/*   */   public int hk;
/*   */   
/*   */   public zT(int paramInt1, int paramInt2, int paramInt3) {
/*   */     if (paramInt2 >= paramInt1) {
/*   */       this.Lpt3 = paramInt1;
/*   */       this.lK = paramInt2;
/*   */       this.hk = paramInt3;
/*   */       return;
/*   */     } 
/*   */     throw new IllegalArgumentException("maxValue < minValue");
/*   */   }
/*   */   
/*   */   public final int cB0() {
/*   */     return this.lK;
/*   */   }
/*   */   
/*   */   public final int NC0() {
/*   */     return this.Lpt3;
/*   */   }
/*   */   
/*   */   public final int getValue() {
/*   */     return this.hk;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/zT.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */