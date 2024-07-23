static void count(String s){

    StringBuffer sb = new StringBuffer();

    for(int i =0 ;i<2;i++){

      char ch = s.charAt(i);

      sb.append(ch);

    }

    String str = sb.toString();

    sb.setLength(0);

    for(int i=0;i<s.length();i++){

      sb.append(str);

    }

    System.out.println(sb);

  }
