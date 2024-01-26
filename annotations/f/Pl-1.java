/*  1 */ package f;public abstract class Pl { public static Properties[] k40(File paramFile) { byte b1; String[] arrayOfString1; (arrayOfString1 = new String[b1 = 1])[0] = "properties"; String[] arrayOfString2; byte b2;
/*  2 */     for (arrayOfString2 = new String[1], b2 = 0; b2 < b1; ) { arrayOfString2[b2] = 
/*  3 */         B40.df(".")
/*  4 */         .append(arrayOfString1[b2]).toString(); b2++; }
/*    */     
/*  6 */     this(arrayOfString2); File[] arrayOfFile; LJ0 lJ0;
/*  7 */     Xh0 xh0 = Xh0.BH;
/*  8 */     if (paramFile.isDirectory()) {
/*  9 */       ArrayList<Fj> arrayList1; LinkedList linkedList; ay0 ay0; ArrayList<Fj> arrayList2, arrayList3; byte b3; Fj[] arrayOfFj; (arrayOfFj = new Fj[b3 = 2])[0] = lJ0; ZF0 zF0 = ZF0.cOM8;
/* 10 */       this(zF0); (new Fj[b3 = 2])[1] = ay0;
/*    */       
/* 12 */       RA rA2 = new RA();
/* 13 */       this(b3); for (byte b5 = 0; b5 < b3; ) { Fj fj; if ((fj = arrayOfFj[b5]) != null) { arrayList3.add(fj); b5++; continue; }  throw new IllegalArgumentException("The filter[" + b5 + "] is null"); }
/* 14 */        this(arrayList3);
/* 15 */       (arrayOfFj = new Fj[b3 = 2])[0] = xh0; (new Fj[b3 = 2])[1] = zF0;
/* 16 */       RA rA1 = new RA();
/* 17 */       this(b3); byte b4; for (b4 = 0; b4 < b3; ) { Fj fj; if ((fj = arrayOfFj[b4]) != null) { arrayList1.add(fj); b4++; continue; }  throw new IllegalArgumentException("The filter[" + b4 + "] is null"); }
/* 18 */        this(arrayList1);
/* 19 */       this(); (arrayOfFj = new Fj[b3 = 2])[0] = rA2; (new Fj[b3 = 2])[1] = rA1;
/* 20 */       QA qA = new QA();
/* 21 */       this(b3); for (b4 = 0; b4 < b3; ) { Fj fj; if ((fj = arrayOfFj[b4]) != null) { arrayList2.add(fj); b4++; continue; }  throw new IllegalArgumentException("The filter[" + b4 + "] is null"); }
/* 22 */        this(arrayList2);
/* 23 */       A2.pg(linkedList, paramFile, qA); int i;
/*    */       Properties[] arrayOfProperties;
/* 25 */       for (arrayOfProperties = new Properties[i = (arrayOfFile = (File[])linkedList.toArray((Object[])new File[0])).length], b3 = 0; b3 < i; ) { Properties properties; FileInputStream fileInputStream; InputStreamReader inputStreamReader; File file = arrayOfFile[b3];
/* 26 */         this(file); this(); this(fileInputStream); (new Properties()).load(inputStreamReader); (new FileInputStream()).close(); arrayOfProperties[b3] = properties;
/* 27 */         b3++; }  return arrayOfProperties;
/* 28 */     }  throw new IllegalArgumentException("Parameter 'directory' is not a directory: " + arrayOfFile); }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Pl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */