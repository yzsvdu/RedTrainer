/*  1 */
package f;

public abstract class LF {
    public static final ik xL0 = C00.gd(LF.class);
    public static final Pattern ty;

    public static String fX(ByteBuffer paramByteBuffer) {
        this();
        StringBuilder stringBuilder;
        int i;
        for (i = 0; paramByteBuffer.hasRemaining(); ) {
            if (i % 16 == 0) {
                Object[] arrayOfObject1;
                (arrayOfObject1 = new Object[1])[0] = Integer.valueOf(i);
                stringBuilder.append(String.format("%04X: ", arrayOfObject1));
            }
            int j = paramByteBuffer.get() & 0xFF;
            Object[] arrayOfObject;
            (arrayOfObject = new Object[1])[0] = Integer.valueOf(j);
            stringBuilder.append(String.format("%02X ", arrayOfObject));
            if (++i % 16 == 0) {
                stringBuilder.append("  ");
                int k;
                byte b;
                for (j = 16, k = paramByteBuffer.position() - j, b = 0; b < j; ) {
                    int m = k + 1;
                    if ((k = paramByteBuffer.get(k)) > 31 && k < 128) {
                        stringBuilder.append((char) k);
                    } else {
                        stringBuilder.append('.');
                    }
                    b++;
                    k = m;
                }
                stringBuilder
/*  2 */.append("\n");
            }
        }
        if ((i %= 16) > 0) {
            int j;
            for (j = 0; j < 17 - i; ) {
                stringBuilder.append("   ");
                j++;
            }
            /*  3 */
            byte b;
            for (j = paramByteBuffer.position() - i, b = 0; b < i; ) {
                int k = j + 1;
                if ((j = paramByteBuffer.get(j)) > 31 && j < 128) {
                    stringBuilder.append((char) j);
                } else {
                    stringBuilder.append('.');
                }
                b++;
                j = k;
            }
        }
        /*  4 */
        return stringBuilder.toString();
    }

    public static final Matcher OD0 = (ty = Pattern.compile("\\p{M}")).matcher("");
    public static Thread zs = null;

    public static byte[] ld0(InputStream paramInputStream) { // Byte code:
        /*    */     //   0: aload_0
        /*    */     //   1: sipush #1024
        /*    */     //   4: istore_1
        /*    */     //   5: instanceof java/io/ByteArrayInputStream
        /*    */     //   8: ifeq -> 31
        /*    */     //   11: aload_0
        /*    */     //   12: dup
        /*    */     //   13: invokevirtual available : ()I
        /*    */     //   16: dup
        /*    */     //   17: istore_0
        /*    */     //   18: newarray byte
        /*    */     //   20: dup
        /*    */     //   21: astore_1
        /*    */     //   22: iconst_0
        /*    */     //   23: iload_0
        /*    */     //   24: invokevirtual read : ([BII)I
        /*    */     //   27: pop
        /*    */     //   28: goto -> 73
        /*    */     //   31: iload_1
        /*    */     //   32: new java/io/ByteArrayOutputStream
        /*    */     //   35: dup
        /*    */     //   36: astore_2
        /*    */     //   37: invokespecial <init> : ()V
        /*    */     //   40: newarray byte
        /*    */     //   42: astore_3
        /*    */     //   43: aload_0
        /*    */     //   44: aload_3
        /*    */     //   45: iconst_0
        /*    */     //   46: iload_1
        /*    */     //   47: invokevirtual read : ([BII)I
        /*    */     //   50: dup
        /*    */     //   51: istore #4
        /*    */     //   53: iconst_m1
        /*    */     //   54: if_icmpeq -> 68
        /*    */     //   57: aload_2
        /*    */     //   58: aload_3
        /*    */     //   59: iconst_0
        /*    */     //   60: iload #4
        /*    */     //   62: invokevirtual write : ([BII)V
        /*    */     //   65: goto -> 43
        /*    */     //   68: aload_2
        /*    */     //   69: invokevirtual toByteArray : ()[B
        /*    */     //   72: astore_1
        /*    */     //   73: aload_1
        /*  4 */     //   74: areturn } public static String za(int paramInt) { return Ya(paramInt, 2); } public static String da0(int paramInt, boolean paramBoolean) { return (Math.abs(paramInt) < 60) ? (paramBoolean ? Ml0.la(7509, "Very soon") : Ml0.la(7510, "Just now")) : Ya(Math.abs(paramInt), 1); } public static void ak0(int paramInt1, int paramInt2, int paramInt3, StringBuilder paramStringBuilder) { StringBuilder stringBuilder; String str; if (paramInt2 >= paramInt3) return;  if (paramInt1 < 60) { paramStringBuilder.append(paramInt1).append(' '); if (Ml0.nW.return(7500)) { paramStringBuilder.append(Ml0.OH0((paramInt1 != 1) ? 7501 : 7500)); } else { stringBuilder = paramStringBuilder.append("second"); if (paramInt1 != 1) { str = "s"; } else { str = ""; }  stringBuilder.append(str); }  return; }  int i; if ((i = stringBuilder / 60) < 60) { paramStringBuilder.append(i).append(' '); if (Ml0.nW
        /*  5 */         .return (7502))
        /*  6 */
        {
            paramStringBuilder.append(Ml0.OH0((i != 1) ? 7503 : 7502));
        } else{
            String str1;
            StringBuilder stringBuilder1 = paramStringBuilder.append("minute");
            if (i != 1) {
                str1 = "s";
            } else {
                str1 = "";
            }
            stringBuilder1.append(str1);
        }
        paramStringBuilder.append(' ');
        ak0(stringBuilder - i * 60, str + 1, paramInt3, paramStringBuilder);
        return;
    }  if((i =stringBuilder /3600) < 24)

    {
        paramStringBuilder.append(i).append(' ');
        /*  7 */
        if (Ml0.nW
                /*  8 */. return (7504))
        /*  9 */
        {
            paramStringBuilder.append(Ml0.OH0((i != 1) ? 7505 : 7504));
        } else{
        String str1;
        StringBuilder stringBuilder1 = paramStringBuilder.append("hour");
        if (i != 1) {
            str1 = "s";
        } else {
            str1 = "";
        }
        stringBuilder1.append(str1);
    }
        paramStringBuilder.append(' ');
        ak0(stringBuilder - i * 3600, str + 1, paramInt3, paramStringBuilder);
        return;
    }  paramStringBuilder.append(i =stringBuilder /86400).

    append(' ');
    /* 10 */     if(Ml0.nW
            /* 11 */ .return(7506))

    /* 12 */ {
        paramStringBuilder.append(Ml0.OH0((i != 1) ? 7507 : 7506));
    } else

    {
        String str1;
        StringBuilder stringBuilder1 = paramStringBuilder.append("day");
        if (i != 1) {
            str1 = "s";
        } else {
            str1 = "";
        }
        stringBuilder1.append(str1);
    }  paramStringBuilder.append(' ');

    ak0(stringBuilder -i*86400, str +1, paramInt3, paramStringBuilder);

}

    /*    */
    /*    */
    /*    */
    public static String oa0(byte[] paramArrayOfbyte) {
        /*    */
        this();
        /*    */
        Formatter formatter;
        /*    */
        int i = paramArrayOfbyte.length;
        /*    */
        for (byte b = 0; b < i; b++) {
            /*    */
            byte b1 = paramArrayOfbyte[b];
            /*    */
            Object[] arrayOfObject;
            /*    */
            (arrayOfObject = new Object[1])[0] = Byte.valueOf(b1);
            /*    */
            formatter.format("%02x", arrayOfObject);
            /*    */
        }
        /*    */
        formatter.close();
        /*    */
        return formatter.toString().toLowerCase();
        /*    */
    }

    /*    */
    /*    */
    public static InputStream UK(String paramString) {
        /*    */
        return F7(paramString, LF::Hv0);
        /*    */
    }

    /*    */
    /*    */
    public static InputStream F7(String paramString, Consumer<HttpURLConnection> paramConsumer) {
        /*    */
        InputStream inputStream;
        /*    */
        httpURLConnection.setInstanceFollowRedirects(true);
        /*    */
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip, deflate");
        /*    */
        httpURLConnection.setConnectTimeout(30000);
        /*    */
        httpURLConnection.setReadTimeout(30000);
        /*    */
        paramConsumer.accept(httpURLConnection);
        /*    */
        HttpURLConnection httpURLConnection;
        /*    */
        (httpURLConnection = (HttpURLConnection) (new URL(paramString)).openConnection()).connect();
        /*    */
        String str;
        /*    */
        if ((str = ((HttpURLConnection) (new URL(paramString)).openConnection()).getContentEncoding()) != null && str.equalsIgnoreCase("gzip"))
            /*    */ return new GZIPInputStream(httpURLConnection.getInputStream());
        /*    */
        if (str != null && str.equalsIgnoreCase("deflate")) {
            /*    */
            Inflater inflater;
            /*    */
            inputStream = httpURLConnection.getInputStream();
            /*    */
            this(true);
            /*    */
            return new InflaterInputStream(inputStream, inflater);
            /*    */
        }
        /*    */
        return inputStream.getInputStream();
        /*    */
    }

    /*    */
    /*    */
    public static byte IW(byte paramByte) {
        /*    */
        return (paramByte % 2 == 0) ? (byte) (paramByte + 1) : (byte) (paramByte - 1);
        /*    */
    }

    /*    */
    /*    */
    public static byte KU(short paramShort1, short paramShort2, short paramShort3, short paramShort4) {
        /*    */
        return (paramShort1 < paramShort3) ? 3 : ((paramShort1 > paramShort3) ? 2 : ((paramShort2 > paramShort4) ? 1 : 0));
        /*    */
    }

    /*    */
    /*    */
    public static String Gt0(String paramString) {
        /*    */
        char[] arrayOfChar = paramString.toCharArray();
        /*    */
        char c = '\001';
        /*    */
        boolean bool = false;
        /*    */
        for (byte b = 0; b < arrayOfChar.length; b++) {
            /*    */
            char c1;
            /*    */
            if (Character.isWhitespace(c1 = arrayOfChar[b]) || c1 == '.' || c1 == '\'') {
                /*    */
                c = '\001';
                /*    */
            } else {
                /*    */
                arrayOfChar[b] = c;
                /*    */
                c = Character.MIN_VALUE;
                /*    */
                arrayOfChar[b] = c2;
                /*    */
                char c2;
                /*    */
                if (c ? ((c = Character.toUpperCase(c1)) != c1) : ((c2 = Character.toLowerCase(c1)) != c1))
                    /*    */ bool = true;
                /*    */
            }
            /*    */
        }
        /*    */
        return bool ? String.valueOf(arrayOfChar) : paramString;
        /*    */
    }

    /*    */
    /*    */
    public static byte[] Jv(InetAddress paramInetAddress) {
        /*    */
        InetAddress inetAddress;
        /*    */
        if (paramInetAddress == null) {
            /*    */
            try {
                /*    */
                inetAddress = InetAddress.getLocalHost();
                /*    */
            } catch (Exception exception) {
            }
            /*    */
        } else {
            /*    */
            inetAddress = paramInetAddress;
            /*    */
        }
        /*    */
        NetworkInterface networkInterface;
        /*    */
        if ((networkInterface = NetworkInterface.getByInetAddress(inetAddress)) == null) {
            /*    */
            Enumeration<NetworkInterface> enumeration = NetworkInterface.getNetworkInterfaces();
            /*    */
            while (enumeration.hasMoreElements()) {
                /*    */
                NetworkInterface networkInterface1;
                /*    */
                try {
                    /*    */
                    if ((networkInterface1 = enumeration.nextElement()).getHardwareAddress() != null && (networkInterface1.getHardwareAddress()).length == 6) {
                        /*    */
                        networkInterface = networkInterface1;
                        /*    */
                        break;
                        /*    */
                    }
                    /*    */
                } catch (Exception exception) {
                }
                /*    */
            }
            /*    */
        }
        /*    */
        byte[] arrayOfByte;
        /*    */
        return (networkInterface != null && (arrayOfByte = networkInterface.getHardwareAddress()) != null && arrayOfByte.length == 6) ? arrayOfByte : ((paramInetAddress != null) ? Jv(null) : new byte[]{-1, -1, -1, -1, -1, -1});
        /*    */
    }

    /*    */
    /*    */
    public static String QA(long paramLong) {
        /*    */
        byte b2;
        /*    */
        byte[] arrayOfByte;
        /*    */
        ByteBuffer.wrap(arrayOfByte = new byte[b2 = 8]).putLong(paramLong);
        /*    */
        String str;
        /*    */
        byte b1;
        /*    */
        for (str = "", b1 = 2; b1 < b2; ) {
            /*    */
            String str2;
            /*    */
            StringBuilder stringBuilder = B40.df(str);
            /*    */
            String str1 = "%02X%s";
            /*    */
            Object[] arrayOfObject;
            /*    */
            (arrayOfObject = new Object[2])[0] = Byte.valueOf(arrayOfByte[b1]);
            /*    */
            boolean bool = true;
            /*    */
            if (b1 < 7) {
                /*    */
                str2 = ":";
                /*    */
            } else {
                /*    */
                str2 = "";
                /*    */
            }
            /*    */
            arrayOfObject[bool] = str2;
            /*    */
            str = stringBuilder.append(String.format(str1, arrayOfObject)).toString();
            /*    */
            b1++;
            /*    */
        }
        /*    */
        return str;
        /*    */
    }

    /*    */
    /*    */
    public static String W70(long paramLong) {
        /*    */
        paramLong %= 60L;
        /*    */
        long l1 = paramLong / 60L % 60L;
        /*    */
        long l2 = paramLong / 3600L % 24L;
        /*    */
        arrayOfObject[0] = Long.valueOf(l2);
        /*    */
        arrayOfObject[1] = Long.valueOf(l1);
        /*    */
        Object[] arrayOfObject;
        /*    */
        (arrayOfObject = new Object[3])[2] = Long.valueOf(paramLong);
        /*    */
        return String.format("%d:%02d:%02d", arrayOfObject);
        /*    */
    }

    /*    */
    /*    */
    public static String Ll0(String paramString, boolean paramBoolean) {
        /*    */
        if (paramBoolean && (paramString = paramString.trim().toLowerCase()).indexOf('﻿') > -1)
            /*    */ paramString = paramString.replace("﻿", "");
        /*    */
        String str;
        /*    */
        if (paramString == (str = Normalizer.normalize(paramString, Normalizer.Form.NFD)))
            /*    */ return paramString;
        /*    */
        Thread thread;
        /*    */
        if ((thread = zs) == null || thread == Thread.currentThread()) {
            /*    */
            zs = Thread.currentThread();
            /*    */
            return Normalizer.normalize(OD0.reset(str).replaceAll(""), Normalizer.Form.NFC);
            /*    */
        }
        /*    */
    }

    /*    */
    /*    */
    public static boolean qS(String paramString1, String paramString2) {
        /*    */
        return Cm0(Ll0(paramString1, false), paramString2);
        /*    */
    }

    /*    */
    /*    */
    public static boolean Cm0(String paramString1, String paramString2) {
        /*    */
        if (paramString2.indexOf('﻿') > -1)
            /*    */ paramString2 = paramString2.replace("﻿", "");
        /*    */
        int i;
        /*    */
        if ((i = paramString2.length()) == 0)
            /*    */ return true;
        /*    */
        char c1 = Character.toLowerCase(paramString2.charAt(0));
        /*    */
        char c2 = Character.toUpperCase(paramString2.charAt(0));
        /*    */
        for (int j = paramString1.length() - i; j >= 0; j--) {
            /*    */
            char c;
            /*    */
            if (((c = paramString1.charAt(j)) == c1 || c == c2) && paramString1.regionMatches(true, j, paramString2, 0, i))
                /*    */ return true;
            /*    */
        }
        /*    */
        return false;
        /*    */
    }

    /*    */
    /*    */
    public static boolean M60(String paramString1, String paramString2) {
        /*    */
        int i = paramString2.length();
        /*    */
        return paramString1.regionMatches(true, 0, paramString2, 0, i);
        /*    */
    }

    /*    */
    /*    */
    public static boolean e6(short paramShort, boolean paramBoolean) {
        /*    */
        switch (paramShort) {
            /*    */
            default:
                /*    */
                return false;
            /*    */
            case 105:
                /*    */
            case 135:
                /*    */
            case 156:
                /*    */
            case 208:
                /*    */
            case 215:
                /*    */
            case 234:
                /*    */
            case 235:
                /*    */
            case 236:
                /*    */
            case 273:
                /*    */
            case 303:
                /*    */
            case 312:
                /*    */
            case 355:
                /*    */
            case 456:
                /*    */
            case 505:
                /*    */
            case 1030:
                /*    */
            case 1031:
                /*    */
                return paramBoolean;
            /*    */
            case 100:
                /*    */
            case 249:
                /*    */
                return paramBoolean ^ true;
            /*    */
            case 15:
                /*    */
            case 19:
                /*    */
            case 57:
                /*    */
            case 70:
                /*    */
            case 91:
                /*    */
            case 127:
                /*    */
            case 148:
                /*    */
            case 230:
                /*    */
            case 291:
                /*    */
            case 431:
                /*    */
            case 432:
                /*    */
                break;
            /*    */
        }
        /*    */
        return true;
        /*    */
    }

    /*    */
    /*    */
    public static boolean CE0(short paramShort, boolean paramBoolean) {
        /*    */
        return (paramShort != 505 && paramShort != 1030) ? false : paramBoolean;
        /*    */
    }

    /*    */
    /*    */
    public static void Db(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, int paramInt3) {
        /*    */
        while (paramByteBuffer.remaining() > 12) {
            /*    */
            if (paramByteBuffer.getInt() == paramInt1 && paramByteBuffer.getInt() == paramInt2 && paramByteBuffer.getInt() == paramInt3)
                /*    */ return;
            /*    */
        }
        /*    */
        throw new RuntimeException("Unable to find pattern");
        /*    */
    }

    /*    */
    /*    */
    public static int JV(int[] paramArrayOfint) {
        /*    */
        if (paramArrayOfint.length == 0)
            /*    */ return 0;
        /*    */
        int i = 0;
        /*    */
        for (byte b = 0; b < paramArrayOfint.length; b++)
            /*    */
            i += paramArrayOfint[b];
        /*    */
        return i / paramArrayOfint.length;
        /*    */
    }

    /*    */
    /*    */
    public static byte w1(Q90 paramQ90) {
        /*    */
        int i;
        /*    */
        if ((i = paramQ90.MD0) < 0)
            /*    */ i *= -1;
        /*    */
        return (byte) (i % 6);
        /*    */
    }

    /*    */
    /*    */
    public static byte[] sf(int paramInt, ByteBuffer paramByteBuffer) {
        /*    */     // Byte code:
        /*    */     //   0: aload_1
        /*    */     //   1: dup
        /*    */     //   2: dup
        /*    */     //   3: invokevirtual position : ()I
        /*    */     //   6: istore_2
        /*    */     //   7: iload_0
        /*    */     //   8: invokevirtual position : (I)Ljava/nio/Buffer;
        /*    */     //   11: pop
        /*    */     //   12: invokevirtual get : ()B
        /*    */     //   15: dup
        /*    */     //   16: istore_3
        /*    */     //   17: bipush #17
        /*    */     //   19: if_icmpne -> 431
        /*    */     //   22: aload_1
        /*    */     //   23: dup
        /*    */     //   24: iload_0
        /*    */     //   25: invokevirtual position : (I)Ljava/nio/Buffer;
        /*    */     //   28: pop
        /*    */     //   29: invokevirtual get : ()B
        /*    */     //   32: bipush #17
        /*    */     //   34: if_icmpne -> 407
        /*    */     //   37: iconst_0
        /*    */     //   38: istore_0
        /*    */     //   39: iconst_0
        /*    */     //   40: istore_2
        /*    */     //   41: iload_2
        /*    */     //   42: iconst_3
        /*    */     //   43: if_icmpge -> 68
        /*    */     //   46: iload_0
        /*    */     //   47: aload_1
        /*    */     //   48: invokevirtual get : ()B
        /*    */     //   51: sipush #255
        /*    */     //   54: iand
        /*    */     //   55: iload_2
        /*    */     //   56: bipush #8
        /*    */     //   58: imul
        /*    */     //   59: ishl
        /*    */     //   60: ior
        /*    */     //   61: istore_0
        /*    */     //   62: iinc #2, 1
        /*    */     //   65: goto -> 41
        /*    */     //   68: iload_0
        /*    */     //   69: ifne -> 77
        /*    */     //   72: aload_1
        /*    */     //   73: invokevirtual getInt : ()I
        /*    */     //   76: istore_0
        /*    */     //   77: iload_0
        /*    */     //   78: newarray byte
        /*    */     //   80: astore_2
        /*    */     //   81: iconst_0
        /*    */     //   82: istore_3
        /*    */     //   83: iload_3
        /*    */     //   84: iload_0
        /*    */     //   85: if_icmpge -> 405
        /*    */     //   88: aload_1
        /*    */     //   89: invokevirtual get : ()B
        /*    */     //   92: sipush #255
        /*    */     //   95: iand
        /*    */     //   96: istore #4
        /*    */     //   98: iconst_0
        /*    */     //   99: istore #5
        /*    */     //   101: iload #5
        /*    */     //   103: bipush #8
        /*    */     //   105: if_icmpge -> 83
        /*    */     //   108: iload_3
        /*    */     //   109: iload_0
        /*    */     //   110: if_icmpge -> 83
        /*    */     //   113: iload #4
        /*    */     //   115: sipush #128
        /*    */     //   118: iload #5
        /*    */     //   120: ishr
        /*    */     //   121: iand
        /*    */     //   122: ifle -> 129
        /*    */     //   125: iconst_1
        /*    */     //   126: goto -> 130
        /*    */     //   129: iconst_0
        /*    */     //   130: ifeq -> 372
        /*    */     //   133: aload_1
        /*    */     //   134: invokevirtual get : ()B
        /*    */     //   137: sipush #255
        /*    */     //   140: iand
        /*    */     //   141: dup
        /*    */     //   142: istore #6
        /*    */     //   144: iconst_4
        /*    */     //   145: ishr
        /*    */     //   146: dup
        /*    */     //   147: istore #7
        /*    */     //   149: ifeq -> 260
        /*    */     //   152: iload #7
        /*    */     //   154: iconst_1
        /*    */     //   155: if_icmpeq -> 186
        /*    */     //   158: iload #6
        /*    */     //   160: iload #7
        /*    */     //   162: iconst_1
        /*    */     //   163: iadd
        /*    */     //   164: istore #6
        /*    */     //   166: bipush #15
        /*    */     //   168: iand
        /*    */     //   169: bipush #8
        /*    */     //   171: ishl
        /*    */     //   172: aload_1
        /*    */     //   173: invokevirtual get : ()B
        /*    */     //   176: sipush #255
        /*    */     //   179: iand
        /*    */     //   180: ior
        /*    */     //   181: istore #7
        /*    */     //   183: goto -> 303
        /*    */     //   186: aload_1
        /*    */     //   187: dup
        /*    */     //   188: invokevirtual get : ()B
        /*    */     //   191: sipush #255
        /*    */     //   194: iand
        /*    */     //   195: istore #7
        /*    */     //   197: invokevirtual get : ()B
        /*    */     //   200: sipush #255
        /*    */     //   203: iand
        /*    */     //   204: dup
        /*    */     //   205: iload #6
        /*    */     //   207: aload_1
        /*    */     //   208: invokevirtual get : ()B
        /*    */     //   211: sipush #255
        /*    */     //   214: iand
        /*    */     //   215: istore #6
        /*    */     //   217: bipush #15
        /*    */     //   219: iand
        /*    */     //   220: bipush #12
        /*    */     //   222: ishl
        /*    */     //   223: iload #7
        /*    */     //   225: iconst_4
        /*    */     //   226: ishl
        /*    */     //   227: ior
        /*    */     //   228: swap
        /*    */     //   229: iconst_4
        /*    */     //   230: ishr
        /*    */     //   231: ior
        /*    */     //   232: sipush #273
        /*    */     //   235: iadd
        /*    */     //   236: istore #7
        /*    */     //   238: bipush #15
        /*    */     //   240: iand
        /*    */     //   241: bipush #8
        /*    */     //   243: ishl
        /*    */     //   244: iload #6
        /*    */     //   246: ior
        /*    */     //   247: istore #6
        /*    */     //   249: iload #6
        /*    */     //   251: iload #7
        /*    */     //   253: istore #6
        /*    */     //   255: istore #7
        /*    */     //   257: goto -> 303
        /*    */     //   260: aload_1
        /*    */     //   261: iload #6
        /*    */     //   263: iconst_4
        /*    */     //   264: ishl
        /*    */     //   265: istore #6
        /*    */     //   267: invokevirtual get : ()B
        /*    */     //   270: sipush #255
        /*    */     //   273: iand
        /*    */     //   274: dup
        /*    */     //   275: iload #6
        /*    */     //   277: swap
        /*    */     //   278: iconst_4
        /*    */     //   279: ishr
        /*    */     //   280: ior
        /*    */     //   281: bipush #17
        /*    */     //   283: iadd
        /*    */     //   284: istore #6
        /*    */     //   286: bipush #15
        /*    */     //   288: iand
        /*    */     //   289: bipush #8
        /*    */     //   291: ishl
        /*    */     //   292: aload_1
        /*    */     //   293: invokevirtual get : ()B
        /*    */     //   296: sipush #255
        /*    */     //   299: iand
        /*    */     //   300: ior
        /*    */     //   301: istore #7
        /*    */     //   303: iload #7
        /*    */     //   305: iload_3
        /*    */     //   306: if_icmpgt -> 361
        /*    */     //   309: iconst_0
        /*    */     //   310: istore #8
        /*    */     //   312: iload_3
        /*    */     //   313: istore #9
        /*    */     //   315: iload #8
        /*    */     //   317: iload #6
        /*    */     //   319: if_icmpge -> 352
        /*    */     //   322: iload #9
        /*    */     //   324: iload_0
        /*    */     //   325: if_icmpge -> 352
        /*    */     //   328: aload_2
        /*    */     //   329: iload #9
        /*    */     //   331: aload_2
        /*    */     //   332: iload_3
        /*    */     //   333: iload #7
        /*    */     //   335: iinc #9, 1
        /*    */     //   338: isub
        /*    */     //   339: iconst_1
        /*    */     //   340: isub
        /*    */     //   341: iload #8
        /*    */     //   343: iadd
        /*    */     //   344: baload
        /*    */     //   345: bastore
        /*    */     //   346: iinc #8, 1
        /*    */     //   349: goto -> 315
        /*    */     //   352: iload #9
        /*    */     //   354: iload_0
        /*    */     //   355: if_icmple -> 396
        /*    */     //   358: goto -> 390
        /*    */     //   361: new java/lang/RuntimeException
        /*    */     //   364: dup
        /*    */     //   365: ldc_w 'Cannot go back more than already written'
        /*    */     //   368: invokespecial <init> : (Ljava/lang/String;)V
        /*    */     //   371: athrow
        /*    */     //   372: iload_3
        /*    */     //   373: iconst_1
        /*    */     //   374: iadd
        /*    */     //   375: dup
        /*    */     //   376: istore #9
        /*    */     //   378: aload_2
        /*    */     //   379: aload_1
        /*    */     //   380: invokevirtual get : ()B
        /*    */     //   383: iload_3
        /*    */     //   384: swap
        /*    */     //   385: bastore
        /*    */     //   386: iload_0
        /*    */     //   387: if_icmple -> 396
        /*    */     //   390: iload #9
        /*    */     //   392: istore_3
        /*    */     //   393: goto -> 83
        /*    */     //   396: iinc #5, 1
        /*    */     //   399: iload #9
        /*    */     //   401: istore_3
        /*    */     //   402: goto -> 101
        /*    */     //   405: aload_2
        /*    */     //   406: areturn
        /*    */     //   407: new java/lang/RuntimeException
        /*    */     //   410: dup
        /*    */     //   411: ldc_w 'This data is not Lz77 compressed! Pos = '
        /*    */     //   414: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
        /*    */     //   417: aload_1
        /*    */     //   418: invokevirtual position : ()I
        /*    */     //   421: invokevirtual append : (I)Ljava/lang/StringBuilder;
        /*    */     //   424: invokevirtual toString : ()Ljava/lang/String;
        /*    */     //   427: invokespecial <init> : (Ljava/lang/String;)V
        /*    */     //   430: athrow
        /*    */     //   431: iload_3
        /*    */     //   432: bipush #16
        /*    */     //   434: if_icmpne -> 791
        /*    */     //   437: aload_1
        /*    */     //   438: dup
        /*    */     //   439: invokevirtual getShort : ()S
        /*    */     //   442: ldc_w 65535
        /*    */     //   445: iand
        /*    */     //   446: aload_1
        /*    */     //   447: invokevirtual get : ()B
        /*    */     //   450: sipush #255
        /*    */     //   453: iand
        /*    */     //   454: bipush #16
        /*    */     //   456: ishl
        /*    */     //   457: ior
        /*    */     //   458: dup
        /*    */     //   459: istore_0
        /*    */     //   460: newarray byte
        /*    */     //   462: astore_3
        /*    */     //   463: invokevirtual position : ()I
        /*    */     //   466: istore #4
        /*    */     //   468: iconst_0
        /*    */     //   469: istore #5
        /*    */     //   471: bipush #8
        /*    */     //   473: istore #6
        /*    */     //   475: new java/util/BitSet
        /*    */     //   478: dup
        /*    */     //   479: astore #7
        /*    */     //   481: bipush #8
        /*    */     //   483: invokespecial <init> : (I)V
        /*    */     //   486: iload #5
        /*    */     //   488: iload_0
        /*    */     //   489: if_icmpge -> 783
        /*    */     //   492: iload #6
        /*    */     //   494: aload_1
        /*    */     //   495: iload #4
        /*    */     //   497: invokevirtual position : (I)Ljava/nio/Buffer;
        /*    */     //   500: pop
        /*    */     //   501: bipush #8
        /*    */     //   503: if_icmpeq -> 727
        /*    */     //   506: aload #7
        /*    */     //   508: iload #6
        /*    */     //   510: invokevirtual get : (I)Z
        /*    */     //   513: ifne -> 528
        /*    */     //   516: aload_3
        /*    */     //   517: aload_1
        /*    */     //   518: invokevirtual get : ()B
        /*    */     //   521: iload #5
        /*    */     //   523: swap
        /*    */     //   524: bastore
        /*    */     //   525: goto -> 711
        /*    */     //   528: iload #5
        /*    */     //   530: dup
        /*    */     //   531: iconst_2
        /*    */     //   532: newarray byte
        /*    */     //   534: dup
        /*    */     //   535: astore #8
        /*    */     //   537: aload_1
        /*    */     //   538: aload #8
        /*    */     //   540: invokevirtual get : ([B)Ljava/nio/ByteBuffer;
        /*    */     //   543: pop
        /*    */     //   544: iconst_0
        /*    */     //   545: baload
        /*    */     //   546: dup
        /*    */     //   547: dup
        /*    */     //   548: istore #9
        /*    */     //   550: sipush #255
        /*    */     //   553: iand
        /*    */     //   554: iconst_4
        /*    */     //   555: ishr
        /*    */     //   556: istore #10
        /*    */     //   558: sipush #255
        /*    */     //   561: iand
        /*    */     //   562: iload #9
        /*    */     //   564: sipush #255
        /*    */     //   567: iand
        /*    */     //   568: iconst_4
        /*    */     //   569: ishr
        /*    */     //   570: iconst_4
        /*    */     //   571: ishl
        /*    */     //   572: isub
        /*    */     //   573: bipush #8
        /*    */     //   575: ishl
        /*    */     //   576: aload #8
        /*    */     //   578: iconst_1
        /*    */     //   579: baload
        /*    */     //   580: sipush #255
        /*    */     //   583: iand
        /*    */     //   584: iadd
        /*    */     //   585: isub
        /*    */     //   586: iconst_1
        /*    */     //   587: isub
        /*    */     //   588: istore #8
        /*    */     //   590: iload #10
        /*    */     //   592: iconst_3
        /*    */     //   593: iadd
        /*    */     //   594: istore #9
        /*    */     //   596: iconst_0
        /*    */     //   597: istore #10
        /*    */     //   599: iconst_0
        /*    */     //   600: istore #11
        /*    */     //   602: ifle -> 612
        /*    */     //   605: aload_3
        /*    */     //   606: iload #5
        /*    */     //   608: iconst_1
        /*    */     //   609: isub
        /*    */     //   610: baload
        /*    */     //   611: pop
        /*    */     //   612: iload #10
        /*    */     //   614: iload #9
        /*    */     //   616: if_icmpeq -> 699
        /*    */     //   619: iload #5
        /*    */     //   621: iload #11
        /*    */     //   623: iadd
        /*    */     //   624: dup
        /*    */     //   625: istore #12
        /*    */     //   627: iflt -> 690
        /*    */     //   630: iload #8
        /*    */     //   632: iload #11
        /*    */     //   634: iadd
        /*    */     //   635: dup
        /*    */     //   636: istore #13
        /*    */     //   638: iflt -> 690
        /*    */     //   641: iload #5
        /*    */     //   643: iload #10
        /*    */     //   645: iadd
        /*    */     //   646: dup
        /*    */     //   647: istore #14
        /*    */     //   649: iload_0
        /*    */     //   650: if_icmpge -> 690
        /*    */     //   653: iload #13
        /*    */     //   655: iload #5
        /*    */     //   657: if_icmplt -> 676
        /*    */     //   660: aload_3
        /*    */     //   661: iload #14
        /*    */     //   663: aload_3
        /*    */     //   664: iload #8
        /*    */     //   666: iconst_0
        /*    */     //   667: dup
        /*    */     //   668: istore #11
        /*    */     //   670: iadd
        /*    */     //   671: baload
        /*    */     //   672: bastore
        /*    */     //   673: goto -> 690
        /*    */     //   676: aload_3
        /*    */     //   677: dup
        /*    */     //   678: dup
        /*    */     //   679: iload #13
        /*    */     //   681: baload
        /*    */     //   682: iload #14
        /*    */     //   684: swap
        /*    */     //   685: bastore
        /*    */     //   686: iload #12
        /*    */     //   688: baload
        /*    */     //   689: pop
        /*    */     //   690: iinc #10, 1
        /*    */     //   693: iinc #11, 1
        /*    */     //   696: goto -> 612
        /*    */     //   699: iload #9
        /*    */     //   701: iconst_1
        /*    */     //   702: isub
        /*    */     //   703: iload #5
        /*    */     //   705: iadd
        /*    */     //   706: istore #5
        /*    */     //   708: iinc #4, 1
        /*    */     //   711: iload #6
        /*    */     //   713: iinc #4, 1
        /*    */     //   716: iinc #5, 1
        /*    */     //   719: iconst_1
        /*    */     //   720: iadd
        /*    */     //   721: i2b
        /*    */     //   722: istore #6
        /*    */     //   724: goto -> 486
        /*    */     //   727: aload #7
        /*    */     //   729: aload_1
        /*    */     //   730: invokevirtual get : ()B
        /*    */     //   733: istore #6
        /*    */     //   735: invokevirtual clear : ()V
        /*    */     //   738: bipush #7
        /*    */     //   740: istore #8
        /*    */     //   742: iload #8
        /*    */     //   744: iconst_m1
        /*    */     //   745: if_icmple -> 774
        /*    */     //   748: iload #6
        /*    */     //   750: iconst_1
        /*    */     //   751: iload #8
        /*    */     //   753: ishl
        /*    */     //   754: iand
        /*    */     //   755: ifle -> 768
        /*    */     //   758: aload #7
        /*    */     //   760: bipush #7
        /*    */     //   762: iload #8
        /*    */     //   764: isub
        /*    */     //   765: invokevirtual set : (I)V
        /*    */     //   768: iinc #8, -1
        /*    */     //   771: goto -> 742
        /*    */     //   774: iinc #4, 1
        /*    */     //   777: iconst_0
        /*    */     //   778: istore #6
        /*    */     //   780: goto -> 486
        /*    */     //   783: aload_3
        /*    */     //   784: aload_1
        /*    */     //   785: iload_2
        /*    */     //   786: invokevirtual position : (I)Ljava/nio/Buffer;
        /*    */     //   789: pop
        /*    */     //   790: areturn
        /*    */     //   791: new java/lang/RuntimeException
        /*    */     //   794: dup
        /*    */     //   795: ldc_w 'This data is not Lz77 compressed! Pos = '
        /*    */     //   798: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
        /*    */     //   801: aload_1
        /*    */     //   802: invokevirtual position : ()I
        /*    */     //   805: invokevirtual append : (I)Ljava/lang/StringBuilder;
        /*    */     //   808: invokevirtual toString : ()Ljava/lang/String;
        /*    */     //   811: invokespecial <init> : (Ljava/lang/String;)V
        /*    */     //   814: athrow
        /*    */     // Line number table:
        /*    */     //   Java source line number -> byte code offset
        /*    */     //   #1	-> 29
        /*    */     //   #2	-> 48
        /*    */     //   #3	-> 78
        /*    */     //   #4	-> 411
        /*    */     //   #5	-> 418
        /*    */     //   #6	-> 439
        /*    */     //   #7	-> 610
        /*    */     //   #8	-> 730
        /*    */     //   #9	-> 735
        /*    */     //   #10	-> 786
        /*    */     //   #11	-> 795
        /*    */     //   #12	-> 802
        /*    */
    }

    /*    */
    /*    */
    public static void ps0(int paramInt1, int paramInt2, ByteBuffer paramByteBuffer) {
        /*    */
        while (paramByteBuffer.remaining() > 8) {
            /*    */
            if (paramByteBuffer.getInt() == paramInt1 && paramByteBuffer.getInt() == paramInt2)
                /*    */ return;
            /*    */
        }
        /*    */
        throw new RuntimeException("Unable to find pattern");
        /*    */
    }

    /*    */
    /*    */
    public static String Ya(int paramInt1, int paramInt2) {
        /*    */
        this();
        /*    */
        StringBuilder stringBuilder;
        /*    */
        ak0(Math.abs(paramInt1), 0, paramInt2, stringBuilder);
        /*    */
        if (paramInt1 < 0) {
            /*    */
            if (Ml0.nW. return (7508))
            /*    */
            return Ml0.Go(7508, stringBuilder.toString());
            /*    */
            return stringBuilder.append(" ago").toString();
            /*    */
        }
        /*    */
        return stringBuilder.toString();
        /*    */
    }

    /*    */
    /*    */
    public static String r3(String paramString) {
        /*    */     // Byte code:
        /*    */     //   0: ldc_w 'SHA-256'
        /*    */     //   3: astore_1
        /*    */     //   4: new java/io/File
        /*    */     //   7: dup
        /*    */     //   8: dup
        /*    */     //   9: astore_2
        /*    */     //   10: aload_0
        /*    */     //   11: invokespecial <init> : (Ljava/lang/String;)V
        /*    */     //   14: invokevirtual exists : ()Z
        /*    */     //   17: ifeq -> 120
        /*    */     //   20: aload_2
        /*    */     //   21: invokevirtual isFile : ()Z
        /*    */     //   24: ifne -> 30
        /*    */     //   27: goto -> 120
        /*    */     //   30: aconst_null
        /*    */     //   31: astore_0
        /*    */     //   32: new java/io/FileInputStream
        /*    */     //   35: dup
        /*    */     //   36: astore_3
        /*    */     //   37: aload_1
        /*    */     //   38: aload_3
        /*    */     //   39: aload_2
        /*    */     //   40: invokespecial <init> : (Ljava/io/File;)V
        /*    */     //   43: aload_3
        /*    */     //   44: invokestatic vj0 : (Ljava/lang/String;Ljava/io/FileInputStream;)Ljava/lang/String;
        /*    */     //   47: astore_0
        /*    */     //   48: invokevirtual close : ()V
        /*    */     //   51: goto -> 124
        /*    */     //   54: goto -> 93
        /*    */     //   57: astore_0
        /*    */     //   58: goto -> 104
        /*    */     //   61: pop
        /*    */     //   62: aload_3
        /*    */     //   63: astore_0
        /*    */     //   64: goto -> 76
        /*    */     //   67: astore_1
        /*    */     //   68: aload_1
        /*    */     //   69: aload_0
        /*    */     //   70: astore_3
        /*    */     //   71: astore_0
        /*    */     //   72: goto -> 104
        /*    */     //   75: pop
        /*    */     //   76: aload_0
        /*    */     //   77: ldc_w 'ERROR CALCULATING'
        /*    */     //   80: astore_1
        /*    */     //   81: ifnull -> 99
        /*    */     //   84: aload_0
        /*    */     //   85: invokevirtual close : ()V
        /*    */     //   88: goto -> 99
        /*    */     //   91: aload_1
        /*    */     //   92: astore_0
        /*    */     //   93: invokevirtual printStackTrace : ()V
        /*    */     //   96: goto -> 124
        /*    */     //   99: aload_1
        /*    */     //   100: astore_0
        /*    */     //   101: goto -> 124
        /*    */     //   104: aload_3
        /*    */     //   105: ifnull -> 118
        /*    */     //   108: aload_3
        /*    */     //   109: invokevirtual close : ()V
        /*    */     //   112: goto -> 118
        /*    */     //   115: invokevirtual printStackTrace : ()V
        /*    */     //   118: aload_0
        /*    */     //   119: athrow
        /*    */     //   120: ldc_w 'FILE_DOESNT_EXIST'
        /*    */     //   123: astore_0
        /*    */     //   124: aload_0
        /*    */     //   125: areturn
        /*    */     // Line number table:
        /*    */     //   Java source line number -> byte code offset
        /*    */     //   #1	-> 0
        /*    */     //   #2	-> 4
        /*    */     //   #3	-> 14
        /*    */     // Exception table:
        /*    */     //   from	to	target	type
        /*    */     //   32	35	75	java/lang/Exception
        /*    */     //   32	35	67	finally
        /*    */     //   37	43	75	java/lang/Exception
        /*    */     //   37	43	67	finally
        /*    */     //   43	47	61	java/lang/Exception
        /*    */     //   43	47	57	finally
        /*    */     //   48	54	54	java/io/IOException
        /*    */     //   76	80	67	finally
        /*    */     //   84	91	91	java/io/IOException
        /*    */     //   108	115	115	java/io/IOException
        /*    */
    }

    /*    */
    /*    */
    public static String vj0(String paramString, FileInputStream paramFileInputStream) {
        /*    */
        try {
            /*    */
            DigestInputStream digestInputStream;
            /*    */
            BufferedInputStream bufferedInputStream;
            /*    */
            MessageDigest messageDigest = MessageDigest.getInstance(paramString);
            /*    */
            this(paramFileInputStream);
            /*    */
            this(bufferedInputStream, messageDigest);
            /*    */
            byte[] arrayOfByte = new byte[4096];
            /*    */
            while (digestInputStream.read(arrayOfByte) != -1) ;
            /*    */
            return oa0(messageDigest.digest());
            /*    */
        } catch (Exception exception) {
            /*    */
            return "ERROR CALCULATING";
            /*    */
        }
        /*    */
    }

    /*    */
    /*    */
    public static boolean ya(String paramString) {
        /*    */
        this("pokemmo_updater.jar.TEMPORARY");
        /*    */
        InputStream inputStream = null;
        /*    */
        ReadableByteChannel readableByteChannel = null;
        /*    */
        FileOutputStream fileOutputStream = null;
        /*    */
        try {
            /*    */
            FileOutputStream fileOutputStream1;
            /*    */
            inputStream = UK(paramString.replace("\\", "/"));
            /*    */
        } catch (Exception exception) {
            /*    */
            /*    */
        } finally {
            /*    */
            Ui.JC0(inputStream);
            /*    */
            Ui.JC0(readableByteChannel);
            /*    */
            Ui.JC0(fileOutputStream);
            /*    */
        }
        /*    */
        Ui.JC0(inputStream);
        /*    */
        Ui.JC0(readableByteChannel);
        /*    */
        Ui.JC0(fileOutputStream);
        /*    */
    }

    /*    */
    /*    */
    public static String F6(long paramLong) {
        /*    */
        StringBuilder stringBuilder;
        /*    */
        char c;
        /*    */
        if (paramLong < (c = 'Ϩ')) {
            /*    */
            this();
            /*    */
            return (stringBuilder = new StringBuilder()).append(paramLong).append(" B").toString();
            /*    */
        }
        /*    */
        double d1;
        /*    */
        double d2;
        /*    */
        int i = (int) (Math.log(d1 = paramLong) / Math.log(d2 = stringBuilder));
        /*    */
        String str = "kMGTPE".charAt(i - 1) + "";
        /*    */
        Object[] arrayOfObject;
        /*    */
        (arrayOfObject = new Object[2])[0] = Double.valueOf(d1 / Math.pow(d2, i));
        /*    */
        (new Object[2])[1] = str;
        /*    */
        return String.format("%.1f %sB", arrayOfObject);
        /*    */
    }

    /*    */
    /*    */
    public static double ri(int paramInt1, int paramInt2) {
        /*    */
        if (paramInt1 < 1 || paramInt2 < 1)
            /*    */ return 0.0D;
        /*    */
        if (paramInt1 == paramInt2)
            /*    */ return 100.0D;
        /*    */
        double d1 = 10;
        /*    */
        double d2;
        /*    */
        return Math.round(((paramInt1 * 100.0F / paramInt2) - (d2 = (int) (paramInt1 * 100.0F / paramInt2))) * d1) / d1 + d2;
        /*    */
    }

    /*    */
    /*    */
    public static int va0(ByteBuffer paramByteBuffer, int paramInt) {
        /*    */
        int i = paramByteBuffer.position();
        /*    */
        int j = -1;
        /*    */
        if (paramByteBuffer.get() == 16) {
            /*    */
            int k = paramByteBuffer.getShort() & (paramByteBuffer.get() & 0xFF) * 65536 + 65535;
            /*    */
            byte b = paramByteBuffer.get();
            /*    */
            byte b1;
            /*    */
            if ((paramInt != 1 || b > 63 || k < 32 || k % 8 != 0) && (paramInt != (b1 = 2) || (k != 32 && k != 128) || b > 63) && (paramInt != b1 || k != 512))
                /*    */ if (paramInt == 3 && b == 0) {
                /*    */
                System.out.println("CheckLz77Type.PaletteCombo: " + k);
                /*    */
            } else {
                /*    */
                paramByteBuffer.position(i);
                /*    */
                return j;
                /*    */
            }
            /*    */
            j = k;
            /*    */
        }
        /*    */
        paramByteBuffer.position(i);
        /*    */
        return j;
        /*    */
    }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/LF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */