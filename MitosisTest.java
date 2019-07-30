
/**
 * A class to test the Mitosis class.
 *
 * @Anna Lieb
 * @Pd. 3 Bio - 6/16/19
 */
public class MitosisTest
{
    /**
     * Simulates mitosis by calling on methods from Cell_AL which model the different 
     * phases of mitosis in order.
     */
    public static void main(String[] args)
    {
        Mitosis model = new Mitosis(); 
        System.out.println(model.prophase()); 
        System.out.println(model.metaphase()); 
        System.out.println(model.anaphase()); 
        System.out.println(model.telophase()); 
    }
}
/** OUTPUT: 
 * PROPHASE: 
 - The chromosomes start to condense and the mitotic spindle begins to form. 
 - The spindle grows between the centrosomes as they move apart. 
 - The nucleus breaks down and the mitotic spindle begins to organize the chromosomes. 

METAPHASE: 
 - The spindle has captured all the chromosomes and lined them up at the middle of the cell, ready to divide. 
 - The two kinetochores of each chromosome are attached to microtubules from opposite spindle poles.

ANAPHASE: 
 - The sister chromatids separate from each other and are pulled towards opposite ends of the cell. 
 - Microtubules not attached to chromosomes elongate and push apart, separating the poles and making the cell longer. 

TELOPHASE: 
 - The cell is nearly done dividing, and it starts to re-establish its normal structures as cytokinesis (division of the cell contents) takes place. 
 - The mitotic spindle is broken down and two new nuclei form, one for each set of chromosomes. 
 */