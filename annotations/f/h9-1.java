/* 1 */ package f;public final class h9 extends qU { public final boolean equals(Object paramObject) { if (!(paramObject instanceof h9)) return false;  if (((zi0)(paramObject = paramObject)).ir0 != this
/* 2 */       .ir0) return false; 
/* 3 */     for (int i = this.JO.length; i-- > 0;) { if (this.JO[i] == 1 && !paramObject.db0(this.Sx0[i])) return false;  }  return true; }
/*   */ 
/*   */   
/*   */   public static final long serialVersionUID = 1L;
/*   */   
/*   */   public h9() {}
/*   */   
/*   */   public h9(int paramInt) {
/*   */     super(paramInt);
/*   */   }
/*   */   
/*   */   public final void Hj0(int paramInt) {
/*   */     byte[] arrayOfByte1;
/*   */     int i = (arrayOfByte1 = this.Sx0).length;
/*   */     byte[] arrayOfByte2 = this.JO;
/*   */     this.Sx0 = new byte[paramInt];
/*   */     this.JO = new byte[paramInt];
/*   */     while (i-- > 0) {
/*   */       if (arrayOfByte2[i] == 1)
/*   */         nw(arrayOfByte1[i]); 
/*   */     } 
/*   */   }
/*   */   
/*   */   public final int hashCode() {
/*   */     int i = 0;
/*   */     int j = this.JO.length;
/*   */     while (j-- > 0) {
/*   */       if (this.JO[j] == 1)
/*   */         i += this.Sx0[j]; 
/*   */     } 
/*   */     return i;
/*   */   }
/*   */   
/*   */   public final String toString() {
/*   */     this(this.ir0 * 2 + 2);
/*   */     StringBuilder stringBuilder;
/*   */     (new StringBuilder()).append("{");
/*   */     int i = this.JO.length;
/*   */     byte b = 1;
/*   */     while (i-- > 0) {
/*   */       stringBuilder.append(this.Sx0[i]);
/*   */       b++;
/*   */       if (this.JO[i] == 1 && b < this.ir0)
/*   */         stringBuilder.append(","); 
/*   */     } 
/*   */     stringBuilder.append("}");
/*   */     return stringBuilder.toString();
/*   */   }
/*   */   
/*   */   public final void writeExternal(ObjectOutput paramObjectOutput) {
/*   */     paramObjectOutput.writeByte(1);
/*   */     paramObjectOutput.writeByte(0);
/*   */     paramObjectOutput.writeFloat(this.ri0);
/*   */     paramObjectOutput.writeFloat(this.Q0);
/*   */     paramObjectOutput.writeInt(this.ir0);
/*   */     paramObjectOutput.writeFloat(this.ri0);
/*   */     paramObjectOutput.writeByte(this.Qr);
/*   */     for (int i = this.JO.length; i-- > 0;) {
/*   */       if (this.JO[i] == 1)
/*   */         paramObjectOutput.writeByte(this.Sx0[i]); 
/*   */     } 
/*   */   }
/*   */   
/*   */   public final void readExternal(ObjectInput paramObjectInput) {
/*   */     super.readExternal(paramObjectInput);
/*   */     int i = paramObjectInput.readInt();
/*   */     this.ri0 = paramObjectInput.readFloat();
/*   */     this.Qr = b;
/*   */     byte b;
/*   */     if (paramObjectInput.readByte() >= 1 && (b = paramObjectInput.readByte()) != 0)
/*   */       Arrays.fill(this.Sx0, b); 
/*   */     J00(i);
/*   */     while (i-- > 0) {
/*   */       if (nw(paramObjectInput.readByte()) < 0)
/*   */         continue; 
/*   */       xt0(this.ma);
/*   */     } 
/*   */   }
/*   */   
/*   */   public final void vI0(byte[] paramArrayOfbyte) {
/*   */     for (int i = paramArrayOfbyte.length; i-- > 0; ) {
/*   */       if (nw(paramArrayOfbyte[i]) < 0)
/*   */         continue; 
/*   */       xt0(this.ma);
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/h9.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */