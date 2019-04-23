public class enumDemo {

    /**
     *使用enum关键词定义枚举类
     * 默认继承自class java.lang.Enum,tostring默认打印的是对象的枚举的名字
     */


    public static void main(String[] args) {
        Season spring = Season.SPRING;
        System.out.println(spring);
        System.out.println(Season.class.getSuperclass());

    }

  enum  Season {
         SPRING("春天", "春暖花开1"),
        SUMMER ("夏天", "春暖花开2"),
        AUTOM ("秋天", "春暖花开3"),
        WINDS ("冬天", "春暖花开4");


        private final String SeazonName;
        private final String SeaznDesc;

//        @Override
//        public String toString() {
//            return "Season{" +
//                    "SeazonName='" + SeazonName + '\'' +
//                    ", SeaznDesc='" + SeaznDesc + '\'' +
//                    '}';
//        }

        public String getSeazonName() {
            return SeazonName;
        }

        public String getSeaznDesc() {
            return SeaznDesc;
        }

        Season(String seazonName, String seaznDesc) {
            SeazonName = seazonName;
            SeaznDesc = seaznDesc;
        }

    }
}
