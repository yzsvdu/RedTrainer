/* 1 */ package f;public final class ao { public static void ZB(int paramInt1, int paramInt2, int paramInt3, int paramInt4) { boolean bool = false; String str = ""; if (paramInt4 < 0 || paramInt4 > 255) { bool = true; str = m0.tF0(str, " Alpha"); }  if (paramInt1 < 0 || paramInt1 > 255) { bool = true;
/* 2 */       str = m0.tF0(str, " Red"); }  if (paramInt2 < 0 || paramInt2 > 255) { bool = true;
/* 3 */       str = m0.tF0(str, " Green"); }  if (paramInt3 < 0 || paramInt3 > 255) { bool = true;
/* 4 */       str = m0.tF0(str, " Blue"); }  if (bool != true)
/* 5 */       return;  throw new IllegalArgumentException(
/* 6 */         m0.tF0("Color parameter outside of expected range:", str)); }
/*   */ 
/*   */   
/*   */   public int O6;
/*   */   
/*   */   public ao(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*   */     this.O6 = (paramInt4 & 0xFF) << 24 | (paramInt1 & 0xFF) << 16 | (paramInt2 & 0xFF) << 8 | (paramInt3 & 0xFF) << 0;
/*   */     ZB(paramInt1, paramInt2, paramInt3, paramInt4);
/*   */   }
/*   */   
/*   */   public final int k90() {
/*   */     return this.O6 >> 16 & 0xFF;
/*   */   }
/*   */   
/*   */   public final int Mv() {
/*   */     return this.O6 >> 8 & 0xFF;
/*   */   }
/*   */   
/*   */   public final int jz() {
/*   */     return this.O6 >> 0 & 0xFF;
/*   */   }
/*   */   
/*   */   public final int Jt() {
/*   */     return this.O6;
/*   */   }
/*   */   
/*   */   public final int hashCode() {
/*   */     return this.O6;
/*   */   }
/*   */   
/*   */   public final boolean equals(Object paramObject) {
/*   */     return (paramObject instanceof ao && ((ao)paramObject).O6 == this.O6);
/*   */   }
/*   */   
/*   */   public final String toString() {
/*   */     return ao.class.getSimpleName() + "[r=" + k90() + ",g=" + Mv() + ",b=" + jz() + "]";
/*   */   }
/*   */   
/*   */   public final ao iF(int paramInt) {
/*   */     if (paramInt > 255)
/*   */       paramInt = 255; 
/*   */     if (paramInt < 0)
/*   */       paramInt = 0; 
/*   */     float f2 = paramInt / 255.0F, f1 = (1.0F - f2) * 255.0F;
/*   */     int j = (int)(f2 * k90() + f1), k = (int)(f2 * Mv() + f1), i = (int)(f2 * jz() + f1);
/*   */     return new ao(j, k, i, 255);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ao.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */