/* 1 */ package f;public final class Kg0 extends LE { public final int DG(byte[] paramArrayOfbyte) { try { byte b; int i; if (this.e80 == null) { b = 1; } else { b = 0; }
/*   */ 
/*   */ 
/*   */ 
/*   */       
/* 6 */       return i; } finally { paramArrayOfbyte = null; j30(); }
/*   */      }
/*   */ 
/*   */   
/*   */   public AH0 e80;
/*   */   public qR gi0;
/*   */   public Jm pn0;
/*   */   
/*   */   public Kg0(Xb0 paramXb0, RD0 paramRD0) {
/*   */     super(paramXb0, paramRD0);
/*   */     AH0 aH0;
/*   */     if (paramXb0.jj0)
/*   */       return; 
/*   */     this(paramRD0.Yc());
/*   */     this.e80 = aH0;
/*   */     this.pn0 = new Jm();
/*   */     try {
/*   */       Ym0 ym0;
/*   */       if ((ym0 = (aH0 = new AH0()).sv()) != null) {
/*   */         qR qR1;
/*   */         byte b;
/*   */         if (ym0.Kb() == 3) {
/*   */           b = 1;
/*   */         } else {
/*   */           b = 2;
/*   */         } 
/*   */         this(b);
/*   */         this.gi0 = new qR();
/*   */         this.pn0.qO(qR1);
/*   */         NZ(b, ym0.Wb());
/*   */         return;
/*   */       } 
/*   */       throw new JU("Empty MP3");
/*   */     } catch (z60 z60) {
/*   */       throw new JU("error while preloading mp3", z60);
/*   */     } 
/*   */   }
/*   */   
/*   */   public final void j30() {
/*   */     AH0 aH0;
/*   */     if ((aH0 = this.e80) == null)
/*   */       return; 
/*   */     try {
/*   */       aH0.ov();
/*   */     } catch (z60 z60) {}
/*   */     this.e80 = null;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Kg0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */