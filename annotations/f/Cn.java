/*  1 */ package f;public final class Cn extends UA { public Cn() { super("hoohanimtest"); } public final void Vt(String[] paramArrayOfString) { if (paramArrayOfString.length < 3) { UA.Ue(">hoohanimtest [team_id] [slot_id]"); return; }  if (km.MR == null || km.wI0.K7 == null)
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 25 */       UA.Ue("Must be in battle"); return; }  try { byte b1 = Byte.parseByte(paramArrayOfString[1]); b1 = (byte)nx0.Uw0(b1, 0, 1); byte b2 = (byte)nx0.Uw0(Byte.parseByte(paramArrayOfString[2]), 0, km.MR.rx.coM9(b1) - 1); ((vH)km.wI0.K7).jv0.end(); ((vH)km.wI0.K7).jv0.SJ0.yi0(); hm0 hm0 = km.MR.N0(b1, b2); eo eo; (eo = this.rF0.He0).getClass(); km.wI0.K7.LW.t80(new HC0(km.wI0.K7.LW, this, this.K0.hp0)); return; } catch (Exception exception) { null.printStackTrace();
/*    */       return; }
/*    */      }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Cn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */