/* 1 */ package f;public final class P70 extends pe0 { public final void zt0(boolean paramBoolean1, boolean paramBoolean2) { super.zt0(paramBoolean1, paramBoolean2); if (paramBoolean1) { float f2, f1 = this.H3 - this.rd; if (this.Kf0) { f2 = this.OD; } else { f2 = this.ZF0; }  this
/* 2 */         .rd = f1 - f2; }  if (paramBoolean2) { float f2, f1 = this.gp0 - this.jh0; if (this
/* 3 */         .Kf0) { f2 = this.ZF0; } else { f2 = this.OD; }  this
/* 4 */         .jh0 = f1 - f2; }
/*   */      }
/*   */ 
/*   */   
/*   */   public int IC = -1;
/*   */   public String Pk;
/*   */   public float rd;
/*   */   public float jh0;
/*   */   public int ZF0;
/*   */   public int OD;
/*   */   public int H3;
/*   */   public int gp0;
/*   */   public boolean Kf0;
/*   */   public String[] S00;
/*   */   public int[][] cs0;
/*   */   
/*   */   public P70(Texture paramTexture, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*   */     super(paramTexture, paramInt1, paramInt2, paramInt3, paramInt4);
/*   */     this.H3 = paramInt3;
/*   */     this.gp0 = paramInt4;
/*   */     this.ZF0 = paramInt3;
/*   */     this.OD = paramInt4;
/*   */   }
/*   */   
/*   */   public P70(P70 paramP70) {
/*   */     rz0(paramP70);
/*   */     this.IC = paramP70.IC;
/*   */     this.Pk = paramP70.Pk;
/*   */     this.rd = paramP70.rd;
/*   */     this.jh0 = paramP70.jh0;
/*   */     this.ZF0 = paramP70.ZF0;
/*   */     this.OD = paramP70.OD;
/*   */     this.H3 = paramP70.H3;
/*   */     this.gp0 = paramP70.gp0;
/*   */     this.Kf0 = paramP70.Kf0;
/*   */     this.S00 = paramP70.S00;
/*   */     this.cs0 = paramP70.cs0;
/*   */   }
/*   */   
/*   */   public P70(pe0 parampe0) {
/*   */     rz0(parampe0);
/*   */     this.ZF0 = parampe0.hW();
/*   */     int i = parampe0.qY();
/*   */     this.H3 = this.ZF0;
/*   */     this.gp0 = i;
/*   */   }
/*   */   
/*   */   public final String toString() {
/*   */     return this.Pk;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/P70.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */