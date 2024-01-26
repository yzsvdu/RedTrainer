/* 1 */ package f;public final class tp extends TF0 { public tp(Mw paramMw1, Mw paramMw2) {} public final Object COm7(It paramIt, bM0 parambM0) { for (parambM0 = parambM0.Rr0; parambM0 != null;) { 
/* 2 */       try { String str = parambM0.as0;
/*   */         Class<?> clazz;
/* 4 */         if ((clazz = (Class)paramIt.B80.pd0(str)) == null)
/*   */         { String str1; 
/* 6 */           try { clazz = Class.forName(str1 = parambM0.as0); } catch (ClassNotFoundException classNotFoundException) { throw new BC("Class not found: " + clazz, this); }  }  super
/* 7 */           .mS(paramIt, parambM0, clazz); parambM0 = parambM0.H7; } catch (BC bC) { throw new kN(this); }  }  return ((tp)super).sg; } public final void mS(It paramIt, bM0 parambM0, Class<mx> paramClass) { Class<mx> clazz; if (paramClass == mx.class) { Class<ES> clazz1 = ES.class; } else { clazz = paramClass; }  parambM0 = parambM0.Rr0; while (true) { if (parambM0 != null) { Object object; if ((object = paramIt.Uj0(paramClass, null, parambM0)) != null) { try { this.iw0.DQ(clazz, object, parambM0.as0); if (clazz != ES.class && ES.class.isAssignableFrom(clazz)) { String str = parambM0.as0; this.iw0.DQ(ES.class, object, str); }  parambM0 = parambM0.H7; } catch (Exception exception) { throw new kN(B40.df("Error reading ").append(paramClass.getSimpleName()).append(": ").append(parambM0.as0).toString(), this); }
/*   */           
/*   */           continue; }
/*   */          }
/*   */       else
/*   */       { break; }
/*   */       
/*   */       parambM0 = parambM0.H7; }
/*   */      }
/*   */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/tp.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */