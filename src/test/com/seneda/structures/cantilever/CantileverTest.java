package com.seneda.structures.cantilever;

import com.seneda.structures.glass.Glass;
import com.seneda.structures.glass.Properties;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by seneda on 21/02/17.
 */
public class CantileverTest {

    @Test
    public void testCantilever() throws Exception {
        double height = 1.1;
        LoadCase[] loadCases = {new LineLoad(1.5E3, height)};
        Glass glass = new Glass(
                Properties.Treatments.ANNEALED,
                Properties.SurfaceProfiles.ASPRODUCED,
                Properties.Material.FLOAT,
                Properties.edgeTypes.ASCUT);
        Cantilever cantilever = new Cantilever(height, loadCases, glass);
        // TODO Find some numbers to actually test here
    }

}