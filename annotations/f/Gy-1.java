/* 1 */ package f;public final class Gy implements Serializable { public final int hashCode() { int i = 53; i = (Float.floatToRawIntBits(this.Hq0) + i) * 53;
/*   */     
/* 3 */     i = (Float.floatToRawIntBits(this.Rb0) + i) * 53;
/*   */     
/* 5 */     i = (Float.floatToRawIntBits(this.u90) + i) * 53;
/*   */     
/* 7 */     return Float.floatToRawIntBits(this.Ik0) + i; }
/*   */ 
/*   */   
/*   */   private static final long serialVersionUID = 7381533206532032099L;
/*   */   public float u90;
/*   */   public float Ik0;
/*   */   public float Rb0;
/*   */   public float Hq0;
/*   */   
/*   */   public Gy() {}
/*   */   
/*   */   public Gy(Gy paramGy) {
/*   */     this.u90 = paramGy.u90;
/*   */     this.Ik0 = paramGy.Ik0;
/*   */     this.Rb0 = paramGy.Rb0;
/*   */     this.Hq0 = paramGy.Hq0;
/*   */   }
/*   */   
/*   */   public Gy(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
/*   */     this.u90 = paramFloat1;
/*   */     this.Ik0 = paramFloat2;
/*   */     this.Rb0 = paramFloat3;
/*   */     this.Hq0 = paramFloat4;
/*   */   }
/*   */   
/*   */   public Gy(NC0 paramNC0, float paramFloat1, float paramFloat2) {
/*   */     this.u90 = paramNC0.x;
/*   */     this.Ik0 = paramNC0.y;
/*   */     this.Rb0 = paramFloat1;
/*   */     this.Hq0 = paramFloat2;
/*   */   }
/*   */   
/*   */   public Gy(NC0 paramNC01, NC0 paramNC02) {
/*   */     this.u90 = paramNC01.x;
/*   */     this.Ik0 = paramNC01.y;
/*   */     this.Rb0 = paramNC02.x;
/*   */     this.Hq0 = paramNC02.y;
/*   */   }
/*   */   
/*   */   public Gy(We0 paramWe0) {
/*   */     this.u90 = paramWe0.eb;
/*   */     this.Ik0 = paramWe0.bM;
/*   */     this.Rb0 = paramWe0.X9 * 2.0F;
/*   */     this.Hq0 = paramWe0.X9 * 2.0F;
/*   */   }
/*   */   
/*   */   public final boolean equals(Object paramObject) {
/*   */     if (paramObject == this)
/*   */       return true; 
/*   */     if (paramObject == null || paramObject.getClass() != Gy.class)
/*   */       return false; 
/*   */     paramObject = paramObject;
/*   */     return (this.u90 == ((Gy)paramObject).u90 && this.Ik0 == ((Gy)paramObject).Ik0 && this.Rb0 == ((Gy)paramObject).Rb0 && this.Hq0 == ((Gy)paramObject).Hq0);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Gy.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */