/* 1 */ package f;public final class xI implements D3 { public final Object xr(String paramString1, Field paramField, String paramString2, String paramString3) { try { short s = Short.decode(paramString1).shortValue(); if (!paramString2.isEmpty()) s = (short)Math.max(Short.decode(paramString2).shortValue(), s);  if (!paramString3.isEmpty()) s = (short)Math.min(Short.decode(paramString3).shortValue(), s);  return Short.valueOf(s); } catch (Exception exception) { throw new y8(this); }
/*   */      }
/*   */ 
/*   */   
/*   */   public static final xI Qs0 = new xI(); }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/xI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */