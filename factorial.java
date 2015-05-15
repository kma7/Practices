public int factorial(int n){
  if(n == 0){
    return 1;
  }
  if(n * factorial(n - 1) > Integer.MAX_VALUE){
    System.out.println("n is too large");
    return 0;
  }
  return n * factorial(n - 1);
}
//Test cases would be:
/*
1, lower edge cases: 0, 1
2, normal input: 5, 6
3. upper edge cases: 13, 14, 15
*/
