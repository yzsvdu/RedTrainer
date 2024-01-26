/* 1 */ package f;public final class Ok { public final String toString() { int i; if ((i = this.hW) == 6) return FJ.BE0(i); 
/* 2 */     return this.QK0 + 
/* 3 */       FJ.BE0(this.hW); }
/*   */ 
/*   */   
/*   */   public static final Ok qu0 = new Ok(0.0F, 1);
/*   */   public static final Ok U00 = new Ok(0.0F, 6);
/*   */   public final float QK0;
/*   */   public final int hW;
/*   */   
/*   */   public Ok(float paramFloat, int paramInt) {
/*   */     this.QK0 = paramFloat;
/*   */     this.hW = paramInt;
/*   */     if (paramInt != 0) {
/*   */       if (paramInt != 6 || paramFloat == 0.0F)
/*   */         return; 
/*   */       throw new IllegalArgumentException("value must be 0 for Unit.AUTO");
/*   */     } 
/*   */     throw new NullPointerException("unit");
/*   */   }
/*   */   
/*   */   public final boolean equals(Object paramObject) {
/*   */     if (paramObject instanceof Ok) {
/*   */       paramObject = paramObject;
/*   */       return (this.QK0 == ((Ok)paramObject).QK0 && this.hW == ((Ok)paramObject).hW);
/*   */     } 
/*   */     return false;
/*   */   }
/*   */   
/*   */   public final int hashCode() {
/*   */     int i = (Float.floatToIntBits(this.QK0) + 51) * 17;
/*   */     return Zk0.yE(this.hW) + i;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ok.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */