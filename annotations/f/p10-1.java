/*   */ package f;public final class p10 implements Serializable { public final String toString() {
/* 2 */     return B40.df("ray [").append(this.xh).append(":").append(this.N6).append("]").toString();
/*   */   }
/*   */   
/*   */   private static final long serialVersionUID = -620692054835390878L;
/*   */   public final eo xh;
/*   */   public final eo N6;
/*   */   
/*   */   public p10() {
/*   */     eo eo1;
/*   */     this();
/*   */     this.xh = this;
/*   */     this();
/*   */     this.N6 = this;
/*   */   }
/*   */   
/*   */   public p10(eo parameo1, eo parameo2) {
/*   */     eo eo1;
/*   */     this();
/*   */     this.xh = new eo();
/*   */     this();
/*   */     this.N6 = eo2;
/*   */     eo1.JL(parameo1);
/*   */     eo eo2;
/*   */     (eo2 = new eo()).JL(parameo2).WC0();
/*   */   }
/*   */   
/*   */   public final boolean equals(Object paramObject) {
/*   */     if (paramObject == this)
/*   */       return true; 
/*   */     if (paramObject == null || paramObject.getClass() != p10.class)
/*   */       return false; 
/*   */     paramObject = paramObject;
/*   */     return (this.N6.equals(((p10)paramObject).N6) && this.xh.equals(((p10)paramObject).xh));
/*   */   }
/*   */   
/*   */   public final int hashCode() {
/*   */     int i = (this.N6.hashCode() + 73) * 73;
/*   */     return this.xh.hashCode() + i;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/p10.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */