/* 1 */ package f;public final class We0 implements Serializable { public final int hashCode() { int i = 41; i = (Float.floatToRawIntBits(this.X9) + i) * 41;
/*   */     
/* 3 */     i = (Float.floatToRawIntBits(this.eb) + i) * 41;
/*   */     
/* 5 */     return Float.floatToRawIntBits(this.bM) + i; }
/*   */ 
/*   */   
/*   */   public float eb;
/*   */   public float bM;
/*   */   public float X9;
/*   */   
/*   */   public We0() {}
/*   */   
/*   */   public We0(float paramFloat1, float paramFloat2, float paramFloat3) {
/*   */     this.eb = paramFloat1;
/*   */     this.bM = paramFloat2;
/*   */     this.X9 = paramFloat3;
/*   */   }
/*   */   
/*   */   public We0(NC0 paramNC0, float paramFloat) {
/*   */     this.eb = paramNC0.x;
/*   */     this.bM = paramNC0.y;
/*   */     this.X9 = paramFloat;
/*   */   }
/*   */   
/*   */   public We0(We0 paramWe0) {
/*   */     this.eb = paramWe0.eb;
/*   */     this.bM = paramWe0.bM;
/*   */     this.X9 = paramWe0.X9;
/*   */   }
/*   */   
/*   */   public We0(NC0 paramNC01, NC0 paramNC02) {
/*   */     this.eb = f2;
/*   */     float f1 = paramNC01.y;
/*   */     float f2;
/*   */     this.X9 = NC0.uZ((f2 = paramNC01.x) - paramNC02.x, f1 - paramNC02.y);
/*   */   }
/*   */   
/*   */   public final String toString() {
/*   */     return this.eb + "," + this.bM + "," + this.X9;
/*   */   }
/*   */   
/*   */   public final boolean equals(Object paramObject) {
/*   */     if (paramObject == this)
/*   */       return true; 
/*   */     if (paramObject == null || paramObject.getClass() != We0.class)
/*   */       return false; 
/*   */     paramObject = paramObject;
/*   */     return (this.eb == ((We0)paramObject).eb && this.bM == ((We0)paramObject).bM && this.X9 == ((We0)paramObject).X9);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/We0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */