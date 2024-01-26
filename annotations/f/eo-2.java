/*  1 */ package f;public final class eo implements Serializable, Ou0 { private static final long serialVersionUID = 3840054589595372522L; public static final eo X = new eo(1.0F, 0.0F, 0.0F); public static final eo Y = new eo(0.0F, 1.0F, 0.0F); public static final eo Z = new eo(0.0F, 0.0F, 1.0F); public static final eo Zero = new eo(0.0F, 0.0F, 0.0F); private static final Matrix4 tmpMat = new Matrix4(); public float x; public float y; public float z; public eo() {} public eo(float paramFloat1, float paramFloat2, float paramFloat3) { TG0(paramFloat1, paramFloat2, paramFloat3); } public eo(eo parameo) { JL(parameo); } public eo(float[] paramArrayOffloat) { float f1 = paramArrayOffloat[0]; float f2 = paramArrayOffloat[1]; float f3 = paramArrayOffloat[2]; TG0(f1, f2, f3); } public final eo WC0() { float f = this.x * this.x; f = this.y * this.y + f; if ((f = this.z * this.z + f) == 0.0F || f == 1.0F)
/*  2 */       return this;  return uu(1.0F / (float)Math.sqrt(f)); } public eo(NC0 paramNC0, float paramFloat) { float f = paramNC0.x; TG0(f, paramNC0.y, paramFloat); } public final eo TG0(float paramFloat1, float paramFloat2, float paramFloat3) { this.x = paramFloat1; this.y = paramFloat2; this.z = paramFloat3; return this; } public final eo JL(eo parameo) { float f1 = parameo.x; float f2 = parameo.y; float f3 = parameo.z; return TG0(f1, f2, f3); } public final eo cN() { return new eo(this); } public final eo zT(eo parameo) { float f1 = parameo.x; float f2 = parameo.y; float f3 = parameo.z; return Tz(f1, f2, f3); } public final eo Tz(float paramFloat1, float paramFloat2, float paramFloat3) { float f = this.y + paramFloat2; return TG0(this.x + paramFloat1, f, this.z + paramFloat3); } public final eo zy0(eo parameo) { float f1 = parameo.x; float f2 = parameo.y; float f3 = parameo.z; return uD(f1, f2, f3); } public final eo uD(float paramFloat1, float paramFloat2, float paramFloat3) { float f = this.y - paramFloat2; return TG0(this.x - paramFloat1, f, this.z - paramFloat3); } public final eo uu(float paramFloat) { float f = this.y * paramFloat; return TG0(this.x * paramFloat, f, this.z * paramFloat); } public final eo Qh0(float paramFloat1, float paramFloat2, float paramFloat3) { float f = this.y * paramFloat2; return TG0(this.x * paramFloat1, f, this.z * paramFloat3); } public final float Ab0() { float f = this.x * this.x; f = this.y * this.y + f; return (float)Math.sqrt((this.z * this.z + f)); } public final float u50(eo parameo) { float f2 = parameo.x - this.x; float f3 = parameo.y - this.y; float f1 = f2 * f2; f1 = f3 * f3 + f1; return (float)Math.sqrt(((parameo.z - this.z) * (parameo.z - this.z) + f1)); } public final float Cl0(float paramFloat1, float paramFloat2, float paramFloat3) { float f = paramFloat1 - this.x; paramFloat1 = paramFloat2 - this.y; f *= f; f = paramFloat1 * paramFloat1 + f; return (float)Math.sqrt(((paramFloat3 - this.z) * (paramFloat3 - this.z) + f)); } public final float ku(eo parameo) { float f2 = parameo.x - this.x; float f3 = parameo.y - this.y; float f1 = f2 * f2; f1 = f3 * f3 + f1; return (parameo.z - this.z) * (parameo.z - this.z) + f1; } public final float h3(eo parameo) { float f = this.x * parameo.x; f = this.y * parameo.y + f; return this.z * parameo.z + f; } public final eo Nz(eo parameo) { float f1; float f3; float f4 = (f1 = this.y) * (f3 = parameo.z); float f2; f4 -= f5 * (f2 = parameo.y); float f5; float f6 = (f5 = this.z) * (f5 = parameo.x); float f7 = this.x; f2 = f6 - f7 * f3; return TG0(f4, f2, f7 * f2 - f1 * f5); } public final eo eM(Matrix4 paramMatrix4) { float[] arrayOfFloat = paramMatrix4.Z0; float f2; float f3 = (f2 = this.x) * this[0]; float f4; f3 = (f4 = this.y) * this[4] + f3; f2 = f5 * this[8] + f3 + this[12]; f3 = f2 * this[1]; f3 = f4 * this[5] + f3; f3 = f5 * this[9] + f3 + this[13]; f4 = f2 * this[2]; f4 = f4 * this[6] + f4; float f5; float f1 = (f5 = this.z) * this[10] + f4 + this[14]; return TG0(f2, f3, f1); } public final eo DT(sX paramsX) { float[] arrayOfFloat = paramsX.h50; float f2; float f3 = (f2 = this.x) * this[0]; float f4; f3 = (f4 = this.y) * this[3] + f3; float f1 = f5 * this[6] + f3; f2 *= this[1]; f2 = f4 * this[4] + f2; f2 = f5 * this[7] + f2; f3 = f2 * this[2]; f3 = f4 * this[5] + f3; float f5; f3 = (f5 = this.z) * this[8] + f3; return TG0(f1, f2, f3); } public final boolean Kw0() { return (this.x == 0.0F && this.y == 0.0F && this.z == 0.0F); } public final eo x50(eo parameo, float paramFloat) { float f = this.x; this.x = NUL.df(parameo.x, f, paramFloat, f); f = this.y; this.y = NUL.df(parameo.y, f, paramFloat, f); f = this.z; this.z = NUL.df(parameo.z, f, paramFloat, f); return this; } public final String toString() { return B40.df("(").append(this.x).append(",").append(this.y).append(",").append(this.z).append(")").toString(); } public final int hashCode() { int i = 31; i = (Float.floatToIntBits(this.x) + i) * 31;
/*  3 */     i = (Float.floatToIntBits(this.y) + i) * 31;
/*    */     
/*  5 */     return Float.floatToIntBits(this.z) + i; } public final boolean equals(Object paramObject) { if (this == paramObject) return true;  if (paramObject == null) return false;  if (eo.class != paramObject.getClass()) return false;  paramObject = paramObject; if (Float.floatToIntBits(this.x) != Float.floatToIntBits(((eo)paramObject).x)) return false;  if (Float.floatToIntBits(this.y) != 
/*    */       
/*  7 */       Float.floatToIntBits(((eo)paramObject).y)) return false;
/*    */ 
/*    */ 
/*    */     
/* 11 */     return !(Float.floatToIntBits(this.z) != Float.floatToIntBits(((eo)paramObject).z)); }
/*    */ 
/*    */   
/*    */   public final eo gL() {
/*    */     this.x = 0.0F;
/*    */     this.y = 0.0F;
/*    */     this.z = 0.0F;
/*    */     return this;
/*    */   }
/*    */   
/*    */   public final Ou0 b3() {
/*    */     return new eo(this);
/*    */   }
/*    */   
/*    */   public final void r9(float paramFloat) {
/*    */     float f = this.y + paramFloat;
/*    */     TG0(this.x + paramFloat, f, this.z + paramFloat);
/*    */   }
/*    */   
/*    */   public final void ky0(float paramFloat) {
/*    */     float f = this.y - paramFloat;
/*    */     TG0(this.x - paramFloat, f, this.z - paramFloat);
/*    */   }
/*    */   
/*    */   public final void WO(TG0 paramTG0) {
/*    */     paramTG0.getClass();
/*    */     tG02.getClass();
/*    */     float f2 = paramTG0.D80, f3 = paramTG0.tb0, f4 = paramTG0.z60, f5 = paramTG0.AD;
/*    */     TG0 tG02;
/*    */     (tG02 = TG0.LPT5).vp0(f2, f3, f4, f5);
/*    */     TG0.LPT5.Wq();
/*    */     float f1 = this.x;
/*    */     f2 = this.y;
/*    */     f3 = this.z;
/*    */     TG0.LPT5.L90(TG0.Bn0.vp0(f1, f2, f3, 0.0F)).L90(paramTG0);
/*    */     TG0 tG01;
/*    */     this.x = (tG01 = TG0.LPT5).D80;
/*    */     this.y = this.tb0;
/*    */     this.z = this.z60;
/*    */   }
/*    */   
/*    */   public final void qf(Matrix4 paramMatrix4) {
/*    */     float[] arrayOfFloat = paramMatrix4.Z0;
/*    */     float f2;
/*    */     float f3 = (f2 = this.x) * this[3];
/*    */     float f4;
/*    */     f3 = (f4 = this.y) * this[7] + f3;
/*    */     f2 = 1.0F / (f5 * this[11] + f3 + this[15]);
/*    */     f3 = f2 * this[0];
/*    */     f3 = f4 * this[4] + f3;
/*    */     f3 = (f5 * this[8] + f3 + this[12]) * f2;
/*    */     f4 = f2 * this[1];
/*    */     f4 = f4 * this[5] + f4;
/*    */     f4 = (f5 * this[9] + f4 + this[13]) * f2;
/*    */     float f5 = f2 * this[2];
/*    */     f5 = f4 * this[6] + f5;
/*    */     float f1 = ((f5 = this.z) * this[10] + f5 + this[14]) * f2;
/*    */     TG0(f3, f4, f1);
/*    */   }
/*    */   
/*    */   public final void vS(eo parameo, float paramFloat) {
/*    */     Matrix4 matrix4;
/*    */     (matrix4 = tmpMat).Rn0(parameo, paramFloat);
/*    */     eM(this);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/eo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */