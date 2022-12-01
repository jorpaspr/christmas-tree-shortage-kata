import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ChristmasTreeShortageTest {
    @Test
    fun `should draw tree of height 1`() {
        val tree = ChristmasTree(1)
        val expected = """
            X
            |
        """.trimIndent()

        assertEquals(expected, tree.toString())
    }

    @Test
    fun `should draw tree of height 2`() {
        val tree = ChristmasTree(2)
        val expected = """
             X
            XXX
             |
        """.trimIndent()

        assertEquals(expected, tree.toString())
    }

    @Test
    fun `should draw tree of height 3`() {
        val tree = ChristmasTree(3)
        val expected = """
              X
             XXX
            XXXXX
              |
        """.trimIndent()

        assertEquals(expected, tree.toString())
    }

    @Test
    fun `should draw tree of height 4`() {
        val tree = ChristmasTree(4)
        val expected = """
               X
              XXX
             XXXXX
            XXXXXXX
               |
            """.trimIndent()

        assertEquals(expected, tree.toString())
    }

    @Test
    fun `should draw tree of height 5`() {
        val tree = ChristmasTree(5)
        val expected = """
                X
               XXX
              XXXXX
             XXXXXXX
            XXXXXXXXX
                |
            """.trimIndent()

        assertEquals(expected, tree.toString())
    }
}
