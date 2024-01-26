/*  1 */ package f;public final class rn0 { public static void Xl0() { String str; Q50 q50; f7 f71; if ((f71 = Q4).GB0(UB0.Kg0)) return;  UB0.Kg0.getClass(); if (Dp0.Ro0 == 
/*  2 */       Dp0.uM) { str = "com.badlogic.gdx.controllers.android.AndroidControllers"; } else { str = "com.badlogic.gdx.controllers.desktop.JamepadControllerManager"; }  try { Class<?> clazz; try { f71
/*    */ 
/*    */           
/*  5 */           .X00(UB0.Kg0, (clazz = Class.forName(str)).newInstance()); (q50 = UB0.Kg0).QS(new xA0(q50)); UB0.Kg0
/*    */           
/*  7 */           .HC("Controllers", B40.df("added manager for application, ").append(f71.Cx0).append(" managers active").toString()); return; }
/*  8 */       catch (InstantiationException instantiationException) { throw new BC("Could not instantiate instance of class: " + clazz.getName(), instantiationException); } catch (IllegalAccessException illegalAccessException) { throw new BC("Could not instantiate instance of class: " + clazz.getName(), illegalAccessException); }  } catch (ClassNotFoundException classNotFoundException)
/*  9 */     { throw new BC("Class not found: " + q50, classNotFoundException); }
/* 10 */     finally {} throw new JU(
/* 11 */         m0.tF0("Error creating controller manager: ", q50), f71); }
/*    */ 
/*    */   
/*    */   public static final f7 Q4 = new f7(); }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/rn0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */