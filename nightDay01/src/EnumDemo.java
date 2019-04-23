public class EnumDemo {
    public static void main(String[] args) {
        System.out.println(Seazon.SPRING.toString());
        Seazon.SPRING.showDetail();
    }

}

interface Show{
    void showDetail();
}

enum  Seazon implements Show {
    SPRING ("春天","春暖花开"){
        @Override
        public void showDetail() {
            System.out.println("那又怎么样？");
        }
    },
    AOTUM  ("秋天","秋高气爽"){
        @Override
        public void showDetail() {

        }
    },
     SUMMER("夏天","夏日炎炎") {
         @Override
         public void showDetail() {

         }
     },
     WIND ("冬天","冰天雪地") {
         @Override
         public void showDetail() {

         }
     };
    public final String SeazonName;
    public final String SeazonDesc;
    private Seazon(String seazonName,String seazonDesc){
        this.SeazonName =seazonName;
        this.SeazonDesc =seazonDesc;
    }


    public String getSeazonName() {
        return SeazonName;
    }

    public String getSeazonDesc() {
        return SeazonDesc;
    }


    @Override
    public String toString() {
        return "Seazon{" +
                "SeazonName='" + SeazonName + '\'' +
                ", SeazonDesc='" + SeazonDesc + '\'' +
                '}';
    }

//    @Override
//    public void showDetail() {
//
//    }
}