/* 1 */ package f;public final class wx0 implements Externalizable { public static final long serialVersionUID = 1L; public short[] d90; public int Mp0; public final boolean F40(short paramShort) { int j; short[] arrayOfShort; if ((j = this.Mp0 + 1) > (arrayOfShort = this.d90).length) { short[] arrayOfShort1 = new short[Math.max(arrayOfShort.length << 1, j)]; int k = this.d90.length; System.arraycopy(this.d90, 0, arrayOfShort1, 0, k); this.d90 = arrayOfShort1; }
/* 2 */      int i; this.Mp0 = (i = this.Mp0) + 1; this.d90[i] = paramShort; return true; } public short w80; public wx0() { this(10, 0); } public wx0(int paramInt) { this(paramInt, 0); } public wx0(int paramInt1, int paramInt2) { this.d90 = new short[paramInt1]; this.Mp0 = 0; this.w80 = 0; } public final short[] M5() { boolean bool = false; int i; short[] arrayOfShort = new short[i = this.Mp0]; if (this.Mp0 != 0) { if (i > 0) { System.arraycopy(this.d90, bool, arrayOfShort, 0, i); return arrayOfShort; }  throw new ArrayIndexOutOfBoundsException(bool); }  return arrayOfShort; } public final boolean equals(Object paramObject) { if (paramObject == this) return true;  if (paramObject instanceof wx0) { int i; if (((wx0)(paramObject = paramObject)).Mp0 != (i = this.Mp0)) return false;  while (i-- > 0) { if (this
/* 3 */           .d90[i] != ((wx0)paramObject).d90[i]) return false;  }  return true; }  return false; }
/*   */ 
/*   */   
/*   */   public final int hashCode() {
/*   */     int i = 0;
/*   */     int j = this.Mp0;
/*   */     while (j-- > 0)
/*   */       i += this.d90[j]; 
/*   */     return i;
/*   */   }
/*   */   
/*   */   public final boolean COM1(short paramShort) {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: getfield Mp0 : I
/*   */     //   4: istore_2
/*   */     //   5: iload_2
/*   */     //   6: dup
/*   */     //   7: iconst_m1
/*   */     //   8: iadd
/*   */     //   9: istore_2
/*   */     //   10: ifle -> 26
/*   */     //   13: aload_0
/*   */     //   14: getfield d90 : [S
/*   */     //   17: iload_2
/*   */     //   18: saload
/*   */     //   19: iload_1
/*   */     //   20: if_icmpne -> 5
/*   */     //   23: goto -> 28
/*   */     //   26: iconst_m1
/*   */     //   27: istore_2
/*   */     //   28: iload_2
/*   */     //   29: iflt -> 36
/*   */     //   32: iconst_1
/*   */     //   33: goto -> 37
/*   */     //   36: iconst_0
/*   */     //   37: ireturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 1
/*   */     //   #2	-> 14
/*   */   }
/*   */   
/*   */   public final String toString() {
/*   */     this("{");
/*   */     StringBuilder stringBuilder;
/*   */     int i, j;
/*   */     for (i = 0, j = this.Mp0 - 1; i < j; ) {
/*   */       stringBuilder.append(this.d90[i]);
/*   */       stringBuilder.append(", ");
/*   */       i++;
/*   */     } 
/*   */     if ((i = this.Mp0) > 0)
/*   */       stringBuilder.append(this.d90[i - 1]); 
/*   */     stringBuilder.append("}");
/*   */     return stringBuilder.toString();
/*   */   }
/*   */   
/*   */   public final void writeExternal(ObjectOutput paramObjectOutput) {
/*   */     paramObjectOutput.writeByte(0);
/*   */     paramObjectOutput.writeInt(this.Mp0);
/*   */     paramObjectOutput.writeShort(this.w80);
/*   */     int i;
/*   */     paramObjectOutput.writeInt(i = this.d90.length);
/*   */     for (byte b = 0; b < i; b++)
/*   */       paramObjectOutput.writeShort(this.d90[b]); 
/*   */   }
/*   */   
/*   */   public final void readExternal(ObjectInput paramObjectInput) {
/*   */     paramObjectInput.readByte();
/*   */     this.Mp0 = paramObjectInput.readInt();
/*   */     this.w80 = paramObjectInput.readShort();
/*   */     int i;
/*   */     this.d90 = new short[i = paramObjectInput.readInt()];
/*   */     for (byte b = 0; b < i; b++)
/*   */       this.d90[b] = paramObjectInput.readShort(); 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/wx0.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */