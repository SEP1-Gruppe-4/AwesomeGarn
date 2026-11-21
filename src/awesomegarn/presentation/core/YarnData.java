package awesomegarn.presentation.core;

import awesomegarn.domain.Material;
import awesomegarn.domain.WashingInstruction;
import awesomegarn.domain.YarnColor;

/**
 * Rå input fra en formular. Tal er stadig tekst, så YarnValidator kan fange fx "abc".
 * color, material og washingInstruction er null, hvis intet er valgt.
 */
public record YarnData(YarnColor color, Material material, String weight, String skeins,
                       String fiberComposition, String manufacturer, String dyeLotNumber,
                       String needleThickness, WashingInstruction washingInstruction) {
}
