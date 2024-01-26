/* 1 */ package f;public final class R20 extends iN { public final void set(Nr paramNr, int paramInt, Xw0 paramXw0, b70 paramb70) { float[] arrayOfFloat2; for (byte b = 0; b < (arrayOfFloat2 = this.lpT7).length; ) { float f; int j = b / 16; Matrix4 matrix4, arrayOfMatrix4[]; if ((arrayOfMatrix4 = paramXw0.Et) == null || j >= arrayOfMatrix4.length || (matrix4 = arrayOfMatrix4[j]) == null) { f = a50.Z0[b % 16]; } else { f = f.Z0[b % 16]; }  arrayOfFloat2[b] = f; b++; }  int i = paramNr.loc(paramInt); float[] arrayOfFloat1; paramInt = (arrayOfFloat1 = this.lpT7).length; paramNr.program.getClass(); UB0.re0.glUniformMatrix4fv(i, paramInt / 16, false, arrayOfFloat1, 0); }
/*   */ 
/*   */   
/*   */   public static final Matrix4 a50 = new Matrix4();
/*   */   public final float[] lpT7 = new float[192]; }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/R20.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */