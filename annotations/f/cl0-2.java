/* 1 */ package f;public class cl0 { public static boolean KK(ArrayList paramArrayList) { this(); StringBuilder stringBuilder1, stringBuilder2; this(); byte b = 0; for (nt nt : paramArrayList) { if (b) { stringBuilder1.append(","); stringBuilder2.append(","); }  stringBuilder1
/* 2 */         .append(nt.sG);
/*   */       
/* 4 */       stringBuilder2.append(ez0.Pa(nt.D8)); b++; }  Ww = stringBuilder1.toString(); B00 = stringBuilder2.toString();
/* 5 */     return Cq.RG0((new File(Bz.CN, "savedcredentials.properties")).getAbsolutePath(), cl0.class); }
/*   */ 
/*   */   
/*   */   @mB0(key = "client.saved_credentials.usernames", defaultValue = "")
/*   */   public static String Ww;
/*   */   @mB0(key = "client.saved_credentials.keys", defaultValue = "")
/*   */   public static String B00;
/*   */   @mB0(key = "client.saved_credentials.lastusername", defaultValue = "")
/*   */   public static String Nt;
/*   */   
/*   */   public static ArrayList kt0() {
/*   */     this();
/*   */     ArrayList<nt> arrayList;
/*   */     String[] arrayOfString1 = Ww.split(",");
/*   */     String[] arrayOfString2 = B00.split(",");
/*   */     for (byte b = 0; b < arrayOfString1.length && b < arrayOfString2.length; b++) {
/*   */       if (!arrayOfString1[b].isEmpty() && !arrayOfString2[b].isEmpty()) {
/*   */         nt nt;
/*   */         String str = arrayOfString1[b];
/*   */         this(str, arrayOfString2[b]);
/*   */         arrayList.add(nt);
/*   */       } 
/*   */     } 
/*   */     return arrayList;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/cl0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */