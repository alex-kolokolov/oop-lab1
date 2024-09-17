class MyFirstClass {
    public static void main(String[] args) {

        MySecondClass o = new MySecondClass(1, 2);
        
        System.out.println(o.logOpXOR());

        
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                o.setFirstValue(i);
                o.setSecondValue(j);
                System.out.print(o.logOpXOR());
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

class MySecondClass {
    private int firstValue;
    private int secondValue;

    public MySecondClass(int firstValue, int secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }


    public void setFirstValue(int firstValue) {
        this.firstValue = firstValue;
    }

    public void setSecondValue(int secondValue) {
        this.secondValue = secondValue;
    }


    public int getFirstValue() {
        return firstValue;
    }

    public int getSecondValue() {
        return secondValue;
    }


    public int logOpXOR() {
        return firstValue ^ secondValue;
    }
}