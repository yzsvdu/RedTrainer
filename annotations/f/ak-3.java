/*  1 */ package f;public final class ak extends qU implements jt { public static final long serialVersionUID = 1L; public transient Object[] com6; public byte N10; public ak() {} public final Object VF(byte paramByte, Object paramObject) { Object object = null; boolean bool = true; int i; if ((i = nw(paramByte)) < 0) { i = -i - 1; object = this.com6[i]; bool = false; }  this.com6[i] = paramObject; if (bool) xt0(this.ma);  return object; } public ak(int paramInt) { super(paramInt); this.N10 = nc0.il; } public final int J00(int paramInt) { this.com6 = new Object[super.J00(paramInt)]; return super.J00(paramInt); } public final void Hj0(int paramInt) { byte[] arrayOfByte1; int i = (arrayOfByte1 = this.Sx0).length; Object[] arrayOfObject = this.com6; byte[] arrayOfByte2 = this.JO; this.Sx0 = new byte[paramInt]; this.com6 = new Object[paramInt]; this.JO = new byte[paramInt]; while (i-- > 0) { if (arrayOfByte2[i] == 1) { int j = nw(arrayOfByte1[i]); this.com6[j] = arrayOfObject[i]; }  }  } public final boolean Vs0(byte paramByte) { return db0(paramByte); } public final Object Ha0(byte paramByte) { int i; return ((i = cP(paramByte)) < 0) ? null : this.com6[i]; } public final Object Lt(byte paramByte) { Object object = null; int i; if ((i = cP(paramByte)) >= 0) { object = this.com6[i]; Id(i); }  return object; } public final void Id(int paramInt) { this.com6[paramInt] = null; super.Id(paramInt); } public final void clear() { super.clear(); int i = this.Sx0.length; byte b = this.N10; Arrays.fill(this.Sx0, 0, i, b); Arrays.fill(this.JO, 0, this.JO.length, (byte)0); Arrays.fill(this.com6, 0, this.com6.length, (Object)null); } public final boolean qk(HE paramHE) { byte[] arrayOfByte1 = this.JO; Object[] arrayOfObject = this.com6; byte[] arrayOfByte2; int i = (arrayOfByte2 = this.Sx0).length; while (i-- > 0) { byte b = arrayOfByte2[i]; if (arrayOfByte1[i] == 1 && !paramHE.EA(b, this[i])) return false;  }  return true; } public final boolean equals(Object paramObject) { if (!(paramObject instanceof jt)) return false;  if ((paramObject = paramObject).size() != this.ir0) return false;  
/*  2 */     try { int i = size(), j = FH(); while (i == this
/*  3 */         .ir0)
/*  4 */       { boolean bool; int k; for (byte[] arrayOfByte = this.JO; k-- > 0 && arrayOfByte[k] != 1;); if (k >= 0) { bool = true; } else { bool = false; }  if (bool) { if (i == this
/*  5 */             .ir0) {
/*  6 */             for (byte[] arrayOfByte1 = this.JO; j-- > 0 && arrayOfByte1[j] != 1;); if (j >= 0) {
/*  7 */               byte b = this.Sx0[j]; Object object;
/*  8 */               if ((object = this.com6[j]) == null) { if (paramObject
/*  9 */                   .Ha0(b) != null || !paramObject.Vs0(b)) return false;  continue; }  if (!object.equals(paramObject.Ha0(b))) return false;  continue;
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
/*    */     //   3: getfield com6 : [Ljava/lang/Object;
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
/*    */     //   38: getfield Sx0 : [B
/*    */     //   41: iload #4
/*    */     //   43: baload
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
/*    */     paramObjectOutput.writeByte(this.N10);
/*    */     paramObjectOutput.writeInt(this.ir0);
/*    */     for (int i = this.JO.length; i-- > 0;) {
/*    */       if (this.JO[i] == 1) {
/*    */         paramObjectOutput.writeByte(this.Sx0[i]);
/*    */         paramObjectOutput.writeObject(this.com6[i]);
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void readExternal(ObjectInput paramObjectInput) {
/*    */     paramObjectInput.readByte();
/*    */     super.readExternal(paramObjectInput);
/*    */     this.N10 = paramObjectInput.readByte();
/*    */     int i;
/*    */     J00(i = paramObjectInput.readInt());
/*    */     while (i-- > 0) {
/*    */       byte b = paramObjectInput.readByte();
/*    */       VF(b, paramObjectInput.readObject());
/*    */     } 
/*    */   }
/*    */   
/*    */   public final String toString() {
/*    */     this("{");
/*    */     StringBuilder stringBuilder;
/*    */     Object[] arrayOfObject;
/*    */     boolean bool;
/*    */     byte[] arrayOfByte1, arrayOfByte2;
/*    */     int i;
/*    */     for (bool = true, arrayOfByte1 = this.JO, arrayOfObject = this.com6, i = (arrayOfByte2 = this.Sx0).length; i-- > 0;) {
/*    */       if (arrayOfByte1[i] == 1) {
/*    */         byte b = arrayOfByte2[i];
/*    */         Object object = this[i];
/*    */         if (bool) {
/*    */           bool = false;
/*    */         } else {
/*    */           stringBuilder.append(",");
/*    */         } 
/*    */         stringBuilder.append(b);
/*    */         stringBuilder.append("=");
/*    */         stringBuilder.append(object);
/*    */       } 
/*    */     } 
/*    */     stringBuilder.append("}");
/*    */     return stringBuilder.toString();
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ak.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */