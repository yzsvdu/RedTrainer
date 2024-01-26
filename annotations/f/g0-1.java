/*   */ package f;public final class g0 extends U90 { public final U90 Em0() {
/* 2 */     this(); Throwable throwable; Logger.getLogger(Ip.class.getName()).log(Level.WARNING, "Useless call to addGap() on ParallelGroup", this);
/*   */     return this;
/*   */   }
/*   */   
/*   */   public g0(Ip paramIp) {
/*   */     super(paramIp);
/*   */   }
/*   */   
/*   */   public final int iD(int paramInt) {
/*   */     int i = 0;
/*   */     byte b = 0;
/*   */     int j = this.gs.size();
/*   */     while (b < j) {
/*   */       eD0 eD0 = this.gs.get(b);
/*   */       if (this.Pc0.N00 || eD0.Cg())
/*   */         i = Math.max(i, eD0.iD(paramInt)); 
/*   */       b++;
/*   */     } 
/*   */     return i;
/*   */   }
/*   */   
/*   */   public final int fV(int paramInt) {
/*   */     int i = 0;
/*   */     byte b = 0;
/*   */     int j = this.gs.size();
/*   */     while (b < j) {
/*   */       eD0 eD0 = this.gs.get(b);
/*   */       if (this.Pc0.N00 || eD0.Cg())
/*   */         i = Math.max(i, eD0.fV(paramInt)); 
/*   */       b++;
/*   */     } 
/*   */     return i;
/*   */   }
/*   */   
/*   */   public final int Ab0(int paramInt) {
/*   */     int i = 0;
/*   */     byte b = 0;
/*   */     int j = this.gs.size();
/*   */     while (b < j) {
/*   */       eD0 eD0 = this.gs.get(b);
/*   */       if (this.Pc0.N00 || eD0.Cg())
/*   */         i = Math.max(i, eD0.Ab0(paramInt)); 
/*   */       b++;
/*   */     } 
/*   */     return i;
/*   */   }
/*   */   
/*   */   public final void bO(int paramInt1, int paramInt2, int paramInt3) {
/*   */     byte b = 0;
/*   */     int i = this.gs.size();
/*   */     while (b < i) {
/*   */       eD0 eD0 = this.gs.get(b);
/*   */       if (this.Pc0.N00 || eD0.Cg())
/*   */         eD0.bO(paramInt1, paramInt2, paramInt3); 
/*   */       b++;
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/g0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */