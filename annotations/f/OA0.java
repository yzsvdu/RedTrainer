/* 1 */ package f;public final class OA0 implements Comparator { public final int compare(Object paramObject1, Object paramObject2) { int i; byte b1; int j; byte b2; paramObject1 = paramObject2; sM sM; if ((paramObject2 = (sM = (sM)paramObject1).Jc0) == null) { j = 1; } else { j = 0; }  iQ iQ; if ((iQ = ((sM)paramObject1).Jc0) == null) { b2 = 1; } else { b2 = 0; }  if (j != b2) { if (iQ == null) { i = 0; } else { i = 1; }  if (paramObject2 == null) { b1 = 0; } else { b1 = 1; }  i -= b1; }
/* 2 */     else { int k; if ((k = this.qu) != (j = b1.qu)) { i = j - k; }
/* 3 */       else { i = b1.m2 - this.m2; }  }  return i; }
/*   */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/OA0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */