/* 1 */ package f;public final class x90 extends Lc { public final N00 wy; public x90(Class paramClass, int paramInt1, int paramInt2) { super(paramInt1, paramInt2); if ((this.wy = zn0(paramClass)) != null) return;  throw new RuntimeException(B40.df("Class cannot be created (missing no-arg constructor): ")
/* 2 */         .append(paramClass.getName()).toString()); } public x90(Class paramClass) { this(paramClass, 16, 2147483647); } public x90(Class paramClass, int paramInt) { this(paramClass, paramInt, 2147483647); } public static N00 zn0(Class paramClass) { try { return LPt8.nA(paramClass); } catch (Exception exception) { boolean bool; Class[] arrayOfClass = null; try { bool = true; (new N00(paramClass.getDeclaredConstructor(arrayOfClass))).hx0.setAccessible(bool); return new N00(paramClass.getDeclaredConstructor(arrayOfClass)); }
/* 3 */       catch (SecurityException securityException) { throw new BC("Security violation while getting constructor for class: " + bool.getName(), securityException); } catch (NoSuchMethodException noSuchMethodException) { throw new BC("Constructor not found for class: " + bool.getName(), noSuchMethodException); } catch (BC bC) {} return null; }
/*   */      } public final Object newObject() { try { return this.wy.qC(null); }
/* 5 */     catch (Exception exception) { throw new JU(B40.df("Unable to create new instance: ").append(this.wy.hx0.getDeclaringClass().getName()).toString(), exception); }
/*   */      }
/*   */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/x90.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */