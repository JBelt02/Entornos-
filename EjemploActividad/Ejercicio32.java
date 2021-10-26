int x=0 ;
int fact=1;

do{
    System.out.print("introduce un numero");
    x=s.nextint();

}while(x<=0);

do{
    //fact=fact*x
    //x--;
    fact*=x--;
}while(x>0);
system.out.println(fact);