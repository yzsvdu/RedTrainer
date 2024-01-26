/* 1 */ package f;public final class Lpt2 extends qP { public final boolean equals(Object paramObject) { if (!(paramObject instanceof Lpt2)) return false;  if (((zi0)(paramObject = paramObject)).ir0 != this
/* 2 */       .ir0) return false; 
/* 3 */     byte[] arrayOfByte = this.JO;
/* 4 */     int i = this.Ux, j = ((qP)paramObject).Ux; int[] arrayOfInt;
/* 5 */     for (int k = (arrayOfInt = this.ng0).length; k-- > 0;) { if (arrayOfByte[k] == 1)
/* 6 */       { int m; if ((m = paramObject.wI(this.hh[k])) < 0) { m = ((qP)paramObject).Ux; } else { m = ((Lpt2)paramObject).ng0[m]; }
/* 7 */          int n; if ((n = arrayOfInt[k]) != m && n != i && m != j) return false;  }  }  return true; }
/*   */ 
/*   */   
/*   */   public static final long serialVersionUID = 1L;
/*   */   public transient int[] ng0;
/*   */   
/*   */   public final int J00(int paramInt) {
/*   */     this.ng0 = new int[super.J00(paramInt)];
/*   */     return super.J00(paramInt);
/*   */   }
/*   */   
/*   */   public final void Hj0(int paramInt) {
/*   */     long[] arrayOfLong;
/*   */     int i = (arrayOfLong = this.hh).length;
/*   */     int[] arrayOfInt = this.ng0;
/*   */     byte[] arrayOfByte = this.JO;
/*   */     this.hh = new long[paramInt];
/*   */     this.ng0 = new int[paramInt];
/*   */     this.JO = new byte[paramInt];
/*   */     while (i-- > 0) {
/*   */       if (arrayOfByte[i] == 1) {
/*   */         int j = tw(arrayOfLong[i]);
/*   */         this.ng0[j] = arrayOfInt[i];
/*   */       } 
/*   */     } 
/*   */   }
/*   */   
/*   */   public final void Id(int paramInt) {
/*   */     this.ng0[paramInt] = this.Ux;
/*   */     super.Id(paramInt);
/*   */   }
/*   */   
/*   */   public final int hashCode() {
/*   */     int i = 0;
/*   */     byte[] arrayOfByte = this.JO;
/*   */     int j = this.ng0.length;
/*   */     while (j-- > 0) {
/*   */       if (arrayOfByte[j] == 1)
/*   */         i += Yr0.H50(this.hh[j]) ^ this.ng0[j]; 
/*   */     } 
/*   */     return i;
/*   */   }
/*   */   
/*   */   public final String toString() {
/*   */     this("{");
/*   */     StringBuilder stringBuilder;
/*   */     int[] arrayOfInt;
/*   */     boolean bool;
/*   */     byte[] arrayOfByte;
/*   */     long[] arrayOfLong;
/*   */     int i;
/*   */     for (bool = true, arrayOfByte = this.JO, arrayOfInt = this.ng0, i = (arrayOfLong = this.hh).length; i-- > 0;) {
/*   */       if (arrayOfByte[i] == 1) {
/*   */         long l = arrayOfLong[i];
/*   */         int j = this[i];
/*   */         if (bool) {
/*   */           bool = false;
/*   */         } else {
/*   */           stringBuilder.append(", ");
/*   */         } 
/*   */         stringBuilder.append(l);
/*   */         stringBuilder.append("=");
/*   */         stringBuilder.append(j);
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
/*   */         paramObjectOutput.writeLong(this.hh[i]);
/*   */         paramObjectOutput.writeInt(this.ng0[i]);
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
/*   */       long l = paramObjectInput.readLong();
/*   */       int k = paramObjectInput.readInt();
/*   */       boolean bool = true;
/*   */       int j;
/*   */       if ((j = tw(l)) < 0) {
/*   */         j = -j - 1;
/*   */         this.ng0[j];
/*   */         bool = false;
/*   */       } 
/*   */       this.ng0[j] = k;
/*   */       if (bool)
/*   */         xt0(this.kO); 
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Lpt2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */