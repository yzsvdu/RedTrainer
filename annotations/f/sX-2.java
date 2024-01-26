/* 1 */ package f;public final class sX implements Serializable { private static final long serialVersionUID = 7907569533774959788L; public final String toString() { float[] arrayOfFloat = this.h50;
/* 2 */     return B40.df("[").append(this[0]).append("|").append(this[3]).append("|").append(this[6]).append("]\n[").append(this[1]).append("|").append(this[4]).append("|").append(this[7]).append("]\n[").append(this[2]).append("|").append(this[5]).append("|").append(this[8]).append("]").toString(); } public float[] h50 = new float[9]; public float[] Wp = new float[9]; public final sX H0() { float arrayOfFloat[], f1, f2, f3, f4 = (f1 = (arrayOfFloat = this.h50)[0]) * (f2 = arrayOfFloat[4]) * (f3 = arrayOfFloat[8]); float f5, f6, f7; f4 = (f5 = this.h50[3]) * (f6 = arrayOfFloat[7]) * (f7 = arrayOfFloat[2]) + f4; float f9; f4 = Oq.R0(f1, f6, f9, f8 * (f1 = arrayOfFloat[1]) * (f9 = arrayOfFloat[5]) + f4); float f8; if ((f4 = Oq.R0(f8 = this.h50[6], f2, f7, Oq.R0(f5, f1, f3, f4))) != 0.0F) { f4 = f2 * f3 - f9 * f6; this[0] = f4; f1 = f7 * f6 - f1 * f3; this[1] = f1; float f12; f2 = (f12 = arrayOfFloat[1]) * f9 - f7 * f2; this[2] = f2; f5 = f9 * f8 - f5 * f3; this[3] = f5; float f13 = f7 * f3 - (f3 = arrayOfFloat[2]) * f8; this[4] = f13; float f10 = f3 * f14 - f7 * f9; this[5] = f10; float f11, f14; f3 = (f14 = arrayOfFloat[3]) * f6 - (f11 = arrayOfFloat[4]) * f8; this[6] = f3; f6 = f12 * arrayOfFloat[6] - f7 * f6; this[7] = f6; f11 = (f7 = arrayOfFloat[0]) * f11 - f12 * f14; float[] arrayOfFloat1; (arrayOfFloat1 = this.Wp)[8] = f11; arrayOfFloat[0] = f4 * f4; arrayOfFloat[1] = f4 * f1; arrayOfFloat[2] = f4 * f2; arrayOfFloat[3] = f4 * f5; arrayOfFloat[4] = f4 * f13; arrayOfFloat[5] = f4 * f10; arrayOfFloat[6] = f4 * f3; arrayOfFloat[7] = f4 * f6; arrayOfFloat[8] = (f4 = 1.0F / f4) * f11; return this; }  throw new JU("Can't invert a singular matrix"); }
/*   */ 
/*   */   
/*   */   public final sX M30(Matrix4 paramMatrix4) {
/*   */     this[0] = arrayOfFloat2[0];
/*   */     this[1] = arrayOfFloat2[1];
/*   */     this[2] = arrayOfFloat2[2];
/*   */     this[3] = arrayOfFloat2[4];
/*   */     this[4] = arrayOfFloat2[5];
/*   */     this[5] = arrayOfFloat2[6];
/*   */     this[6] = arrayOfFloat2[8];
/*   */     this[7] = arrayOfFloat2[9];
/*   */     float[] arrayOfFloat1;
/*   */     float[] arrayOfFloat2;
/*   */     (arrayOfFloat1 = this.h50)[8] = (arrayOfFloat2 = paramMatrix4.Z0)[10];
/*   */     return this;
/*   */   }
/*   */   
/*   */   public final sX YZ() {
/*   */     float f1 = this.h50[1];
/*   */     float f2 = this.h50[2];
/*   */     float f3 = this.h50[3];
/*   */     float f4 = this.h50[5];
/*   */     float f5 = this.h50[6];
/*   */     float f6 = this.h50[7];
/*   */     this.h50[3] = f1;
/*   */     this.h50[6] = f2;
/*   */     this.h50[1] = f3;
/*   */     this.h50[7] = f4;
/*   */     this.h50[2] = f5;
/*   */     this.h50[5] = f6;
/*   */     return this;
/*   */   }
/*   */   
/*   */   public final void le() {
/*   */     this.h50[0] = 1.0F;
/*   */     this.h50[1] = 0.0F;
/*   */     this.h50[2] = 0.0F;
/*   */     this.h50[3] = 0.0F;
/*   */     this.h50[4] = 1.0F;
/*   */     this.h50[5] = 0.0F;
/*   */     this.h50[6] = 0.0F;
/*   */     this.h50[7] = 0.0F;
/*   */     this.h50[8] = 1.0F;
/*   */   }
/*   */   
/*   */   public final void rt(eo parameo, float paramFloat1, float paramFloat2) {
/*   */     this[0] = f4 * f3 + paramFloat1;
/*   */     float f1;
/*   */     float f3;
/*   */     float f4;
/*   */     float f5;
/*   */     float f6;
/*   */     this[3] = (f5 = (f4 = f2 * (f3 = parameo.x)) * (f4 = parameo.y)) - (f6 = (f1 = parameo.z) * paramFloat2);
/*   */     paramFloat2 = f7 * f3;
/*   */     float f2;
/*   */     this[6] = (f2 = f4 * paramFloat2) + paramFloat2;
/*   */     this[1] = f6 + f5;
/*   */     this[4] = f3 * f4 + paramFloat1;
/*   */     f1 = (f3 = f2 * f4) * f1;
/*   */     this[7] = f1 - f3;
/*   */     this[2] = paramFloat2 - f2;
/*   */     this[5] = (f3 *= paramFloat2) + f1;
/*   */     float[] arrayOfFloat;
/*   */     float f7;
/*   */     (arrayOfFloat = this.h50)[8] = (f7 = (f2 = 1.0F - paramFloat1) * f1) * f1 + paramFloat1;
/*   */   }
/*   */   
/*   */   public final void yA0(sX paramsX) {
/*   */     float[] arrayOfFloat;
/*   */     int i = (arrayOfFloat = this.h50).length;
/*   */     System.arraycopy(paramsX.h50, 0, this, 0, i);
/*   */   }
/*   */   
/*   */   public final void gB(float[] paramArrayOffloat) {
/*   */     float[] arrayOfFloat;
/*   */     int i = (arrayOfFloat = this.h50).length;
/*   */     System.arraycopy(paramArrayOffloat, 0, this, 0, i);
/*   */   }
/*   */   
/*   */   public sX() {
/*   */     le();
/*   */   }
/*   */   
/*   */   public sX(sX paramsX) {
/*   */     yA0(paramsX);
/*   */   }
/*   */   
/*   */   public sX(float[] paramArrayOffloat) {
/*   */     gB(paramArrayOffloat);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/sX.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */