/* 1 */ package f;public final class Uz0 implements D3 { public final Object xr(String paramString1, Field paramField, String paramString2, String paramString3) { try { double d = Double.parseDouble(paramString1); if (!paramString2.isEmpty()) d = Math.max(Double.parseDouble(paramString2), d);  if (!paramString3.isEmpty()) d = Math.min(Double.parseDouble(paramString3), d);  return Double.valueOf(d); } catch (Exception exception) { throw new y8(this); }
/*   */      }
/*   */ 
/*   */   
/*   */   public static final Uz0 ZN = new Uz0(); }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Uz0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */