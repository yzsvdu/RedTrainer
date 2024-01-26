/* 1 */ package f;public final class uP implements fB0 { public final long[] jO = new long[3]; public final boolean[] gl = new boolean[3]; public final int Fj0(Ll paramLl) { byte b; long l = System.currentTimeMillis(); if (paramLl == tw.lN) { b = 0; } else if (b == tw.gL) { b = 2; } else if (b == tw.nS) { b = 1; } else { b = -1; }  if (b >= 0) l -= this
/* 2 */         .jO[b];  return (int)l & Integer.MAX_VALUE; } public final boolean z60(Ll paramLl) { byte b; if (paramLl == tw.lN) { b = 0; } else if (b == tw.gL) { b = 2; } else if (b == tw.nS) { b = 1; } else { b = -1; }  if (b >= 0) return this.gl[b];  return false; }
/*   */ 
/*   */   
/*   */   public final boolean Oo0(Ll paramLl) {
/*   */     return true;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/uP.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */