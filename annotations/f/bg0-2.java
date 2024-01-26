/* 1 */ package f;public abstract class bg0 { public final ArrayList rk; public static Method Ow(Class paramClass, String paramString) { Method[] arrayOfMethod; int i; byte b; for (i = (arrayOfMethod = paramClass.getMethods()).length, b = 0; b < i; ) { Method method; if (!Modifier.isStatic((method = arrayOfMethod[b]).getModifiers()) && method.getReturnType() != void.class && Modifier.isPublic(method.getDeclaringClass().getModifiers()) && (method.getParameterTypes()).length == 0) { String str1 = "get", str2 = method.getName(); byte b1 = 3; int k = paramString.length(), j = k - 1; if (str2.length() == b1 + k && str2.startsWith(str1) && str2.charAt(b1) == Character.toUpperCase(paramString.charAt(0)) && str2.regionMatches(4, paramString, 1, j)) { j = 1; } else { j = 0; }  if (j == 0)
/* 2 */         { String str = "is";
/* 3 */           str2 = method.getName(); b1 = 2; k = paramString.length(); int m = k - 1; if (str2.length() == b1 + k && str2.startsWith(str) && str2.charAt(b1) == Character.toUpperCase(paramString.charAt(0)) && str2.regionMatches(3, paramString, 1, m)) { m = 1; } else { m = 0; }  if (m != 0) return method;  } else { return method; }  }  b++; }  return null; }
/* 4 */   public final HashMap Ud0; public bg0() { ArrayList arrayList; HashMap<Object, Object> hashMap; JT jT; dD dD; this(); this.rk = this; this(); this.Ud0 = this; this(); Hi0("min", this); this(); Hi0("max", this); } public static boolean X5(Number paramNumber) { return paramNumber instanceof Integer ^ true; } public final void Hi0(String paramString, wk0 paramwk0) { this.Ud0.put(paramString, paramwk0); } public final Object gt0(Class paramClass, String paramString) { this.rk.clear(); int i = (new SB(paramString, this)).Id(true); if (this.rk.size() == i) { if (i == 1 && paramClass.isInstance(this.rk.get(0))) return paramClass.cast(this.rk.get(0));  Constructor[] arrayOfConstructor; int j; byte b; for (j = (arrayOfConstructor = (Constructor[])paramClass.getConstructors()).length, b = 0; b < j; ) { Constructor<?> constructor; Class[] arrayOfClass; if ((arrayOfClass = (constructor = arrayOfConstructor[b]).getParameterTypes()).length == i) { boolean bool; byte b1; for (bool = true, b1 = 0; b1 < i; ) { Class clazz1 = arrayOfClass[b1]; Class clazz2; if ((clazz2 = (Class)Ne0.rD.get(clazz1)) != null) clazz1 = clazz2;  Object object; if (!(((object = this.rk.get(b1)) == null && !clazz1.isPrimitive()) ? 1 : clazz1
/* 5 */               .isInstance(object))) { bool = false; break; }  b1++; }  if (bool)
/* 6 */             try { return paramClass.cast(constructor.newInstance(this.rk.toArray(new Object[i]))); } catch (Exception exception) { Logger.getLogger(bg0.class.getName()).log(Level.SEVERE, "can't instantiate object", exception); }   }  b++; }  throw new IllegalArgumentException("Can't construct a " + paramClass + " from expression: \"" + paramString + "\""); }  throw new IllegalStateException("Expected " + i + " return values on the stack"); }
/*   */ 
/*   */   
/*   */   public final Number tp() {
/*   */     int i;
/*   */     if ((i = this.rk.size()) != 0) {
/*   */       String str;
/*   */       if (this = this.rk.remove(i - 1) instanceof Number)
/*   */         return (Number)this; 
/*   */       IllegalStateException illegalStateException = new IllegalStateException();
/*   */       StringBuilder stringBuilder = B40.df("expected number on stack - found: ");
/*   */       if (this != null) {
/*   */         Class<?> clazz = getClass();
/*   */       } else {
/*   */         str = "null";
/*   */       } 
/*   */       this(stringBuilder.append(this).toString());
/*   */       throw illegalStateException;
/*   */     } 
/*   */     throw new IllegalStateException("stack underflow");
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/bg0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */