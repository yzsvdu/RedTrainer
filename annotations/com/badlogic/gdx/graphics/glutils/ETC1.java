/* 1 */ package com.badlogic.gdx.graphics.glutils;public class ETC1 { public static ZH xj0(dn0 paramdn0, Uc paramUc) { if (paramdn0.Zg0 == 16) { b1 = 1; } else { b1 = 0; }  if (b1) { b1 = 16;
/* 2 */       i = getWidthPKM(paramdn0.B8, 0); j = getHeightPKM(paramdn0.B8, 0); } else { b1 = 0; i = paramdn0.Tj0; j = paramdn0.Pq; }  if (paramUc == 
/* 3 */       Uc.se0) { b2 = 2; } else { if (paramUc == Uc.com9) { b2 = 3;
/* 4 */         this(i, j, paramUc); decodeImage(paramdn0.B8, b1, zH1.tp0(), 0, i, j, b2); ZH zH1; return zH1 = new ZH(); }
/* 5 */        throw new JU("Can only handle RGB565 or RGB888 images"); }
/*   */     
/*   */     this(i, j, paramUc);
/*   */     byte b1;
/*   */     int i, j;
/*   */     byte b2;
/*   */     decodeImage(paramdn0.B8, b1, zH.tp0(), 0, i, j, b2);
/*   */     ZH zH;
/*   */     return zH = new ZH(); }
/*   */ 
/*   */   
/*   */   public static native int getWidthPKM(ByteBuffer paramByteBuffer, int paramInt);
/*   */   
/*   */   public static native int getHeightPKM(ByteBuffer paramByteBuffer, int paramInt);
/*   */   
/*   */   public static native boolean isValidPKM(ByteBuffer paramByteBuffer, int paramInt);
/*   */   
/*   */   private static native void decodeImage(ByteBuffer paramByteBuffer1, int paramInt1, ByteBuffer paramByteBuffer2, int paramInt2, int paramInt3, int paramInt4, int paramInt5); }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/glutils/ETC1.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */