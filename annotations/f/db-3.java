/*   */ package f;public final class db {
/*   */   public final String toString() {
/* 3 */     return N.Gl0(B40.df("Dimension[x=").append(this.PO).append(", y="), this.bJ0, "]");
/*   */   }
/*   */   
/*   */   public static final db oI = new db(0, 0);
/*   */   public final int PO;
/*   */   public final int bJ0;
/*   */   
/*   */   public db(int paramInt1, int paramInt2) {
/*   */     this.PO = paramInt1;
/*   */     this.bJ0 = paramInt2;
/*   */   }
/*   */   
/*   */   public final boolean equals(Object paramObject) {
/*   */     if (paramObject == null || db.class != paramObject.getClass())
/*   */       return false; 
/*   */     paramObject = paramObject;
/*   */     return (this.PO == ((db)paramObject).PO && this.bJ0 == ((db)paramObject).bJ0);
/*   */   }
/*   */   
/*   */   public final int hashCode() {
/*   */     return (213 + this.PO) * 71 + this.bJ0;
/*   */   }
/*   */ }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/db.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */