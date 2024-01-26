/* 1 */ package f;public final class Cv implements Comparator { public final int compare(Object paramObject1, Object paramObject2) { sM sM = (sM)paramObject1; paramObject1 = paramObject2; int i; if ((i = this.h9 - ((sM)paramObject1).h9) == 0)
/* 2 */     { int j; if ((i = this.ui0) != (j = ((sM)paramObject1).ui0) || (
/* 3 */         i = this.qu) != (j = ((sM)paramObject1).qu)) { i = j - i; }
/* 4 */       else { i = ((sM)paramObject1).m2 - this.m2; }  }  return i; }
/*   */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Cv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */