/*  1 */ package f;public abstract class ed { public static ak j5 = new ak(); public static ak CZ = new ak(); public static String Vf0(ByteBuffer paramByteBuffer) { this(); StringBuilder stringBuilder; while (true) { byte b; if ((b = paramByteBuffer.get()) == -1) return stringBuilder.toString();  if (b == -3) { b = paramByteBuffer.get(); if (CZ.db0(b)) { stringBuilder
/*  2 */             .append((String)CZ.Ha0(b)); continue; }
/*    */          Object[] arrayOfObject1;
/*  4 */         (arrayOfObject1 = new Object[1])[0] = Byte.valueOf(b); stringBuilder.append(B40.df("{").append(String.format("%1$02X", arrayOfObject1)).append("}").toString()); continue; }  if (b == -4) { if ((b = paramByteBuffer.get()) == 6 || b == 8) { paramByteBuffer.get(); continue; }  if (b == 11 || b == 16) paramByteBuffer.getShort();  continue; }  if (j5
/*  5 */         .db0(b)) { stringBuilder
/*  6 */           .append((String)j5.Ha0(b)); continue; }
/*    */        Object[] arrayOfObject;
/*  8 */       (arrayOfObject = new Object[1])[0] = Byte.valueOf(b); stringBuilder.append(B40.df("{RAW_").append(String.format("%1$02X", arrayOfObject)).append("}").toString()); }  } public static String j00(int paramInt, ByteBuffer paramByteBuffer) { // Byte code:
/*    */     //   0: iload_0
/*    */     //   1: aload_1
/*    */     //   2: invokevirtual position : ()I
/*    */     //   5: istore_2
/*    */     //   6: iflt -> 181
/*    */     //   9: iload_0
/*    */     //   10: aload_1
/*    */     //   11: invokevirtual limit : ()I
/*    */     //   14: if_icmple -> 20
/*    */     //   17: goto -> 181
/*    */     //   20: aload_1
/*    */     //   21: iload_0
/*    */     //   22: invokevirtual position : (I)Ljava/nio/Buffer;
/*    */     //   25: pop
/*    */     //   26: new java/lang/StringBuilder
/*    */     //   29: dup
/*    */     //   30: astore_3
/*    */     //   31: invokespecial <init> : ()V
/*    */     //   34: aload_1
/*    */     //   35: invokevirtual get : ()B
/*    */     //   38: dup
/*    */     //   39: istore_0
/*    */     //   40: iconst_m1
/*    */     //   41: if_icmpne -> 47
/*    */     //   44: goto -> 113
/*    */     //   47: iload_0
/*    */     //   48: bipush #-4
/*    */     //   50: if_icmpne -> 124
/*    */     //   53: aload_1
/*    */     //   54: invokevirtual get : ()B
/*    */     //   57: dup
/*    */     //   58: istore_0
/*    */     //   59: bipush #6
/*    */     //   61: if_icmpne -> 67
/*    */     //   64: goto -> 105
/*    */     //   67: iload_0
/*    */     //   68: bipush #8
/*    */     //   70: if_icmpne -> 76
/*    */     //   73: goto -> 105
/*    */     //   76: iload_0
/*    */     //   77: bipush #11
/*    */     //   79: if_icmpne -> 85
/*    */     //   82: goto -> 91
/*    */     //   85: iload_0
/*    */     //   86: bipush #16
/*    */     //   88: if_icmpne -> 99
/*    */     //   91: aload_1
/*    */     //   92: invokevirtual getShort : ()S
/*    */     //   95: pop
/*    */     //   96: goto -> 34
/*    */     //   99: iload_0
/*    */     //   100: bipush #17
/*    */     //   102: if_icmpne -> 113
/*    */     //   105: aload_1
/*    */     //   106: invokevirtual get : ()B
/*    */     //   109: pop
/*    */     //   110: goto -> 34
/*    */     //   113: aload_3
/*    */     //   114: aload_1
/*    */     //   115: iload_2
/*    */     //   116: invokevirtual position : (I)Ljava/nio/Buffer;
/*    */     //   119: pop
/*    */     //   120: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   123: areturn
/*    */     //   124: iload_0
/*    */     //   125: bipush #-3
/*    */     //   127: if_icmpne -> 163
/*    */     //   130: aload_1
/*    */     //   131: invokevirtual get : ()B
/*    */     //   134: istore_0
/*    */     //   135: getstatic f/ed.CZ : Lf/ak;
/*    */     //   138: iload_0
/*    */     //   139: invokevirtual db0 : (B)Z
/*    */     //   142: ifeq -> 34
/*    */     //   145: aload_3
/*    */     //   146: getstatic f/ed.CZ : Lf/ak;
/*    */     //   149: iload_0
/*    */     //   150: invokevirtual Ha0 : (B)Ljava/lang/Object;
/*    */     //   153: checkcast java/lang/String
/*    */     //   156: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   159: pop
/*    */     //   160: goto -> 34
/*    */     //   163: aload_3
/*    */     //   164: getstatic f/ed.j5 : Lf/ak;
/*    */     //   167: iload_0
/*    */     //   168: invokevirtual Ha0 : (B)Ljava/lang/Object;
/*    */     //   171: checkcast java/lang/String
/*    */     //   174: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   177: pop
/*    */     //   178: goto -> 34
/*    */     //   181: ldc 'Invalid String Offset '
/*    */     //   183: iload_0
/*    */     //   184: invokestatic SD0 : (Ljava/lang/String;I)Ljava/lang/String;
/*    */     //   187: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 139
/*    */     //   #2	-> 146
/*    */     //   #3	-> 181 } public static String ik(int paramInt, ByteBuffer paramByteBuffer) { // Byte code:
/*    */     //   0: iload_0
/*    */     //   1: aload_1
/*    */     //   2: invokevirtual position : ()I
/*    */     //   5: istore_2
/*    */     //   6: iflt -> 208
/*    */     //   9: iload_0
/*    */     //   10: aload_1
/*    */     //   11: invokevirtual limit : ()I
/*    */     //   14: if_icmple -> 20
/*    */     //   17: goto -> 208
/*    */     //   20: aload_1
/*    */     //   21: iload_0
/*    */     //   22: invokevirtual position : (I)Ljava/nio/Buffer;
/*    */     //   25: pop
/*    */     //   26: new java/lang/StringBuilder
/*    */     //   29: dup
/*    */     //   30: astore_3
/*    */     //   31: invokespecial <init> : ()V
/*    */     //   34: aload_1
/*    */     //   35: invokevirtual get : ()B
/*    */     //   38: dup
/*    */     //   39: istore_0
/*    */     //   40: iconst_m1
/*    */     //   41: if_icmpne -> 47
/*    */     //   44: goto -> 179
/*    */     //   47: iload_0
/*    */     //   48: bipush #-4
/*    */     //   50: if_icmpne -> 113
/*    */     //   53: aload_1
/*    */     //   54: invokevirtual get : ()B
/*    */     //   57: dup
/*    */     //   58: istore_0
/*    */     //   59: bipush #6
/*    */     //   61: if_icmpne -> 67
/*    */     //   64: goto -> 105
/*    */     //   67: iload_0
/*    */     //   68: bipush #8
/*    */     //   70: if_icmpne -> 76
/*    */     //   73: goto -> 105
/*    */     //   76: iload_0
/*    */     //   77: bipush #11
/*    */     //   79: if_icmpne -> 85
/*    */     //   82: goto -> 91
/*    */     //   85: iload_0
/*    */     //   86: bipush #16
/*    */     //   88: if_icmpne -> 99
/*    */     //   91: aload_1
/*    */     //   92: invokevirtual getShort : ()S
/*    */     //   95: pop
/*    */     //   96: goto -> 34
/*    */     //   99: iload_0
/*    */     //   100: bipush #17
/*    */     //   102: if_icmpne -> 34
/*    */     //   105: aload_1
/*    */     //   106: invokevirtual get : ()B
/*    */     //   109: pop
/*    */     //   110: goto -> 34
/*    */     //   113: iload_0
/*    */     //   114: bipush #-3
/*    */     //   116: if_icmpne -> 169
/*    */     //   119: aload_3
/*    */     //   120: aload_1
/*    */     //   121: invokevirtual get : ()B
/*    */     //   124: istore_0
/*    */     //   125: ldc '{'
/*    */     //   127: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   130: iconst_1
/*    */     //   131: anewarray java/lang/Object
/*    */     //   134: dup
/*    */     //   135: astore #4
/*    */     //   137: iload_0
/*    */     //   138: invokestatic valueOf : (B)Ljava/lang/Byte;
/*    */     //   141: iconst_0
/*    */     //   142: swap
/*    */     //   143: aastore
/*    */     //   144: ldc '%1$02X'
/*    */     //   146: aload #4
/*    */     //   148: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*    */     //   151: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   154: ldc '}'
/*    */     //   156: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   159: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   162: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   165: pop
/*    */     //   166: goto -> 34
/*    */     //   169: getstatic f/ed.j5 : Lf/ak;
/*    */     //   172: iload_0
/*    */     //   173: invokevirtual db0 : (B)Z
/*    */     //   176: ifne -> 190
/*    */     //   179: aload_3
/*    */     //   180: aload_1
/*    */     //   181: iload_2
/*    */     //   182: invokevirtual position : (I)Ljava/nio/Buffer;
/*    */     //   185: pop
/*    */     //   186: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   189: areturn
/*    */     //   190: aload_3
/*    */     //   191: getstatic f/ed.j5 : Lf/ak;
/*    */     //   194: iload_0
/*    */     //   195: invokevirtual Ha0 : (B)Ljava/lang/Object;
/*    */     //   198: checkcast java/lang/String
/*    */     //   201: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   204: pop
/*    */     //   205: goto -> 34
/*    */     //   208: ldc 'Invalid String Offset '
/*    */     //   210: iload_0
/*    */     //   211: invokestatic SD0 : (Ljava/lang/String;I)Ljava/lang/String;
/*    */     //   214: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 125
/*    */     //   #2	-> 131
/*    */     //   #3	-> 173
/*    */     //   #4	-> 182
/*  8 */     //   #5	-> 208 } public static String fj(int paramInt, boolean paramBoolean, s40 params401, s40 params402) { if ((paramInt & 0x10000000) != 0) { if (params402 == null) return "Missing ROM";  params401 = params402; }  paramInt &= 0xFFFFFF; if (params401 == null) return "ERR";  p3 p3; if (((p3 = params401.wJ.sd0) != null)) { if (!p3.oe.Wr0(paramInt)) return B40.df("Missing string offset conversion: ").append(B40.df("0x").append(Integer.toHexString(paramInt).toUpperCase()).toString()).toString();
/*    */ 
/*    */ 
/*    */       
/* 12 */       paramInt = params401.wJ.sd0.oe.xC(paramInt); }  if (paramBoolean)
/* 13 */       return j00(paramInt, params401.pr());  return ik(paramInt, params401.pr()); }
/*    */ 
/*    */   
/*    */   public static String LJ0(byte[] paramArrayOfbyte) {
/*    */     this();
/*    */     StringBuilder stringBuilder;
/*    */     byte b;
/*    */     for (int i = 0; i < paramArrayOfbyte.length && (b = paramArrayOfbyte[i]) != -1; ) {
/*    */       if (b == -3) {
/*    */         b = paramArrayOfbyte[++i];
/*    */         if (CZ.db0(b))
/*    */           stringBuilder.append((String)CZ.Ha0(b)); 
/*    */       } else {
/*    */         stringBuilder.append((String)j5.Ha0(b));
/*    */       } 
/*    */       i++;
/*    */     } 
/*    */     return stringBuilder.toString();
/*    */   }
/*    */   
/*    */   static {
/*    */     j5.VF((byte)0, " ");
/*    */     j5.VF((byte)1, "À");
/*    */     j5.VF((byte)2, "Á");
/*    */     j5.VF((byte)3, "Â");
/*    */     j5.VF((byte)4, "Ç");
/*    */     j5.VF((byte)5, "È");
/*    */     j5.VF((byte)6, "É");
/*    */     j5.VF((byte)7, "Ê");
/*    */     j5.VF((byte)8, "Ë");
/*    */     j5.VF((byte)9, "Ì");
/*    */     j5.VF((byte)11, "Î");
/*    */     j5.VF((byte)12, "Ï");
/*    */     j5.VF((byte)13, "Ò");
/*    */     j5.VF((byte)14, "Ó");
/*    */     j5.VF((byte)15, "Ô");
/*    */     j5.VF((byte)16, "Œ");
/*    */     j5.VF((byte)17, "Ù");
/*    */     j5.VF((byte)18, "Ú");
/*    */     j5.VF((byte)19, "Û");
/*    */     j5.VF((byte)20, "Ñ");
/*    */     j5.VF((byte)21, "ß");
/*    */     j5.VF((byte)22, "à");
/*    */     j5.VF((byte)23, "á");
/*    */     j5.VF((byte)25, "ç");
/*    */     j5.VF((byte)26, "è");
/*    */     j5.VF((byte)27, "é");
/*    */     j5.VF((byte)28, "ê");
/*    */     j5.VF((byte)29, "ë");
/*    */     j5.VF((byte)30, "ì");
/*    */     j5.VF((byte)32, "î");
/*    */     j5.VF((byte)33, "ï");
/*    */     j5.VF((byte)34, "ò");
/*    */     j5.VF((byte)35, "ó");
/*    */     j5.VF((byte)36, "ô");
/*    */     j5.VF((byte)37, "œ");
/*    */     j5.VF((byte)38, "ù");
/*    */     j5.VF((byte)39, "ú");
/*    */     j5.VF((byte)40, "û");
/*    */     j5.VF((byte)41, "ñ");
/*    */     j5.VF((byte)42, "º");
/*    */     j5.VF((byte)43, "ª");
/*    */     j5.VF((byte)44, "er");
/*    */     j5.VF((byte)45, "&");
/*    */     j5.VF((byte)46, "+");
/*    */     j5.VF((byte)52, "[Lv]");
/*    */     j5.VF((byte)53, ", ");
/*    */     j5.VF((byte)54, ";");
/*    */     j5.VF((byte)81, "¿");
/*    */     j5.VF((byte)82, "¡");
/*    */     j5.VF((byte)83, "PK");
/*    */     j5.VF((byte)84, "MN");
/*    */     j5.VF((byte)85, "PO");
/*    */     j5.VF((byte)86, "Ké");
/*    */     j5.VF((byte)87, "BL");
/*    */     j5.VF((byte)88, "OC");
/*    */     j5.VF((byte)89, "K");
/*    */     j5.VF((byte)90, "Í");
/*    */     j5.VF((byte)91, "%");
/*    */     j5.VF((byte)92, "(");
/*    */     j5.VF((byte)93, ")");
/*    */     j5.VF((byte)94, " PO");
/*    */     j5.VF((byte)95, "Ké");
/*    */     j5.VF((byte)96, "ME");
/*    */     j5.VF((byte)97, "LL");
/*    */     j5.VF((byte)98, "");
/*    */     j5.VF((byte)99, "E");
/*    */     j5.VF((byte)104, "â");
/*    */     j5.VF((byte)111, "í");
/*    */     j5.VF((byte)121, "↑");
/*    */     j5.VF((byte)122, "↓");
/*    */     j5.VF((byte)123, "←");
/*    */     j5.VF((byte)124, "→");
/*    */     j5.VF((byte)-124, "e");
/*    */     j5.VF((byte)-123, "<");
/*    */     j5.VF((byte)-122, ">");
/*    */     j5.VF((byte)-120, "Ć");
/*    */     j5.VF((byte)-119, "Ę");
/*    */     j5.VF((byte)-111, "Ó");
/*    */     j5.VF((byte)-110, "ą");
/*    */     j5.VF((byte)-109, "ę");
/*    */     j5.VF((byte)-108, "ó");
/*    */     j5.VF((byte)-107, "ś");
/*    */     j5.VF((byte)-106, "ł");
/*    */     j5.VF((byte)-105, "ń");
/*    */     j5.VF((byte)-104, "ż");
/*    */     j5.VF((byte)-103, "ź");
/*    */     j5.VF((byte)-102, "ć");
/*    */     j5.VF((byte)-101, "Ą");
/*    */     j5.VF((byte)-100, "Ż");
/*    */     j5.VF((byte)-99, "Ź");
/*    */     j5.VF((byte)-98, "Ł");
/*    */     j5.VF((byte)-97, "Ś");
/*    */     j5.VF((byte)-95, "0");
/*    */     j5.VF((byte)-94, "1");
/*    */     j5.VF((byte)-93, "2");
/*    */     j5.VF((byte)-92, "3");
/*    */     j5.VF((byte)-91, "4");
/*    */     j5.VF((byte)-90, "5");
/*    */     j5.VF((byte)-89, "6");
/*    */     j5.VF((byte)-88, "7");
/*    */     j5.VF((byte)-87, "8");
/*    */     j5.VF((byte)-86, "9");
/*    */     j5.VF((byte)-85, "!");
/*    */     j5.VF((byte)-84, "?");
/*    */     j5.VF((byte)-83, ".");
/*    */     j5.VF((byte)-82, "-");
/*    */     j5.VF((byte)-81, "·");
/*    */     j5.VF((byte)-80, "...");
/*    */     j5.VF((byte)-79, "«");
/*    */     j5.VF((byte)-78, "»");
/*    */     j5.VF((byte)-77, "'");
/*    */     j5.VF((byte)-76, "'");
/*    */     j5.VF((byte)-75, "♂");
/*    */     j5.VF((byte)-74, "♀");
/*    */     j5.VF((byte)-73, "$");
/*    */     j5.VF((byte)-72, ",");
/*    */     j5.VF((byte)-71, "*");
/*    */     j5.VF((byte)-70, "/");
/*    */     j5.VF((byte)-69, "A");
/*    */     j5.VF((byte)-68, "B");
/*    */     j5.VF((byte)-67, "C");
/*    */     j5.VF((byte)-66, "D");
/*    */     j5.VF((byte)-65, "E");
/*    */     j5.VF((byte)-64, "F");
/*    */     j5.VF((byte)-63, "G");
/*    */     j5.VF((byte)-62, "H");
/*    */     j5.VF((byte)-61, "I");
/*    */     j5.VF((byte)-60, "J");
/*    */     j5.VF((byte)-59, "K");
/*    */     j5.VF((byte)-58, "L");
/*    */     j5.VF((byte)-57, "M");
/*    */     j5.VF((byte)-56, "N");
/*    */     j5.VF((byte)-55, "O");
/*    */     j5.VF((byte)-54, "P");
/*    */     j5.VF((byte)-53, "Q");
/*    */     j5.VF((byte)-52, "R");
/*    */     j5.VF((byte)-51, "S");
/*    */     j5.VF((byte)-50, "T");
/*    */     j5.VF((byte)-49, "U");
/*    */     j5.VF((byte)-48, "V");
/*    */     j5.VF((byte)-47, "W");
/*    */     j5.VF((byte)-46, "X");
/*    */     j5.VF((byte)-45, "Y");
/*    */     j5.VF((byte)-44, "Z");
/*    */     j5.VF((byte)-43, "a");
/*    */     j5.VF((byte)-42, "b");
/*    */     j5.VF((byte)-41, "c");
/*    */     j5.VF((byte)-40, "d");
/*    */     j5.VF((byte)-39, "e");
/*    */     j5.VF((byte)-38, "f");
/*    */     j5.VF((byte)-37, "g");
/*    */     j5.VF((byte)-36, "h");
/*    */     j5.VF((byte)-35, "i");
/*    */     j5.VF((byte)-34, "j");
/*    */     j5.VF((byte)-33, "k");
/*    */     j5.VF((byte)-32, "l");
/*    */     j5.VF((byte)-31, "m");
/*    */     j5.VF((byte)-30, "n");
/*    */     j5.VF((byte)-29, "o");
/*    */     j5.VF((byte)-28, "p");
/*    */     j5.VF((byte)-27, "q");
/*    */     j5.VF((byte)-26, "r");
/*    */     j5.VF((byte)-25, "s");
/*    */     j5.VF((byte)-24, "t");
/*    */     j5.VF((byte)-23, "u");
/*    */     j5.VF((byte)-22, "v");
/*    */     j5.VF((byte)-21, "w");
/*    */     j5.VF((byte)-20, "x");
/*    */     j5.VF((byte)-19, "y");
/*    */     j5.VF((byte)-18, "z");
/*    */     j5.VF((byte)-17, "|>|");
/*    */     j5.VF((byte)-16, ":");
/*    */     j5.VF((byte)-15, "Ä");
/*    */     j5.VF((byte)-14, "Ö");
/*    */     j5.VF((byte)-13, "Ü");
/*    */     j5.VF((byte)-12, "ä");
/*    */     j5.VF((byte)-11, "ö");
/*    */     j5.VF((byte)-10, "ü");
/*    */     j5.VF((byte)-9, "|A|");
/*    */     j5.VF((byte)-8, "|V|");
/*    */     j5.VF((byte)-7, "|<|");
/*    */     j5.VF((byte)-6, "\n\n");
/*    */     j5.VF((byte)-5, "\n\n");
/*    */     j5.VF((byte)-4, "|FC|");
/*    */     j5.VF((byte)-3, "|FD|");
/*    */     j5.VF((byte)-2, "\n");
/*    */     j5.VF((byte)-1, "|end|");
/*    */     CZ.VF((byte)1, "%CHARACTER_NAME%");
/*    */     CZ.VF((byte)6, "%RIVAL_NAME%");
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ed.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */