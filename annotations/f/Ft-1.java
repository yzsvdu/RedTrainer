/* 1 */ package f;public final class Ft extends eD0 { public final void hf() { JG0 jG0; this
/* 2 */       .yp0 = (jG0 = this.DG0).Kd;
/*   */     
/* 4 */     this.SF = jG0.er0;
/*   */     
/* 6 */     this.BP = jG0.xY;
/*   */     
/* 8 */     this.ui = jG0.HC; this.RY = jG0.AW(); this.Ca0 = this.DG0.HY(); this.P20 = this.DG0.W3(); this.mC = this.DG0.Hj(); int j = this.DG0.J50(); this.z5 = JG0.Fr(this.RY, j, this.P20); int i = this.DG0.tj0(); this.l50 = JG0.Fr(this.Ca0, i, this.mC); this.vF = 0; }
/*   */ 
/*   */   
/*   */   public final JG0 DG0;
/*   */   public et sk0;
/*   */   public int yp0;
/*   */   public int SF;
/*   */   public int BP;
/*   */   public int ui;
/*   */   public int RY;
/*   */   public int Ca0;
/*   */   public int P20;
/*   */   public int mC;
/*   */   public int z5;
/*   */   public int l50;
/*   */   public int vF;
/*   */   
/*   */   public Ft(JG0 paramJG0) {
/*   */     this.DG0 = paramJG0;
/*   */     this.sk0 = et.Lp;
/*   */   }
/*   */   
/*   */   public final int iD(int paramInt) {
/*   */     if (paramInt != 0) {
/*   */       if (paramInt == 1)
/*   */         return this.Ca0; 
/*   */       throw new IllegalArgumentException("axis");
/*   */     } 
/*   */     return this.RY;
/*   */   }
/*   */   
/*   */   public final int fV(int paramInt) {
/*   */     if (paramInt != 0) {
/*   */       if (paramInt == 1)
/*   */         return this.l50; 
/*   */       throw new IllegalArgumentException("axis");
/*   */     } 
/*   */     return this.z5;
/*   */   }
/*   */   
/*   */   public final int Ab0(int paramInt) {
/*   */     if (paramInt != 0) {
/*   */       if (paramInt == 1)
/*   */         return this.mC; 
/*   */       throw new IllegalArgumentException("axis");
/*   */     } 
/*   */     return this.P20;
/*   */   }
/*   */   
/*   */   public final void bO(int paramInt1, int paramInt2, int paramInt3) {
/*   */     this.vF |= 1 << paramInt1;
/*   */     if (paramInt1 != 0) {
/*   */       if (paramInt1 == 1) {
/*   */         this.SF = paramInt2;
/*   */         this.ui = paramInt3;
/*   */       } else {
/*   */         throw new IllegalArgumentException("axis");
/*   */       } 
/*   */     } else {
/*   */       this.yp0 = paramInt2;
/*   */       this.BP = paramInt3;
/*   */     } 
/*   */   }
/*   */   
/*   */   public final void xs() {
/*   */     if (this.vF != 3) {
/*   */       StringBuilder stringBuilder;
/*   */       this();
/*   */       (new StringBuilder()).append("Widget ").append(this.DG0).append(" with theme ").append(this.DG0.xp0()).append(" is not part of the following groups:");
/*   */       if ((this.vF & 0x1) == 0)
/*   */         stringBuilder.append(" horizontal"); 
/*   */       if ((this.vF & 0x2) == 0)
/*   */         stringBuilder.append(" vertical"); 
/*   */       throw new IllegalStateException(stringBuilder.toString());
/*   */     } 
/*   */     if (this.sk0 != et.Lp) {
/*   */       int i = Math.min(this.BP, this.z5), j = Math.min(this.ui, this.l50), k = this.yp0;
/*   */       k = this.sk0.Sp(this.BP, i) + k;
/*   */       int m = this.SF;
/*   */       this.DG0.Ol0(k, this.sk0.nV(this.ui, j) + m);
/*   */       this.DG0.Tm(i, j);
/*   */     } else {
/*   */       int j = this.yp0;
/*   */       this.DG0.Ol0(j, this.SF);
/*   */       int i = this.BP;
/*   */       this.DG0.Tm(i, this.ui);
/*   */     } 
/*   */   }
/*   */   
/*   */   public final boolean Cg() {
/*   */     return this.DG0.dP;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ft.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */