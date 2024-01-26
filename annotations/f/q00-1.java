/*  1 */ package f;public final class q00 { public static boolean PG = System.getProperty("os.name").contains("Windows"); public static boolean Sk = System.getProperty("os.name").contains("Linux"); public static boolean Ar = System.getProperty("os.name").contains("Mac"); public static boolean Ov0 = false; public static boolean Dz = false; public static boolean No = false; public static String Mk(String paramString) { StringBuilder stringBuilder; if (PG) { String str; stringBuilder = B40.df(paramString);
/*  2 */       if (return) { str = "64.dll"; } else { str = ".dll"; }  return stringBuilder.append(str).toString(); }  if (Sk)
/*  3 */     { String str; stringBuilder = zw.vz("lib", (String)stringBuilder);
/*  4 */       if (No) { str = "arm"; } else { str = ""; }  stringBuilder = stringBuilder.append(str); if (return) { str = "64.so"; } else { str = ".so"; }  return stringBuilder.append(str).toString(); }  if (Ar)
/*  5 */     { String str; stringBuilder = zw.vz("lib", (String)stringBuilder);
/*  6 */       if (No) { str = "arm"; } else { str = ""; }  stringBuilder = stringBuilder.append(str); if (return) { str = "64.dylib"; } else { str = ".dylib"; }  return stringBuilder.append(str).toString(); }  return (String)stringBuilder; } public static boolean return = false; public static final HashSet JE0 = new HashSet(); public String xo0; public q00() {} public q00(String paramString) { this.xo0 = paramString; } public static void Wt0(Closeable paramCloseable) { if (paramCloseable != null) try { paramCloseable.close(); } finally {}  } public final void eE0(String paramString) { InputStream inputStream; if ((inputStream = LPT4(paramString)) != null) { File file1; String str1; CRC32 cRC32; File file2, file3; this(); byte[] arrayOfByte = new byte[4096]; try {  } catch (Exception exception) {  } finally { Wt0(inputStream); }  Wt0(inputStream); String str2 = (new File(paramString)).getName(); this(System.getProperty("java.io.tmpdir") + "/libgdx" + System.getProperty("user.name") + "/" + str1, str2); try { System.load(yd(paramString, str1 = Long.toString(cRC32.getValue(), 16), file2).getAbsolutePath()); file2 = null; } finally {} if (file2 == null) return;  try { File file; if ((file = File.createTempFile(str1, null)).delete()) { try { System.load(yd(paramString, str1, file).getAbsolutePath()); file = null; } finally {} if (file == null) return;  }  } finally {} this(System.getProperty("user.home") + "/.libgdx/" + str1, str2); 
/*  7 */       try { System.load(yd(paramString, str1, file3).getAbsolutePath()); file3 = null; } finally {} if (file3 == null) {
/*    */         return;
/*    */       }
/* 10 */       this(m0.tF0(".temp/", str1), str2); 
/* 11 */       try { System.load(yd(paramString, str1, this).getAbsolutePath()); file1 = null; } finally {} if (this == null)
/* 12 */         return;  this(System.getProperty("java.library.path"), paramString); if ((new File()).exists()) { System.load(getAbsolutePath()); return; }  throw new Cm0(file2); }
/* 13 */      throw new IllegalArgumentException("input cannot be null."); }
/*    */ 
/*    */   
/*    */   public final void fG(String paramString) {
/*    */     // Byte code:
/*    */     //   0: getstatic f/q00.Ov0 : Z
/*    */     //   3: ifeq -> 7
/*    */     //   6: return
/*    */     //   7: ldc f/q00
/*    */     //   9: dup
/*    */     //   10: astore_2
/*    */     //   11: monitorenter
/*    */     //   12: ldc f/q00
/*    */     //   14: dup
/*    */     //   15: astore_3
/*    */     //   16: monitorenter
/*    */     //   17: getstatic f/q00.JE0 : Ljava/util/HashSet;
/*    */     //   20: dup
/*    */     //   21: astore #4
/*    */     //   23: aload_1
/*    */     //   24: invokevirtual contains : (Ljava/lang/Object;)Z
/*    */     //   27: aload_3
/*    */     //   28: monitorexit
/*    */     //   29: ifeq -> 35
/*    */     //   32: aload_2
/*    */     //   33: monitorexit
/*    */     //   34: return
/*    */     //   35: aload_1
/*    */     //   36: invokestatic Mk : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   39: astore_3
/*    */     //   40: getstatic f/q00.Dz : Z
/*    */     //   43: ifeq -> 53
/*    */     //   46: aload_3
/*    */     //   47: invokestatic loadLibrary : (Ljava/lang/String;)V
/*    */     //   50: goto -> 58
/*    */     //   53: aload_0
/*    */     //   54: aload_3
/*    */     //   55: invokevirtual eE0 : (Ljava/lang/String;)V
/*    */     //   58: aload_2
/*    */     //   59: ldc f/q00
/*    */     //   61: dup
/*    */     //   62: astore_0
/*    */     //   63: aload #4
/*    */     //   65: aload_0
/*    */     //   66: monitorenter
/*    */     //   67: aload_1
/*    */     //   68: invokevirtual add : (Ljava/lang/Object;)Z
/*    */     //   71: pop
/*    */     //   72: monitorexit
/*    */     //   73: monitorexit
/*    */     //   74: return
/*    */     //   75: aload_0
/*    */     //   76: monitorexit
/*    */     //   77: athrow
/*    */     //   78: astore_0
/*    */     //   79: new f/Cm0
/*    */     //   82: astore_1
/*    */     //   83: new java/lang/StringBuilder
/*    */     //   86: dup
/*    */     //   87: invokespecial <init> : ()V
/*    */     //   90: ldc 'Couldn't load shared library ''
/*    */     //   92: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   95: aload_3
/*    */     //   96: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   99: ldc '' for target: '
/*    */     //   101: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   104: astore_3
/*    */     //   105: getstatic f/q00.Dz : Z
/*    */     //   108: ifne -> 188
/*    */     //   111: new java/lang/StringBuilder
/*    */     //   114: dup
/*    */     //   115: invokespecial <init> : ()V
/*    */     //   118: ldc 'os.name'
/*    */     //   120: invokestatic getProperty : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   123: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   126: astore #4
/*    */     //   128: getstatic f/q00.No : Z
/*    */     //   131: ifeq -> 141
/*    */     //   134: ldc ', ARM'
/*    */     //   136: astore #5
/*    */     //   138: goto -> 146
/*    */     //   141: ldc ''
/*    */     //   143: goto -> 136
/*    */     //   146: aload #4
/*    */     //   148: aload #5
/*    */     //   150: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   153: astore #4
/*    */     //   155: getstatic f/q00.return : Z
/*    */     //   158: ifeq -> 168
/*    */     //   161: ldc ', 64-bit'
/*    */     //   163: astore #5
/*    */     //   165: goto -> 173
/*    */     //   168: ldc ', 32-bit'
/*    */     //   170: goto -> 163
/*    */     //   173: aload #4
/*    */     //   175: aload #5
/*    */     //   177: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   180: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   183: astore #4
/*    */     //   185: goto -> 193
/*    */     //   188: ldc 'Android'
/*    */     //   190: goto -> 183
/*    */     //   193: aload_1
/*    */     //   194: dup
/*    */     //   195: aload_3
/*    */     //   196: aload #4
/*    */     //   198: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   201: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   204: aload_0
/*    */     //   205: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */     //   208: athrow
/*    */     //   209: astore_0
/*    */     //   210: aload_0
/*    */     //   211: aload_3
/*    */     //   212: monitorexit
/*    */     //   213: athrow
/*    */     //   214: astore_0
/*    */     //   215: aload_0
/*    */     //   216: aload_2
/*    */     //   217: monitorexit
/*    */     //   218: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 17
/*    */     //   #2	-> 33
/*    */     //   #3	-> 68
/*    */     //   #4	-> 73
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   12	14	214	finally
/*    */     //   16	17	214	finally
/*    */     //   17	20	209	finally
/*    */     //   23	27	209	finally
/*    */     //   27	29	214	finally
/*    */     //   32	34	214	finally
/*    */     //   35	39	214	finally
/*    */     //   40	43	78	finally
/*    */     //   46	61	78	finally
/*    */     //   63	67	78	finally
/*    */     //   67	71	75	finally
/*    */     //   72	73	78	finally
/*    */     //   73	74	214	finally
/*    */     //   75	78	78	finally
/*    */     //   79	82	214	finally
/*    */     //   83	104	214	finally
/*    */     //   105	108	214	finally
/*    */     //   111	126	214	finally
/*    */     //   128	131	214	finally
/*    */     //   134	136	214	finally
/*    */     //   141	153	214	finally
/*    */     //   155	158	214	finally
/*    */     //   161	163	214	finally
/*    */     //   168	183	214	finally
/*    */     //   188	209	214	finally
/*    */     //   210	214	214	finally
/*    */     //   215	218	214	finally
/*    */   }
/*    */   
/*    */   public final InputStream LPT4(String paramString) {
/*    */     InputStream inputStream;
/*    */     if (this.xo0 == null) {
/*    */       if ((inputStream = q00.class.getResourceAsStream("/" + paramString)) != null)
/*    */         return this; 
/*    */       throw new Cm0(m0.tF0("Unable to read file for extraction: ", paramString));
/*    */     } 
/*    */     try {
/*    */       this(((q00)super).xo0);
/*    */       ZipFile zipFile;
/*    */       ZipEntry zipEntry;
/*    */       if ((zipEntry = (zipFile = new ZipFile()).getEntry(paramString)) != null)
/*    */         return zipFile.getInputStream(zipEntry); 
/*    */       throw new Cm0("Couldn't find '" + paramString + "' in JAR: " + super.xo0);
/*    */     } catch (IOException iOException) {
/*    */       throw new Cm0("Error reading '" + paramString + "' in JAR: " + super.xo0, iOException);
/*    */     } 
/*    */   }
/*    */   
/*    */   public final File yd(String paramString1, String paramString2, File paramFile) {
/*    */     IOException iOException;
/*    */     String str = null;
/*    */     if (paramFile.exists())
/*    */       try {
/*    */         FileInputStream fileInputStream;
/*    */         CRC32 cRC32;
/*    */         this(paramFile);
/*    */         this();
/*    */         byte[] arrayOfByte = new byte[4096];
/*    */         try {
/*    */         
/*    */         } catch (Exception exception) {
/*    */         
/*    */         } finally {
/*    */           Wt0(fileInputStream);
/*    */         } 
/*    */         Wt0(fileInputStream);
/*    */         str = Long.toString(cRC32.getValue(), 16);
/*    */       } catch (FileNotFoundException fileNotFoundException) {} 
/*    */     if (str == null || !str.equals(paramString2)) {
/*    */       FileOutputStream fileOutputStream;
/*    */       this = null;
/*    */       paramString2 = null;
/*    */       try {
/*    */         FileOutputStream fileOutputStream1;
/*    */         InputStream inputStream = LPT4(paramString1);
/*    */         paramFile.getParentFile().mkdirs();
/*    */         this(paramFile);
/*    */         try {
/*    */           byte[] arrayOfByte = new byte[4096];
/*    */           while (true) {
/*    */             int i;
/*    */             if ((i = read(arrayOfByte)) == -1) {
/*    */               Wt0(this);
/*    */               return paramFile;
/*    */             } 
/*    */             fileOutputStream1.write(arrayOfByte, 0, i);
/*    */           } 
/*    */         } catch (IOException null) {
/*    */           throw new Cm0("Error extracting file: " + paramString1 + "\nTo: " + paramFile.getAbsolutePath(), iOException);
/*    */         } finally {
/*    */           paramString1 = null;
/*    */         } 
/*    */       } catch (IOException iOException1) {
/*    */         FileOutputStream fileOutputStream1 = fileOutputStream;
/*    */         iOException = iOException1;
/*    */       } finally {}
/*    */     } else {
/*    */       return paramFile;
/*    */     } 
/*    */     throw new Cm0("Error extracting file: " + paramString1 + "\nTo: " + paramFile.getAbsolutePath(), iOException);
/*    */   }
/*    */   
/*    */   static {
/*    */     boolean bool;
/*    */   }
/*    */   
/*    */   static {
/*    */     if (System.getProperty("os.arch").startsWith("arm") || System.getProperty("os.arch").startsWith("aarch64")) {
/*    */     
/*    */     } else {
/*    */     
/*    */     } 
/*    */   }
/*    */   
/*    */   static {
/*    */     if (System.getProperty("os.arch").contains("64") || System.getProperty("os.arch").startsWith("armv8")) {
/*    */     
/*    */     } else {
/*    */     
/*    */     } 
/*    */   }
/*    */   
/*    */   static {
/*    */     if (System.getProperty("moe.platform.name") != null) {
/*    */       bool = true;
/*    */     } else {
/*    */       bool = false;
/*    */     } 
/*    */     String str;
/*    */     if ((str = System.getProperty("java.runtime.name")) != null && str.contains("Android Runtime")) {
/*    */       Dz = true;
/*    */       PG = false;
/*    */       Sk = false;
/*    */       Ar = false;
/*    */       return = false;
/*    */     } 
/*    */     if (bool || (!Dz && !PG && !Sk && !Ar)) {
/*    */       Ov0 = true;
/*    */       Dz = false;
/*    */       PG = false;
/*    */       Sk = false;
/*    */       Ar = false;
/*    */       return = false;
/*    */     } 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/q00.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */