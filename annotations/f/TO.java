/* 1 */ package f;public final class TO extends LE { public final int DG(byte[] paramArrayOfbyte) { if (this.M20 == null) { int i = (this.M20 = new K4(this.hS)).U40; NZ(i, (new K4(this.hS)).eN); }  try { return this.M20.read(paramArrayOfbyte); } catch (IOException iOException) { throw new JU(B40.df("Error reading WAV file: ")
/* 2 */           .append(this.hS).toString(), iOException); }
/*   */      }
/*   */ 
/*   */   
/*   */   public K4 M20;
/*   */   
/*   */   public TO(Xb0 paramXb0, RD0 paramRD0) {
/*   */     super(paramXb0, paramRD0);
/*   */     K4 k4;
/*   */     this(paramRD0);
/*   */     this.M20 = new K4();
/*   */     if (paramXb0.jj0)
/*   */       return; 
/*   */     int i = k4.U40;
/*   */     NZ(i, k4.eN);
/*   */   }
/*   */   
/*   */   public final void j30() {
/*   */     Ui.JC0(this.M20);
/*   */     this.M20 = null;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/TO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */