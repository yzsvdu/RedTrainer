/* 1 */ package f;public final class Ml extends x60 { public final void Da0(String[] paramArrayOfString) { if (paramArrayOfString.length < 2) { km.u4.oD("/dialogtest <string_id>", ZY.ih); return; }  try { String str = qf0.Sz(Integer.parseInt(paramArrayOfString[1]), qf0.Qb0);
/* 2 */       if (km.MR != null)
/* 3 */       { km.wI0.K7
/* 4 */           .LW
/* 5 */           .Kq(this); } else { km.kH0.jN(this); }  return; } catch (NumberFormatException numberFormatException) { km.u4.oD("/dialogtest <string_id>", ZY.ih);
/*   */       return; }
/*   */      }
/*   */ 
/*   */   
/*   */   public Ml() {
/*   */     super("/dialogtest");
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ml.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */