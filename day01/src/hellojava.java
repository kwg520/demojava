public class hellojava {
    /**
     * 枚举类的使用，1.类的对象是有限的，确定的，称之为枚举类
     *当需要定义一组常量时，推荐使用枚举类
     * 如果枚举类中需要的对象只有一个，则可以用单例的方式实现
     *
     */

    public static void main(String[] args) {
        Season my =Season.AUTOM;
        System.out.println(my.getSeaznDesc());
        System.out.println(my.getSeazonName());
        System.out.println(my);

    }

    public static class Season {
        private final String SeazonName;
        private final String SeaznDesc;

        @Override
        public String toString() {
            return "Season{" +
                    "SeazonName='" + SeazonName + '\'' +
                    ", SeaznDesc='" + SeaznDesc + '\'' +
                    '}';
        }

        public String getSeazonName() {
             return SeazonName;
         }

         public String getSeaznDesc() {
             return SeaznDesc;
         }

         public Season(String seazonName, String seaznDesc) {
            SeazonName = seazonName;
            SeaznDesc = seaznDesc;
        }

        public static final Season SPRING = new Season("春天", "春暖花开1");
        public static final Season SUMMER = new Season("夏天", "春暖花开2");
        public static final Season AUTOM = new Season("秋天", "春暖花开3");
        public static final Season WINDS = new Season("冬天", "春暖花开4");


    }

}
