/* 1 */ package f;public final class aA0 extends sH { public final byte coM9() { return (this.nG[0]).qi0; }
/*   */ 
/*   */   
/*   */   public J50[] nG;
/*   */   
/*   */   public aA0(J50... paramVarArgs) {
/*   */     this.nG = paramVarArgs;
/*   */   }
/*   */   
/*   */   public final boolean CoM9() {
/*   */     J50[] arrayOfJ50;
/*   */     int i = (arrayOfJ50 = this.nG).length;
/*   */     for (byte b = 0; b < i; b++) {
/*   */       if (!this[b].CoM9())
/*   */         return false; 
/*   */     } 
/*   */     return true;
/*   */   }
/*   */   
/*   */   public final void Ja(int paramInt, byte paramByte) {
/*   */     J50[] arrayOfJ50;
/*   */     int i = (arrayOfJ50 = this.nG).length;
/*   */     for (byte b = 0; b < i; b++)
/*   */       this[b].Ja(paramInt, paramByte); 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/aA0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */