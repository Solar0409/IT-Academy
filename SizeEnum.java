public enum SizeEnum {
    XXS(32) {
        @Override
        public String getDescription() {
            return "Детский размер";
        }
    },

    XS(34){
        @Override
        public String getDescription(){
            return "Подростковый размер";
        }
    }
    ,S(36),M(38),L(40);
private final int euroSize;

    SizeEnum(int euroSize) {
        this.euroSize = euroSize;
    }

     public String getDescription() {
         return "Взрослый размер";
     }


    @Override
    public String toString() {
        return super.toString();
    }

    public int getEuroSize() {
        return euroSize;
    }


}
