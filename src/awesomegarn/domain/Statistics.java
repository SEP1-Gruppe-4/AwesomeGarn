package awesomegarn.domain;

import java.util.List;

/**
 * Udregnede tal til statistik-visningen (FK-12). Rene data: selve beregningen ligger i
 * presentation.core.StatisticsCalculator. En "garntype" = én Yarn-post. "Primær fiber" = primært materiale.
 */
public class Statistics {

    /** Tal for ét materiale. */
    public static class MaterialStat {
        public MaterialStat(Material material, int yarnTypes, int skeins, double percent) {
            // TODO
        }

        public Material getMaterial() { throw new UnsupportedOperationException("TODO"); }
        public int getYarnTypes() { throw new UnsupportedOperationException("TODO"); }
        public int getSkeins() { throw new UnsupportedOperationException("TODO"); }
        /** Andel af alle garntyper, 0-100. */
        public double getPercent() { throw new UnsupportedOperationException("TODO"); }
    }

    public Statistics(int totalYarnTypes, int totalSkeins, double totalWeight, List<MaterialStat> materialStats) {
        // TODO
    }

    public int getTotalYarnTypes() { throw new UnsupportedOperationException("TODO"); }
    public int getTotalSkeins() { throw new UnsupportedOperationException("TODO"); }
    public double getTotalWeight() { throw new UnsupportedOperationException("TODO"); }

    /** Sorteret med flest garntyper først. */
    public List<MaterialStat> getMaterialStats() { throw new UnsupportedOperationException("TODO"); }

    /** Materialet med flest garntyper, eller null hvis beholdningen er tom. */
    public MaterialStat getMostCommon() { throw new UnsupportedOperationException("TODO"); }
}
