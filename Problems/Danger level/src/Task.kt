enum class DangerLevel(intensity: Int) {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    open fun getLevel(dangerLevel: DangerLevel): DangerLevel{
        return dangerLevel
    }

}