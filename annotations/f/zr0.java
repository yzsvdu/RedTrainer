/* 1 */ package f;public final class zr0 { public static final nH0[] Yc = new nH0[0]; public final HashMap BN = new HashMap<>(); public static boolean tX(LPT3 paramLPT3, Y paramY) { return (paramY.Bp0 == paramLPT3); } public final short[] YH0 = new short[3]; public zr0(nH0[] paramArrayOfnH0) { int i = paramArrayOfnH0.length; for (byte b = 0; b < i; b++) Bd0(paramArrayOfnH0[b]);  } public static boolean Tc0(boolean paramBoolean, short paramShort, Y paramY) { short s; if (paramBoolean)
/*   */     
/* 3 */     { s = dx.l90(paramY.Lh.p1); }
/*   */     else
/* 5 */     { s = paramY.Lh.p1; }  return (s == paramShort); } public static boolean Uq(Hu0 paramHu0, Y paramY) { return (paramY.Bp0.Y8 == paramHu0); } public final boolean vH0(byte paramByte, short paramShort1, short paramShort2) { synchronized (this.BN) { for (Iterator<Y> iterator = this.BN.values().iterator(); iterator.hasNext();) { if ((y = iterator.next()) != null && (nH01 = y.Lh).p1 == paramShort1 && ((b = nH01.Pw0) == paramByte || b == -1 || paramByte == -1) && (paramShort2 = (short)(paramShort2 - nH01.Sf0)) <= 0) { /* monitor exit ThisExpression{ObjectType{java/util/HashMap}} */ return true; }  }  /* monitor exit ThisExpression{ObjectType{java/util/HashMap}} */ return false; }
/*   */      }
/*   */ 
/*   */   
/*   */   public final void Bd0(nH0 paramnH0) {
/*   */     this(paramnH0);
/*   */     Y y;
/*   */     HashMap hashMap;
/*   */     /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashMap}, name=null} */
/*   */     try {
/*   */       return;
/*   */     } finally {
/*   */       this = null;
/*   */       /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashMap}, name=null} */
/*   */     } 
/*   */   }
/*   */   
/*   */   public final Y u60(int paramInt) {
/*   */     synchronized (this.BN) {
/*   */       /* monitor exit ThisExpression{ObjectType{java/util/HashMap}} */
/*   */       return (Y)this.BN.get(Integer.valueOf(paramInt));
/*   */     } 
/*   */   }
/*   */   
/*   */   public final Y C8(short paramShort) {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: dup
/*   */     //   2: getfield BN : Ljava/util/HashMap;
/*   */     //   5: dup
/*   */     //   6: astore_0
/*   */     //   7: monitorenter
/*   */     //   8: getfield BN : Ljava/util/HashMap;
/*   */     //   11: invokevirtual values : ()Ljava/util/Collection;
/*   */     //   14: invokeinterface iterator : ()Ljava/util/Iterator;
/*   */     //   19: astore_2
/*   */     //   20: aload_2
/*   */     //   21: invokeinterface hasNext : ()Z
/*   */     //   26: ifeq -> 59
/*   */     //   29: aload_2
/*   */     //   30: invokeinterface next : ()Ljava/lang/Object;
/*   */     //   35: checkcast f/Y
/*   */     //   38: dup
/*   */     //   39: astore_3
/*   */     //   40: ifnull -> 20
/*   */     //   43: aload_3
/*   */     //   44: getfield Lh : Lf/nH0;
/*   */     //   47: getfield p1 : S
/*   */     //   50: iload_1
/*   */     //   51: if_icmpne -> 20
/*   */     //   54: aload_0
/*   */     //   55: monitorexit
/*   */     //   56: goto -> 63
/*   */     //   59: aload_0
/*   */     //   60: monitorexit
/*   */     //   61: aconst_null
/*   */     //   62: astore_3
/*   */     //   63: aload_3
/*   */     //   64: areturn
/*   */     //   65: astore_1
/*   */     //   66: aload_1
/*   */     //   67: aload_0
/*   */     //   68: monitorexit
/*   */     //   69: athrow
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 2
/*   */     //   #2	-> 44
/*   */     //   #3	-> 47
/*   */     //   #4	-> 55
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   8	19	65	finally
/*   */     //   20	26	65	finally
/*   */     //   29	38	65	finally
/*   */     //   43	50	65	finally
/*   */     //   54	61	65	finally
/*   */     //   66	69	65	finally
/*   */   }
/*   */   
/*   */   public final void v1(int paramInt) {
/*   */     HashMap hashMap;
/*   */     /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashMap}, name=null} */
/*   */     try {
/*   */       return;
/*   */     } finally {
/*   */       this = null;
/*   */       /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashMap}, name=null} */
/*   */     } 
/*   */   }
/*   */   
/*   */   public final Y[] ro0() {
/*   */     synchronized (this.BN) {
/*   */       Y[] arrayOfY = new Y[this.BN.size()];
/*   */       /* monitor exit ThisExpression{ObjectType{java/util/HashMap}} */
/*   */       return (Y[])this.BN.values().toArray((Object[])arrayOfY);
/*   */     } 
/*   */   }
/*   */   
/*   */   public final Y[] Qw0(Hu0 paramHu0) {
/*   */     synchronized (this.BN) {
/*   */       /* monitor exit ThisExpression{ObjectType{java/util/HashMap}} */
/*   */       return (Y[])this.BN.values().stream().filter(paramHu0::Uq).toArray(zr0::tG);
/*   */     } 
/*   */   }
/*   */   
/*   */   public final Y Aq0(short paramShort) {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: iconst_1
/*   */     //   2: istore_2
/*   */     //   3: iconst_m1
/*   */     //   4: iload_1
/*   */     //   5: iconst_1
/*   */     //   6: invokevirtual vH0 : (BSS)Z
/*   */     //   9: ifne -> 14
/*   */     //   12: aconst_null
/*   */     //   13: areturn
/*   */     //   14: aload_0
/*   */     //   15: dup
/*   */     //   16: iload_1
/*   */     //   17: invokestatic l90 : (S)S
/*   */     //   20: istore_0
/*   */     //   21: getfield BN : Ljava/util/HashMap;
/*   */     //   24: dup
/*   */     //   25: astore_1
/*   */     //   26: monitorenter
/*   */     //   27: getfield BN : Ljava/util/HashMap;
/*   */     //   30: invokevirtual values : ()Ljava/util/Collection;
/*   */     //   33: invokeinterface stream : ()Ljava/util/stream/Stream;
/*   */     //   38: iload_2
/*   */     //   39: iload_0
/*   */     //   40: <illegal opcode> test : (ZS)Ljava/util/function/Predicate;
/*   */     //   45: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
/*   */     //   50: <illegal opcode> apply : ()Ljava/util/function/Function;
/*   */     //   55: invokestatic comparing : (Ljava/util/function/Function;)Ljava/util/Comparator;
/*   */     //   58: invokeinterface max : (Ljava/util/Comparator;)Ljava/util/Optional;
/*   */     //   63: aconst_null
/*   */     //   64: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   67: checkcast f/Y
/*   */     //   70: aload_1
/*   */     //   71: monitorexit
/*   */     //   72: areturn
/*   */     //   73: astore_0
/*   */     //   74: aload_0
/*   */     //   75: aload_1
/*   */     //   76: monitorexit
/*   */     //   77: athrow
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 6
/*   */     //   #2	-> 17
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   27	72	73	finally
/*   */     //   74	77	73	finally
/*   */   }
/*   */   
/*   */   public final Y V7(LPT3 paramLPT3) {
/*   */     if (!vH0((byte)-1, paramLPT3.bj0, (short)1))
/*   */       return null; 
/*   */     synchronized (this.BN) {
/*   */       /* monitor exit ThisExpression{ObjectType{java/util/HashMap}} */
/*   */       return this.BN.values().stream().filter(paramLPT3::tX).max(Comparator.comparing(Y::oD0)).orElse(null);
/*   */     } 
/*   */   }
/*   */   
/*   */   public final int jW(short paramShort) {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: dup
/*   */     //   2: getfield BN : Ljava/util/HashMap;
/*   */     //   5: dup
/*   */     //   6: astore_0
/*   */     //   7: monitorenter
/*   */     //   8: iconst_0
/*   */     //   9: istore_2
/*   */     //   10: getfield BN : Ljava/util/HashMap;
/*   */     //   13: invokevirtual values : ()Ljava/util/Collection;
/*   */     //   16: invokeinterface iterator : ()Ljava/util/Iterator;
/*   */     //   21: astore_3
/*   */     //   22: aload_3
/*   */     //   23: invokeinterface hasNext : ()Z
/*   */     //   28: ifeq -> 72
/*   */     //   31: aload_3
/*   */     //   32: invokeinterface next : ()Ljava/lang/Object;
/*   */     //   37: checkcast f/Y
/*   */     //   40: dup
/*   */     //   41: astore #4
/*   */     //   43: ifnull -> 22
/*   */     //   46: aload #4
/*   */     //   48: getfield Lh : Lf/nH0;
/*   */     //   51: dup
/*   */     //   52: astore #4
/*   */     //   54: getfield p1 : S
/*   */     //   57: iload_1
/*   */     //   58: if_icmpne -> 22
/*   */     //   61: iload_2
/*   */     //   62: aload #4
/*   */     //   64: getfield Sf0 : S
/*   */     //   67: iadd
/*   */     //   68: istore_2
/*   */     //   69: goto -> 22
/*   */     //   72: iload_2
/*   */     //   73: aload_0
/*   */     //   74: monitorexit
/*   */     //   75: ireturn
/*   */     //   76: astore_1
/*   */     //   77: aload_1
/*   */     //   78: aload_0
/*   */     //   79: monitorexit
/*   */     //   80: athrow
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 48
/*   */     //   #2	-> 54
/*   */     //   #3	-> 64
/*   */     //   #4	-> 74
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   10	21	76	finally
/*   */     //   22	28	76	finally
/*   */     //   31	40	76	finally
/*   */     //   46	51	76	finally
/*   */     //   54	57	76	finally
/*   */     //   61	67	76	finally
/*   */     //   72	75	76	finally
/*   */     //   77	80	76	finally
/*   */   }
/*   */   
/*   */   public final short[] O20() {
/*   */     return this.YH0;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/zr0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */