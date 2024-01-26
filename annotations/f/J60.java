/* 1 */ package f;public final class J60 extends rh { public final String jw() { if (this.T8 < 1) {
/* 2 */       return Ml0.OH0(1265);
/*   */     }
/* 4 */     return Integer.toString((int)Math.pow(2.0D, this.T8)) + "x"; }
/*   */ 
/*   */   
/*   */   public J60(zT paramzT) {
/*   */     super(paramzT);
/*   */   }
/*   */   
/*   */   public final boolean UX(String paramString) {
/*   */     try {
/*   */       l4((int)Math.round(Math.sqrt(Integer.parseInt(paramString.replaceAll("x", "")))));
/*   */       return true;
/*   */     } catch (NumberFormatException numberFormatException) {
/*   */       return false;
/*   */     } 
/*   */   }
/*   */   
/*   */   public final String I40(String paramString) {
/*   */     return super.I40(paramString.replaceAll("x", ""));
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/J60.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */