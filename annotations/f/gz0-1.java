/*  1 */ package f;public final class gz0 extends UA { public gz0() { super("spawnparticletest"); } public final void Vt(String[] paramArrayOfString) { if (paramArrayOfString.length < 3) { UA.Ue(">spawnparticletest [particle_id] [team_id] [slot_id]"); return; }  if (km.MR == null || km.wI0.K7 == null)
/*    */     
/*    */     { 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 18 */       UA.Ue("Must be in battle"); return; }  try { x70 x70; mA mA = mA.qq(Byte.parseByte(paramArrayOfString[1])); byte b1 = Byte.parseByte(paramArrayOfString[2]); b1 = (byte)nx0.Uw0(b1, 0, 1); byte b2 = (byte)nx0.Uw0(Byte.parseByte(paramArrayOfString[3]), 0, km.MR.rx.coM9(b1) - 1); ((vH)km.wI0.K7).jv0.end(); ((vH)km.wI0.K7).jv0.SJ0.yi0(); this(km.MR, this, km.MR.N0(b1, b2)); km.wI0.K7.LW.YP.add(x70); return; } catch (Exception exception) { null.printStackTrace();
/*    */       return; }
/*    */      }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/gz0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */