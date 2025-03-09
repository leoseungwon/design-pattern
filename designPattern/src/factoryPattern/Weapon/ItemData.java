package factoryPattern.Weapon;

public class ItemData {
    private int maxCount;

    private int currentCount;

    public ItemData(int maxCount) {
        this.maxCount = maxCount;
        this.currentCount = 0;
    }

    public int getMaxCount() {
        return maxCount;
    }

    public int getCurrentCount() {
        return currentCount;
    }

    public void increaseCount() {
        currentCount++;
    }
}
