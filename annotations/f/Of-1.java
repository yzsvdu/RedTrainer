/* 1 */ package f;public final class Of { public final void Rb0(LPT3 paramLPT3) { this.ix
/* 2 */       .put(Short.valueOf(paramLPT3.bj0), paramLPT3); this.cOm7
/*   */       
/* 4 */       .put(Short.valueOf(paramLPT3.bj0), paramLPT3); }
/*   */ 
/*   */   
/*   */   public static final Of eH = new Of();
/*   */   public TreeMap ix;
/*   */   public TreeMap cOm7;
/*   */   public h30 eF0;
/*   */   
/*   */   public Of() {
/*   */     TreeMap<Object, Object> treeMap;
/*   */     h30 h301;
/*   */     this();
/*   */     this.ix = this;
/*   */     this();
/*   */     this.cOm7 = this;
/*   */     this();
/*   */     this.eF0 = this;
/*   */   }
/*   */   
/*   */   public static Of b20() {
/*   */     return eH;
/*   */   }
/*   */   
/*   */   public final LPT3 On0(short paramShort) {
/*   */     LPT3 lPT3;
/*   */     if ((lPT3 = (LPT3)this.ix.get(Short.valueOf(paramShort))) == null) {
/*   */       Hu0 hu0 = Hu0.M8;
/*   */       this(paramShort, (short)0, 1450, 1451, (short)0, this);
/*   */       Rb0(lPT3);
/*   */     } 
/*   */     return lPT3;
/*   */   }
/*   */   
/*   */   public final Collection aj0() {
/*   */     return this.cOm7.values();
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Of.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */