/* 1 */ package f;public final class Sl0 { public final HashMap Zo; public Sl0() { HashMap<Object, Object> hashMap; this(); this.Zo = this; } public Sl0(Qv paramQv) { this(); if (paramQv.PD0() == '{') { char c; while ((c = paramQv.PD0()) != '\000') { if (c != '}') { paramQv.S9(); String str = paramQv.jk().toString(); if (paramQv.PD0() == ':') { if (str != null) if (mB0(str) == null) { Object object; if ((object = paramQv.jk()) != null) t(object, str);  } else { throw paramQv.mo0("Duplicate key \"" + str + "\""); }   char c1; if ((c1 = paramQv.PD0()) != ',' && c1 != ';') { if (c1 == '}') return;  throw paramQv.mo0("Expected a ',' or '}'"); }  if (paramQv.PD0() == '}') return;  paramQv.S9(); continue; }  throw paramQv.mo0("Expected a ':' after a key"); }  return; }  throw paramQv.mo0("A JSONObject text must end with '}'"); }  throw paramQv.mo0("A JSONObject text must begin with '{'"); } public Sl0(Map paramMap) { HashMap<Object, Object> hashMap; if (paramMap == null) { this(); this.Zo = this; } else { ((Sl0)super).Zo = new HashMap<Object, Object>(paramMap.size()); Iterator<Map.Entry> iterator = paramMap.entrySet().iterator(); while (iterator.hasNext()) { Map.Entry<?, ?> entry; if ((entry = iterator.next()).getKey() != null) { Object object; if ((object = entry.getValue()) != null) { String str = String.valueOf(entry.getKey()); ((Sl0)super).Zo.put(str, bA(object)); }  continue; }  throw new NullPointerException("Null key."); }  }  } public static final sT lB0 = new sT(); public static Annotation nV(Method paramMethod, Class<? extends Annotation> paramClass) { if (paramMethod != null) { if (paramMethod.isAnnotationPresent(paramClass)) return paramMethod.getAnnotation((Class)paramClass);  Class<?> clazz; if ((clazz = paramMethod.getDeclaringClass()).getSuperclass() == null) return null;  Class[] arrayOfClass; int i = (arrayOfClass = clazz.getInterfaces()).length; for (byte b = 0; b < i; b++) { try { String str = paramMethod.getName(); return nV(arrayOfClass[b].getMethod(str, paramMethod.getParameterTypes()), paramClass); } catch (SecurityException securityException) {  } catch (NoSuchMethodException noSuchMethodException) {} }  try { String str = paramMethod.getName(); return nV(clazz.getSuperclass().getMethod(str, paramMethod.getParameterTypes()), paramClass); } catch (SecurityException securityException) { return null; } catch (NoSuchMethodException noSuchMethodException) { return null; }  }  return null; } public static int tJ(Method paramMethod, Class<? extends Annotation> paramClass) { if (paramMethod != null) { if (paramMethod.isAnnotationPresent(paramClass)) return 1;  Class<?> clazz; if ((clazz = paramMethod.getDeclaringClass()).getSuperclass() == null) return -1;  Class[] arrayOfClass; int i = (arrayOfClass = clazz.getInterfaces()).length; for (byte b = 0; b < i; b++) { try { String str = paramMethod.getName(); int j; if ((j = tJ(arrayOfClass[b].getMethod(str, paramMethod.getParameterTypes()), paramClass)) > 0) return j + 1;  } catch (SecurityException securityException) {  } catch (NoSuchMethodException noSuchMethodException) {} }  try { String str = paramMethod.getName(); int j; return ((j = tJ(clazz.getSuperclass().getMethod(str, paramMethod.getParameterTypes()), paramClass)) > 0) ? (j + 1) : -1; } catch (SecurityException securityException) { return -1; } catch (NoSuchMethodException noSuchMethodException) { return -1; }  }  return -1; } public static String Q7(String paramString) { StringBuffer stringBuffer; Exception exception; /* monitor enter BinaryOperatorExpression{ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/StringBuffer}, name=null} = MethodInvocationExpression{call ClassFileNewExpression{new ObjectType{java/io/StringWriter}} . getBuffer(()Ljava/lang/StringBuffer;)}} */ try { /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/StringBuffer}, name=null} */ return Wn0(paramString, new StringWriter()).toString(); } catch (IOException iOException) { /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/StringBuffer}, name=null} */ return ""; } finally {} /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/StringBuffer}, name=null} */ throw exception; } public static void Hg0(Object paramObject) { if (paramObject != null) if (paramObject instanceof Double) { if ((paramObject = paramObject).isInfinite() || paramObject.isNaN()) throw new m8("JSON does not allow non-finite numbers.");  } else if (paramObject instanceof Float && ((paramObject = paramObject).isInfinite() || paramObject.isNaN())) { throw new m8("JSON does not allow non-finite numbers."); }   } public static Object bA(Object paramObject) { if (paramObject == null) try { return lB0; }
/* 2 */       catch (Exception exception) { return null; }   if (paramObject instanceof Sl0 || paramObject instanceof xg || lB0.equals(paramObject) || paramObject instanceof Byte || paramObject instanceof Character || paramObject instanceof Short || paramObject instanceof Integer || paramObject instanceof Long || paramObject instanceof Boolean || paramObject instanceof Float || paramObject instanceof Double || paramObject instanceof String || paramObject instanceof java.math.BigInteger || paramObject instanceof java.math.BigDecimal || paramObject instanceof Enum) return paramObject;  if (paramObject instanceof Collection) { paramObject = paramObject; return new xg((Collection)paramObject); }  if (paramObject.getClass().isArray()) return new xg(paramObject);  if (paramObject instanceof Map) { paramObject = paramObject; return new Sl0((Map)paramObject); }  Package package_; if ((package_ = paramObject.getClass().getPackage()) != null) {  } else {  }  String str = ""; if (str.startsWith("java.") || str.startsWith("javax.") || paramObject.getClass().getClassLoader() == null) return paramObject.toString();  (new Sl0()).Lpt1(paramObject); return new Sl0(); } public static Writer Wn0(String paramString, StringWriter paramStringWriter) { Object object; if (paramString == null || paramString.isEmpty()) { paramStringWriter.write("\"\""); return paramStringWriter; }  boolean bool = false; int i = paramString.length(); paramStringWriter.write(34); byte b = 0; while (b < i) { char c; switch (c = paramString.charAt(b)) { default: case '/': if (object == 60) paramStringWriter.write(92);  paramStringWriter.write(c); continue;case '"': case '\\': paramStringWriter.write(92); paramStringWriter.write(c); break;case '\r': paramStringWriter.write("\\r"); break;case '\f': paramStringWriter.write("\\f"); break;case '\n': paramStringWriter.write("\\n"); break;case '\t': paramStringWriter.write("\\t"); break;case '\b': paramStringWriter.write("\\b"); break; }  continue; b++; object = SYNTHETIC_LOCAL_VARIABLE_5; }  paramStringWriter.write(34); return paramStringWriter; } public static final void IJ(StringWriter paramStringWriter, Object<?> paramObject, int paramInt) { // Byte code:
/*   */     //   0: aload_1
/*   */     //   1: iconst_0
/*   */     //   2: istore_3
/*   */     //   3: ifnull -> 504
/*   */     //   6: aload_1
/*   */     //   7: aconst_null
/*   */     //   8: invokevirtual equals : (Ljava/lang/Object;)Z
/*   */     //   11: ifeq -> 17
/*   */     //   14: goto -> 504
/*   */     //   17: aload_1
/*   */     //   18: instanceof java/lang/Number
/*   */     //   21: ifeq -> 137
/*   */     //   24: aload_1
/*   */     //   25: checkcast java/lang/Number
/*   */     //   28: dup
/*   */     //   29: invokestatic Hg0 : (Ljava/lang/Object;)V
/*   */     //   32: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   35: dup
/*   */     //   36: astore_1
/*   */     //   37: bipush #46
/*   */     //   39: invokevirtual indexOf : (I)I
/*   */     //   42: ifle -> 112
/*   */     //   45: aload_1
/*   */     //   46: bipush #101
/*   */     //   48: invokevirtual indexOf : (I)I
/*   */     //   51: ifge -> 112
/*   */     //   54: aload_1
/*   */     //   55: bipush #69
/*   */     //   57: invokevirtual indexOf : (I)I
/*   */     //   60: ifge -> 112
/*   */     //   63: aload_1
/*   */     //   64: ldc_w '0'
/*   */     //   67: invokevirtual endsWith : (Ljava/lang/String;)Z
/*   */     //   70: ifeq -> 89
/*   */     //   73: aload_1
/*   */     //   74: dup
/*   */     //   75: invokevirtual length : ()I
/*   */     //   78: iconst_1
/*   */     //   79: isub
/*   */     //   80: iconst_0
/*   */     //   81: swap
/*   */     //   82: invokevirtual substring : (II)Ljava/lang/String;
/*   */     //   85: astore_1
/*   */     //   86: goto -> 63
/*   */     //   89: aload_1
/*   */     //   90: ldc_w '.'
/*   */     //   93: invokevirtual endsWith : (Ljava/lang/String;)Z
/*   */     //   96: ifeq -> 112
/*   */     //   99: aload_1
/*   */     //   100: dup
/*   */     //   101: invokevirtual length : ()I
/*   */     //   104: iconst_1
/*   */     //   105: isub
/*   */     //   106: iconst_0
/*   */     //   107: swap
/*   */     //   108: invokevirtual substring : (II)Ljava/lang/String;
/*   */     //   111: astore_1
/*   */     //   112: aload_0
/*   */     //   113: aload_1
/*   */     //   114: new java/math/BigDecimal
/*   */     //   117: aload_1
/*   */     //   118: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   121: invokevirtual write : (Ljava/lang/String;)V
/*   */     //   124: goto -> 511
/*   */     //   127: pop
/*   */     //   128: aload_1
/*   */     //   129: aload_0
/*   */     //   130: invokestatic Wn0 : (Ljava/lang/String;Ljava/io/StringWriter;)Ljava/io/Writer;
/*   */     //   133: pop
/*   */     //   134: goto -> 511
/*   */     //   137: aload_1
/*   */     //   138: instanceof java/lang/Boolean
/*   */     //   141: ifeq -> 155
/*   */     //   144: aload_0
/*   */     //   145: aload_1
/*   */     //   146: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   149: invokevirtual write : (Ljava/lang/String;)V
/*   */     //   152: goto -> 511
/*   */     //   155: aload_1
/*   */     //   156: instanceof java/lang/Enum
/*   */     //   159: ifeq -> 179
/*   */     //   162: aload_0
/*   */     //   163: aload_1
/*   */     //   164: checkcast java/lang/Enum
/*   */     //   167: invokevirtual name : ()Ljava/lang/String;
/*   */     //   170: invokestatic Q7 : (Ljava/lang/String;)Ljava/lang/String;
/*   */     //   173: invokevirtual write : (Ljava/lang/String;)V
/*   */     //   176: goto -> 511
/*   */     //   179: aload_1
/*   */     //   180: instanceof f/Sl0
/*   */     //   183: ifeq -> 199
/*   */     //   186: aload_1
/*   */     //   187: checkcast f/Sl0
/*   */     //   190: aload_0
/*   */     //   191: iload_2
/*   */     //   192: invokevirtual abstract : (Ljava/io/StringWriter;I)Ljava/io/Writer;
/*   */     //   195: pop
/*   */     //   196: goto -> 511
/*   */     //   199: aload_1
/*   */     //   200: instanceof f/xg
/*   */     //   203: ifeq -> 219
/*   */     //   206: aload_1
/*   */     //   207: checkcast f/xg
/*   */     //   210: aload_0
/*   */     //   211: iload_2
/*   */     //   212: invokevirtual UD : (Ljava/io/StringWriter;I)Ljava/io/Writer;
/*   */     //   215: pop
/*   */     //   216: goto -> 511
/*   */     //   219: aload_1
/*   */     //   220: instanceof java/util/Map
/*   */     //   223: ifeq -> 248
/*   */     //   226: aload_1
/*   */     //   227: checkcast java/util/Map
/*   */     //   230: astore_1
/*   */     //   231: new f/Sl0
/*   */     //   234: dup
/*   */     //   235: aload_1
/*   */     //   236: invokespecial <init> : (Ljava/util/Map;)V
/*   */     //   239: aload_0
/*   */     //   240: iload_2
/*   */     //   241: invokevirtual abstract : (Ljava/io/StringWriter;I)Ljava/io/Writer;
/*   */     //   244: pop
/*   */     //   245: goto -> 511
/*   */     //   248: aload_1
/*   */     //   249: instanceof java/util/Collection
/*   */     //   252: ifeq -> 465
/*   */     //   255: aload_1
/*   */     //   256: checkcast java/util/Collection
/*   */     //   259: dup
/*   */     //   260: astore_1
/*   */     //   261: new java/util/ArrayList
/*   */     //   264: dup
/*   */     //   265: astore #4
/*   */     //   267: aload_1
/*   */     //   268: invokeinterface size : ()I
/*   */     //   273: invokespecial <init> : (I)V
/*   */     //   276: invokeinterface iterator : ()Ljava/util/Iterator;
/*   */     //   281: astore_1
/*   */     //   282: aload_1
/*   */     //   283: invokeinterface hasNext : ()Z
/*   */     //   288: ifeq -> 309
/*   */     //   291: aload #4
/*   */     //   293: aload_1
/*   */     //   294: invokeinterface next : ()Ljava/lang/Object;
/*   */     //   299: invokestatic bA : (Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   302: invokevirtual add : (Ljava/lang/Object;)Z
/*   */     //   305: pop
/*   */     //   306: goto -> 282
/*   */     //   309: aload #4
/*   */     //   311: iconst_0
/*   */     //   312: istore_1
/*   */     //   313: invokevirtual size : ()I
/*   */     //   316: dup
/*   */     //   317: istore #5
/*   */     //   319: aload_0
/*   */     //   320: bipush #91
/*   */     //   322: invokevirtual write : (I)V
/*   */     //   325: iconst_1
/*   */     //   326: if_icmpne -> 356
/*   */     //   329: aload_0
/*   */     //   330: aload #4
/*   */     //   332: iconst_0
/*   */     //   333: invokevirtual get : (I)Ljava/lang/Object;
/*   */     //   336: iload_2
/*   */     //   337: invokestatic IJ : (Ljava/io/StringWriter;Ljava/lang/Object;I)V
/*   */     //   340: goto -> 446
/*   */     //   343: astore_0
/*   */     //   344: new f/m8
/*   */     //   347: dup
/*   */     //   348: ldc_w 'Unable to write JSONArray value at index: 0'
/*   */     //   351: aload_0
/*   */     //   352: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Exception;)V
/*   */     //   355: athrow
/*   */     //   356: iload #5
/*   */     //   358: ifeq -> 446
/*   */     //   361: iload_2
/*   */     //   362: iload_3
/*   */     //   363: iadd
/*   */     //   364: istore_3
/*   */     //   365: iconst_0
/*   */     //   366: istore #6
/*   */     //   368: iload #6
/*   */     //   370: iload #5
/*   */     //   372: if_icmpge -> 441
/*   */     //   375: iload_1
/*   */     //   376: ifeq -> 385
/*   */     //   379: aload_0
/*   */     //   380: bipush #44
/*   */     //   382: invokevirtual write : (I)V
/*   */     //   385: aload_0
/*   */     //   386: aload #4
/*   */     //   388: iload #6
/*   */     //   390: aload_0
/*   */     //   391: iload_3
/*   */     //   392: invokestatic av0 : (Ljava/io/StringWriter;I)V
/*   */     //   395: invokevirtual get : (I)Ljava/lang/Object;
/*   */     //   398: iload_3
/*   */     //   399: invokestatic IJ : (Ljava/io/StringWriter;Ljava/lang/Object;I)V
/*   */     //   402: iconst_1
/*   */     //   403: istore_1
/*   */     //   404: iinc #6, 1
/*   */     //   407: goto -> 368
/*   */     //   410: astore_0
/*   */     //   411: new f/m8
/*   */     //   414: dup
/*   */     //   415: new java/lang/StringBuilder
/*   */     //   418: dup
/*   */     //   419: invokespecial <init> : ()V
/*   */     //   422: ldc_w 'Unable to write JSONArray value at index: '
/*   */     //   425: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   428: iload #6
/*   */     //   430: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*   */     //   433: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   436: aload_0
/*   */     //   437: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Exception;)V
/*   */     //   440: athrow
/*   */     //   441: aload_0
/*   */     //   442: iload_2
/*   */     //   443: invokestatic av0 : (Ljava/io/StringWriter;I)V
/*   */     //   446: aload_0
/*   */     //   447: bipush #93
/*   */     //   449: invokevirtual write : (I)V
/*   */     //   452: goto -> 511
/*   */     //   455: astore_0
/*   */     //   456: new f/m8
/*   */     //   459: dup
/*   */     //   460: aload_0
/*   */     //   461: invokespecial <init> : (Ljava/io/IOException;)V
/*   */     //   464: athrow
/*   */     //   465: aload_1
/*   */     //   466: invokevirtual getClass : ()Ljava/lang/Class;
/*   */     //   469: invokevirtual isArray : ()Z
/*   */     //   472: ifeq -> 492
/*   */     //   475: new f/xg
/*   */     //   478: dup
/*   */     //   479: aload_1
/*   */     //   480: invokespecial <init> : (Ljava/lang/Object;)V
/*   */     //   483: aload_0
/*   */     //   484: iload_2
/*   */     //   485: invokevirtual UD : (Ljava/io/StringWriter;I)Ljava/io/Writer;
/*   */     //   488: pop
/*   */     //   489: goto -> 511
/*   */     //   492: aload_1
/*   */     //   493: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   496: aload_0
/*   */     //   497: invokestatic Wn0 : (Ljava/lang/String;Ljava/io/StringWriter;)Ljava/io/Writer;
/*   */     //   500: pop
/*   */     //   501: goto -> 511
/*   */     //   504: aload_0
/*   */     //   505: ldc_w 'null'
/*   */     //   508: invokevirtual write : (Ljava/lang/String;)V
/*   */     //   511: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 29
/*   */     //   #2	-> 114
/*   */     //   #3	-> 261
/*   */     //   #4	-> 313
/*   */     //   #5	-> 322
/*   */     //   #6	-> 466
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   112	127	127	java/lang/NumberFormatException
/*   */     //   313	316	455	java/io/IOException
/*   */     //   319	325	455	java/io/IOException
/*   */     //   329	343	343	java/lang/Exception
/*   */     //   344	356	455	java/io/IOException
/*   */     //   379	395	455	java/io/IOException
/*   */     //   395	402	410	java/lang/Exception
/*   */     //   411	455	455	java/io/IOException } public static final void av0(StringWriter paramStringWriter, int paramInt) { for (byte b = 0; b < paramInt; b++) paramStringWriter.write(32);  } public final void Lpt1(Object paramObject) { // Byte code:
/*   */     //   0: aload_1
/*   */     //   1: invokevirtual getClass : ()Ljava/lang/Class;
/*   */     //   4: dup
/*   */     //   5: astore_2
/*   */     //   6: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
/*   */     //   9: ifnull -> 16
/*   */     //   12: iconst_1
/*   */     //   13: goto -> 17
/*   */     //   16: iconst_0
/*   */     //   17: ifeq -> 28
/*   */     //   20: aload_2
/*   */     //   21: invokevirtual getMethods : ()[Ljava/lang/reflect/Method;
/*   */     //   24: astore_2
/*   */     //   25: goto -> 33
/*   */     //   28: aload_2
/*   */     //   29: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
/*   */     //   32: astore_2
/*   */     //   33: aload_2
/*   */     //   34: arraylength
/*   */     //   35: istore_3
/*   */     //   36: iconst_0
/*   */     //   37: istore #4
/*   */     //   39: iload #4
/*   */     //   41: iload_3
/*   */     //   42: if_icmpge -> 470
/*   */     //   45: aload_2
/*   */     //   46: iload #4
/*   */     //   48: aaload
/*   */     //   49: dup
/*   */     //   50: astore #5
/*   */     //   52: invokevirtual getModifiers : ()I
/*   */     //   55: dup
/*   */     //   56: istore #6
/*   */     //   58: invokestatic isPublic : (I)Z
/*   */     //   61: ifeq -> 464
/*   */     //   64: iload #6
/*   */     //   66: invokestatic isStatic : (I)Z
/*   */     //   69: ifne -> 464
/*   */     //   72: aload #5
/*   */     //   74: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
/*   */     //   77: arraylength
/*   */     //   78: ifne -> 464
/*   */     //   81: aload #5
/*   */     //   83: invokevirtual isBridge : ()Z
/*   */     //   86: ifne -> 464
/*   */     //   89: aload #5
/*   */     //   91: invokevirtual getReturnType : ()Ljava/lang/Class;
/*   */     //   94: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
/*   */     //   97: if_acmpeq -> 464
/*   */     //   100: aload #5
/*   */     //   102: invokevirtual getName : ()Ljava/lang/String;
/*   */     //   105: astore #6
/*   */     //   107: ldc_w 'getClass'
/*   */     //   110: aload #6
/*   */     //   112: invokevirtual equals : (Ljava/lang/Object;)Z
/*   */     //   115: ifne -> 133
/*   */     //   118: ldc_w 'getDeclaringClass'
/*   */     //   121: aload #6
/*   */     //   123: invokevirtual equals : (Ljava/lang/Object;)Z
/*   */     //   126: ifne -> 133
/*   */     //   129: iconst_1
/*   */     //   130: goto -> 134
/*   */     //   133: iconst_0
/*   */     //   134: ifeq -> 464
/*   */     //   137: aload #5
/*   */     //   139: ldc_w f/Zp0
/*   */     //   142: invokestatic tJ : (Ljava/lang/reflect/Method;Ljava/lang/Class;)I
/*   */     //   145: dup
/*   */     //   146: istore #6
/*   */     //   148: ifle -> 175
/*   */     //   151: aload #5
/*   */     //   153: ldc_w f/ip
/*   */     //   156: invokestatic tJ : (Ljava/lang/reflect/Method;Ljava/lang/Class;)I
/*   */     //   159: dup
/*   */     //   160: istore #7
/*   */     //   162: iflt -> 382
/*   */     //   165: iload #6
/*   */     //   167: iload #7
/*   */     //   169: if_icmpgt -> 175
/*   */     //   172: goto -> 382
/*   */     //   175: aload #5
/*   */     //   177: ldc_w f/ip
/*   */     //   180: invokestatic nV : (Ljava/lang/reflect/Method;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
/*   */     //   183: checkcast f/ip
/*   */     //   186: dup
/*   */     //   187: astore #6
/*   */     //   189: ifnull -> 227
/*   */     //   192: aload #6
/*   */     //   194: invokeinterface value : ()Ljava/lang/String;
/*   */     //   199: ifnull -> 227
/*   */     //   202: aload #6
/*   */     //   204: invokeinterface value : ()Ljava/lang/String;
/*   */     //   209: invokevirtual isEmpty : ()Z
/*   */     //   212: ifne -> 227
/*   */     //   215: aload #6
/*   */     //   217: invokeinterface value : ()Ljava/lang/String;
/*   */     //   222: astore #6
/*   */     //   224: goto -> 385
/*   */     //   227: aload #5
/*   */     //   229: invokevirtual getName : ()Ljava/lang/String;
/*   */     //   232: dup
/*   */     //   233: astore #6
/*   */     //   235: ldc_w 'get'
/*   */     //   238: invokevirtual startsWith : (Ljava/lang/String;)Z
/*   */     //   241: ifeq -> 264
/*   */     //   244: aload #6
/*   */     //   246: invokevirtual length : ()I
/*   */     //   249: iconst_3
/*   */     //   250: if_icmple -> 264
/*   */     //   253: aload #6
/*   */     //   255: iconst_3
/*   */     //   256: invokevirtual substring : (I)Ljava/lang/String;
/*   */     //   259: astore #6
/*   */     //   261: goto -> 292
/*   */     //   264: aload #6
/*   */     //   266: ldc_w 'is'
/*   */     //   269: invokevirtual startsWith : (Ljava/lang/String;)Z
/*   */     //   272: ifeq -> 382
/*   */     //   275: aload #6
/*   */     //   277: invokevirtual length : ()I
/*   */     //   280: iconst_2
/*   */     //   281: if_icmple -> 382
/*   */     //   284: aload #6
/*   */     //   286: iconst_2
/*   */     //   287: invokevirtual substring : (I)Ljava/lang/String;
/*   */     //   290: astore #6
/*   */     //   292: aload #6
/*   */     //   294: iconst_0
/*   */     //   295: invokevirtual charAt : (I)C
/*   */     //   298: invokestatic isLowerCase : (C)Z
/*   */     //   301: ifeq -> 307
/*   */     //   304: goto -> 382
/*   */     //   307: aload #6
/*   */     //   309: invokevirtual length : ()I
/*   */     //   312: iconst_1
/*   */     //   313: if_icmpne -> 329
/*   */     //   316: aload #6
/*   */     //   318: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
/*   */     //   321: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
/*   */     //   324: astore #6
/*   */     //   326: goto -> 385
/*   */     //   329: aload #6
/*   */     //   331: iconst_1
/*   */     //   332: invokevirtual charAt : (I)C
/*   */     //   335: invokestatic isUpperCase : (C)Z
/*   */     //   338: ifne -> 385
/*   */     //   341: new java/lang/StringBuilder
/*   */     //   344: dup
/*   */     //   345: aload #6
/*   */     //   347: swap
/*   */     //   348: invokespecial <init> : ()V
/*   */     //   351: iconst_0
/*   */     //   352: iconst_1
/*   */     //   353: invokevirtual substring : (II)Ljava/lang/String;
/*   */     //   356: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
/*   */     //   359: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
/*   */     //   362: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   365: aload #6
/*   */     //   367: iconst_1
/*   */     //   368: invokevirtual substring : (I)Ljava/lang/String;
/*   */     //   371: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   374: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   377: astore #6
/*   */     //   379: goto -> 385
/*   */     //   382: aconst_null
/*   */     //   383: astore #6
/*   */     //   385: aload #6
/*   */     //   387: ifnull -> 464
/*   */     //   390: aload #6
/*   */     //   392: invokevirtual isEmpty : ()Z
/*   */     //   395: ifne -> 464
/*   */     //   398: aload #5
/*   */     //   400: iconst_0
/*   */     //   401: anewarray java/lang/Object
/*   */     //   404: aload_1
/*   */     //   405: swap
/*   */     //   406: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   409: dup
/*   */     //   410: astore #5
/*   */     //   412: ifnull -> 464
/*   */     //   415: aload #5
/*   */     //   417: aload_0
/*   */     //   418: getfield Zo : Ljava/util/HashMap;
/*   */     //   421: aload #6
/*   */     //   423: aload #5
/*   */     //   425: invokestatic bA : (Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   428: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   431: pop
/*   */     //   432: instanceof java/io/Closeable
/*   */     //   435: ifeq -> 464
/*   */     //   438: aload #5
/*   */     //   440: checkcast java/io/Closeable
/*   */     //   443: invokeinterface close : ()V
/*   */     //   448: goto -> 464
/*   */     //   451: pop
/*   */     //   452: goto -> 464
/*   */     //   455: pop
/*   */     //   456: goto -> 464
/*   */     //   459: pop
/*   */     //   460: goto -> 464
/*   */     //   463: pop
/*   */     //   464: iinc #4, 1
/*   */     //   467: goto -> 39
/*   */     //   470: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 107
/*   */     //   #2	-> 139
/*   */     //   #3	-> 392
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   398	409	463	java/lang/IllegalAccessException
/*   */     //   398	409	459	java/lang/IllegalArgumentException
/*   */     //   398	409	455	java/lang/reflect/InvocationTargetException
/*   */     //   415	431	463	java/lang/IllegalAccessException
/*   */     //   415	431	459	java/lang/IllegalArgumentException
/*   */     //   415	431	455	java/lang/reflect/InvocationTargetException
/*   */     //   432	435	463	java/lang/IllegalAccessException
/*   */     //   432	435	459	java/lang/IllegalArgumentException
/*   */     //   432	435	455	java/lang/reflect/InvocationTargetException
/*   */     //   438	451	451	java/io/IOException
/*   */     //   438	451	463	java/lang/IllegalAccessException
/*   */     //   438	451	459	java/lang/IllegalArgumentException
/* 2 */     //   438	451	455	java/lang/reflect/InvocationTargetException } public final Sl0 rO(String paramString) { if ((this = (Sl0)this.Zo.get(paramString)) != null) { if (this instanceof Sl0) return this;  throw new m8(
/* 3 */           B40.df("JSONObject[")
/* 4 */           .append(Q7(paramString)).append("] is not a JSONObject.").toString()); }
/* 5 */      throw new m8(
/* 6 */         B40.df("JSONObject[")
/* 7 */         .append(Q7(paramString)).append("] not found.").toString()); } public final String SI(String paramString) { if ((this = (Sl0)this.Zo.get(paramString)) != null) { if (this instanceof String) return (String)this;  throw new m8(B40.df("JSONObject[").append(Q7(paramString)).append("] not a string.").toString()); }  throw new m8(B40.df("JSONObject[").append(Q7(paramString)).append("] not found.").toString()); }
/*   */ 
/*   */   
/*   */   public final Object mB0(String paramString) {
/*   */     return this.Zo.get(paramString);
/*   */   }
/*   */   
/*   */   public final String toString() {
/*   */     try {
/*   */       synchronized ((new StringWriter()).getBuffer()) {
/*   */         /* monitor exit ThisExpression{ObjectType{java/lang/StringBuffer}} */
/*   */         return abstract(new StringWriter(), 0).toString();
/*   */       } 
/*   */     } catch (Exception exception) {
/*   */       return null;
/*   */     } 
/*   */   }
/*   */   
/*   */   public final Sl0 t(Object paramObject, String paramString) {
/*   */     if (paramObject != null) {
/*   */       Hg0(paramObject);
/*   */       this.Zo.put(paramString, paramObject);
/*   */     } else {
/*   */       this.Zo.remove(paramString);
/*   */     } 
/*   */     return this;
/*   */   }
/*   */   
/*   */   public final Writer abstract(StringWriter paramStringWriter, int paramInt) {
/*   */     boolean bool1 = false, bool2 = false;
/*   */     try {
/*   */       String str;
/*   */       paramStringWriter.write(123);
/*   */       int i;
/*   */       if ((i = this.Zo.size()) == 1) {
/*   */         Map.Entry<String, ?> entry;
/*   */         paramStringWriter.write(Q7(str = (entry = this.Zo.entrySet().iterator().next()).getKey()));
/*   */         paramStringWriter.write(58);
/*   */         try {
/*   */           IJ(paramStringWriter, getValue(), paramInt);
/*   */         } catch (Exception exception) {
/*   */           throw new m8("Unable to write JSONObject value for key: " + str, this);
/*   */         } 
/*   */       } else if (i != 0) {
/*   */         int j = paramInt + str;
/*   */         for (Map.Entry entry : ((Sl0)super).Zo.entrySet()) {
/*   */           boolean bool;
/*   */           if (bool2)
/*   */             paramStringWriter.write(44); 
/*   */           av0(paramStringWriter, j);
/*   */           String str1;
/*   */           paramStringWriter.write(Q7(str1 = (String)entry.getKey()));
/*   */           paramStringWriter.write(58);
/*   */           try {
/*   */             IJ(paramStringWriter, entry.getValue(), j);
/*   */             bool = true;
/*   */           } catch (Exception exception1) {
/*   */             throw new m8("Unable to write JSONObject value for key: " + bool, this);
/*   */           } 
/*   */         } 
/*   */         av0(paramStringWriter, paramInt);
/*   */       } 
/*   */       paramStringWriter.write(125);
/*   */       return paramStringWriter;
/*   */     } catch (IOException iOException) {
/*   */       throw new m8(this);
/*   */     } 
/*   */   }
/*   */   
/*   */   public final Sl0 ze0(int paramInt) {
/*   */     return t(Integer.valueOf(paramInt), "pid");
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Sl0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */