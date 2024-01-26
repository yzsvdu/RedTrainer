/* 1 */ package f;public final class dC0 extends x60 { public final void Da0(String[] paramArrayOfString) { if (paramArrayOfString.length < 2) { vh0.H90 = -1; return; }  Jo jo; if ((jo = km.a3.et(paramArrayOfString[1])) != null)
/* 2 */     { vh0.H90 = this.Jg; return; }  try { vh0.H90 = Integer.parseInt(paramArrayOfString[1]); return; } catch (NumberFormatException numberFormatException) { km.u4.oD("/highlight <id or name>", ZY.ih);
/*   */       return; }
/*   */      }
/*   */ 
/*   */   
/*   */   public dC0() {
/*   */     super("//highlight");
/*   */   }
/*   */   
/*   */   public final int Gs0() {
/*   */     return 5;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/dC0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */