/* 1 */ package f;public final class ib0 extends lB { public static final long serialVersionUID = 1L; public transient float[] BX; public ib0() {} public final boolean v0(int paramInt) { return (u10(paramInt) >= 0); } public ib0(int paramInt) { super(paramInt); } public final int J00(int paramInt) { this.BX = new float[super.J00(paramInt)]; return super.J00(paramInt); } public final void Hj0(int paramInt) { int[] arrayOfInt; int i = (arrayOfInt = this.fm).length; float[] arrayOfFloat = this.BX; byte[] arrayOfByte = this.JO; this.fm = new int[paramInt]; this.BX = new float[paramInt]; this.JO = new byte[paramInt]; while (i-- > 0) { if (arrayOfByte[i] == 1) { int j = A60(arrayOfInt[i]); this.BX[j] = arrayOfFloat[i]; }  }  } public final void Id(int paramInt) { this.BX[paramInt] = this.Mn0; super.Id(paramInt); } public final boolean equals(Object paramObject) { if (!(paramObject instanceof ib0)) return false;  if (((zi0)(paramObject = paramObject)).ir0 != this
/* 2 */       .ir0) return false; 
/* 3 */     byte[] arrayOfByte = this.JO;
/* 4 */     float f1 = this.Mn0, f2 = ((lB)paramObject).Mn0; float[] arrayOfFloat;
/* 5 */     for (int i = (arrayOfFloat = this.BX).length; i-- > 0;) { if (arrayOfByte[i] == 1)
/* 6 */       { float f3; int j; if ((j = paramObject.u10(this.fm[i])) < 0) { f3 = ((lB)paramObject).Mn0; } else { f3 = ((ib0)paramObject).BX[f3]; }
/* 7 */          float f4; if ((f4 = arrayOfFloat[i]) != f3 && f4 != f1 && f3 != f2) return false;  }  }  return true; }
/*   */ 
/*   */   
/*   */   public final int hashCode() {
/*   */     int i;
/*   */     byte[] arrayOfByte;
/*   */     int j;
/*   */     for (i = 0, arrayOfByte = this.JO, j = this.BX.length; j-- > 0;) {
/*   */       if (arrayOfByte[j] == 1) {
/*   */         int k = this.fm[j];
/*   */         float f = this.BX[j];
/*   */         if (Yr0.s00 || !Float.isNaN(f)) {
/*   */           i += k ^ Float.floatToIntBits(f * 6.6360896E8F);
/*   */           continue;
/*   */         } 
/*   */         throw new AssertionError("Values of NaN are not supported.");
/*   */       } 
/*   */     } 
/*   */     return i;
/*   */   }
/*   */   
/*   */   public final String toString() {
/*   */     this("{");
/*   */     StringBuilder stringBuilder;
/*   */     float[] arrayOfFloat;
/*   */     boolean bool;
/*   */     byte[] arrayOfByte;
/*   */     int arrayOfInt[], i;
/*   */     for (bool = true, arrayOfByte = this.JO, arrayOfFloat = this.BX, i = (arrayOfInt = this.fm).length; i-- > 0;) {
/*   */       if (arrayOfByte[i] == 1) {
/*   */         int j = arrayOfInt[i];
/*   */         float f = this[i];
/*   */         if (bool) {
/*   */           bool = false;
/*   */         } else {
/*   */           stringBuilder.append(", ");
/*   */         } 
/*   */         stringBuilder.append(j);
/*   */         stringBuilder.append("=");
/*   */         stringBuilder.append(f);
/*   */       } 
/*   */     } 
/*   */     stringBuilder.append("}");
/*   */     return stringBuilder.toString();
/*   */   }
/*   */   
/*   */   public final void writeExternal(ObjectOutput paramObjectOutput) {
/*   */     paramObjectOutput.writeByte(0);
/*   */     super.writeExternal(paramObjectOutput);
/*   */     paramObjectOutput.writeInt(this.ir0);
/*   */     int i = this.JO.length;
/*   */     while (i-- > 0) {
/*   */       if (this.JO[i] == 1) {
/*   */         paramObjectOutput.writeInt(this.fm[i]);
/*   */         paramObjectOutput.writeFloat(this.BX[i]);
/*   */       } 
/*   */     } 
/*   */   }
/*   */   
/*   */   public final void readExternal(ObjectInput paramObjectInput) {
/*   */     paramObjectInput.readByte();
/*   */     super.readExternal(paramObjectInput);
/*   */     int i;
/*   */     J00(i = paramObjectInput.readInt());
/*   */     while (i-- > 0) {
/*   */       int j = paramObjectInput.readInt();
/*   */       ma0(j, paramObjectInput.readFloat());
/*   */     } 
/*   */   }
/*   */   
/*   */   public final void ma0(int paramInt, float paramFloat) {
/*   */     boolean bool = true;
/*   */     if ((paramInt = A60(paramInt)) < 0) {
/*   */       paramInt = -paramInt - 1;
/*   */       this.BX[paramInt];
/*   */       bool = false;
/*   */     } 
/*   */     this.BX[paramInt] = paramFloat;
/*   */     if (bool)
/*   */       xt0(this.QC0); 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ib0.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */