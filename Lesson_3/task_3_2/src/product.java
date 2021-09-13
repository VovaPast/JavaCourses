class product {
    private  int allweight;
    private  int value;
    private String name;


    public product(int allweight,int value, String name){
        this.allweight = allweight;
        this.value = value;
        this.name = name;
    }

    public int getAllWeight(){
        return allweight;
    }
    public int getValue(){
        return value;
    }
    public String getName(){
        return name;
    }


    public String toString(){
        return name ;
    }


}
