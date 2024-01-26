/*   */ package f;public final class Qt extends l3 { public final int com5(J80 paramJ801, J80 paramJ802) { byte b2; byte b4; byte b1;
/* 2 */     if ((b1 = paramJ801.WV.Jp0) == 0 || b1 == 101) { b2 = 100; } else { b2 = b1; }
/*   */      byte b3;
/* 4 */     if ((b3 = paramJ802.WV.Jp0) == 0 || b3 == 101) { b4 = 100; } else { b4 = b3; }  if (b2 != b4) { if (b1 == 0 || b1 == 101) b1 = 100;  if (b3 == 0 || b3 == 101) b3 = 100;  return b1 - b3; }
/* 5 */      return paramJ801.GB0().compareTo(paramJ802.GB0()); }
/*   */ 
/*   */   
/*   */   public static final Qt s90 = new Qt(); }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Qt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */