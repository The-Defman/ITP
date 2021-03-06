public class Musician
{
    private String name;
    private String instrument;
    private int skillLevel;
    
    public Musician(String name, String instrument, int skillLevel) {
        this.name = name;
        this.instrument = instrument;
        this.skillLevel = skillLevel;
    }
    
    public String toString() {
        return String.format("%s, %s (Skill level: %d)", this.name, this.instrument, this.skillLevel);
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getInstrument() {
        return this.instrument;
    }
    
    public int getSkillLevel() {
        return this.skillLevel;
    }
}
