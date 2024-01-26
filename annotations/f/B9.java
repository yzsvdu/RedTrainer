/* 1 */ package f;public final class B9 implements Externalizable { public static final long serialVersionUID = 1L; public byte[] COM8; public int y90; public final byte[] m9() { boolean bool = false; int i; byte[] arrayOfByte = new byte[i = this.y90]; if (this.y90 != 0) { if (i > 0)
/* 2 */       { System.arraycopy(this.COM8, bool, arrayOfByte, 0, i); return arrayOfByte; }  throw new ArrayIndexOutOfBoundsException(bool); }  return arrayOfByte; } public byte nY; public B9() { this(10, 0); } public B9(int paramInt) { this(4, 0); } public B9(int paramInt1, int paramInt2) { this.COM8 = new byte[paramInt1]; this.y90 = 0; this.nY = 0; } public final boolean equals(Object paramObject) { if (paramObject == this) return true;  if (paramObject instanceof B9) { int i; if (((B9)(paramObject = paramObject)).y90 != (i = this.y90)) return false;  while (i-- > 0) { if (this
/* 3 */           .COM8[i] != ((B9)paramObject).COM8[i]) return false;  }  return true; }  return false; }
/*   */ 
/*   */   
/*   */   public final int hashCode() {
/*   */     int i = 0;
/*   */     int j = this.y90;
/*   */     while (j-- > 0)
/*   */       i += this.COM8[j]; 
/*   */     return i;
/*   */   }
/*   */   
/*   */   public final String toString() {
/*   */     this("{");
/*   */     StringBuilder stringBuilder;
/*   */     int i, j;
/*   */     for (i = 0, j = this.y90 - 1; i < j; ) {
/*   */       stringBuilder.append(this.COM8[i]);
/*   */       stringBuilder.append(", ");
/*   */       i++;
/*   */     } 
/*   */     if ((i = this.y90) > 0)
/*   */       stringBuilder.append(this.COM8[i - 1]); 
/*   */     stringBuilder.append("}");
/*   */     return stringBuilder.toString();
/*   */   }
/*   */   
/*   */   public final void writeExternal(ObjectOutput paramObjectOutput) {
/*   */     paramObjectOutput.writeByte(0);
/*   */     paramObjectOutput.writeInt(this.y90);
/*   */     paramObjectOutput.writeByte(this.nY);
/*   */     int i;
/*   */     paramObjectOutput.writeInt(i = this.COM8.length);
/*   */     for (byte b = 0; b < i; b++)
/*   */       paramObjectOutput.writeByte(this.COM8[b]); 
/*   */   }
/*   */   
/*   */   public final void readExternal(ObjectInput paramObjectInput) {
/*   */     paramObjectInput.readByte();
/*   */     this.y90 = paramObjectInput.readInt();
/*   */     this.nY = paramObjectInput.readByte();
/*   */     int i;
/*   */     this.COM8 = new byte[i = paramObjectInput.readInt()];
/*   */     for (byte b = 0; b < i; b++)
/*   */       this.COM8[b] = paramObjectInput.readByte(); 
/*   */   }
/*   */   
/*   */   public final void Be(byte paramByte) {
/*   */     int j;
/*   */     byte[] arrayOfByte;
/*   */     if ((j = this.y90 + 1) > (arrayOfByte = this.COM8).length) {
/*   */       byte[] arrayOfByte1 = new byte[Math.max(arrayOfByte.length << 1, j)];
/*   */       int k = this.COM8.length;
/*   */       System.arraycopy(this.COM8, 0, arrayOfByte1, 0, k);
/*   */       this.COM8 = arrayOfByte1;
/*   */     } 
/*   */     int i;
/*   */     this.y90 = (i = this.y90) + 1;
/*   */     this.COM8[i] = paramByte;
/*   */   }
/*   */   
/*   */   public final void Ny0(byte paramByte) {
/*   */     int j;
/*   */     for (int i = 0; i < (j = this.y90); ) {
/*   */       byte[] arrayOfByte;
/*   */       if (paramByte == (arrayOfByte = this.COM8)[i]) {
/*   */         paramByte = 1;
/*   */         if (i >= 0 && i < j) {
/*   */           if (i == 0) {
/*   */             i = j - paramByte;
/*   */             System.arraycopy(arrayOfByte, paramByte, arrayOfByte, 0, i);
/*   */           } else if (j - paramByte != i) {
/*   */             int k = j - (j = i + paramByte);
/*   */             System.arraycopy(arrayOfByte, j, arrayOfByte, i, k);
/*   */           } 
/*   */           this.y90 -= paramByte;
/*   */           return;
/*   */         } 
/*   */         throw new ArrayIndexOutOfBoundsException(i);
/*   */       } 
/*   */       i++;
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/B9.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */