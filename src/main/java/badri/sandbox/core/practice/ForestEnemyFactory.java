package badri.sandbox.core.practice;

public class ForestEnemyFactory implements EnemyFactory {
    @Override
    public Enemy createGoblin() {
        return new ForestGoblin();
    }

    @Override
    public Enemy createOrc() {
        return new ForestOrc();
    }
}
