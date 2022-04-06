public class HW_6_1 {

    public class Block{
        int width;
        int length;
        int height;

        Block(int[] arr){
            width = arr[0];
            length = arr[1];
            height = arr[2];
        }
        int getWidth(){
            return this.width;
        }

        int getLength(){
            return this.length;
        }

        int getHeight(){
            return this.height;
        }

        int getVolume(){
            return this.width*this.length*this.height;
        }

        int getSurfaceArea(){
            return 2*(this.width*this.length+this.width*this.height+ this.height*this.length);
        }
    }


    public class Cube{
        private int side;

        public int getSide() {
            return side;
        }

        public void setSide(int side) {
            this.side = side;
        }
    }

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        if (firstAttacker.equals(fighter1.name)){
            while (fighter2.health >0 && fighter1.health >0){
                fighter2.health = fighter2.health -fighter1.damagePerAttack;
                if (fighter2.health<0){
                    break;
                }
                fighter1.health = fighter1.health -fighter2.damagePerAttack;
                if (fighter1.health<0){
                    break;
                }
            }
        } else{
            while (fighter2.health >0 && fighter1.health >0){
                fighter1.health = fighter1.health -fighter2.damagePerAttack;
                if (fighter1.health<0){
                    break;
                }
                fighter2.health = fighter2.health -fighter1.damagePerAttack;
                if (fighter2.health<0){
                    break;
                }
            }
        }
        if (fighter1.health>0){
            return fighter1.name;
        } else {
            return fighter2.name;
        }
    }

    public class Fighter {
        public String name;
        public int health, damagePerAttack;
        public Fighter(String name, int health, int damagePerAttack) {
            this.name = name;
            this.health = health;
            this.damagePerAttack = damagePerAttack;
        }
    }

}
