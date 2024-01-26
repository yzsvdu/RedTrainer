/* 1 */ package f;public final class Jj0 implements Comparable { public final int ah; public final int Jo0; public final boolean equals(Object paramObject) { if (paramObject instanceof Jj0) { paramObject = paramObject; U40[] arrayOfU40; if (this.ah != ((Jj0)paramObject).ah || this.Jo0 != ((Jj0)paramObject).Jo0 || (arrayOfU40 = this.Uu).length != ((Jj0)paramObject).Uu.length || this.mM != ((Jj0)paramObject).mM) return false;  int i; byte b; for (i = arrayOfU40.length, b = 0; b < i; ) { U40 u40 = arrayOfU40[b]; boolean bool1 = false, bool2 = false; U40[] arrayOfU401; if ((arrayOfU401 = ((Jj0)paramObject).Uu).length > 0) { arrayOfU401[bool2].getClass(); u40.getClass(); bool1 = true; }  if (!bool1) return false;  b++; }  return true; }  return false; } public final int mM; public U40[] Uu; public Jj0(int paramInt1, int paramInt2, U40[] paramArrayOfU40, int paramInt3) { this.ah = paramInt1; this.Jo0 = paramInt2; this.mM = paramInt3; this.Uu = paramArrayOfU40; } public final int compareTo(Object paramObject) { int i; if ((i = ((Jj0)(paramObject = paramObject)).Jo0 - this.Jo0) == 0) i = this.mM - ((Jj0)paramObject).mM;  return i; }
/*   */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Jj0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */