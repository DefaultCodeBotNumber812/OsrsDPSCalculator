package playermodifiers.equipment.mage;

public enum MageArmor {
    //Magic and ranged items both have 2 important properties. 1) accuracy 2) strength
    AHRIMS_HOOD(30, 0);

    //Headgear

    //Cape

    //Neckalce

    //Body

    //Legs

    //Sheild

    //Hands

    //Feet

    //Ring
    public final int accuracy;
    public final int strength;

    private MageArmor(int accuracy, int strength) {
        this.accuracy = accuracy;
        this.strength = strength;
    }
}
