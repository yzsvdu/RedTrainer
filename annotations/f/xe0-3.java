/* 1 */ package f;public final class xe0 implements D3 { public final Object xr(String paramString1, Field paramField, String paramString2, String paramString3) { try { byte b = Byte.decode(paramString1).byteValue(); if (!paramString2.isEmpty()) b = (byte)Math.max(Byte.decode(paramString2).byteValue(), b);  if (!paramString3.isEmpty()) b = (byte)Math.min(Byte.decode(paramString3).byteValue(), b);  return Byte.valueOf(b); } catch (Exception exception) { throw new y8(this); }
/*   */      }
/*   */ 
/*   */   
/*   */   public static final xe0 const = new xe0(); }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/xe0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */