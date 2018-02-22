import org.softcake.cucumber.fairy.tale.Tale;
import org.softcake.cucumber.fairy.tale.bears.GoldilocksAndTheThreeBears;

module org.softcake.cucumber.fairy.tale.bears {
    requires org.softcake.cucumber.actors;
    requires transitive org.softcake.cucumber.fairy.tale;
    requires org.softcake.cucumber.fairy.tale.formula;

    provides Tale
        with GoldilocksAndTheThreeBears;
}
