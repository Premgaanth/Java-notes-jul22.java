 static void palindrom(String str){

    char ch[] = str.toCharArray();

    int left=0,right=ch.length-1;

    while(left<right){

      char temp = ch[left];

      ch[left] = ch[right];

      ch[right] = temp;

      left++;right--;

    }

    String res = new String(ch);

    //System.out.println(res);

    if(str.equals(res)){

      System.out.println("Palindrome");

    }

    else{

      System.out.println("Not Palindrome");

    }

  }


