/* 1 */ package f;public final class gb0 implements D3 { public final Object xr(String paramString1, Field paramField, String paramString2, String paramString3) { try { float f = Float.parseFloat(paramString1); if (!paramString2.isEmpty()) f = Math.max(Float.parseFloat(paramString2), f);  if (!paramString3.isEmpty()) f = Math.min(Float.parseFloat(paramString3), f);  return Float.valueOf(f); } catch (Exception exception) { throw new y8(this); }
/*   */      }
/*   */ 
/*   */   
/*   */   public static final gb0 J1 = new gb0(); }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/gb0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */