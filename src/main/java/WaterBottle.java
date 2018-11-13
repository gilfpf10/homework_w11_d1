public class WaterBottle {

    public int volume;

        public WaterBottle(int volume){
            this.volume = volume;
}

public int drink(){
    if (this.volume > 0) {
        this.volume -= 10;
    }
    return this.volume;
}


public int empty(){
    if (this.volume > 0) {
        this.volume = 0;
    }
    return this.volume;
}

public int full(){
            if(this.volume >100){
                this.volume = 100;
            }
            return this.volume;
}

}
