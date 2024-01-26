/* 1 */ package f;public final class bc extends jg { public final void Ej0(float paramFloat) { paramFloat = Bk0(paramFloat); if (this.En0 != paramFloat) { this.En0 = paramFloat; hm.Fz0(this.kG0); }
/*   */      }
/*   */ 
/*   */   
/*   */   public final float DD0;
/*   */   public final float hq;
/*   */   public float En0;
/*   */   
/*   */   public bc() {
/*   */     if (!Float.isNaN(f1)) {
/*   */       if (!Float.isNaN(f2)) {
/*   */         this.DD0 = f1;
/*   */         this.hq = f2;
/*   */         this.En0 = Bk0(f3);
/*   */         return;
/*   */       } 
/*   */       throw new IllegalArgumentException("maxValue is NaN");
/*   */     } 
/*   */     throw new IllegalArgumentException("minValue is NaN");
/*   */   }
/*   */   
/*   */   public final float dN() {
/*   */     return this.hq;
/*   */   }
/*   */   
/*   */   public final float Ru() {
/*   */     return this.DD0;
/*   */   }
/*   */   
/*   */   public final float SE() {
/*   */     return this.En0;
/*   */   }
/*   */   
/*   */   public final float Bk0(float paramFloat) {
/*   */     return Float.isNaN(paramFloat) ? this.DD0 : Math.max(this.DD0, Math.min(this.hq, paramFloat));
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/bc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */