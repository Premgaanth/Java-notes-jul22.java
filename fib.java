package training;

import java.util.*;

public class Project {

  protected static int fibo(int n){

    if(n<=2){

      return 1;

    }

    else{

      return fibo(n-1) + fibo(n-2);

    }

  }
