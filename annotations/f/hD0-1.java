/* 1 */ package f;public final class hD0 { public final Matrix4 tC() { short s2 = (short)(s2 >> 3), s3 = (short)(s3 >> 3), s4 = (short)(s4 >> 3), s5 = (short)(s5 >> 3), s1 = (short)(s1 >> 3); short arrayOfShort[], s6 = (short)((short)((short)((short)((short)((short)(((s2 = (arrayOfShort = this.VC)[4]) & 0x7) << 3 | (s3 = this[0]) & 0x7) << 3 | (s4 = this[1]) & 0x7) << 3 | (s5 = this[2]) & 0x7) << 3 | (s1 = this[3]) & 0x7) << 3) >> 3); Matrix4 matrix4; (matrix4 = YF0.tp0).WU(); float f1 = s3; arrayOfFloat2[0] = f1; float f2 = s4; arrayOfFloat2[1] = f2; float f3 = s5; arrayOfFloat2[2] = f3; float f4 = s1; arrayOfFloat2[4] = f4; float f5 = s2; arrayOfFloat2[5] = f5; float f6 = s6; float[] arrayOfFloat2; (arrayOfFloat2 = YF0.tp0.Z0)[6] = f6; eo eo;
/* 2 */     f2 = (f1 = ((eo = YF0.GE).TG0(f1, f2, f3)).y) * f6; f2 -= f3 * f5; f3 = (f3 = ((eo = YF0.GE).TG0(f1, f2, f3)).z) * f4; float f7 = ((eo = YF0.GE).TG0(f1, f2, f3)).x; f2 = f3 - f7 * f6; (eo = YF0.GE).TG0(f1, f2, f3).TG0(f2, f2, f7 * f5 - f1 * f4);
/* 3 */     this[8] = eo.x / 4096.0F; this[9] = eo.y / 4096.0F; float[] arrayOfFloat1; (arrayOfFloat1 = YF0.tp0.Z0)[10] = eo.z / 4096.0F;
/* 4 */     return new Matrix4(matrix4); }
/*   */ 
/*   */   
/*   */   public short[] VC = new short[5];
/*   */   
/*   */   public hD0(ByteBuffer paramByteBuffer) {
/*   */     short[] arrayOfShort;
/*   */     for (byte b = 0; b < (arrayOfShort = this.VC).length; b++)
/*   */       arrayOfShort[b] = paramByteBuffer.getShort(); 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/hD0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */