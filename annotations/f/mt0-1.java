/* 1 */ package f;public final class mt0 extends d40 { public final void pq0(BufferedReader paramBufferedReader) { if (!this.fs0) { this
/*   */         
/* 3 */         .Pb = Boolean.parseBoolean(iB0.dL(paramBufferedReader, "active")); } else { this.Pb = true; }
/* 4 */      if (!this.Pb) return;  if (jC.valueOf(iB0.dL(paramBufferedReader, "shape")) == jC.DY) {
/* 5 */       Boolean.parseBoolean(iB0.dL(paramBufferedReader, "edges"));
/* 6 */       ar0.valueOf(iB0.dL(paramBufferedReader, "side"));
/*   */     }  }
/*   */ 
/*   */   
/*   */   public final void FF0(mt0 parammt0) {
/*   */     this.Pb = parammt0.Pb;
/*   */     this.fs0 = parammt0.fs0;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/mt0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */