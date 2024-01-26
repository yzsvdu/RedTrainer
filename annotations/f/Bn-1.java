/* 1 */ package f;public final class Bn extends on0 { public final boolean equals(Object paramObject) { if (!(paramObject instanceof Bn)) return false;  if (((zi0)(paramObject = paramObject)).ir0 != this
/* 2 */       .ir0) return false; 
/* 3 */     byte[] arrayOfByte2 = this.JO;
/* 4 */     byte b1 = this.bi;
/* 5 */     byte b2 = ((on0)paramObject).bi; byte[] arrayOfByte1;
/* 6 */     for (int i = (arrayOfByte1 = this.JD).length; i-- > 0; ) { byte b3 = paramObject.K80(this.x20[i]); byte b4; if (arrayOfByte2[i] == 1 && (b4 = arrayOfByte1[i]) != b3 && b4 != b1 && b3 != b2) return false;  }  return true; }
/*   */ 
/*   */   
/*   */   public static final long serialVersionUID = 1L;
/*   */   public transient byte[] JD;
/*   */   
/*   */   public final int J00(int paramInt) {
/*   */     this.JD = new byte[super.J00(paramInt)];
/*   */     return super.J00(paramInt);
/*   */   }
/*   */   
/*   */   public final void Hj0(int paramInt) {
/*   */     short[] arrayOfShort;
/*   */     int i = (arrayOfShort = this.x20).length;
/*   */     byte[] arrayOfByte1 = this.JD;
/*   */     byte[] arrayOfByte2 = this.JO;
/*   */     this.x20 = new short[paramInt];
/*   */     this.JD = new byte[paramInt];
/*   */     this.JO = new byte[paramInt];
/*   */     while (i-- > 0) {
/*   */       if (arrayOfByte2[i] == 1) {
/*   */         int j = vA(arrayOfShort[i]);
/*   */         this.JD[j] = arrayOfByte1[i];
/*   */       } 
/*   */     } 
/*   */   }
/*   */   
/*   */   public final byte K80(short paramShort) {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: getfield JO : [B
/*   */     //   4: dup
/*   */     //   5: iload_1
/*   */     //   6: swap
/*   */     //   7: aload_0
/*   */     //   8: getfield x20 : [S
/*   */     //   11: astore_2
/*   */     //   12: arraylength
/*   */     //   13: istore_3
/*   */     //   14: ldc 2147483647
/*   */     //   16: iand
/*   */     //   17: dup
/*   */     //   18: istore #4
/*   */     //   20: iload_3
/*   */     //   21: irem
/*   */     //   22: dup
/*   */     //   23: istore_3
/*   */     //   24: baload
/*   */     //   25: dup
/*   */     //   26: istore #5
/*   */     //   28: ifne -> 36
/*   */     //   31: iconst_m1
/*   */     //   32: istore_3
/*   */     //   33: goto -> 133
/*   */     //   36: iload #5
/*   */     //   38: iconst_1
/*   */     //   39: if_icmpne -> 52
/*   */     //   42: aload_2
/*   */     //   43: iload_3
/*   */     //   44: saload
/*   */     //   45: iload_1
/*   */     //   46: if_icmpne -> 52
/*   */     //   49: goto -> 133
/*   */     //   52: aload_2
/*   */     //   53: arraylength
/*   */     //   54: dup
/*   */     //   55: istore_2
/*   */     //   56: iconst_2
/*   */     //   57: iload #4
/*   */     //   59: iconst_1
/*   */     //   60: invokestatic Zf : (IIII)I
/*   */     //   63: istore #4
/*   */     //   65: iload_3
/*   */     //   66: istore #5
/*   */     //   68: iload #5
/*   */     //   70: iload #4
/*   */     //   72: isub
/*   */     //   73: dup
/*   */     //   74: istore #5
/*   */     //   76: ifge -> 85
/*   */     //   79: iload #5
/*   */     //   81: iload_2
/*   */     //   82: iadd
/*   */     //   83: istore #5
/*   */     //   85: aload_0
/*   */     //   86: getfield JO : [B
/*   */     //   89: iload #5
/*   */     //   91: baload
/*   */     //   92: dup
/*   */     //   93: istore #6
/*   */     //   95: ifne -> 101
/*   */     //   98: goto -> 130
/*   */     //   101: iload_1
/*   */     //   102: aload_0
/*   */     //   103: getfield x20 : [S
/*   */     //   106: iload #5
/*   */     //   108: saload
/*   */     //   109: if_icmpne -> 124
/*   */     //   112: iload #6
/*   */     //   114: iconst_2
/*   */     //   115: if_icmpeq -> 124
/*   */     //   118: iload #5
/*   */     //   120: istore_3
/*   */     //   121: goto -> 133
/*   */     //   124: iload #5
/*   */     //   126: iload_3
/*   */     //   127: if_icmpne -> 68
/*   */     //   130: goto -> 31
/*   */     //   133: iload_3
/*   */     //   134: ifge -> 144
/*   */     //   137: aload_0
/*   */     //   138: getfield bi : B
/*   */     //   141: goto -> 150
/*   */     //   144: aload_0
/*   */     //   145: getfield JD : [B
/*   */     //   148: iload_3
/*   */     //   149: baload
/*   */     //   150: ireturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 1
/*   */     //   #2	-> 53
/*   */     //   #3	-> 60
/*   */     //   #4	-> 86
/*   */     //   #5	-> 138
/*   */   }
/*   */   
/*   */   public final void Id(int paramInt) {
/*   */     this.JD[paramInt] = this.bi;
/*   */     super.Id(paramInt);
/*   */   }
/*   */   
/*   */   public final int hashCode() {
/*   */     int i = 0;
/*   */     byte[] arrayOfByte = this.JO;
/*   */     int j = this.JD.length;
/*   */     while (j-- > 0) {
/*   */       if (arrayOfByte[j] == 1)
/*   */         i += this.x20[j] ^ this.JD[j]; 
/*   */     } 
/*   */     return i;
/*   */   }
/*   */   
/*   */   public final String toString() {
/*   */     this("{");
/*   */     StringBuilder stringBuilder;
/*   */     byte[] arrayOfByte1;
/*   */     boolean bool;
/*   */     byte[] arrayOfByte2;
/*   */     short[] arrayOfShort;
/*   */     int i;
/*   */     for (bool = true, arrayOfByte2 = this.JO, arrayOfByte1 = this.JD, i = (arrayOfShort = this.x20).length; i-- > 0;) {
/*   */       if (arrayOfByte2[i] == 1) {
/*   */         short s = arrayOfShort[i];
/*   */         byte b = this[i];
/*   */         if (bool) {
/*   */           bool = false;
/*   */         } else {
/*   */           stringBuilder.append(", ");
/*   */         } 
/*   */         stringBuilder.append(s);
/*   */         stringBuilder.append("=");
/*   */         stringBuilder.append(b);
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
/*   */         paramObjectOutput.writeShort(this.x20[i]);
/*   */         paramObjectOutput.writeByte(this.JD[i]);
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
/*   */       byte b = paramObjectInput.readByte();
/*   */       boolean bool = true;
/*   */       int j;
/*   */       if ((j = vA(s)) < 0) {
/*   */         j = -j - 1;
/*   */         this.JD[j];
/*   */         bool = false;
/*   */       } 
/*   */       this.JD[j] = b;
/*   */       if (bool)
/*   */         xt0(this.iO); 
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Bn.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */