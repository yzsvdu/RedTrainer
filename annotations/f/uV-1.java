/* 1 */ package f;public final class uV extends yF0 { public static final long serialVersionUID = 1L; public transient short[] Wa0; public final boolean sz0(int paramInt) { return (ls(paramInt) >= 0); } public final int J00(int paramInt) { this.Wa0 = new short[super.J00(paramInt)]; return super.J00(paramInt); } public final void Hj0(int paramInt) { int[] arrayOfInt; int i = (arrayOfInt = this.bG).length; short[] arrayOfShort = this.Wa0; byte[] arrayOfByte = this.JO; this.bG = new int[paramInt]; this.Wa0 = new short[paramInt]; this.JO = new byte[paramInt]; while (i-- > 0) { if (arrayOfByte[i] == 1) { int j = IR(arrayOfInt[i]); this.Wa0[j] = arrayOfShort[i]; }  }  } public final void Id(int paramInt) { this.Wa0[paramInt] = this.Oc0; super.Id(paramInt); } public final boolean equals(Object paramObject) { if (!(paramObject instanceof uV)) return false;  if (((zi0)(paramObject = paramObject)).ir0 != this
/* 2 */       .ir0) return false; 
/* 3 */     byte[] arrayOfByte = this.JO;
/* 4 */     short s1 = this.Oc0, s2 = ((yF0)paramObject).Oc0; short[] arrayOfShort;
/* 5 */     for (int i = (arrayOfShort = this.Wa0).length; i-- > 0;) { if (arrayOfByte[i] == 1)
/* 6 */       { int j; if ((j = paramObject.ls(this.bG[i])) < 0) { j = ((yF0)paramObject).Oc0; } else { j = ((uV)paramObject).Wa0[j]; }
/* 7 */          short s; if ((s = arrayOfShort[i]) != j && s != s1 && j != s2) return false;  }  }  return true; }
/*   */ 
/*   */   
/*   */   public final int hashCode() {
/*   */     int i = 0;
/*   */     byte[] arrayOfByte = this.JO;
/*   */     int j = this.Wa0.length;
/*   */     while (j-- > 0) {
/*   */       if (arrayOfByte[j] == 1)
/*   */         i += this.bG[j] ^ this.Wa0[j]; 
/*   */     } 
/*   */     return i;
/*   */   }
/*   */   
/*   */   public final String toString() {
/*   */     this("{");
/*   */     StringBuilder stringBuilder;
/*   */     short[] arrayOfShort;
/*   */     boolean bool;
/*   */     byte[] arrayOfByte;
/*   */     int arrayOfInt[], i;
/*   */     for (bool = true, arrayOfByte = this.JO, arrayOfShort = this.Wa0, i = (arrayOfInt = this.bG).length; i-- > 0;) {
/*   */       if (arrayOfByte[i] == 1) {
/*   */         int j = arrayOfInt[i];
/*   */         short s = this[i];
/*   */         if (bool) {
/*   */           bool = false;
/*   */         } else {
/*   */           stringBuilder.append(", ");
/*   */         } 
/*   */         stringBuilder.append(j);
/*   */         stringBuilder.append("=");
/*   */         stringBuilder.append(s);
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
/*   */         paramObjectOutput.writeInt(this.bG[i]);
/*   */         paramObjectOutput.writeShort(this.Wa0[i]);
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
/*   */       Hr(j, paramObjectInput.readShort());
/*   */     } 
/*   */   }
/*   */   
/*   */   public final void Hr(int paramInt, short paramShort) {
/*   */     boolean bool = true;
/*   */     if ((paramInt = IR(paramInt)) < 0) {
/*   */       paramInt = -paramInt - 1;
/*   */       this.Wa0[paramInt];
/*   */       bool = false;
/*   */     } 
/*   */     this.Wa0[paramInt] = paramShort;
/*   */     if (bool)
/*   */       xt0(this.PI); 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/uV.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */