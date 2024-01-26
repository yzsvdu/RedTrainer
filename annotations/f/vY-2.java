/* 1 */ package f;public final class vY extends vO { public final void rf0(ByteBuffer paramByteBuffer) { this.S80 = paramByteBuffer.getShort() & 0xFFFF; this.TK0 = dL.jv0(paramByteBuffer.getShort()); if ((this.S80 & 0x1) == 0) { float f = dL.Jd0(paramByteBuffer.getInt()); this.G8.TG0(dL.Jd0(paramByteBuffer.getInt()), f, dL.Jd0(paramByteBuffer.getInt())); }  if (((this.S80 & 0x2) == 0))
/* 2 */     { float f; Matrix4 matrix4 = (new Matrix4()).WU();
/* 3 */       if (((this.S80 & 0x8) != 0)) { sX sX; float[] arrayOfFloat; this
/* 4 */           .oB0 = dL.jv0(paramByteBuffer.getShort()); float f1 = dL.jv0(paramByteBuffer.getShort()); int i = this.S80 >> 4 & 0xF; float f4 = this.oB0; int j; if (((j = this.S80 >> 8 & 0xF) & 0x1) == 0) { f5 = 1.0F; } else { f5 = -1.0F; }  if ((j >> 1 & 0x1) == 0) { f6 = f1; } else { f6 = -f1; }  if ((j >> 2 & 0x1) == 0) { f3 = f4; } else { f3 = -f4; }  switch (i) { default: (arrayOfFloat = new float[9])[0] = 0.0F; (new float[9])[1] = 0.0F; (new float[9])[2] = 0.0F; (new float[9])[3] = 0.0F; (new float[9])[4] = 0.0F; (new float[9])[5] = 0.0F; (new float[9])[6] = 0.0F; (new float[9])[7] = 0.0F; (new float[9])[8] = 0.0F; break;case 8: (arrayOfFloat = new float[9])[0] = f4; (new float[9])[1] = f1; (new float[9])[2] = 0.0F; (new float[9])[3] = f6; (new float[9])[4] = f3; (new float[9])[5] = 0.0F; (new float[9])[6] = 0.0F; (new float[9])[7] = 0.0F; (new float[9])[8] = f5; break;case 7: (arrayOfFloat = new float[9])[0] = f4; (new float[9])[1] = 0.0F; (new float[9])[2] = f1; (new float[9])[3] = f6; (new float[9])[4] = 0.0F; (new float[9])[5] = f3; (new float[9])[6] = 0.0F; (new float[9])[7] = f5; (new float[9])[8] = 0.0F; break;case 6: (arrayOfFloat = new float[9])[0] = 0.0F; (new float[9])[1] = f4; (new float[9])[2] = f1; (new float[9])[3] = 0.0F; (new float[9])[4] = f6; (new float[9])[5] = f3; (new float[9])[6] = f5; (new float[9])[7] = 0.0F; (new float[9])[8] = 0.0F; break;case 5: (arrayOfFloat = new float[9])[0] = f4; (new float[9])[1] = f1; (new float[9])[2] = 0.0F; (new float[9])[3] = 0.0F; (new float[9])[4] = 0.0F; (new float[9])[5] = f5; (new float[9])[6] = f6; (new float[9])[7] = f3; (new float[9])[8] = 0.0F; break;case 4: (arrayOfFloat = new float[9])[0] = f4; (new float[9])[1] = 0.0F; (new float[9])[2] = f1; (new float[9])[3] = 0.0F; (new float[9])[4] = f5; (new float[9])[5] = 0.0F; (new float[9])[6] = f6; (new float[9])[7] = 0.0F; (new float[9])[8] = f3; break;case 3: (arrayOfFloat = new float[9])[0] = 0.0F; (new float[9])[1] = f4; (new float[9])[2] = f1; (new float[9])[3] = f5; (new float[9])[4] = 0.0F; (new float[9])[5] = 0.0F; (new float[9])[6] = 0.0F; (new float[9])[7] = f6; (new float[9])[8] = f3; break;case 2: (arrayOfFloat = new float[9])[0] = 0.0F; (new float[9])[1] = 0.0F; (new float[9])[2] = f5; (new float[9])[3] = f4; (new float[9])[4] = f1; (new float[9])[5] = 0.0F; (new float[9])[6] = f6; (new float[9])[7] = f3; (new float[9])[8] = 0.0F; break;case 1: (arrayOfFloat = new float[9])[0] = 0.0F; (new float[9])[1] = f5; (new float[9])[2] = 0.0F; (new float[9])[3] = f4; (new float[9])[4] = 0.0F; (new float[9])[5] = f1; (new float[9])[6] = f6; (new float[9])[7] = 0.0F; (new float[9])[8] = f3; break;case 0: (arrayOfFloat = new float[9])[0] = f5; (new float[9])[1] = 0.0F; (new float[9])[2] = 0.0F; (new float[9])[3] = 0.0F; (new float[9])[4] = f4; (new float[9])[5] = f1; (new float[9])[6] = 0.0F; (new float[9])[7] = f6; (new float[9])[8] = f3; break; }  this(arrayOfFloat); this.z30.getClass();
/* 5 */         f = sX.h50[0]; float f2 = sX.h50[3], f3 = sX.h50[6]; f4 = sX.h50[1]; float f5 = sX.h50[4], f6 = sX.h50[7], f7 = sX.h50[2], f8 = sX.h50[5], f9 = sX.h50[8]; this.z30.hE0(false, f, f2, f3, f4, f5, f6, f7, f8, f9); } else { f
/* 6 */           .Z0[0] = this.TK0; f.Z0[1] = dL.jv0(paramByteBuffer.getShort()); this.eR.Z0[2] = dL.jv0(paramByteBuffer.getShort()); this.eR.Z0[4] = dL.jv0(paramByteBuffer.getShort()); this.eR.Z0[5] = dL.jv0(paramByteBuffer.getShort()); this.eR.Z0[6] = dL.jv0(paramByteBuffer.getShort()); this.eR.Z0[8] = dL.jv0(paramByteBuffer.getShort()); this.eR.Z0[9] = dL.jv0(paramByteBuffer.getShort()); this.eR.Z0[10] = dL.jv0(paramByteBuffer.getShort()); this.z30
/* 7 */           .dJ(false, this.eR); }  }  if ((this
/* 8 */       .S80 & 0x4) == 0) { float f2 = dL.Jd0(paramByteBuffer.getInt()); this.cJ.TG0(dL.Jd0(paramByteBuffer.getInt()), f2, dL.Jd0(paramByteBuffer.getInt())); float f1 = dL.Jd0(paramByteBuffer.getInt()); this.Wy.TG0(dL.Jd0(paramByteBuffer.getInt()), f1, dL.Jd0(paramByteBuffer.getInt())); }  eo eo1 = this.G8; TG0 tG0 = this.z30; eo eo2 = this.cJ; (new Matrix4()).WU().mT(this, tG0, eo2); }
/*   */ 
/*   */   
/*   */   public int S80;
/*   */   public float TK0;
/*   */   public eo G8 = new eo();
/*   */   public float oB0;
/*   */   public eo cJ = new eo(1.0F, 1.0F, 1.0F);
/*   */   public eo Wy = new eo(1.0F, 1.0F, 1.0F);
/*   */   public TG0 z30 = (new TG0()).Gl0();
/*   */   public Matrix4 qX = new Matrix4();
/*   */   public fQ D30 = new fQ();
/*   */   public fQ f6 = new fQ();
/*   */   public Matrix4 eR;
/*   */   
/*   */   public final void we0(ByteBuffer paramByteBuffer, int... paramVarArgs) {
/*   */     this.Vk = paramByteBuffer.getInt();
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/vY.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */