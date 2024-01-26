/* 1 */ package f;public final class h30 extends EA0 implements fr0 { public static final long serialVersionUID = 1L; public transient short[] Qz0; public final short st(short paramShort1, short paramShort2) { short s = this.CB0; boolean bool = true; int i; if ((i = sq(paramShort1)) < 0) { i = -i - 1; s = this.Qz0[i]; bool = false; }  this.Qz0[i] = paramShort2; if (bool) xt0(this.Mw);  return s; } public final int J00(int paramInt) { this.Qz0 = new short[super.J00(paramInt)]; return super.J00(paramInt); } public final void Hj0(int paramInt) { short[] arrayOfShort1; int i = (arrayOfShort1 = this.h70).length; short[] arrayOfShort2 = this.Qz0; byte[] arrayOfByte = this.JO; this.h70 = new short[paramInt]; this.Qz0 = new short[paramInt]; this.JO = new byte[paramInt]; while (i-- > 0) { if (arrayOfByte[i] == 1) { int j = sq(arrayOfShort1[i]); this.Qz0[j] = arrayOfShort2[i]; }  }  } public final short Z90(short paramShort) { int i; return ((i = d80(paramShort)) < 0) ? this.CB0 : this.Qz0[i]; } public final void clear() { super.clear(); int j = this.h70.length; short s = this.X5; Arrays.fill(this.h70, 0, j, s); int i = this.Qz0.length; j = this.CB0; Arrays.fill(this.Qz0, 0, i, j); Arrays.fill(this.JO, 0, this.JO.length, (byte)0); } public final boolean equals(Object paramObject) { if (!(paramObject instanceof fr0)) return false;  if ((paramObject = paramObject).size() != this.ir0) return false; 
/* 2 */     byte[] arrayOfByte = this.JO;
/* 3 */     short s1 = this.CB0; short arrayOfShort[], s2; int i;
/* 4 */     for (s2 = paramObject.f6(), i = (arrayOfShort = this.Qz0).length; i-- > 0; ) { short s3 = paramObject.Z90(this.h70[i]); short s4; if (arrayOfByte[i] == 1 && (s4 = arrayOfShort[i]) != s3 && s4 != s1 && s3 != s2) return false;  }  return true; }
/*   */ 
/*   */   
/*   */   public final void Id(int paramInt) {
/*   */     this.Qz0[paramInt] = this.CB0;
/*   */     super.Id(paramInt);
/*   */   }
/*   */   
/*   */   public final boolean bM0(tI0 paramtI0) {
/*   */     byte[] arrayOfByte = this.JO;
/*   */     short[] arrayOfShort1 = this.Qz0;
/*   */     short[] arrayOfShort2;
/*   */     int i = (arrayOfShort2 = this.h70).length;
/*   */     while (i-- > 0) {
/*   */       short s = arrayOfShort2[i];
/*   */       if (arrayOfByte[i] == 1 && !paramtI0.s50(s, this[i]))
/*   */         return false; 
/*   */     } 
/*   */     return true;
/*   */   }
/*   */   
/*   */   public final int hashCode() {
/*   */     int i = 0;
/*   */     byte[] arrayOfByte = this.JO;
/*   */     int j = this.Qz0.length;
/*   */     while (j-- > 0) {
/*   */       if (arrayOfByte[j] == 1)
/*   */         i += this.h70[j] ^ this.Qz0[j]; 
/*   */     } 
/*   */     return i;
/*   */   }
/*   */   
/*   */   public final String toString() {
/*   */     this("{");
/*   */     StringBuilder stringBuilder;
/*   */     short[] arrayOfShort1;
/*   */     boolean bool;
/*   */     byte[] arrayOfByte;
/*   */     short[] arrayOfShort2;
/*   */     int i;
/*   */     for (bool = true, arrayOfByte = this.JO, arrayOfShort1 = this.Qz0, i = (arrayOfShort2 = this.h70).length; i-- > 0;) {
/*   */       if (arrayOfByte[i] == 1) {
/*   */         short s1 = arrayOfShort2[i], s2 = this[i];
/*   */         if (bool) {
/*   */           bool = false;
/*   */         } else {
/*   */           stringBuilder.append(", ");
/*   */         } 
/*   */         stringBuilder.append(s1);
/*   */         stringBuilder.append("=");
/*   */         stringBuilder.append(s2);
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
/*   */         paramObjectOutput.writeShort(this.h70[i]);
/*   */         paramObjectOutput.writeShort(this.Qz0[i]);
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
/*   */       short s = paramObjectInput.readShort();
/*   */       st(s, paramObjectInput.readShort());
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/h30.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */