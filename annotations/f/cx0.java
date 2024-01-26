/*    */ package f;
/*  2 */ public class cx0 implements Serializable { public static final cx0 Ot0 = new cx0(); private static final long serialVersionUID = 5733252015138115702L; public float dA; public float zA0; public float af; public final String toString() { return B40.df("[").append(this.dA).append(",").append(this.zA0).append(",").append(this.af).append(",").append(this.sf0).append("]").toString(); }
/*  3 */   public float sf0; public cx0() {} public cx0(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) { this.dA = paramFloat1; this.zA0 = paramFloat2; this.af = paramFloat3; this.sf0 = paramFloat4; } public cx0(cx0 paramcx0) { this.dA = paramcx0.dA; this.zA0 = paramcx0.zA0; this.af = paramcx0.af; this.sf0 = paramcx0.sf0; } public final boolean ob0(float paramFloat1, float paramFloat2) { float f; return ((f = this.dA) <= paramFloat1 && f + this.af >= paramFloat1 && (paramFloat1 = this.zA0) <= paramFloat2 && paramFloat1 + this.sf0 >= paramFloat2); } public final int hashCode() { int i = 31; i = (Float.floatToRawIntBits(this.sf0) + i) * 31; i = (Float.floatToRawIntBits(this.af) + i) * 31;
/*    */     
/*  5 */     i = (Float.floatToRawIntBits(this.dA) + i) * 31;
/*    */     
/*  7 */     return Float.floatToRawIntBits(this.zA0) + i; } public final boolean equals(Object paramObject) { if (this == paramObject) return true;  if (paramObject == null) return false;  if (getClass() != paramObject.getClass()) return false;  paramObject = paramObject; if (Float.floatToRawIntBits(this.sf0) != Float.floatToRawIntBits(((cx0)paramObject).sf0)) return false;  if (Float.floatToRawIntBits(this.af) != Float.floatToRawIntBits(((cx0)paramObject).af)) return false;
/*    */     
/*  9 */     if (Float.floatToRawIntBits(this.dA) != 
/*    */       
/* 11 */       Float.floatToRawIntBits(((cx0)paramObject).dA)) return false;
/*    */ 
/*    */ 
/*    */     
/* 15 */     return !(Float.floatToRawIntBits(this.zA0) != Float.floatToRawIntBits(((cx0)paramObject).zA0)); }
/*    */ 
/*    */   
/*    */   public final void jG(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
/*    */     this.dA = paramFloat1;
/*    */     this.zA0 = paramFloat2;
/*    */     this.af = paramFloat3;
/*    */     this.sf0 = paramFloat4;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/cx0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */