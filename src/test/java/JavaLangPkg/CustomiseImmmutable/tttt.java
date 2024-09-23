package JavaLangPkg.CustomiseImmmutable;

public class tttt {

    int i;

    public tttt(int i)
    {
      this.i=i;
    }


    public tttt modify(int i){
      if(this.i==i){
          return this;
      }else{
          return (new tttt( i));
      }
    }


}
