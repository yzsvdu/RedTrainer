/* 1 */ package f;public final class Qr extends vo0 { public static final long serialVersionUID = 1L; public transient int[] FH0; public final int J00(int paramInt) { this.FH0 = new int[super.J00(paramInt)]; return super.J00(paramInt); } public final boolean gS(short paramShort) { boolean bool; if (Ke0(paramShort) >= 0) { bool = true; } else { bool = false; }  return bool; } public final void Hj0(int paramInt) { short[] arrayOfShort; int i = (arrayOfShort = this.i10).length; int[] arrayOfInt = this.FH0; byte[] arrayOfByte = this.JO; this.i10 = new short[paramInt]; this.FH0 = new int[paramInt]; this.JO = new byte[paramInt]; while (i-- > 0) { if (arrayOfByte[i] == 1) { int j = sE0(arrayOfShort[i]); this.FH0[j] = arrayOfInt[i]; }  }  } public final int X60(short paramShort) { int i; return ((i = Ke0(paramShort)) < 0) ? this.Dk0 : this.FH0[i]; } public final void Id(int paramInt) { this.FH0[paramInt] = this.Dk0; super.Id(paramInt); } public final boolean equals(Object paramObject) { if (!(paramObject instanceof Qr)) return false;  if (((zi0)(paramObject = paramObject)).ir0 != this
/* 2 */       .ir0) return false; 
/* 3 */     byte[] arrayOfByte = this.JO;
/* 4 */     int i = this.Dk0;
/* 5 */     int j = ((vo0)paramObject).Dk0; int[] arrayOfInt;
/* 6 */     for (int k = (arrayOfInt = this.FH0).length; k-- > 0; ) { int m = paramObject.X60(this.i10[k]); int n; if (arrayOfByte[k] == 1 && (n = arrayOfInt[k]) != m && n != i && m != j) return false;  }  return true; }
/*   */ 
/*   */   
/*   */   public final int hashCode() {
/*   */     int i = 0;
/*   */     byte[] arrayOfByte = this.JO;
/*   */     int j = this.FH0.length;
/*   */     while (j-- > 0) {
/*   */       if (arrayOfByte[j] == 1)
/*   */         i += this.i10[j] ^ this.FH0[j]; 
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
/*   */     short[] arrayOfShort;
/*   */     int i;
/*   */     for (bool = true, arrayOfByte = this.JO, arrayOfInt = this.FH0, i = (arrayOfShort = this.i10).length; i-- > 0;) {
/*   */       if (arrayOfByte[i] == 1) {
/*   */         short s = arrayOfShort[i];
/*   */         int j = this[i];
/*   */         if (bool) {
/*   */           bool = false;
/*   */         } else {
/*   */           stringBuilder.append(", ");
/*   */         } 
/*   */         stringBuilder.append(s);
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
/*   */         paramObjectOutput.writeShort(this.i10[i]);
/*   */         paramObjectOutput.writeInt(this.FH0[i]);
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
/*   */       RD(paramObjectInput.readInt(), s);
/*   */     } 
/*   */   }
/*   */   
/*   */   public final void RD(int paramInt, short paramShort) {
/*   */     boolean bool = true;
/*   */     int i;
/*   */     if ((i = sE0(paramShort)) < 0) {
/*   */       i = -i - 1;
/*   */       this.FH0[i];
/*   */       bool = false;
/*   */     } 
/*   */     this.FH0[i] = paramInt;
/*   */     if (bool)
/*   */       xt0(this.UO); 
/*   */   }
/*   */   
/*   */   public Qr() {}
/*   */   
/*   */   public Qr(int paramInt) {
/*   */     super(paramInt);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Qr.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */