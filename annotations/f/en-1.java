/* 1 */ package f;public final class en implements tV { private static final long serialVersionUID = -2849567615646933777L; public final String r; public final boolean ww(tV paramtV) { if (paramtV != null) { boolean bool; if (equals(paramtV)) return true;  if (this.Gf.size() > 0) { bool = true; } else { bool = false; }  if (bool)
/* 2 */         for (Iterator iterator = this.Gf.iterator(); hasNext();) { if (((en)next()).ww(paramtV)) return true;  }   return false; }  throw new IllegalArgumentException("Other cannot be null"); } public final CopyOnWriteArrayList Gf; public en(String paramString) { CopyOnWriteArrayList copyOnWriteArrayList; this(); this.Gf = copyOnWriteArrayList; if (paramString != null) { this.r = paramString; return; }  throw new IllegalArgumentException("A marker name cannot be null"); } public final boolean Gg(String paramString) { if (paramString != null) { boolean bool; if (this.r.equals(paramString)) return true;  if (this.Gf.size() > 0) { bool = true; } else { bool = false; }  if (bool) for (Iterator iterator = this.Gf.iterator(); hasNext();) { if (((en)next()).Gg(paramString)) return true;  }   return false; }  throw new IllegalArgumentException("Other cannot be null"); } public final boolean equals(Object paramObject) { if (this == paramObject) return true;  if (paramObject == null) return false;  if (!(paramObject instanceof tV)) return false;  tV tV1 = (tV)paramObject; return this.r.equals(((en)this).r); } public final int hashCode() { return this.r.hashCode(); } public final String toString() { if (this.Gf.size() > 0) { bool = true; } else { bool = false; }  if (!bool) return this.r; 
/* 3 */     Iterator iterator = this.Gf.iterator();
/*   */ 
/*   */     
/* 6 */     this(this.r); boolean bool; StringBuilder stringBuilder; (new StringBuilder()).append(' ').append("[ "); while (iterator.hasNext()) { stringBuilder
/*   */         
/* 8 */         .append(((en)iterator.next()).r); if (iterator.hasNext()) stringBuilder.append(", ");  }  stringBuilder.append(" ]"); return stringBuilder.toString(); }
/*   */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/en.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */