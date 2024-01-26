/* 1 */ package f;public final class en0 extends x60 { public final void Da0(String[] paramArrayOfString) { if (paramArrayOfString.length < 2) { km.u4.oD("/seasonoverride <0-3, -1 to disable>", ZY.ih); return; }  try { L70.gq
/* 2 */         .kX(Byte.parseByte(paramArrayOfString[1])); gb[] arrayOfGb;
/*   */       int i;
/*   */       byte b;
/* 5 */       for (i = (arrayOfGb = (gb[])km.mI0.AN.YP.Z6).length, b = 0; b < i; ) { this[b].Lj0(); b++; }
/* 6 */        Xi xi; if ((xi = km.wI0.iJ0) != null)
/* 7 */         AP();  return; } catch (NumberFormatException numberFormatException) { km.u4.oD("/seasonoverride <0-3, -1 to disable>", ZY.ih);
/*   */       return; }
/*   */      }
/*   */ 
/*   */   
/*   */   public en0() {
/*   */     super("/seasonoverride");
/*   */   }
/*   */   
/*   */   public final int Gs0() {
/*   */     return 8;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/en0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */