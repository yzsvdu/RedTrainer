/* 1 */ package f;public final class mG { public final yy FH0; public final Ut0 Aux; public final String IW() { return this.FH0.mK; } public boolean LD; public mG(yy paramyy) { Ut0 ut0; this(); this.Aux = this; this.FH0 = paramyy; } public final yy hd0() { return this.FH0; } public final ON[] DQ() { synchronized (this.Aux) { Ut0 ut0; (ut0 = this.Aux).getClass(); /* monitor exit ThisExpression{ObjectType{f/Ut0}} */ return (ON[])(new mt(ut0))
/* 2 */         .mV((Object[])new ON[0]); }
/*   */      } public final ON bc(int paramInt) { synchronized (this.Aux) { /* monitor exit ThisExpression{ObjectType{f/Ut0}} */ return (ON)this.Aux.Z6(paramInt); }
/*   */      }
/* 5 */   public final String Oh0(jv paramjv) { String str; if (!(str = this.FH0.Qz0[paramjv.cJ]).isEmpty()) return this;
/*   */     
/* 7 */     return Ml0.OH0(paramjv.MQ); }
/*   */ 
/*   */   
/*   */   public final boolean FH0(int paramInt) {
/*   */     synchronized (this.Aux) {
/*   */       /* monitor exit ThisExpression{ObjectType{f/Ut0}} */
/*   */       return this.Aux.return(paramInt);
/*   */     } 
/*   */   }
/*   */   
/*   */   public final jv Ic0(int paramInt) {
/*   */     synchronized (this.Aux) {
/*   */       ON oN;
/*   */       if ((oN = (ON)this.Aux.Z6(paramInt)) == null) {
/*   */         /* monitor exit ThisExpression{ObjectType{f/Ut0}} */
/*   */         return null;
/*   */       } 
/*   */       /* monitor exit ThisExpression{ObjectType{f/Ut0}} */
/*   */       return oN.implements;
/*   */     } 
/*   */   }
/*   */   
/*   */   public final boolean Ru(int paramInt, short paramShort) {
/*   */     ON oN;
/*   */     if ((oN = bc(paramInt)) == null)
/*   */       return false; 
/*   */     return this.FH0.HP(oN.implements, paramShort);
/*   */   }
/*   */   
/*   */   public final boolean o20() {
/*   */     if (this.LD) {
/*   */       this.LD = false;
/*   */       return true;
/*   */     } 
/*   */     return false;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/mG.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */