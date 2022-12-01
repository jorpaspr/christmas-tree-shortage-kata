class ChristmasTree(private val height: Int) {
    override fun toString(): String {
        var result = ""
        for (line in 0 until height) {
            result += " ".repeat(numberOfSpaces(height, line))
            result += "X".repeat(numberOfX(line))
            result += "\n"
        }
        result += " ".repeat(height - 1) + "|"
        return result
    }

    private fun numberOfSpaces(height: Int, line: Int) = height - 1 - line

    private fun numberOfX(line: Int) = (line + 1) * 2 - 1
}
