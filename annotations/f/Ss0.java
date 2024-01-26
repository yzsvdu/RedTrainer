/* 1 */ package f;public final class Ss0 extends iN { public final void set(Nr paramNr, int paramInt, Xw0 paramXw0, b70 paramb70) { float[] arrayOfFloat2; for (byte b = 0; b < (arrayOfFloat2 = this.xI).length; ) { int j = b / 16; Matrix4 matrix4, arrayOfMatrix4[]; if ((arrayOfMatrix4 = paramXw0.Et) == null || j >= arrayOfMatrix4.length || (matrix4 = arrayOfMatrix4[j]) == null) { System.arraycopy(lPT3.Z0, 0, arrayOfFloat2, b, 16); } else { System.arraycopy(matrix4.Z0, 0, arrayOfFloat2, b, 16); }  b += 16; }  int i = paramNr.loc(paramInt); float[] arrayOfFloat1; paramInt = (arrayOfFloat1 = this.xI).length; paramNr.program.getClass(); UB0.re0.glUniformMatrix4fv(i, paramInt / 16, false, arrayOfFloat1, 0); }
/*   */ 
/*   */   
/*   */   public static final Matrix4 lPT3 = new Matrix4();
/*   */   public final float[] xI;
/*   */   
/*   */   public Ss0(int paramInt) {
/*   */     this.xI = new float[paramInt * 16];
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ss0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */