/*  1 */ package f;public abstract class C00 { public static volatile int cJ = 0; public static final N7 ha; public static final X60 Fp; public static void Yt(ArrayList<BV> paramArrayList, Iterator<BV> paramIterator) { try { paramArrayList.add(paramIterator.next()); } catch (ServiceConfigurationError serviceConfigurationError)
/*  2 */     { z2.MJ(B40.df("A SLF4J service provider failed to instantiate:\n").append(serviceConfigurationError.getMessage()).toString()); }  } public static boolean jU; public static volatile BV Wk0; public static final String[] yq; public static ServiceLoader Zj0(ClassLoader paramClassLoader) { return (System.getSecurityManager() == null) ? ServiceLoader.<BV>load(BV.class, paramClassLoader) : AccessController.<ServiceLoader>doPrivileged(paramClassLoader::ch); } public static final void UA() { try { ArrayList<BV> arrayList; this(); for (Iterator iterator = Zj0(C00.class.getClassLoader()).iterator(); iterator.hasNext(); Yt(arrayList, iterator)); j70(arrayList); if (!arrayList.isEmpty()) { Wk0 = arrayList.get(0); Wk0.initialize(); cJ = 3;
/*  3 */         if (!arrayList.isEmpty() && (
/*  4 */           (arrayList.size() > 1)))
/*  5 */           z2.MJ("Actual provider is of type [" + arrayList.get(0) + "]");  }
/*  6 */       else { LinkedHashSet<URL> linkedHashSet; cJ = 4; z2.MJ("No SLF4J providers were found."); z2.MJ("Defaulting to no-operation (NOP) logger implementation"); z2.MJ("See https://www.slf4j.org/codes.html#noProviders for further details.");
/*  7 */         this(); try { ClassLoader classLoader; if ((classLoader = C00.class.getClassLoader()) == null) {  } else {  }  for (Enumeration<URL> enumeration = classLoader.getResources("org/slf4j/impl/StaticLoggerBinder.class"); enumeration.hasMoreElements(); linkedHashSet.add(enumeration.nextElement())); } catch (IOException iOException) { z2.SZ("Error getting resources from path", iOException); }
/*  8 */          S(linkedHashSet); }  ih0();
/*  9 */       if (cJ == 3)
/* 10 */         try { String str; boolean bool; String[] arrayOfString; int i; byte b; for (str = Wk0.getRequestedApiVersion(), bool = false, i = (arrayOfString = yq).length, b = 0; b < i; ) { if (str.startsWith(arrayOfString[b])) bool = true;  b++; }  } catch (NoSuchFieldError noSuchFieldError) {  } finally { arrayList = null; }   return; } catch (Exception exception)
/* 11 */     { cJ = 2; z2.SZ("Failed to instantiate SLF4J LoggerFactory", exception);
/* 12 */       throw new IllegalStateException("Unexpected initialization failure", exception); }  } public static void S(LinkedHashSet paramLinkedHashSet) { if (paramLinkedHashSet.isEmpty()) return;  z2.MJ("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier."); Iterator<URL> iterator = paramLinkedHashSet.iterator(); while (iterator.hasNext())
/*    */       z2.MJ("Ignoring binding found at [" + (URL)iterator.next() + "]");  z2.MJ("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation."); }
/*    */   public static void ih0() { N7 n7; int i; synchronized (ha) { ArrayList<?> arrayList; ha.N8.mO = true; Yv yv; (yv = ha.N8).getClass(); for (Iterator<?> iterator = (new ArrayList(yv.li0.values())).iterator(); iterator.hasNext();)
/* 15 */         ((sl0)iterator.next()).tr0 = R4(((sl0)iterator.next()).EY);  LinkedBlockingQueue<?> linkedBlockingQueue; int j = (linkedBlockingQueue = ha.N8.db0).size(); i = 0; this(128); while (true) { if (linkedBlockingQueue.drainTo(arrayList, 128) == 0) {
/*    */           
/* 17 */           ha.N8
/* 18 */             .li0
/* 19 */             .clear(); ha.N8.db0.clear(); return;
/* 20 */         }  for (Iterator<?> iterator1 = arrayList.iterator(); iterator1.hasNext(); ) { Dl0 dl0; if ((dl0 = (Dl0)iterator1.next()) != null)
/*    */           { sl0 sl0;
/* 22 */             String str = (sl0 = dl0.Pj).EY;
/* 23 */             if (!((dl0.Pj.tr0 == null) ? 1 : 0))
/* 24 */             { if (!(sl0.tr0 instanceof F0)) { t60 t60; if (sl0
/* 25 */                   .jN())
/* 26 */                 { t60 = dl0.f60;
/* 27 */                   if (sl0.I10().isEnabledForLevel(t60) && sl0
/* 28 */                     .jN()) try { sl0.S40.invoke(sl0.tr0, new Object[] { dl0 }); } catch (IllegalAccessException illegalAccessException) {  } catch (IllegalArgumentException illegalArgumentException) {  } catch (InvocationTargetException invocationTargetException) {}  }
/* 29 */                 else { z2.MJ((String)t60); }
/*    */                 
/*    */                  }
/*    */               
/*    */                }
/*    */             
/*    */             else
/*    */             
/* 37 */             { throw new IllegalStateException("Delegate logger cannot be null at this state."); }  }  if (i++ == 0) { if (dl0.Pj.jN()) { z2.MJ("A number (" + j + ") of logging calls during the initialization phase have been intercepted and are"); z2.MJ("now being replayed. These are subject to the filtering rules of the underlying logging system."); z2.MJ("See also https://www.slf4j.org/codes.html#replay"); continue; }  if (dl0.Pj.tr0 instanceof F0) continue;  z2.MJ("The following set of substitute loggers may have been accessed"); z2.MJ("during the initialization phase. Logging calls during this"); z2.MJ("phase were not honored. However, subsequent logging calls to these"); z2.MJ("loggers will work as normally expected."); z2.MJ("See also https://www.slf4j.org/codes.html#substituteLogger"); }  }  arrayList
/* 38 */           .clear(); }
/*    */        }
/*    */      }
/*    */ 
/*    */   
/*    */   public static void j70(ArrayList paramArrayList) {
/*    */     if ((paramArrayList.size() > 1)) {
/*    */       z2.MJ("Class path contains multiple SLF4J providers.");
/*    */       for (Iterator<BV> iterator = paramArrayList.iterator(); iterator.hasNext(); z2.MJ("Found provider [" + (BV)iterator.next() + "]"));
/*    */       z2.MJ("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
/*    */     } 
/*    */   }
/*    */   
/*    */   public static ik R4(String paramString) {
/*    */     return Rs0().getLoggerFactory().getLogger(paramString);
/*    */   }
/*    */   
/*    */   public static ik gd(Class<?> paramClass) {
/*    */     ik ik = R4(paramClass.getName());
/*    */     if (jU) {
/*    */       Class clazz;
/*    */       PI0 pI0;
/*    */       if ((pI0 = z2.QV) == null)
/*    */         if (z2.EO) {
/*    */           pI0 = null;
/*    */         } else {
/*    */           try {
/*    */             this();
/*    */           } catch (SecurityException securityException) {
/*    */             pI0 = null;
/*    */           } 
/*    */           z2.QV = pI0;
/*    */           z2.EO = true;
/*    */         }  
/*    */       if (pI0 == null) {
/*    */         pI0 = null;
/*    */       } else {
/*    */         Class[] arrayOfClass;
/*    */         String str;
/*    */         byte b;
/*    */         for (arrayOfClass = pI0.getClassContext(), str = z2.class.getName(), b = 0; b < arrayOfClass.length && !str.equals(arrayOfClass[b].getName()); b++);
/*    */         int i;
/*    */         if (b < arrayOfClass.length && (i = b + 2) < arrayOfClass.length) {
/*    */           clazz = arrayOfClass[i];
/*    */         } else {
/*    */           throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
/*    */         } 
/*    */       } 
/*    */       if (clazz != null && (clazz.isAssignableFrom(paramClass) ^ true) != 0) {
/*    */         arrayOfObject[0] = ik.getName();
/*    */         Object[] arrayOfObject;
/*    */         (arrayOfObject = new Object[2])[1] = clazz.getName();
/*    */         z2.MJ(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", arrayOfObject));
/*    */         z2.MJ("See https://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
/*    */       } 
/*    */     } 
/*    */     return ik;
/*    */   }
/*    */   
/*    */   public static T8 vL0() {
/*    */     return Rs0().getLoggerFactory();
/*    */   }
/*    */   
/*    */   public static BV Rs0() {
/*    */     if (cJ == 0)
/*    */       synchronized (C00.class) {
/*    */         if (cJ == 0) {
/*    */           cJ = 1;
/*    */           UA();
/*    */         } 
/*    */       }  
/*    */     switch (cJ) {
/*    */       default:
/*    */         throw new IllegalStateException("Unreachable code");
/*    */       case 4:
/*    */         return Fp;
/*    */       case 3:
/*    */         return Wk0;
/*    */       case 2:
/*    */         throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit");
/*    */       case 1:
/*    */         break;
/*    */     } 
/*    */     return ha;
/*    */   }
/*    */   
/*    */   static {
/*    */     // Byte code:
/*    */     //   0: new f/N7
/*    */     //   3: dup
/*    */     //   4: invokespecial <init> : ()V
/*    */     //   7: putstatic f/C00.ha : Lf/N7;
/*    */     //   10: new f/X60
/*    */     //   13: dup
/*    */     //   14: invokespecial <init> : ()V
/*    */     //   17: putstatic f/C00.Fp : Lf/X60;
/*    */     //   20: ldc_w 'slf4j.detectLoggerNameMismatch'
/*    */     //   23: aconst_null
/*    */     //   24: astore_0
/*    */     //   25: invokestatic getProperty : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   28: astore_0
/*    */     //   29: goto -> 33
/*    */     //   32: pop
/*    */     //   33: aload_0
/*    */     //   34: ifnonnull -> 42
/*    */     //   37: iconst_0
/*    */     //   38: istore_0
/*    */     //   39: goto -> 50
/*    */     //   42: aload_0
/*    */     //   43: ldc_w 'true'
/*    */     //   46: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
/*    */     //   49: istore_0
/*    */     //   50: iload_0
/*    */     //   51: putstatic f/C00.jU : Z
/*    */     //   54: iconst_1
/*    */     //   55: anewarray java/lang/String
/*    */     //   58: dup
/*    */     //   59: iconst_0
/*    */     //   60: ldc_w '2.0'
/*    */     //   63: aastore
/*    */     //   64: putstatic f/C00.yq : [Ljava/lang/String;
/*    */     //   67: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 25
/*    */     //   #2	-> 43
/*    */     //   #3	-> 51
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   25	28	32	java/lang/SecurityException
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/C00.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */