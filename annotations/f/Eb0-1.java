/* 1 */ package f;public class Eb0 implements z5, Comparable { public int lPT9(Eb0 paramEb0) { byte b; if (paramEb0 == null) return 1;  if (paramEb0 instanceof zC) return -1;  long l1; long l2;
/* 2 */     if ((l1 = this.Cz0) == (l2 = paramEb0.Cz0)) { b = 0; } else if (b + Long.MIN_VALUE < l2 + Long.MIN_VALUE) { b = -1; } else { b = 1; }  if (b == 0) { long l3; long l4; if ((l4 = this.VP) == (l3 = paramEb0.VP)) { b = 0; } else if (b + Long.MIN_VALUE < l3 + Long.MIN_VALUE) { byte b1 = -1; } else { boolean bool = true; }  }  return b; }
/*   */ 
/*   */   
/*   */   private static final long serialVersionUID = 2L;
/*   */   public final long Cz0;
/*   */   public final long VP;
/*   */   public gh0[] LPT8;
/*   */   
/*   */   public static Eb0 MF0(String paramString) {
/*   */     if (paramString != null) {
/*   */       Object[] arrayOfObject1;
/*   */       int i = 0;
/*   */       int j = paramString.length();
/*   */       if (paramString.length() >= 2) {
/*   */         i = 1;
/*   */         if (paramString.charAt(0) != '[' || paramString.charAt(--j) == ']') {
/*   */           String str = null;
/*   */           char c;
/*   */           for (int k = j - 1; k > i && (c = paramString.charAt(k)) != ':'; k--) {
/*   */             if (c == '%') {
/*   */               str = paramString.substring(k + 1, j);
/*   */               j = k;
/*   */               break;
/*   */             } 
/*   */           } 
/*   */           if (j - i <= 39) {
/*   */             long l1 = 0L;
/*   */             long l2 = 0L;
/*   */             long l3 = 0L;
/*   */             int m = 0;
/*   */             int n = j + 2;
/*   */             int i1 = 1;
/*   */             int i2 = 0;
/*   */             while (true) {
/*   */               if (i < j) {
/*   */                 boolean bool;
/*   */                 char c1;
/*   */                 if (((c1 = paramString.charAt(i)) >= '0' && c1 <= '9') || (c1 >= 'a' && c1 <= 'f') || (c1 >= 'A' && c1 <= 'F')) {
/*   */                   bool = true;
/*   */                 } else {
/*   */                   bool = false;
/*   */                 } 
/*   */                 if (bool) {
/*   */                   if (++i2 <= 4) {
/*   */                     l1 = l1 << 4L | (Character.digit(c1, 16) & 0xFFFF);
/*   */                   } else {
/*   */                     throw new IllegalArgumentException("Address parts must contain no more than 16 bits (4 hex digits)");
/*   */                   } 
/*   */                 } else if (c1 == ':') {
/*   */                   if (m < 4) {
/*   */                     l2 |= l1 << 48 - (m << 4);
/*   */                   } else {
/*   */                     l3 |= l1 << 48 - (m - 4 << 4);
/*   */                   } 
/*   */                   m++;
/*   */                   i1++;
/*   */                   l1 = 0L;
/*   */                   i2 = 0;
/*   */                   if (i < j - 1 && paramString.charAt(i + 1) == ':') {
/*   */                     i += 2;
/*   */                     break;
/*   */                   } 
/*   */                 } else {
/*   */                   arrayOfObject1[0] = Character.valueOf(c1);
/*   */                   (arrayOfObject1 = new Object[2])[1] = Integer.valueOf(i);
/*   */                   throw new IllegalArgumentException(String.format("Illegal character: %c at index %d", arrayOfObject1));
/*   */                 } 
/*   */                 i++;
/*   */                 continue;
/*   */               } 
/*   */               i = n;
/*   */               break;
/*   */             } 
/*   */             j = m - 1;
/*   */             m = 7;
/*   */             for (int i3 = j - 1; i3 >= i; i3--) {
/*   */               boolean bool;
/*   */               char c1;
/*   */               if (((c1 = arrayOfObject1.charAt(i3)) >= '0' && c1 <= '9') || (c1 >= 'a' && c1 <= 'f') || (c1 >= 'A' && c1 <= 'F')) {
/*   */                 bool = true;
/*   */               } else {
/*   */                 bool = false;
/*   */               } 
/*   */               if (bool) {
/*   */                 if (m > j) {
/*   */                   l1 |= ((Character.digit(c1, 16) & 0xFFFF) << i2 << 2);
/*   */                   if (++i2 > 4)
/*   */                     throw new IllegalArgumentException("Address parts must contain no more than 16 bits (4 hex digits)"); 
/*   */                 } else {
/*   */                   throw new IllegalArgumentException("Too many parts. Expected 8 parts");
/*   */                 } 
/*   */               } else if (c1 == ':') {
/*   */                 if (m < 4) {
/*   */                   l2 |= l1 << 48 - (m << 4);
/*   */                 } else {
/*   */                   l3 |= l1 << 48 - (m - 4 << 4);
/*   */                 } 
/*   */                 if (arrayOfObject1.charAt(i3 - 1) != ':') {
/*   */                   int i4 = i1 + 1;
/*   */                   int i5 = m + -1;
/*   */                   long l = 0L;
/*   */                   m = 0;
/*   */                   i2 = m;
/*   */                   i1 = i4;
/*   */                   m = i5;
/*   */                   l1 = l;
/*   */                 } else {
/*   */                   (arrayOfObject1 = new Object[1])[0] = Integer.valueOf(i3);
/*   */                   throw new IllegalArgumentException(String.format("Error at index %d - unexpected colon", arrayOfObject1));
/*   */                 } 
/*   */               } else {
/*   */                 arrayOfObject1[0] = Character.valueOf(c1);
/*   */                 (arrayOfObject1 = new Object[2])[1] = Integer.valueOf(i3);
/*   */                 throw new IllegalArgumentException(String.format("Illegal character: %c at index %d", arrayOfObject1));
/*   */               } 
/*   */             } 
/*   */             if (m < 4) {
/*   */               l2 |= l1 << 48 - (m << 4);
/*   */             } else {
/*   */               l3 |= l1 << 48 - (m - 4 << 4);
/*   */             } 
/*   */             if (i1 <= 8 && (i1 >= 8 || i != n)) {
/*   */               Eb0 eb0;
/*   */               if (str == null) {
/*   */                 this(l2, l3);
/*   */               } else {
/*   */                 this(str, l2, l3);
/*   */               } 
/*   */               return eb0;
/*   */             } 
/*   */             (arrayOfObject1 = new Object[1])[0] = Integer.valueOf(i1);
/*   */             throw new IllegalArgumentException(String.format("Invalid number of parts. Expected 8, got %d", arrayOfObject1));
/*   */           } 
/*   */           arrayOfObject[0] = arrayOfObject1;
/*   */           Object[] arrayOfObject;
/*   */           (arrayOfObject = new Object[2])[1] = Integer.valueOf(arrayOfObject1.length());
/*   */           throw new IllegalArgumentException(String.format("Invalid length - the string %s is too long to be an IPv6 address. Length: %d", arrayOfObject));
/*   */         } 
/*   */         throw new IllegalArgumentException("The address begins with \"[\" but doesn't end with \"]\"");
/*   */       } 
/*   */       Object[] arrayOfObject2;
/*   */       (arrayOfObject2 = new Object[1])[0] = arrayOfObject1;
/*   */       throw new IllegalArgumentException(String.format("Invalid length - the string %s is too short to be an IPv6 address", arrayOfObject2));
/*   */     } 
/*   */     throw new IllegalArgumentException("Attempted to parse null address");
/*   */   }
/*   */   
/*   */   public static boolean Be(long paramLong1, long paramLong2, long paramLong3) {
/*   */     paramLong2 >>>= 63L;
/*   */     paramLong3 >>>= 63L;
/*   */     if (((paramLong1 >>>= 63L) & paramLong2) == 1L || ((paramLong1 ^ paramLong2) == 1L && paramLong3 == 0L))
/*   */       return true; 
/*   */   }
/*   */   
/*   */   public Eb0(long paramLong1, long paramLong2) {
/*   */     gh0[] arrayOfGh0;
/*   */     (arrayOfGh0 = new gh0[4])[0] = gh0.PC;
/*   */     (new gh0[4])[1] = gh0.XW;
/*   */     (new gh0[4])[2] = gh0.Sj;
/*   */     (new gh0[4])[3] = gh0.JJ0;
/*   */     this.LPT8 = this;
/*   */     this.Cz0 = paramLong1;
/*   */     this.VP = paramLong2;
/*   */   }
/*   */   
/*   */   static {
/*   */     MF0("::");
/*   */     MF0("ffff:ffff:ffff:ffff:ffff:ffff:ffff:ffff");
/*   */     BigInteger.ONE.negate();
/*   */   }
/*   */   
/*   */   public int hashCode() {
/*   */     return (31 + (int)(this.VP ^ this.VP >>> 32L)) * 31 + (int)(this.Cz0 ^ this.Cz0 >>> 32L);
/*   */   }
/*   */   
/*   */   public boolean equals(Object paramObject) {
/*   */     if (this == paramObject)
/*   */       return true; 
/*   */     if (paramObject == null)
/*   */       return false; 
/*   */     if (getClass() != paramObject.getClass())
/*   */       return false; 
/*   */     paramObject = paramObject;
/*   */     return (this.VP != ((Eb0)paramObject).VP) ? false : (!(this.Cz0 != ((Eb0)paramObject).Cz0));
/*   */   }
/*   */   
/*   */   public final boolean gK() {
/*   */     return xd0.dB.z10(this);
/*   */   }
/*   */   
/*   */   public Eb0 vo0(long paramLong) {
/*   */     boolean bool;
/*   */     if (paramLong < 0L)
/*   */       return f1(-paramLong); 
/*   */     l2 += paramLong;
/*   */     long l3 = this.Cz0;
/*   */     long l1 = paramLong >>> 63L;
/*   */     long l5 = l2 >>> 63L;
/*   */     long l2;
/*   */     long l4;
/*   */     if (((l4 = (l2 = this.VP) >>> 63L) & l1) == 1L || ((l4 ^ l1) == 1L && l5 == 0L)) {
/*   */       bool = true;
/*   */     } else {
/*   */       bool = false;
/*   */     } 
/*   */     if (bool)
/*   */       l3++; 
/*   */     return new Eb0(l3, l2);
/*   */   }
/*   */   
/*   */   public Eb0 f1(long paramLong) {
/*   */     boolean bool;
/*   */     if (paramLong < 0L)
/*   */       return vo0(-paramLong); 
/*   */     l2 -= paramLong;
/*   */     long l3 = this.Cz0;
/*   */     long l1 = paramLong >>> 63L;
/*   */     long l5 = l2 >>> 63L;
/*   */     long l2;
/*   */     long l4;
/*   */     if (((l4 = (l2 = this.VP) >>> 63L) & l1 & l5) == 1L || (l4 == 0L && (l1 | l5) == 1L)) {
/*   */       bool = true;
/*   */     } else {
/*   */       bool = false;
/*   */     } 
/*   */     if (bool)
/*   */       l3--; 
/*   */     return new Eb0(l3, l2);
/*   */   }
/*   */   
/*   */   public final byte[] DH() {
/*   */     byte[] arrayOfByte;
/*   */     iA iA1;
/*   */     (arrayOfByte = new byte[16])[0] = (iA1 = iA.Po).eM(this.Cz0);
/*   */     iA iA2;
/*   */     (new byte[16])[1] = (iA2 = iA.sh0).eM(this.Cz0);
/*   */     iA iA3;
/*   */     (new byte[16])[2] = (iA3 = iA.EK0).eM(this.Cz0);
/*   */     iA iA4;
/*   */     (new byte[16])[3] = (iA4 = iA.GF0).eM(this.Cz0);
/*   */     iA iA5;
/*   */     (new byte[16])[4] = (iA5 = iA.jr).eM(this.Cz0);
/*   */     iA iA6;
/*   */     (new byte[16])[5] = (iA6 = iA.QK0).eM(this.Cz0);
/*   */     iA iA7;
/*   */     (new byte[16])[6] = (iA7 = iA.Xh0).eM(this.Cz0);
/*   */     arrayOfByte[7] = iA8.eM(this.Cz0);
/*   */     arrayOfByte[8] = iA1.eM(this.VP);
/*   */     arrayOfByte[9] = iA2.eM(this.VP);
/*   */     arrayOfByte[10] = iA3.eM(this.VP);
/*   */     arrayOfByte[11] = iA4.eM(this.VP);
/*   */     arrayOfByte[12] = iA5.eM(this.VP);
/*   */     arrayOfByte[13] = iA6.eM(this.VP);
/*   */     arrayOfByte[14] = iA7.eM(this.VP);
/*   */     iA iA8;
/*   */     return new byte[] { 
/*   */         0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
/*   */         0, 0, 0, 0, 0, (iA8 = iA.pW).eM(this.VP) };
/*   */   }
/*   */   
/*   */   public String toString() {
/*   */     this(39);
/*   */     StringBuilder stringBuilder;
/*   */     gh0 gh01;
/*   */     (new StringBuilder()).append(Integer.toHexString((gh01 = gh0.PC).dz(this.Cz0)));
/*   */     (new StringBuilder()).append(":");
/*   */     gh0 gh02;
/*   */     (new StringBuilder()).append(Integer.toHexString((gh02 = gh0.XW).dz(this.Cz0)));
/*   */     (new StringBuilder()).append(":");
/*   */     gh0 gh03;
/*   */     (new StringBuilder()).append(Integer.toHexString((gh03 = gh0.Sj).dz(this.Cz0)));
/*   */     (new StringBuilder()).append(":");
/*   */     stringBuilder.append(Integer.toHexString(gh04.dz(this.Cz0)));
/*   */     stringBuilder.append(":");
/*   */     stringBuilder.append(Integer.toHexString(gh01.dz(this.VP)));
/*   */     stringBuilder.append(":");
/*   */     stringBuilder.append(Integer.toHexString(gh02.dz(this.VP)));
/*   */     stringBuilder.append(":");
/*   */     stringBuilder.append(Integer.toHexString(gh03.dz(this.VP)));
/*   */     stringBuilder.append(":");
/*   */     gh0 gh04;
/*   */     (new StringBuilder()).append(Integer.toHexString((gh04 = gh0.JJ0).dz(this.VP)));
/*   */     return (new StringBuilder()).toString();
/*   */   }
/*   */   
/*   */   public final String En0() {
/*   */     // Byte code:
/*   */     //   0: new java/lang/StringBuilder
/*   */     //   3: dup
/*   */     //   4: astore_1
/*   */     //   5: bipush #39
/*   */     //   7: invokespecial <init> : (I)V
/*   */     //   10: iconst_m1
/*   */     //   11: istore_2
/*   */     //   12: iconst_0
/*   */     //   13: istore_3
/*   */     //   14: iconst_m1
/*   */     //   15: istore #4
/*   */     //   17: iconst_0
/*   */     //   18: istore #5
/*   */     //   20: iconst_0
/*   */     //   21: istore #6
/*   */     //   23: iload #6
/*   */     //   25: bipush #8
/*   */     //   27: if_icmpge -> 114
/*   */     //   30: iload #6
/*   */     //   32: aload_0
/*   */     //   33: getfield LPT8 : [Lf/gh0;
/*   */     //   36: iload #6
/*   */     //   38: iconst_3
/*   */     //   39: iand
/*   */     //   40: aaload
/*   */     //   41: astore #7
/*   */     //   43: iconst_4
/*   */     //   44: if_icmplt -> 56
/*   */     //   47: aload_0
/*   */     //   48: getfield VP : J
/*   */     //   51: lstore #8
/*   */     //   53: goto -> 62
/*   */     //   56: aload_0
/*   */     //   57: getfield Cz0 : J
/*   */     //   60: lstore #8
/*   */     //   62: aload #7
/*   */     //   64: lload #8
/*   */     //   66: invokevirtual dz : (J)I
/*   */     //   69: ifne -> 102
/*   */     //   72: iload #4
/*   */     //   74: iconst_m1
/*   */     //   75: if_icmpne -> 82
/*   */     //   78: iload #6
/*   */     //   80: istore #4
/*   */     //   82: iload #5
/*   */     //   84: iconst_1
/*   */     //   85: iadd
/*   */     //   86: dup
/*   */     //   87: istore #5
/*   */     //   89: iload_3
/*   */     //   90: if_icmple -> 108
/*   */     //   93: iload #5
/*   */     //   95: iload #4
/*   */     //   97: istore_2
/*   */     //   98: istore_3
/*   */     //   99: goto -> 108
/*   */     //   102: iconst_m1
/*   */     //   103: istore #4
/*   */     //   105: iconst_0
/*   */     //   106: istore #5
/*   */     //   108: iinc #6, 1
/*   */     //   111: goto -> 23
/*   */     //   114: iload_3
/*   */     //   115: iconst_1
/*   */     //   116: if_icmple -> 125
/*   */     //   119: iconst_1
/*   */     //   120: istore #4
/*   */     //   122: goto -> 128
/*   */     //   125: iconst_0
/*   */     //   126: istore #4
/*   */     //   128: iconst_0
/*   */     //   129: istore #5
/*   */     //   131: iload #5
/*   */     //   133: bipush #8
/*   */     //   135: if_icmpge -> 245
/*   */     //   138: iload #4
/*   */     //   140: ifeq -> 164
/*   */     //   143: iload #5
/*   */     //   145: iload_2
/*   */     //   146: if_icmpne -> 164
/*   */     //   149: iload #5
/*   */     //   151: ifne -> 232
/*   */     //   154: aload_1
/*   */     //   155: ldc '::'
/*   */     //   157: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   160: pop
/*   */     //   161: goto -> 239
/*   */     //   164: iload #5
/*   */     //   166: iload_2
/*   */     //   167: if_icmple -> 178
/*   */     //   170: iload #5
/*   */     //   172: iload_2
/*   */     //   173: iload_3
/*   */     //   174: iadd
/*   */     //   175: if_icmplt -> 239
/*   */     //   178: iload #5
/*   */     //   180: aload_0
/*   */     //   181: getfield LPT8 : [Lf/gh0;
/*   */     //   184: iload #5
/*   */     //   186: iconst_3
/*   */     //   187: iand
/*   */     //   188: aaload
/*   */     //   189: astore #6
/*   */     //   191: iconst_4
/*   */     //   192: if_icmplt -> 204
/*   */     //   195: aload_0
/*   */     //   196: getfield VP : J
/*   */     //   199: lstore #7
/*   */     //   201: goto -> 210
/*   */     //   204: aload_0
/*   */     //   205: getfield Cz0 : J
/*   */     //   208: lstore #7
/*   */     //   210: iload #5
/*   */     //   212: aload_1
/*   */     //   213: aload #6
/*   */     //   215: lload #7
/*   */     //   217: invokevirtual dz : (J)I
/*   */     //   220: invokestatic toHexString : (I)Ljava/lang/String;
/*   */     //   223: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   226: pop
/*   */     //   227: bipush #7
/*   */     //   229: if_icmpge -> 239
/*   */     //   232: aload_1
/*   */     //   233: ldc ':'
/*   */     //   235: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   238: pop
/*   */     //   239: iinc #5, 1
/*   */     //   242: goto -> 131
/*   */     //   245: aload_1
/*   */     //   246: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   249: areturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 33
/*   */     //   #2	-> 155
/*   */     //   #3	-> 181
/*   */     //   #4	-> 220
/*   */   }
/*   */   
/*   */   public final int hp() {
/*   */     return 6;
/*   */   }
/*   */   
/*   */   public final Eb0 BD() {
/*   */     return this;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Eb0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */