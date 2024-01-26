/* 1 */ package f;public final class vc { public final int iX(fB0 paramfB0) { if (this.M0 != null) { short s = 0; while (true) { if (paramfB0 == null || !paramfB0.z60(this.M0[s >> 1])) s++;  if ((s = this.nD0[s]) < 0) return s & Short.MAX_VALUE;  }  }  byte b = 0;
/* 2 */     for (int i = this.r0.length; b < i && !this.r0[b].aU(paramfB0); b++); return b; }
/*   */ 
/*   */   
/*   */   public final Nm0[] r0;
/*   */   public final Ll[] M0;
/*   */   public final short[] nD0;
/*   */   
/*   */   public vc(Nm0... paramVarArgs) {
/*   */     this.r0 = paramVarArgs;
/*   */     this.M0 = null;
/*   */     this.nD0 = null;
/*   */   }
/*   */   
/*   */   public final int Lpt2() {
/*   */     return this.r0.length;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/vc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */