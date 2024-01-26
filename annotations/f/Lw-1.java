/*   */ package f;
/* 2 */ public final class Lw extends sB implements fF0 { public static final long serialVersionUID = 1L; public final boolean Ye0(short paramShort) { if (WY(paramShort) < 0) return false;  xt0(this.Ru0); return true; } public final boolean qI0(short paramShort) { int i; if ((i = kc0(paramShort)) >= 0) { Id(i); return true; }  return false; } public final short[] YH() { short[] arrayOfShort1; short[] arrayOfShort2; byte[] arrayOfByte; int i; int j; for (arrayOfShort1 = new short[this.ir0], arrayOfShort2 = this.yG0, i = (arrayOfByte = this.JO).length, j = 0; i-- > 0;) { if (arrayOfByte[i] == 1) { int k = j + 1; this[j] = arrayOfShort2[i]; j = k; }  }  return this; } public final void clear() { super.clear(); byte[] arrayOfByte = this.JO; short[] arrayOfShort; int i = (arrayOfShort = this.yG0).length; while (i-- > 0) { arrayOfShort[i] = this.yC0; arrayOfByte[i] = 0; }  } public final void Hj0(int paramInt) { short[] arrayOfShort; int i = (arrayOfShort = this.yG0).length; byte[] arrayOfByte = this.JO; this.yG0 = new short[paramInt]; this.JO = new byte[paramInt]; while (i-- > 0) { if (arrayOfByte[i] == 1) WY(arrayOfShort[i]);  }  } public final boolean equals(Object paramObject) { if (!(paramObject instanceof fF0)) return false;  if ((paramObject = paramObject).size() != this.ir0) return false;  for (int i = this.JO.length; i-- > 0;) { if (this.JO[i] == 1 && !paramObject.Fb(this.yG0[i])) return false;  }  return true; } public final int hashCode() { int i = 0; int j = this.JO.length; while (j-- > 0) { if (this.JO[j] == 1) i += this.yG0[j];  }  return i; } public final String toString() { this(this.ir0 * 2 + 2); StringBuilder stringBuilder; (new StringBuilder()).append("{"); int i = this.JO.length; byte b = 1; while (i-- > 0) { stringBuilder.append(this.yG0[i]); b++; if (this.JO[i] == 1 && b < this.ir0) stringBuilder.append(",");  }  stringBuilder.append("}"); return stringBuilder.toString(); } public final void writeExternal(ObjectOutput paramObjectOutput) { paramObjectOutput.writeByte(1); paramObjectOutput.writeByte(0); paramObjectOutput.writeFloat(this.ri0); paramObjectOutput.writeFloat(this.Q0); paramObjectOutput.writeInt(this.ir0); paramObjectOutput.writeFloat(this.ri0); paramObjectOutput.writeShort(this.yC0); for (int i = this.JO.length; i-- > 0;) { if (this.JO[i] == 1) paramObjectOutput.writeShort(this.yG0[i]);  }
/*   */      }
/*   */ 
/*   */   
/*   */   public final void readExternal(ObjectInput paramObjectInput) {
/*   */     super.readExternal(paramObjectInput);
/*   */     int i = paramObjectInput.readInt();
/*   */     this.ri0 = paramObjectInput.readFloat();
/*   */     this.yC0 = s;
/*   */     short s;
/*   */     if (paramObjectInput.readByte() >= 1 && (s = paramObjectInput.readShort()) != 0)
/*   */       Arrays.fill(this.yG0, s); 
/*   */     J00(i);
/*   */     while (i-- > 0)
/*   */       Ye0(paramObjectInput.readShort()); 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Lw.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */