/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package march.madness.bracket.picker;

/**
 *
 * @author jword
 */
public class Team {
//Fields
    private String name;
    private int seed;
    private String region;
//Constructors
    public Team(String name, int seed, String region) {
        this.name = name;
        this.seed = seed;
        this.region = region;
        System.out.println(name + " created");
    }
    
//Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeed() {
        return seed;
    }

    public void setSeed(int seed) {
        this.seed = seed;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    //Methods
    
}
