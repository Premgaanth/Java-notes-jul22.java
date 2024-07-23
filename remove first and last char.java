 static void remove(String s){

     StringBuffer sb = new StringBuffer();

     for(int i=0;i<s.length();i++){

       if(i == 0 || i == s.length()-1){

         continue;

       }

       else{

         char ch = s.charAt(i);

         sb.append(ch);

       }

     }

     System.out.println(sb.toString());

  }
