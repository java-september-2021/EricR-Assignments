public class Human {
    private int strength;
    private int stealth;
    private int intelligence;
    private int health;

    public Human(){
        this.strength = 3;
        this.stealth = 3;
        this.intelligence = 3;
        this.health = 100;
    }

    public void setStrength(int strength){
        this.strength = strength;
    }

    public void setIntelligence(int intelligence){
        this.intelligence = intelligence;
    }

    public void setStealth(int stealth){
        this.stealth = stealth;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public int getHealth(){
        return this.health;
    }

    public int getStrength(){
        return this.strength;
    }
    public int getIntelligence(){
        return this.intelligence;
    }
    public int getStealth(){
        return this.stealth;
    }
    
    public void attack(Human enemy){
        int damage;
        damage = this.strength;

        int enemyHealth = enemy.getHealth();
        enemyHealth -= damage;
        enemy.setHealth(enemyHealth);

        System.out.printf("You attack the enemy for %d health points", damage);
    }
}
