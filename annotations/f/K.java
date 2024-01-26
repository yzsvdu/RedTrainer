/* 1 */ package f;public abstract class K { public static Object S60(Field paramField, Properties[] paramArrayOfProperties) { mB0 mB0; String str3 = (mB0 = paramField.<Annotation>getAnnotation(mB0.class)).defaultValue(), str5 = null; String str4; if ((str4 = ((mB0)paramField.<Annotation>getAnnotation(mB0.class)).key()).isEmpty()) { Op0
/* 2 */         .warn(B40.df("Property ").append(paramField.getName()).append(" of class ").append(paramField.getDeclaringClass().getName()).append(" has empty key").toString()); }
/* 3 */     else { int i = paramArrayOfProperties.length; byte b = 0; while (true) { if (b < i) { Properties properties; if ((properties = paramArrayOfProperties[b]).containsKey(str4)) { String str = properties.getProperty(str4); break; }  b++; continue; }  str5 = null; break; }  }  if (str5 != null) str3 = str5; 
/* 4 */     String str1 = mB0.min(), str2 = mB0.max(); return cOM9.kG(paramField.getType(), mB0.propertyTransformer()).xr(str3, paramField, str1, str2); }
/*   */ 
/*   */   
/*   */   public static final ik Op0 = C00.gd(K.class);
/*   */   
/*   */   public static void GP(Class paramClass, Object paramObject, Properties[] paramArrayOfProperties) {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
/*   */     //   4: dup
/*   */     //   5: astore_3
/*   */     //   6: arraylength
/*   */     //   7: istore #4
/*   */     //   9: iconst_0
/*   */     //   10: istore #5
/*   */     //   12: iload #5
/*   */     //   14: iload #4
/*   */     //   16: if_icmpge -> 351
/*   */     //   19: aload_3
/*   */     //   20: iload #5
/*   */     //   22: aaload
/*   */     //   23: dup
/*   */     //   24: astore #6
/*   */     //   26: invokevirtual getModifiers : ()I
/*   */     //   29: invokestatic isStatic : (I)Z
/*   */     //   32: ifeq -> 42
/*   */     //   35: aload_1
/*   */     //   36: ifnull -> 42
/*   */     //   39: goto -> 345
/*   */     //   42: aload #6
/*   */     //   44: invokevirtual getModifiers : ()I
/*   */     //   47: invokestatic isStatic : (I)Z
/*   */     //   50: ifne -> 60
/*   */     //   53: aload_1
/*   */     //   54: ifnonnull -> 60
/*   */     //   57: goto -> 345
/*   */     //   60: aload #6
/*   */     //   62: ldc f/mB0
/*   */     //   64: invokevirtual isAnnotationPresent : (Ljava/lang/Class;)Z
/*   */     //   67: ifeq -> 345
/*   */     //   70: aload #6
/*   */     //   72: invokevirtual getModifiers : ()I
/*   */     //   75: invokestatic isFinal : (I)Z
/*   */     //   78: ifne -> 296
/*   */     //   81: aload #6
/*   */     //   83: dup
/*   */     //   84: dup
/*   */     //   85: invokevirtual isAccessible : ()Z
/*   */     //   88: istore #7
/*   */     //   90: iconst_1
/*   */     //   91: invokevirtual setAccessible : (Z)V
/*   */     //   94: ldc f/mB0
/*   */     //   96: invokevirtual getAnnotation : (Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
/*   */     //   99: checkcast f/mB0
/*   */     //   102: astore #8
/*   */     //   104: ldc 'DO_NOT_OVERWRITE_INITIALIZATION_VALUE'
/*   */     //   106: aload #8
/*   */     //   108: invokeinterface defaultValue : ()Ljava/lang/String;
/*   */     //   113: invokevirtual equals : (Ljava/lang/Object;)Z
/*   */     //   116: ifeq -> 222
/*   */     //   119: aload_2
/*   */     //   120: aload #8
/*   */     //   122: invokeinterface key : ()Ljava/lang/String;
/*   */     //   127: astore #8
/*   */     //   129: arraylength
/*   */     //   130: istore #9
/*   */     //   132: iconst_0
/*   */     //   133: istore #10
/*   */     //   135: iload #10
/*   */     //   137: iload #9
/*   */     //   139: if_icmpge -> 175
/*   */     //   142: aload_2
/*   */     //   143: iload #10
/*   */     //   145: aaload
/*   */     //   146: dup
/*   */     //   147: astore #11
/*   */     //   149: aload #8
/*   */     //   151: invokevirtual containsKey : (Ljava/lang/Object;)Z
/*   */     //   154: ifeq -> 169
/*   */     //   157: aload #11
/*   */     //   159: aload #8
/*   */     //   161: invokevirtual getProperty : (Ljava/lang/String;)Ljava/lang/String;
/*   */     //   164: astore #8
/*   */     //   166: goto -> 178
/*   */     //   169: iinc #10, 1
/*   */     //   172: goto -> 135
/*   */     //   175: aconst_null
/*   */     //   176: astore #8
/*   */     //   178: aload #8
/*   */     //   180: ifnull -> 187
/*   */     //   183: iconst_1
/*   */     //   184: goto -> 188
/*   */     //   187: iconst_0
/*   */     //   188: ifeq -> 194
/*   */     //   191: goto -> 222
/*   */     //   194: getstatic f/K.Op0 : Lf/ik;
/*   */     //   197: invokeinterface isDebugEnabled : ()Z
/*   */     //   202: ifeq -> 234
/*   */     //   205: aload #6
/*   */     //   207: dup
/*   */     //   208: invokevirtual getName : ()Ljava/lang/String;
/*   */     //   211: pop
/*   */     //   212: invokevirtual getDeclaringClass : ()Ljava/lang/Class;
/*   */     //   215: invokevirtual getClass : ()Ljava/lang/Class;
/*   */     //   218: pop
/*   */     //   219: goto -> 234
/*   */     //   222: aload #6
/*   */     //   224: dup
/*   */     //   225: aload_2
/*   */     //   226: invokestatic S60 : (Ljava/lang/reflect/Field;[Ljava/util/Properties;)Ljava/lang/Object;
/*   */     //   229: aload_1
/*   */     //   230: swap
/*   */     //   231: invokevirtual set : (Ljava/lang/Object;Ljava/lang/Object;)V
/*   */     //   234: aload #6
/*   */     //   236: iload #7
/*   */     //   238: invokevirtual setAccessible : (Z)V
/*   */     //   241: goto -> 345
/*   */     //   244: astore_0
/*   */     //   245: new java/lang/RuntimeException
/*   */     //   248: dup
/*   */     //   249: dup
/*   */     //   250: astore_1
/*   */     //   251: ldc 'Can not transform field '
/*   */     //   253: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   256: aload #6
/*   */     //   258: invokevirtual getName : ()Ljava/lang/String;
/*   */     //   261: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   264: ldc ' of class '
/*   */     //   266: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   269: aload #6
/*   */     //   271: invokevirtual getDeclaringClass : ()Ljava/lang/Class;
/*   */     //   274: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*   */     //   277: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   280: aload_0
/*   */     //   281: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*   */     //   284: getstatic f/K.Op0 : Lf/ik;
/*   */     //   287: ldc ''
/*   */     //   289: aload_1
/*   */     //   290: invokeinterface error : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*   */     //   295: athrow
/*   */     //   296: new java/lang/RuntimeException
/*   */     //   299: dup
/*   */     //   300: dup
/*   */     //   301: astore_1
/*   */     //   302: ldc 'Attempt to proceed final field '
/*   */     //   304: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   307: aload #6
/*   */     //   309: invokevirtual getName : ()Ljava/lang/String;
/*   */     //   312: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   315: ldc ' of class '
/*   */     //   317: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   320: aload_0
/*   */     //   321: invokevirtual getName : ()Ljava/lang/String;
/*   */     //   324: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   327: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   330: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   333: getstatic f/K.Op0 : Lf/ik;
/*   */     //   336: ldc ''
/*   */     //   338: aload_1
/*   */     //   339: invokeinterface error : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*   */     //   344: athrow
/*   */     //   345: iinc #5, 1
/*   */     //   348: goto -> 12
/*   */     //   351: aload_1
/*   */     //   352: ifnonnull -> 389
/*   */     //   355: aload_0
/*   */     //   356: invokevirtual getInterfaces : ()[Ljava/lang/Class;
/*   */     //   359: dup
/*   */     //   360: astore_3
/*   */     //   361: arraylength
/*   */     //   362: istore #4
/*   */     //   364: iconst_0
/*   */     //   365: istore #5
/*   */     //   367: iload #5
/*   */     //   369: iload #4
/*   */     //   371: if_icmpge -> 389
/*   */     //   374: aload_3
/*   */     //   375: iload #5
/*   */     //   377: aaload
/*   */     //   378: aload_1
/*   */     //   379: aload_2
/*   */     //   380: invokestatic GP : (Ljava/lang/Class;Ljava/lang/Object;[Ljava/util/Properties;)V
/*   */     //   383: iinc #5, 1
/*   */     //   386: goto -> 367
/*   */     //   389: aload_0
/*   */     //   390: invokevirtual getSuperclass : ()Ljava/lang/Class;
/*   */     //   393: dup
/*   */     //   394: astore_0
/*   */     //   395: ifnull -> 410
/*   */     //   398: aload_0
/*   */     //   399: ldc java/lang/Object
/*   */     //   401: if_acmpeq -> 410
/*   */     //   404: aload_0
/*   */     //   405: aload_1
/*   */     //   406: aload_2
/*   */     //   407: invokestatic GP : (Ljava/lang/Class;Ljava/lang/Object;[Ljava/util/Properties;)V
/*   */     //   410: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 1
/*   */     //   #2	-> 85
/*   */     //   #3	-> 129
/*   */     //   #4	-> 194
/*   */     //   #5	-> 251
/*   */     //   #6	-> 258
/*   */     //   #7	-> 296
/*   */     //   #8	-> 302
/*   */     //   #9	-> 309
/*   */     //   #10	-> 356
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   94	102	244	java/lang/Exception
/*   */     //   104	116	244	java/lang/Exception
/*   */     //   119	127	244	java/lang/Exception
/*   */     //   129	130	244	java/lang/Exception
/*   */     //   142	146	244	java/lang/Exception
/*   */     //   149	154	244	java/lang/Exception
/*   */     //   157	164	244	java/lang/Exception
/*   */     //   194	202	244	java/lang/Exception
/*   */     //   205	211	244	java/lang/Exception
/*   */     //   212	218	244	java/lang/Exception
/*   */     //   222	234	244	java/lang/Exception
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/K.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */