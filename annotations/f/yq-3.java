/* 1 */ package f;public final class yq extends S30 { public final boolean equals(Object paramObject) { if (!(paramObject instanceof yq)) return false;  if (((zi0)(paramObject = paramObject)).ir0 != this
/* 2 */       .ir0) return false; 
/* 3 */     byte[] arrayOfByte = this.JO;
/* 4 */     long l1 = this.jD0;
/* 5 */     long l2 = ((S30)paramObject).jD0; long[] arrayOfLong;
/* 6 */     for (int i = (arrayOfLong = this.vU).length; i-- > 0; ) { long l3 = paramObject.Ns0(this.P6[i]); long l4; if (arrayOfByte[i] == 1 && (l4 = arrayOfLong[i]) != l3 && l4 != l1 && l3 != l2) return false;  }  return true; }
/*   */ 
/*   */   
/*   */   public static final long serialVersionUID = 1L;
/*   */   public transient long[] vU;
/*   */   
/*   */   public final int J00(int paramInt) {
/*   */     this.vU = new long[super.J00(paramInt)];
/*   */     return super.J00(paramInt);
/*   */   }
/*   */   
/*   */   public final void Hj0(int paramInt) {
/*   */     int[] arrayOfInt;
/*   */     int i = (arrayOfInt = this.P6).length;
/*   */     long[] arrayOfLong = this.vU;
/*   */     byte[] arrayOfByte = this.JO;
/*   */     this.P6 = new int[paramInt];
/*   */     this.vU = new long[paramInt];
/*   */     this.JO = new byte[paramInt];
/*   */     while (i-- > 0) {
/*   */       if (arrayOfByte[i] == 1) {
/*   */         int j = KD0(arrayOfInt[i]);
/*   */         this.vU[j] = arrayOfLong[i];
/*   */       } 
/*   */     } 
/*   */   }
/*   */   
/*   */   public final long Ns0(int paramInt) {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: getfield JO : [B
/*   */     //   4: dup
/*   */     //   5: iload_1
/*   */     //   6: swap
/*   */     //   7: aload_0
/*   */     //   8: getfield P6 : [I
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
/*   */     //   44: iaload
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
/*   */     //   103: getfield P6 : [I
/*   */     //   106: iload #5
/*   */     //   108: iaload
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
/*   */     //   138: getfield jD0 : J
/*   */     //   141: goto -> 150
/*   */     //   144: aload_0
/*   */     //   145: getfield vU : [J
/*   */     //   148: iload_3
/*   */     //   149: laload
/*   */     //   150: lreturn
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
/*   */     this.vU[paramInt] = this.jD0;
/*   */     super.Id(paramInt);
/*   */   }
/*   */   
/*   */   public final int hashCode() {
/*   */     int i = 0;
/*   */     byte[] arrayOfByte = this.JO;
/*   */     int j = this.vU.length;
/*   */     while (j-- > 0) {
/*   */       if (arrayOfByte[j] == 1)
/*   */         i += this.P6[j] ^ Yr0.H50(this.vU[j]); 
/*   */     } 
/*   */     return i;
/*   */   }
/*   */   
/*   */   public final String toString() {
/*   */     this("{");
/*   */     StringBuilder stringBuilder;
/*   */     long[] arrayOfLong;
/*   */     boolean bool;
/*   */     byte[] arrayOfByte;
/*   */     int arrayOfInt[], i;
/*   */     for (bool = true, arrayOfByte = this.JO, arrayOfLong = this.vU, i = (arrayOfInt = this.P6).length; i-- > 0;) {
/*   */       if (arrayOfByte[i] == 1) {
/*   */         int j = arrayOfInt[i];
/*   */         long l = this[i];
/*   */         if (bool) {
/*   */           bool = false;
/*   */         } else {
/*   */           stringBuilder.append(", ");
/*   */         } 
/*   */         stringBuilder.append(j);
/*   */         stringBuilder.append("=");
/*   */         stringBuilder.append(l);
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
/*   */         paramObjectOutput.writeInt(this.P6[i]);
/*   */         paramObjectOutput.writeLong(this.vU[i]);
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
/*   */       long l = paramObjectInput.readLong();
/*   */       boolean bool = true;
/*   */       if ((j = KD0(j)) < 0) {
/*   */         j = -j - 1;
/*   */         this.vU[j];
/*   */         bool = false;
/*   */       } 
/*   */       this.vU[j] = l;
/*   */       if (bool)
/*   */         xt0(this.z70); 
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/yq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */