/* 1 */ package f;public final class kj0 extends It { public kj0(Mw paramMw) {} public final Object Uj0(Class<?> paramClass1, Class paramClass2, bM0 parambM0) { if (parambM0 != null) { boolean bool; if (parambM0.eR == nc.O80) { bool = true; } else { bool = false; }  if (bool && 
/* 2 */         !CharSequence.class.isAssignableFrom(paramClass1))
/* 3 */         return this.qp.Oz0(paramClass1, parambM0.DX());  }  return super.Uj0(paramClass1, paramClass2, parambM0); } public final void for(Object paramObject, bM0 parambM0) { if (parambM0.Ua("parent")) { bM0 bM01 = parambM0.Jb("parent"); String str = (String)Uj0(String.class, null, bM01); Class<?> clazz = paramObject.getClass(); while (true) { try { PH0(this.qp.Oz0(clazz, str), paramObject); } catch (JU jU) { if ((clazz = clazz.getSuperclass()) != Object.class) continue;  (new kN(m0.tF0("Unable to find parent resource with name: ", str)))
/* 4 */             .K7(parambM0.Rr0.in()); throw new kN(m0.tF0("Unable to find parent resource with name: ", str)); }  break; }  }  super.for(paramObject, parambM0); }
/*   */ 
/*   */   
/*   */   public final boolean fa(String paramString) {
/*   */     return paramString.equals("parent");
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/kj0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */