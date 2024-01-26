/* 1 */ package f;public final class Xj0 extends i6 { public static final long serialVersionUID = 1L; public transient int[] YB0; public Xj0() {} public Xj0(int paramInt) { super(paramInt); } public final boolean Wr0(int paramInt) { return (VF0(paramInt) >= 0); } public final int J00(int paramInt) { this.YB0 = new int[super.J00(paramInt)]; return super.J00(paramInt); } public final void Hj0(int paramInt) { int[] arrayOfInt1; int i = (arrayOfInt1 = this.R3).length; int[] arrayOfInt2 = this.YB0; byte[] arrayOfByte = this.JO; this.R3 = new int[paramInt]; this.YB0 = new int[paramInt]; this.JO = new byte[paramInt]; while (i-- > 0) { if (arrayOfByte[i] == 1) { int j = Fh0(arrayOfInt1[i]); this.YB0[j] = arrayOfInt2[i]; }  }  } public final int xC(int paramInt) { return ((paramInt = VF0(paramInt)) < 0) ? this.r90 : this.YB0[paramInt]; } public final void clear() { super.clear(); int j = this.R3.length; int k = this.pU; Arrays.fill(this.R3, 0, j, k); int i = this.YB0.length; j = this.r90; Arrays.fill(this.YB0, 0, i, j); Arrays.fill(this.JO, 0, this.JO.length, (byte)0); } public final void Id(int paramInt) { this.YB0[paramInt] = this.r90; super.Id(paramInt); } public final boolean equals(Object paramObject) { if (!(paramObject instanceof Xj0)) return false;  if (((zi0)(paramObject = paramObject)).ir0 != this
/* 2 */       .ir0) return false; 
/* 3 */     byte[] arrayOfByte = this.JO;
/* 4 */     int i = this.r90;
/* 5 */     int j = ((i6)paramObject).r90; int[] arrayOfInt;
/* 6 */     for (int k = (arrayOfInt = this.YB0).length; k-- > 0; ) { int m = paramObject.xC(this.R3[k]); int n; if (arrayOfByte[k] == 1 && (n = arrayOfInt[k]) != m && n != i && m != j) return false;  }  return true; }
/*   */ 
/*   */   
/*   */   public final int hashCode() {
/*   */     int i = 0;
/*   */     byte[] arrayOfByte = this.JO;
/*   */     int j = this.YB0.length;
/*   */     while (j-- > 0) {
/*   */       if (arrayOfByte[j] == 1)
/*   */         i += this.R3[j] ^ this.YB0[j]; 
/*   */     } 
/*   */     return i;
/*   */   }
/*   */   
/*   */   public final String toString() {
/*   */     this("{");
/*   */     StringBuilder stringBuilder;
/*   */     int[] arrayOfInt1;
/*   */     boolean bool;
/*   */     byte[] arrayOfByte;
/*   */     int arrayOfInt2[], i;
/*   */     for (bool = true, arrayOfByte = this.JO, arrayOfInt1 = this.YB0, i = (arrayOfInt2 = this.R3).length; i-- > 0;) {
/*   */       if (arrayOfByte[i] == 1) {
/*   */         int j = arrayOfInt2[i], k = this[i];
/*   */         if (bool) {
/*   */           bool = false;
/*   */         } else {
/*   */           stringBuilder.append(", ");
/*   */         } 
/*   */         stringBuilder.append(j);
/*   */         stringBuilder.append("=");
/*   */         stringBuilder.append(k);
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
/*   */         paramObjectOutput.writeInt(this.R3[i]);
/*   */         paramObjectOutput.writeInt(this.YB0[i]);
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
/*   */       B3(j, paramObjectInput.readInt());
/*   */     } 
/*   */   }
/*   */   
/*   */   public final void B3(int paramInt1, int paramInt2) {
/*   */     boolean bool = true;
/*   */     if ((paramInt1 = Fh0(paramInt1)) < 0) {
/*   */       paramInt1 = -paramInt1 - 1;
/*   */       this.YB0[paramInt1];
/*   */       bool = false;
/*   */     } 
/*   */     this.YB0[paramInt1] = paramInt2;
/*   */     if (bool)
/*   */       xt0(this.wo); 
/*   */   }
/*   */   
/*   */   public final void Lh0(int paramInt) {
/*   */     paramInt = 1;
/*   */     boolean bool = true;
/*   */     int i = -i - 1;
/*   */     this.YB0[i] = this.YB0[i] + paramInt;
/*   */     this.YB0[i] = bool;
/*   */     this.JO[i];
/*   */     if (!((i = Fh0(paramInt)) < 0))
/*   */       xt0(this.wo); 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Xj0.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */