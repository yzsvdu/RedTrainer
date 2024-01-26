/*   */ package f;
/*   */ public abstract class i10 {
/*   */   public static ZH Xx0() {
/* 4 */     UB0.go.glPixelStorei(3333, 1); int i, j, k; ByteBuffer byteBuffer = BufferUtils.ar(k = (i = UB0.M60.sL) * (j = UB0.M60.kL) * 4); UB0.go.glReadPixels(0, 0, i, j, 6408, 5121, byteBuffer); byte[] arrayOfByte; int m; byte b; for (arrayOfByte = new byte[(i = UB0.M60.sL) * (j = UB0.M60.kL) * 4], m = UB0.M60.sL * 4, b = 0; b < j; ) { byteBuffer.position((j - b - 1) * m); byteBuffer.get(arrayOfByte, b * m, m); b++; }  for (j = 0; j < k; ) { arrayOfByte[j + 3] = -1;
/* 5 */       j += 4; }
/*   */ 
/*   */ 
/*   */     
/* 9 */     BufferUtils.Nx(arrayOfByte, (new ZH(UB0.M60.sL, UB0.M60.kL, Uc.xi0)).tp0(), k); return new ZH(UB0.M60.sL, UB0.M60.kL, Uc.xi0);
/*   */   }
/*   */ }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/i10.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */