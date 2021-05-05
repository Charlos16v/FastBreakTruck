package edu.pingpong.fastbreaktruck.builder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FastBreakTruckBuilderTest {

    FastBreakTruckBuilder fastBreakTruckBuilder = null;

    @Before
    public void setupTest() {
        fastBreakTruckBuilder = new FastBreakTruckBuilder();
    }

    @Test
    public void getCostTest() {
        Breakfast eyeholesTurbulentJuice = fastBreakTruckBuilder.prepareEyeholesTurbulentJuice();
        Assert.assertEquals(18.8, eyeholesTurbulentJuice.getCost(), 0.001);
    }
}
