/* 1 */ package f;public final class fE0 implements D3 { public final Object xr(String paramString1, Field paramField, String paramString2, String paramString3) { try { long l = Long.decode(paramString1).longValue(); if (!paramString2.isEmpty()) l = Math.max(Long.decode(paramString2).longValue(), l);  if (!paramString3.isEmpty()) l = Math.min(Long.decode(paramString3).longValue(), l);  return Long.valueOf(l); } catch (Exception exception) { throw new y8(this); }
/*   */      }
/*   */ 
/*   */   
/*   */   public static final fE0 Po0 = new fE0(); }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/fE0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */