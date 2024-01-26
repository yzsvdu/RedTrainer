/* 1 */ package f;public abstract class hm { public static Object[] LpT6(Object[] paramArrayOfObject, Object paramObject, Class<?> paramClass) { if (paramObject != null) { int i; if (paramArrayOfObject == null) { i = 0; } else { i = paramArrayOfObject.length; }  Object[] arrayOfObject = (Object[])Array.newInstance(paramClass, i + 1); if (i > 0) System.arraycopy(paramArrayOfObject, 0, arrayOfObject, 0, i);  arrayOfObject[i] = paramObject; return arrayOfObject; }  throw new NullPointerException("callback"); }
/*   */ 
/*   */   
/*   */   public static Object[] LL0(Object paramObject, Object[] paramArrayOfObject) {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: ifnull -> 128
/*   */     //   4: aload_1
/*   */     //   5: ifnull -> 34
/*   */     //   8: aload_1
/*   */     //   9: iconst_0
/*   */     //   10: istore_2
/*   */     //   11: arraylength
/*   */     //   12: istore_3
/*   */     //   13: iload_2
/*   */     //   14: iload_3
/*   */     //   15: if_icmpge -> 34
/*   */     //   18: aload_1
/*   */     //   19: iload_2
/*   */     //   20: aaload
/*   */     //   21: aload_0
/*   */     //   22: if_acmpne -> 28
/*   */     //   25: goto -> 36
/*   */     //   28: iinc #2, 1
/*   */     //   31: goto -> 13
/*   */     //   34: iconst_m1
/*   */     //   35: istore_2
/*   */     //   36: iload_2
/*   */     //   37: iflt -> 126
/*   */     //   40: aload_1
/*   */     //   41: arraylength
/*   */     //   42: istore_0
/*   */     //   43: getstatic f/hm.iE : Z
/*   */     //   46: ifne -> 69
/*   */     //   49: iload_2
/*   */     //   50: iflt -> 61
/*   */     //   53: iload_2
/*   */     //   54: iload_0
/*   */     //   55: if_icmpge -> 61
/*   */     //   58: goto -> 69
/*   */     //   61: new java/lang/AssertionError
/*   */     //   64: dup
/*   */     //   65: invokespecial <init> : ()V
/*   */     //   68: athrow
/*   */     //   69: iload_0
/*   */     //   70: iconst_1
/*   */     //   71: if_icmpne -> 81
/*   */     //   74: aconst_null
/*   */     //   75: astore_0
/*   */     //   76: aload_0
/*   */     //   77: astore_1
/*   */     //   78: goto -> 126
/*   */     //   81: aload_1
/*   */     //   82: iload_0
/*   */     //   83: iconst_1
/*   */     //   84: isub
/*   */     //   85: dup
/*   */     //   86: istore_0
/*   */     //   87: iload_2
/*   */     //   88: aload_1
/*   */     //   89: dup
/*   */     //   90: invokevirtual getClass : ()Ljava/lang/Class;
/*   */     //   93: invokevirtual getComponentType : ()Ljava/lang/Class;
/*   */     //   96: iload_0
/*   */     //   97: invokestatic newInstance : (Ljava/lang/Class;I)Ljava/lang/Object;
/*   */     //   100: checkcast [Ljava/lang/Object;
/*   */     //   103: astore_0
/*   */     //   104: iconst_0
/*   */     //   105: aload_0
/*   */     //   106: iconst_0
/*   */     //   107: iload_2
/*   */     //   108: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
/*   */     //   111: iload_2
/*   */     //   112: iconst_1
/*   */     //   113: iadd
/*   */     //   114: istore_1
/*   */     //   115: isub
/*   */     //   116: istore_3
/*   */     //   117: iload_1
/*   */     //   118: aload_0
/*   */     //   119: iload_2
/*   */     //   120: iload_3
/*   */     //   121: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
/*   */     //   124: aload_0
/*   */     //   125: astore_1
/*   */     //   126: aload_1
/*   */     //   127: areturn
/*   */     //   128: new java/lang/NullPointerException
/*   */     //   131: dup
/*   */     //   132: ldc 'callback'
/*   */     //   134: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   137: athrow
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 11
/*   */     //   #2	-> 41
/*   */     //   #3	-> 128
/*   */   }
/*   */   
/*   */   public static void Fz0(Runnable[] paramArrayOfRunnable) {
/*   */     if (paramArrayOfRunnable != null) {
/*   */       int i = paramArrayOfRunnable.length;
/*   */       for (byte b = 0; b < i; b++)
/*   */         paramArrayOfRunnable[b].run(); 
/*   */     } 
/*   */   }
/*   */   
/*   */   public static void c50(tC0[] paramArrayOftC0, Enum paramEnum) {
/*   */     if (paramArrayOftC0 != null) {
/*   */       int i = paramArrayOftC0.length;
/*   */       for (byte b = 0; b < i; b++)
/*   */         paramArrayOftC0[b].yb0(paramEnum); 
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/hm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */