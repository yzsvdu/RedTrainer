/*   */ package f;public enum R00 { public static R00 ep0(byte paramByte) {
/* 2 */     return (R00)Objects.<Object>requireNonNull(Jx0.Ha0(paramByte), B40.df("Undefined ").append(R00.class.getSimpleName()).append(" ").append(paramByte).toString());
/*   */   }
/*   */   
/*   */   public static final ak Jx0;
/*   */   public final byte zM;
/*   */   
/*   */   R00(String paramString) {
/*   */     this.zM = this$enum$name;
/*   */   }
/*   */   
/*   */   static {
/*   */     this((byte)0, 0, "BASE_STAT_AND_CURRENT_BATTLE_STAT");
/*   */     R00 r001;
/*   */     R00 r002;
/*   */     R00 r003;
/*   */     this((byte)1, 1, "BASE_STATS_WITH_BATTLE_MOD");
/*   */     this((byte)2, 2, "RANDOMS_SPEED_MINMAX");
/*   */     AH = new R00[] { r001, r002, r003 };
/*   */     Jx0 = new ak();
/*   */     R00[] arrayOfR00;
/*   */     int i = (arrayOfR00 = values()).length;
/*   */     for (byte b = 0; b < i; b++) {
/*   */       R00 r00 = arrayOfR00[b];
/*   */       Jx0.VF(r00.zM, r00);
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/R00.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */