
/**
 * An animation of cell mitosis.
 *
 * @Anna Lieb
 * @Pd. 3 Bio - 6/16/19
 */
public class Mitosis
{
    /**
     * Constructor for objects of class MitosisStdDraw_AL
     */
    public Mitosis()
    {
        // set the scale of the coordinate system
        StdDraw.setXscale(-1.0, 1.0);
        StdDraw.setYscale(-1.0, 1.0);
    }

    /**
     * Models prophase, the first phase of mitosis. 
     */
    public String prophase()
    {
        StdDraw.clear(StdDraw.WHITE);
        // draw the cell
        StdDraw.setPenColor(255,241,153);
        StdDraw.filledCircle(0, 0, .8);
        // draw the nucleus
        StdDraw.setPenColor(147,188,255);
        StdDraw.filledCircle(-.1, 0, .5);
        // chromosomes
        StdDraw.picture(0, .04, "chromosome.png");
        StdDraw.picture(-.2, -.1, "chromosome.png");
        StdDraw.picture(.17, -.09, "chromosome.png");
        // centrioles
        StdDraw.picture(.5, .5, "centriole.png"); 
        StdDraw.picture(.6, .25, "centriole.png"); 
        
        StdDraw.show(600); 
        
        StdDraw.clear(StdDraw.WHITE);
        // draw the cell
        StdDraw.setPenColor(255,241,153);
        StdDraw.filledCircle(0, 0, .8);
        // draw the nucleus
        StdDraw.setPenColor(190,180,190);
        StdDraw.filledCircle(-.1, 0, .5);
        // chromosomes
        StdDraw.picture(0, .04, "chromosome.png");
        StdDraw.picture(-.2, -.1, "chromosome.png");
        StdDraw.picture(.17, -.09, "chromosome.png");
        // centrioles
        StdDraw.picture(.2, .6, "centriole.png"); 
        StdDraw.picture(.3, -.5, "centriole.png"); 
        
        StdDraw.show(600); 
        
        StdDraw.clear(StdDraw.WHITE);
        // draw the cell
        StdDraw.setPenColor(255,241,153);
        StdDraw.filledCircle(0, 0, .8);
        // draw the nucleus
        StdDraw.setPenColor(200,195,160);
        StdDraw.filledCircle(-.1, 0, .5);
        // chromosomes
        StdDraw.picture(0, .04, "chromosome.png");
        StdDraw.picture(-.2, -.1, "chromosome.png");
        StdDraw.picture(.17, -.09, "chromosome.png");
        // centrioles
        StdDraw.picture(.1, .6, "centriole.png"); 
        StdDraw.picture(0, -.6, "centriole.png");
        
        StdDraw.show(600);
        
        StdDraw.clear(StdDraw.WHITE);
        // draw the cell
        StdDraw.setPenColor(255,241,153);
        StdDraw.filledCircle(0, 0, .8);    // nucleus has been broken down
        // chromosomes
        StdDraw.picture(0, .04, "chromosome.png");
        StdDraw.picture(-.2, -.1, "chromosome.png");
        StdDraw.picture(.17, -.09, "chromosome.png");
        // centrioles
        StdDraw.picture(.1, .6, "centriole.png"); 
        StdDraw.picture(.1, -.6, "centriole.png");
        // spindle fibers
        StdDraw.picture(.1, .2, "spindlefibers.png");
        
        StdDraw.show(600);
        
        return "PROPHASE: \n - The chromosomes start to condense and the mitotic spindle begins to form. \n - The spindle grows between the centrosomes as they move apart. \n - The nucleus breaks down and the mitotic spindle begins to organize the chromosomes. \n";
    }

    /**
     * Models metaphase, the second phase of mitosis, in text. 
     */
    public String metaphase()
    {
        StdDraw.clear(StdDraw.WHITE);
        // draw the cell
        StdDraw.setPenColor(255,241,153);
        StdDraw.filledCircle(0, 0, .8);    // nucleus has been broken down
        // chromosomes
        StdDraw.picture(0, .14, "horizchromosome.png");
        StdDraw.picture(-.2, 0, "horizchromosome.png");
        StdDraw.picture(.17, .01, "horizchromosome.png");
        // centrioles
        StdDraw.picture(.09, .63, "centriole.png"); 
        StdDraw.picture(.1, -.6, "centriole.png");
        // spindle fibers
        StdDraw.picture(.1, .2, "spindlefibers2.png");
        
        StdDraw.show(700);
        
        StdDraw.clear(StdDraw.WHITE);
        // draw the cell
        StdDraw.setPenColor(255,241,153);
        StdDraw.filledCircle(0, 0, .8);    // nucleus has been broken down
        // chromosomes
        StdDraw.picture(0, .1, "horizchromosome.png");
        StdDraw.picture(-.3, .1, "horizchromosome.png");
        StdDraw.picture(.3, .1, "horizchromosome.png");
        // centrioles
        StdDraw.picture(.09, .63, "centriole.png"); 
        StdDraw.picture(.1, -.6, "centriole.png");
        // spindle fibers
        StdDraw.picture(.1, .2, "spindlefibers2.png");
        
        StdDraw.show(700);
        
        return "METAPHASE: \n - The spindle has captured all the chromosomes and lined them up at the middle of the cell, ready to divide. \n - The two kinetochores of each chromosome are attached to microtubules from opposite spindle poles.\n";
    }

    /**
     * Models anaphase, the third phase of mitosis, in text. 
     */
    public String anaphase()
    {
        StdDraw.clear(StdDraw.WHITE);
        // draw the cell
        StdDraw.setPenColor(255,241,153);
        StdDraw.filledCircle(0, 0, .8);    // nucleus has been broken down
        // chromosomes
        StdDraw.picture(0, .3, "rightChromatid.png");
        StdDraw.picture(0, -.2, "leftChromatid.png");
        StdDraw.picture(-.3, .3, "rightChromatid.png");
        StdDraw.picture(-.3, -.2, "leftChromatid.png");
        StdDraw.picture(.3, .3, "rightChromatid.png");
        StdDraw.picture(.3, -.2, "leftChromatid.png");
        // centrioles
        StdDraw.picture(.09, .63, "centriole.png"); 
        StdDraw.picture(.1, -.6, "centriole.png");
        // spindle fibers
        StdDraw.picture(.1, .2, "spindlefibers3.png");
        
        StdDraw.show(700);
        
        return "ANAPHASE: \n - The sister chromatids separate from each other and are pulled towards opposite ends of the cell. \n - Microtubules not attached to chromosomes elongate and push apart, separating the poles and making the cell longer. \n";
    }

    /**
     * Models telophase, the fourth and final phase of mitosis, in text. 
     */
    public String telophase()
    {
        StdDraw.clear(StdDraw.WHITE);
        // draw the cell
        StdDraw.setPenColor(255,241,153);
        StdDraw.filledCircle(0, 0, .8);    // nucleus has been broken down
        // chromosomes
        StdDraw.picture(0, .35, "rightChromatid.png");
        StdDraw.picture(0, -.25, "leftChromatid.png");
        StdDraw.picture(-.2, .3, "rightChromatid.png");
        StdDraw.picture(-.2, -.2, "leftChromatid.png");
        StdDraw.picture(.2, .25, "rightChromatid.png");
        StdDraw.picture(.2, -.15, "leftChromatid.png");
        // centrioles
        StdDraw.picture(.09, .63, "centriole.png"); 
        StdDraw.picture(.1, -.6, "centriole.png");
        // spindle fibers
        StdDraw.picture(.1, .2, "spindlefibers4.png");
        
        StdDraw.show(700);
        
        StdDraw.clear(StdDraw.WHITE);
        // draw the cell
        StdDraw.setPenColor(255,241,153);
        StdDraw.filledCircle(0, 0, .8); 
        // draw the nuclei
        StdDraw.setPenColor(147,188,255);
        StdDraw.filledCircle(0, .35, .3);
        StdDraw.filledCircle(0, -.35, .3);
        // chromosomes
        StdDraw.picture(0, .38, "rightChromatidVert.png");
        StdDraw.picture(.1, -.3, "leftChromatidVert.png");
        StdDraw.picture(-.14, .3, "rightChromatidVert.png");
        StdDraw.picture(-.04, -.4, "leftChromatidVert.png");
        StdDraw.picture(.16, .28, "rightChromatidVert.png");
        StdDraw.picture(.23, -.35, "leftChromatidVert.png");
        // centrioles
        StdDraw.picture(.09, .63, "centriole.png"); 
        StdDraw.picture(.1, -.6, "centriole.png");   // spindle fibers broke down
        
        StdDraw.show(700);
        
        StdDraw.clear(StdDraw.WHITE);
        // draw the two cells
        StdDraw.setPenColor(255,241,153);
        StdDraw.filledCircle(0, .4, .6);
        StdDraw.filledCircle(0, -.4, .6); 
        // draw the nuclei
        StdDraw.setPenColor(147,188,255);
        StdDraw.filledCircle(0, .35, .3);
        StdDraw.filledCircle(0, -.35, .3);
        // chromosomes
        StdDraw.picture(.15, .38, "rightChromatidVert.png");
        StdDraw.picture(.1, -.3, "leftChromatidVert.png");
        StdDraw.picture(-.13, .31, "rightChromatidVert.png");
        StdDraw.picture(-.04, -.4, "leftChromatidVert.png");
        StdDraw.picture(.01, .28, "rightChromatidVert.png");
        StdDraw.picture(.23, -.35, "leftChromatidVert.png");
        // centrioles
        StdDraw.picture(.09, .63, "centriole.png"); 
        StdDraw.picture(.1, -.6, "centriole.png");   // spindle fibers broke down
        
        StdDraw.show(700);
        
        return "TELOPHASE: \n - The cell is nearly done dividing, and it starts to re-establish its normal structures as cytokinesis (division of the cell contents) takes place. \n - The mitotic spindle is broken down and two new nuclei form, one for each set of chromosomes. \n";
    }
}