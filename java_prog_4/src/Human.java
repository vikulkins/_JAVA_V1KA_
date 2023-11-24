public class Human {
    public Head head;
    public Leg rightLeg, leftLeg;
    public Hand rightHand, leftHand;

    public Human(){
        this.head = new Head(10, 20);
        this.leftHand = new Hand(30,7);
        this.rightHand = new Hand(30,9);
        this.leftLeg = new Leg(70,17);
        this.rightLeg = new Leg(70,19);
    }

    public int getWeight(){
        return this.head.weight + this.leftHand.weight + this.rightHand.weight + this.leftLeg.weight + this.rightLeg.weight;
    }
    public int getHeight(){
        return this.head.size + this.leftHand.length + this.leftLeg.length;
    }

    public String toString(){
        return "рост: " + this.getHeight() + " вес: " + this.getWeight();
    }
}
