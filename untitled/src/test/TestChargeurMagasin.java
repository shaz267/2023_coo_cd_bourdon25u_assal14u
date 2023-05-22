package test;

import XML.ChargeurMagasin;
import donnees.Magasin;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.AssertJUnit.assertEquals;

public class TestChargeurMagasin {

    @Test
    /**
     * tester que le chargement fonctionne bien quand le répertoire existe
     */
    public void testChargerMagasinOK() throws IOException{
        //preparation des donnees
        ChargeurMagasin chargeurmagasin = new ChargeurMagasin("../musicbrainzSimple");
        //methode testee
        Magasin m = chargeurmagasin.chargerMagasin();
        //verifications
        int nombre = ((Magasin) m).getNombreCds();
        assertEquals("magasin devrait avoir 12 CDs", 12, nombre);
    }

    @Test
    /**
     * tester que le chargement leve IOException quand repertoire inexistant
     */
    public void testChargerMagasinInconnu() throws IOException{
        //preparation des donnees
        ChargeurMagasin chargeurmagasin = new ChargeurMagasin("../magasinCD_donnees/X");
    }

}
