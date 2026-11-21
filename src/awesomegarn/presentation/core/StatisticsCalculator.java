package awesomegarn.presentation.core;

import awesomegarn.domain.Statistics;
import awesomegarn.domain.Yarn;

import java.util.List;

/** Udregner statistikken (FK-12) ud fra beholdningen. Beregnes på ny, hver gang statistikfanen åbnes. */
public class StatisticsCalculator {

    /**
     * Antal garntyper (= antal Yarn-poster), samlet antal nøgler, samlet vægt og pr. materiale:
     * antal typer, antal nøgler og procent af typer. Kun materialer med mindst én type tages med,
     * sorteret med flest typer først. Procenterne skal udregnes, ikke hardcodes.
     */
    public Statistics calculate(List<Yarn> yarns) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }
}
