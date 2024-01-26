/*  1 */ package f;public final class Ut0 extends R60 { public static final long serialVersionUID = 1L; public transient Object[] ND; public int UH0; public Ut0() {} public final Object A3(int paramInt, Object paramObject) { Object object = null; boolean bool = true; if ((paramInt = zv0(paramInt)) < 0) { paramInt = -paramInt - 1; object = this.ND[paramInt]; bool = false; }  this.ND[paramInt] = paramObject; if (bool) xt0(this.ey);  return object; }
/*  2 */   public Ut0(int paramInt) { super(4096); this.UH0 = nc0.pz0; } public final int J00(int paramInt) { this.ND = new Object[super.J00(paramInt)]; return super.J00(paramInt); } public final void Hj0(int paramInt) { int[] arrayOfInt; int i = (arrayOfInt = this.n20).length; Object[] arrayOfObject = this.ND; byte[] arrayOfByte = this.JO; this.n20 = new int[paramInt]; this.ND = new Object[paramInt]; this.JO = new byte[paramInt]; while (i-- > 0) { if (arrayOfByte[i] == 1) { int j = zv0(arrayOfInt[i]); this.ND[j] = arrayOfObject[i]; }  }  } public final Object Z6(int paramInt) { return ((paramInt = Zy0(paramInt)) < 0) ? null : this.ND[paramInt]; } public final Object remove(int paramInt) { Object object = null; if ((paramInt = Zy0(paramInt)) >= 0) { object = this.ND[paramInt]; Id(paramInt); }  return object; } public final void Id(int paramInt) { this.ND[paramInt] = null; super.Id(paramInt); } public final void clear() { super.clear(); int i = this.n20.length; int j = this.UH0; Arrays.fill(this.n20, 0, i, j); Arrays.fill(this.JO, 0, this.JO.length, (byte)0); Arrays.fill(this.ND, 0, this.ND.length, (Object)null); } public final int[] YJ0() { byte[] arrayOfByte; int[] arrayOfInt1; int[] arrayOfInt2; int i; int j; for (arrayOfInt1 = new int[this.ir0], arrayOfByte = this.JO, i = (arrayOfInt2 = this.n20).length, j = 0; i-- > 0;) { if (this[i] == 1) { int k = j + 1; arrayOfInt1[j] = arrayOfInt2[i]; j = k; }  }  return arrayOfInt1; } public final boolean equals(Object paramObject) { if (!(paramObject instanceof Ut0)) return false;  if (((zi0)(paramObject = paramObject)).ir0 != this.ir0) return false;  
/*  3 */     try { int i = size(), j = FH(); while (i == this
/*  4 */         .ir0)
/*  5 */       { boolean bool; int k; for (byte[] arrayOfByte = this.JO; k-- > 0 && arrayOfByte[k] != 1;); if (k >= 0) { bool = true; } else { bool = false; }  if (bool) { if (i == this
/*  6 */             .ir0) {
/*  7 */             for (byte[] arrayOfByte1 = this.JO; j-- > 0 && arrayOfByte1[j] != 1;); if (j >= 0) {
/*  8 */               int m = this.n20[j]; Object object;
/*  9 */               if ((object = this.ND[j]) == null) { if (paramObject
/* 10 */                   .Z6(m) != null || 
/* 11 */                   !paramObject.return(m)) return false;  continue; }
/* 12 */                if (!object.equals(paramObject.Z6(m))) return false;  continue;
/* 13 */             }  throw new NoSuchElementException();
/* 14 */           }  throw new ConcurrentModificationException(); }
/* 15 */          return true; }  } catch (ClassCastException classCastException) {} throw new ConcurrentModificationException(); }
/*    */ 
/*    */   
/*    */   public final int hashCode() {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: iconst_0
/*    */     //   2: istore_1
/*    */     //   3: getfield ND : [Ljava/lang/Object;
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
/*    */     //   38: getfield n20 : [I
/*    */     //   41: iload #4
/*    */     //   43: iaload
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
/*    */     paramObjectOutput.writeInt(this.UH0);
/*    */     paramObjectOutput.writeInt(this.ir0);
/*    */     for (int i = this.JO.length; i-- > 0;) {
/*    */       if (this.JO[i] == 1) {
/*    */         paramObjectOutput.writeInt(this.n20[i]);
/*    */         paramObjectOutput.writeObject(this.ND[i]);
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void readExternal(ObjectInput paramObjectInput) {
/*    */     paramObjectInput.readByte();
/*    */     super.readExternal(paramObjectInput);
/*    */     this.UH0 = paramObjectInput.readInt();
/*    */     int i;
/*    */     J00(i = paramObjectInput.readInt());
/*    */     while (i-- > 0) {
/*    */       int j = paramObjectInput.readInt();
/*    */       A3(j, paramObjectInput.readObject());
/*    */     } 
/*    */   }
/*    */   
/*    */   public final String toString() {
/*    */     this("{");
/*    */     StringBuilder stringBuilder;
/*    */     Object[] arrayOfObject;
/*    */     boolean bool;
/*    */     byte[] arrayOfByte;
/*    */     int arrayOfInt[], i;
/*    */     for (bool = true, arrayOfByte = this.JO, arrayOfObject = this.ND, i = (arrayOfInt = this.n20).length; i-- > 0;) {
/*    */       if (arrayOfByte[i] == 1) {
/*    */         int j = arrayOfInt[i];
/*    */         Object object = this[i];
/*    */         if (bool) {
/*    */           bool = false;
/*    */         } else {
/*    */           stringBuilder.append(",");
/*    */         } 
/*    */         stringBuilder.append(j);
/*    */         stringBuilder.append("=");
/*    */         stringBuilder.append(object);
/*    */       } 
/*    */     } 
/*    */     stringBuilder.append("}");
/*    */     return stringBuilder.toString();
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ut0.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */