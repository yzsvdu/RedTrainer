/* 1 */ package f;public final class Pp extends LE { public final int DG(byte[] paramArrayOfbyte) { if (this.BH == null) { InputStream inputStream = this.hS.Yc();
/* 2 */       int i = (this.BH = new qp0(inputStream, this.GE0)).PF0.V0;
/*   */       
/* 4 */       NZ(i, (this.BH = new qp0(inputStream, this.GE0)).PF0.ce); this.GE0 = null; }  getClass(); qp0 qp01;
/* 5 */     return (qp01 = this.BH).read(paramArrayOfbyte, 0, paramArrayOfbyte.length); }
/*   */ 
/*   */   
/*   */   public qp0 BH;
/*   */   public qp0 GE0;
/*   */   
/*   */   public Pp(Xb0 paramXb0, RD0 paramRD0) {
/*   */     super(paramXb0, paramRD0);
/*   */     if (paramXb0.jj0)
/*   */       return; 
/*   */     NZ((this.BH = new qp0(paramRD0.Yc())).Z0(), this.BH.B6());
/*   */   }
/*   */   
/*   */   public final void j30() {
/*   */     Ui.JC0(this.BH);
/*   */     this.GE0 = null;
/*   */     this.BH = null;
/*   */   }
/*   */   
/*   */   public final void NV() {
/*   */     Ui.JC0(this.BH);
/*   */     this.GE0 = this.BH;
/*   */     this.BH = null;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Pp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */