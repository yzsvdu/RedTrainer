/*  1 */ package f;public final class qw0 extends sB implements hq0 { public static final long serialVersionUID = 1L; public transient Object[] TH0; public short rg; public qw0() {} public final Object Vh0(short paramShort, Object paramObject) { Object object = null; boolean bool = true; int i; if ((i = WY(paramShort)) < 0) { i = -i - 1; object = this.TH0[i]; bool = false; }  this.TH0[i] = paramObject; if (bool) xt0(this.Ru0);  return object; }
/*  2 */   public qw0(int paramInt) { super(0); this.rg = nc0.O00; } public final int J00(int paramInt) { this.TH0 = new Object[super.J00(paramInt)]; return super.J00(paramInt); } public final void Hj0(int paramInt) { short[] arrayOfShort; int i = (arrayOfShort = this.yG0).length; Object[] arrayOfObject = this.TH0; byte[] arrayOfByte = this.JO; this.yG0 = new short[paramInt]; this.TH0 = new Object[paramInt]; this.JO = new byte[paramInt]; while (i-- > 0) { if (arrayOfByte[i] == 1) { int j = WY(arrayOfShort[i]); this.TH0[j] = arrayOfObject[i]; }  }  } public final boolean gS(short paramShort) { return Fb(paramShort); } public final Object Z90(short paramShort) { int i; return ((i = kc0(paramShort)) < 0) ? null : this.TH0[i]; } public final void Id(int paramInt) { this.TH0[paramInt] = null; super.Id(paramInt); } public final void clear() { super.clear(); int i = this.yG0.length; short s = this.rg; Arrays.fill(this.yG0, 0, i, s); Arrays.fill(this.JO, 0, this.JO.length, (byte)0); Arrays.fill(this.TH0, 0, this.TH0.length, (Object)null); } public final short[] u5() { byte[] arrayOfByte; short[] arrayOfShort1; short[] arrayOfShort2; int i; int j; for (arrayOfShort1 = new short[this.ir0], arrayOfByte = this.JO, i = (arrayOfShort2 = this.yG0).length, j = 0; i-- > 0;) { if (this[i] == 1) { int k = j + 1; arrayOfShort1[j] = arrayOfShort2[i]; j = k; }  }  return arrayOfShort1; } public final Collection pr() { return new iL(this); } public final Object[] nt(Object[] paramArrayOfObject) { if (paramArrayOfObject.length < this.ir0) paramArrayOfObject = (Object[])Array.newInstance(paramArrayOfObject.getClass().getComponentType(), this.ir0);  byte[] arrayOfByte = this.JO; Object[] arrayOfObject; int i = (arrayOfObject = this.TH0).length; int j = 0; while (i-- > 0) { if (this[i] == 1) { int k = j + 1; paramArrayOfObject[j] = arrayOfObject[i]; j = k; }  }  return paramArrayOfObject; } public final boolean m8(HA0 paramHA0) { byte[] arrayOfByte = this.JO; Object[] arrayOfObject = this.TH0; short[] arrayOfShort; int i = (arrayOfShort = this.yG0).length; while (i-- > 0) { short s = arrayOfShort[i]; if (arrayOfByte[i] == 1 && !paramHA0.Qc(s, this[i])) return false;  }  return true; } public final boolean equals(Object paramObject) { if (!(paramObject instanceof hq0)) return false;  if ((paramObject = paramObject).size() != this.ir0) return false;  try { int i = size(), j = FH(); while (i == this
/*  3 */         .ir0)
/*  4 */       { boolean bool; int k; for (byte[] arrayOfByte = this.JO; k-- > 0 && arrayOfByte[k] != 1;); if (k >= 0) { bool = true; } else { bool = false; }  if (bool) { if (i == this
/*  5 */             .ir0) {
/*  6 */             for (byte[] arrayOfByte1 = this.JO; j-- > 0 && arrayOfByte1[j] != 1;); if (j >= 0) {
/*  7 */               short s = this.yG0[j]; Object object;
/*  8 */               if ((object = this.TH0[j]) == null) { if (paramObject
/*  9 */                   .Z90(s) != null || !paramObject.gS(s)) return false;  continue; }  if (!object.equals(paramObject.Z90(s))) return false;  continue;
/* 10 */             }  throw new NoSuchElementException();
/* 11 */           }  throw new ConcurrentModificationException(); }
/* 12 */          return true; }  } catch (ClassCastException classCastException) {} throw new ConcurrentModificationException(); }
/*    */ 
/*    */   
/*    */   public final int hashCode() {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: iconst_0
/*    */     //   2: istore_1
/*    */     //   3: getfield TH0 : [Ljava/lang/Object;
/*    */     //   6: dup
/*    */     //   7: astore_2
/*    */     //   8: aload_0
/*    */     //   9: getfield JO : [B
/*    */     //   12: astore_3
/*    */     //   13: arraylength
/*    */     //   14: istore #4
/*    */     //   16: iload #4
/*    */     //   18: dup
/*    */     //   19: iconst_m1
/*    */     //   20: iadd
/*    */     //   21: istore #4
/*    */     //   23: ifle -> 77
/*    */     //   26: aload_3
/*    */     //   27: iload #4
/*    */     //   29: baload
/*    */     //   30: iconst_1
/*    */     //   31: if_icmpne -> 16
/*    */     //   34: aload_2
/*    */     //   35: iload #4
/*    */     //   37: aload_0
/*    */     //   38: getfield yG0 : [S
/*    */     //   41: iload #4
/*    */     //   43: saload
/*    */     //   44: istore #5
/*    */     //   46: aaload
/*    */     //   47: dup
/*    */     //   48: astore #6
/*    */     //   50: ifnonnull -> 59
/*    */     //   53: iconst_0
/*    */     //   54: istore #6
/*    */     //   56: goto -> 66
/*    */     //   59: aload #6
/*    */     //   61: invokevirtual hashCode : ()I
/*    */     //   64: istore #6
/*    */     //   66: iload_1
/*    */     //   67: iload #5
/*    */     //   69: iload #6
/*    */     //   71: ixor
/*    */     //   72: iadd
/*    */     //   73: istore_1
/*    */     //   74: goto -> 16
/*    */     //   77: iload_1
/*    */     //   78: ireturn
/*    */   }
/*    */   
/*    */   public final void writeExternal(ObjectOutput paramObjectOutput) {
/*    */     paramObjectOutput.writeByte(0);
/*    */     paramObjectOutput.writeByte(0);
/*    */     paramObjectOutput.writeFloat(this.ri0);
/*    */     paramObjectOutput.writeFloat(this.Q0);
/*    */     paramObjectOutput.writeShort(this.rg);
/*    */     paramObjectOutput.writeInt(this.ir0);
/*    */     for (int i = this.JO.length; i-- > 0;) {
/*    */       if (this.JO[i] == 1) {
/*    */         paramObjectOutput.writeShort(this.yG0[i]);
/*    */         paramObjectOutput.writeObject(this.TH0[i]);
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void readExternal(ObjectInput paramObjectInput) {
/*    */     paramObjectInput.readByte();
/*    */     super.readExternal(paramObjectInput);
/*    */     this.rg = paramObjectInput.readShort();
/*    */     int i;
/*    */     J00(i = paramObjectInput.readInt());
/*    */     while (i-- > 0) {
/*    */       short s = paramObjectInput.readShort();
/*    */       Vh0(s, paramObjectInput.readObject());
/*    */     } 
/*    */   }
/*    */   
/*    */   public final String toString() {
/*    */     this("{");
/*    */     StringBuilder stringBuilder;
/*    */     Object[] arrayOfObject;
/*    */     boolean bool;
/*    */     byte[] arrayOfByte;
/*    */     short[] arrayOfShort;
/*    */     int i;
/*    */     for (bool = true, arrayOfByte = this.JO, arrayOfObject = this.TH0, i = (arrayOfShort = this.yG0).length; i-- > 0;) {
/*    */       if (arrayOfByte[i] == 1) {
/*    */         short s = arrayOfShort[i];
/*    */         Object object = this[i];
/*    */         if (bool) {
/*    */           bool = false;
/*    */         } else {
/*    */           stringBuilder.append(",");
/*    */         } 
/*    */         stringBuilder.append(s);
/*    */         stringBuilder.append("=");
/*    */         stringBuilder.append(object);
/*    */       } 
/*    */     } 
/*    */     stringBuilder.append("}");
/*    */     return stringBuilder.toString();
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/qw0.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */