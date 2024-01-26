/* 1 */ package f;public abstract class iz0 extends Fp { public final JG0 AU; public boolean z9 = true; public boolean lPT4 = true; public boolean jv() { throws throws; if ((throws = this.AU.Bo0) != null)
/* 2 */     { boolean bool; wI0(true); sk0(true); throws.uz(this); BA(); Ev0();
/* 3 */       if (this.fr0 != null) { bool = true; } else { bool = false; }  return bool; }  return false; }
/* 4 */   public Runnable es0; public iz0(JG0 paramJG0) { if (paramJG0 != null) { this.AU = paramJG0; return; }  throw new NullPointerException("owner"); } public String TI() { return "popupwindow"; } public void tp0() { throws throws; if ((throws = this.Bo0) != null) { throws.Kc(this); this.AU.BA(); }  } public final boolean i2(oa0 paramoa0) { Runnable runnable; if (sR(paramoa0)) return true;  int i = paramoa0.aK; if (paramoa0.cz0 == 5 && !mu0(i, paramoa0.gk0)) { if (this
/* 5 */         .z9)
/* 6 */         if ((runnable = this.es0) != null) { runnable.run(); } else { tp0(); }   return true; }  if (runnable
/* 7 */       .oO() && ((oa0)runnable)
/* 8 */       .GG0 == 111)
/* 9 */     { Ga0(); return true; }  return true; }
/*   */ 
/*   */   
/*   */   public final int J50() {
/*   */     JG0 jG0;
/*   */     return Math.min(((jG0 = this.fr0) != null) ? jG0.qF() : 32767, super.J50());
/*   */   }
/*   */   
/*   */   public final int tj0() {
/*   */     JG0 jG0;
/*   */     return Math.min(((jG0 = this.fr0) != null) ? jG0.Hy() : 32767, super.tj0());
/*   */   }
/*   */   
/*   */   public boolean sR(oa0 paramoa0) {
/*   */     return super.i2(paramoa0);
/*   */   }
/*   */   
/*   */   public final boolean yw0(oa0 paramoa0) {
/*   */     return true;
/*   */   }
/*   */   
/*   */   public void Ga0() {
/*   */     if (this.lPT4) {
/*   */       Runnable runnable;
/*   */       if ((runnable = this.es0) != null) {
/*   */         runnable.run();
/*   */       } else {
/*   */         tp0();
/*   */       } 
/*   */     } 
/*   */   }
/*   */   
/*   */   public final void lX(JG0 paramJG0) {
/*   */     if (paramJG0 instanceof throws) {
/*   */       this.fr0 = paramJG0;
/*   */       return;
/*   */     } 
/*   */     throw new IllegalArgumentException("PopupWindow can't be used as child widget");
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/iz0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */