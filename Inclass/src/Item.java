public class Item {
        private String name;
        private double value;
        public Item(String nameIn,double valueIn){
            this.name=nameIn;
            this.value=valueIn;
        }
        public String getName(){
            return this.name;
        }
        public double getValue(){
            return this.value;
        }
    }
