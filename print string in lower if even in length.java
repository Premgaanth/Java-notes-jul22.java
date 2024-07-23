static void oddOrEven(String s){

    StringBuffer sb = new StringBuffer();

    if(s.length() % 2 == 0){

      for(int i=0;i<s.length()/2 ;i++){

        char ch = s.charAt(i);

        sb.append(ch);

      }

      System.out.println(sb.toString());

    }

    else{

      System.out.println("null");

    }
  }
