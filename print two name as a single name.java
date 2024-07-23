 static void concat(String s){

    StringBuffer sb = new StringBuffer();

    char a=' ',b=' ';

    int count = 0;

    for(int i=0;i<s.length();i++){

      char ch = s.charAt(i);

      if(ch == ',' || ch == ' '){

        //sb.append(" ");

        a = sb.charAt(i-1);

        b = s.charAt(i+1);

        if(a == b){

          i++;

          count++;

        }

      }

      else{

        sb.append(ch);

      }

    }

    if(count !=0){

      System.out.println(sb.toString().toLowerCase());

    }

    else{

      System.out.println(sb.toString().toLowerCase());

    }

  }
