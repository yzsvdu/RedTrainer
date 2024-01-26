/*   */ package f;
/* 2 */ public final class NC0 implements Serializable, Ou0 { private static final long serialVersionUID = 913902788239530931L; public static final NC0 X = new NC0(1.0F, 0.0F); public static final NC0 Y = new NC0(0.0F, 1.0F); public static final NC0 Zero = new NC0(0.0F, 0.0F); public float x; public float y; public NC0() {} public final String toString() { return B40.df("(").append(this.x).append(",").append(this.y).append(")").toString(); }
/* 3 */   public NC0(float paramFloat1, float paramFloat2) { this.x = paramFloat1; this.y = paramFloat2; } public NC0(NC0 paramNC0) { ON(paramNC0); } public static float uZ(float paramFloat1, float paramFloat2) { paramFloat1 *= paramFloat1; return (float)Math.sqrt((paramFloat2 * paramFloat2 + paramFloat1)); } public final NC0 ne() { return new NC0(this); } public final NC0 ON(NC0 paramNC0) { this.x = paramNC0.x; this.y = paramNC0.y; return this; } public final NC0 f80(NC0 paramNC0) { this.x += paramNC0.x; this.y += paramNC0.y; return this; } public final float lS(NC0 paramNC0) { float f2 = paramNC0.x - this.x; float f1 = f2 * f2; return (float)Math.sqrt(((paramNC0.y - this.y) * (paramNC0.y - this.y) + f1)); } public final NC0 Nr(float paramFloat) { float f1 = (float)Math.cos((paramFloat * 0.017453292F)); paramFloat = (float)Math.sin((paramFloat * 0.017453292F)); float f2, f3 = (f2 = this.x) * f1; f1 = f3 - f4 * paramFloat; paramFloat = f2 * paramFloat; float f4; paramFloat = (f4 = this.y) * f1 + paramFloat; this.x = f1; this.y = paramFloat; return this; } public final int hashCode() { int i = 31; i = (Float.floatToIntBits(this.x) + i) * 31; return Float.floatToIntBits(this.y) + i; } public final boolean equals(Object paramObject) { if (this == paramObject) return true;  if (paramObject == null) return false;  if (NC0.class != paramObject.getClass()) return false;  paramObject = paramObject; if (Float.floatToIntBits(this.x) != Float.floatToIntBits(((NC0)paramObject).x)) return false;
/*   */ 
/*   */ 
/*   */     
/* 7 */     return !(Float.floatToIntBits(this.y) != Float.floatToIntBits(((NC0)paramObject).y)); }
/*   */ 
/*   */   
/*   */   public final boolean UL(NC0 paramNC0) {
/*   */     boolean bool;
/*   */     float f = 1.0E-6F;
/*   */     if (paramNC0 == null || Math.abs(paramNC0.x - this.x) > f || Math.abs(paramNC0.y - this.y) > f) {
/*   */       bool = false;
/*   */     } else {
/*   */       bool = true;
/*   */     } 
/*   */     return bool;
/*   */   }
/*   */   
/*   */   public final boolean RM(float paramFloat1, float paramFloat2) {
/*   */     boolean bool;
/*   */     paramFloat1 = 1.0E-6F;
/*   */     if (Math.abs(paramFloat1 - this.x) > paramFloat1 || Math.abs(paramFloat2 - this.y) > paramFloat1) {
/*   */       bool = false;
/*   */     } else {
/*   */       bool = true;
/*   */     } 
/*   */     return bool;
/*   */   }
/*   */   
/*   */   public final Ou0 cm0(float paramFloat) {
/*   */     this.x *= paramFloat;
/*   */     this.y *= paramFloat;
/*   */     return this;
/*   */   }
/*   */   
/*   */   public final Ou0 b3() {
/*   */     return new NC0(this);
/*   */   }
/*   */   
/*   */   public final void CE(float paramFloat1, float paramFloat2) {
/*   */     this.x = paramFloat1;
/*   */     this.y = paramFloat2;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/NC0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */