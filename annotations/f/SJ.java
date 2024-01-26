/* 1 */ package f;public final class SJ { public final Matrix4 xc0() { float f1, f5; Matrix4 matrix4 = new Matrix4(); arrayOfFloat[0] = this.l60; float[] arrayOfFloat; (arrayOfFloat = new float[2])[1] = this.qr; int i = this.Ss & 0xF; (arrayOfFloat = new float[16])[0] = 0.0F; (new float[16])[1] = 0.0F; (new float[16])[2] = 0.0F; (new float[16])[3] = 0.0F; (new float[16])[4] = 0.0F; (new float[16])[5] = 0.0F; (new float[16])[6] = 0.0F; (new float[16])[7] = 0.0F; (new float[16])[8] = 0.0F; (new float[16])[9] = 0.0F; (new float[16])[10] = 0.0F; (new float[16])[11] = 0.0F; (new float[16])[12] = 0.0F; (new float[16])[13] = 0.0F; (new float[16])[14] = 0.0F; (new float[16])[15] = 1.0F; float f2 = 1.0F, f3 = arrayOfFloat[0], f4 = arrayOfFloat[1]; int j; if ((j = this.Ss >> 4 & 0xF) == 1 || j == 3 || j == 5 || j == 7 || j == 9 || j == 11 || j == 13 || j == 15) f2 = -1.0F;  switch (j) { default: f5 = f4; break;case 2: case 3: case 6: case 7: case 10: case 11: case 14: case 15: f5 = -f4; break; }  switch (j) { default: f1 = f3; break;case 4: case 5: case 6: case 7: case 12: case 13: case 14: case 15: f1 = -f3; break; }  switch (i) { default:
/* 2 */         this(arrayOfFloat);
/*   */         return matrix4;
/*   */       case 9:
/*   */         arrayOfFloat[0] = -f3;
/*   */       case 8:
/*   */         arrayOfFloat[10] = f2;
/*   */         arrayOfFloat[0] = f3;
/*   */         arrayOfFloat[1] = f4;
/*   */         arrayOfFloat[4] = f5;
/*   */         arrayOfFloat[5] = f1;
/*   */       case 7:
/*   */         arrayOfFloat[9] = f2;
/*   */         arrayOfFloat[0] = f3;
/*   */         arrayOfFloat[2] = f4;
/*   */         arrayOfFloat[4] = f5;
/*   */         arrayOfFloat[6] = f1;
/*   */       case 6:
/*   */         arrayOfFloat[8] = f2;
/*   */         arrayOfFloat[1] = f3;
/*   */         arrayOfFloat[2] = f4;
/*   */         arrayOfFloat[5] = f5;
/*   */         arrayOfFloat[6] = f1;
/*   */       case 5:
/*   */         arrayOfFloat[6] = f2;
/*   */         arrayOfFloat[0] = f3;
/*   */         arrayOfFloat[1] = f4;
/*   */         arrayOfFloat[8] = f5;
/*   */         arrayOfFloat[9] = f1;
/*   */       case 4:
/*   */         arrayOfFloat[5] = f2;
/*   */         arrayOfFloat[0] = f3;
/*   */         arrayOfFloat[2] = f4;
/*   */         arrayOfFloat[8] = f5;
/*   */         arrayOfFloat[10] = f1;
/*   */       case 3:
/*   */         arrayOfFloat[4] = f2;
/*   */         arrayOfFloat[1] = f3;
/*   */         arrayOfFloat[2] = f4;
/*   */         arrayOfFloat[9] = f5;
/*   */         arrayOfFloat[10] = f1;
/*   */       case 2:
/*   */         arrayOfFloat[2] = f2;
/*   */         arrayOfFloat[4] = f3;
/*   */         arrayOfFloat[5] = f4;
/*   */         arrayOfFloat[8] = f5;
/*   */         arrayOfFloat[9] = f1;
/*   */       case 1:
/*   */         arrayOfFloat[1] = f2;
/*   */         arrayOfFloat[4] = f3;
/*   */         arrayOfFloat[6] = f4;
/*   */         arrayOfFloat[8] = f5;
/*   */         arrayOfFloat[10] = f1;
/*   */       case 0:
/*   */         break; }
/*   */     
/*   */     arrayOfFloat[0] = f2;
/*   */     arrayOfFloat[5] = f3;
/*   */     arrayOfFloat[6] = f4;
/*   */     arrayOfFloat[9] = f5;
/*   */     arrayOfFloat[10] = f1; }
/*   */ 
/*   */   
/*   */   public int Ss;
/*   */   public float l60;
/*   */   public float qr;
/*   */   
/*   */   public SJ(ByteBuffer paramByteBuffer) {
/*   */     this.Ss = paramByteBuffer.getShort() & 0xFFFF;
/*   */     this.l60 = paramByteBuffer.getShort() / 4096.0F;
/*   */     this.qr = paramByteBuffer.getShort() / 4096.0F;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/SJ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */