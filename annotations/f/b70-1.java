/* 1 */ package f;public class b70 implements Iterable, Comparator, Comparable { public long Qr; public final fQ ra0; public boolean ZF0; public b70() { fQ fQ1; this(); this.ra0 = this; this.ZF0 = true; } public final void c5() { if (!this.ZF0) { this.ra0.sort(this); this.ZF0 = true; }  } public final void Ng0(long paramLong) { for (int i = this.ra0.Z8 - 1; i >= 0; ) { long l; if ((paramLong & (l = ((dj)this.ra0.get(i)).tL)) == l) { this.ra0.Hc(i); this.Qr &= l ^ 0xFFFFFFFFFFFFFFFFL; this
/* 2 */           .ZF0 = false; }  i--; }  c5(); } public final long XG() { return this.Qr; } public final dj cOM1(long paramLong) { if (gV(paramLong)) { fQ fQ1; for (byte b = 0; b < (fQ1 = this.ra0).Z8; b++) { if (((dj)fQ1.get(b)).tL == paramLong) return (dj)this.ra0.get(b);  }  }  return null; } public final dj ct0(long paramLong) { return cOM1(paramLong); } public final void Tz0(dj paramdj) { // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: aload_1
/*   */     //   2: getfield tL : J
/*   */     //   5: dup2
/*   */     //   6: lstore_2
/*   */     //   7: invokevirtual gV : (J)Z
/*   */     //   10: ifeq -> 58
/*   */     //   13: iconst_0
/*   */     //   14: istore #4
/*   */     //   16: iload #4
/*   */     //   18: aload_0
/*   */     //   19: getfield ra0 : Lf/fQ;
/*   */     //   22: dup
/*   */     //   23: astore #5
/*   */     //   25: getfield Z8 : I
/*   */     //   28: if_icmpge -> 58
/*   */     //   31: aload #5
/*   */     //   33: iload #4
/*   */     //   35: invokevirtual get : (I)Ljava/lang/Object;
/*   */     //   38: checkcast f/dj
/*   */     //   41: getfield tL : J
/*   */     //   44: lload_2
/*   */     //   45: lcmp
/*   */     //   46: ifne -> 52
/*   */     //   49: goto -> 61
/*   */     //   52: iinc #4, 1
/*   */     //   55: goto -> 16
/*   */     //   58: iconst_m1
/*   */     //   59: istore #4
/*   */     //   61: iload #4
/*   */     //   63: ifge -> 96
/*   */     //   66: aload_0
/*   */     //   67: dup
/*   */     //   68: dup2
/*   */     //   69: aload_1
/*   */     //   70: getfield tL : J
/*   */     //   73: lstore_2
/*   */     //   74: getfield Qr : J
/*   */     //   77: lload_2
/*   */     //   78: lor
/*   */     //   79: putfield Qr : J
/*   */     //   82: getfield ra0 : Lf/fQ;
/*   */     //   85: aload_1
/*   */     //   86: invokevirtual Com3 : (Ljava/lang/Object;)V
/*   */     //   89: iconst_0
/*   */     //   90: putfield ZF0 : Z
/*   */     //   93: goto -> 106
/*   */     //   96: aload_0
/*   */     //   97: getfield ra0 : Lf/fQ;
/*   */     //   100: iload #4
/*   */     //   102: aload_1
/*   */     //   103: invokevirtual Bz0 : (ILjava/lang/Object;)V
/*   */     //   106: aload_0
/*   */     //   107: invokevirtual c5 : ()V
/*   */     //   110: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 7
/*   */     //   #2	-> 70
/*   */     //   #3	-> 74
/* 2 */     //   #4	-> 82 } public final void nO(dj... paramVarArgs) { int i = paramVarArgs.length; for (byte b = 0; b < i; b++) Tz0(paramVarArgs[b]);  } public final void ir(Iterable paramIterable) { Iterator<dj> iterator = paramIterable.iterator(); while (iterator.hasNext()) Tz0(iterator.next());  } public final boolean gV(long paramLong) { return (paramLong != 0L && (this.Qr & paramLong) == paramLong); } public final Iterator iterator() { return this.ra0.r30(); } public int hashCode() { c5(); int i; long l; int j; byte b; for (i = this.ra0.Z8, l = this.Qr + 71L, j = 1, b = 0; b < i; ) { l = this.Qr * ((dj)this.ra0.get(b)).hashCode() * (j = j * 7 & 0xFFFF) + l; b++; }  return (int)(l ^ l >> 32L); } public boolean equals(Object paramObject) { if (!(paramObject instanceof b70)) return false;  if (paramObject == this) return true;  if ((paramObject = paramObject) != this) { if (paramObject == null || this.Qr != ((b70)paramObject).Qr) return false;  c5(); paramObject.c5(); fQ fQ1; for (byte b = 0; b < (fQ1 = this.ra0).Z8; ) { boolean bool; dj dj2 = (dj)((b70)paramObject).ra0.get(b); dj dj1; (dj1 = (dj)fQ1.get(b)).getClass(); if (dj2.hashCode() == dj1.hashCode()) { bool = true; } else { bool = false; }  if (!bool) // Byte code: goto -> 134  b++; }
/*   */        }
/*   */      }
/*   */ 
/*   */   
/*   */   public final int compare(Object paramObject1, Object paramObject2) {
/*   */     dj dj = (dj)paramObject1;
/*   */     paramObject1 = paramObject2;
/*   */     return (int)(this.tL - ((dj)paramObject1).tL);
/*   */   }
/*   */   
/*   */   public final int compareTo(Object paramObject) {
/*   */     // Byte code:
/*   */     //   0: aload_1
/*   */     //   1: checkcast f/b70
/*   */     //   4: dup
/*   */     //   5: astore_1
/*   */     //   6: aload_0
/*   */     //   7: if_acmpne -> 13
/*   */     //   10: goto -> 104
/*   */     //   13: aload_0
/*   */     //   14: getfield Qr : J
/*   */     //   17: aload_1
/*   */     //   18: getfield Qr : J
/*   */     //   21: lcmp
/*   */     //   22: dup
/*   */     //   23: istore_2
/*   */     //   24: ifeq -> 41
/*   */     //   27: iload_2
/*   */     //   28: ifge -> 36
/*   */     //   31: iconst_m1
/*   */     //   32: istore_0
/*   */     //   33: goto -> 115
/*   */     //   36: iconst_1
/*   */     //   37: istore_0
/*   */     //   38: goto -> 115
/*   */     //   41: aload_1
/*   */     //   42: aload_0
/*   */     //   43: invokevirtual c5 : ()V
/*   */     //   46: invokevirtual c5 : ()V
/*   */     //   49: iconst_0
/*   */     //   50: istore_2
/*   */     //   51: iload_2
/*   */     //   52: aload_0
/*   */     //   53: getfield ra0 : Lf/fQ;
/*   */     //   56: dup
/*   */     //   57: astore_3
/*   */     //   58: getfield Z8 : I
/*   */     //   61: if_icmpge -> 104
/*   */     //   64: aload_3
/*   */     //   65: iload_2
/*   */     //   66: invokevirtual get : (I)Ljava/lang/Object;
/*   */     //   69: checkcast f/dj
/*   */     //   72: aload_1
/*   */     //   73: getfield ra0 : Lf/fQ;
/*   */     //   76: iload_2
/*   */     //   77: invokevirtual get : (I)Ljava/lang/Object;
/*   */     //   80: invokeinterface compareTo : (Ljava/lang/Object;)I
/*   */     //   85: dup
/*   */     //   86: istore_3
/*   */     //   87: ifeq -> 109
/*   */     //   90: iload_3
/*   */     //   91: ifge -> 97
/*   */     //   94: goto -> 31
/*   */     //   97: iload_3
/*   */     //   98: ifle -> 104
/*   */     //   101: goto -> 36
/*   */     //   104: iconst_0
/*   */     //   105: istore_0
/*   */     //   106: goto -> 115
/*   */     //   109: iinc #2, 1
/*   */     //   112: goto -> 51
/*   */     //   115: iload_0
/*   */     //   116: ireturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 14
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/b70.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */