 static void convert(String s){

    char [] ch = new char[s.length()];

    for(int i = 0 ;i<ch.length;i++){

      char a = s.charAt(i);

      ch[i] = a;

    }

    String r = new String(ch);

    System.out.println(r);

  }

