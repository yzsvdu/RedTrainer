/* 1 */ package f;public final class u6 extends H00 { public final boolean fy(Q90 paramQ90, UD0 paramUD0) { if (paramQ90.YC()) return false;  if (paramQ90.Cw0 == 132) return true;  int i;
/* 2 */     if ((i = paramUD0.FD) == 255) return 
/* 3 */         (this.FG == -1);  boolean bool = true;
/* 4 */     if (((byte)paramQ90.MD0 & 0xFF) >= i) bool = false;  return 
/* 5 */       (bool == this.FG); }
/*   */ 
/*   */   
/*   */   public u6(byte paramByte) {
/*   */     super((byte)1, paramByte);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/u6.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */