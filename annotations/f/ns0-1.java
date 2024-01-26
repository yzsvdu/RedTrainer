/*  1 */ package f;public final class ns0 extends cR { public static final HashMap Yu = new HashMap<>(), ts0 = new HashMap<>(), PM = new HashMap<>(), KY = new HashMap<>(), bG = new HashMap<>(), hc0 = new HashMap<>(); public static final HashMap NX; public ns0(cR paramcR, NF paramNF, String paramString) { super(paramcR, paramNF); p(paramString); } public static eL Eh0(int paramInt, String paramString) { if ((paramInt = gd0.rB(paramString, paramInt, paramString.length())) >= paramString
/*  2 */       .length()) return null;  char c; if ((c = paramString.charAt(paramInt)) == '"' || c == '\'')
/*    */     { int j;
/*    */       
/*  5 */       if ((j = paramString.indexOf(c, ++paramInt)) < 0) j = paramString.length(); 
/*  6 */       String str1 = paramString.substring(paramInt, j); j++;
/*  7 */       if ((j = gd0.rB(paramString, j, paramString.length())) >= paramString
/*  8 */         .length() || paramString.charAt(j) == ',')
/*    */       
/* 10 */       { str = str1; return new eL(str, Eh0(j + 1, paramString)); }  throw new IllegalArgumentException(XD0.SD0("',' expected at ", str)); }  int i; if ((i = paramString.indexOf(',', str)) < 0) i = paramString.length();  String str = gd0.PJ0(paramString, str, i); return new eL(str, Eh0(i + 1, paramString)); } public final void D20(String paramString1, String paramString2) { String str1; e00 e001; Yc0 yc0; int i; eL eL; e00 e002; String str2; if (paramString1.startsWith("margin")) { str1 = paramString1.substring(6); yc0 = e00.MARGIN; cy(this, paramString2, yc0); return; }  if (yc0.startsWith("padding")) { str1 = yc0.substring(7); yc0 = e00.PADDING; super.cy(this, paramString2, yc0); return; }  if (yc0.startsWith("font")) { if ("font-family".equals(yc0)) { Ul0(e00.FONT_FAMILIES, Eh0(0, paramString2)); } else { Integer integer; if ("font-weight".equals(yc0)) { if ((integer = (Integer)bG.get(paramString2)) == null) integer = Integer.valueOf(paramString2);  Ul0(e00.FONT_WEIGHT, integer); } else if ("font-size".equals(integer)) { e001 = e00.FONT_SIZE; Ul0(this, F90(paramString2)); } else if ("font-style".equals(integer)) { super.M9(e00.FONT_ITALIC, KY, paramString2); } else if ("font".equals(integer)) { e002 = e00.FONT_WEIGHT; HashMap hashMap = bG; int j; if ((j = paramString2.indexOf(' ', 0)) < 0) j = paramString2.length();  if ((hashMap = (HashMap)hashMap.get(paramString2.substring(0, j))) != null) paramString2 = paramString2.substring(gd0.rB(paramString2, j, paramString2.length()));  Ul0(e002, hashMap); e002 = e00.FONT_ITALIC; hashMap = KY;
/* 11 */           if ((j = paramString2.indexOf(' ', 0)) < 0) j = paramString2.length(); 
/* 12 */           if ((hashMap = (HashMap)hashMap.get(paramString2.substring(0, j))) != null)
/*    */           {
/* 14 */             paramString2 = paramString2.substring(gd0.rB(paramString2, j, paramString2.length())); }  Ul0(e002, hashMap); if (paramString2
/* 15 */             .length() > 0 && Character.isDigit(paramString2.charAt(0))) {
/* 16 */             if ((i = paramString2.indexOf(' ', 0)) < 0) i = paramString2.length(); 
/* 17 */             e00 e00 = e00.FONT_SIZE;
/* 18 */             Ul0(e00, F90(paramString2.substring(0, i)));
/*    */             
/* 20 */             str2 = paramString2.substring(gd0.rB(paramString2, i, paramString2.length()));
/* 21 */           }  Ul0(e00.FONT_FAMILIES, Eh0(0, str2)); }  }  return; }
/* 22 */      if ("text-indent".equals(i)) { e001 = e00.TEXT_INDENT;
/* 23 */       Ul0(this, F90(str2)); return; }
/* 24 */      if ("-twl-font".equals(i)) { e001 = e00.FONT_FAMILIES;
/* 25 */       this(str2, null);
/* 26 */       Ul0(this, eL); return; }  if ("-twl-hover".equals(eL)) { super.M9(e00.INHERIT_HOVER, NX, str2); return; }  if ("text-align".equals(eL)) {
/*    */       
/* 28 */       Ul0(e00.HORIZONTAL_ALIGNMENT, Enum.valueOf(e00.HORIZONTAL_ALIGNMENT.Tw0, str2.toUpperCase(Locale.ENGLISH))); return;
/* 29 */     }  if ("text-decoration".equals(eL)) { super.M9(e00.TEXT_DECORATION, hc0, str2); return; }  if ("vertical-align".equals(eL)) {
/*    */       
/* 31 */       Ul0(e00.VERTICAL_ALIGNMENT, Enum.valueOf(e00.VERTICAL_ALIGNMENT.Tw0, str2.toUpperCase(Locale.ENGLISH))); return;
/* 32 */     }  if ("white-space".equals(eL)) { super.M9(e00.PREFORMATTED, Yu, str2); return; }  if ("word-wrap".equals(eL)) { super.M9(e00.BREAKWORD, ts0, str2); return; }  if ("list-style-image".equals(eL)) { super.vh(e00.LIST_STYLE_IMAGE, str2); return; }  if ("list-style-type".equals(eL)) { super.M9(e00.LIST_STYLE_TYPE, PM, str2); return; }  if ("clear".equals(eL)) {
/*    */       
/* 34 */       Ul0(e00.CLEAR, Enum.valueOf(e00.CLEAR.Tw0, str2.toUpperCase(Locale.ENGLISH))); return;
/* 35 */     }  if ("float".equals(eL)) {
/*    */       
/* 37 */       Ul0(e00.FLOAT_POSITION, Enum.valueOf(e00.FLOAT_POSITION.Tw0, str2.toUpperCase(Locale.ENGLISH))); return;
/* 38 */     }  if ("display".equals(eL)) {
/*    */       
/* 40 */       Ul0(e00.DISPLAY, Enum.valueOf(e00.DISPLAY.Tw0, str2.toUpperCase(Locale.ENGLISH))); return;
/* 41 */     }  if ("width".equals(eL)) { e001 = e00.WIDTH;
/* 42 */       Ul0(this, F90(str2)); return; }
/* 43 */      if ("height".equals(eL)) { e001 = e00.HEIGHT;
/* 44 */       Ul0(this, F90(str2)); return; }
/* 45 */      if ("background-image".equals(eL)) { super.vh(e00.BACKGROUND_IMAGE, str2); return; }  if ("background-color".equals(eL) || "-twl-background-color".equals(eL)) {
/*    */ 
/*    */       
/* 48 */       super
/* 49 */         .pq(e00.BACKGROUND_COLOR, str2);
/*    */       return;
/*    */     } 
/*    */     if ("color".equals(eL)) {
/*    */       super.pq(e00.COLOR, str2);
/*    */       return;
/*    */     } 
/*    */     if ("tab-size".equals(eL) || "-moz-tab-size".equals(eL)) {
/*    */       e002 = e00.TAB_SIZE;
/*    */       if ("inherit".equals(str2)) {
/*    */         Ul0(e002, null);
/*    */       } else {
/*    */         Ul0(e002, Integer.valueOf(Integer.parseInt(str2)));
/*    */       } 
/*    */       return;
/*    */     } 
/*    */     throw new IllegalArgumentException(m0.tF0("Unsupported key: ", e002)); }
/*    */ 
/*    */   
/*    */   static {
/*    */     this();
/*    */     NX = hashMap7;
/*    */     Boolean bool1 = Boolean.TRUE;
/*    */     hashMap1.put("pre", bool1);
/*    */     Boolean bool2 = Boolean.FALSE;
/*    */     hashMap1.put("normal", bool2);
/*    */     hashMap2.put("normal", bool2);
/*    */     hashMap2.put("break-word", bool1);
/*    */     this("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
/*    */     this("abcdefghijklmnopqrstuvwxyz");
/*    */     hashMap3.put("decimal", au.aq);
/*    */     hashMap3.put("upper-alpha", au2);
/*    */     hashMap3.put("lower-alpha", au3);
/*    */     hashMap3.put("upper-latin", au2);
/*    */     hashMap3.put("lower-latin", au3);
/*    */     String str = "upper-roman";
/*    */     boolean bool = false;
/*    */     this(bool);
/*    */     hashMap3.put(str, on0);
/*    */     str = "lower-roman";
/*    */     bool = true;
/*    */     this(bool);
/*    */     hashMap3.put(str, on0);
/*    */     this("αβγδεζηθικλμνξοπρστυφχψω");
/*    */     hashMap3.put("lower-greek", au1);
/*    */     this("ABCDEFGHIJKLMNOPQRSTUVWXYZÆØÅ");
/*    */     hashMap3.put("upper-norwegian", au1);
/*    */     this("abcdefghijklmnopqrstuvwxyzæøå");
/*    */     hashMap3.put("lower-norwegian", au1);
/*    */     this("АБВГДЕЖЗИКЛМНОПРСТУФХЦЧШЩЭЮЯ");
/*    */     hashMap3.put("upper-russian-short", au1);
/*    */     this("абвгдежзиклмнопрстуфхцчшщэюя");
/*    */     hashMap3.put("lower-russian-short", au1);
/*    */     hashMap4.put("normal", bool2);
/*    */     hashMap4.put("italic", bool1);
/*    */     hashMap4.put("oblique", bool1);
/*    */     hashMap5.put("normal", Integer.valueOf(400));
/*    */     hashMap5.put("bold", Integer.valueOf(700));
/*    */     hashMap6.put("none", EY.u0);
/*    */     hashMap6.put("underline", EY.sd);
/*    */     hashMap6.put("line-through", EY.kY);
/*    */     HashMap<Object, Object> hashMap7;
/*    */     (hashMap7 = new HashMap<>()).put("inherit", bool1);
/*    */     (new HashMap<>()).put("normal", bool2);
/*    */   }
/*    */   
/*    */   public static Ok F90(String paramString) {
/*    */     byte b2, b1 = 2;
/*    */     if (paramString.endsWith("px")) {
/*    */       b2 = 1;
/*    */     } else if (paramString.endsWith("pt")) {
/*    */       b2 = 2;
/*    */     } else if (paramString.endsWith("em")) {
/*    */       b2 = 3;
/*    */     } else if (paramString.endsWith("ex")) {
/*    */       b2 = 4;
/*    */     } else {
/*    */       if (paramString.endsWith("%")) {
/*    */         b1 = 1;
/*    */         b2 = 5;
/*    */         paramString = gd0.PJ0(paramString, 0, paramString.length() - b1);
/*    */         return new Ok(Float.parseFloat(paramString), b2);
/*    */       } 
/*    */       if ("0".equals(paramString))
/*    */         return Ok.qu0; 
/*    */       if ("auto".equals(paramString))
/*    */         return Ok.U00; 
/*    */       throw new IllegalArgumentException(m0.tF0("Unknown numeric suffix: ", paramString));
/*    */     } 
/*    */     paramString = gd0.PJ0(paramString, 0, paramString.length() - b1);
/*    */     return new Ok(Float.parseFloat(paramString), b2);
/*    */   }
/*    */   
/*    */   public static byte[] sG0(int paramInt, String paramString) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc ','
/*    */     //   3: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
/*    */     //   6: dup
/*    */     //   7: astore_2
/*    */     //   8: arraylength
/*    */     //   9: iload_0
/*    */     //   10: if_icmpne -> 134
/*    */     //   13: iload_0
/*    */     //   14: newarray byte
/*    */     //   16: astore_3
/*    */     //   17: iconst_0
/*    */     //   18: istore #4
/*    */     //   20: iload #4
/*    */     //   22: iload_0
/*    */     //   23: if_icmpge -> 132
/*    */     //   26: iload #4
/*    */     //   28: aload_2
/*    */     //   29: iload #4
/*    */     //   31: aaload
/*    */     //   32: invokevirtual trim : ()Ljava/lang/String;
/*    */     //   35: astore #5
/*    */     //   37: iconst_3
/*    */     //   38: if_icmpne -> 58
/*    */     //   41: aload #5
/*    */     //   43: invokestatic parseFloat : (Ljava/lang/String;)F
/*    */     //   46: ldc_w 255.0
/*    */     //   49: fmul
/*    */     //   50: invokestatic round : (F)I
/*    */     //   53: istore #5
/*    */     //   55: goto -> 108
/*    */     //   58: aload #5
/*    */     //   60: ldc '%'
/*    */     //   62: invokevirtual endsWith : (Ljava/lang/String;)Z
/*    */     //   65: dup
/*    */     //   66: istore #6
/*    */     //   68: ifeq -> 85
/*    */     //   71: aload_1
/*    */     //   72: dup
/*    */     //   73: invokevirtual length : ()I
/*    */     //   76: iconst_1
/*    */     //   77: isub
/*    */     //   78: iconst_0
/*    */     //   79: swap
/*    */     //   80: invokestatic PJ0 : (Ljava/lang/CharSequence;II)Ljava/lang/String;
/*    */     //   83: astore #5
/*    */     //   85: iload #6
/*    */     //   87: aload #5
/*    */     //   89: invokestatic parseInt : (Ljava/lang/String;)I
/*    */     //   92: istore #5
/*    */     //   94: ifeq -> 108
/*    */     //   97: iload #5
/*    */     //   99: sipush #255
/*    */     //   102: imul
/*    */     //   103: bipush #100
/*    */     //   105: idiv
/*    */     //   106: istore #5
/*    */     //   108: aload_3
/*    */     //   109: iload #4
/*    */     //   111: sipush #255
/*    */     //   114: iload #5
/*    */     //   116: invokestatic min : (II)I
/*    */     //   119: iconst_0
/*    */     //   120: swap
/*    */     //   121: invokestatic max : (II)I
/*    */     //   124: i2b
/*    */     //   125: bastore
/*    */     //   126: iinc #4, 1
/*    */     //   129: goto -> 20
/*    */     //   132: aload_3
/*    */     //   133: areturn
/*    */     //   134: new java/lang/IllegalArgumentException
/*    */     //   137: dup
/*    */     //   138: ldc_w '3 values required for rgb()'
/*    */     //   141: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   144: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 73
/*    */     //   #2	-> 89
/*    */   }
/*    */   
/*    */   public final void p(String paramString) {
/*    */     // Byte code:
/*    */     //   0: iconst_0
/*    */     //   1: istore_2
/*    */     //   2: bipush #59
/*    */     //   4: istore_3
/*    */     //   5: bipush #58
/*    */     //   7: istore #4
/*    */     //   9: iload_2
/*    */     //   10: aload_1
/*    */     //   11: invokevirtual length : ()I
/*    */     //   14: if_icmpge -> 96
/*    */     //   17: aload_1
/*    */     //   18: iload_3
/*    */     //   19: iload_2
/*    */     //   20: invokevirtual indexOf : (II)I
/*    */     //   23: dup
/*    */     //   24: istore #5
/*    */     //   26: ifge -> 35
/*    */     //   29: aload_1
/*    */     //   30: invokevirtual length : ()I
/*    */     //   33: istore #5
/*    */     //   35: aload_1
/*    */     //   36: iload #4
/*    */     //   38: iload_2
/*    */     //   39: invokevirtual indexOf : (II)I
/*    */     //   42: dup
/*    */     //   43: istore #6
/*    */     //   45: ifge -> 54
/*    */     //   48: aload_1
/*    */     //   49: invokevirtual length : ()I
/*    */     //   52: istore #6
/*    */     //   54: iload #6
/*    */     //   56: iload #5
/*    */     //   58: if_icmpge -> 88
/*    */     //   61: aload_1
/*    */     //   62: iload #6
/*    */     //   64: aload_1
/*    */     //   65: iload_2
/*    */     //   66: iload #6
/*    */     //   68: invokestatic PJ0 : (Ljava/lang/CharSequence;II)Ljava/lang/String;
/*    */     //   71: astore_2
/*    */     //   72: iconst_1
/*    */     //   73: iadd
/*    */     //   74: iload #5
/*    */     //   76: invokestatic PJ0 : (Ljava/lang/CharSequence;II)Ljava/lang/String;
/*    */     //   79: astore #6
/*    */     //   81: iinc #5, 1
/*    */     //   84: iconst_1
/*    */     //   85: goto -> 109
/*    */     //   88: iload #5
/*    */     //   90: iconst_1
/*    */     //   91: iadd
/*    */     //   92: istore_2
/*    */     //   93: goto -> 9
/*    */     //   96: aconst_null
/*    */     //   97: astore #5
/*    */     //   99: aconst_null
/*    */     //   100: astore #6
/*    */     //   102: iconst_0
/*    */     //   103: aload #5
/*    */     //   105: iload_2
/*    */     //   106: istore #5
/*    */     //   108: astore_2
/*    */     //   109: ifeq -> 246
/*    */     //   112: aload_2
/*    */     //   113: ifnull -> 142
/*    */     //   116: aload #6
/*    */     //   118: ifnull -> 131
/*    */     //   121: aload_0
/*    */     //   122: aload_2
/*    */     //   123: aload #6
/*    */     //   125: invokevirtual D20 : (Ljava/lang/String;Ljava/lang/String;)V
/*    */     //   128: goto -> 218
/*    */     //   131: new java/lang/IllegalStateException
/*    */     //   134: dup
/*    */     //   135: ldc_w 'no key-value pair available'
/*    */     //   138: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   141: athrow
/*    */     //   142: new java/lang/IllegalStateException
/*    */     //   145: dup
/*    */     //   146: ldc_w 'no key-value pair available'
/*    */     //   149: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   152: athrow
/*    */     //   153: astore #7
/*    */     //   155: aload_2
/*    */     //   156: ldc f/ns0
/*    */     //   158: invokevirtual getName : ()Ljava/lang/String;
/*    */     //   161: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
/*    */     //   164: astore #8
/*    */     //   166: getstatic java/util/logging/Level.SEVERE : Ljava/util/logging/Level;
/*    */     //   169: astore #9
/*    */     //   171: ldc_w 'Unable to parse CSS attribute: '
/*    */     //   174: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   177: astore #10
/*    */     //   179: ifnull -> 235
/*    */     //   182: aload #6
/*    */     //   184: aload #10
/*    */     //   186: aload_2
/*    */     //   187: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   190: ldc_w '='
/*    */     //   193: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   196: astore_2
/*    */     //   197: ifnull -> 224
/*    */     //   200: aload #8
/*    */     //   202: aload #9
/*    */     //   204: aload_2
/*    */     //   205: aload #6
/*    */     //   207: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   210: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   213: aload #7
/*    */     //   215: invokevirtual log : (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */     //   218: iload #5
/*    */     //   220: istore_2
/*    */     //   221: goto -> 9
/*    */     //   224: new java/lang/IllegalStateException
/*    */     //   227: dup
/*    */     //   228: ldc_w 'no key-value pair available'
/*    */     //   231: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   234: athrow
/*    */     //   235: new java/lang/IllegalStateException
/*    */     //   238: dup
/*    */     //   239: ldc_w 'no key-value pair available'
/*    */     //   242: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   245: athrow
/*    */     //   246: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 11
/*    */     //   #2	-> 20
/*    */     //   #3	-> 68
/*    */     //   #4	-> 125
/*    */     //   #5	-> 131
/*    */     //   #6	-> 142
/*    */     //   #7	-> 156
/*    */     //   #8	-> 171
/*    */     //   #9	-> 187
/*    */     //   #10	-> 224
/*    */     //   #11	-> 235
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   121	153	153	java/lang/IllegalArgumentException
/*    */   }
/*    */   
/*    */   public final void cy(String paramString1, String paramString2, Yc0 paramYc0) {
/*    */     e00 e001, e002;
/*    */     String[] arrayOfString;
/*    */     int i;
/*    */     if ("-top".equals(paramString1)) {
/*    */       e002 = paramYc0.XO;
/*    */     } else if ("-left".equals(e002)) {
/*    */       e002 = paramYc0.Pz0;
/*    */     } else if ("-right".equals(e002)) {
/*    */       e002 = paramYc0.N9;
/*    */     } else if ("-bottom".equals(e002)) {
/*    */       e002 = paramYc0.ro0;
/*    */     } else {
/*    */       if ("".equals(e002)) {
/*    */         Ok[] arrayOfOk;
/*    */         byte b;
/*    */         for (arrayOfOk = new Ok[i = (arrayOfString = paramString2.split("\\s+")).length], b = 0; b < arrayOfString.length; ) {
/*    */           arrayOfOk[b] = F90(arrayOfString[b]);
/*    */           b++;
/*    */         } 
/*    */         switch (i) {
/*    */           default:
/*    */             throw new IllegalArgumentException(XD0.SD0("Invalid number of margin values: ", i));
/*    */           case 4:
/*    */             e001 = paramYc0.XO;
/*    */             Ul0(this, arrayOfOk[0]);
/*    */             e001 = paramYc0.Pz0;
/*    */             Ul0(this, arrayOfOk[3]);
/*    */             e001 = paramYc0.N9;
/*    */             Ul0(this, arrayOfOk[1]);
/*    */             e001 = paramYc0.ro0;
/*    */             Ul0(this, arrayOfOk[2]);
/*    */             return;
/*    */           case 3:
/*    */             e001 = paramYc0.XO;
/*    */             Ul0(this, arrayOfOk[0]);
/*    */             e001 = paramYc0.Pz0;
/*    */             Ul0(this, arrayOfOk[1]);
/*    */             e001 = paramYc0.N9;
/*    */             Ul0(this, arrayOfOk[1]);
/*    */             e001 = paramYc0.ro0;
/*    */             Ul0(this, arrayOfOk[2]);
/*    */             return;
/*    */           case 2:
/*    */             e001 = paramYc0.XO;
/*    */             Ul0(this, arrayOfOk[0]);
/*    */             e001 = paramYc0.Pz0;
/*    */             Ul0(this, arrayOfOk[1]);
/*    */             e001 = paramYc0.N9;
/*    */             Ul0(this, arrayOfOk[1]);
/*    */             e001 = paramYc0.ro0;
/*    */             Ul0(this, arrayOfOk[0]);
/*    */             return;
/*    */           case 1:
/*    */             break;
/*    */         } 
/*    */         e001 = paramYc0.XO;
/*    */         Ul0(this, arrayOfOk[0]);
/*    */         e001 = paramYc0.Pz0;
/*    */         Ul0(this, arrayOfOk[0]);
/*    */         e001 = paramYc0.N9;
/*    */         Ul0(this, arrayOfOk[0]);
/*    */         e001 = paramYc0.ro0;
/*    */         Ul0(this, arrayOfOk[0]);
/*    */       } 
/*    */       return;
/*    */     } 
/*    */     Ul0((e00)arrayOfString, F90(i));
/*    */   }
/*    */   
/*    */   public final void M9(e00 parame00, HashMap paramHashMap, String paramString) {
/*    */     if ((paramHashMap = (HashMap)paramHashMap.get(paramString)) != null) {
/*    */       Ul0(parame00, paramHashMap);
/*    */       return;
/*    */     } 
/*    */     throw new IllegalArgumentException(m0.tF0("Unknown value: ", paramString));
/*    */   }
/*    */   
/*    */   public final void vh(e00 parame00, String paramString) {
/*    */     if (paramString.startsWith("url(") && paramString.endsWith(")") && (((paramString = gd0.PJ0(paramString, 4, paramString.length() - 1)).startsWith("\"") && paramString.endsWith("\"")) || (paramString.startsWith("'") && paramString.endsWith("'"))))
/*    */       paramString = paramString.substring(1, paramString.length() - 1); 
/*    */     Ul0(parame00, paramString);
/*    */   }
/*    */   
/*    */   public final void pq(e00 parame00, String paramString) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: ldc_w 'rgb('
/*    */     //   4: invokevirtual startsWith : (Ljava/lang/String;)Z
/*    */     //   7: ifeq -> 69
/*    */     //   10: aload_2
/*    */     //   11: ldc_w ')'
/*    */     //   14: invokevirtual endsWith : (Ljava/lang/String;)Z
/*    */     //   17: ifeq -> 69
/*    */     //   20: aload_2
/*    */     //   21: dup
/*    */     //   22: invokevirtual length : ()I
/*    */     //   25: iconst_1
/*    */     //   26: isub
/*    */     //   27: iconst_4
/*    */     //   28: swap
/*    */     //   29: invokestatic PJ0 : (Ljava/lang/CharSequence;II)Ljava/lang/String;
/*    */     //   32: iconst_3
/*    */     //   33: swap
/*    */     //   34: invokestatic sG0 : (ILjava/lang/String;)[B
/*    */     //   37: astore_2
/*    */     //   38: new f/pRn
/*    */     //   41: dup
/*    */     //   42: astore_3
/*    */     //   43: aload_2
/*    */     //   44: dup
/*    */     //   45: dup
/*    */     //   46: iconst_0
/*    */     //   47: baload
/*    */     //   48: istore_2
/*    */     //   49: iconst_1
/*    */     //   50: baload
/*    */     //   51: istore #4
/*    */     //   53: iconst_2
/*    */     //   54: baload
/*    */     //   55: istore #5
/*    */     //   57: iload_2
/*    */     //   58: iload #4
/*    */     //   60: iload #5
/*    */     //   62: iconst_m1
/*    */     //   63: invokespecial <init> : (BBBB)V
/*    */     //   66: goto -> 152
/*    */     //   69: aload_2
/*    */     //   70: ldc_w 'rgba('
/*    */     //   73: invokevirtual startsWith : (Ljava/lang/String;)Z
/*    */     //   76: ifeq -> 143
/*    */     //   79: aload_2
/*    */     //   80: ldc_w ')'
/*    */     //   83: invokevirtual endsWith : (Ljava/lang/String;)Z
/*    */     //   86: ifeq -> 143
/*    */     //   89: aload_2
/*    */     //   90: dup
/*    */     //   91: invokevirtual length : ()I
/*    */     //   94: iconst_1
/*    */     //   95: isub
/*    */     //   96: iconst_5
/*    */     //   97: swap
/*    */     //   98: invokestatic PJ0 : (Ljava/lang/CharSequence;II)Ljava/lang/String;
/*    */     //   101: iconst_4
/*    */     //   102: swap
/*    */     //   103: invokestatic sG0 : (ILjava/lang/String;)[B
/*    */     //   106: astore_2
/*    */     //   107: new f/pRn
/*    */     //   110: dup
/*    */     //   111: astore_3
/*    */     //   112: aload_2
/*    */     //   113: dup
/*    */     //   114: dup2
/*    */     //   115: iconst_0
/*    */     //   116: baload
/*    */     //   117: istore_2
/*    */     //   118: iconst_1
/*    */     //   119: baload
/*    */     //   120: istore #4
/*    */     //   122: iconst_2
/*    */     //   123: baload
/*    */     //   124: istore #5
/*    */     //   126: iconst_3
/*    */     //   127: baload
/*    */     //   128: istore #6
/*    */     //   130: iload_2
/*    */     //   131: iload #4
/*    */     //   133: iload #5
/*    */     //   135: iload #6
/*    */     //   137: invokespecial <init> : (BBBB)V
/*    */     //   140: goto -> 152
/*    */     //   143: aload_2
/*    */     //   144: invokestatic p7 : (Ljava/lang/String;)Lf/pRn;
/*    */     //   147: dup
/*    */     //   148: astore_3
/*    */     //   149: ifnull -> 159
/*    */     //   152: aload_0
/*    */     //   153: aload_1
/*    */     //   154: aload_3
/*    */     //   155: invokevirtual Ul0 : (Lf/e00;Ljava/lang/Object;)V
/*    */     //   158: return
/*    */     //   159: new java/lang/IllegalArgumentException
/*    */     //   162: dup
/*    */     //   163: ldc_w 'unknown color name: '
/*    */     //   166: aload_2
/*    */     //   167: invokestatic tF0 : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*    */     //   170: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   173: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 22
/*    */     //   #2	-> 34
/*    */     //   #3	-> 91
/*    */     //   #4	-> 103
/*    */     //   #5	-> 163
/*    */     //   #6	-> 170
/*    */   }
/*    */   
/*    */   static {
/*    */     this();
/*    */     HashMap<Object, Object> hashMap1, hashMap2, hashMap3;
/*    */     au au2, au1;
/*    */     HashMap<Object, Object> hashMap4;
/*    */     au au3;
/*    */     HashMap<Object, Object> hashMap5;
/*    */     On0 on0;
/*    */     HashMap<Object, Object> hashMap6;
/*    */   }
/*    */   
/*    */   static {
/*    */     this();
/*    */   }
/*    */   
/*    */   static {
/*    */     this();
/*    */   }
/*    */   
/*    */   static {
/*    */     this();
/*    */   }
/*    */   
/*    */   static {
/*    */     this();
/*    */   }
/*    */   
/*    */   static {
/*    */     this();
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ns0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */