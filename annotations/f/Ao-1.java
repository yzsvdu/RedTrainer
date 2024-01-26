/* 1 */ package f;public final class Ao implements Iterable, Comparable { public final lw0 kA(int paramInt) { int i; byte b; for (i = this.rJ0.length, b = 0; b < i; )
/* 2 */     { lw0 lw01; if ((lw01 = this.rJ0[b])
/* 3 */         .s00 == paramInt) return lw01;  b++; }  return null; }
/*   */ 
/*   */   
/*   */   public final lw0[] rJ0;
/*   */   public final int Nb;
/*   */   public long xf0 = -1L;
/*   */   public HN Fz;
/*   */   
/*   */   public Ao(lw0... paramVarArgs) {
/*   */     if (paramVarArgs.length != 0) {
/*   */       lw0[] arrayOfLw0 = new lw0[paramVarArgs.length];
/*   */       for (byte b = 0; b < paramVarArgs.length; b++)
/*   */         arrayOfLw0[b] = paramVarArgs[b]; 
/*   */       this.rJ0 = arrayOfLw0;
/*   */       this.Nb = TB0();
/*   */       return;
/*   */     } 
/*   */     throw new IllegalArgumentException("attributes must be >= 1");
/*   */   }
/*   */   
/*   */   public final String toString() {
/*   */     this();
/*   */     StringBuilder stringBuilder;
/*   */     (new StringBuilder()).append("[");
/*   */     for (byte b = 0; b < this.rJ0.length; b++) {
/*   */       stringBuilder.append("(");
/*   */       stringBuilder.append((this.rJ0[b]).M8);
/*   */       stringBuilder.append(", ");
/*   */       stringBuilder.append((this.rJ0[b]).s00);
/*   */       stringBuilder.append(", ");
/*   */       stringBuilder.append((this.rJ0[b]).uj);
/*   */       stringBuilder.append(", ");
/*   */       stringBuilder.append((this.rJ0[b]).TZ);
/*   */       stringBuilder.append(")");
/*   */       stringBuilder.append("\n");
/*   */     } 
/*   */     stringBuilder.append("]");
/*   */     return stringBuilder.toString();
/*   */   }
/*   */   
/*   */   public final boolean equals(Object paramObject) {
/*   */     // Byte code:
/*   */     //   0: aload_1
/*   */     //   1: aload_0
/*   */     //   2: if_acmpne -> 7
/*   */     //   5: iconst_1
/*   */     //   6: ireturn
/*   */     //   7: aload_1
/*   */     //   8: instanceof f/Ao
/*   */     //   11: ifne -> 16
/*   */     //   14: iconst_0
/*   */     //   15: ireturn
/*   */     //   16: aload_0
/*   */     //   17: aload_1
/*   */     //   18: checkcast f/Ao
/*   */     //   21: astore_1
/*   */     //   22: getfield rJ0 : [Lf/lw0;
/*   */     //   25: arraylength
/*   */     //   26: aload_1
/*   */     //   27: getfield rJ0 : [Lf/lw0;
/*   */     //   30: arraylength
/*   */     //   31: if_icmpeq -> 36
/*   */     //   34: iconst_0
/*   */     //   35: ireturn
/*   */     //   36: iconst_0
/*   */     //   37: istore_2
/*   */     //   38: iload_2
/*   */     //   39: aload_0
/*   */     //   40: getfield rJ0 : [Lf/lw0;
/*   */     //   43: dup
/*   */     //   44: astore_3
/*   */     //   45: arraylength
/*   */     //   46: if_icmpge -> 164
/*   */     //   49: aload_1
/*   */     //   50: aload_3
/*   */     //   51: iload_2
/*   */     //   52: aaload
/*   */     //   53: astore_3
/*   */     //   54: getfield rJ0 : [Lf/lw0;
/*   */     //   57: iload_2
/*   */     //   58: aaload
/*   */     //   59: dup
/*   */     //   60: astore #4
/*   */     //   62: ifnull -> 145
/*   */     //   65: aload_3
/*   */     //   66: getfield s00 : I
/*   */     //   69: aload #4
/*   */     //   71: getfield s00 : I
/*   */     //   74: if_icmpne -> 150
/*   */     //   77: aload_3
/*   */     //   78: getfield uj : I
/*   */     //   81: aload #4
/*   */     //   83: getfield uj : I
/*   */     //   86: if_icmpne -> 150
/*   */     //   89: aload_3
/*   */     //   90: getfield We0 : I
/*   */     //   93: aload #4
/*   */     //   95: getfield We0 : I
/*   */     //   98: if_icmpne -> 150
/*   */     //   101: aload_3
/*   */     //   102: getfield f3 : Z
/*   */     //   105: aload #4
/*   */     //   107: getfield f3 : Z
/*   */     //   110: if_icmpne -> 150
/*   */     //   113: aload_3
/*   */     //   114: getfield M8 : Ljava/lang/String;
/*   */     //   117: aload #4
/*   */     //   119: getfield M8 : Ljava/lang/String;
/*   */     //   122: invokevirtual equals : (Ljava/lang/Object;)Z
/*   */     //   125: ifeq -> 150
/*   */     //   128: aload_3
/*   */     //   129: getfield ed : I
/*   */     //   132: aload #4
/*   */     //   134: getfield ed : I
/*   */     //   137: if_icmpne -> 150
/*   */     //   140: iconst_1
/*   */     //   141: istore_3
/*   */     //   142: goto -> 152
/*   */     //   145: aload_3
/*   */     //   146: invokevirtual getClass : ()Ljava/lang/Class;
/*   */     //   149: pop
/*   */     //   150: iconst_0
/*   */     //   151: istore_3
/*   */     //   152: iload_3
/*   */     //   153: ifne -> 158
/*   */     //   156: iconst_0
/*   */     //   157: ireturn
/*   */     //   158: iinc #2, 1
/*   */     //   161: goto -> 38
/*   */     //   164: iconst_1
/*   */     //   165: ireturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 66
/*   */     //   #2	-> 71
/*   */     //   #3	-> 146
/*   */   }
/*   */   
/*   */   public final int hashCode() {
/*   */     long l = (this.rJ0.length * 61);
/*   */     lw0[] arrayOfLw0;
/*   */     for (byte b = 0; b < (arrayOfLw0 = this.rJ0).length; b++)
/*   */       l = l * 61L + arrayOfLw0[b].hashCode(); 
/*   */     return (int)(l ^ l >> 32L);
/*   */   }
/*   */   
/*   */   public final long Ep() {
/*   */     if (this.xf0 == -1L) {
/*   */       long l = 0L;
/*   */       lw0[] arrayOfLw0;
/*   */       for (byte b = 0; b < (arrayOfLw0 = this.rJ0).length; b++)
/*   */         l |= (arrayOfLw0[b]).s00; 
/*   */       this.xf0 = l;
/*   */     } 
/*   */     return this.xf0;
/*   */   }
/*   */   
/*   */   public final long qV() {
/*   */     return Ep() | this.rJ0.length << 32L;
/*   */   }
/*   */   
/*   */   public final Iterator iterator() {
/*   */     if (this.Fz == null)
/*   */       this.Fz = new HN((Object[])this.rJ0); 
/*   */     return this.Fz.iterator();
/*   */   }
/*   */   
/*   */   public final int compareTo(Object paramObject) {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: aload_1
/*   */     //   2: checkcast f/Ao
/*   */     //   5: astore_1
/*   */     //   6: getfield rJ0 : [Lf/lw0;
/*   */     //   9: dup
/*   */     //   10: astore_2
/*   */     //   11: arraylength
/*   */     //   12: aload_1
/*   */     //   13: getfield rJ0 : [Lf/lw0;
/*   */     //   16: dup
/*   */     //   17: astore_3
/*   */     //   18: arraylength
/*   */     //   19: if_icmpeq -> 31
/*   */     //   22: aload_2
/*   */     //   23: arraylength
/*   */     //   24: aload_3
/*   */     //   25: arraylength
/*   */     //   26: isub
/*   */     //   27: istore_0
/*   */     //   28: goto -> 211
/*   */     //   31: aload_0
/*   */     //   32: invokevirtual Ep : ()J
/*   */     //   35: aload_1
/*   */     //   36: invokevirtual Ep : ()J
/*   */     //   39: lcmp
/*   */     //   40: dup
/*   */     //   41: istore_2
/*   */     //   42: ifeq -> 59
/*   */     //   45: iload_2
/*   */     //   46: ifge -> 54
/*   */     //   49: iconst_m1
/*   */     //   50: istore_0
/*   */     //   51: goto -> 211
/*   */     //   54: iconst_1
/*   */     //   55: istore_0
/*   */     //   56: goto -> 211
/*   */     //   59: aload_0
/*   */     //   60: getfield rJ0 : [Lf/lw0;
/*   */     //   63: arraylength
/*   */     //   64: iconst_1
/*   */     //   65: isub
/*   */     //   66: istore_2
/*   */     //   67: iload_2
/*   */     //   68: iflt -> 209
/*   */     //   71: aload_0
/*   */     //   72: getfield rJ0 : [Lf/lw0;
/*   */     //   75: iload_2
/*   */     //   76: aaload
/*   */     //   77: dup
/*   */     //   78: astore_3
/*   */     //   79: aload_1
/*   */     //   80: getfield rJ0 : [Lf/lw0;
/*   */     //   83: iload_2
/*   */     //   84: aaload
/*   */     //   85: astore #4
/*   */     //   87: getfield s00 : I
/*   */     //   90: dup
/*   */     //   91: istore #5
/*   */     //   93: aload #4
/*   */     //   95: getfield s00 : I
/*   */     //   98: dup
/*   */     //   99: istore #6
/*   */     //   101: if_icmpeq -> 113
/*   */     //   104: iload #5
/*   */     //   106: iload #6
/*   */     //   108: isub
/*   */     //   109: istore_0
/*   */     //   110: goto -> 211
/*   */     //   113: aload_3
/*   */     //   114: getfield ed : I
/*   */     //   117: dup
/*   */     //   118: istore #5
/*   */     //   120: aload #4
/*   */     //   122: getfield ed : I
/*   */     //   125: dup
/*   */     //   126: istore #6
/*   */     //   128: if_icmpeq -> 134
/*   */     //   131: goto -> 104
/*   */     //   134: aload_3
/*   */     //   135: getfield uj : I
/*   */     //   138: dup
/*   */     //   139: istore #5
/*   */     //   141: aload #4
/*   */     //   143: getfield uj : I
/*   */     //   146: dup
/*   */     //   147: istore #6
/*   */     //   149: if_icmpeq -> 155
/*   */     //   152: goto -> 104
/*   */     //   155: aload_3
/*   */     //   156: getfield f3 : Z
/*   */     //   159: dup
/*   */     //   160: istore #5
/*   */     //   162: aload #4
/*   */     //   164: getfield f3 : Z
/*   */     //   167: if_icmpeq -> 178
/*   */     //   170: iload #5
/*   */     //   172: ifeq -> 49
/*   */     //   175: goto -> 54
/*   */     //   178: aload_3
/*   */     //   179: getfield We0 : I
/*   */     //   182: dup
/*   */     //   183: istore_3
/*   */     //   184: aload #4
/*   */     //   186: getfield We0 : I
/*   */     //   189: dup
/*   */     //   190: istore #4
/*   */     //   192: if_icmpeq -> 203
/*   */     //   195: iload_3
/*   */     //   196: iload #4
/*   */     //   198: isub
/*   */     //   199: istore_0
/*   */     //   200: goto -> 211
/*   */     //   203: iinc #2, -1
/*   */     //   206: goto -> 67
/*   */     //   209: iconst_0
/*   */     //   210: istore_0
/*   */     //   211: iload_0
/*   */     //   212: ireturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 6
/*   */   }
/*   */   
/*   */   public final int TB0() {
/*   */     int i;
/*   */     byte b;
/*   */     lw0[] arrayOfLw0;
/*   */     for (i = 0, b = 0; b < (arrayOfLw0 = this.rJ0).length; ) {
/*   */       int j;
/*   */       lw0 lw01;
/*   */       (lw01 = arrayOfLw0[b]).TZ = i;
/*   */       int k;
/*   */       if ((k = (arrayOfLw0[b]).We0) != 5126 && k != 5132) {
/*   */         switch (k) {
/*   */           default:
/*   */             j = 0;
/*   */             break;
/*   */           case 5122:
/*   */           case 5123:
/*   */             j = j.uj * 2;
/*   */             break;
/*   */           case 5120:
/*   */           case 5121:
/*   */             j = j.uj;
/*   */             break;
/*   */         } 
/*   */       } else {
/*   */         j = j.uj * 4;
/*   */       } 
/*   */       i += j;
/*   */       b++;
/*   */     } 
/*   */     return i;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ao.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */