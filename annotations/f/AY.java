/* 1 */ package f;public final class AY extends yp0 { public final void wL() { if (!this.eQ) { this.UB = System.currentTimeMillis(); byte b = 6; char c = '´'; mi mi; (mi = this.vy0.Ob0)
/* 2 */         .vv0 = true;
/* 3 */       A1.L7
/* 4 */         .ac0(new Xp0(this, c, b), 20L);
/* 5 */       this.eQ = true; }
/*   */      }
/*   */ 
/*   */   
/*   */   public long UB = System.currentTimeMillis();
/*   */   public hm0 vy0;
/*   */   public boolean eQ = false;
/*   */   
/*   */   public AY(hm0 paramhm0) {
/*   */     this.vy0 = paramhm0;
/*   */   }
/*   */   
/*   */   public final boolean Ie() {
/*   */     return (this.eQ && System.currentTimeMillis() - this.UB > 1250L);
/*   */   }
/*   */   
/*   */   public final int zE() {
/*   */     return 7;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/AY.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */