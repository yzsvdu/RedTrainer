/* 1 */ package f;public abstract class b1 { public static ik Ve0 = C00.gd(b1.class); public static Method nS = null; public static Method COM1 = null; public static Method pv0 = null; public static Method IO = null; public static Object com2 = null; public static Method yU = null, Bm = null; public static Method FB(String paramString1, String paramString2) { try { return (Method)paramString1; } finally { null; }  } static { String str = "theUnsafe"; try { Class.forName("sun.misc.Unsafe").getDeclaredField(str).setAccessible(true); } finally { null; }
/* 2 */      if ((com2 = str) != null) { Class[] arrayOfClass; (arrayOfClass = new Class[1])[0] = ByteBuffer.class; try {  }
/*   */       finally { null; }
/* 4 */        yU = (Method)arrayOfClass; }  if (yU == null) { nS = FB("sun.nio.ch.DirectBuffer", "cleaner"); COM1 = FB("sun.misc.Cleaner", "clean"); if ((pv0 = FB("sun.nio.ch.DirectBuffer", "viewedBuffer")) == null) pv0 = FB("sun.nio.ch.DirectBuffer", "attachment");  IO = FB("org.apache.harmony.nio.internal.DirectBuffer", "free"); Bm = FB("java.nio.DirectByteBuffer", "free"); }
/*   */      }
/*   */ 
/*   */   
/*   */   public static boolean El0(Buffer paramBuffer) {
/*   */     if (!paramBuffer.isDirect())
/*   */       return false; 
/*   */     try {
/*   */       Object object;
/*   */       Method method;
/*   */       if ((method = yU) != null) {
/*   */         object = com2;
/*   */         Object[] arrayOfObject;
/*   */         (arrayOfObject = new Object[1])[0] = paramBuffer;
/*   */         method.invoke(object, arrayOfObject);
/*   */         return true;
/*   */       } 
/*   */       if ((method = IO) != null) {
/*   */         method.invoke(paramBuffer, new Object[0]);
/*   */         return true;
/*   */       } 
/*   */       if ((method = Bm) != null) {
/*   */         method.invoke(paramBuffer, new Object[0]);
/*   */         return true;
/*   */       } 
/*   */       if ((method = nS) == null)
/*   */         method = FB(paramBuffer.getClass().getName(), "cleaner"); 
/*   */       if (method == null) {
/*   */         object = Ve0;
/*   */       } else if ((object = object.invoke(paramBuffer, new Object[0])) != null) {
/*   */         Method method1;
/*   */         if ((method1 = COM1) == null) {
/*   */           String str1;
/*   */           if (object instanceof Runnable) {
/*   */             str1 = Runnable.class.getName();
/*   */           } else {
/*   */             str1 = object.getClass().getName();
/*   */           } 
/*   */           String str2 = "clean";
/*   */           method1 = FB(str1, str2);
/*   */         } 
/*   */         if (method1 == null) {
/*   */           object = Ve0;
/*   */         } else {
/*   */           method1.invoke(object, new Object[0]);
/*   */           return true;
/*   */         } 
/*   */       } else {
/*   */         if ((object = pv0) == null)
/*   */           object = FB(paramBuffer.getClass().getName(), "viewedBuffer"); 
/*   */         if (object == null) {
/*   */           object = Ve0;
/*   */         } else {
/*   */           if ((object = object.invoke(paramBuffer, new Object[0])) != null) {
/*   */             if (object instanceof Buffer)
/*   */               return El0((Buffer)object); 
/*   */           } else {
/*   */             object = Ve0;
/*   */           } 
/*   */           return false;
/*   */         } 
/*   */       } 
/*   */       String str = "Can't release direct buffer: " + paramBuffer;
/*   */     } catch (Exception exception) {
/*   */       Ve0.warn("Can't release direct buffer: " + paramBuffer, exception);
/*   */     } 
/*   */     return false;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/b1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */