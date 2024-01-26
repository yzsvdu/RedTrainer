/* 1 */ package f;public final class MG implements Iterable { public int xl; public Object[] Hm; public float hc; public int Vo; public int Mj; public int vj0; public static int nf(int paramInt, float paramFloat) { if (paramInt >= 0) { int i; if ((i = nx0.fv(Math.max(2, (int)Math.ceil((paramInt / paramFloat))))) <= 1073741824) return i;  throw new IllegalArgumentException(XD0.SD0("The required capacity is too large: ", paramInt)); }
/* 2 */      throw new IllegalArgumentException(
/* 3 */         XD0.SD0("capacity must be >= 0: ", paramInt)); } public transient To y7; public transient To dG; public MG() { this(51, 0.8F); } public MG(int paramInt) { this(paramInt, 0.8F); } public MG(int paramInt, float paramFloat) { if (paramFloat > 0.0F && paramFloat < 1.0F) { this.hc = paramFloat; this.Vo = (int)(paramInt * paramFloat); int i = (paramInt = nf(paramInt, paramFloat)) - 1; this.Mj = Long.numberOfLeadingZeros(i); this.Hm = new Object[paramInt]; return; }  throw new IllegalArgumentException("loadFactor must be > 0 and < 1: " + paramFloat); } public MG(MG paramMG) { this((int)(paramMG.Hm.length * (f = paramMG.hc)), f); Object[] arrayOfObject = this.Hm; int i = paramMG.Hm.length; System.arraycopy(paramMG.Hm, 0, this, 0, i); this.xl = paramMG.xl; } public final void lW(int paramInt) { paramInt = this.Hm.length; this.Vo = (int)(paramInt * this.hc); int i = paramInt - 1; this.Mj = Long.numberOfLeadingZeros(i); Object[] arrayOfObject = this.Hm; this.Hm = new Object[paramInt]; if (this.xl > 0) for (byte b = 0; b < paramInt; ) { Object object; if ((object = arrayOfObject[b]) != null) { Object[] arrayOfObject1 = this.Hm; int j = (int)(object.hashCode() * -7046029254386353131L >>> this.Mj); while (true) { if (arrayOfObject1[j] == null) { arrayOfObject1[j] = object; break; }  j = j + 1 & this.vj0; }  }  b++; }   } public final int hashCode() { int i = this.xl; byte b = 0; Object[] arrayOfObject; int j = (arrayOfObject = this.Hm).length; while (b < j) { Object object; if ((object = arrayOfObject[b]) != null) i = object.hashCode() + i;  b++; }  return i; } public final boolean equals(Object paramObject) { if (!(paramObject instanceof MG)) return false;  if (((MG)(paramObject = paramObject)).xl != this.xl) return false;  Object[] arrayOfObject; byte b; int i; for (b = 0, i = (arrayOfObject = this.Hm).length; b < i; ) { Object object; if ((object = this[b]) != null) { Object[] arrayOfObject1 = ((MG)paramObject).Hm; int j = (int)(object.hashCode() * -7046029254386353131L >>> ((MG)paramObject).Mj); while (true) { boolean bool; Object object1; if ((object1 = arrayOfObject1[j]) == null) { j = -(j + 1); } else if (!object1.equals(object)) { j = j + 1 & ((MG)paramObject).vj0; continue; }  if (j >= 0) { bool = true; } else { bool = false; }  if (!bool) return false;  break; }  }  b++; }  return true; } public final String toString() { // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: new java/lang/StringBuilder
/*   */     //   4: dup
/*   */     //   5: invokespecial <init> : ()V
/*   */     //   8: bipush #123
/*   */     //   10: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*   */     //   13: astore_1
/*   */     //   14: ldc ', '
/*   */     //   16: astore_2
/*   */     //   17: getfield xl : I
/*   */     //   20: ifne -> 29
/*   */     //   23: ldc ''
/*   */     //   25: astore_0
/*   */     //   26: goto -> 137
/*   */     //   29: aload_0
/*   */     //   30: new java/lang/StringBuilder
/*   */     //   33: dup
/*   */     //   34: astore_3
/*   */     //   35: bipush #32
/*   */     //   37: invokespecial <init> : (I)V
/*   */     //   40: getfield Hm : [Ljava/lang/Object;
/*   */     //   43: dup
/*   */     //   44: astore #4
/*   */     //   46: arraylength
/*   */     //   47: istore #5
/*   */     //   49: iload #5
/*   */     //   51: dup
/*   */     //   52: iconst_m1
/*   */     //   53: iadd
/*   */     //   54: istore #5
/*   */     //   56: ifle -> 82
/*   */     //   59: aload #4
/*   */     //   61: iload #5
/*   */     //   63: aaload
/*   */     //   64: dup
/*   */     //   65: astore #6
/*   */     //   67: ifnonnull -> 73
/*   */     //   70: goto -> 49
/*   */     //   73: aload #6
/*   */     //   75: aload_0
/*   */     //   76: if_acmpne -> 122
/*   */     //   79: goto -> 118
/*   */     //   82: iload #5
/*   */     //   84: dup
/*   */     //   85: iconst_m1
/*   */     //   86: iadd
/*   */     //   87: istore #5
/*   */     //   89: ifle -> 132
/*   */     //   92: aload #4
/*   */     //   94: iload #5
/*   */     //   96: aaload
/*   */     //   97: dup
/*   */     //   98: astore #6
/*   */     //   100: ifnonnull -> 106
/*   */     //   103: goto -> 82
/*   */     //   106: aload #6
/*   */     //   108: aload_3
/*   */     //   109: aload_2
/*   */     //   110: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   113: pop
/*   */     //   114: aload_0
/*   */     //   115: if_acmpne -> 122
/*   */     //   118: ldc '(this)'
/*   */     //   120: astore #6
/*   */     //   122: aload_3
/*   */     //   123: aload #6
/*   */     //   125: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*   */     //   128: pop
/*   */     //   129: goto -> 82
/*   */     //   132: aload_3
/*   */     //   133: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   136: astore_0
/*   */     //   137: aload_1
/*   */     //   138: aload_0
/*   */     //   139: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   142: bipush #125
/*   */     //   144: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*   */     //   147: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   150: areturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 17
/* 3 */     //   #2	-> 139 } public final To jF0() { if (this.y7 == null) { To to1; this(this); this.y7 = to1; this(this); this.dG = to1; }  To to; if (!(to = this.y7).yh0) { to.fu(); this.y7.yh0 = true; this.dG.yh0 = false; return this.y7; }  this.dG.fu(); this.dG.yh0 = true; this.y7.yh0 = false; return this.dG; } public final void GV(Object paramObject) { if (paramObject != null) { Object[] arrayOfObject = this.Hm; int i = (int)(paramObject.hashCode() * -7046029254386353131L >>> this.Mj); while (true) { Object object; if ((object = arrayOfObject[i]) == null) { i = -(i + 1); } else if (!object.equals(paramObject))
/*   */         
/* 5 */         { i = i + 1 & this.vj0; continue; }  if (i >= 0) return;  int k = -(i + 1); Object[] arrayOfObject1; (arrayOfObject1 = this.Hm)[k] = paramObject; this.xl = j; int j; if ((j = this.xl + 1) >= this.Vo) lW(arrayOfObject1.length << 1);  return; }  }  throw new IllegalArgumentException("key cannot be null."); }
/*   */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/MG.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */