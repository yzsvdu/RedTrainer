/*  1 */ package f;public abstract class fl0 { public static ik Qi0 = C00.gd(fl0.class); public static TreeMap ei0 = new TreeMap<>(); public static String Mi = "log/console.log"; public static void jg0() { RD0[] arrayOfRD0; int i; byte b; for (i = (arrayOfRD0 = UB0.vj0.N0(".").fx(fl0::Xc)).length, b = 0; b < i; ) { boolean bool; RD0 rD0 = arrayOfRD0[b]; if (System.currentTimeMillis() - rD0.tn() > 172800000L) { rD0.La0(); bool = false; } else { try { if (rD0.QM("UTF-8").contains("There is insufficient memory for the Java Runtime Environment to continue")) { bool = false; } else { bool = true; }  } catch (Exception exception) { null.printStackTrace(); bool = false; }  }  if (!bool) { rD0
/*  2 */           .La0(); }
/*  3 */       else { XN xN; u8 u8; String str = Ml0.la(44, "Found error log from previous session.\n\nWould you like to submit an error report?"); LP lP = LP.Od0; this(rD0); this(rD0); km.f70
/*  4 */           .lpt3(Ml0.la(40, "Fatal Render Error"), str, lP, xN, u8, false); }  b++; }
/*  5 */      for (i = (arrayOfRD0 = UB0.vj0.N0(".").fx(fl0::Sn0)).length, b = 0; b < i; ) { boolean bool; RD0 rD0 = arrayOfRD0[b];
/*  6 */       if (System.currentTimeMillis() - rD0.tn() > 172800000L) { rD0.La0(); bool = false; } else { try { if (rD0.QM("UTF-8").contains("There is insufficient memory for the Java Runtime Environment to continue")) { bool = false; } else { bool = true; }  } catch (Exception exception) { null.printStackTrace(); bool = false; }  }  if (!bool) { rD0
/*  7 */           .La0(); }
/*  8 */       else { Qj qj; gq0 gq0; String str = Ml0.la(44, "Found error log from previous session.\n\nWould you like to submit an error report?"); LP lP = LP.Od0; this(rD0); this(rD0); km.f70
/*  9 */           .lpt3(Ml0.la(40, "Fatal Render Error"), str, lP, qj, gq0, false); }  b++; }  } public static hZ Ph(String paramString1, String paramString2) { try { StringWriter stringWriter; wR wR; Qi0.info("Creating error report..."); BB bB; this(bB = BB.nc); this(); this(stringWriter); it.kI = bB; it.oS(wR); it.Qd(); it.Jv0(Integer.valueOf(25385), "revision"); it.Jv0(Boolean.FALSE, "pts"); it.Jv0(Boolean.valueOf(Bz.uD), "dts"); It it; (it = new It()).Jv0(paramString1, "stacktrace"); if (UB0.Kg0 != null) { String str1 = "android"; it.Jv0(Boolean.valueOf((Dp0.Ro0 == Dp0.uM)), str1); }  it.Jv0(yG.x3.O30, "os"); String str = "state"; try { it.q1.Lj0(str); it.Qd(); str = "ingame"; it.Jv0(Boolean.valueOf((km.u4 != null)), str); str = "has_world"; it.Jv0(Boolean.valueOf((km.a3 != null)), str); str = "has_battle"; it.Jv0(Boolean.valueOf((km.MR != null)), str); vh0 vh0; if ((vh0 = km.a3) != null) { String str2 = "region_id"; it
/*    */             
/* 11 */             .Jv0(Byte.valueOf(vh0.eA), str2);
/*    */           
/* 13 */           it.Jv0(Integer.valueOf(km.a3.yD), "player_id"); Jo jo;
/* 14 */           if ((jo = km.a3.Ct) != null)
/* 15 */           { String str3 = "position";
/*    */             
/* 17 */             it.Jv0(jo.HW.j2(), str3); }  }  it.cd0(); String str1 = "environment"; try { it
/* 18 */             .q1.Lj0(str1); it.Qd();
/* 19 */           for (null = ei0.entrySet().iterator(); null.hasNext(); ) { String str3 = (String)((Map.Entry)null.next()).getKey(); it.Jv0(((Map.Entry)null.next()).getValue(), str3); }  it.cd0(); try { File file; FileInputStream fileInputStream; StringBuilder stringBuilder; InputStreamReader inputStreamReader; this(Mi);
/* 20 */             this(file);
/* 21 */             Charset charset = Charset.defaultCharset(); char c;
/* 22 */             char[] arrayOfChar = new char[c = 'Ѐ']; this(); this(fileInputStream, charset); while (true) { int i; if ((i = inputStreamReader.read(arrayOfChar, 0, c)) < 0) { it
/* 23 */                   .Jv0(Xa(stringBuilder.toString()), "console_log"); break; }  stringBuilder
/* 24 */                 .append(arrayOfChar, 0, i); }  } catch (Exception exception) {} if (paramString2 != null) it
/* 25 */               .Jv0(paramString2, "hs_error");  it.Rg("mods");
/* 26 */           for (bx0 bx0 : d00.Je
/* 27 */             .nr0)
/* 28 */           { this(); it1
/* 29 */               .kI = BB.nc;
/* 30 */             it1.oS(wR); it1.Qd(); String str3 = "name";
/*    */             
/* 32 */             it1.Jv0(bx0.aj, str3); str3 = "version";
/*    */             It it1;
/* 34 */             (it1 = new It()).Jv0(bx0.Xq0, str3); (new It()).cd0(); }  it.Rw0(); it.Rg("roms"); P1 p1; if ((p1 = km.mI0) != null)
/*    */           { s40[] arrayOfS40; int i; byte b;
/* 36 */             for (i = (arrayOfS40 = p1.vo).length, b = 0; b < i; ) { it.Qd(); String str3 = "region_id"; it.Jv0(Byte.valueOf(s40.in()), str3); it
/*    */                 
/* 38 */                 .Jv0(s40.coM7 + " v1." + s40.H5, "code"); str3 = "hash"; s40 s40; String str4;
/* 39 */               if ((str4 = (s40 = arrayOfS40[b]).mD) == null) try { MessageDigest.getInstance("SHA-256").update(s40.pr()); s40.mD = str4 = Aq0.A20(MessageDigest.getInstance("SHA-256").digest()); } catch (Exception exception) { str4 = "Error"; }   it
/* 40 */                 .Jv0(str4, str3); it.cd0(); b++; }
/*    */              HI[] arrayOfHI;
/* 42 */             for (i = (arrayOfHI = km.mI0.W40).length, b = 0; b < i; ) { it.Qd(); String str3 = "region_id"; it.Jv0(Byte.valueOf(hI.bO()), str3); it
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */                 
/* 48 */                 .Jv0(hI.qa0.e60.toUpperCase(Locale.ENGLISH) + " v1." + hI.qa0.H50, "code"); str3 = "hash"; HI hI; String str4;
/* 49 */               if ((str4 = (hI = arrayOfHI[b]).WE0) == null) try { MessageDigest.getInstance("SHA-256").update(hI.GA0()); hI.WE0 = str4 = Aq0.A20(MessageDigest.getInstance("SHA-256").digest()); } catch (Exception exception) { str4 = "Error"; }   it
/* 50 */                 .Jv0(str4, str3); it.cd0(); b++; }  }  it.Rw0(); it.cd0();
/*    */ 
/*    */           
/* 53 */           String str2 = it.q1.CoM9.toString(); wR.close(); UB0.vj0.N0("pokemmo_crash_" + System.currentTimeMillis() + ".log").vF0(str2, "UTF-8"); return UB0.vj0.N0("pokemmo_crash_" + System.currentTimeMillis() + ".log"); } catch (IOException iOException)
/* 54 */         { throw new kN(iOException); }  } catch (IOException iOException)
/* 55 */       { throw new kN(iOException); }  } catch (Exception exception)
/* 56 */     { Qi0.error("Error creating error report", exception); return null; }
/*    */      }
/*    */ 
/*    */   
/*    */   public static hZ Xm0(Throwable paramThrowable) {
/*    */     this();
/*    */     StringWriter stringWriter;
/*    */     paramThrowable.printStackTrace(new PrintWriter(stringWriter, true));
/*    */     return Ph(stringWriter.getBuffer().toString(), null);
/*    */   }
/*    */   
/*    */   public static void Kf(RD0 paramRD0, boolean paramBoolean) {
/*    */     if (paramRD0 == null)
/*    */       return; 
/*    */     try {
/*    */       AF0 aF0;
/*    */       Qi0.info("Submitting error report: " + paramRD0.ml.getName());
/*    */       String str1 = paramRD0.QM("UTF-8");
/*    */       try {
/*    */         paramRD0.La0();
/*    */       } catch (Exception exception) {}
/*    */       if (str1.isEmpty())
/*    */         return; 
/*    */       this("POST");
/*    */       xa0.F70 = "https://api.pokemmo.com/submit-error-report/?base64=true";
/*    */       str1 = "Content-Type";
/*    */       String str2 = "application/json";
/*    */       xa0.Hq.put(str1, str2);
/*    */       xa0 xa0;
/*    */       (xa0 = new xa0()).eb0 = ez0.Pa(str1.getBytes(StandardCharsets.UTF_8));
/*    */       (new xa0()).s30 = 60000;
/*    */       Qi0.info("Submitting error report...");
/*    */       this(paramBoolean);
/*    */       UB0.LL0.mx(xa0, aF0);
/*    */     } catch (Exception exception) {
/*    */       Qi0.error("Error submitting error report", exception);
/*    */     } 
/*    */   }
/*    */   
/*    */   public static void m70() {
/*    */     km.n20.rl((byte)6, System.getProperty("java.vendor"));
/*    */     km.n20.rl((byte)7, System.getProperty("java.version"));
/*    */     IJ0("java_vendor", System.getProperty("java.vendor"), "Java Vendor", false);
/*    */     IJ0("java_version", System.getProperty("java.version"), "Java Version", false);
/*    */     IJ0("java_home", System.getProperty("java.home"), "Java Home", true);
/*    */     IJ0("client_home", System.getProperty("user.dir"), "Client Home", true);
/*    */     km.n20.rl((byte)3, System.getProperty("os.name"));
/*    */     km.n20.rl((byte)4, System.getProperty("os.version"));
/*    */     km.n20.rl((byte)5, System.getProperty("os.arch"));
/*    */     IJ0("os_name", System.getProperty("os.name"), "OS name", false);
/*    */     IJ0("os_version", System.getProperty("os.version"), "OS version", false);
/*    */     IJ0("os_arch", System.getProperty("os.arch"), "OS arch", false);
/*    */     IJ0("os_abi", System.getProperty("sun.arch.abi"), "OS abi", false);
/*    */     km.n20.rl((byte)8, System.getProperty("java.runtime.name"));
/*    */     km.n20.rl((byte)9, System.getProperty("java.vm.version"));
/*    */     IJ0("jvm_arch", System.getProperty("sun.arch.data.model"), "JVM arch", false);
/*    */     IJ0("jvm_runtime", System.getProperty("java.runtime.name"), "JVM Runtime", false);
/*    */     IJ0("jvm_version", System.getProperty("java.vm.version"), "JVM version", false);
/*    */     Runtime runtime = Runtime.getRuntime();
/*    */     IJ0("heap_memory_max", (runtime.maxMemory() / 1048576L) + " MB", "Max Heap Memory", false);
/*    */     IJ0("locale", Locale.getDefault().toString(), "Locale", false);
/*    */     IJ0("file_encoding", System.getProperty("file.encoding"), "File Encoding", false);
/*    */     IJ0("libgdx_version", "1.11.0", "Gdx version", false);
/*    */   }
/*    */   
/*    */   public static void CA0(String paramString) {
/*    */     IJ0("jvm_arguments", paramString, "JVM Arguments", false);
/*    */   }
/*    */   
/*    */   public static void IJ0(String paramString1, Object paramObject, String paramString2, boolean paramBoolean) {
/*    */     if (paramObject == null)
/*    */       return; 
/*    */     paramObject = paramObject.toString();
/*    */     if (paramBoolean)
/*    */       paramObject = Xa((String)paramObject); 
/*    */     Qi0.info(paramString2.trim() + ": " + paramObject);
/*    */     ei0.put(paramString1, paramObject);
/*    */   }
/*    */   
/*    */   public static String Xa(String paramString) {
/*    */     return paramString.replaceAll(B40.df("([\\\\/])").append(Pattern.quote(System.getProperty("user.name"))).append("([\\\\/])").toString(), "$1%OS_USERNAME%$2").replaceAll(B40.df("(gdx)").append(Pattern.quote(System.getProperty("user.name"))).append("([\\\\/])").toString(), "$1%OS_USERNAME%$2").replaceAll(B40.df("(USERNAME=)").append(Pattern.quote(System.getProperty("user.name"))).toString(), "$1%OS_USERNAME%");
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/fl0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */