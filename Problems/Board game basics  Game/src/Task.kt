object PlayingField{
    object Size {
        var width = 0
        var height = 0
        fun changeSize(width: Int , height: Int ): Size{

            var size = this.width * this.height
            if (size < 0) size = 0 else size
            val playingFieldSize = PlayingField.Size
            return playingFieldSize.changeSize(width, height)


        }
    }
}