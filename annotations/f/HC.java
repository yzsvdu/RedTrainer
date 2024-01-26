/*   */ package f;public final class HC { public final void TC() { Object object; /* monitor enter BinaryOperatorExpression{ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} = FieldReferenceExpression{lastType=ObjectType{java/lang/Object}, expression=ObjectTypeReferenceExpression{ObjectType{f/HC}}, name=m7, descriptor=Ljava/lang/Object;}} */ try {  }
/*   */     finally
/* 3 */     { this = null;
/*   */       /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */ }
/*   */      }
/*   */ 
/*   */   
/*   */   public static final Object m7 = new Object();
/*   */   public static cp uB;
/*   */   public final fQ Hg0;
/*   */   
/*   */   public static HC k6() {
/*   */     // Byte code:
/*   */     //   0: getstatic f/HC.m7 : Ljava/lang/Object;
/*   */     //   3: dup
/*   */     //   4: dup
/*   */     //   5: astore_0
/*   */     //   6: monitorenter
/*   */     //   7: monitorenter
/*   */     //   8: getstatic f/HC.uB : Lf/cp;
/*   */     //   11: dup
/*   */     //   12: astore_1
/*   */     //   13: ifnull -> 26
/*   */     //   16: aload_1
/*   */     //   17: getfield K0 : Lf/lpt2;
/*   */     //   20: getstatic f/UB0.vj0 : Lf/XG;
/*   */     //   23: if_acmpeq -> 44
/*   */     //   26: aload_1
/*   */     //   27: ifnull -> 34
/*   */     //   30: aload_1
/*   */     //   31: invokevirtual dispose : ()V
/*   */     //   34: new f/cp
/*   */     //   37: dup
/*   */     //   38: invokespecial <init> : ()V
/*   */     //   41: putstatic f/HC.uB : Lf/cp;
/*   */     //   44: aload_0
/*   */     //   45: getstatic f/HC.uB : Lf/cp;
/*   */     //   48: astore_1
/*   */     //   49: monitorexit
/*   */     //   50: aload_1
/*   */     //   51: getfield vz0 : Lf/HC;
/*   */     //   54: ifnonnull -> 70
/*   */     //   57: aload_1
/*   */     //   58: new f/HC
/*   */     //   61: dup
/*   */     //   62: astore_2
/*   */     //   63: invokespecial <init> : ()V
/*   */     //   66: aload_2
/*   */     //   67: putfield vz0 : Lf/HC;
/*   */     //   70: aload_1
/*   */     //   71: getfield vz0 : Lf/HC;
/*   */     //   74: aload_0
/*   */     //   75: monitorexit
/*   */     //   76: areturn
/*   */     //   77: astore_1
/*   */     //   78: aload_1
/*   */     //   79: aload_0
/*   */     //   80: monitorexit
/*   */     //   81: athrow
/*   */     //   82: astore_1
/*   */     //   83: aload_1
/*   */     //   84: aload_0
/*   */     //   85: monitorexit
/*   */     //   86: athrow
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 7
/*   */     //   #2	-> 51
/*   */     //   #3	-> 80
/*   */     //   #4	-> 85
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   7	8	82	finally
/*   */     //   8	11	77	finally
/*   */     //   16	23	77	finally
/*   */     //   30	48	77	finally
/*   */     //   49	50	77	finally
/*   */     //   50	54	82	finally
/*   */     //   57	61	82	finally
/*   */     //   63	76	82	finally
/*   */     //   78	81	77	finally
/*   */     //   81	82	82	finally
/*   */     //   83	86	82	finally
/*   */   }
/*   */   
/*   */   public HC() {
/*   */     fQ fQ1;
/*   */     this(false, 8);
/*   */     this.Hg0 = this;
/*   */     TC();
/*   */   }
/*   */   
/*   */   public final oo S(oo paramoo, float paramFloat) {
/*   */     // Byte code:
/*   */     //   0: aload_1
/*   */     //   1: dup
/*   */     //   2: aload_0
/*   */     //   3: iconst_0
/*   */     //   4: istore_3
/*   */     //   5: getstatic f/HC.m7 : Ljava/lang/Object;
/*   */     //   8: dup
/*   */     //   9: astore #4
/*   */     //   11: monitorenter
/*   */     //   12: monitorenter
/*   */     //   13: monitorenter
/*   */     //   14: getfield co0 : Lf/HC;
/*   */     //   17: ifnonnull -> 105
/*   */     //   20: aload_1
/*   */     //   21: aload_0
/*   */     //   22: putfield co0 : Lf/HC;
/*   */     //   25: invokestatic nanoTime : ()J
/*   */     //   28: ldc2_w 1000000
/*   */     //   31: ldiv
/*   */     //   32: dup2
/*   */     //   33: lstore #5
/*   */     //   35: fload_2
/*   */     //   36: ldc 1000.0
/*   */     //   38: fmul
/*   */     //   39: f2l
/*   */     //   40: ladd
/*   */     //   41: lstore #7
/*   */     //   43: getstatic f/HC.uB : Lf/cp;
/*   */     //   46: getfield BF0 : J
/*   */     //   49: dup2
/*   */     //   50: lstore #9
/*   */     //   52: lconst_0
/*   */     //   53: lcmp
/*   */     //   54: ifle -> 67
/*   */     //   57: lload #7
/*   */     //   59: lload #5
/*   */     //   61: lload #9
/*   */     //   63: lsub
/*   */     //   64: lsub
/*   */     //   65: lstore #7
/*   */     //   67: aload_1
/*   */     //   68: aload #4
/*   */     //   70: dup
/*   */     //   71: aload_0
/*   */     //   72: aload_1
/*   */     //   73: aload_0
/*   */     //   74: aload_1
/*   */     //   75: iload_3
/*   */     //   76: aload_1
/*   */     //   77: dup
/*   */     //   78: lload #7
/*   */     //   80: putfield lu0 : J
/*   */     //   83: fconst_0
/*   */     //   84: f2l
/*   */     //   85: putfield Sf0 : J
/*   */     //   88: putfield tf : I
/*   */     //   91: getfield Hg0 : Lf/fQ;
/*   */     //   94: aload_1
/*   */     //   95: invokevirtual Com3 : (Ljava/lang/Object;)V
/*   */     //   98: monitorexit
/*   */     //   99: monitorexit
/*   */     //   100: invokevirtual notifyAll : ()V
/*   */     //   103: monitorexit
/*   */     //   104: areturn
/*   */     //   105: new java/lang/IllegalArgumentException
/*   */     //   108: dup
/*   */     //   109: ldc 'The same task may not be scheduled twice.'
/*   */     //   111: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   114: athrow
/*   */     //   115: astore_2
/*   */     //   116: aload_2
/*   */     //   117: aload_1
/*   */     //   118: monitorexit
/*   */     //   119: athrow
/*   */     //   120: astore_1
/*   */     //   121: aload_1
/*   */     //   122: aload_0
/*   */     //   123: monitorexit
/*   */     //   124: athrow
/*   */     //   125: astore_0
/*   */     //   126: aload_0
/*   */     //   127: aload #4
/*   */     //   129: monitorexit
/*   */     //   130: athrow
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 5
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   12	13	125	finally
/*   */     //   13	14	120	finally
/*   */     //   14	17	115	finally
/*   */     //   20	32	115	finally
/*   */     //   43	49	115	finally
/*   */     //   67	83	115	finally
/*   */     //   85	99	115	finally
/*   */     //   99	100	120	finally
/*   */     //   100	104	125	finally
/*   */     //   105	115	115	finally
/*   */     //   116	119	115	finally
/*   */     //   119	120	120	finally
/*   */     //   121	124	120	finally
/*   */     //   124	125	125	finally
/*   */     //   126	130	125	finally
/*   */   }
/*   */   
/*   */   public final synchronized long zT(long paramLong1, long paramLong2) {
/*   */     byte b = 0;
/*   */     int i = this.Hg0.Z8;
/*   */     /* monitor enter BinaryOperatorExpression{ClassFileLocalVariableReferenceExpression{type=ObjectType{f/oo}, name=null} = CastExpression{cast (ObjectType{f/oo}) MethodInvocationExpression{call FieldReferenceExpression{lastType=ObjectType{f/fQ}, expression=ThisExpression{ObjectType{f/HC}}, name=Hg0, descriptor=Lf/fQ;} . get((I)Ljava/lang/Object;)}}} */
/*   */     while (b < i) {
/*   */       oo oo;
/*   */       try {
/*   */         long l;
/*   */         if ((l = ((oo)this.Hg0.get(b)).lu0) > paramLong1) {
/*   */           paramLong2 = Math.min(paramLong2, l - paramLong1);
/*   */         } else {
/*   */           if (oo.tf == 0) {
/*   */             oo.co0 = null;
/*   */             this.Hg0.Hc(b);
/*   */             b--;
/*   */             i--;
/*   */           } else {
/*   */             oo.lu0 = paramLong1 + (paramLong2 = oo.Sf0);
/*   */             paramLong2 = Math.min(paramLong2, paramLong2);
/*   */             int j;
/*   */             if ((j = oo.tf) > 0)
/*   */               oo.tf = j - 1; 
/*   */           } 
/*   */           oo.F3.fN(oo);
/*   */         } 
/*   */       } finally {
/*   */         this = null;
/*   */         /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{f/oo}, name=null} */
/*   */       } 
/*   */     } 
/*   */     return paramLong2;
/*   */   }
/*   */   
/*   */   public final synchronized void th(long paramLong) {
/*   */     byte b = 0;
/*   */     int i = this.Hg0.Z8;
/*   */     while (b < i) {
/*   */       synchronized ((oo)this.Hg0.get(b)) {
/*   */         ((oo)this.Hg0.get(b)).lu0 += paramLong;
/*   */         /* monitor exit CastExpression{cast (ObjectType{f/oo}) MethodInvocationExpression{call FieldReferenceExpression{lastType=ObjectType{f/fQ}, expression=ThisExpression{ObjectType{f/HC}}, name=Hg0, descriptor=Lf/fQ;} . get((I)Ljava/lang/Object;)}} */
/*   */         b++;
/*   */       } 
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/HC.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */