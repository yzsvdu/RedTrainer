/* 1 */ package f;public final class Ph extends x60 { public final void Da0(String[] paramArrayOfString) { if (paramArrayOfString.length < 2) { km.u4.oD("/timeoverride <hour>", ZY.ih); return; }  try { byte b = Byte.parseByte(paramArrayOfString[1]); L70.gq
/* 2 */         .Uv0 = b;
/* 3 */       L70.gq.oh0
/* 4 */         .jn0 = 0L; return; } catch (NumberFormatException numberFormatException)
/* 5 */     { km.u4.oD("/timeoverride <hour>", ZY.ih);
/*   */       return; }
/*   */      }
/*   */ 
/*   */   
/*   */   public Ph() {
/*   */     super("/timeoverride");
/*   */   }
/*   */   
/*   */   public final int Gs0() {
/*   */     return 8;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ph.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */