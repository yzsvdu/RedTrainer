/* 1 */ package f;public class rM extends d40 { public void fo(BufferedReader paramBufferedReader) { if (!this.fs0) { this
/*   */         
/* 3 */         .Pb = Boolean.parseBoolean(iB0.dL(paramBufferedReader, "active")); } else { this.Pb = true; }
/* 4 */      if (!this.Pb)
/* 5 */       return;  Float.parseFloat(iB0.dL(paramBufferedReader, "lowMin")); Float.parseFloat(iB0.dL(paramBufferedReader, "lowMax")); }
/*   */ 
/*   */   
/*   */   public final void kN(rM paramrM) {
/*   */     this.Pb = paramrM.Pb;
/*   */     this.fs0 = paramrM.fs0;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/rM.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */