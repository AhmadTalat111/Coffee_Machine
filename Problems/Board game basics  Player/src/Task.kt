class Player(val id: Int, val name: String, val hp: Int){
    companion object base {
        fun create(name: String): Player{
            val playerId = (Math.random() * 100).toInt()
            val player: Player = Player(playerId, "Player One", 100)
            return player
        }

    }
}