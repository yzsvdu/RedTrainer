/* 1 */ package f;public final class Uf0 extends xc0 { public final boolean equals(Object paramObject) { if (!(paramObject instanceof Uf0)) return false;  if (((zi0)(paramObject = paramObject)).ir0 != this
/* 2 */       .ir0) return false; 
/* 3 */     byte[] arrayOfByte = this.JO;
/* 4 */     float f1 = this.lJ0;
/* 5 */     float f2 = ((xc0)paramObject).lJ0; float[] arrayOfFloat;
/* 6 */     for (int i = (arrayOfFloat = this.rE0).length; i-- > 0; ) { float f3 = paramObject.Sp(this.native[i]); float f4; if (arrayOfByte[i] == 1 && (f4 = arrayOfFloat[i]) != f3 && f4 != f1 && f3 != f2) return false;  }  return true; }
/*   */ 
/*   */   
/*   */   public static final long serialVersionUID = 1L;
/*   */   public transient float[] rE0;
/*   */   
/*   */   public final int J00(int paramInt) {
/*   */     this.rE0 = new float[super.J00(paramInt)];
/*   */     return super.J00(paramInt);
/*   */   }
/*   */   
/*   */   public final void Hj0(int paramInt) {
/*   */     short[] arrayOfShort;
/*   */     int i = (arrayOfShort = this.native).length;
/*   */     float[] arrayOfFloat = this.rE0;
/*   */     byte[] arrayOfByte = this.JO;
/*   */     this.native = new short[paramInt];
/*   */     this.rE0 = new float[paramInt];
/*   */     this.JO = new byte[paramInt];
/*   */     while (i-- > 0) {
/*   */       if (arrayOfByte[i] == 1) {
/*   */         int j = QC0(arrayOfShort[i]);
/*   */         this.rE0[j] = arrayOfFloat[i];
/*   */       } 
/*   */     } 
/*   */   }
/*   */   
/*   */   public final float Sp(short paramShort) {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: getfield JO : [B
/*   */     //   4: dup
/*   */     //   5: iload_1
/*   */     //   6: swap
/*   */     //   7: aload_0
/*   */     //   8: getfield native : [S
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
/*   */     //   103: getfield native : [S
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
/*   */     //   138: getfield lJ0 : F
/*   */     //   141: goto -> 150
/*   */     //   144: aload_0
/*   */     //   145: getfield rE0 : [F
/*   */     //   148: iload_3
/*   */     //   149: faload
/*   */     //   150: freturn
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
/*   */     this.rE0[paramInt] = this.lJ0;
/*   */     super.Id(paramInt);
/*   */   }
/*   */   
/*   */   public final int hashCode() {
/*   */     int i;
/*   */     byte[] arrayOfByte;
/*   */     int j;
/*   */     for (i = 0, arrayOfByte = this.JO, j = this.rE0.length; j-- > 0;) {
/*   */       if (arrayOfByte[j] == 1) {
/*   */         short s = this.native[j];
/*   */         float f = this.rE0[j];
/*   */         if (Yr0.s00 || !Float.isNaN(f)) {
/*   */           i += s ^ Float.floatToIntBits(f * 6.6360896E8F);
/*   */           continue;
/*   */         } 
/*   */         throw new AssertionError("Values of NaN are not supported.");
/*   */       } 
/*   */     } 
/*   */     return i;
/*   */   }
/*   */   
/*   */   public final String toString() {
/*   */     this("{");
/*   */     StringBuilder stringBuilder;
/*   */     float[] arrayOfFloat;
/*   */     boolean bool;
/*   */     byte[] arrayOfByte;
/*   */     short[] arrayOfShort;
/*   */     int i;
/*   */     for (bool = true, arrayOfByte = this.JO, arrayOfFloat = this.rE0, i = (arrayOfShort = this.native).length; i-- > 0;) {
/*   */       if (arrayOfByte[i] == 1) {
/*   */         short s = arrayOfShort[i];
/*   */         float f = this[i];
/*   */         if (bool) {
/*   */           bool = false;
/*   */         } else {
/*   */           stringBuilder.append(", ");
/*   */         } 
/*   */         stringBuilder.append(s);
/*   */         stringBuilder.append("=");
/*   */         stringBuilder.append(f);
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
/*   */         paramObjectOutput.writeShort(this.native[i]);
/*   */         paramObjectOutput.writeFloat(this.rE0[i]);
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
/*   */       float f = paramObjectInput.readFloat();
/*   */       boolean bool = true;
/*   */       int j;
/*   */       if ((j = QC0(s)) < 0) {
/*   */         j = -j - 1;
/*   */         this.rE0[j];
/*   */         bool = false;
/*   */       } 
/*   */       this.rE0[j] = f;
/*   */       if (bool)
/*   */         xt0(this.Tb); 
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Uf0.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */